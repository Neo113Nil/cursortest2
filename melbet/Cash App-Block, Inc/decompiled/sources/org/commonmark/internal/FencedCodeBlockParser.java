package org.commonmark.internal;

import androidx.camera.core.AspectRatio;
import org.commonmark.internal.util.Escaping;
import org.commonmark.node.Block;
import org.commonmark.node.FencedCodeBlock;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes10.dex */
public final class FencedCodeBlockParser extends AbstractBlockParser {
    public final FencedCodeBlock block;
    public String firstLine;
    public final StringBuilder otherLines;

    public FencedCodeBlockParser(char c, int i, int i2) {
        FencedCodeBlock fencedCodeBlock = new FencedCodeBlock();
        this.block = fencedCodeBlock;
        this.otherLines = new StringBuilder();
        fencedCodeBlock.fenceChar = c;
        fencedCodeBlock.fenceLength = i;
        fencedCodeBlock.fenceIndent = i2;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final void addLine(CharSequence charSequence) {
        if (this.firstLine == null) {
            this.firstLine = charSequence.toString();
            return;
        }
        StringBuilder sb = this.otherLines;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final void closeBlock() {
        String unescapeString = Escaping.unescapeString(this.firstLine.trim());
        FencedCodeBlock fencedCodeBlock = this.block;
        fencedCodeBlock.info = unescapeString;
        fencedCodeBlock.literal = this.otherLines.toString();
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        int i = documentParser.nextNonSpace;
        int i2 = documentParser.index;
        CharSequence charSequence = documentParser.line;
        int i3 = documentParser.indent;
        FencedCodeBlock fencedCodeBlock = this.block;
        if (i3 < 4) {
            char c = fencedCodeBlock.fenceChar;
            int i4 = fencedCodeBlock.fenceLength;
            int skip = AspectRatio.skip(c, i, charSequence.length(), charSequence) - i;
            if (skip >= i4 && AspectRatio.skipSpaceTab(i + skip, charSequence.length(), charSequence) == charSequence.length()) {
                return new BlockContinueImpl(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = fencedCodeBlock.fenceIndent; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return BlockContinueImpl.atIndex(i2);
    }
}
