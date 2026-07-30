package org.commonmark.internal;

/* loaded from: classes5.dex */
public class j extends org.commonmark.parser.block.a {
    private final org.commonmark.node.l block;
    private final String content;

    public static class a extends org.commonmark.parser.block.b {
        @Override // org.commonmark.parser.block.b, org.commonmark.parser.block.e
        public org.commonmark.parser.block.f tryStart(org.commonmark.parser.block.h hVar, org.commonmark.parser.block.g gVar) {
            CharSequence paragraphContent;
            if (hVar.getIndent() >= org.commonmark.internal.util.d.CODE_BLOCK_INDENT) {
                return org.commonmark.parser.block.f.none();
            }
            CharSequence line = hVar.getLine();
            int nextNonSpaceIndex = hVar.getNextNonSpaceIndex();
            j atxHeading = j.getAtxHeading(line, nextNonSpaceIndex);
            if (atxHeading != null) {
                return org.commonmark.parser.block.f.of(atxHeading).atIndex(line.length());
            }
            int setextHeadingLevel = j.getSetextHeadingLevel(line, nextNonSpaceIndex);
            return (setextHeadingLevel <= 0 || (paragraphContent = gVar.getParagraphContent()) == null) ? org.commonmark.parser.block.f.none() : org.commonmark.parser.block.f.of(new j(setextHeadingLevel, paragraphContent.toString())).atIndex(line.length()).replaceActiveBlockParser();
        }
    }

    public j(int i8, String str) {
        org.commonmark.node.l lVar = new org.commonmark.node.l();
        this.block = lVar;
        lVar.setLevel(i8);
        this.content = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j getAtxHeading(CharSequence charSequence, int i8) {
        int skip = org.commonmark.internal.util.d.skip('#', charSequence, i8, charSequence.length()) - i8;
        if (skip == 0 || skip > 6) {
            return null;
        }
        int i9 = i8 + skip;
        if (i9 >= charSequence.length()) {
            return new j(skip, "");
        }
        char charAt = charSequence.charAt(i9);
        if (charAt != ' ' && charAt != '\t') {
            return null;
        }
        int skipSpaceTabBackwards = org.commonmark.internal.util.d.skipSpaceTabBackwards(charSequence, charSequence.length() - 1, i9);
        int skipBackwards = org.commonmark.internal.util.d.skipBackwards('#', charSequence, skipSpaceTabBackwards, i9);
        int skipSpaceTabBackwards2 = org.commonmark.internal.util.d.skipSpaceTabBackwards(charSequence, skipBackwards, i9);
        return skipSpaceTabBackwards2 != skipBackwards ? new j(skip, charSequence.subSequence(i9, skipSpaceTabBackwards2 + 1).toString()) : new j(skip, charSequence.subSequence(i9, skipSpaceTabBackwards + 1).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getSetextHeadingLevel(CharSequence charSequence, int i8) {
        char charAt = charSequence.charAt(i8);
        if (charAt != '-') {
            if (charAt != '=') {
                return 0;
            }
            if (isSetextHeadingRest(charSequence, i8 + 1, '=')) {
                return 1;
            }
        }
        return isSetextHeadingRest(charSequence, i8 + 1, '-') ? 2 : 0;
    }

    private static boolean isSetextHeadingRest(CharSequence charSequence, int i8, char c8) {
        return org.commonmark.internal.util.d.skipSpaceTab(charSequence, org.commonmark.internal.util.d.skip(c8, charSequence, i8, charSequence.length()), charSequence.length()) >= charSequence.length();
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.node.a getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public void parseInlines(org.commonmark.parser.a aVar) {
        aVar.parse(this.content, this.block);
    }

    @Override // org.commonmark.parser.block.a, org.commonmark.parser.block.d
    public org.commonmark.parser.block.c tryContinue(org.commonmark.parser.block.h hVar) {
        return org.commonmark.parser.block.c.none();
    }
}
