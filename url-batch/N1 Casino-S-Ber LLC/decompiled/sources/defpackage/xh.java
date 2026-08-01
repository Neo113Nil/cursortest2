package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class xh extends e70 {
    public final wh i;

    public xh(TextView textView) {
        this.i = new wh(textView);
    }

    @Override // defpackage.e70
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        return !(kh.k != null) ? inputFilterArr : this.i.A(inputFilterArr);
    }

    @Override // defpackage.e70
    public final void P(boolean z) {
        if (kh.k != null) {
            this.i.P(z);
        }
    }

    @Override // defpackage.e70
    public final void Q(boolean z) {
        boolean z2 = kh.k != null;
        wh whVar = this.i;
        if (z2) {
            whVar.Q(z);
        } else {
            whVar.k = z;
        }
    }
}
