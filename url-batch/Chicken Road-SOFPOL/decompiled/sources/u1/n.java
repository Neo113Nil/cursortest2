package u1;

import java.io.Serializable;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7240a;

    /* renamed from: b, reason: collision with root package name */
    public final m f7241b;

    /* renamed from: c, reason: collision with root package name */
    public final m f7242c;

    /* renamed from: d, reason: collision with root package name */
    public final m f7243d;

    /* renamed from: e, reason: collision with root package name */
    public final m f7244e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f7245f;

    public n(String str) {
        this.f7240a = 1;
        this.f7245f = str;
        this.f7241b = new m(1, null);
        this.f7242c = new m(0, null);
        this.f7243d = new m(1, null);
        this.f7244e = new m(0, null);
    }

    public final m a() {
        switch (this.f7240a) {
        }
        return this.f7244e;
    }

    public final m b() {
        switch (this.f7240a) {
        }
        return this.f7241b;
    }

    public final m c() {
        switch (this.f7240a) {
        }
        return this.f7243d;
    }

    public final m d() {
        switch (this.f7240a) {
        }
        return this.f7242c;
    }

    public final String toString() {
        switch (this.f7240a) {
            case 0:
                n[] nVarArr = (n[]) this.f7245f;
                q6.i.e(nVarArr, "<this>");
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "innermostOf(");
                int i = 0;
                for (n nVar : nVarArr) {
                    i++;
                    if (i > 1) {
                        sb.append((CharSequence) ", ");
                    }
                    r2.r.f(sb, nVar, null);
                }
                sb.append((CharSequence) ")");
                return sb.toString();
            default:
                String str = (String) this.f7245f;
                if (str == null) {
                    return super.toString();
                }
                return "RectRulers(" + str + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(n[] nVarArr) {
        this.f7240a = 0;
        this.f7245f = nVarArr;
        int length = nVarArr.length;
        m[] mVarArr = new m[length];
        for (int i = 0; i < length; i++) {
            mVarArr[i] = ((n[]) this.f7245f)[i].b();
        }
        this.f7241b = new m(1, new a1(mVarArr, 0));
        int length2 = ((n[]) this.f7245f).length;
        m[] mVarArr2 = new m[length2];
        for (int i8 = 0; i8 < length2; i8++) {
            mVarArr2[i8] = ((n[]) this.f7245f)[i8].d();
        }
        this.f7242c = new m(0, new l(mVarArr2, 0));
        int length3 = ((n[]) this.f7245f).length;
        m[] mVarArr3 = new m[length3];
        for (int i9 = 0; i9 < length3; i9++) {
            mVarArr3[i9] = ((n[]) this.f7245f)[i9].c();
        }
        this.f7243d = new m(1, new a1(mVarArr3, 1));
        int length4 = ((n[]) this.f7245f).length;
        m[] mVarArr4 = new m[length4];
        for (int i10 = 0; i10 < length4; i10++) {
            mVarArr4[i10] = ((n[]) this.f7245f)[i10].a();
        }
        this.f7244e = new m(0, new l(mVarArr4, 1));
    }
}
