package org.intellij.markdown.flavours.gfm.table;

import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.appcompat.widget.AppCompatHintHelper;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.svg.internal.ParseSvg_androidKt;
import com.datadog.android.okhttp.TraceContext;
import com.squareup.cash.NavigationModule$Companion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import org.commonmark.internal.BlockContent;
import org.intellij.markdown.MarkdownElementType;
import org.intellij.markdown.MarkdownTokenTypes;
import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.MarkerProcessor$StateInfo;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;
import org.intellij.markdown.parser.markerblocks.MarkerBlockImpl;
import org.intellij.markdown.parser.markerblocks.MarkerBlockProvider;
import org.intellij.markdown.parser.markerblocks.impl.AtxHeaderMarkerBlock;
import org.intellij.markdown.parser.markerblocks.impl.CodeBlockMarkerBlock;
import org.intellij.markdown.parser.markerblocks.impl.LinkReferenceDefinitionMarkerBlock;
import org.intellij.markdown.parser.markerblocks.impl.ListItemMarkerBlock;
import org.intellij.markdown.parser.markerblocks.impl.ListMarkerBlock;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes10.dex */
public final class GitHubTableMarkerProvider implements MarkerBlockProvider {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ GitHubTableMarkerProvider(int i) {
        this.$r8$classId = i;
    }

