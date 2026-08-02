package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.BlockQuote;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes10.dex */
public final class BlockQuoteParser extends AbstractBlockParser {
    public final BlockQuote block = new BlockQuote();

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        char charAt;
        int i = documentParser.nextNonSpace;
        CharSequence charSequence = documentParser.line;
        if (documentParser.indent >= 4 || i >= charSequence.length() || charSequence.charAt(i) != '>') {
            return null;
        }
        int i2 = documentParser.column + documentParser.indent;
        int i3 = i2 + 1;
        CharSequence charSequence2 = documentParser.line;
        int i4 = i + 1;
        if (i4 < charSequence2.length() && ((charAt = charSequence2.charAt(i4)) == '\t' || charAt == ' ')) {
            i3 = i2 + 2;
        }
        return new BlockContinueImpl(-1, i3, false);
    }
}
