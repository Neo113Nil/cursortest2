package org.apache.commons.imaging.palette;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes9.dex */
public class LongestAxisMedianCut implements MedianCut {
    private static final Comparator<ColorGroup> COMPARATOR = new LongestAxisMedianCut$$ExternalSyntheticLambda0();

    /* renamed from: org.apache.commons.imaging.palette.LongestAxisMedianCut$1, reason: invalid class name */
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

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        if (java.lang.Math.abs(r0 - r4) < java.lang.Math.abs(r3 - r0)) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doCut(ColorGroup colorGroup, ColorComponent colorComponent, List<ColorGroup> list, boolean z) {
        int i;
        int i2;
        List<ColorCount> colorCounts = colorGroup.getColorCounts();
        Collections.sort(colorCounts, new ColorCountComparator(colorComponent));
        int round = (int) Math.round(colorGroup.totalPoints / 2.0d);
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i3 >= colorCounts.size() || (i4 = i4 + colorCounts.get(i3).count) >= round) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 != colorCounts.size() - 1) {
            if (i3 > 0) {
            }
            list.remove(colorGroup);
            int i6 = i3 + 1;
            ArrayList arrayList = new ArrayList(colorCounts.subList(0, i6));
            ArrayList arrayList2 = new ArrayList(colorCounts.subList(i6, colorCounts.size()));
            ColorGroup colorGroup2 = new ColorGroup(new ArrayList(arrayList), z);
            list.add(colorGroup2);
            ColorGroup colorGroup3 = new ColorGroup(new ArrayList(arrayList2), z);
            list.add(colorGroup3);
            ColorCount colorCount = colorCounts.get(i3);
            i = AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[colorComponent.ordinal()];
            if (i != 1) {
                i2 = colorCount.alpha;
            } else if (i == 2) {
                i2 = colorCount.red;
            } else if (i == 3) {
                i2 = colorCount.green;
            } else {
                if (i != 4) {
                    throw new Error("Bad mode.");
                }
                i2 = colorCount.blue;
            }
            colorGroup.cut = new ColorGroupCut(colorGroup2, colorGroup3, colorComponent, i2);
        }
        i3--;
        list.remove(colorGroup);
        int i62 = i3 + 1;
        ArrayList arrayList3 = new ArrayList(colorCounts.subList(0, i62));
        ArrayList arrayList22 = new ArrayList(colorCounts.subList(i62, colorCounts.size()));
        ColorGroup colorGroup22 = new ColorGroup(new ArrayList(arrayList3), z);
        list.add(colorGroup22);
        ColorGroup colorGroup32 = new ColorGroup(new ArrayList(arrayList22), z);
        list.add(colorGroup32);
        ColorCount colorCount2 = colorCounts.get(i3);
        i = AnonymousClass1.$SwitchMap$org$apache$commons$imaging$palette$ColorComponent[colorComponent.ordinal()];
        if (i != 1) {
        }
        colorGroup.cut = new ColorGroupCut(colorGroup22, colorGroup32, colorComponent, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(ColorGroup colorGroup, ColorGroup colorGroup2) {
        int i = colorGroup.maxDiff;
        int i2 = colorGroup2.maxDiff;
        return i == i2 ? colorGroup2.diffTotal - colorGroup.diffTotal : i2 - i;
    }

    @Override // org.apache.commons.imaging.palette.MedianCut
    public boolean performNextMedianCut(List<ColorGroup> list, boolean z) {
        int i;
        Collections.sort(list, COMPARATOR);
        ColorGroup colorGroup = list.get(0);
        if (colorGroup.maxDiff == 0) {
            return false;
        }
        if (!z && (i = colorGroup.alphaDiff) > colorGroup.redDiff && i > colorGroup.greenDiff && i > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.ALPHA, list, z);
            return true;
        }
        int i2 = colorGroup.redDiff;
        int i3 = colorGroup.greenDiff;
        if (i2 > i3 && i2 > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.RED, list, z);
            return true;
        }
        if (i3 > colorGroup.blueDiff) {
            doCut(colorGroup, ColorComponent.GREEN, list, z);
            return true;
        }
        doCut(colorGroup, ColorComponent.BLUE, list, z);
        return true;
    }
}
