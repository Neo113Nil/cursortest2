package org.commonmark.internal;

import androidx.camera.core.AspectRatio;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import okhttp3.internal.ws.RealWebSocket$connect$1;
import org.commonmark.internal.inline.AsteriskDelimiterProcessor;
import org.commonmark.internal.util.Escaping;
import org.commonmark.internal.util.Html5Entities;
import org.commonmark.internal.util.LinkScanner;
import org.commonmark.node.Code;
import org.commonmark.node.HardLineBreak;
import org.commonmark.node.HtmlInline;
import org.commonmark.node.Image;
import org.commonmark.node.Link;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.Node;
import org.commonmark.node.SoftLineBreak;
import org.commonmark.node.Text;
import org.commonmark.parser.delimiter.DelimiterProcessor;

/* loaded from: classes10.dex */
public final class InlineParserImpl {
    public final RealWebSocket$connect$1 context;
    public final BitSet delimiterCharacters;
    public final HashMap delimiterProcessors;
    public int index;
    public String input;
    public Bracket lastBracket;
    public Delimiter lastDelimiter;
    public final BitSet specialCharacters;
    public static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    public static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern ENTITY_HERE = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    public static final Pattern TICKS = Pattern.compile("`+");
    public static final Pattern TICKS_HERE = Pattern.compile("^`+");
    public static final Pattern EMAIL_AUTOLINK = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern AUTOLINK = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    public static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    public static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern WHITESPACE = Pattern.compile("\\s+");
    public static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    public final class DelimiterData {
        public final boolean canClose;
        public final boolean canOpen;
        public final int count;

        public DelimiterData(int i, boolean z, boolean z2) {
            this.count = i;
            this.canOpen = z;
            this.canClose = z2;
        }
    }

