package org.commonmark.internal;

import androidx.core.net.MailTo;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.commonmark.node.u;
import org.commonmark.node.x;
import org.commonmark.node.z;

/* loaded from: classes5.dex */
public class n implements org.commonmark.parser.a {
    private static final String ASCII_PUNCTUATION = "!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~";
    private static final String CDATA = "<!\\[CDATA\\[[\\s\\S]*?\\]\\]>";
    private static final String DECLARATION = "<![A-Z]+\\s+[^>]*>";
    private static final String HTMLCOMMENT = "<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->";
    private static final String HTMLTAG = "(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)";
    private static final String PROCESSINGINSTRUCTION = "[<][?].*?[?][>]";
    private final org.commonmark.parser.b context;
    private final BitSet delimiterCharacters;
    private final Map<Character, l7.a> delimiterProcessors;
    private int index;
    private String input;
    private e lastBracket;
    private f lastDelimiter;
    private final BitSet specialCharacters;
    private static final Pattern PUNCTUATION = Pattern.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    private static final Pattern HTML_TAG = Pattern.compile("^(?:<[A-Za-z][A-Za-z0-9-]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
    private static final Pattern ESCAPABLE = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    private static final Pattern ENTITY_HERE = Pattern.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
    private static final Pattern TICKS = Pattern.compile("`+");
    private static final Pattern TICKS_HERE = Pattern.compile("^`+");
    private static final Pattern EMAIL_AUTOLINK = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    private static final Pattern AUTOLINK = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
    private static final Pattern SPNL = Pattern.compile("^ *(?:\n *)?");
    private static final Pattern UNICODE_WHITESPACE_CHAR = Pattern.compile("^[\\p{Zs}\t\r\n\f]");
    private static final Pattern WHITESPACE = Pattern.compile("\\s+");
    private static final Pattern FINAL_SPACE = Pattern.compile(" *$");

    private static class a {
        final boolean canClose;
        final boolean canOpen;
        final int count;

        a(int i8, boolean z7, boolean z8) {
            this.count = i8;
            this.canOpen = z7;
            this.canClose = z8;
        }
    }

    public n(org.commonmark.parser.b bVar) {
        Map<Character, l7.a> calculateDelimiterProcessors = calculateDelimiterProcessors(bVar.getCustomDelimiterProcessors());
        this.delimiterProcessors = calculateDelimiterProcessors;
        BitSet calculateDelimiterCharacters = calculateDelimiterCharacters(calculateDelimiterProcessors.keySet());
        this.delimiterCharacters = calculateDelimiterCharacters;
        this.specialCharacters = calculateSpecialCharacters(calculateDelimiterCharacters);
        this.context = bVar;
    }

    private void addBracket(e eVar) {
        e eVar2 = this.lastBracket;
        if (eVar2 != null) {
            eVar2.bracketAfter = true;
        }
        this.lastBracket = eVar;
    }

    private static void addDelimiterProcessorForChar(char c8, l7.a aVar, Map<Character, l7.a> map) {
        if (map.put(Character.valueOf(c8), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c8 + "'");
    }

    private static void addDelimiterProcessors(Iterable<l7.a> iterable, Map<Character, l7.a> map) {
        r rVar;
        for (l7.a aVar : iterable) {
            char openingCharacter = aVar.getOpeningCharacter();
            char closingCharacter = aVar.getClosingCharacter();
            if (openingCharacter == closingCharacter) {
                l7.a aVar2 = map.get(Character.valueOf(openingCharacter));
                if (aVar2 == null || aVar2.getOpeningCharacter() != aVar2.getClosingCharacter()) {
                    addDelimiterProcessorForChar(openingCharacter, aVar, map);
                } else {
                    if (aVar2 instanceof r) {
                        rVar = (r) aVar2;
                    } else {
                        r rVar2 = new r(openingCharacter);
                        rVar2.add(aVar2);
                        rVar = rVar2;
                    }
                    rVar.add(aVar);
                    map.put(Character.valueOf(openingCharacter), rVar);
                }
            } else {
                addDelimiterProcessorForChar(openingCharacter, aVar, map);
                addDelimiterProcessorForChar(closingCharacter, aVar, map);
            }
        }
    }

    public static BitSet calculateDelimiterCharacters(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        return bitSet;
    }

    public static Map<Character, l7.a> calculateDelimiterProcessors(List<l7.a> list) {
        HashMap hashMap = new HashMap();
        addDelimiterProcessors(Arrays.asList(new org.commonmark.internal.inline.a(), new org.commonmark.internal.inline.c()), hashMap);
        addDelimiterProcessors(list, hashMap);
        return hashMap;
    }

    public static BitSet calculateSpecialCharacters(BitSet bitSet) {
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
        return bitSet2;
    }

    private String match(Pattern pattern) {
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

    private void mergeChildTextNodes(u uVar) {
        if (uVar.getFirstChild() == uVar.getLastChild()) {
            return;
        }
        mergeTextNodesInclusive(uVar.getFirstChild(), uVar.getLastChild());
    }

    private void mergeIfNeeded(z zVar, z zVar2, int i8) {
        if (zVar == null || zVar2 == null || zVar == zVar2) {
            return;
        }
        StringBuilder sb = new StringBuilder(i8);
        sb.append(zVar.getLiteral());
        u next = zVar.getNext();
        u next2 = zVar2.getNext();
        while (next != next2) {
            sb.append(((z) next).getLiteral());
            u next3 = next.getNext();
            next.unlink();
            next = next3;
        }
        zVar.setLiteral(sb.toString());
    }

    private void mergeTextNodesBetweenExclusive(u uVar, u uVar2) {
        if (uVar == uVar2 || uVar.getNext() == uVar2) {
            return;
        }
        mergeTextNodesInclusive(uVar.getNext(), uVar2.getPrevious());
    }

    private void mergeTextNodesInclusive(u uVar, u uVar2) {
        z zVar = null;
        z zVar2 = null;
        int i8 = 0;
        while (uVar != null) {
            if (uVar instanceof z) {
                zVar2 = (z) uVar;
                if (zVar == null) {
                    zVar = zVar2;
                }
                i8 += zVar2.getLiteral().length();
            } else {
                mergeIfNeeded(zVar, zVar2, i8);
                zVar = null;
                zVar2 = null;
                i8 = 0;
            }
            if (uVar == uVar2) {
                break;
            } else {
                uVar = uVar.getNext();
            }
        }
        mergeIfNeeded(zVar, zVar2, i8);
    }

    private u parseAutolink() {
        String match = match(EMAIL_AUTOLINK);
        if (match != null) {
            String substring = match.substring(1, match.length() - 1);
            org.commonmark.node.q qVar = new org.commonmark.node.q(MailTo.MAILTO_SCHEME + substring, null);
            qVar.appendChild(new z(substring));
            return qVar;
        }
        String match2 = match(AUTOLINK);
        if (match2 == null) {
            return null;
        }
        String substring2 = match2.substring(1, match2.length() - 1);
        org.commonmark.node.q qVar2 = new org.commonmark.node.q(substring2, null);
        qVar2.appendChild(new z(substring2));
        return qVar2;
    }

    private u parseBackslash() {
        this.index++;
        if (peek() == '\n') {
            org.commonmark.node.k kVar = new org.commonmark.node.k();
            this.index++;
            return kVar;
        }
        if (this.index < this.input.length()) {
            Pattern pattern = ESCAPABLE;
            String str = this.input;
            int i8 = this.index;
            if (pattern.matcher(str.substring(i8, i8 + 1)).matches()) {
                String str2 = this.input;
                int i9 = this.index;
                z text = text(str2, i9, i9 + 1);
                this.index++;
                return text;
            }
        }
        return text("\\");
    }

    private u parseBackticks() {
        String match;
        String match2 = match(TICKS_HERE);
        if (match2 == null) {
            return null;
        }
        int i8 = this.index;
        do {
            match = match(TICKS);
            if (match == null) {
                this.index = i8;
                return text(match2);
            }
        } while (!match.equals(match2));
        org.commonmark.node.d dVar = new org.commonmark.node.d();
        String replace = this.input.substring(i8, this.index - match2.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ' && org.commonmark.internal.util.d.hasNonSpace(replace)) {
            replace = replace.substring(1, replace.length() - 1);
        }
        dVar.setLiteral(replace);
        return dVar;
    }

    private u parseBang() {
        int i8 = this.index;
        this.index = i8 + 1;
        if (peek() != '[') {
            return text("!");
        }
        this.index++;
        z text = text("![");
        addBracket(e.image(text, i8 + 1, this.lastBracket, this.lastDelimiter));
        return text;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private u parseCloseBracket() {
        String str;
        String str2;
        boolean z7;
        boolean z8 = true;
        int i8 = this.index + 1;
        this.index = i8;
        e eVar = this.lastBracket;
        if (eVar == null) {
            return text("]");
        }
        if (!eVar.allowed) {
            removeLastBracket();
            return text("]");
        }
        String str3 = null;
        if (peek() == '(') {
            this.index++;
            spnl();
            str = parseLinkDestination();
            if (str != null) {
                spnl();
                Pattern pattern = WHITESPACE;
                String str4 = this.input;
                int i9 = this.index;
                if (pattern.matcher(str4.substring(i9 - 1, i9)).matches()) {
                    str2 = parseLinkTitle();
                    spnl();
                } else {
                    str2 = null;
                }
                if (peek() == ')') {
                    this.index++;
                    z7 = true;
                    if (!z7) {
                        int i10 = this.index;
                        parseLinkLabel();
                        int i11 = this.index - i10;
                        if (i11 > 2) {
                            str3 = this.input.substring(i10, i11 + i10);
                        } else if (!eVar.bracketAfter) {
                            str3 = this.input.substring(eVar.index, i8);
                        }
                        if (str3 != null) {
                            org.commonmark.node.r linkReferenceDefinition = this.context.getLinkReferenceDefinition(org.commonmark.internal.util.a.normalizeReference(str3));
                            if (linkReferenceDefinition != null) {
                                str = linkReferenceDefinition.getDestination();
                                str2 = linkReferenceDefinition.getTitle();
                                if (!z8) {
                                    this.index = i8;
                                    removeLastBracket();
                                    return text("]");
                                }
                                u oVar = eVar.image ? new org.commonmark.node.o(str, str2) : new org.commonmark.node.q(str, str2);
                                u next = eVar.node.getNext();
                                while (next != null) {
                                    u next2 = next.getNext();
                                    oVar.appendChild(next);
                                    next = next2;
                                }
                                processDelimiters(eVar.previousDelimiter);
                                mergeChildTextNodes(oVar);
                                eVar.node.unlink();
                                removeLastBracket();
                                if (!eVar.image) {
                                    for (e eVar2 = this.lastBracket; eVar2 != null; eVar2 = eVar2.previous) {
                                        if (!eVar2.image) {
                                            eVar2.allowed = false;
                                        }
                                    }
                                }
                                return oVar;
                            }
                        }
                    }
                    z8 = z7;
                    if (!z8) {
                    }
                } else {
                    this.index = i8;
                }
            } else {
                str2 = null;
            }
        } else {
            str = null;
            str2 = null;
        }
        z7 = false;
        if (!z7) {
        }
        z8 = z7;
        if (!z8) {
        }
    }

    private u parseDelimiters(l7.a aVar, char c8) {
        a scanDelimiters = scanDelimiters(aVar, c8);
        if (scanDelimiters == null) {
            return null;
        }
        int i8 = scanDelimiters.count;
        int i9 = this.index;
        int i10 = i9 + i8;
        this.index = i10;
        z text = text(this.input, i9, i10);
        f fVar = new f(text, c8, scanDelimiters.canOpen, scanDelimiters.canClose, this.lastDelimiter);
        this.lastDelimiter = fVar;
        fVar.length = i8;
        fVar.originalLength = i8;
        f fVar2 = fVar.previous;
        if (fVar2 != null) {
            fVar2.next = fVar;
        }
        return text;
    }

    private u parseEntity() {
        String match = match(ENTITY_HERE);
        if (match != null) {
            return text(org.commonmark.internal.util.b.entityToString(match));
        }
        return null;
    }

    private u parseHtmlInline() {
        String match = match(HTML_TAG);
        if (match == null) {
            return null;
        }
        org.commonmark.node.n nVar = new org.commonmark.node.n();
        nVar.setLiteral(match);
        return nVar;
    }

    private u parseInline(u uVar) {
        u parseNewline;
        char peek = peek();
        if (peek == 0) {
            return null;
        }
        if (peek == '\n') {
            parseNewline = parseNewline(uVar);
        } else if (peek == '!') {
            parseNewline = parseBang();
        } else if (peek == '&') {
            parseNewline = parseEntity();
        } else if (peek == '<') {
            parseNewline = parseAutolink();
            if (parseNewline == null) {
                parseNewline = parseHtmlInline();
            }
        } else if (peek != '`') {
            switch (peek) {
                case '[':
                    parseNewline = parseOpenBracket();
                    break;
                case '\\':
                    parseNewline = parseBackslash();
                    break;
                case ']':
                    parseNewline = parseCloseBracket();
                    break;
                default:
                    if (!this.delimiterCharacters.get(peek)) {
                        parseNewline = parseString();
                        break;
                    } else {
                        parseNewline = parseDelimiters(this.delimiterProcessors.get(Character.valueOf(peek)), peek);
                        break;
                    }
            }
        } else {
            parseNewline = parseBackticks();
        }
        if (parseNewline != null) {
            return parseNewline;
        }
        this.index++;
        return text(String.valueOf(peek));
    }

    private String parseLinkDestination() {
        int scanLinkDestination = org.commonmark.internal.util.c.scanLinkDestination(this.input, this.index);
        if (scanLinkDestination == -1) {
            return null;
        }
        String substring = peek() == '<' ? this.input.substring(this.index + 1, scanLinkDestination - 1) : this.input.substring(this.index, scanLinkDestination);
        this.index = scanLinkDestination;
        return org.commonmark.internal.util.a.unescapeString(substring);
    }

    private String parseLinkTitle() {
        int scanLinkTitle = org.commonmark.internal.util.c.scanLinkTitle(this.input, this.index);
        if (scanLinkTitle == -1) {
            return null;
        }
        String substring = this.input.substring(this.index + 1, scanLinkTitle - 1);
        this.index = scanLinkTitle;
        return org.commonmark.internal.util.a.unescapeString(substring);
    }

    private u parseNewline(u uVar) {
        this.index++;
        if (uVar instanceof z) {
            z zVar = (z) uVar;
            if (zVar.getLiteral().endsWith(cn.hutool.core.text.l.SPACE)) {
                String literal = zVar.getLiteral();
                Matcher matcher = FINAL_SPACE.matcher(literal);
                int end = matcher.find() ? matcher.end() - matcher.start() : 0;
                if (end > 0) {
                    zVar.setLiteral(literal.substring(0, literal.length() - end));
                }
                return end >= 2 ? new org.commonmark.node.k() : new x();
            }
        }
        return new x();
    }

    private u parseOpenBracket() {
        int i8 = this.index;
        this.index = i8 + 1;
        z text = text("[");
        addBracket(e.link(text, i8, this.lastBracket, this.lastDelimiter));
        return text;
    }

    private u parseString() {
        int i8 = this.index;
        int length = this.input.length();
        while (true) {
            int i9 = this.index;
            if (i9 == length || this.specialCharacters.get(this.input.charAt(i9))) {
                break;
            }
            this.index++;
        }
        int i10 = this.index;
        if (i8 != i10) {
            return text(this.input, i8, i10);
        }
        return null;
    }

    private char peek() {
        if (this.index < this.input.length()) {
            return this.input.charAt(this.index);
        }
        return (char) 0;
    }

    private void processDelimiters(f fVar) {
        boolean z7;
        HashMap hashMap = new HashMap();
        f fVar2 = this.lastDelimiter;
        while (fVar2 != null) {
            f fVar3 = fVar2.previous;
            if (fVar3 == fVar) {
                break;
            } else {
                fVar2 = fVar3;
            }
        }
        while (fVar2 != null) {
            char c8 = fVar2.delimiterChar;
            l7.a aVar = this.delimiterProcessors.get(Character.valueOf(c8));
            if (!fVar2.canClose || aVar == null) {
                fVar2 = fVar2.next;
            } else {
                char openingCharacter = aVar.getOpeningCharacter();
                f fVar4 = fVar2.previous;
                int i8 = 0;
                boolean z8 = false;
                while (fVar4 != null && fVar4 != fVar && fVar4 != hashMap.get(Character.valueOf(c8))) {
                    if (fVar4.canOpen && fVar4.delimiterChar == openingCharacter) {
                        i8 = aVar.getDelimiterUse(fVar4, fVar2);
                        z8 = true;
                        if (i8 > 0) {
                            z7 = true;
                            break;
                        }
                    }
                    fVar4 = fVar4.previous;
                }
                z7 = z8;
                z8 = false;
                if (z8) {
                    z zVar = fVar4.node;
                    z zVar2 = fVar2.node;
                    fVar4.length -= i8;
                    fVar2.length -= i8;
                    zVar.setLiteral(zVar.getLiteral().substring(0, zVar.getLiteral().length() - i8));
                    zVar2.setLiteral(zVar2.getLiteral().substring(0, zVar2.getLiteral().length() - i8));
                    removeDelimitersBetween(fVar4, fVar2);
                    mergeTextNodesBetweenExclusive(zVar, zVar2);
                    aVar.process(zVar, zVar2, i8);
                    if (fVar4.length == 0) {
                        removeDelimiterAndNode(fVar4);
                    }
                    if (fVar2.length == 0) {
                        f fVar5 = fVar2.next;
                        removeDelimiterAndNode(fVar2);
                        fVar2 = fVar5;
                    }
                } else {
                    if (!z7) {
                        hashMap.put(Character.valueOf(c8), fVar2.previous);
                        if (!fVar2.canOpen) {
                            removeDelimiterKeepNode(fVar2);
                        }
                    }
                    fVar2 = fVar2.next;
                }
            }
        }
        while (true) {
            f fVar6 = this.lastDelimiter;
            if (fVar6 == null || fVar6 == fVar) {
                return;
            } else {
                removeDelimiterKeepNode(fVar6);
            }
        }
    }

    private void removeDelimiter(f fVar) {
        f fVar2 = fVar.previous;
        if (fVar2 != null) {
            fVar2.next = fVar.next;
        }
        f fVar3 = fVar.next;
        if (fVar3 == null) {
            this.lastDelimiter = fVar2;
        } else {
            fVar3.previous = fVar2;
        }
    }

    private void removeDelimiterAndNode(f fVar) {
        fVar.node.unlink();
        removeDelimiter(fVar);
    }

    private void removeDelimiterKeepNode(f fVar) {
        removeDelimiter(fVar);
    }

    private void removeDelimitersBetween(f fVar, f fVar2) {
        f fVar3 = fVar2.previous;
        while (fVar3 != null && fVar3 != fVar) {
            f fVar4 = fVar3.previous;
            removeDelimiterKeepNode(fVar3);
            fVar3 = fVar4;
        }
    }

    private void removeLastBracket() {
        this.lastBracket = this.lastBracket.previous;
    }

    private a scanDelimiters(l7.a aVar, char c8) {
        boolean z7;
        int i8 = this.index;
        boolean z8 = false;
        int i9 = 0;
        while (peek() == c8) {
            i9++;
            this.index++;
        }
        if (i9 < aVar.getMinLength()) {
            this.index = i8;
            return null;
        }
        String substring = i8 == 0 ? "\n" : this.input.substring(i8 - 1, i8);
        char peek = peek();
        String valueOf = peek != 0 ? String.valueOf(peek) : "\n";
        Pattern pattern = PUNCTUATION;
        boolean matches = pattern.matcher(substring).matches();
        Pattern pattern2 = UNICODE_WHITESPACE_CHAR;
        boolean matches2 = pattern2.matcher(substring).matches();
        boolean matches3 = pattern.matcher(valueOf).matches();
        boolean matches4 = pattern2.matcher(valueOf).matches();
        boolean z9 = !matches4 && (!matches3 || matches2 || matches);
        boolean z10 = !matches2 && (!matches || matches4 || matches3);
        if (c8 == '_') {
            z7 = z9 && (!z10 || matches);
            if (z10 && (!z9 || matches3)) {
                z8 = true;
            }
        } else {
            boolean z11 = z9 && c8 == aVar.getOpeningCharacter();
            if (z10 && c8 == aVar.getClosingCharacter()) {
                z8 = true;
            }
            z7 = z11;
        }
        this.index = i8;
        return new a(i9, z7, z8);
    }

    private void spnl() {
        match(SPNL);
    }

    private z text(String str, int i8, int i9) {
        return new z(str.substring(i8, i9));
    }

    @Override // org.commonmark.parser.a
    public void parse(String str, u uVar) {
        reset(str.trim());
        u uVar2 = null;
        while (true) {
            uVar2 = parseInline(uVar2);
            if (uVar2 == null) {
                processDelimiters(null);
                mergeChildTextNodes(uVar);
                return;
            }
            uVar.appendChild(uVar2);
        }
    }

    int parseLinkLabel() {
        if (this.index < this.input.length() && this.input.charAt(this.index) == '[') {
            int i8 = this.index + 1;
            int scanLinkLabelContent = org.commonmark.internal.util.c.scanLinkLabelContent(this.input, i8);
            int i9 = scanLinkLabelContent - i8;
            if (scanLinkLabelContent != -1 && i9 <= 999 && scanLinkLabelContent < this.input.length() && this.input.charAt(scanLinkLabelContent) == ']') {
                this.index = scanLinkLabelContent + 1;
                return i9 + 2;
            }
        }
        return 0;
    }

    void reset(String str) {
        this.input = str;
        this.index = 0;
        this.lastDelimiter = null;
        this.lastBracket = null;
    }

    private z text(String str) {
        return new z(str);
    }
}
