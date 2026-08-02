package org.intellij.markdown.parser.markerblocks.impl;

import coil3.svg.internal.ParseSvg_androidKt;
import com.squareup.workflow1.InterceptedRenderContext$send$1;
import kotlin.jvm.functions.Function2;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;

/* loaded from: classes10.dex */
public final class ParagraphMarkerBlock extends MarkerBlockImpl {
    public final Function2 interruptsParagraph;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParagraphMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, Function2 function2) {
        super(blockContent, commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        function2.getClass();
        this.interruptsParagraph = function2;
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
        if (i != -1) {
            return MarkerBlock$ProcessingResult.CANCEL;
        }
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        CommonMarkdownConstraints commonMarkdownConstraints2 = this.constraints;
        commonMarkdownConstraints2.getClass();
        if (i != -1) {
            throw new MarkdownParsingException("");
        }
        InterceptedRenderContext$send$1 interceptedRenderContext$send$1 = new InterceptedRenderContext$send$1(commonMarkdownConstraints2, 10);
        LookaheadText$Position lookaheadText$Position2 = lookaheadText$Position;
        int i2 = 1;
        while (((Boolean) interceptedRenderContext$send$1.invoke(lookaheadText$Position2)).booleanValue() && (lookaheadText$Position2 = lookaheadText$Position2.nextLinePosition()) != null && (i2 = i2 + 1) <= 4) {
        }
        if (i2 >= 2) {
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        CommonMarkdownConstraints applyToNextLineAndAddModifiers = ParseSvg_androidKt.applyToNextLineAndAddModifiers(lookaheadText$Position, commonMarkdownConstraints2);
        if (!ParseSvg_androidKt.upstreamWith(applyToNextLineAndAddModifiers, commonMarkdownConstraints2)) {
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        LookaheadText$Position nextPosition = lookaheadText$Position.nextPosition(ParseSvg_androidKt.getCharsEaten(applyToNextLineAndAddModifiers, lookaheadText$Position.currentLine) + 1);
        return (nextPosition == null || ((Boolean) this.interruptsParagraph.invoke(nextPosition, applyToNextLineAndAddModifiers)).booleanValue()) ? MarkerBlock$ProcessingResult.DEFAULT : MarkerBlock$ProcessingResult.CANCEL;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return MarkdownTokenTypes.PARAGRAPH;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return true;
    }
}
