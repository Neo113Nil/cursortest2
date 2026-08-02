package io.appmetrica.analytics.identifiers.impl;

import E.AbstractC0005f;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f9862a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1339l f9863b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9864c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f9865d;

    public f(e eVar, InterfaceC1339l interfaceC1339l, String str, SafePackageManager safePackageManager) {
        this.f9862a = eVar;
        this.f9863b = interfaceC1339l;
        this.f9864c = str;
        this.f9865d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f9865d.resolveService(context, this.f9862a.f9859a, 0) == null) {
            throw new l(AbstractC0005f.q(new StringBuilder("could not resolve "), this.f9864c, " services"));
        }
        try {
            eVar = this.f9862a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f9859a, eVar, 1)) {
            e eVar2 = this.f9862a;
            if (eVar2.f9860b == null) {
                synchronized (eVar2.f9861c) {
                    if (eVar2.f9860b == null) {
                        try {
                            eVar2.f9861c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f9860b;
            if (iBinder == null) {
                return this.f9863b.invoke(iBinder);
            }
            throw new g(AbstractC0005f.q(new StringBuilder("could not bind to "), this.f9864c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f9862a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, InterfaceC1339l interfaceC1339l, String str) {
        this(new e(intent, str), interfaceC1339l, str, new SafePackageManager());
    }
}
