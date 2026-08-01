package V;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1289b;

    public /* synthetic */ q(String str, int i) {
        this.f1288a = i;
        this.f1289b = str;
    }

    @Override // V.p
    public boolean a(CharSequence charSequence, int i, int i2, y yVar) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f1289b)) {
            return true;
        }
        yVar.f1316c = (yVar.f1316c & 3) | 4;
        return false;
    }

    @Override // V.p
    public Object b() {
        return this;
    }

    public String toString() {
        switch (this.f1288a) {
            case 1:
                return "<" + this.f1289b + '>';
            default:
                return super.toString();
        }
    }
}
