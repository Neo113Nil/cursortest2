package b3;

import A.AbstractC0017m;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class t implements k1.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5688d;

    /* renamed from: e, reason: collision with root package name */
    public String f5689e;

    @Override // k1.l
    public Object a() {
        return this;
    }

    @Override // k1.l
    public boolean d(CharSequence charSequence, int i2, int i4, k1.q qVar) {
        if (!TextUtils.equals(charSequence.subSequence(i2, i4), this.f5689e)) {
            return true;
        }
        qVar.f7411c = (qVar.f7411c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f5688d) {
            case 0:
                return AbstractC0017m.m(new StringBuilder("<"), this.f5689e, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ t(String str, int i2) {
        this.f5688d = i2;
        this.f5689e = str;
    }
}
