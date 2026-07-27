package B0;

import android.content.Context;
import androidx.work.impl.WorkDatabase_Impl;
import b1.C0267d;
import b1.C0274k;
import e4.InterfaceC0412a;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;

/* loaded from: classes.dex */
public final class n implements X0.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f167a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f168b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f169c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f170d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f167a = obj;
        this.f168b = obj2;
        this.f169c = obj3;
        this.f170d = obj4;
    }

    public Object a(final Q2.a aVar, String str) {
        return ((ConcurrentHashMap) this.f167a).computeIfAbsent(str, new Function() { // from class: L3.c
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                B0.n nVar = B0.n.this;
                nVar.getClass();
                int i2 = J3.a.f1351e;
                Q2.a aVar2 = aVar;
                if (aVar2 == null) {
                    aVar2 = Q2.a.f2475d;
                }
                Object apply = ((Function) nVar.f170d).apply(J3.a.a(str2, null, null, aVar2));
                synchronized (nVar.f168b) {
                    ((Set) nVar.f169c).add(apply);
                }
                return apply;
            }
        });
    }

    @Override // e4.InterfaceC0412a
    public Object get() {
        return new C0274k((Executor) ((InterfaceC0412a) this.f167a).get(), (c1.d) ((InterfaceC0412a) this.f168b).get(), (C0267d) ((B4.i) this.f169c).get(), (d1.c) ((InterfaceC0412a) this.f170d).get());
    }

    public n(WorkDatabase_Impl workDatabase_Impl) {
        this.f167a = workDatabase_Impl;
        this.f168b = new b(workDatabase_Impl, 4);
        this.f169c = new h(workDatabase_Impl, 2);
        this.f170d = new h(workDatabase_Impl, 3);
    }

    public n(Context context, B4.i iVar) {
        kotlin.jvm.internal.i.e(context, "context");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext, "context.applicationContext");
        z0.a aVar = new z0.a(applicationContext, iVar, 0);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext2, "context.applicationContext");
        z0.a aVar2 = new z0.a(applicationContext2, iVar, 1);
        Context applicationContext3 = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext3, "context.applicationContext");
        String str = z0.i.f12461a;
        z0.h hVar = new z0.h(applicationContext3, iVar);
        Context applicationContext4 = context.getApplicationContext();
        kotlin.jvm.internal.i.d(applicationContext4, "context.applicationContext");
        z0.a aVar3 = new z0.a(applicationContext4, iVar, 2);
        this.f167a = aVar;
        this.f168b = aVar2;
        this.f169c = hVar;
        this.f170d = aVar3;
    }

    public n(Function function) {
        this.f167a = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f168b = new Object();
        this.f169c = Collections.newSetFromMap(new IdentityHashMap());
        this.f170d = function;
    }

    public n(String str, String[] strArr, String str2, G2.o oVar) {
        this.f167a = str;
        this.f168b = strArr;
        this.f170d = str2;
        this.f169c = oVar;
    }
}
