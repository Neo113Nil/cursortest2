package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class eb3 {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ ln c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ ln f;

    public eb3(ln lnVar, int i, Bundle bundle) {
        this.f = lnVar;
        Boolean bool = Boolean.TRUE;
        this.c = lnVar;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract void a(c10 c10Var);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
        synchronized (this.c.x) {
            this.c.x.remove(this);
        }
    }
}
