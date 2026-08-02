package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.BadParcelableException;
import android.util.Log;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvx {
    public static long a = Math.abs(new Random().nextInt()) << 30;
    public static final HashMap b = new HashMap();
    public static final Object c = new Object();
    public static gut d;

    public static final gzf a(gzf gzfVar) {
        gzfVar.getClass();
        return new gvv(gta.d(false), gzfVar);
    }

    public static final htq b(htq htqVar) {
        return new gvt(gta.d(false), htqVar, 0);
    }

    public static final htr c(htr htrVar) {
        return new hts(gta.d(false), htrVar, 1);
    }

    public static final htt d(final htt httVar) {
        final guq d2 = gta.d(false);
        return new htt() { // from class: gvq
            @Override // defpackage.htt
            public final htz a(bry bryVar, Object obj) {
                long j = gvx.a;
                bryVar.getClass();
                guq g = gta.g(gta.a(), guq.this);
                try {
                    return httVar.a(bryVar, obj);
                } finally {
                }
            }
        };
    }

    public static final htv e(htv htvVar) {
        return new gvp(gta.d(false), htvVar, 0);
    }

    public static final hut f(hut hutVar) {
        return new gvw(gta.d(false), hutVar);
    }

    public static final Runnable g(Runnable runnable) {
        return new evb(p(), runnable, 15);
    }

    public static final Runnable h(Runnable runnable) {
        runnable.getClass();
        return new kbu(new ksw(), gta.d(false), runnable, 1);
    }

    public static final Callable i(Callable callable) {
        return new gvu(gta.d(false), callable, 1);
    }

    public static final Callable j(Callable callable) {
        return new gvu(p(), callable, 0);
    }

    public static final void k(Intent intent) {
        intent.getClass();
        if (guf.a == gue.a || intent.hasExtra("tracing_intent_id")) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Was supposed to propagate trace for startActivity - did you forget to propagate it? See http://go/tiktok-conformance-violations/TRACE_PROPAGATION_FOR_START_ACTIVITY for more details.");
        if (guf.a != gue.c) {
            throw illegalStateException;
        }
        Log.e("TracePropagation", "Unpropagated Trace for startActivity", illegalStateException);
    }

    public static final void l(Context context, Intent intent) {
        intent.getClass();
        Intent intent2 = new Intent(intent);
        gvr o = o(intent2);
        try {
            context.startActivity(intent2);
            ixf.j(o, null);
        } finally {
        }
    }

    public static final guq m(Intent intent, boolean z) {
        guq guqVar;
        try {
            if (!intent.hasExtra("tracing_intent_id")) {
                return null;
            }
            long longExtra = intent.getLongExtra("tracing_intent_id", -1L);
            HashMap hashMap = b;
            synchronized (hashMap) {
                guqVar = (guq) (z ? hashMap.remove(Long.valueOf(longExtra)) : hashMap.get(Long.valueOf(longExtra)));
            }
            return guqVar;
        } catch (BadParcelableException unused) {
            return null;
        }
    }

    public static final boolean n() {
        gun a2 = gta.a();
        if (gta.b) {
            return false;
        }
        guq guqVar = a2.c;
        return ((guqVar == null || ksp.b(guqVar, gtw.a)) && a2.d == null) ? false : true;
    }

    public static final gvr o(Intent intent) {
        long j;
        guq d2 = gta.d(false);
        guq b2 = gta.b();
        if (b2 != null) {
            guc gucVar = gsl.a;
            hoq hoqVar = gsl.c;
            if (!b2.k(hoqVar).b()) {
                synchronized (b2) {
                    if (!b2.k(hoqVar).b()) {
                        b2.u(hoqVar, true);
                    }
                }
            }
        }
        HashMap hashMap = b;
        synchronized (hashMap) {
            j = a;
            a = 1 + j;
        }
        intent.putExtra("tracing_intent_id", j);
        return new gvr(j);
    }

    private static final guq p() {
        gun a2 = gta.a();
        guq guqVar = a2.c;
        if (guqVar != null && !ksp.b(guqVar, gtw.a)) {
            guq guqVar2 = a2.c;
            guqVar2.getClass();
            return guqVar2;
        }
        guq guqVar3 = a2.d;
        if (guqVar3 != null) {
            return guqVar3;
        }
        throw new IllegalStateException("This is not reachable if guarded by shouldPropagateExecutorTrace.");
    }
}
