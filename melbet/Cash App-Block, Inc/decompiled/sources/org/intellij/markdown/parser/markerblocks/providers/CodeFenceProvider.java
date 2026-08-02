package org.intellij.markdown.parser.markerblocks.providers;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import coil3.svg.internal.ParseSvg_androidKt;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.IntRange;
import kotlin.text.MatchGroup;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.Regex;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.MarkerProcessor$StateInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.CodeFenceMarkerBlock;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class CodeFenceProvider implements MarkerBlockProvider {
    public static final Regex REGEX = new Regex("^ {0,3}(~~~+|```+)([^`]*)$");

    public final class OpeningInfo {
        public final String delimiter;
        public final String info;

        public OpeningInfo(String str, String str2) {
            this.delimiter = str;
            this.info = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpeningInfo)) {
                return false;
            }
            OpeningInfo openingInfo = (OpeningInfo) obj;
            return this.delimiter.equals(openingInfo.delimiter) && this.info.equals(openingInfo.info);
        }

        public final int hashCode() {
            return this.info.hashCode() + (this.delimiter.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpeningInfo(delimiter=");
            sb.append(this.delimiter);
            sb.append(", info=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.info, ')');
        }
    }

    public static OpeningInfo obtainFenceOpeningInfo(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        MatcherMatchResult find;
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        int i = lookaheadText$Position.localPos;
        String str = lookaheadText$Position.currentLine;
        if (i != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, str) || (find = REGEX.find(str.substring(i))) == null) {
            return null;
        }
        MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = find.groups;
        MatchGroup matchGroup = matcherMatchResult$groups$1.get(1);
        String str2 = matchGroup != null ? matchGroup.value : null;
        str2.getClass();
        MatchGroup matchGroup2 = matcherMatchResult$groups$1.get(2);
        String str3 = matchGroup2 != null ? matchGroup2.value : null;
        str3.getClass();
        return new OpeningInfo(str2, str3);
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final List createMarkerBlocks(LookaheadText$Position lookaheadText$Position, BlockContent blockContent, MarkerProcessor$StateInfo markerProcessor$StateInfo) {
        markerProcessor$StateInfo.getClass();
        CommonMarkdownConstraints commonMarkdownConstraints = markerProcessor$StateInfo.currentConstraints;
        OpeningInfo obtainFenceOpeningInfo = obtainFenceOpeningInfo(lookaheadText$Position, commonMarkdownConstraints);
        if (obtainFenceOpeningInfo == null) {
            return EmptyList.INSTANCE;
        }
        String str = obtainFenceOpeningInfo.info;
        int nextLineOrEofOffset = lookaheadText$Position.getNextLineOrEofOffset() - str.length();
        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(lookaheadText$Position.globalPos, nextLineOrEofOffset, 1), MarkdownTokenTypes.CODE_FENCE_START)));
        if (str.length() > 0) {
            blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(new IntRange(nextLineOrEofOffset, lookaheadText$Position.getNextLineOrEofOffset(), 1), MarkdownTokenTypes.FENCE_LANG)));
        }
        return CollectionsKt__CollectionsJVMKt.listOf(new CodeFenceMarkerBlock(commonMarkdownConstraints, blockContent, obtainFenceOpeningInfo.delimiter));
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final boolean interruptsParagraph(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        return obtainFenceOpeningInfo(lookaheadText$Position, commonMarkdownConstraints) != null;
    }
}
