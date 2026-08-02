package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kge implements kjb {
    public final kbw b;
    public Runnable c;
    public Runnable d;
    public Runnable e;
    public kja f;
    private final Executor j;
    private final jyp i = jyp.a(kge.class, null);
    public final Object a = new Object();
    public Collection g = new LinkedHashSet();
    public volatile kuq h = new kuq((Object) null, (Object) null);

    public kge(Executor executor, kbw kbwVar) {
        this.j = executor;
        this.b = kbwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        r3 = new defpackage.kgd(r2, r0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r0.a.f() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r4 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r4.c() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        r3.b = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        r2.g.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        monitor-enter(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        r4 = r2.g.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [kfg] */
    /* JADX WARN: Type inference failed for: r3v4, types: [kgp] */
    /* JADX WARN: Type inference failed for: r3v5, types: [kfg] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, kgd] */
    @Override // defpackage.kfj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final kfg a(kae kaeVar, kaa kaaVar, jww jwwVar, jxb[] jxbVarArr) {
        ?? kgpVar;
        jze jzeVar;
        kuq kuqVar;
        int size;
        try {
            jzf jzfVar = new jzf(kaeVar, kaaVar, jwwVar, new kjn());
            kuq kuqVar2 = this.h;
            while (true) {
                Object obj = kuqVar2.b;
                if (obj != null) {
                    kgpVar = new kgp((kbq) obj, jxbVarArr);
                    break;
                }
                Object obj2 = kuqVar2.a;
                if (obj2 != null) {
                    jzeVar = ((jzi) obj2).a(jzfVar);
                    jww jwwVar2 = jzfVar.a;
                    kfj c = khd.c(jzeVar, jwwVar2.f());
                    if (c != null) {
                        kgpVar = c.a(jzfVar.c, jzfVar.b, jwwVar2, jxbVarArr);
                        break;
                    }
                } else {
                    jzeVar = null;
                }
                Object obj3 = this.a;
                synchronized (obj3) {
                    kuqVar = this.h;
                    if (kuqVar2 == kuqVar) {
                        break;
                    }
                }
                if (size == 1) {
                    this.b.b(this.c);
                }
                for (jxb jxbVar : jxbVarArr) {
                }
                kuqVar2 = kuqVar;
            }
        } finally {
            this.b.a();
        }
    }

    @Override // defpackage.kjb
    public final Runnable b(kja kjaVar) {
        throw null;
    }

    @Override // defpackage.jyv
    public final jyp c() {
        return this.i;
    }

    final void d(jzi jziVar) {
        Runnable runnable;
        synchronized (this.a) {
            this.h = new kuq(jziVar, this.h.b);
            if (jziVar != null && f()) {
                ArrayList arrayList = new ArrayList(this.g);
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    kgd kgdVar = (kgd) arrayList.get(i);
                    jzf jzfVar = kgdVar.a;
                    jze a = jziVar.a(jzfVar);
                    jww jwwVar = jzfVar.a;
                    if (jwwVar.f() && a.c()) {
                        kgdVar.b = a.c;
                    }
                    kfj c = khd.c(a, jwwVar.f());
                    if (c != null) {
                        Executor executor = this.j;
                        Executor executor2 = jwwVar.c;
                        Runnable b = kgdVar.b(c);
                        if (b != null) {
                            if (executor2 != null) {
                                executor = executor2;
                            }
                            executor.execute(b);
                        }
                        arrayList2.add(kgdVar);
                    }
                }
                synchronized (this.a) {
                    if (f()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            this.g.remove((kgd) it.next());
                        }
                        if (this.g.isEmpty()) {
                            this.g = new LinkedHashSet();
                        }
                        if (!f()) {
                            kbw kbwVar = this.b;
                            kbwVar.b(this.d);
                            if (this.h.b != null && (runnable = this.e) != null) {
                                kbwVar.b(runnable);
                                this.e = null;
                            }
                        }
                        this.b.a();
                    }
                }
            }
        }
    }

    @Override // defpackage.kjb
    public final void e(kbq kbqVar) {
        Runnable runnable;
        synchronized (this.a) {
            if (this.h.b != null) {
                return;
            }
            this.h = new kuq(this.h.a, kbqVar);
            kbw kbwVar = this.b;
            kbwVar.b(new kgf(this, 1));
            if (!f() && (runnable = this.e) != null) {
                kbwVar.b(runnable);
                this.e = null;
            }
            this.b.a();
        }
    }

    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = !this.g.isEmpty();
        }
        return z;
    }
}
