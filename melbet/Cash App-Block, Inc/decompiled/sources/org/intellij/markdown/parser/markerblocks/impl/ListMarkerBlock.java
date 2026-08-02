package org.intellij.markdown.parser.markerblocks.impl;

import androidx.appcompat.app.LocaleOverlayHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.ParseSvg_androidKt;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;

/* loaded from: classes10.dex */
public final class ListMarkerBlock extends MarkerBlockImpl {
    public final char listType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, char c) {
        super(blockContent, commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.listType = c;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean allowsSubBlocks() {
        return true;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final int calcNextInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        Integer nextLineOffset = lookaheadText$Position.getNextLineOffset();
        if (nextLineOffset != null) {
            return nextLineOffset.intValue();
        }
        return -1;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkerBlock$ProcessingResult doProcessToken(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        LookaheadText$Position firstNonWhitespaceLinePos;
        commonMarkdownConstraints.getClass();
        if (lookaheadText$Position.localPos != -1) {
            throw new MarkdownParsingException("");
        }
        CommonMarkdownConstraints commonMarkdownConstraints2 = this.constraints;
        int calcNumberOfConsequentEols = LocaleOverlayHelper.calcNumberOfConsequentEols(lookaheadText$Position, commonMarkdownConstraints2);
        if (calcNumberOfConsequentEols < 3 && (firstNonWhitespaceLinePos = LocaleOverlayHelper.getFirstNonWhitespaceLinePos(lookaheadText$Position, calcNumberOfConsequentEols)) != null) {
            CommonMarkdownConstraints applyToNextLineAndAddModifiers = ParseSvg_androidKt.applyToNextLineAndAddModifiers(firstNonWhitespaceLinePos, commonMarkdownConstraints2);
            char[] cArr = commonMarkdownConstraints2.types;
            if (cArr.length != 0) {
                return (!applyToNextLineAndAddModifiers.startsWith(commonMarkdownConstraints2) || applyToNextLineAndAddModifiers.containsListMarkers(cArr.length + (-1))) ? MarkerBlock$ProcessingResult.DEFAULT : MarkerBlock$ProcessingResult.PASS;
            }
            a$$ExternalSyntheticBUOutline0.m$3("List constraints should contain at least one item");
            return null;
        }
        return MarkerBlock$ProcessingResult.DEFAULT;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        char c = this.listType;
        return (c == '-' || c == '*' || c == '+') ? MarkdownTokenTypes.UNORDERED_LIST : MarkdownTokenTypes.ORDERED_LIST;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return lookaheadText$Position.localPos == -1;
    }
}
