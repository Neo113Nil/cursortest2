package org.intellij.markdown.parser.markerblocks.providers;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import coil3.svg.internal.ParseSvg_androidKt;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.text.MatcherMatchResult;
import kotlin.text.MatcherMatchResult$groups$1;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt__StringsJVMKt;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.MarkerProcessor$StateInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.HtmlBlockMarkerBlock;

/* loaded from: classes10.dex */
public final class HtmlBlockProvider implements MarkerBlockProvider {
    public static final Regex FIND_START_REGEX;
    public static final List OPEN_CLOSE_REGEXES;

    static {
        RegexOption regexOption = RegexOption.IGNORE_CASE;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Pair[]{new Pair(new Regex("<(?:script|pre|style)(?: |>|$)", regexOption), new Regex("</(?:script|style|pre)>", regexOption)), new Pair(new Regex("<!--"), new Regex("-->")), new Pair(new Regex("<\\?"), new Regex("\\?>")), new Pair(new Regex("<![A-Z]"), new Regex(">")), new Pair(new Regex("<!\\[CDATA\\["), new Regex("\\]\\]>")), new Pair(new Regex("</?(?:" + StringsKt__StringsJVMKt.replace$default("address, article, aside, base, basefont, blockquote, body, caption, center, col, colgroup, dd, details, dialog, dir, div, dl, dt, fieldset, figcaption, figure, footer, form, frame, frameset, h1, head, header, hr, html, legend, li, link, main, menu, menuitem, meta, nav, noframes, ol, optgroup, option, p, param, pre, section, source, title, summary, table, tbody, td, tfoot, th, thead, title, tr, track, ul", ", ", "|") + ")(?: |/?>|$)", regexOption), null), new Pair(new Regex("(?:<[a-zA-Z][a-zA-Z0-9-]*(?:\\s+[A-Za-z:_][A-Za-z0-9_.:-]*(?:\\s*=\\s*(?:[^ \"'=<>`]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[a-zA-Z][a-zA-Z0-9-]*\\s*>)(?: |$)"), null)});
        OPEN_CLOSE_REGEXES = listOf;
        FIND_START_REGEX = new Regex(CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("^("), CollectionsKt.joinToString$default(listOf, "|", null, null, 0, null, HtmlBlockProvider$Companion$FIND_START_REGEX$1.INSTANCE, 30), ')'));
    }

    public static int matches(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        int i = lookaheadText$Position.localPos;
        String str = lookaheadText$Position.currentLine;
        if (i != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, str)) {
            return -1;
        }
        String substring = str.substring(i);
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i2 < substring.length() && substring.charAt(i2) == ' ') {
                i2++;
            }
        }
        if (i2 >= substring.length() || substring.charAt(i2) != '<') {
            return -1;
        }
        MatcherMatchResult find = FIND_START_REGEX.find(substring.subSequence(i2, substring.length()).toString());
        if (find == null) {
            return -1;
        }
        MatcherMatchResult$groups$1 matcherMatchResult$groups$1 = find.groups;
        int size = matcherMatchResult$groups$1.getSize();
        List list = OPEN_CLOSE_REGEXES;
        if (size != list.size() + 2) {
            throw new MarkdownParsingException("There are some excess capturing groups probably!");
        }
        int size2 = list.size();
        for (int i4 = 0; i4 < size2; i4++) {
            if (matcherMatchResult$groups$1.get(i4 + 2) != null) {
                return i4;
            }
        }
        throw new MarkdownParsingException("Match found but all groups are empty!");
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final List createMarkerBlocks(LookaheadText$Position lookaheadText$Position, BlockContent blockContent, MarkerProcessor$StateInfo markerProcessor$StateInfo) {
        markerProcessor$StateInfo.getClass();
        CommonMarkdownConstraints commonMarkdownConstraints = markerProcessor$StateInfo.currentConstraints;
        int matches = matches(lookaheadText$Position, commonMarkdownConstraints);
        return matches != -1 ? CollectionsKt__CollectionsJVMKt.listOf(new HtmlBlockMarkerBlock(commonMarkdownConstraints, blockContent, (Regex) ((Pair) OPEN_CLOSE_REGEXES.get(matches)).second, lookaheadText$Position)) : EmptyList.INSTANCE;
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final boolean interruptsParagraph(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        int matches = matches(lookaheadText$Position, commonMarkdownConstraints);
        return matches >= 0 && matches < 6;
    }
}
