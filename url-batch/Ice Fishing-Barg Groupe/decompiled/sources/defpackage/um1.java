package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class um1 extends sm1 {
    @Override // defpackage.sm1, defpackage.pm1
    public final void PxuCJdSBwIXG(long j, long j2) {
        if (!Float.isNaN(Float.NaN)) {
            this.PxuCJdSBwIXG.setZoom(Float.NaN);
        }
        long j3 = 9223372034707292159L & j2;
        Magnifier magnifier = this.PxuCJdSBwIXG;
        if (j3 != 9205357640488583168L) {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        }
    }
}
