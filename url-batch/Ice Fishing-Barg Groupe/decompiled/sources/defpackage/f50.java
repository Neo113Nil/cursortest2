package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class f50 implements d50 {
    public final String OPXfSBeufaJ8;
    public final /* synthetic */ int rtx2ld2ELZv4;

    public /* synthetic */ f50(String str, int i) {
        this.rtx2ld2ELZv4 = i;
        this.OPXfSBeufaJ8 = str;
    }

    @Override // defpackage.d50
    public boolean lS5Rgt96tfkO(CharSequence charSequence, int i, int i2, xm2 xm2Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.OPXfSBeufaJ8)) {
            return true;
        }
        xm2Var.TSizfFm2Yiuu = (xm2Var.TSizfFm2Yiuu & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.rtx2ld2ELZv4) {
            case 1:
                return o0.QrzZRwfaDlRX(new StringBuilder("<"), this.OPXfSBeufaJ8, '>');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.d50
    public Object PxuCJdSBwIXG() {
        return this;
    }
}
