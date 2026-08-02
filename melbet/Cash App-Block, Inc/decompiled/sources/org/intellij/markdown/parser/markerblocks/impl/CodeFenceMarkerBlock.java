package org.intellij.markdown.parser.markerblocks.impl;

import coil3.svg.internal.ParseSvg_androidKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
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
public final class CodeFenceMarkerBlock extends MarkerBlockImpl {
    public final Regex endLineRegex;
    public final BlockContent productionHolder;
    public int realInterestingOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeFenceMarkerBlock(CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, String str) {
        super(new BlockContent(blockContent), commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.productionHolder = blockContent;
        this.endLineRegex = new Regex(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("^ {0,3}", str, "+ *$"));
        this.realInterestingOffset = -1;
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
        int i;
        commonMarkdownConstraints.getClass();
        int i2 = lookaheadText$Position.globalPos;
        String str = lookaheadText$Position.currentLine;
        if (i2 >= this.realInterestingOffset && (i = lookaheadText$Position.localPos) == -1) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            CommonMarkdownConstraints commonMarkdownConstraints2 = this.constraints;
            CommonMarkdownConstraints applyToNextLineAndAddModifiers = ParseSvg_androidKt.applyToNextLineAndAddModifiers(lookaheadText$Position, commonMarkdownConstraints2);
            if (!ParseSvg_androidKt.extendsPrev(applyToNextLineAndAddModifiers, commonMarkdownConstraints2)) {
                return MarkerBlock$ProcessingResult.DEFAULT;
            }
            int nextLineOrEofOffset = lookaheadText$Position.getNextLineOrEofOffset();
            this.realInterestingOffset = nextLineOrEofOffset;
            boolean matches = this.endLineRegex.matches(ParseSvg_androidKt.eatItselfFromString(applyToNextLineAndAddModifiers, str));
            BlockContent blockContent = this.productionHolder;
            if (matches) {
                blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i2 + 1, lookaheadText$Position.getNextLineOrEofOffset(), 1), MarkdownTokenTypes.CODE_FENCE_END)));
                MarkerBlock$ProcessingResult markerBlock$ProcessingResult = MarkerBlock$ProcessingResult.DEFAULT;
                markerBlock$ProcessingResult.getClass();
                this.lastInterestingOffset = nextLineOrEofOffset;
                this.scheduledResult = markerBlock$ProcessingResult;
            } else {
                int min = Math.min(ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints2, str) + i2 + 1, nextLineOrEofOffset);
                IntRange intRange = new IntRange(min, nextLineOrEofOffset, 1);
                if (min < intRange.last) {
                    blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(intRange, MarkdownTokenTypes.CODE_FENCE_CONTENT)));
                }
            }
            return MarkerBlock$ProcessingResult.CANCEL;
        }
        return MarkerBlock$ProcessingResult.CANCEL;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return MarkdownTokenTypes.CODE_FENCE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return true;
    }
}