    public static IntRange matches(LookaheadText$Position lookaheadText$Position) {
        int i = lookaheadText$Position.localPos;
        if (i == -1) {
            return null;
        }
        String substring = lookaheadText$Position.currentLine.substring(i);
        int i2 = 0;
        for (int i3 = 0; i3 < 3; i3++) {
            if (i2 < substring.length() && substring.charAt(i2) == ' ') {
                i2++;
            }
        }
        if (i2 >= substring.length() || substring.charAt(i2) != '#') {
            return null;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < 6; i5++) {
            if (i4 < substring.length() && substring.charAt(i4) == '#') {
                i4++;
            }
        }
        if (i4 >= substring.length() || CollectionsKt__CollectionsKt.listOf((Object[]) new Character[]{' ', '\t'}).contains(Character.valueOf(substring.charAt(i4)))) {
            return new IntRange(i2, i4 - 1, 1);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x022f, code lost:
    
        if (r7 == '(') goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x05c7  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0131  */
    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List createMarkerBlocks(LookaheadText$Position lookaheadText$Position, BlockContent blockContent, MarkerProcessor$StateInfo markerProcessor$StateInfo) {
        int i;
        CharSequence eatItselfFromString;
        int i2;
        Character lastOrNull;
        Integer charsToNonWhitespace;
        LookaheadText$Position nextPosition;
        int i3;
        IntRange intRange;
        int i4;
        int i5;
        int passOneNewline;
        int i6;
        IntRange intRange2;
        char charAt;
        int i7;
        char charAt2;
        int i8;
        char charAt3;
        IntRange intRange3;
        int i9;
        char charAt4;
        ArrayList<IntRange> arrayList;
        char charAt5;
        MarkdownElementType markdownElementType;
        Character lastOrNull2;
        char c = '>';
        int i10 = 1;
        switch (this.$r8$classId) {
            case 0:
                markerProcessor$StateInfo.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints = markerProcessor$StateInfo.currentConstraints;
                if (!Intrinsics.areEqual(markerProcessor$StateInfo.nextConstraints, commonMarkdownConstraints)) {
                    return EmptyList.INSTANCE;
                }
                String substring = lookaheadText$Position.currentLine.substring(lookaheadText$Position.localPos);
                if (!StringsKt.contains((CharSequence) substring, '|', false)) {
                    return EmptyList.INSTANCE;
                }
                ArrayList splitByPipes = PickVisualMediaRequestKt.splitByPipes(substring);
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(splitByPipes, 10));
                Iterator it = splitByPipes.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                        throw null;
                    }
                    arrayList2.add(Boolean.valueOf((i11 > 0 && i11 < splitByPipes.size() + (-1)) || !StringsKt.isBlank((String) next)));
                    i11 = i12;
                }
                if (arrayList2.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it2 = arrayList2.iterator();
                    i = 0;
                    while (it2.hasNext()) {
                        if (((Boolean) it2.next()).booleanValue() && (i = i + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                            throw null;
                        }
                    }
                }
                if (i == 0) {
                    return EmptyList.INSTANCE;
                }
                int i13 = lookaheadText$Position.lineN + 1;
                List list = (List) lookaheadText$Position.this$0.plugins;
                String str = i13 < list.size() ? (String) list.get(i13) : null;
                if (str != null) {
                    CommonMarkdownConstraints applyToNextLine$1 = commonMarkdownConstraints.applyToNextLine$1(lookaheadText$Position.nextLinePosition());
                    if (ParseSvg_androidKt.extendsPrev(applyToNextLine$1, commonMarkdownConstraints)) {
                        eatItselfFromString = ParseSvg_androidKt.eatItselfFromString(applyToNextLine$1, str);
                        if (eatItselfFromString != null) {
                            return EmptyList.INSTANCE;
                        }
                        int passWhiteSpaces = NavigationModule$Companion.passWhiteSpaces(0, eatItselfFromString);
                        if (passWhiteSpaces < eatItselfFromString.length() && eatItselfFromString.charAt(passWhiteSpaces) == '|') {
                            passWhiteSpaces++;
                        }
                        int i14 = passWhiteSpaces;
                        int i15 = 0;
                        while (i14 < eatItselfFromString.length()) {
                            int passWhiteSpaces2 = NavigationModule$Companion.passWhiteSpaces(i14, eatItselfFromString);
                            if (passWhiteSpaces2 < eatItselfFromString.length() && eatItselfFromString.charAt(passWhiteSpaces2) == ':') {
                                passWhiteSpaces2 = NavigationModule$Companion.passWhiteSpaces(passWhiteSpaces2 + 1, eatItselfFromString);
                            }
                            int i16 = passWhiteSpaces2;
                            int i17 = 0;
                            while (i16 < eatItselfFromString.length() && eatItselfFromString.charAt(i16) == '-') {
                                i16++;
                                i17++;
                            }
                            if (i17 < 1) {
                                i2 = 0;
                                return i2 != i ? CollectionsKt__CollectionsJVMKt.listOf(new GitHubTableMarkerBlock(lookaheadText$Position, commonMarkdownConstraints, blockContent, i)) : EmptyList.INSTANCE;
                            }
                            i15++;
                            i14 = NavigationModule$Companion.passWhiteSpaces(i16, eatItselfFromString);
                            if (i14 < eatItselfFromString.length() && eatItselfFromString.charAt(i14) == ':') {
                                i14 = NavigationModule$Companion.passWhiteSpaces(i14 + 1, eatItselfFromString);
                            }
                            if (i14 < eatItselfFromString.length() && eatItselfFromString.charAt(i14) == '|') {
                                i14 = NavigationModule$Companion.passWhiteSpaces(i14 + 1, eatItselfFromString);
                            }
                            if (i14 == eatItselfFromString.length()) {
                                i2 = i15;
                                if (i2 != i) {
                                }
                            }
                            i2 = 0;
                            if (i2 != i) {
                            }
                        }
                        if (i14 == eatItselfFromString.length()) {
                        }
                        i2 = 0;
                        if (i2 != i) {
                        }
                    }
                }
                eatItselfFromString = null;
                if (eatItselfFromString != null) {
                }
                break;
            case 1:
                markerProcessor$StateInfo.getClass();
                IntRange matches = matches(lookaheadText$Position);
                if (matches == null) {
                    return EmptyList.INSTANCE;
                }
                CommonMarkdownConstraints commonMarkdownConstraints2 = markerProcessor$StateInfo.currentConstraints;
                int i18 = matches.last;
                String substring2 = lookaheadText$Position.currentLine.substring(lookaheadText$Position.localPos);
                int i19 = lookaheadText$Position.globalPos;
                int length = substring2.length() - 1;
                while (length > i18 && CharsKt.isWhitespace(substring2.charAt(length))) {
                    length--;
                }
                while (length > i18 && substring2.charAt(length) == '#' && substring2.charAt(length - 1) != '\\') {
                    length--;
                }
                int i20 = length + 1;
                return CollectionsKt__CollectionsJVMKt.listOf(new AtxHeaderMarkerBlock(commonMarkdownConstraints2, blockContent, matches, (i20 < substring2.length() && CharsKt.isWhitespace(substring2.charAt(length)) && substring2.charAt(i20) == '#') ? i19 + length + 1 : i19 + substring2.length(), lookaheadText$Position.getNextLineOrEofOffset()));
            case 2:
                markerProcessor$StateInfo.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints3 = markerProcessor$StateInfo.currentConstraints;
                CommonMarkdownConstraints commonMarkdownConstraints4 = markerProcessor$StateInfo.nextConstraints;
                return lookaheadText$Position.localPos != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints3, lookaheadText$Position.currentLine) ? EmptyList.INSTANCE : (Intrinsics.areEqual(commonMarkdownConstraints4, commonMarkdownConstraints3) || (lastOrNull = ArraysKt___ArraysKt.lastOrNull(commonMarkdownConstraints4.types)) == null || lastOrNull.charValue() != '>') ? EmptyList.INSTANCE : CollectionsKt__CollectionsJVMKt.listOf(new ListItemMarkerBlock(commonMarkdownConstraints4, new BlockContent(blockContent), 1));
            case 3:
                markerProcessor$StateInfo.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints5 = markerProcessor$StateInfo.nextConstraints;
                CommonMarkdownConstraints commonMarkdownConstraints6 = markerProcessor$StateInfo.currentConstraints;
                if (ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints5, lookaheadText$Position.currentLine) <= lookaheadText$Position.localPos && (charsToNonWhitespace = lookaheadText$Position.charsToNonWhitespace()) != null && (nextPosition = lookaheadText$Position.nextPosition(charsToNonWhitespace.intValue())) != null) {
                    String str2 = nextPosition.currentLine;
                    commonMarkdownConstraints6.getClass();
                    int charsEaten = ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints6, str2);
                    int i21 = nextPosition.localPos;
                    if (i21 < charsEaten + 4) {
                        if (charsEaten <= i21) {
                            while (str2.charAt(charsEaten) != '\t') {
                                if (charsEaten != i21) {
                                    charsEaten++;
                                }
                            }
                        }
                        return EmptyList.INSTANCE;
                    }
                    return CollectionsKt__CollectionsJVMKt.listOf(new CodeBlockMarkerBlock(blockContent, lookaheadText$Position, commonMarkdownConstraints6));
                }
                return EmptyList.INSTANCE;
            case 4:
                markerProcessor$StateInfo.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints7 = markerProcessor$StateInfo.currentConstraints;
                if (!matches(lookaheadText$Position, commonMarkdownConstraints7)) {
                    return EmptyList.INSTANCE;
                }
                BlockContent blockContent2 = new BlockContent(blockContent);
                commonMarkdownConstraints7.getClass();
                return CollectionsKt__CollectionsJVMKt.listOf(new ListItemMarkerBlock(commonMarkdownConstraints7, blockContent2, 2));
            case 5:
                markerProcessor$StateInfo.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints8 = markerProcessor$StateInfo.currentConstraints;
                int i22 = lookaheadText$Position.globalPos;
                commonMarkdownConstraints8.getClass();
                if (lookaheadText$Position.localPos != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints8, lookaheadText$Position.currentLine)) {
                    return EmptyList.INSTANCE;
                }
                CharSequence charSequence = (CharSequence) lookaheadText$Position.this$0.parser;
                charSequence.getClass();
                int i23 = i22;
                for (int i24 = 0; i24 < 3; i24++) {
                    if (i23 < charSequence.length() && charSequence.charAt(i23) == ' ') {
                        i23++;
                    }
                }
                if (i23 >= charSequence.length() || charSequence.charAt(i23) != '[') {
                    i3 = 2;
                } else {
                    int i25 = i23 + 1;
                    boolean z = false;
                    i3 = 2;
                    for (int i26 = 1; i26 < 1000; i26++) {
                        if (i25 < charSequence.length()) {
                            char charAt6 = charSequence.charAt(i25);
                            if (charAt6 != '[' && charAt6 != ']') {
                                if (charAt6 == '\\') {
                                    i25++;
                                    if (i25 < charSequence.length()) {
                                        charAt6 = charSequence.charAt(i25);
                                    }
                                }
                                if (!CharsKt.isWhitespace(charAt6)) {
                                    z = true;
                                }
                                i25++;
                            }
                            if (z && i25 < charSequence.length() && charSequence.charAt(i25) == ']') {
                                intRange = new IntRange(i23, i25, 1);
                                if (intRange != null && (i5 = (i4 = intRange.last) + 1) < charSequence.length() && charSequence.charAt(i5) == ':') {
                                    passOneNewline = TraceContext.passOneNewline(i4 + 2, charSequence);
                                    char c2 = ')';
                                    if (passOneNewline < charSequence.length()) {
                                        char c3 = '<';
                                        if (charSequence.charAt(passOneNewline) == '<') {
                                            int i27 = passOneNewline + 1;
                                            while (i27 < charSequence.length()) {
                                                char charAt7 = charSequence.charAt(i27);
                                                if (charAt7 == c) {
                                                    intRange2 = new IntRange(passOneNewline, i27, i10);
                                                    if (intRange2 != null) {
                                                        int passOneNewline2 = TraceContext.passOneNewline(intRange2.last + i10, charSequence);
                                                        if (passOneNewline2 < charSequence.length()) {
                                                            char charAt8 = charSequence.charAt(passOneNewline2);
                                                            char c4 = '\'';
                                                            if (charAt8 != '\'') {
                                                                c4 = '\"';
                                                                if (charAt8 != '\"') {
                                                                }
                                                            }
                                                            c2 = c4;
                                                            int i28 = passOneNewline2 + 1;
                                                            boolean z2 = false;
                                                            while (i28 < charSequence.length()) {
                                                                char charAt9 = charSequence.charAt(i28);
                                                                if (charAt9 == c2) {
                                                                    intRange3 = new IntRange(passOneNewline2, i28, 1);
                                                                    arrayList = new ArrayList();
                                                                    arrayList.add(intRange);
                                                                    arrayList.add(intRange2);
                                                                    if (intRange3 != null) {
                                                                        int i29 = intRange3.last;
                                                                        while (true) {
                                                                            i29++;
                                                                            if (i29 >= charSequence.length() || ((charAt5 = charSequence.charAt(i29)) != ' ' && charAt5 != '\t')) {
                                                                            }
                                                                        }
                                                                        if (i29 >= charSequence.length() || charSequence.charAt(i29) == '\n') {
                                                                            arrayList.add(intRange3);
                                                                        }
                                                                    }
                                                                    if (arrayList != null) {
                                                                        return EmptyList.INSTANCE;
                                                                    }
                                                                    int i30 = 0;
                                                                    for (IntRange intRange4 : arrayList) {
                                                                        int i31 = i30 + 1;
                                                                        intRange4.getClass();
                                                                        IntRange intRange5 = new IntRange(intRange4.first, intRange4.last + 1, 1);
                                                                        if (i30 == 0) {
                                                                            markdownElementType = MarkdownTokenTypes.LINK_LABEL;
                                                                        } else if (i30 == 1) {
                                                                            markdownElementType = MarkdownTokenTypes.LINK_DESTINATION;
                                                                        } else {
                                                                            if (i30 != i3) {
                                                                                a$$ExternalSyntheticBUOutline0.m$1((Object) "There are no more than three groups in this regex");
                                                                                return null;
                                                                            }
                                                                            markdownElementType = MarkdownTokenTypes.LINK_TITLE$1;
                                                                        }
                                                                        blockContent.addProduction(CollectionsKt__CollectionsJVMKt.listOf(new SequentialParser.Node(intRange5, markdownElementType)));
                                                                        i30 = i31;
                                                                        i3 = 2;
                                                                    }
                                                                    int i32 = (((IntRange) CollectionsKt.last((List) arrayList)).last - i22) + 1;
                                                                    LookaheadText$Position nextPosition2 = lookaheadText$Position.nextPosition(i32);
                                                                    return (nextPosition2 == null || nextPosition2.localPos == -1 || nextPosition2.charsToNonWhitespace() == null) ? CollectionsKt__CollectionsJVMKt.listOf(new LinkReferenceDefinitionMarkerBlock(commonMarkdownConstraints8, new BlockContent(blockContent), i22 + i32)) : EmptyList.INSTANCE;
                                                                }
                                                                if (charAt9 == '\n') {
                                                                    if (!z2) {
                                                                        z2 = true;
                                                                    }
                                                                } else if (charAt9 != ' ' && charAt9 != '\t') {
                                                                    z2 = false;
                                                                }
                                                                if (charAt9 == '\\' && (i9 = i28 + 1) < charSequence.length() && (charAt4 = charSequence.charAt(i9)) != ' ' && charAt4 != '\t' && charAt4 != '\n') {
                                                                    i28 = i9;
                                                                }
                                                                i28++;
                                                            }
                                                            intRange3 = null;
                                                            arrayList = new ArrayList();
                                                            arrayList.add(intRange);
                                                            arrayList.add(intRange2);
                                                            if (intRange3 != null) {
                                                            }
                                                            if (arrayList != null) {
                                                            }
                                                        }
                                                        intRange3 = null;
                                                        arrayList = new ArrayList();
                                                        arrayList.add(intRange);
                                                        arrayList.add(intRange2);
                                                        if (intRange3 != null) {
                                                        }
                                                        if (arrayList != null) {
                                                        }
                                                    }
                                                } else if (charAt7 == c3 || charAt7 == c || charAt7 == ' ' || charAt7 == '\t' || charAt7 == '\n') {
                                                    i6 = i10;
                                                    intRange2 = null;
                                                    i10 = i6;
                                                    if (intRange2 != null) {
                                                    }
                                                } else {
                                                    if (charAt7 == '\\') {
                                                        int i33 = i27 + 1;
                                                        i8 = i10;
                                                        if (i33 < charSequence.length() && (charAt3 = charSequence.charAt(i33)) != ' ' && charAt3 != '\t' && charAt3 != '\n') {
                                                            i27 = i33;
                                                        }
                                                    } else {
                                                        i8 = i10;
                                                    }
                                                    i27++;
                                                    i10 = i8;
                                                    c = '>';
                                                    c3 = '<';
                                                }
                                            }
                                        } else {
                                            i6 = 1;
                                            int i34 = passOneNewline;
                                            boolean z3 = false;
                                            while (i34 < charSequence.length() && (charAt = charSequence.charAt(i34)) != ' ' && charAt != '\t' && charAt != '\n' && charAt > 27) {
                                                if (charAt != '(') {
                                                    if (charAt == ')') {
                                                        if (!z3) {
                                                            break;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                    } else if (charAt == '\\' && (i7 = i34 + 1) < charSequence.length() && (charAt2 = charSequence.charAt(i7)) != ' ' && charAt2 != '\t' && charAt2 != '\n') {
                                                        i34 = i7;
                                                    }
                                                    i34++;
                                                } else if (z3) {
                                                    break;
                                                } else {
                                                    z3 = true;
                                                    i34++;
                                                }
                                            }
                                            i10 = 1;
                                            intRange2 = new IntRange(passOneNewline, i34 - 1, 1);
                                            if (intRange2 != null) {
                                            }
                                        }
                                    }
                                    intRange2 = null;
                                    if (intRange2 != null) {
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                }
                            }
                        }
                    }
                    if (z) {
                        intRange = new IntRange(i23, i25, 1);
                        if (intRange != null) {
                            passOneNewline = TraceContext.passOneNewline(i4 + 2, charSequence);
                            char c22 = ')';
                            if (passOneNewline < charSequence.length()) {
                            }
                            intRange2 = null;
                            if (intRange2 != null) {
                            }
                        }
                        arrayList = null;
                        if (arrayList != null) {
                        }
                    }
                }
                intRange = null;
                if (intRange != null) {
                }
                arrayList = null;
                if (arrayList != null) {
                }
                break;
            default:
                markerProcessor$StateInfo.getClass();
                CommonMarkdownConstraints commonMarkdownConstraints9 = markerProcessor$StateInfo.currentConstraints;
                CommonMarkdownConstraints commonMarkdownConstraints10 = markerProcessor$StateInfo.nextConstraints;
                commonMarkdownConstraints9.getClass();
                if (lookaheadText$Position.localPos != ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints9, lookaheadText$Position.currentLine)) {
                    return EmptyList.INSTANCE;
                }
                if (!Intrinsics.areEqual(commonMarkdownConstraints10, commonMarkdownConstraints9) && ((lastOrNull2 = ArraysKt___ArraysKt.lastOrNull(commonMarkdownConstraints10.types)) == null || lastOrNull2.charValue() != '>')) {
                    boolean[] zArr = commonMarkdownConstraints10.isExplicit;
                    if (Intrinsics.areEqual(zArr.length == 0 ? null : Boolean.valueOf(zArr[zArr.length - 1]), Boolean.TRUE)) {
                        ArrayList arrayList3 = new ArrayList();
                        if (!(((MarkerBlockImpl) CollectionsKt.lastOrNull(markerProcessor$StateInfo.markersStack)) instanceof ListMarkerBlock)) {
                            BlockContent blockContent3 = new BlockContent(blockContent);
                            Character lastOrNull3 = ArraysKt___ArraysKt.lastOrNull(commonMarkdownConstraints10.types);
                            lastOrNull3.getClass();
                            arrayList3.add(new ListMarkerBlock(commonMarkdownConstraints10, blockContent3, lastOrNull3.charValue()));
                        }
                        arrayList3.add(new ListItemMarkerBlock(commonMarkdownConstraints10, new BlockContent(blockContent), 0));
                        return arrayList3;
                    }
                }
                return EmptyList.INSTANCE;
        }
    }

    @Override // org.intellij.markdown.parser.markerblocks.MarkerBlockProvider
    public final boolean interruptsParagraph(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        int i = this.$r8$classId;
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        switch (i) {
            case 0:
                return false;
            case 1:
                return matches(lookaheadText$Position) != null;
            case 2:
            case 3:
                return false;
            case 4:
                return matches(lookaheadText$Position, commonMarkdownConstraints);
            case 5:
            default:
                return false;
        }
    }

    public static boolean matches(LookaheadText$Position lookaheadText$Position, CommonMarkdownConstraints commonMarkdownConstraints) {
        lookaheadText$Position.getClass();
        commonMarkdownConstraints.getClass();
        int i = lookaheadText$Position.localPos;
        String str = lookaheadText$Position.currentLine;
        if (i == ParseSvg_androidKt.getCharsEaten(commonMarkdownConstraints, str)) {
            return AppCompatHintHelper.isHorizontalRule(i, str);
        }
        return false;
    }
}
