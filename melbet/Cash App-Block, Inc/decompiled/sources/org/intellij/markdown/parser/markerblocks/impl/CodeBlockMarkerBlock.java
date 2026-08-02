package org.intellij.markdown.parser.markerblocks.impl;

import coil3.svg.internal.ParseSvg_androidKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.ranges.IntRange;
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
public final class CodeBlockMarkerBlock extends MarkerBlockImpl {
    public final BlockContent productionHolder;
    public int realInterestingOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CodeBlockMarkerBlock(BlockContent blockContent, LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        super(new BlockContent(blockContent), commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.productionHolder = blockContent;
        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(lookaheadText$Position.globalPos, lookaheadText$Position.getNextLineOrEofOffset(), 1), MarkdownTokenTypes.CODE_LINE)));
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
        if (i2 >= this.realInterestingOffset && (i = lookaheadText$Position.localPos) == -1) {
            if (i != -1) {
                throw new MarkdownParsingException("");
            }
            CommonMarkdownConstraints commonMarkdownConstraints2 = this.constraints;
            commonMarkdownConstraints2.getClass();
            LookaheadText$Position lookaheadText$Position2 = lookaheadText$Position;
            loop0: do {
                CommonMarkdownConstraints applyToNextLineAndAddModifiers = ParseSvg_androidKt.applyToNextLineAndAddModifiers(lookaheadText$Position2, commonMarkdownConstraints2);
                if (!ParseSvg_androidKt.upstreamWith(applyToNextLineAndAddModifiers, commonMarkdownConstraints2) || !ParseSvg_androidKt.extendsPrev(applyToNextLineAndAddModifiers, commonMarkdownConstraints2)) {
                    break;
                }
                CharSequence eatItselfFromString = ParseSvg_androidKt.eatItselfFromString(applyToNextLineAndAddModifiers, lookaheadText$Position2.currentLine);
                eatItselfFromString.getClass();
                for (int i3 = 0; i3 < eatItselfFromString.length(); i3++) {
                    char charAt = eatItselfFromString.charAt(i3);
                    if (charAt != ' ' && charAt != '\t') {
                        break loop0;
                    }
                }
                lookaheadText$Position2 = lookaheadText$Position2.nextLinePosition();
            } while (lookaheadText$Position2 != null);
            lookaheadText$Position2 = null;
            if (lookaheadText$Position2 == null) {
                return MarkerBlock$ProcessingResult.DEFAULT;
            }
            CommonMarkdownConstraints applyToNextLineAndAddModifiers2 = ParseSvg_androidKt.applyToNextLineAndAddModifiers(lookaheadText$Position2, commonMarkdownConstraints2);
            LookaheadText$Position nextPosition = lookaheadText$Position2.nextPosition(ParseSvg_androidKt.getCharsEaten(applyToNextLineAndAddModifiers2, lookaheadText$Position2.currentLine) + 1);
            if (nextPosition != null) {
                Integer charsToNonWhitespace = nextPosition.charsToNonWhitespace();
                LookaheadText$Position nextPosition2 = nextPosition.nextPosition(charsToNonWhitespace != null ? charsToNonWhitespace.intValue() : 0);
                if (nextPosition2 != null) {
                    String str = nextPosition2.currentLine;
                    int charsEaten = ParseSvg_androidKt.getCharsEaten(applyToNextLineAndAddModifiers2, str);
                    int i4 = nextPosition2.localPos;
                    if (i4 < charsEaten + 4) {
                        if (charsEaten <= i4) {
                            while (str.charAt(charsEaten) != '\t') {
                                if (charsEaten != i4) {
                                    charsEaten++;
                                }
                            }
                        }
                        return MarkerBlock$ProcessingResult.DEFAULT;
                    }
                    int charsEaten2 = ParseSvg_androidKt.getCharsEaten(ParseSvg_androidKt.applyToNextLineAndAddModifiers(lookaheadText$Position, commonMarkdownConstraints2), lookaheadText$Position.currentLine) + i2 + 1;
                    IntRange intRange = new IntRange(charsEaten2, lookaheadText$Position.getNextLineOrEofOffset(), 1);
                    if (intRange.last - charsEaten2 > 0) {
                        this.productionHolder.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(intRange, MarkdownTokenTypes.CODE_LINE)));
                    }
                    this.realInterestingOffset = lookaheadText$Position.getNextLineOrEofOffset();
                    return MarkerBlock$ProcessingResult.CANCEL;
                }
            }
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        return MarkerBlock$ProcessingResult.CANCEL;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return MarkdownTokenTypes.CODE_BLOCK;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return true;
    }
}
