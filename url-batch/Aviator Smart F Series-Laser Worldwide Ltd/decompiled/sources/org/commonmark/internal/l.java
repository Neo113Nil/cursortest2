package org.commonmark.internal;

import java.util.ArrayList;
import java.util.List;
import org.commonmark.node.w;

/* loaded from: classes5.dex */
public class l extends org.commonmark.parser.block.a {
    private final org.commonmark.node.p block = new org.commonmark.node.p();
    private final List<CharSequence> lines = new ArrayList();

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            return (hVar.getIndent() < org.commonmark.internal.util.d.CODE_BLOCK_INDENT || hVar.isBlank() || (hVar.getActiveBlockParser().getBlock() instanceof w)) ? org.commonmark.parser.block.f.none() : org.commonmark.parser.block.f.of(new l()).atColumn(hVar.getColumn() + org.commonmark.internal.util.d.CODE_BLOCK_INDENT);
        }
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void addLine(CharSequence charSequence) {
        this.lines.add(charSequence);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void closeBlock() {
        int size = this.lines.size() - 1;
        while (size >= 0 && org.commonmark.internal.util.d.isBlank(this.lines.get(size))) {
            size--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i8 = 0; i8 < size + 1; i8++) {
            sb.append(this.lines.get(i8));
            sb.append('\n');
        }
        this.block.setLiteral(sb.toString());
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        return hVar.getIndent() >= org.commonmark.internal.util.d.CODE_BLOCK_INDENT ? org.commonmark.parser.block.c.atColumn(hVar.getColumn() + org.commonmark.internal.util.d.CODE_BLOCK_INDENT) : hVar.isBlank() ? org.commonmark.parser.block.c.atIndex(hVar.getNextNonSpaceIndex()) : org.commonmark.parser.block.c.none();
    }
}
