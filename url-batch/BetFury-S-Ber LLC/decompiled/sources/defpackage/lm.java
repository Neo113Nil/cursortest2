package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class lm implements km {
    public final /* synthetic */ int f;
    public final String g;

    public /* synthetic */ lm(String str, int i) {
        this.f = i;
        this.g = str;
    }

    @Override // defpackage.km
    public boolean b(CharSequence charSequence, int i, int i2, nk0 nk0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.g)) {
            return true;
        }
        nk0Var.c = (nk0Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f) {
            case 1:
                return "<" + this.g + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.km
    public Object a() {
        return this;
    }
}
