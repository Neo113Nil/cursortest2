package r3;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class q0<TListener> {

    /* renamed from: a, reason: collision with root package name */
    private TListener f21319a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f21320b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f21321c;

    public q0(c cVar, TListener tlistener) {
        this.f21321c = cVar;
        this.f21319a = tlistener;
    }

    protected abstract void a();

    protected abstract void b(TListener tlistener);

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f21319a;
            if (this.f21320b) {
                String valueOf = String.valueOf(this);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                sb.append("Callback proxy ");
                sb.append(valueOf);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                b(tlistener);
            } catch (RuntimeException e7) {
                throw e7;
            }
        }
        synchronized (this) {
            this.f21320b = true;
        }
        d();
    }

    public final void d() {
        ArrayList arrayList;
        ArrayList arrayList2;
        e();
        arrayList = this.f21321c.f21219r;
        synchronized (arrayList) {
            arrayList2 = this.f21321c.f21219r;
            arrayList2.remove(this);
        }
    }

    public final void e() {
        synchronized (this) {
            this.f21319a = null;
        }
    }
}
