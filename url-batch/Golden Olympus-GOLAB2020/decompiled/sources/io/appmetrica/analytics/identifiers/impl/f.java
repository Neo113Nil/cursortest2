package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f37130a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f37131b;

    /* renamed from: c, reason: collision with root package name */
    public final String f37132c;

    /* renamed from: d, reason: collision with root package name */
    public final SafePackageManager f37133d;

    public f(e eVar, Function1 function1, String str, SafePackageManager safePackageManager) {
        this.f37130a = eVar;
        this.f37131b = function1;
        this.f37132c = str;
        this.f37133d = safePackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context) {
        IBinder iBinder;
        e eVar;
        if (this.f37133d.resolveService(context, this.f37130a.f37127a, 0) == null) {
            throw new l("could not resolve " + this.f37132c + " services");
        }
        try {
            eVar = this.f37130a;
        } catch (Throwable unused) {
        }
        if (context.bindService(eVar.f37127a, eVar, 1)) {
            e eVar2 = this.f37130a;
            if (eVar2.f37128b == null) {
                synchronized (eVar2.f37129c) {
                    if (eVar2.f37128b == null) {
                        try {
                            eVar2.f37129c.wait(3000L);
                        } catch (InterruptedException unused2) {
                        }
                    }
                }
            }
            iBinder = eVar2.f37128b;
            if (iBinder == null) {
                return this.f37131b.invoke(iBinder);
            }
            throw new g("could not bind to " + this.f37132c + " services");
        }
        iBinder = null;
        if (iBinder == null) {
        }
    }

    public final void b(Context context) {
        try {
            this.f37130a.a(context);
        } catch (Throwable unused) {
        }
    }

    public f(Intent intent, Function1 function1, String str) {
        this(new e(intent, str), function1, str, new SafePackageManager());
    }
}
