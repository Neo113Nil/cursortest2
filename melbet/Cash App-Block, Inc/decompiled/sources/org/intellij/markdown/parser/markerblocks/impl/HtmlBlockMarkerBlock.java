package org.intellij.markdown.parser.markerblocks.impl;

import coil3.svg.internal.ParseSvg_androidKt;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.ranges.IntRange;
import kotlin.text.Regex;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class HtmlBlockMarkerBlock extends MarkerBlockImpl {
    public final Regex endCheckingRegex;
    public final BlockContent productionHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HtmlBlockMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, Regex regex, LookaheadText$Position lookaheadText$Position) {
        super(new BlockContent(blockContent), commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.productionHolder = blockContent;
        this.endCheckingRegex = regex;
        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(lookaheadText$Position.globalPos, lookaheadText$Position.getNextLineOrEofOffset(), 1), MarkdownTokenTypes.HTML_BLOCK_CONTENT)));
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean allowsSubBlocks() {
        return false;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final int calcNextInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return lookaheadText$Position.getNextLineOrEofOffset();
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkerBlock$ProcessingResult doProcessToken(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        int i = lookaheadText$Position.localPos;
        String str = lookaheadText$Position.currentLine;
        if (i != -1) {
            return MarkerBlock$ProcessingResult.CANCEL;
        }
        int i2 = lookaheadText$Position.lineN;
        String str2 = i2 > 0 ? (String) ((List) lookaheadText$Position.this$0.plugins).get(i2 - 1) : null;
        if (str2 == null) {
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        CommonMarkdownConstraints commonMarkdownConstraints2 = this.constraints;
        if (!ParseSvg_androidKt.extendsPrev(commonMarkdownConstraints2.applyToNextLine$1(lookaheadText$Position), commonMarkdownConstraints2)) {
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        Regex regex = this.endCheckingRegex;
        if (regex == null) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            InterceptedRenderContext$send$1 interceptedRenderContext$send$1 = new InterceptedRenderContext$send$1(commonMarkdownConstraints2, 10);
            LookaheadText$Position lookaheadText$Position2 = lookaheadText$Position;
            int i3 = 1;
            while (((Boolean) interceptedRenderContext$send$1.invoke(lookaheadText$Position2)).booleanValue() && (lookaheadText$Position2 = lookaheadText$Position2.nextLinePosition()) != null && (i3 = i3 + 1) <= 4) {
            }
            if (i3 >= 2) {
                return MarkerBlock$ProcessingResult.DEFAULT;
            }
        }
        if (regex != null) {
            Regex.Companion companion = Regex.INSTANCE;
            if (regex.find(str2) != null) {
                return MarkerBlock$ProcessingResult.DEFAULT;
            }
        }
        if (str.length() > 0) {
            this.productionHolder.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints2, str) + lookaheadText$Position.globalPos + 1, lookaheadText$Position.getNextLineOrEofOffset(), 1), MarkdownTokenTypes.HTML_BLOCK_CONTENT)));
        }
        return MarkerBlock$ProcessingResult.CANCEL;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return MarkdownTokenTypes.HTML_BLOCK;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return true;
    }
}
