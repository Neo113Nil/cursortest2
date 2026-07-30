package b7;

/* loaded from: classes5.dex */
public abstract class j {
    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        f.mul(iArr, iArr2, iArr3);
        f.mul(iArr, 6, iArr2, 6, iArr3, 12);
        int addToEachOther = f.addToEachOther(iArr3, 6, iArr3, 12);
        int addTo = addToEachOther + f.addTo(iArr3, 18, iArr3, 12, f.addTo(iArr3, 0, iArr3, 6, 0) + addToEachOther);
        int[] create = f.create();
        int[] create2 = f.create();
        boolean z7 = f.diff(iArr, 6, iArr, 0, create, 0) != f.diff(iArr2, 6, iArr2, 0, create2, 0);
        int[] createExt = f.createExt();
        f.mul(create, create2, createExt);
        n.addWordAt(24, addTo + (z7 ? n.addTo(12, createExt, 0, iArr3, 6) : n.subFrom(12, createExt, 0, iArr3, 6)), iArr3, 18);
    }

    public static void square(int[] iArr, int[] iArr2) {
        f.square(iArr, iArr2);
        f.square(iArr, 6, iArr2, 12);
        int addToEachOther = f.addToEachOther(iArr2, 6, iArr2, 12);
        int addTo = addToEachOther + f.addTo(iArr2, 18, iArr2, 12, f.addTo(iArr2, 0, iArr2, 6, 0) + addToEachOther);
        int[] create = f.create();
        f.diff(iArr, 6, iArr, 0, create, 0);
        int[] createExt = f.createExt();
        f.square(create, createExt);
        n.addWordAt(24, addTo + n.subFrom(12, createExt, 0, iArr2, 6), iArr2, 18);
    }
}
