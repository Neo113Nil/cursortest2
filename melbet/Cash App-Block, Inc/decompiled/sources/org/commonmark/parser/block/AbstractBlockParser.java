package org.commonmark.parser.block;

import org.commonmark.internal.BlockContinueImpl;
import org.commonmark.internal.BlockQuoteParser;
import org.commonmark.internal.DocumentParser;
import org.commonmark.internal.InlineParserImpl;
import org.commonmark.node.Block;

/* loaded from: classes10.dex */
public abstract class AbstractBlockParser {
    public void addLine(CharSequence charSequence) {
    }

    public boolean canContain(Block block) {
        return this instanceof BlockQuoteParser;
    }

    public void closeBlock() {
    }

    public abstract Block getBlock();

    public boolean isContainer() {
        return this instanceof BlockQuoteParser;
    }

    public void parseInlines(InlineParserImpl inlineParserImpl) {
    }

    public abstract BlockContinueImpl tryContinue(DocumentParser documentParser);
}
