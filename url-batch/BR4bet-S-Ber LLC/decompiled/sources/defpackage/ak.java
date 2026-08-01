package defpackage;

import android.text.InputFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class ak extends kr {
    public final zj o;

    public ak(TextView textView) {
        this.o = new zj(textView);
    }

    @Override // defpackage.kr
    public final void a0(boolean z) {
        if (lj.k != null) {
            this.o.a0(z);
        }
    }

    @Override // defpackage.kr
    public final void b0(boolean z) {
        boolean z2 = lj.k != null;
        zj zjVar = this.o;
        if (z2) {
            zjVar.b0(z);
        } else {
            zjVar.q = z;
        }
    }

    @Override // defpackage.kr
    public final InputFilter[] z(InputFilter[] inputFilterArr) {
        return !(lj.k != null) ? inputFilterArr : this.o.z(inputFilterArr);
    }
}
