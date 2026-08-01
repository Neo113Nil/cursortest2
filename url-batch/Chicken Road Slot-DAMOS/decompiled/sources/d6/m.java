package d6;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: r, reason: collision with root package name */
    public static final String f3643r = t5.o.f("StopWorkRunnable");

    /* renamed from: d, reason: collision with root package name */
    public final u5.m f3644d;

    /* renamed from: e, reason: collision with root package name */
    public final u5.i f3645e;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3646i;

    public m(u5.m mVar, u5.i iVar, boolean z10) {
        this.f3644d = mVar;
        this.f3645e = iVar;
        this.f3646i = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean b10;
        u5.o oVar;
        boolean z10 = this.f3646i;
        u5.m mVar = this.f3644d;
        if (z10) {
            u5.e eVar = mVar.f9654f;
            u5.i iVar = this.f3645e;
            eVar.getClass();
            String str = iVar.f9636a.f1824a;
            synchronized (eVar.f9632z) {
                try {
                    t5.o.d().a(u5.e.A, "Processor stopping foreground work " + str);
                    oVar = (u5.o) eVar.f9626t.remove(str);
                    if (oVar != null) {
                        eVar.f9628v.remove(str);
                    }
                } finally {
                }
            }
            b10 = u5.e.b(str, oVar);
        } else {
            u5.e eVar2 = mVar.f9654f;
            u5.i iVar2 = this.f3645e;
            eVar2.getClass();
            String str2 = iVar2.f9636a.f1824a;
            synchronized (eVar2.f9632z) {
                try {
                    u5.o oVar2 = (u5.o) eVar2.f9627u.remove(str2);
                    if (oVar2 == null) {
                        t5.o.d().a(u5.e.A, "WorkerWrapper could not be found for " + str2);
                    } else {
                        Set set = (Set) eVar2.f9628v.get(str2);
                        if (set != null && set.contains(iVar2)) {
                            t5.o.d().a(u5.e.A, "Processor stopping background work " + str2);
                            eVar2.f9628v.remove(str2);
                            b10 = u5.e.b(str2, oVar2);
                        }
                    }
                    b10 = false;
                } finally {
                }
            }
        }
        t5.o.d().a(f3643r, "StopWorkRunnable for " + this.f3645e.f9636a.f1824a + "; Processor.stopWork = " + b10);
    }
}
