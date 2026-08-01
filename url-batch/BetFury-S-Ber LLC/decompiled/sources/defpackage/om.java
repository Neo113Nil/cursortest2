package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class om extends d50 {
    public final nm k;

    public om(TextView textView) {
        this.k = new nm(textView);
    }

    @Override // defpackage.d50
    public final void V(boolean z) {
        if (zl.k != null) {
            this.k.V(z);
        }
    }

    @Override // defpackage.d50
    public final void X(boolean z) {
        boolean z2 = zl.k != null;
        nm nmVar = this.k;
        if (z2) {
            nmVar.X(z);
        } else {
            nmVar.m = z;
        }
    }

    @Override // defpackage.d50
    public final InputFilter[] w(InputFilter[] inputFilterArr) {
        return !(zl.k != null) ? inputFilterArr : this.k.w(inputFilterArr);
    }
}
