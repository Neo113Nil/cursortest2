package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rg0 extends tk3 {
    public final qg0 r;

    public rg0(TextView textView) {
        this.r = new qg0(textView);
    }

    @Override // defpackage.tk3
    public final InputFilter[] O(InputFilter[] inputFilterArr) {
        return !ag0.d() ? inputFilterArr : this.r.O(inputFilterArr);
    }

    @Override // defpackage.tk3
    public final void d0(boolean z) {
        if (ag0.d()) {
            this.r.d0(z);
        }
    }

    @Override // defpackage.tk3
    public final void e0(boolean z) {
        boolean d = ag0.d();
        qg0 qg0Var = this.r;
        if (d) {
            qg0Var.e0(z);
        } else {
            qg0Var.t = z;
        }
    }
}
