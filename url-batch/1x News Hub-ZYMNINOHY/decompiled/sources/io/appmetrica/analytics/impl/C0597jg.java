package io.appmetrica.analytics.impl;

import android.content.Context;
import b2.C0193g;
import b2.InterfaceC0189c;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0597jg {

    /* renamed from: a, reason: collision with root package name */
    public final C0779qg f7645a;

    /* renamed from: b, reason: collision with root package name */
    public final Ga f7646b;

    /* renamed from: c, reason: collision with root package name */
    public final Bg f7647c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0189c f7648d = new C0193g(new C0520gg(this));

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0189c f7649e = new C0193g(new C0468eg(this));
    public final InterfaceC0189c f = new C0193g(new C0571ig(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f7650g = new ArrayList();

    public C0597jg(C0779qg c0779qg, Ag ag, Ga ga, Bg bg) {
        this.f7645a = c0779qg;
        this.f7646b = ga;
        this.f7647c = bg;
    }

    public static final InterfaceC0391bg a(C0597jg c0597jg) {
        return (InterfaceC0391bg) ((C0193g) c0597jg.f7648d).a();
    }

    public static final void a(C0597jg c0597jg, C0830sg c0830sg, InterfaceC0391bg interfaceC0391bg) {
        boolean a3;
        c0597jg.f7650g.add(c0830sg);
        Bg bg = c0597jg.f7647c;
        if (c0830sg == null) {
            bg.getClass();
        } else {
            SafePackageManager safePackageManager = bg.f5819b;
            Context context = bg.f5818a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0830sg.f8318d.ordinal();
            if (ordinal == 1) {
                a3 = kotlin.jvm.internal.j.a(bg.f, installerPackageName);
            } else if (ordinal == 2) {
                a3 = kotlin.jvm.internal.j.a(bg.f5823g, installerPackageName);
            }
            if (a3) {
                c0597jg.a(c0830sg);
                return;
            }
        }
        interfaceC0391bg.a();
    }

    public final void a(C0830sg c0830sg) {
        C0779qg c0779qg = this.f7645a;
        synchronized (c0779qg) {
            c0779qg.f8170b = c0830sg;
            c0779qg.f8171c = true;
            c0779qg.f8172d.a(c0830sg);
            c0779qg.f8172d.d();
            c0779qg.a(c0779qg.f8170b);
        }
    }
}
