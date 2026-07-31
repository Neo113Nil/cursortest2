package d4;

import android.text.TextUtils;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class t implements s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2283d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2284e;

    public /* synthetic */ t(String str, int i) {
        this.f2283d = i;
        this.f2284e = str;
    }

    @Override // d4.s
    public boolean f(CharSequence charSequence, int i, int i8, a0 a0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i8), this.f2284e)) {
            return true;
        }
        a0Var.f2249c = (a0Var.f2249c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f2283d) {
            case 1:
                return "<" + this.f2284e + '>';
            default:
                return super.toString();
        }
    }

    @Override // d4.s
    public Object a() {
        return this;
    }
}
