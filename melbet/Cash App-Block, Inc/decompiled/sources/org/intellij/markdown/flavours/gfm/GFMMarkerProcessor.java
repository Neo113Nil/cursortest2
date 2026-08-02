package org.intellij.markdown.flavours.gfm;

import androidx.glance.layout.SpacerKt$Spacer$3;
import coil3.svg.internal.ParseSvg_androidKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.IntRange;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.flavours.gfm.table.GitHubTableMarkerProvider;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.MarkerProcessor$StateInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.providers.CodeFenceProvider;
import org.intellij.markdown.parser.markerblocks.providers.HtmlBlockProvider;
import org.intellij.markdown.parser.markerblocks.providers.SetextHeaderProvider;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class GFMMarkerProcessor {
    public final EmptyList NO_BLOCKS;
    public final SpacerKt$Spacer$3 interruptsParagraph;
    public final ArrayList markerBlockProviders;
    public final List markerBlockProviders$1;
    public final ArrayList markersStack;
    public int nextInterestingPosForExistingMarkers;
    public final BlockContent productionHolder;
    public final CommonMarkdownConstraints startConstraints;
    public MarkerProcessor$StateInfo stateInfo;
    public CommonMarkdownConstraints topBlockConstraints;

    public GFMMarkerProcessor(BlockContent blockContent, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        commonMarkdownConstraints.getClass();
        this.productionHolder = blockContent;
        this.startConstraints = commonMarkdownConstraints;
        this.NO_BLOCKS = EmptyList.INSTANCE;
        ArrayList arrayList = new ArrayList();
        this.markersStack = arrayList;
        this.topBlockConstraints = commonMarkdownConstraints;
        this.nextInterestingPosForExistingMarkers = -1;
        this.interruptsParagraph = new SpacerKt$Spacer$3(this, 11);
        this.stateInfo = new MarkerProcessor$StateInfo(commonMarkdownConstraints, commonMarkdownConstraints, arrayList);
        this.markerBlockProviders$1 = CollectionsKt__CollectionsKt.listOf((Object[]) new MarkerBlockProvider[]{new GitHubTableMarkerProvider(3), new GitHubTableMarkerProvider(4), new CodeFenceProvider(), new SetextHeaderProvider(), new GitHubTableMarkerProvider(2), new GitHubTableMarkerProvider(6), new GitHubTableMarkerProvider(1), new HtmlBlockProvider(), new GitHubTableMarkerProvider(5)});
        this.markerBlockProviders = CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(new GitHubTableMarkerProvider(0)), (Collection) this.markerBlockProviders$1);
    }

    public final void closeChildren(int i, int i2) {
        if (i2 != 4) {
            ArrayList arrayList = this.markersStack;
            for (int size = arrayList.size() - 1; size > i; size--) {
                MarkerBlockImpl markerBlockImpl = (MarkerBlockImpl) arrayList.get(size);
                markerBlockImpl.getClass();
                if (i2 == 0) {
                    throw null;
                }
                int i3 = i2 == 3 ? 1 : i2;
                GMSSPrivateKey$$ExternalSyntheticOutline0._dispatch_doAction(i3, markerBlockImpl.marker, markerBlockImpl.getDefaultNodeType());
                if (i3 == 4) {
                    throw new MarkdownParsingException("If closing action is not NOTHING, marker should be gone");
                }
                arrayList.remove(size);
            }
            relaxTopConstraints();
        }
    }

    public final void populateConstraintsTokens$org$intellij$markdown$flavours$commonmark$CommonMarkMarkerProcessor(BlockContent blockContent, LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        if (commonMarkdownConstraints.getIndent() == 0) {
            return;
        }
        int i = lookaheadText$Position.globalPos;
        int min = Math.min(ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, lookaheadText$Position.currentLine) + (i - lookaheadText$Position.localPos), lookaheadText$Position.getNextLineOrEofOffset());
        Character lastOrNull = ArraysKt___ArraysKt.lastOrNull(commonMarkdownConstraints.types);
        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(i, min, 1), (lastOrNull != null && lastOrNull.charValue() == '>') ? MarkdownTokenTypes.BLOCK_QUOTE : ((lastOrNull != null && lastOrNull.charValue() == '.') || (lastOrNull != null && lastOrNull.charValue() == ')')) ? MarkdownTokenTypes.LIST_NUMBER : MarkdownTokenTypes.LIST_BULLET)));
    }

    public final void relaxTopConstraints() {
        ArrayList arrayList = this.markersStack;
        this.topBlockConstraints = arrayList.isEmpty() ? this.startConstraints : ((MarkerBlockImpl) CollectionsKt.last((List) arrayList)).constraints;
    }
}
