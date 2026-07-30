package defpackage;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class w80 {
    public final /* synthetic */ int a;
    public final o60 b;
    public final o60 c;
    public final o60 d;
    public final o60 e;
    public final Serializable f;

    /* JADX WARN: Multi-variable type inference failed */
    public w80(w80[] w80VarArr) {
        int i = 0;
        this.a = 0;
        this.f = w80VarArr;
        int length = w80VarArr.length;
        o60[] o60VarArr = new o60[length];
        for (int i2 = 0; i2 < length; i2++) {
            o60VarArr[i2] = ((w80[]) this.f)[i2].b();
        }
        int i3 = 1;
        this.b = new o60(1, new en1(o60VarArr, i));
        int length2 = ((w80[]) this.f).length;
        o60[] o60VarArr2 = new o60[length2];
        for (int i4 = 0; i4 < length2; i4++) {
            o60VarArr2[i4] = ((w80[]) this.f)[i4].d();
        }
        this.c = new o60(0, new n60(o60VarArr2, i));
        int length3 = ((w80[]) this.f).length;
        o60[] o60VarArr3 = new o60[length3];
        for (int i5 = 0; i5 < length3; i5++) {
            o60VarArr3[i5] = ((w80[]) this.f)[i5].c();
        }
        this.d = new o60(1, new en1(o60VarArr3, i3));
        int length4 = ((w80[]) this.f).length;
        o60[] o60VarArr4 = new o60[length4];
        for (int i6 = 0; i6 < length4; i6++) {
            o60VarArr4[i6] = ((w80[]) this.f)[i6].a();
        }
        this.e = new o60(0, new n60(o60VarArr4, i3));
    }

    public final o60 a() {
        int i = this.a;
        return this.e;
    }

    public final o60 b() {
        int i = this.a;
        return this.b;
    }

    public final o60 c() {
        int i = this.a;
        return this.d;
    }

    public final o60 d() {
        int i = this.a;
        return this.c;
    }

    public final String toString() {
        int i = this.a;
        Object obj = this.f;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return y9.l(57, (w80[]) obj);
            default:
                return "RectRulers(" + ((String) obj) + ')';
        }
    }

    public w80(String str) {
        this.a = 1;
        this.f = str;
        this.b = new o60(1, null);
        this.c = new o60(0, null);
        this.d = new o60(1, null);
        this.e = new o60(0, null);
    }
}
