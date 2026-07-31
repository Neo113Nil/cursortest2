package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.b;
import androidx.room.c;
import androidx.room.e;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    final Context f1280a;

    /* renamed from: b, reason: collision with root package name */
    final String f1281b;

    /* renamed from: c, reason: collision with root package name */
    int f1282c;

    /* renamed from: d, reason: collision with root package name */
    final androidx.room.e f1283d;

    /* renamed from: e, reason: collision with root package name */
    final e.c f1284e;

    /* renamed from: f, reason: collision with root package name */
    androidx.room.c f1285f;

    /* renamed from: g, reason: collision with root package name */
    final Executor f1286g;

    /* renamed from: h, reason: collision with root package name */
    final androidx.room.b f1287h = new a();

    /* renamed from: i, reason: collision with root package name */
    final AtomicBoolean f1288i = new AtomicBoolean(false);

    /* renamed from: j, reason: collision with root package name */
    final ServiceConnection f1289j;

    /* renamed from: k, reason: collision with root package name */
    final Runnable f1290k;

    /* renamed from: l, reason: collision with root package name */
    final Runnable f1291l;

    /* renamed from: m, reason: collision with root package name */
    private final Runnable f1292m;

    class a extends b.a {

        /* renamed from: androidx.room.f$a$a, reason: collision with other inner class name */
        class RunnableC0025a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String[] f1294f;

            RunnableC0025a(String[] strArr) {
                this.f1294f = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                f.this.f1283d.e(this.f1294f);
            }
        }

        a() {
        }

        @Override // androidx.room.b
        public void E2(String[] strArr) {
            f.this.f1286g.execute(new RunnableC0025a(strArr));
        }
    }

    class b implements ServiceConnection {
        b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f.this.f1285f = c.a.E(iBinder);
            f fVar = f.this;
            fVar.f1286g.execute(fVar.f1290k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f fVar = f.this;
            fVar.f1286g.execute(fVar.f1291l);
            f.this.f1285f = null;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f1285f;
                if (cVar != null) {
                    fVar.f1282c = cVar.E3(fVar.f1287h, fVar.f1281b);
                    f fVar2 = f.this;
                    fVar2.f1283d.a(fVar2.f1284e);
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e7);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f1283d.g(fVar.f1284e);
        }
    }

    class e implements Runnable {
        e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = f.this;
            fVar.f1283d.g(fVar.f1284e);
            try {
                f fVar2 = f.this;
                androidx.room.c cVar = fVar2.f1285f;
                if (cVar != null) {
                    cVar.S5(fVar2.f1287h, fVar2.f1282c);
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e7);
            }
            f fVar3 = f.this;
            fVar3.f1280a.unbindService(fVar3.f1289j);
        }
    }

    /* renamed from: androidx.room.f$f, reason: collision with other inner class name */
    class C0026f extends e.c {
        C0026f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.e.c
        boolean a() {
            return true;
        }

        @Override // androidx.room.e.c
        public void b(Set<String> set) {
            if (f.this.f1288i.get()) {
                return;
            }
            try {
                f fVar = f.this;
                androidx.room.c cVar = fVar.f1285f;
                if (cVar != null) {
                    cVar.h5(fVar.f1282c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e7) {
                Log.w("ROOM", "Cannot broadcast invalidation", e7);
            }
        }
    }

    f(Context context, String str, androidx.room.e eVar, Executor executor) {
        b bVar = new b();
        this.f1289j = bVar;
        this.f1290k = new c();
        this.f1291l = new d();
        this.f1292m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f1280a = applicationContext;
        this.f1281b = str;
        this.f1283d = eVar;
        this.f1286g = executor;
        this.f1284e = new C0026f((String[]) eVar.f1257a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
