package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y12 extends w12 {
    @Override // defpackage.w12, defpackage.u12
    public final void a(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.a.setZoom(Float.NaN);
        }
        boolean D = ap.D(j2);
        Magnifier magnifier = this.a;
        if (D) {
            magnifier.show(au1.d(j), au1.e(j), au1.d(j2), au1.e(j2));
        } else {
            magnifier.show(au1.d(j), au1.e(j));
        }
    }
}
