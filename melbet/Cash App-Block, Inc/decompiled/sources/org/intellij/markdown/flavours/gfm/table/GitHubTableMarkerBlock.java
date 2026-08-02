package org.intellij.markdown.flavours.gfm.table;

import androidx.activity.result.PickVisualMediaRequestKt;
import coil3.svg.internal.ParseSvg_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.flavours.gfm.GFMElementTypes;
import org.intellij.markdown.flavours.gfm.GFMTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlock$ProcessingResult;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class GitHubTableMarkerBlock extends MarkerBlockImpl {
    public int currentLine;
    public final BlockContent productionHolder;
    public final int tableColumnsNumber;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GitHubTableMarkerBlock(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints, BlockContent blockContent, int i) {
        super(new BlockContent(blockContent), commonMarkdownConstraints);
        commonMarkdownConstraints.getClass();
        this.productionHolder = blockContent;
        this.tableColumnsNumber = i;
        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(lookaheadText$Position.globalPos, lookaheadText$Position.getNextLineOrEofOffset(), 1), GFMElementTypes.HEADER)));
        ((ArrayList) blockContent.sb).addAll(fillCells(lookaheadText$Position));
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
        int i = this.currentLine + 1;
        this.currentLine = i;
        BlockContent blockContent = this.productionHolder;
        if (i == 1) {
            blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(lookaheadText$Position.globalPos + 1, lookaheadText$Position.getNextLineOrEofOffset(), 1), GFMTokenTypes.TABLE_SEPARATOR)));
            return MarkerBlock$ProcessingResult.CANCEL;
        }
        if (!StringsKt.contains((CharSequence) lookaheadText$Position.currentLine, '|', false)) {
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        ArrayList fillCells = fillCells(lookaheadText$Position);
        if (fillCells.isEmpty()) {
            return MarkerBlock$ProcessingResult.DEFAULT;
        }
        ArrayList plus = CollectionsKt.plus((Iterable) fillCells, (Collection) CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(((SequentialParser.Node) CollectionsKt.first((List) fillCells)).range.first, ((SequentialParser.Node) CollectionsKt.last((List) fillCells)).range.last, 1), GFMElementTypes.ROW)));
        blockContent.getClass();
        ((ArrayList) blockContent.sb).addAll(plus);
        return MarkerBlock$ProcessingResult.CANCEL;
    }

    public final ArrayList fillCells(LookaheadText$Position lookaheadText$Position) {
        ArrayList arrayList = new ArrayList();
        int i = lookaheadText$Position.globalPos;
        String str = lookaheadText$Position.currentLine;
        int i2 = lookaheadText$Position.localPos;
        CommonMarkdownConstraints commonMarkdownConstraints = this.constraints;
        if (i2 == -1) {
            i += ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, str) + 1;
        }
        ArrayList splitByPipes = PickVisualMediaRequestKt.splitByPipes(ParseSvg_androidKt.eatItselfFromString(commonMarkdownConstraints, str));
        int size = splitByPipes.size();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            String str2 = (String) splitByPipes.get(i3);
            if (!StringsKt.isBlank(str2) || (1 <= i3 && i3 <= splitByPipes.size() - 2)) {
                arrayList.add(new SequentialParser.Node(new IntRange(i, str2.length() + i, 1), GFMTokenTypes.CELL));
                i4++;
            }
            int length = str2.length() + i;
            if (i3 < splitByPipes.size() - 1) {
                arrayList.add(new SequentialParser.Node(new IntRange(length, length + 1, 1), GFMTokenTypes.TABLE_SEPARATOR));
            }
            i = length + 1;
            if (i4 < this.tableColumnsNumber) {
                i3++;
            } else if (i < lookaheadText$Position.getNextLineOrEofOffset()) {
                arrayList.add(new SequentialParser.Node(new IntRange(i, lookaheadText$Position.getNextLineOrEofOffset(), 1), GFMTokenTypes.TABLE_SEPARATOR));
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final MarkdownElementType getDefaultNodeType() {
        return GFMElementTypes.TABLE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockImpl
    public final boolean isInterestingOffset(LookaheadText$Position lookaheadText$Position) {
        return lookaheadText$Position.localPos == -1;
    }
}
