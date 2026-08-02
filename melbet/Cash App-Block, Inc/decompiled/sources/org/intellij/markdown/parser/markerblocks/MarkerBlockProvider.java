package org.intellij.markdown.parser.markerblocks;

import java.util.List;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.MarkerProcessor$StateInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes10.dex */
public interface MarkerBlockProvider {
    List createMarkerBlocks(LookaheadText$Position lookaheadText$Position, BlockContent blockContent, MarkerProcessor$StateInfo markerProcessor$StateInfo);

    boolean interruptsParagraph(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints);
}
