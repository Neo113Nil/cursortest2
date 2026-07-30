package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class fv implements ev {
    public final /* synthetic */ int d;
    public final String e;

    public /* synthetic */ fv(String str, int i) {
        this.d = i;
        this.e = str;
    }

    @Override // defpackage.ev
    public boolean b(CharSequence charSequence, int i, int i2, yj1 yj1Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.e)) {
            return true;
        }
        yj1Var.c = (yj1Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.d) {
            case 1:
                return "<" + this.e + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.ev
    public Object a() {
        return this;
    }
}
