package org.intellij.markdown.flavours.gfm;

import org.intellij.markdown.parser.LookaheadText$Position;
import org.intellij.markdown.parser.constraints.CommonMarkdownConstraints;

/* loaded from: classes10.dex */
public final class GFMConstraints extends CommonMarkdownConstraints {
    public static final GFMConstraints BASE = new GFMConstraints(new int[0], new char[0], new boolean[0], 0, false);
    public final boolean isCheckbox;

    public GFMConstraints(int[] iArr, char[] cArr, boolean[] zArr, int i, boolean z) {
        super(iArr, cArr, zArr, i);
        this.isCheckbox = z;
    }

    @Override // org.intellij.markdown.parser.constraints.CommonMarkdownConstraints
    public final CommonMarkdownConstraints createNewConstraints(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        char c = cArr[cArr.length - 1];
        char c2 = c < 128 ? c : (char) (c - 'd');
        cArr[cArr.length - 1] = c2;
        return new GFMConstraints(iArr, cArr, zArr, i, c != c2);
    }

    @Override // org.intellij.markdown.parser.constraints.CommonMarkdownConstraints
    public final CommonMarkdownConstraints.ListMarkerInfo fetchListMarker(LookaheadText$Position lookaheadText$Position) {
        CommonMarkdownConstraints.ListMarkerInfo fetchListMarker = super.fetchListMarker(lookaheadText$Position);
        int i = lookaheadText$Position.localPos;
        if (fetchListMarker == null) {
            return null;
        }
        int i2 = fetchListMarker.markerLength;
        String str = lookaheadText$Position.currentLine;
        int i3 = i + i2;
        while (i3 < str.length() && (str.charAt(i3) == ' ' || str.charAt(i3) == '\t')) {
            i3++;
        }
        int i4 = i3 + 3;
        if (i4 <= str.length() && str.charAt(i3) == '[' && str.charAt(i3 + 2) == ']') {
            int i5 = i3 + 1;
            if (str.charAt(i5) == 'x' || str.charAt(i5) == 'X' || str.charAt(i5) == ' ') {
                return new CommonMarkdownConstraints.ListMarkerInfo((char) (fetchListMarker.markerType + 'd'), i4 - i, i2);
            }
        }
        return fetchListMarker;
    }

    @Override // org.intellij.markdown.parser.constraints.CommonMarkdownConstraints
    public final CommonMarkdownConstraints getBase() {
        return BASE;
    }
}
