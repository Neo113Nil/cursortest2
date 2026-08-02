package defpackage;

import com.google.android.gms.common.GooglePlayServicesManifestException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dtd {
    public final ExecutorService j;
    public jfr k;
    public final ciq l;
    public final bst m;
    private final Object o;
    private final Map p;
    private static final jfr n = new jfr((byte[]) null);
    public static final String a = ihv.a.a;
    public static final String b = ihw.a.a;
    public static final String c = ihx.a.a;
    public static final String d = ihy.a.a;
    public static final String e = ihz.a.a;
    public static final String f = iia.a.a;
    public static final String g = iib.a.a;
    public static final String h = iic.a.a;
    public static final String i = iid.a.a;

    public dtd(ExecutorService executorService, ciq ciqVar, bst bstVar) {
        executorService.getClass();
        this.j = executorService;
        this.l = ciqVar;
        this.m = bstVar;
        this.o = new Object();
        this.p = new LinkedHashMap();
        this.k = n;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(eht ehtVar, kqj kqjVar) {
        dsx dsxVar;
        int i2;
        if (kqjVar instanceof dsx) {
            dsxVar = (dsx) kqjVar;
            int i3 = dsxVar.c;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dsxVar.c = i3 - Integer.MIN_VALUE;
                Object obj = dsxVar.a;
                kqp kqpVar = kqp.a;
                i2 = dsxVar.c;
                if (i2 != 0) {
                    ixc.Y(obj);
                    dsxVar.c = 1;
                    obj = ixg.f(new kwn(this.j), new dta(this, ehtVar, (kqj) null, 0), dsxVar);
                    if (obj == kqpVar) {
                        return kqpVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ixc.Y(obj);
                }
                jfr jfrVar = (jfr) obj;
                for (Map.Entry entry : jfrVar.a.entrySet()) {
                    String str = (String) entry.getKey();
                    jfq jfqVar = (jfq) entry.getValue();
                    ksw kswVar = new ksw();
                    synchronized (this.o) {
                        Map map = this.p;
                        Iterable iterable = (List) map.get(str);
                        if (iterable == null) {
                            iterable = kpk.a;
                        }
                        kswVar.a = ixc.p(iterable);
                    }
                    Iterator it = ((List) kswVar.a).iterator();
                    while (it.hasNext()) {
                        ((dtx) it.next()).a(jfqVar);
                    }
                }
                return jfrVar;
            }
        }
        dsxVar = new dsx(this, kqjVar);
        Object obj2 = dsxVar.a;
        kqp kqpVar2 = kqp.a;
        i2 = dsxVar.c;
        if (i2 != 0) {
        }
        jfr jfrVar2 = (jfr) obj2;
        while (r7.hasNext()) {
        }
        return jfrVar2;
    }

    public final void b(jit jitVar, dtx dtxVar) {
        jfq jfqVar = (jfq) this.k.a.get(jitVar != null ? jitVar.c : null);
        if (jfqVar == null) {
            jfqVar = jfq.a;
        }
        if (jitVar != null && !this.k.a.containsKey(jitVar.c)) {
            synchronized (this.o) {
                Map map = this.p;
                String str = jitVar.c;
                Object obj = map.get(str);
                if (obj == null) {
                    obj = new ArrayList();
                    map.put(str, obj);
                }
                ((List) obj).add(dtxVar);
            }
        }
        dtxVar.a(jfqVar);
    }

    public final void c(jit jitVar, dtx dtxVar) {
        dtxVar.getClass();
        if (jitVar != null) {
            synchronized (this.o) {
                Map map = this.p;
                List list = (List) map.get(jitVar.c);
                if (list != null) {
                    list.remove(dtxVar);
                }
                if (list != null && list.isEmpty()) {
                    map.remove(jitVar.c);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Object obj, krt krtVar, kqj kqjVar) {
        dsu dsuVar;
        int i2;
        try {
            if (kqjVar instanceof dsu) {
                dsuVar = (dsu) kqjVar;
                int i3 = dsuVar.d;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    dsuVar.d = i3 - Integer.MIN_VALUE;
                    Object obj2 = dsuVar.b;
                    Object obj3 = kqp.a;
                    i2 = dsuVar.d;
                    if (i2 == 0) {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Object obj4 = dsuVar.a;
                        ixc.Y(obj2);
                        return obj2;
                    }
                    ixc.Y(obj2);
                    dsuVar.a = obj;
                    dsuVar.d = 1;
                    Object a2 = krtVar.a(dsuVar);
                    return a2 == obj3 ? obj3 : a2;
                }
            }
            if (i2 == 0) {
            }
        } catch (Exception e2) {
            if ((e2 instanceof cmm) || (e2 instanceof chh) || (e2 instanceof GooglePlayServicesManifestException) || (e2 instanceof IOException)) {
                return obj;
            }
            throw e2;
        }
        dsuVar = new dsu(this, kqjVar);
        Object obj22 = dsuVar.b;
        Object obj32 = kqp.a;
        i2 = dsuVar.d;
    }

    public final Object e(cid cidVar, String str, boolean z, kqj kqjVar) {
        return d(Boolean.valueOf(z), new dsw(this, cidVar, str, z, null), kqjVar);
    }
}
