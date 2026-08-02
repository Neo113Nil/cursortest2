package org.commonmark.internal;

import org.commonmark.node.Block;
import org.commonmark.node.ListBlock;
import org.commonmark.node.ListItem;
import org.commonmark.parser.block.AbstractBlockParser;

/* loaded from: classes10.dex */
public final class ListBlockParser extends AbstractBlockParser {
    public final ListBlock block;
    public boolean hadBlankLine;
    public int linesAfterBlank;

    public final class ListData {
        public final int contentColumn;
        public final ListBlock listBlock;

        public /* synthetic */ ListData(ListBlock listBlock, int i) {
            this.listBlock = listBlock;
            this.contentColumn = i;
        }
    }

    public ListBlockParser(ListBlock listBlock) {
        this.block = listBlock;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final boolean canContain(Block block) {
        if (!(block instanceof ListItem)) {
            return false;
        }
        if (this.hadBlankLine && this.linesAfterBlank == 1) {
            this.block.tight = false;
            this.hadBlankLine = false;
        }
        return true;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final Block getBlock() {
        return this.block;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final boolean isContainer() {
        return true;
    }

    @Override // org.commonmark.parser.block.AbstractBlockParser
    public final BlockContinueImpl tryContinue(DocumentParser documentParser) {
        if (documentParser.blank) {
            this.hadBlankLine = true;
            this.linesAfterBlank = 0;
        } else if (this.hadBlankLine) {
            this.linesAfterBlank++;
        }
        return BlockContinueImpl.atIndex(documentParser.index);
    }
}
