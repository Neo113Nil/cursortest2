package org.commonmark.internal;

import androidx.camera.core.AspectRatio;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import net.idrnd.face.iad.capture.internal.o0;
import net.idrnd.face.iad.capture.internal.y0;
import org.commonmark.internal.HeadingParser;
import org.commonmark.internal.ListBlockParser;
import org.commonmark.node.BlockQuote;
import org.commonmark.node.BulletList;
import org.commonmark.node.Document;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.node.Heading;
import org.commonmark.node.IndentedCodeBlock;
import org.commonmark.node.LinkReferenceDefinition;
import org.commonmark.node.ListBlock;
import org.commonmark.node.Node;
import org.commonmark.node.OrderedList;
import org.commonmark.node.Paragraph;
import org.commonmark.node.ThematicBreak;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes10.dex */
public final class DocumentParser {
    public static final LinkedHashSet CORE_FACTORY_TYPES = new LinkedHashSet(Arrays.asList(BlockQuote.class, Heading.class, FencedCodeBlock.class, Document.class, ThematicBreak.class, ListBlock.class, IndentedCodeBlock.class));
    public static final Map NODES_TO_CORE_FACTORIES;
    public final ArrayList activeBlockParsers;
    public final LinkedHashSet allBlockParsers;
    public boolean blank;
    public final List blockParserFactories;
    public boolean columnIsInTab;
    public final List delimiterProcessors;
    public final DocumentBlockParser documentBlockParser;
    public final y0 inlineParserFactory;
    public CharSequence line;
    public int index = 0;
    public int column = 0;
    public int nextNonSpace = 0;
    public int nextNonSpaceColumn = 0;
    public int indent = 0;
    public final LinkedHashMap definitions = new LinkedHashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(BlockQuote.class, new HeadingParser.Factory(1));
        hashMap.put(Heading.class, new HeadingParser.Factory(0));
        hashMap.put(FencedCodeBlock.class, new HeadingParser.Factory(2));
        hashMap.put(Document.class, new HeadingParser.Factory(3));
        hashMap.put(ThematicBreak.class, new HeadingParser.Factory(6));
        hashMap.put(ListBlock.class, new HeadingParser.Factory(5));
        hashMap.put(IndentedCodeBlock.class, new HeadingParser.Factory(4));
        NODES_TO_CORE_FACTORIES = Collections.unmodifiableMap(hashMap);
    }

    public DocumentParser(ArrayList arrayList, y0 y0Var, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.activeBlockParsers = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.allBlockParsers = linkedHashSet;
        this.blockParserFactories = arrayList;
        this.inlineParserFactory = y0Var;
        this.delimiterProcessors = arrayList2;
        DocumentBlockParser documentBlockParser = new DocumentBlockParser(0);
        this.documentBlockParser = documentBlockParser;
        arrayList3.add(documentBlockParser);
        linkedHashSet.add(documentBlockParser);
    }

    public final void addChild(AbstractBlockParser abstractBlockParser) {
        while (!getActiveBlockParser().canContain(abstractBlockParser.getBlock())) {
            finalize(getActiveBlockParser());
        }
        getActiveBlockParser().getBlock().appendChild(abstractBlockParser.getBlock());
        this.activeBlockParsers.add(abstractBlockParser);
        this.allBlockParsers.add(abstractBlockParser);
    }

    public final void addDefinitionsFrom(ParagraphParser paragraphParser) {
        LinkReferenceDefinitionParser linkReferenceDefinitionParser = paragraphParser.linkReferenceDefinitionParser;
        linkReferenceDefinitionParser.finishReference();
        Iterator it = linkReferenceDefinitionParser.definitions.iterator();
        while (it.hasNext()) {
            LinkReferenceDefinition linkReferenceDefinition = (LinkReferenceDefinition) it.next();
            Paragraph paragraph = paragraphParser.block;
            linkReferenceDefinition.unlink();
            Node node = (Node) paragraph.prev;
            linkReferenceDefinition.prev = node;
            if (node != null) {
                node.next = linkReferenceDefinition;
            }
            linkReferenceDefinition.next = paragraph;
            paragraph.prev = linkReferenceDefinition;
            Node node2 = (Node) paragraph.parent;
            linkReferenceDefinition.parent = node2;
            if (((Node) linkReferenceDefinition.prev) == null) {
                node2.firstChild = linkReferenceDefinition;
            }
            String str = linkReferenceDefinition.label;
            LinkedHashMap linkedHashMap = this.definitions;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, linkReferenceDefinition);
            }
        }
    }

    public final void addLine() {
        CharSequence subSequence;
        if (this.columnIsInTab) {
            int i = this.index + 1;
            CharSequence charSequence = this.line;
            CharSequence subSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.column % 4);
            StringBuilder sb = new StringBuilder(subSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(subSequence2);
            subSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.line;
            subSequence = charSequence2.subSequence(this.index, charSequence2.length());
        }
        getActiveBlockParser().addLine(subSequence);
    }

    public final void advance() {
        char charAt = this.line.charAt(this.index);
        int i = this.index;
        if (charAt != '\t') {
            this.index = i + 1;
            this.column++;
        } else {
            this.index = i + 1;
            int i2 = this.column;
            this.column = (4 - (i2 % 4)) + i2;
        }
    }

    public final void finalize(AbstractBlockParser abstractBlockParser) {
        if (getActiveBlockParser() == abstractBlockParser) {
            this.activeBlockParsers.remove(r0.size() - 1);
        }
        if (abstractBlockParser instanceof ParagraphParser) {
            addDefinitionsFrom((ParagraphParser) abstractBlockParser);
        }
        abstractBlockParser.closeBlock();
    }

    public final void finalizeBlocks(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            finalize((AbstractBlockParser) list.get(size));
        }
    }

    public final void findNextNonSpace() {
        int i = this.index;
        int i2 = this.column;
        this.blank = true;
        int length = this.line.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = this.line.charAt(i);
            if (charAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (charAt != ' ') {
                this.blank = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.nextNonSpace = i;
        this.nextNonSpaceColumn = i2;
        this.indent = i2 - this.column;
    }

    public final AbstractBlockParser getActiveBlockParser() {
        return (AbstractBlockParser) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, this.activeBlockParsers);
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0184, code lost:
    
        if (r5.length() == 0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x01c9, code lost:
    
        if (r3 < 1) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x01cb, code lost:
    
        r3 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x01d1, code lost:
    
        if (r3 >= r13.length()) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x01d3, code lost:
    
        r6 = r13.charAt(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x01d9, code lost:
    
        if (r6 == '\t') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x01dd, code lost:
    
        if (r6 == ' ') goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x01e0, code lost:
    
        r6 = r13.subSequence(r8, r15).toString();
        r14 = new org.commonmark.node.OrderedList();
        r14.startNumber = java.lang.Integer.parseInt(r6);
        r14.delimiter = r5;
        r5 = new org.commonmark.internal.ListBlockParser.ListData(r14, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0555, code lost:
    
        if (r5.length() == 0) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c0, code lost:
    
        r21 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x05f1, code lost:
    
        setNewIndex(r22.nextNonSpace);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:163:0x01b6. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0543  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void incorporateLine(String str) {
        AbstractBlockParser abstractBlockParser;
        int i;
        BlockStartImpl blockStartImpl;
        boolean z;
        HeadingParser headingParser;
        int i2;
        StringBuilder sb;
        BlockStartImpl blockStartImpl2;
        char charAt;
        int i3;
        FencedCodeBlockParser fencedCodeBlockParser;
        StringBuilder sb2;
        int i4;
        ListBlockParser.ListData listData;
        char charAt2;
        ListBlockParser.ListData listData2;
        int i5;
        String str2 = str;
        int length = str2.length();
        int i6 = 0;
        StringBuilder sb3 = null;
        for (int i7 = 0; i7 < length; i7++) {
            char charAt3 = str2.charAt(i7);
            if (charAt3 == 0) {
                if (sb3 == null) {
                    sb3 = new StringBuilder(length);
                    sb3.append((CharSequence) str2, 0, i7);
                }
                sb3.append((char) 65533);
            } else if (sb3 != null) {
                sb3.append(charAt3);
            }
        }
        if (sb3 != null) {
            str2 = sb3.toString();
        }
        this.line = str2;
        this.index = 0;
        this.column = 0;
        this.columnIsInTab = false;
        ArrayList arrayList = this.activeBlockParsers;
        int i8 = 1;
        for (AbstractBlockParser abstractBlockParser2 : arrayList.subList(1, arrayList.size())) {
            findNextNonSpace();
            BlockContinueImpl tryContinue = abstractBlockParser2.tryContinue(this);
            if (tryContinue == null) {
                break;
            }
            if (tryContinue.finalize) {
                finalize(abstractBlockParser2);
                return;
            }
            int i9 = tryContinue.newIndex;
            if (i9 != -1) {
                setNewIndex(i9);
            } else {
                int i10 = tryContinue.newColumn;
                if (i10 != -1) {
                    setNewColumn(i10);
                }
            }
            i8++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i8, arrayList.size()));
        AbstractBlockParser abstractBlockParser3 = (AbstractBlockParser) arrayList.get(i8 - 1);
        boolean isEmpty = arrayList2.isEmpty();
        boolean z2 = (abstractBlockParser3.getBlock() instanceof Paragraph) || abstractBlockParser3.isContainer();
        while (true) {
            if (z2) {
                findNextNonSpace();
                if (!this.blank) {
                    int i11 = 4;
                    if (this.indent >= 4 || !Character.isLetter(Character.codePointAt(this.line, this.nextNonSpace))) {
                        o0 o0Var = new o0(abstractBlockParser3, 20);
                        Iterator it = this.blockParserFactories.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                i = i6;
                                char c = ' ';
                                switch (((HeadingParser.Factory) it.next()).$r8$classId) {
                                    case 0:
                                        abstractBlockParser = abstractBlockParser3;
                                        if (this.indent < 4) {
                                            CharSequence charSequence = this.line;
                                            int i12 = this.nextNonSpace;
                                            int skip = AspectRatio.skip('#', i12, charSequence.length(), charSequence) - i12;
                                            if (skip != 0 && skip <= 6) {
                                                int i13 = i12 + skip;
                                                if (i13 >= charSequence.length()) {
                                                    headingParser = new HeadingParser(skip, "");
                                                } else {
                                                    char charAt4 = charSequence.charAt(i13);
                                                    char c2 = ' ';
                                                    char c3 = '\t';
                                                    if (charAt4 == ' ' || charAt4 == '\t') {
                                                        int length2 = charSequence.length() - 1;
                                                        while (true) {
                                                            if (length2 < i13) {
                                                                length2 = i13 - 1;
                                                            } else {
                                                                char charAt5 = charSequence.charAt(length2);
                                                                if (charAt5 == c3 || charAt5 == c2) {
                                                                    length2--;
                                                                    c3 = '\t';
                                                                    c2 = ' ';
                                                                }
                                                            }
                                                        }
                                                        int i14 = length2;
                                                        while (true) {
                                                            if (i14 < i13) {
                                                                i14 = i13 - 1;
                                                            } else if (charSequence.charAt(i14) == '#') {
                                                                i14--;
                                                            }
                                                        }
                                                        int i15 = i14;
                                                        while (true) {
                                                            if (i15 < i13) {
                                                                i15 = i13 - 1;
                                                            } else {
                                                                char charAt6 = charSequence.charAt(i15);
                                                                if (charAt6 != '\t' && charAt6 != ' ') {
                                                                }
                                                                i15--;
                                                            }
                                                        }
                                                        headingParser = i15 != i14 ? new HeadingParser(skip, charSequence.subSequence(i13, i15 + 1).toString()) : new HeadingParser(skip, charSequence.subSequence(i13, length2 + 1).toString());
                                                    }
                                                }
                                                if (headingParser == null) {
                                                    AbstractBlockParser[] abstractBlockParserArr = new AbstractBlockParser[1];
                                                    abstractBlockParserArr[i] = headingParser;
                                                    blockStartImpl2 = new BlockStartImpl(abstractBlockParserArr);
                                                    blockStartImpl2.newIndex = charSequence.length();
                                                } else {
                                                    char charAt7 = charSequence.charAt(i12);
                                                    if (charAt7 != '-') {
                                                        if (charAt7 == '=') {
                                                            if (AspectRatio.skipSpaceTab(AspectRatio.skip('=', i12 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length()) {
                                                                i2 = 1;
                                                                if (i2 > 0) {
                                                                    AbstractBlockParser abstractBlockParser4 = (AbstractBlockParser) o0Var.a;
                                                                    if (abstractBlockParser4 instanceof ParagraphParser) {
                                                                        sb = ((ParagraphParser) abstractBlockParser4).linkReferenceDefinitionParser.paragraph;
                                                                        break;
                                                                    }
                                                                    sb = null;
                                                                    if (sb != null) {
                                                                        HeadingParser headingParser2 = new HeadingParser(i2, sb.toString());
                                                                        AbstractBlockParser[] abstractBlockParserArr2 = new AbstractBlockParser[1];
                                                                        abstractBlockParserArr2[i] = headingParser2;
                                                                        blockStartImpl2 = new BlockStartImpl(abstractBlockParserArr2);
                                                                        blockStartImpl2.newIndex = charSequence.length();
                                                                        blockStartImpl2.replaceActiveBlockParser = true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        i2 = i;
                                                        if (i2 > 0) {
                                                        }
                                                    }
                                                    if (AspectRatio.skipSpaceTab(AspectRatio.skip('-', i12 + 1, charSequence.length(), charSequence), charSequence.length(), charSequence) >= charSequence.length()) {
                                                        i2 = 2;
                                                        if (i2 > 0) {
                                                        }
                                                    }
                                                    i2 = i;
                                                    if (i2 > 0) {
                                                    }
                                                }
                                                blockStartImpl = blockStartImpl2;
                                                break;
                                            }
                                            headingParser = null;
                                            if (headingParser == null) {
                                            }
                                            blockStartImpl = blockStartImpl2;
                                        }
                                        blockStartImpl = null;
                                        break;
                                    case 1:
                                        abstractBlockParser = abstractBlockParser3;
                                        int i16 = this.nextNonSpace;
                                        CharSequence charSequence2 = this.line;
                                        if (this.indent < 4 && i16 < charSequence2.length() && charSequence2.charAt(i16) == '>') {
                                            int i17 = this.column + this.indent;
                                            int i18 = i17 + 1;
                                            CharSequence charSequence3 = this.line;
                                            int i19 = i16 + 1;
                                            if (i19 < charSequence3.length() && ((charAt = charSequence3.charAt(i19)) == '\t' || charAt == ' ')) {
                                                i18 = i17 + 2;
                                            }
                                            AbstractBlockParser[] abstractBlockParserArr3 = new AbstractBlockParser[1];
                                            abstractBlockParserArr3[i] = new BlockQuoteParser();
                                            blockStartImpl = new BlockStartImpl(abstractBlockParserArr3);
                                            blockStartImpl.newColumn = i18;
                                            break;
                                        }
                                        blockStartImpl = null;
                                        break;
                                    case 2:
                                        abstractBlockParser = abstractBlockParser3;
                                        int i20 = this.indent;
                                        if (i20 < 4) {
                                            int i21 = this.nextNonSpace;
                                            CharSequence charSequence4 = this.line;
                                            int length3 = charSequence4.length();
                                            int i22 = i21;
                                            int i23 = i;
                                            int i24 = i23;
                                            while (true) {
                                                i3 = i21;
                                                if (i22 < length3) {
                                                    char charAt8 = charSequence4.charAt(i22);
                                                    if (charAt8 == '`') {
                                                        i23++;
                                                    } else if (charAt8 == '~') {
                                                        i24++;
                                                    }
                                                    i22++;
                                                    i21 = i3;
                                                }
                                            }
                                            int i25 = 3;
                                            if (i23 >= 3) {
                                                if (i24 == 0) {
                                                    int i26 = i3 + i23;
                                                    int length4 = charSequence4.length();
                                                    while (true) {
                                                        if (i26 >= length4) {
                                                            i26 = -1;
                                                        } else if (charSequence4.charAt(i26) != '`') {
                                                            i26++;
                                                        }
                                                    }
                                                    if (i26 == -1) {
                                                        fencedCodeBlockParser = new FencedCodeBlockParser('`', i23, i20);
                                                        if (fencedCodeBlockParser != null) {
                                                            AbstractBlockParser[] abstractBlockParserArr4 = new AbstractBlockParser[1];
                                                            abstractBlockParserArr4[i] = fencedCodeBlockParser;
                                                            blockStartImpl2 = new BlockStartImpl(abstractBlockParserArr4);
                                                            blockStartImpl2.newIndex = i3 + fencedCodeBlockParser.block.fenceLength;
                                                            blockStartImpl = blockStartImpl2;
                                                            break;
                                                        }
                                                    }
                                                    fencedCodeBlockParser = null;
                                                    if (fencedCodeBlockParser != null) {
                                                    }
                                                } else {
                                                    i25 = 3;
                                                }
                                            }
                                            if (i24 >= i25 && i23 == 0) {
                                                fencedCodeBlockParser = new FencedCodeBlockParser('~', i24, i20);
                                                if (fencedCodeBlockParser != null) {
                                                }
                                            }
                                            fencedCodeBlockParser = null;
                                            if (fencedCodeBlockParser != null) {
                                            }
                                        }
                                        blockStartImpl = null;
                                        break;
                                    case 3:
                                        abstractBlockParser = abstractBlockParser3;
                                        int i27 = i11;
                                        int i28 = this.nextNonSpace;
                                        CharSequence charSequence5 = this.line;
                                        if (this.indent < i27 && charSequence5.charAt(i28) == '<') {
                                            for (int i29 = 1; i29 <= 7; i29++) {
                                                if (i29 != 7 || !(((AbstractBlockParser) o0Var.a).getBlock() instanceof Paragraph)) {
                                                    Pattern[] patternArr = HtmlBlockParser.BLOCK_PATTERNS[i29];
                                                    Pattern pattern = patternArr[i];
                                                    Pattern pattern2 = patternArr[1];
                                                    if (pattern.matcher(charSequence5.subSequence(i28, charSequence5.length())).find()) {
                                                        AbstractBlockParser[] abstractBlockParserArr5 = new AbstractBlockParser[1];
                                                        abstractBlockParserArr5[i] = new HtmlBlockParser(pattern2);
                                                        blockStartImpl = new BlockStartImpl(abstractBlockParserArr5);
                                                        blockStartImpl.newIndex = this.index;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        blockStartImpl = null;
                                        break;
                                    case 4:
                                        abstractBlockParser = abstractBlockParser3;
                                        if (this.indent >= 4) {
                                            if (!this.blank && !(getActiveBlockParser().getBlock() instanceof Paragraph)) {
                                                AbstractBlockParser[] abstractBlockParserArr6 = new AbstractBlockParser[1];
                                                abstractBlockParserArr6[i] = new HeadingParser();
                                                blockStartImpl = new BlockStartImpl(abstractBlockParserArr6);
                                                blockStartImpl.newColumn = this.column + 4;
                                                break;
                                            }
                                        }
                                        blockStartImpl = null;
                                        break;
                                    case 5:
                                        AbstractBlockParser abstractBlockParser5 = (AbstractBlockParser) o0Var.a;
                                        int i30 = this.indent;
                                        if (i30 >= 4) {
                                            abstractBlockParser = abstractBlockParser3;
                                        } else {
                                            int i31 = this.nextNonSpace;
                                            int i32 = this.column + i30;
                                            if (abstractBlockParser5 instanceof ParagraphParser) {
                                                sb2 = ((ParagraphParser) abstractBlockParser5).linkReferenceDefinitionParser.paragraph;
                                                break;
                                            }
                                            sb2 = null;
                                            int i33 = sb2 != null ? 1 : i;
                                            CharSequence charSequence6 = this.line;
                                            char charAt9 = charSequence6.charAt(i31);
                                            if (charAt9 == '*' || charAt9 == '+' || charAt9 == '-') {
                                                i4 = i33;
                                                abstractBlockParser = abstractBlockParser3;
                                                int i34 = i31 + 1;
                                                if (i34 >= charSequence6.length() || (charAt2 = charSequence6.charAt(i34)) == '\t' || charAt2 == ' ') {
                                                    BulletList bulletList = new BulletList();
                                                    bulletList.bulletMarker = charAt9;
                                                    listData = new ListBlockParser.ListData(bulletList, i34);
                                                    if (listData != null) {
                                                        ListBlock listBlock = listData.listBlock;
                                                        int i35 = listData.contentColumn;
                                                        int i36 = (i35 - i31) + i32;
                                                        int length5 = charSequence6.length();
                                                        int i37 = i36;
                                                        while (true) {
                                                            if (i35 >= length5) {
                                                                i5 = i;
                                                            } else {
                                                                char charAt10 = charSequence6.charAt(i35);
                                                                if (charAt10 == '\t') {
                                                                    i37 = (4 - (i37 % 4)) + i37;
                                                                } else if (charAt10 == ' ') {
                                                                    i37++;
                                                                } else {
                                                                    i5 = 1;
                                                                }
                                                                i35++;
                                                            }
                                                        }
                                                        if (i4 == 0 || ((!(listBlock instanceof OrderedList) || ((OrderedList) listBlock).startNumber == 1) && i5 != 0)) {
                                                            if (i5 == 0 || i37 - i36 > 4) {
                                                                i37 = i36 + 1;
                                                            }
                                                            listData2 = new ListBlockParser.ListData(listBlock, i37);
                                                            if (listData2 != null) {
                                                                ListBlock listBlock2 = listData2.listBlock;
                                                                int i38 = listData2.contentColumn;
                                                                ListItemParser listItemParser = new ListItemParser(i38 - this.column);
                                                                if (abstractBlockParser5 instanceof ListBlockParser) {
                                                                    ListBlock listBlock3 = ((ListBlockParser) abstractBlockParser5).block;
                                                                    if ((((listBlock3 instanceof BulletList) && (listBlock2 instanceof BulletList)) ? Character.valueOf(((BulletList) listBlock3).bulletMarker).equals(Character.valueOf(((BulletList) listBlock2).bulletMarker)) : ((listBlock3 instanceof OrderedList) && (listBlock2 instanceof OrderedList)) ? Character.valueOf(((OrderedList) listBlock3).delimiter).equals(Character.valueOf(((OrderedList) listBlock2).delimiter)) : i) != 0) {
                                                                        AbstractBlockParser[] abstractBlockParserArr7 = new AbstractBlockParser[1];
                                                                        abstractBlockParserArr7[i] = listItemParser;
                                                                        BlockStartImpl blockStartImpl3 = new BlockStartImpl(abstractBlockParserArr7);
                                                                        blockStartImpl3.newColumn = i38;
                                                                        blockStartImpl = blockStartImpl3;
                                                                        break;
                                                                    }
                                                                }
                                                                ListBlockParser listBlockParser = new ListBlockParser(listBlock2);
                                                                listBlock2.tight = true;
                                                                AbstractBlockParser[] abstractBlockParserArr8 = new AbstractBlockParser[2];
                                                                abstractBlockParserArr8[i] = listBlockParser;
                                                                abstractBlockParserArr8[1] = listItemParser;
                                                                BlockStartImpl blockStartImpl4 = new BlockStartImpl(abstractBlockParserArr8);
                                                                blockStartImpl4.newColumn = i38;
                                                                blockStartImpl = blockStartImpl4;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    listData2 = null;
                                                    if (listData2 != null) {
                                                    }
                                                }
                                                listData = null;
                                                if (listData != null) {
                                                }
                                                listData2 = null;
                                                if (listData2 != null) {
                                                }
                                            } else {
                                                int length6 = charSequence6.length();
                                                int i39 = i31;
                                                int i40 = i;
                                                while (true) {
                                                    i4 = i33;
                                                    if (i39 < length6) {
                                                        char charAt11 = charSequence6.charAt(i39);
                                                        abstractBlockParser = abstractBlockParser3;
                                                        if (charAt11 != ')' && charAt11 != '.') {
                                                            switch (charAt11) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i40++;
                                                                    if (i40 > 9) {
                                                                        break;
                                                                    } else {
                                                                        i39++;
                                                                        i33 = i4;
                                                                        abstractBlockParser3 = abstractBlockParser;
                                                                    }
                                                            }
                                                            if (listData != null) {
                                                            }
                                                            listData2 = null;
                                                            if (listData2 != null) {
                                                            }
                                                        }
                                                    } else {
                                                        abstractBlockParser = abstractBlockParser3;
                                                    }
                                                }
                                                listData = null;
                                                if (listData != null) {
                                                }
                                                listData2 = null;
                                                if (listData2 != null) {
                                                }
                                            }
                                        }
                                        blockStartImpl = null;
                                        break;
                                    default:
                                        if (this.indent < i11) {
                                            int i41 = this.nextNonSpace;
                                            CharSequence charSequence7 = this.line;
                                            int length7 = charSequence7.length();
                                            int i42 = i;
                                            int i43 = i42;
                                            int i44 = i43;
                                            while (true) {
                                                if (i41 >= length7) {
                                                    int i45 = i43;
                                                    int i46 = i44;
                                                    if ((i42 >= 3 && i45 == 0 && i46 == 0) || ((i45 >= 3 && i42 == 0 && i46 == 0) || (i46 >= 3 && i42 == 0 && i45 == 0))) {
                                                        AbstractBlockParser[] abstractBlockParserArr9 = new AbstractBlockParser[1];
                                                        abstractBlockParserArr9[i] = new DocumentBlockParser(1);
                                                        blockStartImpl = new BlockStartImpl(abstractBlockParserArr9);
                                                        blockStartImpl.newIndex = charSequence7.length();
                                                    }
                                                } else {
                                                    char charAt12 = charSequence7.charAt(i41);
                                                    if (charAt12 == '\t' || charAt12 == c) {
                                                        i43 = i43;
                                                        i44 = i44;
                                                    } else if (charAt12 == '*') {
                                                        i44++;
                                                    } else if (charAt12 == '-') {
                                                        i42++;
                                                    } else if (charAt12 == '_') {
                                                        i43++;
                                                    }
                                                    i41++;
                                                    c = ' ';
                                                }
                                            }
                                        }
                                        blockStartImpl = null;
                                        abstractBlockParser = abstractBlockParser3;
                                        break;
                                }
                                if (blockStartImpl == null) {
                                    i6 = i;
                                    abstractBlockParser3 = abstractBlockParser;
                                    i11 = 4;
                                }
                            } else {
                                i = i6;
                                abstractBlockParser = abstractBlockParser3;
                                blockStartImpl = null;
                            }
                        }
                        if (blockStartImpl == null) {
                            setNewIndex(this.nextNonSpace);
                        } else {
                            if (!isEmpty) {
                                finalizeBlocks(arrayList2);
                                isEmpty = true;
                            }
                            int i47 = blockStartImpl.newIndex;
                            if (i47 != -1) {
                                setNewIndex(i47);
                            } else {
                                int i48 = blockStartImpl.newColumn;
                                if (i48 != -1) {
                                    setNewColumn(i48);
                                }
                            }
                            if (blockStartImpl.replaceActiveBlockParser) {
                                AbstractBlockParser activeBlockParser = getActiveBlockParser();
                                z = true;
                                arrayList.remove(arrayList.size() - 1);
                                this.allBlockParsers.remove(activeBlockParser);
                                if (activeBlockParser instanceof ParagraphParser) {
                                    addDefinitionsFrom((ParagraphParser) activeBlockParser);
                                }
                                activeBlockParser.getBlock().unlink();
                            } else {
                                z = true;
                            }
                            AbstractBlockParser[] abstractBlockParserArr10 = (AbstractBlockParser[]) blockStartImpl.blockParsers;
                            int length8 = abstractBlockParserArr10.length;
                            abstractBlockParser3 = abstractBlockParser;
                            for (int i49 = i; i49 < length8; i49++) {
                                abstractBlockParser3 = abstractBlockParserArr10[i49];
                                addChild(abstractBlockParser3);
                                z2 = abstractBlockParser3.isContainer();
                            }
                            i6 = i;
                        }
                    }
                }
            } else {
                abstractBlockParser = abstractBlockParser3;
            }
        }
        if (!isEmpty && !this.blank) {
            AbstractBlockParser activeBlockParser2 = getActiveBlockParser();
            activeBlockParser2.getClass();
            if (activeBlockParser2 instanceof ParagraphParser) {
                addLine();
                return;
            }
        }
        if (!isEmpty) {
            finalizeBlocks(arrayList2);
        }
        if (!abstractBlockParser.isContainer()) {
            addLine();
        } else {
            if (this.blank) {
                return;
            }
            addChild(new ParagraphParser());
            addLine();
        }
    }

    public final void setNewColumn(int i) {
        int i2;
        int i3 = this.nextNonSpaceColumn;
        if (i >= i3) {
            this.index = this.nextNonSpace;
            this.column = i3;
        }
        int length = this.line.length();
        while (true) {
            i2 = this.column;
            if (i2 >= i || this.index == length) {
                break;
            } else {
                advance();
            }
        }
        if (i2 <= i) {
            this.columnIsInTab = false;
            return;
        }
        this.index--;
        this.column = i;
        this.columnIsInTab = true;
    }

    public final void setNewIndex(int i) {
        int i2 = this.nextNonSpace;
        if (i >= i2) {
            this.index = i2;
            this.column = this.nextNonSpaceColumn;
        }
        int length = this.line.length();
        while (true) {
            int i3 = this.index;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                advance();
            }
        }
        this.columnIsInTab = false;
    }
}
