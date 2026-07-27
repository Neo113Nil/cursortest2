package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import b2.AbstractC0279e;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f6369a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1441l f6370b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6371c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f6372d;

    public f(e eVar, InterfaceC1441l interfaceC1441l, String str, SafePackageManager safePackageManager) {
        this.f6369a = eVar;
        this.f6370b = interfaceC1441l;
        this.f6371c = str;
        this.f6372d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f6372d.resolveService(context, this.f6369a.f6366a, 0) == null) {
            throw new l(AbstractC0279e.h(new StringBuilder("could not resolve "), this.f6371c, " services"));
        }
        try {
            eVar = this.f6369a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f6366a, eVar, 1)) {
            e eVar2 = this.f6369a;
            if (eVar2.f6367b == null) {
                synchronized (eVar2.f6368c) {
                    if (eVar2.f6367b == null) {
                        try {
                            eVar2.f6368c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f6367b;
            if (iBinder == null) {
                return this.f6370b.invoke(iBinder);
            }
            throw new g(AbstractC0279e.h(new StringBuilder("could not bind to "), this.f6371c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f6369a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, InterfaceC1441l interfaceC1441l, String str) {
        this(new e(intent, str), interfaceC1441l, str, new SafePackageManager());
    }
}
