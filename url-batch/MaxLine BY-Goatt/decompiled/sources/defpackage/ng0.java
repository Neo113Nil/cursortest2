package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ng0 implements lg0 {
    public final /* synthetic */ int m;
    public final String n;

    public /* synthetic */ ng0(String str, int i) {
        this.m = i;
        this.n = str;
    }

    @Override // defpackage.lg0
    public boolean d(CharSequence charSequence, int i, int i2, e13 e13Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.n)) {
            return true;
        }
        e13Var.c = (e13Var.c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.m) {
            case 1:
                return in1.m(new StringBuilder("<"), this.n, '>');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.lg0
    public Object a() {
        return this;
    }
}
