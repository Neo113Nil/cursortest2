package e7;

/* loaded from: classes5.dex */
public class c implements org.bouncycastle.crypto.c {
    private final int[] DEFAULT_VI;
    private int[] vi;

    public c() {
        int[] iArr = {6, 12, 17, 22, 33};
        this.DEFAULT_VI = iArr;
        this.vi = iArr;
    }

    private void checkParams() {
        int[] iArr;
        int i8;
        int[] iArr2 = this.vi;
        if (iArr2 == null) {
            throw new IllegalArgumentException("no layers defined.");
        }
        if (iArr2.length <= 1) {
            throw new IllegalArgumentException("Rainbow needs at least 1 layer, such that v1 < v2.");
        }
        int i9 = 0;
        do {
            iArr = this.vi;
            if (i9 >= iArr.length - 1) {
                return;
            }
            i8 = iArr[i9];
            i9++;
        } while (i8 < iArr[i9]);
        throw new IllegalArgumentException("v[i] has to be smaller than v[i+1]");
    }

    public int getDocLength() {
        int[] iArr = this.vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.vi.length - 1;
    }

    public int[] getVi() {
        return this.vi;
    }

    public c(int[] iArr) {
        this.DEFAULT_VI = new int[]{6, 12, 17, 22, 33};
        this.vi = iArr;
        checkParams();
    }
}
