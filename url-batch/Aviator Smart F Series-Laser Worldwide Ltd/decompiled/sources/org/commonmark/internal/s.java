package org.commonmark.internal;

import org.commonmark.node.a0;

/* loaded from: classes5.dex */
public class s extends org.commonmark.parser.block.a {
    private final a0 block = new a0();

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            if (hVar.getIndent() >= 4) {
                return org.commonmark.parser.block.f.none();
            }
            int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
            CharSequence line = hVar.getLine();
            return s.isThematicBreak(line, nextNonSpaceIndex) ? org.commonmark.parser.block.f.of(new s()).atIndex(line.length()) : org.commonmark.parser.block.f.none();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isThematicBreak(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i8 < length) {
            char charAt = charSequence.charAt(i8);
            if (charAt != '\t' && charAt != ' ') {
                if (charAt == '*') {
                    i11++;
                } else if (charAt == '-') {
                    i9++;
                } else {
                    if (charAt != '_') {
                        return false;
                    }
                    i10++;
                }
            }
            i8++;
        }
        return (i9 >= 3 && i10 == 0 && i11 == 0) || (i10 >= 3 && i9 == 0 && i11 == 0) || (i11 >= 3 && i9 == 0 && i10 == 0);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        return org.commonmark.parser.block.c.none();
    }
}
