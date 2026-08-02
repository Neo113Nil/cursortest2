package org.apache.commons.imaging.palette;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes9.dex */
public class MostPopulatedBoxesMedianCut implements MedianCut {

    /* renamed from: org.apache.commons.imaging.palette.MostPopulatedBoxesMedianCut$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$imaging$palette$ColorComponent;

        static {
            int[] iArr = new int[ColorComponent.values().length];
            $SwitchMap$org$apache$commons$imaging$palette$ColorComponent = iArr;
            try {
                iArr[ColorComponent.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$palette$ColorComponent[ColorComponent.RED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$palette$ColorComponent[ColorComponent.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$apache$commons$imaging$palette$ColorComponent[ColorComponent.BLUE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0094, code lost:
    
        if (java.lang.Math.abs(r14 - r17) < java.lang.Math.abs(r16 - r14)) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9 A[SYNTHETIC] */
    @Override // org.apache.commons.imaging.palette.MedianCut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean performNextMedianCut(List<ColorGroup> list, boolean z) {
        int i;
        ArrayList arrayList;
        ColorComponent[] colorComponentArr;
        ArrayList arrayList2;
        int i2;
        int i3;
        double abs;
        int i4;
        int i5 = 0;
        ColorComponent colorComponent = null;
        int i6 = 0;
        ColorGroup colorGroup = null;
        for (ColorGroup colorGroup2 : list) {
            if (colorGroup2.maxDiff > 0 && (i4 = colorGroup2.totalPoints) > i6) {
                colorGroup = colorGroup2;
                i6 = i4;
            }
        }
        if (colorGroup == null) {
            return false;
        }
        List<ColorCount> colorCounts = colorGroup.getColorCounts();
        ColorComponent[] values = ColorComponent.values();
        int length = values.length;
        int i7 = -1;
        double d = Double.MAX_VALUE;
        int i8 = 0;
        while (i8 < length) {
            ColorComponent colorComponent2 = values[i8];
            if (z && colorComponent2 == ColorComponent.ALPHA) {
                i2 = i5;
                colorComponentArr = values;
            } else {
                Collections.sort(colorCounts, new ColorCountComparator(colorComponent2));
                int round = (int) Math.round(colorGroup.totalPoints / 2.0d);
                int i9 = i5;
                int i10 = i9;
                while (true) {
                    int i11 = i10;
                    if (i9 >= colorCounts.size()) {
                        break;
                    }
                    int i12 = i10 + colorCounts.get(i9).count;
                    if (i12 >= round) {
                        i10 = i12;
                        break;
                    }
                    i9++;
                    i10 = i12;
                }
                if (i9 != colorCounts.size() - 1) {
                    if (i9 > 0) {
                    }
                    int i13 = i9 + 1;
                    colorComponentArr = values;
                    arrayList = new ArrayList(colorCounts.subList(i5, i13));
                    i2 = i5;
                    arrayList2 = new ArrayList(colorCounts.subList(i13, colorCounts.size()));
                    if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
                        ColorGroup colorGroup3 = new ColorGroup(arrayList, z);
                        ColorGroup colorGroup4 = new ColorGroup(arrayList2, z);
                        i3 = length;
                        abs = Math.abs(colorGroup3.totalPoints - colorGroup4.totalPoints) / Math.max(colorGroup3.totalPoints, colorGroup4.totalPoints);
                        if (abs >= d) {
                            d = abs;
                            colorComponent = colorComponent2;
                            i7 = i9;
                        }
                        i8++;
                        length = i3;
                        values = colorComponentArr;
                        i5 = i2;
                    }
                }
                i9--;
                int i132 = i9 + 1;
                colorComponentArr = values;
                arrayList = new ArrayList(colorCounts.subList(i5, i132));
                i2 = i5;
                arrayList2 = new ArrayList(colorCounts.subList(i132, colorCounts.size()));
                if (!arrayList.isEmpty()) {
                    ColorGroup colorGroup32 = new ColorGroup(arrayList, z);
                    ColorGroup colorGroup42 = new ColorGroup(arrayList2, z);
                    i3 = length;
                    abs = Math.abs(colorGroup32.totalPoints - colorGroup42.totalPoints) / Math.max(colorGroup32.totalPoints, colorGroup42.totalPoints);
                    if (abs >= d) {
                    }
                    i8++;
                    length = i3;
                    values = colorComponentArr;
                    i5 = i2;
                }
            }
            i3 = length;
            i8++;
            length = i3;
            values = colorComponentArr;
            i5 = i2;
        }
        boolean z2 = i5;
        if (colorComponent == null) {
            return z2;
        }
        Collections.sort(colorCounts, new ColorCountComparator(colorComponent));
        int i14 = i7 + 1;
        ArrayList arrayList3 = new ArrayList(colorCounts.subList(z2 ? 1 : 0, i14));
        ArrayList arrayList4 = new ArrayList(colorCounts.subList(i14, colorCounts.size()));
        ColorGroup colorGroup5 = new ColorGroup(arrayList3, z);
        ColorGroup colorGroup6 = new ColorGroup(arrayList4, z);
        list.remove(colorGroup);
        list.add(colorGroup5);
        list.add(colorGroup6);
        ColorCount colorCount = colorCounts.get(i7);
        int i15 = AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[colorComponent.ordinal()];
        if (i15 == 1) {
            i = colorCount.alpha;
        } else if (i15 == 2) {
            i = colorCount.red;
        } else if (i15 == 3) {
            i = colorCount.green;
        } else {
            if (i15 != 4) {
                throw new Error("Bad mode.");
            }
            i = colorCount.blue;
        }
        colorGroup.cut = new ColorGroupCut(colorGroup5, colorGroup6, colorComponent, i);
        return true;
    }
}
