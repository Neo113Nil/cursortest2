package io.appmetrica.analytics.impl;

import android.content.Context;
import c3.C0295g;
import c3.InterfaceC0291c;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.eg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0590eg {

    /* renamed from: a, reason: collision with root package name */
    public final C0771lg f11794a;

    /* renamed from: b, reason: collision with root package name */
    public final C1128za f11795b;

    /* renamed from: c, reason: collision with root package name */
    public final C1056wg f11796c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0291c f11797d = new C0295g(new C0513bg(this));

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0291c f11798e = new C0295g(new Zf(this));

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0291c f11799f = new C0295g(new C0565dg(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f11800g = new ArrayList();

    public C0590eg(C0771lg c0771lg, C1030vg c1030vg, C1128za c1128za, C1056wg c1056wg) {
        this.f11794a = c0771lg;
        this.f11795b = c1128za;
        this.f11796c = c1056wg;
    }

    public static final Wf a(C0590eg c0590eg) {
        return (Wf) ((C0295g) c0590eg.f11797d).a();
    }

    public static final void a(C0590eg c0590eg, C0823ng c0823ng, Wf wf) {
        boolean a3;
        c0590eg.f11800g.add(c0823ng);
        C1056wg c1056wg = c0590eg.f11796c;
        if (c0823ng == null) {
            c1056wg.getClass();
        } else {
            SafePackageManager safePackageManager = c1056wg.f12938b;
            Context context = c1056wg.f12937a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0823ng.f12467d.ordinal();
            if (ordinal == 1) {
                a3 = kotlin.jvm.internal.i.a(c1056wg.f12942f, installerPackageName);
            } else if (ordinal == 2) {
                a3 = kotlin.jvm.internal.i.a(c1056wg.f12943g, installerPackageName);
            }
            if (a3) {
                c0590eg.a(c0823ng);
                return;
            }
        }
        wf.a();
    }

    public final void a(C0823ng c0823ng) {
        C0771lg c0771lg = this.f11794a;
        synchronized (c0771lg) {
            c0771lg.f12299b = c0823ng;
            c0771lg.f12300c = true;
            c0771lg.f12301d.a(c0823ng);
            c0771lg.f12301d.d();
            c0771lg.a(c0771lg.f12299b);
        }
    }
}
