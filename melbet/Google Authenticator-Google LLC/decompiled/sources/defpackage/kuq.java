package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kuq {
    public final Object a;
    public final Object b;

    public kuq(kvs[] kvsVarArr) {
        this.a = kvsVarArr;
        this.b = new kui(kvsVarArr.length, kul.a);
    }

    public final kuq a(TimeUnit timeUnit) {
        return new kuq(this.a, ((jww) this.b).a(jxs.c(10L, timeUnit)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kri] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kys] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kqj kqjVar) {
        kna knaVar;
        int i;
        if (kqjVar instanceof kna) {
            knaVar = (kna) kqjVar;
            int i2 = knaVar.b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                knaVar.b = i2 - Integer.MIN_VALUE;
                Object obj = knaVar.a;
                kqp kqpVar = kqp.a;
                i = knaVar.b;
                if (i == 0 && i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ixc.Y(obj);
                while (!((Boolean) this.b.a()).booleanValue()) {
                    ?? r5 = this.a;
                    knaVar.b = 1;
                    if (r5.d(knaVar) == kqpVar) {
                        return kqpVar;
                    }
                }
                return kow.a;
            }
        }
        knaVar = new kna(this, kqjVar);
        Object obj2 = knaVar.a;
        kqp kqpVar2 = kqp.a;
        i = knaVar.b;
        if (i == 0) {
        }
        ixc.Y(obj2);
        while (!((Boolean) this.b.a()).booleanValue()) {
        }
        return kow.a;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    public final void c() {
        ((kbv) this.a).b = true;
        this.b.cancel(false);
    }

    public final boolean d() {
        kbv kbvVar = (kbv) this.a;
        return (kbvVar.c || kbvVar.b) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    public final void e(kae kaeVar) {
        this.a.add(kaeVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    public final Collection f() {
        return this.a.values();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public final agh g(agh aghVar) {
        iwi.b(aghVar);
        return new jqf(this.a, aghVar, (bod) this.b);
    }

    public final kuq h(kbh kbhVar) {
        return new kuq(this.b, kbhVar, (byte[]) null);
    }

    public kuq(Object obj, Object obj2, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
    }

    public kuq(Map map, bod bodVar) {
        this.a = map;
        this.b = bodVar;
    }

    public kuq(kbq kbqVar, Object obj) {
        kbqVar.getClass();
        this.b = kbqVar;
        this.a = obj;
    }

    public kuq(kri kriVar) {
        this.b = kriVar;
        this.a = ixj.h(-1, 0, 6);
    }

    public kuq(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public kuq(jwx jwxVar, jww jwwVar, byte[] bArr) {
        this(jwxVar, jwwVar);
    }

    public kuq(kbl kblVar, Map map) {
        this.b = kblVar;
        this.a = DesugarCollections.unmodifiableMap(new HashMap(map));
    }

    public kuq(String str) {
        this.a = new ArrayList();
        this.b = str;
    }

    public kuq(kbv kbvVar, ScheduledFuture scheduledFuture) {
        this.a = kbvVar;
        scheduledFuture.getClass();
        this.b = scheduledFuture;
    }

    public kuq(her herVar) {
        int i = kcj.a;
        this.b = new kcg();
        this.a = herVar;
    }
}
