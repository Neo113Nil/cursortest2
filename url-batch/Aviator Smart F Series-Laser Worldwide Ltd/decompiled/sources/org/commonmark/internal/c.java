package org.commonmark.internal;

/* loaded from: classes5.dex */
public class c extends org.commonmark.parser.block.a {
    private final org.commonmark.node.b block = new org.commonmark.node.b();

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
            if (!c.isMarker(hVar, nextNonSpaceIndex)) {
                return org.commonmark.parser.block.f.none();
            }
            int column = hVar.getColumn() + hVar.getIndent();
            int i8 = column + 1;
            if (org.commonmark.internal.util.d.isSpaceOrTab(hVar.getLine(), nextNonSpaceIndex + 1)) {
                i8 = column + 2;
            }
            return org.commonmark.parser.block.f.of(new c()).atColumn(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMarker(org.commonmark.parser.block.h hVar, int i8) {
        CharSequence line = hVar.getLine();
        return hVar.getIndent() < org.commonmark.internal.util.d.CODE_BLOCK_INDENT && i8 < line.length() && line.charAt(i8) == '>';
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean canContain(org.commonmark.node.a aVar) {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.b getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public boolean isContainer() {
        return true;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
        if (!isMarker(hVar, nextNonSpaceIndex)) {
            return org.commonmark.parser.block.c.none();
        }
        int column = hVar.getColumn() + hVar.getIndent();
        int i8 = column + 1;
        if (org.commonmark.internal.util.d.isSpaceOrTab(hVar.getLine(), nextNonSpaceIndex + 1)) {
            i8 = column + 2;
        }
        return org.commonmark.parser.block.c.atColumn(i8);
    }
}
