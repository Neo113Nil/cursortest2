package org.commonmark.internal;

/* loaded from: classes5.dex */
public class i extends org.commonmark.parser.block.a {
    private final org.commonmark.node.j block;
    private String firstLine;
    private StringBuilder otherLines;

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            int indent = hVar.getIndent();
            if (indent >= org.commonmark.internal.util.d.CODE_BLOCK_INDENT) {
                return org.commonmark.parser.block.f.none();
            }
            int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
            i checkOpener = i.checkOpener(hVar.getLine(), nextNonSpaceIndex, indent);
            return checkOpener != null ? org.commonmark.parser.block.f.of(checkOpener).atIndex(nextNonSpaceIndex + checkOpener.block.getFenceLength()) : org.commonmark.parser.block.f.none();
        }
    }

    public i(char c8, int i8, int i9) {
        org.commonmark.node.j jVar = new org.commonmark.node.j();
        this.block = jVar;
        this.otherLines = new StringBuilder();
        jVar.setFenceChar(c8);
        jVar.setFenceLength(i8);
        jVar.setFenceIndent(i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i checkOpener(CharSequence charSequence, int i8, int i9) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        for (int i12 = i8; i12 < length; i12++) {
            char charAt = charSequence.charAt(i12);
            if (charAt == '`') {
                i10++;
            } else {
                if (charAt != '~') {
                    break;
                }
                i11++;
            }
        }
        if (i10 >= 3 && i11 == 0) {
            if (org.commonmark.internal.util.d.find('`', charSequence, i8 + i10) != -1) {
                return null;
            }
            return new i('`', i10, i9);
        }
        if (i11 < 3 || i10 != 0) {
            return null;
        }
        return new i('~', i11, i9);
    }

    private boolean isClosing(CharSequence charSequence, int i8) {
        char fenceChar = this.block.getFenceChar();
        int fenceLength = this.block.getFenceLength();
        int skip = org.commonmark.internal.util.d.skip(fenceChar, charSequence, i8, charSequence.length()) - i8;
        return skip >= fenceLength && org.commonmark.internal.util.d.skipSpaceTab(charSequence, i8 + skip, charSequence.length()) == charSequence.length();
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void addLine(CharSequence charSequence) {
        if (this.firstLine == null) {
            this.firstLine = charSequence.toString();
        } else {
            this.otherLines.append(charSequence);
            this.otherLines.append('\n');
        }
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void closeBlock() {
        this.block.setInfo(org.commonmark.internal.util.a.unescapeString(this.firstLine.trim()));
        this.block.setLiteral(this.otherLines.toString());
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
        int index = hVar.getIndex();
        CharSequence line = hVar.getLine();
        if (hVar.getIndent() < org.commonmark.internal.util.d.CODE_BLOCK_INDENT && isClosing(line, nextNonSpaceIndex)) {
            return org.commonmark.parser.block.c.finished();
        }
        int length = line.length();
        for (int fenceIndent = this.block.getFenceIndent(); fenceIndent > 0 && index < length && line.charAt(index) == ' '; fenceIndent--) {
            index++;
        }
        return org.commonmark.parser.block.c.atIndex(index);
    }
}
