package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ph extends vw {
    public final oh o;

    public ph(TextView textView) {
        this.o = new oh(textView);
    }

    @Override // defpackage.vw
    public final InputFilter[] B(InputFilter[] inputFilterArr) {
        return !(ch.k != null) ? inputFilterArr : this.o.B(inputFilterArr);
    }

    @Override // defpackage.vw
    public final void g0(boolean z) {
        if (ch.k != null) {
            this.o.g0(z);
        }
    }

    @Override // defpackage.vw
    public final void h0(boolean z) {
        boolean z2 = ch.k != null;
        oh ohVar = this.o;
        if (z2) {
            ohVar.h0(z);
        } else {
            ohVar.q = z;
        }
    }
}
