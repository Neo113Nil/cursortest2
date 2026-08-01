package defpackage;

import com.trembin.nirefon.betfury.data.NoteDatabase_Impl;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class na0 extends ty {
    public final NoteDatabase_Impl l;
    public final i5 m;
    public final sa0 n;
    public final AtomicBoolean o;
    public final AtomicBoolean p;
    public final AtomicBoolean q;
    public final qg r;
    public final tr s;

    public na0(NoteDatabase_Impl noteDatabase_Impl, i5 i5Var, String[] strArr, tr trVar) {
        i5Var.getClass();
        this.l = noteDatabase_Impl;
        this.m = i5Var;
        this.n = new sa0(strArr, this);
        this.o = new AtomicBoolean(true);
        this.p = new AtomicBoolean(false);
        this.q = new AtomicBoolean(false);
        this.r = noteDatabase_Impl.inCompatibilityMode$room_runtime_release() ? noteDatabase_Impl.getQueryContext() : um.f;
        this.s = trVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0077 A[Catch: all -> 0x002d, Exception -> 0x0030, TRY_ENTER, TRY_LEAVE, TryCatch #1 {Exception -> 0x0030, blocks: (B:11:0x0029, B:15:0x0077), top: B:10:0x0029, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094 A[Catch: all -> 0x002d, TryCatch #2 {all -> 0x002d, blocks: (B:11:0x0029, B:13:0x006f, B:15:0x0077, B:24:0x0094, B:25:0x0096, B:33:0x00a6, B:38:0x00b2, B:51:0x008a, B:52:0x0091, B:27:0x0097, B:30:0x00a0, B:31:0x00a2), top: B:10:0x0029, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x006d -> B:12:0x006f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00bf -> B:37:0x00c0). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(na0 na0Var, eg egVar) {
        ta0 ta0Var;
        int i;
        na0 na0Var2;
        Object[] objArr;
        if (egVar instanceof ta0) {
            ta0Var = (ta0) egVar;
            int i2 = ta0Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ta0Var.m = i2 - Integer.MIN_VALUE;
                Object obj = ta0Var.k;
                bh bhVar = bh.COROUTINE_SUSPENDED;
                i = ta0Var.m;
                dg dgVar = null;
                boolean z = false;
                Object[] objArr2 = 0;
                if (i == 0) {
                    if (i != 1) {
                        s9.u("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i3 = ta0Var.j;
                    na0Var2 = ta0Var.i;
                    try {
                        try {
                            mv.O(obj);
                            while (na0Var2.o.compareAndSet(true, false)) {
                                ta0Var.i = na0Var2;
                                ta0Var.j = 1;
                                ta0Var.m = 1;
                                obj = bi.R(ta0Var, na0Var2.s, na0Var2.l, true, false);
                                if (obj == bhVar) {
                                    return bhVar;
                                }
                                i3 = 1;
                            }
                            if (i3 != 0) {
                                synchronized (na0Var2.a) {
                                    objArr = na0Var2.f == ty.k;
                                    na0Var2.f = obj;
                                }
                                if (objArr != false) {
                                    x6.F().G(na0Var2.j);
                                }
                            }
                            if (i3 != 0 || !na0Var2.o.get()) {
                                return sk0.a;
                            }
                            na0Var = na0Var2;
                            na0Var2 = na0Var;
                            if (na0Var.p.compareAndSet(false, true)) {
                                i3 = 0;
                                if (i3 != 0) {
                                }
                                return sk0.a;
                            }
                            obj = null;
                            i3 = 0;
                            while (na0Var2.o.compareAndSet(true, false)) {
                            }
                            if (i3 != 0) {
                            }
                            if (i3 != 0) {
                            }
                            return sk0.a;
                        } catch (Exception e) {
                            throw new RuntimeException("Exception while computing database live data.", e);
                        }
                    } finally {
                        na0Var2.p.set(false);
                    }
                }
                mv.O(obj);
                if (na0Var.q.compareAndSet(false, true)) {
                    uv invalidationTracker = na0Var.l.getInvalidationTracker();
                    sa0 sa0Var = na0Var.n;
                    invalidationTracker.getClass();
                    sa0Var.getClass();
                    if (invalidationTracker.a(new rn0(invalidationTracker, sa0Var))) {
                        d50.U(new sv(invalidationTracker, dgVar, objArr2 == true ? 1 : 0));
                    }
                }
                na0Var2 = na0Var;
                if (na0Var.p.compareAndSet(false, true)) {
                }
            }
        }
        ta0Var = new ta0(na0Var, egVar);
        Object obj2 = ta0Var.k;
        bh bhVar2 = bh.COROUTINE_SUSPENDED;
        i = ta0Var.m;
        dg dgVar2 = null;
        boolean z2 = false;
        Object[] objArr22 = 0;
        if (i == 0) {
        }
    }

    @Override // defpackage.ty
    public final void e() {
        i5 i5Var = this.m;
        i5Var.getClass();
        ((Set) i5Var.h).add(this);
        gk0.y(this.l.getCoroutineScope(), this.r, new ra0(this, null, 1), 2);
    }

    @Override // defpackage.ty
    public final void f() {
        i5 i5Var = this.m;
        i5Var.getClass();
        ((Set) i5Var.h).remove(this);
    }
}
