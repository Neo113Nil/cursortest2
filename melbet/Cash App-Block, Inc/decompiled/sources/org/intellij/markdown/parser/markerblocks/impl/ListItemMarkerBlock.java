package org.intellij.markdown.parser.markerblocks.impl;

import androidx.appcompat.app.LocaleOverlayHelper;
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
public final class ListItemMarkerBlock extends MarkerBlockImpl {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ListItemMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, int i) {
        super(blockContent, commonMarkdownConstraints);
        this.$r8$classId = i;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean allowsSubBlocks() {
        switch (this.$r8$classId) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final int calcNextInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        switch (this.$r8$classId) {
            case 0:
                Integer nextLineOffset = lookaheadText$Position.getNextLineOffset();
                if (nextLineOffset != null) {
                    return nextLineOffset.intValue();
                }
                return -1;
            case 1:
                Integer nextLineOffset2 = lookaheadText$Position.getNextLineOffset();
                if (nextLineOffset2 != null) {
                    return nextLineOffset2.intValue();
                }
                return -1;
            default:
                return lookaheadText$Position.getNextLineOrEofOffset();
        }
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkerBlock$ProcessingResult doProcessToken(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        LookaheadText$Position firstNonWhitespaceLinePos;
        int i = this.$r8$classId;
        CommonMarkdownConstraints commonMarkdownConstraints2 = this.constraints;
        commonMarkdownConstraints.getClass();
        switch (i) {
            case 0:
                if (lookaheadText$Position.localPos != -1) {
                    throw new MarkdownParsingException("");
                }
                int calcNumberOfConsequentEols = LocaleOverlayHelper.calcNumberOfConsequentEols(lookaheadText$Position, commonMarkdownConstraints2);
                if (calcNumberOfConsequentEols < 3 && (firstNonWhitespaceLinePos = LocaleOverlayHelper.getFirstNonWhitespaceLinePos(lookaheadText$Position, calcNumberOfConsequentEols)) != null && ParseSvg_androidKt.extendsPrev(ParseSvg_androidKt.applyToNextLineAndAddModifiers(firstNonWhitespaceLinePos, commonMarkdownConstraints2), commonMarkdownConstraints2)) {
                    return MarkerBlock$ProcessingResult.CANCEL;
                }
                return MarkerBlock$ProcessingResult.DEFAULT;
            case 1:
                if (lookaheadText$Position.localPos == -1) {
                    return !ParseSvg_androidKt.extendsPrev(ParseSvg_androidKt.applyToNextLineAndAddModifiers(lookaheadText$Position, commonMarkdownConstraints2), commonMarkdownConstraints2) ? MarkerBlock$ProcessingResult.DEFAULT : MarkerBlock$ProcessingResult.PASS;
                }
                throw new MarkdownParsingException("");
            default:
                return lookaheadText$Position.localPos != -1 ? MarkerBlock$ProcessingResult.CANCEL : MarkerBlock$ProcessingResult.DEFAULT;
        }
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        switch (this.$r8$classId) {
            case 0:
                return MarkdownTokenTypes.LIST_ITEM;
            case 1:
                return MarkdownTokenTypes.BLOCK_QUOTE$1;
            default:
                return MarkdownTokenTypes.HORIZONTAL_RULE;
        }
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        switch (this.$r8$classId) {
            case 0:
                if (lookaheadText$Position.localPos == -1) {
                    break;
                }
                break;
            case 1:
                if (lookaheadText$Position.localPos == -1) {
                    break;
                }
                break;
            default:
                if (lookaheadText$Position.localPos == -1) {
                    break;
                }
                break;
        }
        return true;
    }
}
