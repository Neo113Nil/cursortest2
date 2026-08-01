package a2;

import java.io.Serializable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115a;

    /* renamed from: b, reason: collision with root package name */
    public final k f116b;

    /* renamed from: c, reason: collision with root package name */
    public final k f117c;

    /* renamed from: d, reason: collision with root package name */
    public final k f118d;

    /* renamed from: e, reason: collision with root package name */
    public final k f119e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f120f;

    /* JADX WARN: Multi-variable type inference failed */
    public l(l[] lVarArr) {
        this.f115a = 0;
        this.f120f = lVarArr;
        int length = lVarArr.length;
        k[] kVarArr = new k[length];
        for (int i3 = 0; i3 < length; i3++) {
            kVarArr[i3] = ((l[]) this.f120f)[i3].b();
        }
        this.f116b = new k(1, new d1(kVarArr, 0));
        int length2 = ((l[]) this.f120f).length;
        k[] kVarArr2 = new k[length2];
        for (int i10 = 0; i10 < length2; i10++) {
            kVarArr2[i10] = ((l[]) this.f120f)[i10].d();
        }
        this.f117c = new k(0, new j(kVarArr2, 0));
        int length3 = ((l[]) this.f120f).length;
        k[] kVarArr3 = new k[length3];
        for (int i11 = 0; i11 < length3; i11++) {
            kVarArr3[i11] = ((l[]) this.f120f)[i11].c();
        }
        this.f118d = new k(1, new d1(kVarArr3, 1));
        int length4 = ((l[]) this.f120f).length;
        k[] kVarArr4 = new k[length4];
        for (int i12 = 0; i12 < length4; i12++) {
            kVarArr4[i12] = ((l[]) this.f120f)[i12].a();
        }
        this.f119e = new k(0, new j(kVarArr4, 1));
    }

    public final k a() {
        switch (this.f115a) {
        }
        return this.f119e;
    }

    public final k b() {
        switch (this.f115a) {
        }
        return this.f116b;
    }

    public final k c() {
        switch (this.f115a) {
        }
        return this.f118d;
    }

    public final k d() {
        switch (this.f115a) {
        }
        return this.f117c;
    }

    public final String toString() {
        switch (this.f115a) {
            case 0:
                return kotlin.collections.w.q(57, (l[]) this.f120f);
            default:
                return "RectRulers(" + ((String) this.f120f) + ')';
        }
    }

    public l(String str) {
        this.f115a = 1;
        this.f120f = str;
        this.f116b = new k(1, null);
        this.f117c = new k(0, null);
        this.f118d = new k(1, null);
        this.f119e = new k(0, null);
    }
}
