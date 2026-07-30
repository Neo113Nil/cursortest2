package org.commonmark.internal;

import org.commonmark.node.t;
import org.commonmark.node.v;

/* loaded from: classes5.dex */
public class o extends org.commonmark.parser.block.a {
    private final org.commonmark.node.s block;
    private boolean hadBlankLine;
    private int linesAfterBlank;

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            org.commonmark.parser.block.d matchedBlockParser = gVar.getMatchedBlockParser();
            if (hVar.getIndent() >= org.commonmark.internal.util.d.CODE_BLOCK_INDENT) {
                return org.commonmark.parser.block.f.none();
            }
            b parseList = o.parseList(hVar.getLine(), hVar.getNextNonSpaceIndex(), hVar.getColumn() + hVar.getIndent(), gVar.getParagraphContent() != null);
            if (parseList == null) {
                return org.commonmark.parser.block.f.none();
            }
            int i8 = parseList.contentColumn;
            p pVar = new p(i8 - hVar.getColumn());
            if ((matchedBlockParser instanceof o) && o.listsMatch((org.commonmark.node.s) matchedBlockParser.getBlock(), parseList.listBlock)) {
                return org.commonmark.parser.block.f.of(pVar).atColumn(i8);
            }
            o oVar = new o(parseList.listBlock);
            parseList.listBlock.setTight(true);
            return org.commonmark.parser.block.f.of(oVar, pVar).atColumn(i8);
        }
    }

    private static class b {
        final int contentColumn;
        final org.commonmark.node.s listBlock;

        b(org.commonmark.node.s sVar, int i8) {
            this.listBlock = sVar;
            this.contentColumn = i8;
        }
    }

    private static class c {
        final int indexAfterMarker;
        final org.commonmark.node.s listBlock;

        c(org.commonmark.node.s sVar, int i8) {
            this.listBlock = sVar;
            this.indexAfterMarker = i8;
        }
    }

    public o(org.commonmark.node.s sVar) {
        this.block = sVar;
    }

    private static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    private static boolean isSpaceTabOrEnd(CharSequence charSequence, int i8) {
        char charAt;
        return i8 >= charSequence.length() || (charAt = charSequence.charAt(i8)) == '\t' || charAt == ' ';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean listsMatch(org.commonmark.node.s sVar, org.commonmark.node.s sVar2) {
        if ((sVar instanceof org.commonmark.node.c) && (sVar2 instanceof org.commonmark.node.c)) {
            return equals(Character.valueOf(((org.commonmark.node.c) sVar).getBulletMarker()), Character.valueOf(((org.commonmark.node.c) sVar2).getBulletMarker()));
        }
        if ((sVar instanceof v) && (sVar2 instanceof v)) {
            return equals(Character.valueOf(((v) sVar).getDelimiter()), Character.valueOf(((v) sVar2).getDelimiter()));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static b parseList(CharSequence charSequence, int i8, int i9, boolean z7) {
        boolean z8;
        c parseListMarker = parseListMarker(charSequence, i8);
        if (parseListMarker == null) {
            return null;
        }
        org.commonmark.node.s sVar = parseListMarker.listBlock;
        int i10 = parseListMarker.indexAfterMarker;
        int i11 = i9 + (i10 - i8);
        int length = charSequence.length();
        int i12 = i11;
        while (true) {
            if (i10 >= length) {
                z8 = false;
                break;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt != '\t') {
                if (charAt != ' ') {
                    z8 = true;
                    break;
                }
                i12++;
            } else {
                i12 += org.commonmark.internal.util.d.columnsToNextTabStop(i12);
            }
            i10++;
        }
        if (z7 && (((sVar instanceof v) && ((v) sVar).getStartNumber() != 1) || !z8)) {
            return null;
        }
        if (!z8 || i12 - i11 > org.commonmark.internal.util.d.CODE_BLOCK_INDENT) {
            i12 = i11 + 1;
        }
        return new b(sVar, i12);
    }

    private static c parseListMarker(CharSequence charSequence, int i8) {
        char charAt = charSequence.charAt(i8);
        if (charAt != '*' && charAt != '+' && charAt != '-') {
            return parseOrderedList(charSequence, i8);
        }
        int i9 = i8 + 1;
        if (!isSpaceTabOrEnd(charSequence, i9)) {
            return null;
        }
        org.commonmark.node.c cVar = new org.commonmark.node.c();
        cVar.setBulletMarker(charAt);
        return new c(cVar, i9);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static c parseOrderedList(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        for (int i10 = i8; i10 < length; i10++) {
            char charAt = charSequence.charAt(i10);
            if (charAt == ')' || charAt == '.') {
                if (i9 >= 1) {
                    int i11 = i10 + 1;
                    if (isSpaceTabOrEnd(charSequence, i11)) {
                        String charSequence2 = charSequence.subSequence(i8, i10).toString();
                        v vVar = new v();
                        vVar.setStartNumber(Integer.parseInt(charSequence2));
                        vVar.setDelimiter(charAt);
                        return new c(vVar, i11);
                    }
                }
                return null;
            }
            switch (charAt) {
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
                    i9++;
                    if (i9 > 9) {
                        return null;
                    }
                default:
                    return null;
            }
            while (i10 < length) {
            }
        }
        return null;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean canContain(org.commonmark.node.a aVar) {
        if (!(aVar instanceof t)) {
            return false;
        }
        if (this.hadBlankLine && this.linesAfterBlank == 1) {
            this.block.setTight(false);
            this.hadBlankLine = false;
        }
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean isContainer() {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        if (hVar.isBlank()) {
            this.hadBlankLine = true;
            this.linesAfterBlank = 0;
        } else if (this.hadBlankLine) {
            this.linesAfterBlank++;
        }
        return org.commonmark.parser.block.c.atIndex(hVar.getIndex());
    }
}
