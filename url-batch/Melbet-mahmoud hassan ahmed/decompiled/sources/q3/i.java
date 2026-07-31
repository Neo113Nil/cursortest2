package q3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Set;
import p3.a;
import r3.c;

/* loaded from: classes.dex */
public final class i implements a.f, ServiceConnection {

    /* renamed from: l, reason: collision with root package name */
    private static final String f20273l = i.class.getSimpleName();

    /* renamed from: a, reason: collision with root package name */
    private final String f20274a;

    /* renamed from: b, reason: collision with root package name */
    private final String f20275b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f20276c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f20277d;

    /* renamed from: e, reason: collision with root package name */
    private final d f20278e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f20279f;

    /* renamed from: g, reason: collision with root package name */
    private final j f20280g;

    /* renamed from: h, reason: collision with root package name */
    private IBinder f20281h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20282i;

    /* renamed from: j, reason: collision with root package name */
    private String f20283j;

    /* renamed from: k, reason: collision with root package name */
    private String f20284k;

    private final void i() {
        if (Thread.currentThread() != this.f20279f.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    private final void t(String str) {
        String.valueOf(this.f20281h);
        str.length();
    }

    @Override // p3.a.f
    public final boolean a() {
        i();
        return this.f20281h != null;
    }

    @Override // p3.a.f
    public final Set<Scope> b() {
        return Collections.emptySet();
    }

    @Override // p3.a.f
    public final void c(@RecentlyNonNull c.InterfaceC0129c interfaceC0129c) {
        i();
        t("Connect started.");
        if (a()) {
            try {
                f("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f20276c;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f20274a).setAction(this.f20275b);
            }
            boolean bindService = this.f20277d.bindService(intent, this, r3.h.a());
            this.f20282i = bindService;
            if (!bindService) {
                this.f20281h = null;
                this.f20280g.E(new o3.b(16));
            }
            t("Finished connect.");
        } catch (SecurityException e7) {
            this.f20282i = false;
            this.f20281h = null;
            throw e7;
        }
    }

    @Override // p3.a.f
    public final void d() {
        i();
        t("Disconnect called.");
        try {
            this.f20277d.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f20282i = false;
        this.f20281h = null;
    }

    @Override // p3.a.f
    public final void e(r3.i iVar, Set<Scope> set) {
    }

    @Override // p3.a.f
    public final void f(@RecentlyNonNull String str) {
        i();
        this.f20283j = str;
        d();
    }

    @Override // p3.a.f
    public final void g(@RecentlyNonNull c.e eVar) {
    }

    @Override // p3.a.f
    public final boolean h() {
        return false;
    }

    @Override // p3.a.f
    public final int j() {
        return 0;
    }

    @Override // p3.a.f
    public final boolean k() {
        i();
        return this.f20282i;
    }

    @Override // p3.a.f
    @RecentlyNonNull
    public final o3.d[] l() {
        return new o3.d[0];
    }

    @Override // p3.a.f
    @RecentlyNonNull
    public final String m() {
        String str = this.f20274a;
        if (str != null) {
            return str;
        }
        r3.o.i(this.f20276c);
        return this.f20276c.getPackageName();
    }

    @Override // p3.a.f
    @RecentlyNullable
    public final String n() {
        return this.f20283j;
    }

    @Override // p3.a.f
    public final boolean o() {
        return false;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull final IBinder iBinder) {
        this.f20279f.post(new Runnable(this, iBinder) { // from class: q3.g0

            /* renamed from: f, reason: collision with root package name */
            private final i f20269f;

            /* renamed from: g, reason: collision with root package name */
            private final IBinder f20270g;

            {
                this.f20269f = this;
                this.f20270g = iBinder;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20269f.s(this.f20270g);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.f20279f.post(new Runnable(this) { // from class: q3.i0

            /* renamed from: f, reason: collision with root package name */
            private final i f20285f;

            {
                this.f20285f = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f20285f.r();
            }
        });
    }

    public final void q(String str) {
        this.f20284k = str;
    }

    final /* synthetic */ void r() {
        this.f20282i = false;
        this.f20281h = null;
        t("Disconnected.");
        this.f20278e.q0(1);
    }

    final /* synthetic */ void s(IBinder iBinder) {
        this.f20282i = false;
        this.f20281h = iBinder;
        t("Connected.");
        this.f20278e.O0(new Bundle());
    }
}
