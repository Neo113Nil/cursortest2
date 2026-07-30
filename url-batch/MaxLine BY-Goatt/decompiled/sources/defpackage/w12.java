package defpackage;

import android.widget.Magnifier;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class w12 implements u12 {
    public final Magnifier a;

    public w12(Magnifier magnifier) {
        this.a = magnifier;
    }

    @Override // defpackage.u12
    public void a(long j, long j2) {
        this.a.show(au1.d(j), au1.e(j));
    }

    public final void b() {
        this.a.dismiss();
    }

    public final long c() {
        return zm3.d(this.a.getWidth(), this.a.getHeight());
    }

    public final void d() {
        this.a.update();
    }
}
