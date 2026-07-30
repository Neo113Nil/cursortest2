package b7;

/* loaded from: classes5.dex */
public abstract class l {
    public static void mul(int[] iArr, int[] iArr2, int[] iArr3) {
        h.mul(iArr, iArr2, iArr3);
        h.mul(iArr, 8, iArr2, 8, iArr3, 16);
        int addToEachOther = h.addToEachOther(iArr3, 8, iArr3, 16);
        int addTo = addToEachOther + h.addTo(iArr3, 24, iArr3, 16, h.addTo(iArr3, 0, iArr3, 8, 0) + addToEachOther);
        int[] create = h.create();
        int[] create2 = h.create();
        boolean z7 = h.diff(iArr, 8, iArr, 0, create, 0) != h.diff(iArr2, 8, iArr2, 0, create2, 0);
        int[] createExt = h.createExt();
        h.mul(create, create2, createExt);
        n.addWordAt(32, addTo + (z7 ? n.addTo(16, createExt, 0, iArr3, 8) : n.subFrom(16, createExt, 0, iArr3, 8)), iArr3, 24);
    }

    public static void square(int[] iArr, int[] iArr2) {
        h.square(iArr, iArr2);
        h.square(iArr, 8, iArr2, 16);
        int addToEachOther = h.addToEachOther(iArr2, 8, iArr2, 16);
        int addTo = addToEachOther + h.addTo(iArr2, 24, iArr2, 16, h.addTo(iArr2, 0, iArr2, 8, 0) + addToEachOther);
        int[] create = h.create();
        h.diff(iArr, 8, iArr, 0, create, 0);
        int[] createExt = h.createExt();
        h.square(create, createExt);
        n.addWordAt(32, addTo + n.subFrom(16, createExt, 0, iArr2, 8), iArr2, 24);
    }
}
