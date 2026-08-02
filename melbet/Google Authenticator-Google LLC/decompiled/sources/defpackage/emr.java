package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class emr {
    private static final ems c = new ems(-1, -1);
    public final ems a;
    public final ems b;

    public emr() {
        this.b = c;
        this.a = new ems(SystemClock.elapsedRealtime(), dih.s().toMillis());
    }

    public emr(ems emsVar, ems emsVar2) {
        this.a = emsVar;
        this.b = emsVar2;
    }
}
