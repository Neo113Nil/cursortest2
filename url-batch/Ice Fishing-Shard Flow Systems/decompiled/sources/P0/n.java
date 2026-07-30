package P0;

import P.C0139d;
import P.C0145j;
import P.C0148m;
import P.Q;
import P.f0;
import P.l0;
import T6.u;
import T6.v;
import T6.w;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.work.impl.WorkDatabase_Impl;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0646b;
import l.C0651g;
import l.InterfaceC0645a;
import m.MenuC0674C;
import m.t;
import n6.AbstractC0792z;
import n6.C0781n;
import u.C0939j;
import v5.C0975a;
import v6.InterfaceC0979a;

/* loaded from: classes.dex */
public final class n implements v, InterfaceC0645a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2213d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2214e;

    /* renamed from: i, reason: collision with root package name */
    public Object f2215i;

    /* renamed from: l, reason: collision with root package name */
    public Object f2216l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2217m;

    public /* synthetic */ n() {
        this.f2213d = 3;
    }

    @Override // T6.v
    public w a() {
        return (U6.d) this.f2216l;
    }

    @Override // l.InterfaceC0645a
    public boolean b(AbstractC0646b abstractC0646b, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f2214e;
        C0651g h7 = h(abstractC0646b);
        C0939j c0939j = (C0939j) this.f2217m;
        Menu menu2 = (Menu) c0939j.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC0674C((Context) this.f2215i, (m.m) menu);
            c0939j.put(menu, menu2);
        }
        return callback.onCreateActionMode(h7, menu2);
    }

    @Override // l.InterfaceC0645a
    public boolean c(AbstractC0646b abstractC0646b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f2214e).onActionItemClicked(h(abstractC0646b), new t((Context) this.f2215i, (D.a) menuItem));
    }

    @Override // l.InterfaceC0645a
    public boolean d(AbstractC0646b abstractC0646b, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f2214e;
        C0651g h7 = h(abstractC0646b);
        C0939j c0939j = (C0939j) this.f2217m;
        Menu menu2 = (Menu) c0939j.get(menu);
        if (menu2 == null) {
            menu2 = new MenuC0674C((Context) this.f2215i, (m.m) menu);
            c0939j.put(menu, menu2);
        }
        return callback.onPrepareActionMode(h7, menu2);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(X5.c cVar) {
        C0145j c0145j;
        int i2;
        n nVar;
        C0139d c0139d;
        Q q4 = (Q) this.f2217m;
        if (cVar instanceof C0145j) {
            c0145j = (C0145j) cVar;
            int i5 = c0145j.f2107l;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0145j.f2107l = i5 - Integer.MIN_VALUE;
                Object obj = c0145j.f2105e;
                W5.a aVar = W5.a.f2787d;
                i2 = c0145j.f2107l;
                if (i2 != 0) {
                    V6.b.P(obj);
                    List list = (List) this.f2216l;
                    if (list == null || list.isEmpty()) {
                        c0145j.f2104d = this;
                        c0145j.f2107l = 1;
                        obj = Q.f(q4, false, c0145j);
                        if (obj != aVar) {
                            nVar = this;
                            c0139d = (C0139d) obj;
                        }
                    } else {
                        l0 g7 = q4.g();
                        C0148m c0148m = new C0148m(q4, this, null);
                        c0145j.f2104d = this;
                        c0145j.f2107l = 2;
                        obj = g7.b(c0148m, c0145j);
                        if (obj != aVar) {
                            nVar = this;
                            c0139d = (C0139d) obj;
                        }
                    }
                    return aVar;
                }
                if (i2 == 1) {
                    nVar = c0145j.f2104d;
                    V6.b.P(obj);
                    c0139d = (C0139d) obj;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    nVar = c0145j.f2104d;
                    V6.b.P(obj);
                    c0139d = (C0139d) obj;
                }
                ((Q) nVar.f2217m).f2024p.w(c0139d);
                return Unit.f6114a;
            }
        }
        c0145j = new C0145j(this, cVar);
        Object obj2 = c0145j.f2105e;
        W5.a aVar2 = W5.a.f2787d;
        i2 = c0145j.f2107l;
        if (i2 != 0) {
        }
        ((Q) nVar.f2217m).f2024p.w(c0139d);
        return Unit.f6114a;
    }

    @Override // l.InterfaceC0645a
    public void f(AbstractC0646b abstractC0646b) {
        ((ActionMode.Callback) this.f2214e).onDestroyActionMode(h(abstractC0646b));
    }

    public Object g(final C4.f fVar, String str) {
        return ((ConcurrentHashMap) this.f2214e).computeIfAbsent(str, new Function() { // from class: x5.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                P0.n nVar = P0.n.this;
                C4.f fVar2 = fVar;
                String str2 = (String) obj;
                int i2 = C0975a.f8219e;
                if (fVar2 == null) {
                    fVar2 = C4.b.f297l;
                }
                Object apply = ((Function) nVar.f2217m).apply(C0975a.a(str2, null, null, fVar2));
                synchronized (nVar.f2215i) {
                    ((Set) nVar.f2216l).add(apply);
                }
                return apply;
            }
        });
    }

    public C0651g h(AbstractC0646b abstractC0646b) {
        ArrayList arrayList = (ArrayList) this.f2216l;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0651g c0651g = (C0651g) arrayList.get(i2);
            if (c0651g != null && c0651g.f6217b == abstractC0646b) {
                return c0651g;
            }
        }
        C0651g c0651g2 = new C0651g((Context) this.f2215i, abstractC0646b);
        arrayList.add(c0651g2);
        return c0651g2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:25:0x0065, B:27:0x006f, B:30:0x007b), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007b A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:25:0x0065, B:27:0x006f, B:30:0x007b), top: B:24:0x0065 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v5, types: [v6.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(X5.c cVar) {
        f0 f0Var;
        int i2;
        v6.c cVar2;
        n nVar;
        InterfaceC0979a interfaceC0979a;
        Throwable th;
        n nVar2;
        try {
            if (cVar instanceof f0) {
                f0Var = (f0) cVar;
                int i5 = f0Var.f2084m;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    f0Var.f2084m = i5 - Integer.MIN_VALUE;
                    Object obj = f0Var.f2082i;
                    W5.a aVar = W5.a.f2787d;
                    i2 = f0Var.f2084m;
                    if (i2 != 0) {
                        V6.b.P(obj);
                        if (((C0781n) this.f2215i).G()) {
                            return Unit.f6114a;
                        }
                        cVar2 = (v6.c) this.f2214e;
                        f0Var.f2080d = this;
                        f0Var.f2081e = cVar2;
                        f0Var.f2084m = 1;
                        if (cVar2.c(f0Var) != aVar) {
                            nVar = this;
                        }
                        return aVar;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC0979a = f0Var.f2081e;
                        nVar2 = f0Var.f2080d;
                        try {
                            V6.b.P(obj);
                            C0781n c0781n = (C0781n) nVar2.f2215i;
                            Unit unit = Unit.f6114a;
                            c0781n.J(unit);
                            ((v6.c) interfaceC0979a).e(null);
                            return unit;
                        } catch (Throwable th2) {
                            th = th2;
                            ((v6.c) interfaceC0979a).e(null);
                            throw th;
                        }
                    }
                    ?? r22 = f0Var.f2081e;
                    nVar = f0Var.f2080d;
                    V6.b.P(obj);
                    cVar2 = r22;
                    if (!((C0781n) nVar.f2215i).G()) {
                        Unit unit2 = Unit.f6114a;
                        cVar2.e(null);
                        return unit2;
                    }
                    f0Var.f2080d = nVar;
                    f0Var.f2081e = cVar2;
                    f0Var.f2084m = 2;
                    if (nVar.e(f0Var) != aVar) {
                        interfaceC0979a = cVar2;
                        nVar2 = nVar;
                        C0781n c0781n2 = (C0781n) nVar2.f2215i;
                        Unit unit3 = Unit.f6114a;
                        c0781n2.J(unit3);
                        ((v6.c) interfaceC0979a).e(null);
                        return unit3;
                    }
                    return aVar;
                }
            }
            if (!((C0781n) nVar.f2215i).G()) {
            }
        } catch (Throwable th3) {
            interfaceC0979a = cVar2;
            th = th3;
            ((v6.c) interfaceC0979a).e(null);
            throw th;
        }
        f0Var = new f0(this, cVar);
        Object obj2 = f0Var.f2082i;
        W5.a aVar2 = W5.a.f2787d;
        i2 = f0Var.f2084m;
        if (i2 != 0) {
        }
    }

    public String toString() {
        switch (this.f2213d) {
            case 2:
                String socket = ((Socket) this.f2214e).toString();
                Intrinsics.checkNotNullExpressionValue(socket, "toString(...)");
                return socket;
            default:
                return super.toString();
        }
    }

    @Override // T6.v
    public u u() {
        return (U6.c) this.f2217m;
    }

    public n(WorkDatabase_Impl database) {
        this.f2213d = 0;
        this.f2214e = database;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f2215i = new b(database, 4);
        this.f2216l = new h(database, 2);
        this.f2217m = new h(database, 3);
    }

    public n(Socket socket) {
        this.f2213d = 2;
        Intrinsics.checkNotNullParameter(socket, "socket");
        this.f2214e = socket;
        this.f2215i = new AtomicInteger();
        this.f2216l = new U6.d(this);
        this.f2217m = new U6.c(this);
    }

    public n(Function function) {
        this.f2213d = 5;
        this.f2214e = new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.f2215i = new Object();
        this.f2216l = Collections.newSetFromMap(new IdentityHashMap());
        this.f2217m = function;
    }

    public n(Context context, ActionMode.Callback callback) {
        this.f2213d = 4;
        this.f2215i = context;
        this.f2214e = callback;
        this.f2216l = new ArrayList();
        this.f2217m = new C0939j(0);
    }

    public n(Q q4, List initTasksList) {
        this.f2213d = 1;
        Intrinsics.checkNotNullParameter(initTasksList, "initTasksList");
        this.f2217m = q4;
        this.f2214e = new v6.c();
        this.f2215i = AbstractC0792z.a();
        this.f2216l = CollectionsKt.z(initTasksList);
    }
}
