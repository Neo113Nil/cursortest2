package io.appmetrica.analytics.impl;

import a.AbstractC0169a;
import android.content.Context;
import f4.InterfaceC0428e;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.jg, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748jg {

    /* renamed from: a, reason: collision with root package name */
    public final C0930qg f8540a;

    /* renamed from: b, reason: collision with root package name */
    public final Ga f8541b;

    /* renamed from: c, reason: collision with root package name */
    public final Bg f8542c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0428e f8543d = AbstractC0169a.A(new C0671gg(this));

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0428e f8544e = AbstractC0169a.A(new C0619eg(this));

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0428e f8545f = AbstractC0169a.A(new C0722ig(this));

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f8546g = new ArrayList();

    public C0748jg(C0930qg c0930qg, Ag ag, Ga ga, Bg bg) {
        this.f8540a = c0930qg;
        this.f8541b = ga;
        this.f8542c = bg;
    }

    public static final InterfaceC0542bg a(C0748jg c0748jg) {
        return (InterfaceC0542bg) c0748jg.f8543d.getValue();
    }

    public static final void a(C0748jg c0748jg, C0981sg c0981sg, InterfaceC0542bg interfaceC0542bg) {
        boolean a6;
        c0748jg.f8546g.add(c0981sg);
        Bg bg = c0748jg.f8542c;
        if (c0981sg == null) {
            bg.getClass();
        } else {
            SafePackageManager safePackageManager = bg.f6599b;
            Context context = bg.f6598a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0981sg.f9259d.ordinal();
            if (ordinal == 1) {
                a6 = kotlin.jvm.internal.i.a(bg.f6603f, installerPackageName);
            } else if (ordinal == 2) {
                a6 = kotlin.jvm.internal.i.a(bg.f6604g, installerPackageName);
            }
            if (a6) {
                c0748jg.a(c0981sg);
                return;
            }
        }
        interfaceC0542bg.a();
    }

    public final void a(C0981sg c0981sg) {
        C0930qg c0930qg = this.f8540a;
        synchronized (c0930qg) {
            c0930qg.f9104b = c0981sg;
            c0930qg.f9105c = true;
            c0930qg.f9106d.a(c0981sg);
            c0930qg.f9106d.d();
            c0930qg.a(c0930qg.f9104b);
        }
    }
}
