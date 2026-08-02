package org.intellij.markdown.parser.markerblocks.providers;

import coil3.svg.internal.ParseSvg_androidKt;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.MarkerProcessor$StateInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.ParagraphMarkerBlock;
import org.intellij.markdown.parser.markerblocks.impl.SetextHeaderMarkerBlock;

/* loaded from: classes10.dex */
public final class SetextHeaderProvider implements MarkerBlockProvider {
    public static final Regex REGEX = new Regex("^ {0,3}(-+|=+) *$");

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final List createMarkerBlocks(LookaheadText$Position lookaheadText$Position, BlockContent blockContent, MarkerProcessor$StateInfo markerProcessor$StateInfo) {
        CharSequence charSequence;
        Object obj;
        markerProcessor$StateInfo.getClass();
        Iterator it = markerProcessor$StateInfo.markersStack.iterator();
        while (true) {
            charSequence = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MarkerBlockImpl) obj) instanceof ParagraphMarkerBlock) {
                break;
            }
        }
        if (((ParagraphMarkerBlock) obj) != null) {
            return EmptyList.INSTANCE;
        }
        CommonMarkdownConstraints commonMarkdownConstraints = markerProcessor$StateInfo.currentConstraints;
        if (!Intrinsics.areEqual(markerProcessor$StateInfo.nextConstraints, commonMarkdownConstraints)) {
            return EmptyList.INSTANCE;
        }
        commonMarkdownConstraints.getClass();
        if (lookaheadText$Position.localPos == ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, lookaheadText$Position.currentLine)) {
            int i = lookaheadText$Position.lineN + 1;
            List list = (List) lookaheadText$Position.this$0.plugins;
            String str = i < list.size() ? (String) list.get(i) : null;
            if (str != null) {
                CommonMarkdownConstraints applyToNextLine$1 = commonMarkdownConstraints.applyToNextLine$1(lookaheadText$Position.nextLinePosition());
                if (ParseSvg_androidKt.extendsPrev(applyToNextLine$1, commonMarkdownConstraints)) {
                    charSequence = ParseSvg_androidKt.eatItselfFromString(applyToNextLine$1, str);
                }
            }
            if (charSequence != null && REGEX.matches(charSequence)) {
                return CollectionsKt__CollectionsJVMKt.listOf(new SetextHeaderMarkerBlock(blockContent, commonMarkdownConstraints));
            }
        }
        return EmptyList.INSTANCE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final boolean interruptsParagraph(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        return false;
    }
}
