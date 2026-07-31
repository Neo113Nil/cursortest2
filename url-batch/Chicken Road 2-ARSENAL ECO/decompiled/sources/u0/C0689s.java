package u0;

import D3.M;
import U0.t;
import a.AbstractC0219a;
import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.lifecycle.A;
import androidx.work.impl.WorkDatabase_Impl;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;
import l.C0484a;
import l0.u;
import l0.v;

/* renamed from: u0.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0689s implements F0.b, O3.b, k1.c, io.flutter.plugin.platform.i, N3.i, v {

    /* renamed from: h, reason: collision with root package name */
    public static C0689s f6033h;

    /* renamed from: f, reason: collision with root package name */
    public Object f6034f;

    /* renamed from: g, reason: collision with root package name */
    public Object f6035g;

    public /* synthetic */ C0689s(Object obj, Object obj2) {
        this.f6035g = obj;
        this.f6034f = obj2;
    }

    public static C0689s t() {
        if (f6033h == null) {
            R0.g gVar = new R0.g();
            C3.a aVar = new C3.a();
            aVar.f199a = 0;
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool(aVar);
            FlutterJNI flutterJNI = new FlutterJNI();
            I3.c cVar = new I3.c();
            cVar.f1191a = false;
            cVar.f1192b = false;
            cVar.f1196f = flutterJNI;
            cVar.f1197g = newCachedThreadPool;
            C0689s c0689s = new C0689s();
            c0689s.f6034f = cVar;
            c0689s.f6035g = gVar;
            f6033h = c0689s;
        }
        return f6033h;
    }

    @Override // N3.i
    public void a(D4.h hVar) {
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.a(hVar);
        throw null;
    }

    @Override // N3.i
    public void b(boolean z5) {
        ((io.flutter.plugin.platform.l) ((io.flutter.plugin.platform.l) this.f6034f).f4594z.f2734g).f4591v = z5;
    }

    @Override // io.flutter.plugin.platform.i
    public void c(io.flutter.view.i iVar) {
        ((io.flutter.plugin.platform.l) this.f6034f).f4582m.f4549a = iVar;
        ((io.flutter.plugin.platform.k) this.f6035g).f4566k.f4549a = iVar;
    }

    @Override // N3.i
    public void d(int i7, double d7, double d8) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(i7);
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.d(i7, d7, d8);
    }

    @Override // N3.i
    public void e(int i7, int i8) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(i7);
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.e(i7, i8);
    }

    @Override // N3.i
    public void f(N3.h hVar, B1.g gVar) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(hVar.f1714a);
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.f(hVar, gVar);
    }

    @Override // io.flutter.plugin.platform.i
    public boolean g(int i7) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(i7);
        return ((io.flutter.plugin.platform.l) this.f6034f).g(i7);
    }

    @Override // j5.InterfaceC0438a
    public Object get() {
        return new E0.e((Context) ((J1.c) this.f6034f).f1289g, (E0.d) ((M) this.f6035g).get());
    }

    @Override // k1.c
    public void h(k1.n nVar) {
        ((Map) ((C0673c) this.f6035g).f5969g).remove((k1.h) this.f6034f);
    }

    @Override // io.flutter.plugin.platform.i
    public void i(int i7) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(i7);
        ((io.flutter.plugin.platform.l) this.f6034f).i(i7);
    }

    @Override // N3.i
    public void j(int i7) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(i7);
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.j(i7);
    }

    @Override // io.flutter.plugin.platform.i
    public void k() {
        ((io.flutter.plugin.platform.l) this.f6034f).k();
        ((io.flutter.plugin.platform.k) this.f6035g).k();
    }

    @Override // N3.i
    public void l(N3.g gVar) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(gVar.f1698a);
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.l(gVar);
    }

    @Override // N3.i
    public long m(D4.h hVar) {
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.m(hVar);
        throw null;
    }

    @Override // N3.i
    public void n(int i7) {
        ((io.flutter.plugin.platform.k) this.f6035g).i(i7);
        ((io.flutter.plugin.platform.l) this.f6034f).f4594z.n(i7);
    }

    @Override // O3.b
    public void o(Object obj) {
        ((F3.f) this.f6034f).a(((O3.h) ((B0.c) ((C0673c) this.f6035g).f5969g).f73i).b(obj));
    }

    @Override // N3.i
    public boolean p() {
        FlutterJNI flutterJNI = ((io.flutter.plugin.platform.k) this.f6035g).f4564i;
        if (flutterJNI == null) {
            return false;
        }
        return flutterJNI.IsSurfaceControlEnabled();
    }

    @Override // N3.i
    public void q(D4.h hVar) {
        E3.j jVar = ((io.flutter.plugin.platform.k) ((io.flutter.plugin.platform.k) this.f6035g).f4574s.f3172f).f4561f;
        String str = (String) hVar.f529c;
        if (jVar.f659a.get(str) != null) {
            throw new ClassCastException();
        }
        throw new IllegalStateException("Trying to create a platform view of unregistered type: " + str);
    }

    public List r() {
        ArrayList arrayList;
        if (((ArrayList) this.f6034f).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f6034f)) {
            arrayList = new ArrayList((ArrayList) this.f6034f);
        }
        return arrayList;
    }

    public ArrayList s(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f6034f;
        Q.k e4 = Q.k.e("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
        if (str == null) {
            e4.o(1);
        } else {
            e4.B(str, 1);
        }
        workDatabase_Impl.b();
        Cursor m4 = workDatabase_Impl.m(e4);
        try {
            ArrayList arrayList = new ArrayList(m4.getCount());
            while (m4.moveToNext()) {
                arrayList.add(m4.isNull(0) ? null : m4.getString(0));
            }
            return arrayList;
        } finally {
            m4.close();
            e4.g();
        }
    }

    public void u(AbstractC0219a abstractC0219a) {
        boolean z5;
        A a7 = (A) this.f6034f;
        synchronized (a7.f3447a) {
            z5 = a7.f3450d == A.f3446i;
            a7.f3450d = abstractC0219a;
        }
        if (z5) {
            C0484a o02 = C0484a.o0();
            A.b bVar = a7.f3454h;
            l.d dVar = o02.f5237b;
            if (dVar.f5241d == null) {
                synchronized (dVar.f5239b) {
                    try {
                        if (dVar.f5241d == null) {
                            dVar.f5241d = l.d.o0(Looper.getMainLooper());
                        }
                    } finally {
                    }
                }
            }
            dVar.f5241d.post(bVar);
        }
        if (abstractC0219a instanceof u) {
            ((w0.j) this.f6035g).i((u) abstractC0219a);
        } else if (abstractC0219a instanceof l0.s) {
            ((w0.j) this.f6035g).j(((l0.s) abstractC0219a).f5287e);
        }
    }

    public int v(Context context, S0.a aVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f6034f;
        t.f(context);
        t.f(aVar);
        int e4 = aVar.e();
        int i7 = sparseIntArray.get(e4, -1);
        if (i7 != -1) {
            return i7;
        }
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 >= sparseIntArray.size()) {
                i8 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i9);
            if (keyAt > e4 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i9++;
        }
        if (i8 == -1) {
            i8 = ((R0.e) this.f6035g).b(context, e4);
        }
        sparseIntArray.put(e4, i8);
        return i8;
    }

    public C0689s(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (Objects.equals(interfaceDescriptor, "android.os.IMessenger")) {
            this.f6034f = new Messenger(iBinder);
            this.f6035g = null;
        } else {
            if (!Objects.equals(interfaceDescriptor, "com.google.android.gms.iid.IMessengerCompat")) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.f6035g = new Q0.g(iBinder);
            this.f6034f = null;
        }
    }

    public C0689s(R0.e eVar) {
        this.f6034f = new SparseIntArray();
        t.f(eVar);
        this.f6035g = eVar;
    }

    public C0689s(int i7) {
        switch (i7) {
            case 9:
                this.f6034f = new ReentrantLock();
                this.f6035g = new LinkedHashMap();
                break;
            case com.onesignal.core.internal.config.e.DEFAULT_NOTIFICATION_LIMIT /* 10 */:
            default:
                this.f6034f = new ArrayList();
                this.f6035g = new HashMap();
                new HashMap();
                break;
            case 11:
                this.f6034f = new A();
                this.f6035g = new w0.j();
                u(v.f5289e);
                break;
        }
    }
}
