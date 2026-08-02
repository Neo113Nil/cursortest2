package io.appmetrica.analytics.identifiers.impl;

import E1.AbstractC0033i;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f5602a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.l f5603b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5604c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f5605d;

    public f(e eVar, l2.l lVar, String str, SafePackageManager safePackageManager) {
        this.f5602a = eVar;
        this.f5603b = lVar;
        this.f5604c = str;
        this.f5605d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f5605d.resolveService(context, this.f5602a.f5599a, 0) == null) {
            throw new l(AbstractC0033i.m(new StringBuilder("could not resolve "), this.f5604c, " services"));
        }
        try {
            eVar = this.f5602a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f5599a, eVar, 1)) {
            e eVar2 = this.f5602a;
            if (eVar2.f5600b == null) {
                synchronized (eVar2.f5601c) {
                    if (eVar2.f5600b == null) {
                        try {
                            eVar2.f5601c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f5600b;
            if (iBinder == null) {
                return this.f5603b.invoke(iBinder);
            }
            throw new g(AbstractC0033i.m(new StringBuilder("could not bind to "), this.f5604c, " services"));
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f5602a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, l2.l lVar, String str) {
        this(new e(intent, str), lVar, str, new SafePackageManager());
    }
}
