package com.horcrux.svg;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.view.View;
import com.horcrux.svg.TextProperties;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class TextLayoutAlgorithm {
    TextLayoutAlgorithm() {
    }

    class CharacterInformation {
        double advance;
        char character;
        TextView element;
        int index;
        double x = 0.0d;
        double y = 0.0d;
        double rotate = 0.0d;
        boolean hidden = false;
        boolean middle = false;
        boolean resolved = false;
        boolean xSpecified = false;
        boolean ySpecified = false;
        boolean addressable = true;
        boolean anchoredChunk = false;
        boolean rotateSpecified = false;
        boolean firstCharacterInResolvedDescendant = false;

        CharacterInformation(int i, char c) {
            this.index = i;
            this.character = c;
        }
    }

    class LayoutInput {
        boolean horizontal;
        TextView text;

        LayoutInput() {
        }
    }

    private void getSubTreeTypographicCharacterPositions(ArrayList<TextPathView> arrayList, ArrayList<TextView> arrayList2, StringBuilder sb, View view, TextPathView textPathView) {
        int i = 0;
        if (view instanceof TSpanView) {
            TSpanView tSpanView = (TSpanView) view;
            String str = tSpanView.mContent;
            if (str == null) {
                while (i < tSpanView.getChildCount()) {
                    getSubTreeTypographicCharacterPositions(arrayList, arrayList2, sb, tSpanView.getChildAt(i), textPathView);
                    i++;
                }
                return;
            } else {
                while (i < str.length()) {
                    arrayList2.add(tSpanView);
                    arrayList.add(textPathView);
                    i++;
                }
                sb.append(str);
                return;
            }
        }
        ArrayList<TextView> arrayList3 = arrayList2;
        StringBuilder sb2 = sb;
        TextPathView textPathView2 = view instanceof TextPathView ? (TextPathView) view : textPathView;
        while (i < textPathView2.getChildCount()) {
            getSubTreeTypographicCharacterPositions(arrayList, arrayList3, sb2, textPathView2.getChildAt(i), textPathView2);
            i++;
            arrayList3 = arrayList2;
            sb2 = sb;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01c2, code lost:
    
        if (r4 == com.horcrux.svg.TextProperties.Direction.ltr) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b5, code lost:
    
        if (r4 == com.horcrux.svg.TextProperties.Direction.ltr) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c4, code lost:
    
        r11 = r11 - r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01c7, code lost:
    
        r11 = r11 - r18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02e0  */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [android.graphics.Canvas, android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v4, types: [com.horcrux.svg.TextLayoutAlgorithm$1TextLengthResolver] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    CharacterInformation[] layoutText(LayoutInput layoutInput) {
        boolean z;
        int i;
        PointF pointF;
        boolean z2;
        boolean z3;
        double d;
        double d2;
        char c;
        TextView textView = layoutInput.text;
        StringBuilder sb = new StringBuilder();
        ArrayList<TextView> arrayList = new ArrayList<>();
        ArrayList<TextPathView> arrayList2 = new ArrayList<>();
        getSubTreeTypographicCharacterPositions(arrayList2, arrayList, sb, textView, null);
        char[] charArray = sb.toString().toCharArray();
        int length = charArray.length;
        final CharacterInformation[] characterInformationArr = new CharacterInformation[length];
        for (int i2 = 0; i2 < length; i2++) {
            characterInformationArr[i2] = new CharacterInformation(i2, charArray[i2]);
        }
        if (length != 0) {
            PointF[] pointFArr = new PointF[length];
            for (int i3 = 0; i3 < length; i3++) {
                pointFArr[i3] = new PointF(0.0f, 0.0f);
            }
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                characterInformationArr[i4].addressable = true;
                characterInformationArr[i4].middle = false;
                characterInformationArr[i4].anchoredChunk = i4 == 0;
                if (characterInformationArr[i4].addressable && !characterInformationArr[i4].middle) {
                    pointFArr[i4].set(0.0f, 0.0f);
                } else if (i4 > 0) {
                    pointFArr[i4].set(pointFArr[i4 - 1]);
                }
                i4++;
            }
            String[] strArr = new String[length];
            String[] strArr2 = new String[length];
            new C1CharacterPositioningResolver(characterInformationArr, strArr, strArr2, new String[length], new String[length]);
            PointF pointF2 = new PointF(0.0f, 0.0f);
            for (int i5 = 0; i5 < length; i5++) {
                if (strArr[i5].equals("")) {
                    strArr[i5] = CommonUrlParts.Values.FALSE_INTEGER;
                }
                if (strArr2[i5].equals("")) {
                    strArr2[i5] = CommonUrlParts.Values.FALSE_INTEGER;
                }
                pointF2.x += Float.parseFloat(strArr[i5]);
                pointF2.y += Float.parseFloat(strArr2[i5]);
                characterInformationArr[i5].x = pointFArr[i5].x + pointF2.x;
                characterInformationArr[i5].y = pointFArr[i5].y + pointF2.y;
            }
            new Object() { // from class: com.horcrux.svg.TextLayoutAlgorithm.1TextLengthResolver
                int global;

                /* JADX INFO: Access modifiers changed from: private */
                public void resolveTextLength(TextView textView2) {
                    int i6;
                    Class<?> cls = textView2.getClass();
                    boolean z4 = textView2.mTextLength != null;
                    if (cls == TSpanView.class && z4) {
                        TSpanView tSpanView = (TSpanView) textView2;
                        String str = tSpanView.mContent;
                        int i7 = this.global;
                        int length2 = (str == null ? 0 : str.length()) + i7;
                        double d3 = Double.NEGATIVE_INFINITY;
                        int i8 = i7;
                        double d4 = Double.POSITIVE_INFINITY;
                        while (i8 <= length2) {
                            if (characterInformationArr[i7].addressable) {
                                char c2 = characterInformationArr[i7].character;
                                if (c2 == '\n' || c2 == '\r') {
                                    return;
                                }
                                double d5 = characterInformationArr[i8].x;
                                double d6 = characterInformationArr[i8].advance + d5;
                                i6 = i7;
                                d4 = Math.min(d4, Math.min(d5, d6));
                                d3 = Math.max(d3, Math.max(d5, d6));
                            } else {
                                i6 = i7;
                            }
                            i8++;
                            i7 = i6;
                        }
                        int i9 = i7;
                        if (d4 != Double.POSITIVE_INFINITY) {
                            double d7 = textView2.mTextLength.value - (d3 - d4);
                            int i10 = 0;
                            int i11 = 0;
                            for (int i12 = 0; i12 < textView2.getChildCount(); i12++) {
                                if (((TextPathView) textView2.getChildAt(i12)).mTextLength == null) {
                                    String str2 = tSpanView.mContent;
                                    i10 += str2 == null ? 0 : str2.length();
                                } else {
                                    characterInformationArr[i10].firstCharacterInResolvedDescendant = true;
                                    i11++;
                                }
                            }
                            double d8 = d7 / (i10 + (i11 - 1));
                            double d9 = 0.0d;
                            for (int i13 = i9; i13 <= length2; i13++) {
                                characterInformationArr[i13].x += d9;
                                if (!characterInformationArr[i13].middle && (!characterInformationArr[i13].resolved || characterInformationArr[i13].firstCharacterInResolvedDescendant)) {
                                    d9 += d8;
                                }
                            }
                        }
                    }
                }
            }.resolveTextLength(textView);
            pointF2.set(0.0f, 0.0f);
            int i6 = 1;
            while (i6 < length) {
                String str = strArr[i6];
                if (str != null) {
                    pointF2.x = (float) (Double.parseDouble(str) - characterInformationArr[i6].x);
                }
                String str2 = strArr2[i6];
                if (str2 != null) {
                    pointF2.y = (float) (Double.parseDouble(str2) - characterInformationArr[i6].y);
                }
                characterInformationArr[i6].x += pointF2.x;
                characterInformationArr[i6].y += pointF2.y;
                if (characterInformationArr[i6].middle && characterInformationArr[i6].anchoredChunk) {
                    characterInformationArr[i6].anchoredChunk = false;
                }
                i6++;
                if (i6 < length) {
                    characterInformationArr[i6].anchoredChunk = true;
                }
            }
            int i7 = 0;
            int i8 = 0;
            double d3 = Double.POSITIVE_INFINITY;
            double d4 = Double.NEGATIVE_INFINITY;
            double d5 = Double.POSITIVE_INFINITY;
            double d6 = Double.NEGATIVE_INFINITY;
            while (i7 < length) {
                if (characterInformationArr[i7].addressable) {
                    if (characterInformationArr[i7].anchoredChunk) {
                        d5 = d3;
                        d6 = d4;
                        d3 = Double.POSITIVE_INFINITY;
                        d4 = Double.NEGATIVE_INFINITY;
                    }
                    double d7 = characterInformationArr[i7].x;
                    double d8 = characterInformationArr[i7].advance + d7;
                    d3 = Math.min(d3, Math.min(d7, d8));
                    d4 = Math.max(d4, Math.max(d7, d8));
                    if ((i7 > 0 && characterInformationArr[i7].anchoredChunk && d5 != Double.POSITIVE_INFINITY) || i7 == length - 1) {
                        TextProperties.TextAnchor textAnchor = TextProperties.TextAnchor.start;
                        TextProperties.Direction direction = TextProperties.Direction.ltr;
                        int i9 = length - 1;
                        if (i7 == i9) {
                            d5 = d3;
                            d6 = d4;
                        }
                        double d9 = characterInformationArr[i8].x;
                        int i10 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                TextProperties.Direction direction2 = TextProperties.Direction.ltr;
                                d9 -= (d5 + d6) / 2.0d;
                            } else if (i10 == 3) {
                            }
                        }
                        int i11 = i7 == i9 ? i7 : i7 - 1;
                        for (int i12 = i8; i12 <= i11; i12++) {
                            characterInformationArr[i12].x += d9;
                        }
                        i8 = i7;
                    }
                }
                i7++;
            }
            int i13 = i8;
            PointF pointF3 = new PointF(0.0f, 0.0f);
            PathMeasure pathMeasure = new PathMeasure();
            ?? r4 = 0;
            Path path = null;
            boolean z4 = false;
            int i14 = 0;
            boolean z5 = false;
            while (i14 < length) {
                TextPathView textPathView = arrayList2.get(i14);
                if (textPathView == 0 || !characterInformationArr[i14].addressable) {
                    z = z4;
                    i = i13;
                } else {
                    path = textPathView.getTextPath(r4, r4);
                    if (!characterInformationArr[i14].middle) {
                        textPathView.getSide();
                        TextProperties.TextPathSide textPathSide = TextProperties.TextPathSide.right;
                        pathMeasure.setPath(path, false);
                        double length2 = pathMeasure.getLength();
                        z = z4;
                        double d10 = textPathView.getStartOffset().value;
                        i = i13;
                        double d11 = characterInformationArr[i14].advance;
                        double d12 = characterInformationArr[i14].x;
                        double d13 = characterInformationArr[i14].y;
                        double d14 = characterInformationArr[i14].rotate;
                        double d15 = d12 + (d11 / 2.0d) + d10;
                        if (pathMeasure.isClosed() || (d15 >= 0.0d && d15 <= length2)) {
                            d = 0.0d;
                        } else {
                            d = 0.0d;
                            characterInformationArr[i14].hidden = true;
                        }
                        if (pathMeasure.isClosed()) {
                            TextProperties.TextAnchor textAnchor2 = TextProperties.TextAnchor.start;
                            TextProperties.Direction direction3 = TextProperties.Direction.ltr;
                            d2 = d15;
                            double d16 = characterInformationArr[i].x;
                            int i15 = AnonymousClass1.$SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[textAnchor2.ordinal()];
                            if (i15 == 1) {
                                if (direction3 != TextProperties.Direction.ltr) {
                                    c = 1;
                                    if (d2 < (-length2) || d2 > d) {
                                        characterInformationArr[i14].hidden = true;
                                    }
                                } else if (d2 < d || d2 > length2) {
                                    c = 1;
                                    characterInformationArr[i14].hidden = true;
                                }
                                double d17 = d2 % length2;
                                if (!characterInformationArr[i14].hidden) {
                                }
                            } else if (i15 != 2) {
                                if (i15 == 3) {
                                    if (direction3 != TextProperties.Direction.ltr) {
                                        c = 1;
                                        if (d2 < d || d2 > length2) {
                                            characterInformationArr[i14].hidden = true;
                                        }
                                    } else if (d2 < (-length2) || d2 > d) {
                                        c = 1;
                                        characterInformationArr[i14].hidden = true;
                                    }
                                    double d172 = d2 % length2;
                                    if (!characterInformationArr[i14].hidden) {
                                        pathMeasure.getPosTan((float) d172, new float[2], new float[2]);
                                        double atan2 = Math.atan2(r15[c], r15[0]) * 57.29577951308232d;
                                        double d18 = 90.0d + atan2;
                                        Math.cos(d18);
                                        Math.sin(d18);
                                        characterInformationArr[i14].rotate += atan2;
                                    }
                                }
                            } else if (d2 < (-length2) / 2.0d || d2 > length2 / 2.0d) {
                                c = 1;
                                characterInformationArr[i14].hidden = true;
                                double d1722 = d2 % length2;
                                if (!characterInformationArr[i14].hidden) {
                                }
                            }
                        } else {
                            d2 = d15;
                        }
                        c = 1;
                        double d17222 = d2 % length2;
                        if (!characterInformationArr[i14].hidden) {
                        }
                    } else {
                        z = z4;
                        i = i13;
                        int i16 = i14 - 1;
                        characterInformationArr[i14].x = characterInformationArr[i16].x;
                        characterInformationArr[i14].y = characterInformationArr[i16].y;
                        characterInformationArr[i14].rotate = characterInformationArr[i16].rotate;
                    }
                    z5 = true;
                }
                if (textPathView == 0 && characterInformationArr[i14].addressable) {
                    if (z5) {
                        pathMeasure.setPath(path, false);
                        float[] fArr = new float[2];
                        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
                        pointF3.set(fArr[0], fArr[1]);
                        z2 = false;
                        z3 = true;
                    } else {
                        z2 = z5;
                        z3 = z;
                    }
                    if (!z3) {
                        pointF = pointF3;
                    } else if (characterInformationArr[i14].anchoredChunk) {
                        pointF = pointF3;
                        z4 = false;
                        z5 = z2;
                    } else {
                        characterInformationArr[i14].x += pointF3.x;
                        pointF = pointF3;
                        characterInformationArr[i14].y += pointF3.y;
                    }
                    z4 = z3;
                    z5 = z2;
                } else {
                    pointF = pointF3;
                    z4 = z;
                }
                i14++;
                pointF3 = pointF;
                i13 = i;
                r4 = 0;
            }
        }
        return characterInformationArr;
    }

    /* renamed from: com.horcrux.svg.TextLayoutAlgorithm$1CharacterPositioningResolver, reason: invalid class name */
    class C1CharacterPositioningResolver {
        private int global;
        private boolean horizontal;
        private boolean in_text_path;
        private String[] resolve_dx;
        private String[] resolve_dy;
        private String[] resolve_x;
        private String[] resolve_y;
        private CharacterInformation[] result;

        private C1CharacterPositioningResolver(CharacterInformation[] characterInformationArr, String[] strArr, String[] strArr2, String[] strArr3, String[] strArr4) {
            this.global = 0;
            this.horizontal = true;
            this.in_text_path = false;
            this.result = characterInformationArr;
            this.resolve_x = strArr;
            this.resolve_y = strArr2;
            this.resolve_dx = strArr3;
            this.resolve_dy = strArr4;
        }

        private void resolveCharacterPositioning(TextView textView) {
            boolean z = true;
            if (textView.getClass() == TextView.class || textView.getClass() == TSpanView.class) {
                int i = this.global;
                String[] strArr = new String[0];
                String[] strArr2 = new String[0];
                String[] strArr3 = new String[0];
                String[] strArr4 = new String[0];
                double[] dArr = new double[0];
                int max = !this.in_text_path ? Math.max(0, 0) : 0;
                String str = ((TSpanView) textView).mContent;
                int length = str == null ? 0 : str.length();
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = i + i2;
                    if (this.result[i4].addressable) {
                        this.result[i4].anchoredChunk = i3 < max ? z : false;
                        if (i3 < 0) {
                            this.resolve_x[i4] = strArr[i3];
                        }
                        boolean z2 = this.in_text_path;
                        if (z2 && !this.horizontal) {
                            this.resolve_x[i] = "";
                        }
                        if (i3 < 0) {
                            this.resolve_y[i4] = strArr2[i3];
                        }
                        if (z2 && this.horizontal) {
                            this.resolve_y[i] = "";
                        }
                        if (i3 < 0) {
                            this.resolve_dx[i4] = strArr3[i3];
                        }
                        if (i3 < 0) {
                            this.resolve_dy[i4] = strArr4[i3];
                        }
                        if (i3 < 0) {
                            this.result[i4].rotate = dArr[i3];
                        }
                    }
                    i3++;
                    i2++;
                    z = true;
                }
                return;
            }
            if (textView.getClass() == TextPathView.class) {
                this.result[this.global].anchoredChunk = true;
                this.in_text_path = true;
                for (int i5 = 0; i5 < textView.getChildCount(); i5++) {
                    resolveCharacterPositioning((TextView) textView.getChildAt(i5));
                }
                if (textView instanceof TextPathView) {
                    this.in_text_path = false;
                }
            }
        }
    }

    /* renamed from: com.horcrux.svg.TextLayoutAlgorithm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor;

        static {
            int[] iArr = new int[TextProperties.TextAnchor.values().length];
            $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor = iArr;
            try {
                iArr[TextProperties.TextAnchor.start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.middle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$horcrux$svg$TextProperties$TextAnchor[TextProperties.TextAnchor.end.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