    public InlineParserImpl(RealWebSocket$connect$1 realWebSocket$connect$1) {
        List list = (List) realWebSocket$connect$1.this$0;
        HashMap hashMap = new HashMap();
        addDelimiterProcessors(Arrays.asList(new AsteriskDelimiterProcessor('*'), new AsteriskDelimiterProcessor('_')), hashMap);
        addDelimiterProcessors(list, hashMap);
        this.delimiterProcessors = hashMap;
        Set keySet = hashMap.keySet();
        BitSet bitSet = new BitSet();
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            bitSet.set(((Character) it.next()).charValue());
        }
        this.delimiterCharacters = bitSet;
        BitSet bitSet2 = new BitSet();
        bitSet2.or(bitSet);
        bitSet2.set(10);
        bitSet2.set(96);
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(92);
        bitSet2.set(33);
        bitSet2.set(60);
        bitSet2.set(38);
        this.specialCharacters = bitSet2;
        this.context = realWebSocket$connect$1;
    }

    public static void addDelimiterProcessorForChar(char c, DelimiterProcessor delimiterProcessor, HashMap hashMap) {
        if (((DelimiterProcessor) hashMap.put(Character.valueOf(c), delimiterProcessor)) == null) {
            return;
        }
        f$$ExternalSyntheticLambda0.m("Delimiter processor conflict with delimiter char '", c, "'");
    }

    public static void addDelimiterProcessors(Iterable iterable, HashMap hashMap) {
        StaggeredDelimiterProcessor staggeredDelimiterProcessor;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) it.next();
            char openingCharacter = delimiterProcessor.getOpeningCharacter();
            char closingCharacter = delimiterProcessor.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                DelimiterProcessor delimiterProcessor2 = (DelimiterProcessor) hashMap.get(Character.valueOf(openingCharacter));
                if (delimiterProcessor2 == null || delimiterProcessor2.getOpeningCharacter() != delimiterProcessor2.getClosingCharacter()) {
                    addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, hashMap);
                } else {
                    if (delimiterProcessor2 instanceof StaggeredDelimiterProcessor) {
                        staggeredDelimiterProcessor = (StaggeredDelimiterProcessor) delimiterProcessor2;
                    } else {
                        StaggeredDelimiterProcessor staggeredDelimiterProcessor2 = new StaggeredDelimiterProcessor(openingCharacter);
                        staggeredDelimiterProcessor2.add(delimiterProcessor2);
                        staggeredDelimiterProcessor = staggeredDelimiterProcessor2;
                    }
                    staggeredDelimiterProcessor.add(delimiterProcessor);
                    hashMap.put(Character.valueOf(openingCharacter), staggeredDelimiterProcessor);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, delimiterProcessor, hashMap);
                addDelimiterProcessorForChar(closingCharacter, delimiterProcessor, hashMap);
            }
        }
    }

    public static void mergeIfNeeded(Text text, Text text2, int i) {
        if (text == null || text2 == null || text == text2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i);
        sb.append(text.literal);
        Node node = (Node) text.next;
        Node node2 = (Node) text2.next;
        while (node != node2) {
            sb.append(((Text) node).literal);
            Node node3 = (Node) node.next;
            node.unlink();
            node = node3;
        }
        text.literal = sb.toString();
    }

    public static void mergeTextNodesInclusive(Node node, Node node2) {
        Text text = null;
        Text text2 = null;
        int i = 0;
        while (node != null) {
            if (node instanceof Text) {
                text2 = (Text) node;
                if (text == null) {
                    text = text2;
                }
                i = text2.literal.length() + i;
            } else {
                mergeIfNeeded(text, text2, i);
                text = null;
                text2 = null;
                i = 0;
            }
            if (node == node2) {
                break;
            } else {
                node = (Node) node.next;
            }
        }
        mergeIfNeeded(text, text2, i);
    }

    public final String match(Pattern pattern) {
        if (this.index >= this.input.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.input);
        matcher.region(this.index, this.input.length());
        if (!matcher.find()) {
            return null;
        }
        this.index = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0534 A[LOOP:0: B:2:0x0013->B:7:0x0534, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x053b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v17, types: [org.commonmark.node.Code, org.commonmark.node.Node] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v27, types: [org.commonmark.node.Node] */
    /* JADX WARN: Type inference failed for: r4v44, types: [org.commonmark.node.Text] */
    /* JADX WARN: Type inference failed for: r4v45, types: [org.commonmark.node.Text] */
    /* JADX WARN: Type inference failed for: r4v53 */
    /* JADX WARN: Type inference failed for: r4v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r5v26, types: [org.commonmark.internal.InlineParserImpl$DelimiterData] */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r8v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void parse(String str, Node node) {
        int i;
        Node softLineBreak;
        Node node2;
        Node text;
        Text text2;
        Link link;
        String match;
        ?? code;
        int i2;
        String str2;
        String str3;
        boolean z;
        int i3;
        int i4;
        ?? r4;
        ?? r8;
        ?? r5;
        this.input = str.trim();
        int i5 = 0;
        this.index = 0;
        Text text3 = null;
        this.lastDelimiter = null;
        this.lastBracket = null;
        Node node3 = null;
        while (true) {
            char peek = peek();
            if (peek == 0) {
                i = i5;
            } else {
                if (peek == '\n') {
                    this.index++;
                    if (node3 instanceof Text) {
                        Text text4 = (Text) node3;
                        if (text4.literal.endsWith(" ")) {
                            String str4 = text4.literal;
                            Matcher matcher = FINAL_SPACE.matcher(str4);
                            int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                            i = 0;
                            if (end > 0) {
                                text4.literal = Boxes$$ExternalSyntheticOutline1.m1148m(end, 0, str4);
                            }
                            softLineBreak = end >= 2 ? new HardLineBreak() : new SoftLineBreak();
                            node2 = softLineBreak;
                        }
                    }
                    i = 0;
                    softLineBreak = new SoftLineBreak();
                    node2 = softLineBreak;
                } else if (peek != '!') {
                    if (peek == '&') {
                        String match2 = match(ENTITY_HERE);
                        if (match2 != null) {
                            text2 = new Text(Html5Entities.entityToString(match2));
                            node2 = text2;
                        }
                        node2 = null;
                    } else if (peek != '<') {
                        if (peek != '`') {
                            switch (peek) {
                                case '[':
                                    int i6 = this.index;
                                    this.index = i6 + 1;
                                    Text text5 = new Text("[");
                                    Bracket bracket = this.lastBracket;
                                    Bracket bracket2 = new Bracket(text5, i6, bracket, this.lastDelimiter, false);
                                    if (bracket != null) {
                                        bracket.bracketAfter = true;
                                    }
                                    this.lastBracket = bracket2;
                                    node2 = text5;
                                    break;
                                case '\\':
                                    this.index++;
                                    if (peek() == '\n') {
                                        text = new HardLineBreak();
                                        this.index++;
                                    } else {
                                        if (this.index < this.input.length()) {
                                            String str5 = this.input;
                                            int i7 = this.index;
                                            if (ESCAPABLE.matcher(str5.substring(i7, i7 + 1)).matches()) {
                                                String str6 = this.input;
                                                int i8 = this.index;
                                                Text text6 = new Text(str6.substring(i8, i8 + 1));
                                                this.index++;
                                                node2 = text6;
                                                break;
                                            }
                                        }
                                        text = new Text("\\");
                                    }
                                    node2 = text;
                                    break;
                                case ']':
                                    int i9 = this.index + 1;
                                    this.index = i9;
                                    Bracket bracket3 = this.lastBracket;
                                    if (bracket3 == null) {
                                        code = new Text("]");
                                        break;
                                    } else {
                                        Text text7 = bracket3.node;
                                        boolean z2 = bracket3.image;
                                        if (!bracket3.allowed) {
                                            this.lastBracket = bracket3.previous;
                                            code = new Text("]");
                                            break;
                                        } else {
                                            if (peek() == '(') {
                                                this.index++;
                                                Pattern pattern = SPNL;
                                                match(pattern);
                                                i2 = 1;
                                                int scanLinkDestination = LinkScanner.scanLinkDestination(this.index, this.input);
                                                if (scanLinkDestination == -1) {
                                                    str2 = null;
                                                } else {
                                                    char peek2 = peek();
                                                    String str7 = this.input;
                                                    int i10 = this.index;
                                                    String substring = peek2 == '<' ? str7.substring(i10 + 1, scanLinkDestination - 1) : str7.substring(i10, scanLinkDestination);
                                                    this.index = scanLinkDestination;
                                                    str2 = Escaping.unescapeString(substring);
                                                }
                                                if (str2 != null) {
                                                    match(pattern);
                                                    String str8 = this.input;
                                                    int i11 = this.index;
                                                    if (WHITESPACE.matcher(str8.substring(i11 - 1, i11)).matches()) {
                                                        String str9 = this.input;
                                                        int i12 = this.index;
                                                        if (i12 < str9.length()) {
                                                            char charAt = str9.charAt(i12);
                                                            char c = '\"';
                                                            if (charAt != '\"') {
                                                                c = '\'';
                                                                if (charAt != '\'') {
                                                                    if (charAt == '(') {
                                                                        c = ')';
                                                                    }
                                                                }
                                                            }
                                                            int scanLinkTitleContent = LinkScanner.scanLinkTitleContent(str9, i12 + 1, c);
                                                            if (scanLinkTitleContent != -1 && scanLinkTitleContent < str9.length() && str9.charAt(scanLinkTitleContent) == c) {
                                                                i3 = scanLinkTitleContent + 1;
                                                                i4 = -1;
                                                                if (i3 != i4) {
                                                                    str3 = null;
                                                                } else {
                                                                    String substring2 = this.input.substring(this.index + 1, i3 - 1);
                                                                    this.index = i3;
                                                                    str3 = Escaping.unescapeString(substring2);
                                                                }
                                                                match(pattern);
                                                            }
                                                        }
                                                        i4 = -1;
                                                        i3 = -1;
                                                        if (i3 != i4) {
                                                        }
                                                        match(pattern);
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    if (peek() == ')') {
                                                        this.index++;
                                                        z = true;
                                                        if (!z) {
                                                            int i13 = this.index;
                                                            if (i13 < this.input.length() && this.input.charAt(this.index) == '[') {
                                                                int i14 = this.index + 1;
                                                                int scanLinkLabelContent = LinkScanner.scanLinkLabelContent(i14, this.input);
                                                                int i15 = scanLinkLabelContent - i14;
                                                                if (scanLinkLabelContent != -1 && i15 <= 999 && scanLinkLabelContent < this.input.length() && this.input.charAt(scanLinkLabelContent) == ']') {
                                                                    this.index = scanLinkLabelContent + 1;
                                                                }
                                                            }
                                                            int i16 = this.index - i13;
                                                            String substring3 = i16 > 2 ? this.input.substring(i13, i16 + i13) : !bracket3.bracketAfter ? this.input.substring(bracket3.index, i9) : null;
                                                            if (substring3 != null) {
                                                                Pattern pattern2 = Escaping.BACKSLASH_OR_AMP;
                                                                LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) ((Map) this.context.$request).get(Escaping.WHITESPACE.matcher(substring3.substring(i2, substring3.length() - 1).trim().toLowerCase(Locale.ROOT)).replaceAll(" "));
                                                                if (linkReferenceDefinition != null) {
                                                                    str2 = linkReferenceDefinition.destination;
                                                                    str3 = linkReferenceDefinition.title;
                                                                    z = true;
                                                                }
                                                            }
                                                        }
                                                        if (!z) {
                                                            this.index = i9;
                                                            this.lastBracket = this.lastBracket.previous;
                                                            text = new Text("]");
                                                            node2 = text;
                                                            break;
                                                        } else {
                                                            if (z2) {
                                                                Image image = new Image();
                                                                image.destination = str2;
                                                                image.title = str3;
                                                                code = image;
                                                            } else {
                                                                code = new Link(str2, str3);
                                                            }
                                                            Node node4 = (Node) text7.next;
                                                            while (node4 != null) {
                                                                Node node5 = (Node) node4.next;
                                                                code.appendChild(node4);
                                                                node4 = node5;
                                                            }
                                                            processDelimiters(bracket3.previousDelimiter);
                                                            Node node6 = (Node) code.firstChild;
                                                            Node node7 = (Node) code.lastChild;
                                                            if (node6 != node7) {
                                                                mergeTextNodesInclusive(node6, node7);
                                                            }
                                                            text7.unlink();
                                                            Bracket bracket4 = this.lastBracket.previous;
                                                            this.lastBracket = bracket4;
                                                            if (!z2) {
                                                                while (bracket4 != null) {
                                                                    if (!bracket4.image) {
                                                                        bracket4.allowed = false;
                                                                    }
                                                                    bracket4 = bracket4.previous;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                    } else {
                                                        this.index = i9;
                                                        z = false;
                                                        if (!z) {
                                                        }
                                                        if (!z) {
                                                        }
                                                    }
                                                }
                                            } else {
                                                i2 = 1;
                                                str2 = null;
                                            }
                                            str3 = null;
                                            z = false;
                                            if (!z) {
                                            }
                                            if (!z) {
                                            }
                                        }
                                    }
                                    break;
                                default:
                                    if (this.delimiterCharacters.get(peek)) {
                                        DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(peek));
                                        int i17 = this.index;
                                        int i18 = i5;
                                        while (peek() == peek) {
                                            i18++;
                                            this.index++;
                                        }
                                        if (i18 < delimiterProcessor.getMinLength()) {
                                            this.index = i17;
                                            r5 = text3;
                                        } else {
                                            String substring4 = i17 == 0 ? "\n" : this.input.substring(i17 - 1, i17);
                                            char peek3 = peek();
                                            String valueOf = peek3 != 0 ? String.valueOf(peek3) : "\n";
                                            Pattern pattern3 = PUNCTUATION;
                                            boolean matches = pattern3.matcher(substring4).matches();
                                            Pattern pattern4 = UNICODE_WHITESPACE_CHAR;
                                            boolean matches2 = pattern4.matcher(substring4).matches();
                                            boolean matches3 = pattern3.matcher(valueOf).matches();
                                            boolean matches4 = pattern4.matcher(valueOf).matches();
                                            int i19 = (matches4 || !(!matches3 || matches2 || matches)) ? i5 : 1;
                                            int i20 = (matches2 || !(!matches || matches4 || matches3)) ? i5 : 1;
                                            if (peek == '_') {
                                                int i21 = (i19 == 0 || !(i20 == 0 || matches)) ? i5 : 1;
                                                if (i20 == 0 || !(i19 == 0 || matches3)) {
                                                    r8 = i5;
                                                    r4 = i21;
                                                } else {
                                                    r8 = 1;
                                                    r4 = i21;
                                                }
                                            } else {
                                                int i22 = (i19 == 0 || peek != delimiterProcessor.getOpeningCharacter()) ? i5 : 1;
                                                int i23 = (i20 == 0 || peek != delimiterProcessor.getClosingCharacter()) ? i5 : 1;
                                                r4 = i22;
                                                r8 = i23;
                                            }
                                            this.index = i17;
                                            r5 = new DelimiterData(i18, r4, r8);
                                        }
                                        if (r5 != 0) {
                                            int i24 = r5.count;
                                            int i25 = this.index;
                                            int i26 = i25 + i24;
                                            this.index = i26;
                                            Text text8 = new Text(this.input.substring(i25, i26));
                                            boolean z3 = r5.canOpen;
                                            boolean z4 = r5.canClose;
                                            Delimiter delimiter = this.lastDelimiter;
                                            Delimiter delimiter2 = new Delimiter(text8, peek, z3, z4, delimiter);
                                            this.lastDelimiter = delimiter2;
                                            delimiter2.length = i24;
                                            delimiter2.originalLength = i24;
                                            if (delimiter != null) {
                                                delimiter.next = delimiter2;
                                            }
                                            node2 = text8;
                                            i = i5;
                                            break;
                                        }
                                        node2 = text3;
                                        i = i5;
                                    } else {
                                        int i27 = this.index;
                                        int length = this.input.length();
                                        while (true) {
                                            int i28 = this.index;
                                            if (i28 != length) {
                                                if (!this.specialCharacters.get(this.input.charAt(i28))) {
                                                    this.index++;
                                                }
                                            }
                                        }
                                        int i29 = this.index;
                                        if (i27 != i29) {
                                            node2 = new Text(this.input.substring(i27, i29));
                                            i = i5;
                                        }
                                        node2 = text3;
                                        i = i5;
                                    }
                                    break;
                            }
                        } else {
                            String match3 = match(TICKS_HERE);
                            if (match3 != null) {
                                int i30 = this.index;
                                do {
                                    match = match(TICKS);
                                    if (match == null) {
                                        this.index = i30;
                                        text2 = new Text(match3);
                                        node2 = text2;
                                    }
                                } while (!match.equals(match3));
                                code = new Code();
                                String replace = this.input.substring(i30, this.index - match3.length()).replace('\n', ' ');
                                if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
                                    int length2 = replace.length();
                                    if (AspectRatio.skip(' ', 0, length2, replace) != length2) {
                                        replace = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, replace);
                                    }
                                }
                                code.literal = replace;
                            }
                            node2 = null;
                        }
                        node2 = code;
                    } else {
                        String match4 = match(EMAIL_AUTOLINK);
                        if (match4 != null) {
                            String m1148m = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, match4);
                            link = new Link("mailto:".concat(m1148m), null);
                            link.appendChild(new Text(m1148m));
                        } else {
                            String match5 = match(AUTOLINK);
                            if (match5 != null) {
                                String m1148m2 = Boxes$$ExternalSyntheticOutline1.m1148m(1, 1, match5);
                                link = new Link(m1148m2, null);
                                link.appendChild(new Text(m1148m2));
                            } else {
                                node2 = null;
                                if (node2 == null) {
                                    if (match(HTML_TAG) != null) {
                                        text = new HtmlInline();
                                        node2 = text;
                                    }
                                    node2 = null;
                                }
                            }
                        }
                        node2 = link;
                        if (node2 == null) {
                        }
                    }
                    i = 0;
                } else {
                    int i31 = this.index + 1;
                    this.index = i31;
                    if (peek() == '[') {
                        this.index++;
                        Text text9 = new Text("![");
                        Bracket bracket5 = this.lastBracket;
                        Bracket bracket6 = new Bracket(text9, i31, bracket5, this.lastDelimiter, true);
                        if (bracket5 != null) {
                            bracket5.bracketAfter = true;
                        }
                        this.lastBracket = bracket6;
                        node2 = text9;
                        i = 0;
                    } else {
                        text = new Text("!");
                        node2 = text;
                        i = 0;
                    }
                }
                if (node2 != null) {
                    node3 = node2;
                    if (node3 != null) {
                        processDelimiters(null);
                        Node node8 = (Node) node.firstChild;
                        Node node9 = (Node) node.lastChild;
                        if (node8 == node9) {
                            return;
                        }
                        mergeTextNodesInclusive(node8, node9);
                        return;
                    }
                    node.appendChild(node3);
                    i5 = i;
                    text3 = null;
                } else {
                    this.index++;
                    text3 = new Text(String.valueOf(peek));
                }
            }
            node3 = text3;
            if (node3 != null) {
            }
        }
    }

    public final char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    public final void processDelimiters(Delimiter delimiter) {
        boolean z;
        Node node;
        HashMap hashMap = new HashMap();
        Delimiter delimiter2 = this.lastDelimiter;
        while (delimiter2 != null) {
            Delimiter delimiter3 = delimiter2.previous;
            if (delimiter3 == delimiter) {
                break;
            } else {
                delimiter2 = delimiter3;
            }
        }
        while (delimiter2 != null) {
            Text text = delimiter2.node;
            char c = delimiter2.delimiterChar;
            DelimiterProcessor delimiterProcessor = (DelimiterProcessor) this.delimiterProcessors.get(Character.valueOf(c));
            if (!delimiter2.canClose || delimiterProcessor == null) {
                delimiter2 = delimiter2.next;
            } else {
                char openingCharacter = delimiterProcessor.getOpeningCharacter();
                Delimiter delimiter4 = delimiter2.previous;
                int i = 0;
                boolean z2 = false;
                while (delimiter4 != null && delimiter4 != delimiter && delimiter4 != hashMap.get(Character.valueOf(c))) {
                    if (delimiter4.canOpen && delimiter4.delimiterChar == openingCharacter) {
                        i = delimiterProcessor.getDelimiterUse(delimiter4, delimiter2);
                        z2 = true;
                        if (i > 0) {
                            z = true;
                            break;
                        }
                    }
                    delimiter4 = delimiter4.previous;
                }
                z = z2;
                z2 = false;
                if (z2) {
                    Text text2 = delimiter4.node;
                    delimiter4.length -= i;
                    delimiter2.length -= i;
                    text2.literal = Boxes$$ExternalSyntheticOutline1.m1148m(i, 0, text2.literal);
                    text.literal = Boxes$$ExternalSyntheticOutline1.m1148m(i, 0, text.literal);
                    Delimiter delimiter5 = delimiter2.previous;
                    while (delimiter5 != null && delimiter5 != delimiter4) {
                        Delimiter delimiter6 = delimiter5.previous;
                        removeDelimiter(delimiter5);
                        delimiter5 = delimiter6;
                    }
                    if (text2 != text && (node = (Node) text2.next) != text) {
                        mergeTextNodesInclusive(node, (Node) text.prev);
                    }
                    delimiterProcessor.process(text2, text, i);
                    if (delimiter4.length == 0) {
                        delimiter4.node.unlink();
                        removeDelimiter(delimiter4);
                    }
                    if (delimiter2.length == 0) {
                        Delimiter delimiter7 = delimiter2.next;
                        text.unlink();
                        removeDelimiter(delimiter2);
                        delimiter2 = delimiter7;
                    }
                } else {
                    if (!z) {
                        hashMap.put(Character.valueOf(c), delimiter2.previous);
                        if (!delimiter2.canOpen) {
                            removeDelimiter(delimiter2);
                        }
                    }
                    delimiter2 = delimiter2.next;
                }
            }
        }
        while (true) {
            Delimiter delimiter8 = this.lastDelimiter;
            if (delimiter8 == null || delimiter8 == delimiter) {
                return;
            } else {
                removeDelimiter(delimiter8);
            }
        }
    }

    public final void removeDelimiter(Delimiter delimiter) {
        Delimiter delimiter2 = delimiter.previous;
        if (delimiter2 != null) {
            delimiter2.next = delimiter.next;
        }
        Delimiter delimiter3 = delimiter.next;
        if (delimiter3 == null) {
            this.lastDelimiter = delimiter2;
        } else {
            delimiter3.previous = delimiter2;
        }
    }
}
