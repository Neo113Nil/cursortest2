package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.rg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2938rg {

    /* renamed from: a, reason: collision with root package name */
    public final C3120yg f39730a;

    /* renamed from: b, reason: collision with root package name */
    public final Ua f39731b;

    /* renamed from: c, reason: collision with root package name */
    public final Jg f39732c;

    /* renamed from: d, reason: collision with root package name */
    public final W1.h f39733d = W1.i.b(new C2861og(this));

    /* renamed from: e, reason: collision with root package name */
    public final W1.h f39734e = W1.i.b(new C2809mg(this));

    /* renamed from: f, reason: collision with root package name */
    public final W1.h f39735f = W1.i.b(new C2913qg(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f39736g = new ArrayList();

    public C2938rg(C3120yg c3120yg, Ig ig, Ua ua, Jg jg) {
        this.f39730a = c3120yg;
        this.f39731b = ua;
        this.f39732c = jg;
    }

    public static final InterfaceC2731jg a(C2938rg c2938rg) {
        return (InterfaceC2731jg) c2938rg.f39733d.getValue();
    }

    public static final void a(C2938rg c2938rg, Ag ag, InterfaceC2731jg interfaceC2731jg) {
        boolean areEqual;
        c2938rg.f39736g.add(ag);
        Jg jg = c2938rg.f39732c;
        if (ag == null) {
            jg.getClass();
        } else {
            SafePackageManager safePackageManager = jg.f37833b;
            Context context = jg.f37832a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = ag.f37186d.ordinal();
            if (ordinal == 1) {
                areEqual = Intrinsics.areEqual(jg.f37837f, installerPackageName);
            } else if (ordinal == 2) {
                areEqual = Intrinsics.areEqual(jg.f37838g, installerPackageName);
            }
            if (areEqual) {
                c2938rg.a(ag);
                return;
            }
        }
        interfaceC2731jg.a();
    }

    public final void a(Ag ag) {
        C3120yg c3120yg = this.f39730a;
        synchronized (c3120yg) {
            c3120yg.f40280b = ag;
            c3120yg.f40281c = true;
            c3120yg.f40282d.a(ag);
            c3120yg.f40282d.d();
            c3120yg.a(c3120yg.f40280b);
        }
    }
}
