package r3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class b1 implements ServiceConnection, e1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<ServiceConnection, ServiceConnection> f21195a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f21196b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f21197c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f21198d;

    /* renamed from: e, reason: collision with root package name */
    private final z0 f21199e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f21200f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ d1 f21201g;

    public b1(d1 d1Var, z0 z0Var) {
        this.f21201g = d1Var;
        this.f21199e = z0Var;
    }

    public final void a(String str) {
        u3.a aVar;
        Context context;
        Context context2;
        u3.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j7;
        this.f21196b = 3;
        aVar = this.f21201g.f21251g;
        context = this.f21201g.f21249e;
        z0 z0Var = this.f21199e;
        context2 = this.f21201g.f21249e;
        boolean d7 = aVar.d(context, str, z0Var.d(context2), this, this.f21199e.c());
        this.f21197c = d7;
        if (d7) {
            handler = this.f21201g.f21250f;
            Message obtainMessage = handler.obtainMessage(1, this.f21199e);
            handler2 = this.f21201g.f21250f;
            j7 = this.f21201g.f21253i;
            handler2.sendMessageDelayed(obtainMessage, j7);
            return;
        }
        this.f21196b = 2;
        try {
            aVar2 = this.f21201g.f21251g;
            context3 = this.f21201g.f21249e;
            aVar2.c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void b(String str) {
        Handler handler;
        u3.a aVar;
        Context context;
        handler = this.f21201g.f21250f;
        handler.removeMessages(1, this.f21199e);
        aVar = this.f21201g.f21251g;
        context = this.f21201g.f21249e;
        aVar.c(context, this);
        this.f21197c = false;
        this.f21196b = 2;
    }

    public final void c(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f21195a.put(serviceConnection, serviceConnection2);
    }

    public final void d(ServiceConnection serviceConnection, String str) {
        this.f21195a.remove(serviceConnection);
    }

    public final boolean e() {
        return this.f21197c;
    }

    public final int f() {
        return this.f21196b;
    }

    public final boolean g(ServiceConnection serviceConnection) {
        return this.f21195a.containsKey(serviceConnection);
    }

    public final boolean h() {
        return this.f21195a.isEmpty();
    }

    public final IBinder i() {
        return this.f21198d;
    }

    public final ComponentName j() {
        return this.f21200f;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f21201g.f21248d;
        synchronized (hashMap) {
            handler = this.f21201g.f21250f;
            handler.removeMessages(1, this.f21199e);
            this.f21198d = iBinder;
            this.f21200f = componentName;
            Iterator<ServiceConnection> it = this.f21195a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f21196b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f21201g.f21248d;
        synchronized (hashMap) {
            handler = this.f21201g.f21250f;
            handler.removeMessages(1, this.f21199e);
            this.f21198d = null;
            this.f21200f = componentName;
            Iterator<ServiceConnection> it = this.f21195a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f21196b = 2;
        }
    }
}
