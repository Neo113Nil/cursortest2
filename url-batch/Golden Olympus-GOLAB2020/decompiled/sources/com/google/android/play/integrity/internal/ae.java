package com.google.android.play.integrity.internal;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f13615a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Context f13616b;

    /* renamed from: c, reason: collision with root package name */
    private final s f13617c;

    /* renamed from: d, reason: collision with root package name */
    private final String f13618d;

    /* renamed from: h, reason: collision with root package name */
    private boolean f13622h;

    /* renamed from: i, reason: collision with root package name */
    private final Intent f13623i;

    /* renamed from: j, reason: collision with root package name */
    private final z f13624j;

    /* renamed from: n, reason: collision with root package name */
    private ServiceConnection f13628n;

    /* renamed from: o, reason: collision with root package name */
    private IInterface f13629o;

    /* renamed from: e, reason: collision with root package name */
    private final List f13619e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final Set f13620f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final Object f13621g = new Object();

    /* renamed from: l, reason: collision with root package name */
    private final IBinder.DeathRecipient f13626l = new IBinder.DeathRecipient() { // from class: com.google.android.play.integrity.internal.u
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            ae.k(ae.this);
        }
    };

    /* renamed from: m, reason: collision with root package name */
    private final AtomicInteger f13627m = new AtomicInteger(0);

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f13625k = new WeakReference(null);

    public ae(Context context, s sVar, String str, Intent intent, z zVar, y yVar) {
        this.f13616b = context;
        this.f13617c = sVar;
        this.f13618d = str;
        this.f13623i = intent;
        this.f13624j = zVar;
    }

    public static /* synthetic */ void k(ae aeVar) {
        aeVar.f13617c.d("reportBinderDeath", new Object[0]);
        android.support.v4.media.session.b.a(aeVar.f13625k.get());
        aeVar.f13617c.d("%s : Binder has died.", aeVar.f13618d);
        Iterator it = aeVar.f13619e.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(aeVar.w());
        }
        aeVar.f13619e.clear();
        synchronized (aeVar.f13621g) {
            aeVar.x();
        }
    }

    static /* bridge */ /* synthetic */ void o(final ae aeVar, final TaskCompletionSource taskCompletionSource) {
        aeVar.f13620f.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.play.integrity.internal.v
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ae.this.u(taskCompletionSource, task);
            }
        });
    }

    static /* bridge */ /* synthetic */ void q(ae aeVar, t tVar) {
        if (aeVar.f13629o != null || aeVar.f13622h) {
            if (!aeVar.f13622h) {
                tVar.run();
                return;
            } else {
                aeVar.f13617c.d("Waiting to bind to the service.", new Object[0]);
                aeVar.f13619e.add(tVar);
                return;
            }
        }
        aeVar.f13617c.d("Initiate binding to the service.", new Object[0]);
        aeVar.f13619e.add(tVar);
        ad adVar = new ad(aeVar, null);
        aeVar.f13628n = adVar;
        aeVar.f13622h = true;
        if (aeVar.f13616b.bindService(aeVar.f13623i, adVar, 1)) {
            return;
        }
        aeVar.f13617c.d("Failed to bind to the service.", new Object[0]);
        aeVar.f13622h = false;
        Iterator it = aeVar.f13619e.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(new af());
        }
        aeVar.f13619e.clear();
    }

    static /* bridge */ /* synthetic */ void r(ae aeVar) {
        aeVar.f13617c.d("linkToDeath", new Object[0]);
        try {
            aeVar.f13629o.asBinder().linkToDeath(aeVar.f13626l, 0);
        } catch (RemoteException e4) {
            aeVar.f13617c.c(e4, "linkToDeath failed", new Object[0]);
        }
    }

    static /* bridge */ /* synthetic */ void s(ae aeVar) {
        aeVar.f13617c.d("unlinkToDeath", new Object[0]);
        aeVar.f13629o.asBinder().unlinkToDeath(aeVar.f13626l, 0);
    }

    private final RemoteException w() {
        return new RemoteException(String.valueOf(this.f13618d).concat(" : Binder has died."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        Iterator it = this.f13620f.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(w());
        }
        this.f13620f.clear();
    }

    public final Handler c() {
        Handler handler;
        Map map = f13615a;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f13618d)) {
                    HandlerThread handlerThread = new HandlerThread(this.f13618d, 10);
                    handlerThread.start();
                    map.put(this.f13618d, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f13618d);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final IInterface e() {
        return this.f13629o;
    }

    public final void t(t tVar, TaskCompletionSource taskCompletionSource) {
        c().post(new w(this, tVar.c(), taskCompletionSource, tVar));
    }

    final /* synthetic */ void u(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f13621g) {
            this.f13620f.remove(taskCompletionSource);
        }
    }

    public final void v(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f13621g) {
            this.f13620f.remove(taskCompletionSource);
        }
        c().post(new x(this));
    }
}
