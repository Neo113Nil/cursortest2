package org.intellij.markdown.parser.markerblocks;

import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes10.dex */
public abstract class MarkerBlockImpl {
    public final CommonMarkdownConstraints constraints;
    public int lastInterestingOffset;
    public final BlockContent marker;
    public MarkerBlock$ProcessingResult scheduledResult;

    public MarkerBlockImpl(BlockContent blockContent, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        this.constraints = commonMarkdownConstraints;
        this.marker = blockContent;
        this.lastInterestingOffset = -2;
    }

    public abstract boolean allowsSubBlocks();

    public abstract int calcNextInterestingOffset(LookaheadText$Position lookaheadText$Position);

    public abstract MarkerBlock$ProcessingResult doProcessToken(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints);

    public abstract MarkdownElementType getDefaultNodeType();

    public abstract boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position);
}
