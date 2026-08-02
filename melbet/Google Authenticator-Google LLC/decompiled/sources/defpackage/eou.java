package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.ArrayMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eou extends eos implements ekq, emk {
    public final Context a;
    public final eph b;
    public final ArrayMap c;
    public final emi d;
    public final koe e;
    public final epa f;
    public final gzp g;
    private final eor h;
    private final eot i;
    private final bry j;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, koe] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, koe] */
    public eou(ldt ldtVar, Context context, bry bryVar, jpt jptVar, eor eorVar, koe koeVar, koe koeVar2, Executor executor, fwm fwmVar, koe koeVar3, epa epaVar, gzp gzpVar) {
        super((byte[]) null);
        ArrayMap arrayMap = new ArrayMap();
        this.c = arrayMap;
        this.d = ldtVar.n(executor, jptVar, koeVar2);
        this.a = context;
        this.j = bryVar;
        this.e = koeVar;
        this.h = eorVar;
        eot eotVar = new eot(context, arrayMap, koeVar3);
        this.i = eotVar;
        ?? b = fwmVar.b.b();
        b.getClass();
        ((hvm) fwmVar.a.b()).getClass();
        this.b = new eph(b, eotVar);
        this.f = epaVar;
        this.g = Build.VERSION.SDK_INT < 31 ? gyf.a : gzpVar;
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        ArrayMap arrayMap = this.c;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.emk
    public final void k() {
        bry bryVar = this.j;
        bryVar.g(this.b);
        bryVar.g(this.h);
    }

    @Override // defpackage.ekq
    public final /* synthetic */ void j(eik eikVar) {
    }
}
