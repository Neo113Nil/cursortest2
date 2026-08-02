package org.intellij.markdown.parser.constraints;

import androidx.appcompat.widget.AppCompatHintHelper;
import androidx.compose.ui.focus.OneDimensionalFocusSearchKt$generateAndSearchChildren$1;
import androidx.glance.ImageKt$Image$finalModifier$1$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import io.noties.markwon.LinkResolverDef;
import java.util.Collection;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.parser.LookaheadText$Position;

/* loaded from: classes10.dex */
public class CommonMarkdownConstraints {
    public static final CommonMarkdownConstraints BASE = new CommonMarkdownConstraints(new int[0], new char[0], new boolean[0], 0);
    public final int charsEaten;
    public final int[] indents;
    public final boolean[] isExplicit;
    public final char[] types;

    public final class ListMarkerInfo {
        public final int markerIndent;
        public final int markerLength;
        public final char markerType;

        public ListMarkerInfo(char c, int i, int i2) {
            this.markerLength = i;
            this.markerType = c;
            this.markerIndent = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListMarkerInfo)) {
                return false;
            }
            ListMarkerInfo listMarkerInfo = (ListMarkerInfo) obj;
            return this.markerLength == listMarkerInfo.markerLength && this.markerType == listMarkerInfo.markerType && this.markerIndent == listMarkerInfo.markerIndent;
        }

        public final int hashCode() {
            return Integer.hashCode(this.markerIndent) + ((Character.hashCode(this.markerType) + (Integer.hashCode(this.markerLength) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ListMarkerInfo(markerLength=");
            sb.append(this.markerLength);
            sb.append(", markerType=");
            sb.append(this.markerType);
            sb.append(", markerIndent=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.markerIndent, ')');
        }
    }

    public CommonMarkdownConstraints(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        this.indents = iArr;
        this.types = cArr;
        this.isExplicit = zArr;
        this.charsEaten = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CommonMarkdownConstraints addModifierIfNeeded$1(LookaheadText$Position lookaheadText$Position) {
        CommonMarkdownConstraints commonMarkdownConstraints;
        CommonMarkdownConstraints access$create;
        if (lookaheadText$Position != null) {
            String str = lookaheadText$Position.currentLine;
            int i = lookaheadText$Position.localPos;
            if (i != -1 && !AppCompatHintHelper.isHorizontalRule(i, str)) {
                int i2 = 0;
                int indent = (i <= 0 || str.charAt(i + (-1)) != '\t') ? 0 : (4 - (getIndent() % 4)) % 4;
                int i3 = i;
                while (i3 < str.length() && str.charAt(i3) == ' ' && indent < 3) {
                    indent++;
                    i3++;
                }
                if (i3 != str.length()) {
                    LookaheadText$Position nextPosition = lookaheadText$Position.nextPosition(i3 - i);
                    nextPosition.getClass();
                    ListMarkerInfo fetchListMarker = fetchListMarker(nextPosition);
                    if (fetchListMarker != null) {
                        char c = fetchListMarker.markerType;
                        int i4 = fetchListMarker.markerIndent;
                        int i5 = i3 + fetchListMarker.markerLength;
                        int i6 = 0;
                        int i7 = i5;
                        while (i7 < str.length()) {
                            char charAt = str.charAt(i7);
                            if (charAt != ' ') {
                                if (charAt != '\t') {
                                    break;
                                }
                                i6 = (4 - (i6 % 4)) + i6;
                            } else {
                                i6++;
                            }
                            i7++;
                        }
                        if (1 > i6 || i6 >= 5) {
                            commonMarkdownConstraints = null;
                        } else {
                            commonMarkdownConstraints = null;
                            if (i7 < str.length()) {
                                access$create = LinkResolverDef.access$create(this, indent + i4 + i6, c, true, i7);
                                if (access$create != null) {
                                    return access$create;
                                }
                                int i8 = 0;
                                while (i < str.length() && str.charAt(i) == ' ' && i8 < 3) {
                                    i8++;
                                    i++;
                                }
                                if (i == str.length() || str.charAt(i) != '>') {
                                    return commonMarkdownConstraints;
                                }
                                int i9 = i + 1;
                                if (i9 >= str.length() || str.charAt(i9) == ' ' || str.charAt(i9) == '\t') {
                                    if (i9 < str.length()) {
                                        i9 = i + 2;
                                    }
                                    i2 = 1;
                                }
                                return LinkResolverDef.access$create(this, i8 + 1 + i2, '>', true, i9);
                            }
                        }
                        access$create = ((i6 < 5 || i7 >= str.length()) && i7 != str.length()) ? commonMarkdownConstraints : LinkResolverDef.access$create(this, indent + i4 + 1, c, true, Math.min(i7, i5 + 1));
                        if (access$create != null) {
                        }
                    }
                }
                access$create = null;
                commonMarkdownConstraints = null;
                if (access$create != null) {
                }
            }
        }
        return null;
    }

    public final CommonMarkdownConstraints applyToNextLine$1(LookaheadText$Position lookaheadText$Position) {
        if (lookaheadText$Position == null) {
            return getBase();
        }
        if (lookaheadText$Position.localPos != -1) {
            throw new MarkdownParsingException("given " + lookaheadText$Position);
        }
        String str = lookaheadText$Position.currentLine;
        OneDimensionalFocusSearchKt$generateAndSearchChildren$1 oneDimensionalFocusSearchKt$generateAndSearchChildren$1 = new OneDimensionalFocusSearchKt$generateAndSearchChildren$1(new Ref$IntRef(), this.indents.length, str, this, new ImageKt$Image$finalModifier$1$1(str, 2));
        CommonMarkdownConstraints base = getBase();
        while (true) {
            CommonMarkdownConstraints commonMarkdownConstraints = (CommonMarkdownConstraints) oneDimensionalFocusSearchKt$generateAndSearchChildren$1.invoke(base);
            if (commonMarkdownConstraints.equals(base)) {
                return base;
            }
            base = commonMarkdownConstraints;
        }
    }

    public final boolean containsListMarkers(int i) {
        Iterable until = RangesKt___RangesKt.until(0, i);
        if (!(until instanceof Collection) || !((Collection) until).isEmpty()) {
            IntProgressionIterator it = until.iterator();
            while (it.hasNext) {
                int nextInt = it.nextInt();
                if (this.types[nextInt] != '>' && this.isExplicit[nextInt]) {
                    return true;
                }
            }
        }
        return false;
    }

    public CommonMarkdownConstraints createNewConstraints(int[] iArr, char[] cArr, boolean[] zArr, int i) {
        return new CommonMarkdownConstraints(iArr, cArr, zArr, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
    
        if ((r4 - r0) > 9) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        if (r4 >= r3.length()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (r3.charAt(r4) == '.') goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r3.charAt(r4) != ')') goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        r2 = (r4 + 1) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005d, code lost:
    
        return new org.intellij.markdown.parser.constraints.CommonMarkdownConstraints.ListMarkerInfo(r3.charAt(r4), r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:?, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ListMarkerInfo fetchListMarker(LookaheadText$Position lookaheadText$Position) {
        char charAt;
        char charAt2 = ((CharSequence) lookaheadText$Position.this$0.parser).charAt(lookaheadText$Position.globalPos);
        int i = lookaheadText$Position.localPos;
        if (charAt2 == '*' || charAt2 == '-' || charAt2 == '+') {
            return new ListMarkerInfo(charAt2, 1, 1);
        }
        String str = lookaheadText$Position.currentLine;
        int i2 = i;
        while (i2 < str.length() && '0' <= (charAt = str.charAt(i2)) && charAt < ':') {
            i2++;
        }
        return null;
    }

    public CommonMarkdownConstraints getBase() {
        return BASE;
    }

    public final int getIndent() {
        int[] iArr = this.indents;
        Integer valueOf = iArr.length == 0 ? null : Integer.valueOf(iArr[iArr.length - 1]);
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final boolean startsWith(CommonMarkdownConstraints commonMarkdownConstraints) {
        commonMarkdownConstraints.getClass();
        int length = this.indents.length;
        int length2 = commonMarkdownConstraints.indents.length;
        if (length >= length2) {
            Iterable until = RangesKt___RangesKt.until(0, length2);
            if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
                return true;
            }
            IntProgressionIterator it = until.iterator();
            while (it.hasNext) {
                int nextInt = it.nextInt();
                if (this.types[nextInt] != commonMarkdownConstraints.types[nextInt]) {
                }
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        return "MdConstraints: " + new String(this.types) + '(' + getIndent() + ')';
    }
}
