package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class v90 extends o90 {
    public final int d;
    public final int e;
    public boolean g;
    public int h;

    public v90(int i, int i2, int i3) {
        this.d = i3;
        this.e = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.g = z;
        this.h = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.g;
    }

    @Override // defpackage.o90
    public final int nextInt() {
        int i = this.h;
        if (i != this.e) {
            this.h = this.d + i;
            return i;
        }
        if (this.g) {
            this.g = false;
            return i;
        }
        dd0.c();
        return 0;
    }
}
