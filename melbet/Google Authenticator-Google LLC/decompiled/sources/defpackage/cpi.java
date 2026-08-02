package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class cpi {
    public Object d;
    public boolean e = false;
    final /* synthetic */ cpo f;

    public cpi(cpo cpoVar, Object obj) {
        this.f = cpoVar;
        this.d = obj;
    }

    protected abstract void c();

    public final void d() {
        synchronized (this) {
            this.d = null;
        }
    }

    public final void e() {
        d();
        ArrayList arrayList = this.f.g;
        synchronized (arrayList) {
            arrayList.remove(this);
        }
    }
}
