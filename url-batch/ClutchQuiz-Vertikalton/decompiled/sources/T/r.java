package T;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f830a;

    /* renamed from: b, reason: collision with root package name */
    public final String f831b;

    public /* synthetic */ r(String str, int i) {
        this.f830a = i;
        this.f831b = str;
    }

    @Override // T.q
    public Object a() {
        return this;
    }

    @Override // T.q
    public boolean b(CharSequence charSequence, int i, int i2, z zVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f831b)) {
            return true;
        }
        zVar.f854c = (zVar.f854c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f830a) {
            case 1:
                return "<" + this.f831b + '>';
            default:
                return super.toString();
        }
    }
}
