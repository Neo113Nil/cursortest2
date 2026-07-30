package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class o21 {
    public final /* synthetic */ int a;
    public final ay0 b;
    public final ay0 c;
    public final ay0 d;
    public final ay0 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public o21(o21[] o21VarArr) {
        int i = 0;
        this.a = 0;
        this.f = o21VarArr;
        int length = o21VarArr.length;
        ay0[] ay0VarArr = new ay0[length];
        for (int i2 = 0; i2 < length; i2++) {
            ay0VarArr[i2] = ((o21[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new ay0(1, new q43(ay0VarArr, i));
        int length2 = ((o21[]) this.f).length;
        ay0[] ay0VarArr2 = new ay0[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            ay0VarArr2[i4] = ((o21[]) this.f)[i4].d();
        }
        this.c = new ay0(0, new zx0(ay0VarArr2, i));
        int length3 = ((o21[]) this.f).length;
        ay0[] ay0VarArr3 = new ay0[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            ay0VarArr3[i5] = ((o21[]) this.f)[i5].c();
        }
        this.d = new ay0(1, new q43(ay0VarArr3, i3));
        int length4 = ((o21[]) this.f).length;
        ay0[] ay0VarArr4 = new ay0[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            ay0VarArr4[i6] = ((o21[]) this.f)[i6].a();
        }
        this.e = new ay0(0, new zx0(ay0VarArr4, i3));
    }

    public final ay0 a() {
        int i = this.a;
        return this.e;
    }

    public final ay0 b() {
        int i = this.a;
        return this.b;
    }

    public final ay0 c() {
        int i = this.a;
        return this.d;
    }

    public final ay0 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case 0:
                return oi.v(57, (o21[]) obj);
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public o21(String str) {
        this.a = 1;
        this.f = str;
        this.b = new ay0(1, null);
        this.c = new ay0(0, null);
        this.d = new ay0(1, null);
        this.e = new ay0(0, null);
    }
}
