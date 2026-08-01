package U;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q implements p, k0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1103a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1104b;

    public /* synthetic */ q(String str, int i) {
        this.f1103a = i;
        this.f1104b = str;
    }

    @Override // U.p
    public Object a() {
        return this;
    }

    @Override // U.p
    public boolean b(CharSequence charSequence, int i, int i2, x xVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f1104b)) {
            return true;
        }
        xVar.f1124c = (xVar.f1124c & 3) | 4;
        return false;
    }

    @Override // k0.c
    public String d() {
        return this.f1104b;
    }

    @Override // k0.c
    public void j(k0.b bVar) {
    }

    public String toString() {
        switch (this.f1103a) {
            case 2:
                return "<" + this.f1104b + '>';
            default:
                return super.toString();
        }
    }

    public q(String str) {
        this.f1103a = 1;
        k1.e.e(str, "query");
        this.f1104b = str;
    }
}
