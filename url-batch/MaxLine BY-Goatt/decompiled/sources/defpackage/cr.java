package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class cr extends br {
    private static final long serialVersionUID = 1;
    public final byte[] p;

    public cr(byte[] bArr) {
        this.m = 0;
        bArr.getClass();
        this.p = bArr;
    }

    @Override // defpackage.er
    public byte a(int i) {
        return this.p[i];
    }

    @Override // defpackage.er
    public void d(int i, byte[] bArr) {
        System.arraycopy(this.p, 0, bArr, 0, i);
    }

    @Override // defpackage.er
    public byte e(int i) {
        return this.p[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof er) || size() != ((er) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof cr)) {
            return obj.equals(this);
        }
        cr crVar = (cr) obj;
        int i = this.m;
        int i2 = crVar.m;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > crVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > crVar.size()) {
            StringBuilder n = in1.n(size, "Ran off end of other: 0, ", ", ");
            n.append(crVar.size());
            throw new IllegalArgumentException(n.toString());
        }
        byte[] bArr = crVar.p;
        int f = f() + size;
        int f2 = f();
        int f3 = crVar.f();
        while (f2 < f) {
            if (this.p[f2] != bArr[f3]) {
                return false;
            }
            f2++;
            f3++;
        }
        return true;
    }

    public int f() {
        return 0;
    }

    @Override // defpackage.er
    public int size() {
        return this.p.length;
    }
}
