package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class xj implements wj {
    public final /* synthetic */ int f;
    public final String g;

    public /* synthetic */ xj(String str, int i) {
        this.f = i;
        this.g = str;
    }

    @Override // defpackage.wj
    public boolean f(CharSequence charSequence, int i, int i2, sa0 sa0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.g)) {
            return true;
        }
        sa0Var.c = (sa0Var.c & 3) | 4;
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

    @Override // defpackage.wj
    public Object a() {
        return this;
    }
}
