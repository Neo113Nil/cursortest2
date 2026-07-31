package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.fg, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0177fg {

    /* renamed from: a, reason: collision with root package name */
    public final C0357mg f1257a;
    public final Aa b;
    public final C0631xg c;
    public final Lazy d = LazyKt.lazy(new C0100cg(this));
    public final Lazy e = LazyKt.lazy(new C0048ag(this));
    public final Lazy f = LazyKt.lazy(new C0151eg(this));
    public final ArrayList g = new ArrayList();

    public C0177fg(C0357mg c0357mg, C0606wg c0606wg, Aa aa, C0631xg c0631xg) {
        this.f1257a = c0357mg;
        this.b = aa;
        this.c = c0631xg;
    }

    public static final Xf a(C0177fg c0177fg) {
        return (Xf) c0177fg.d.getValue();
    }

    public static final void a(C0177fg c0177fg, C0407og c0407og, Xf xf) {
        boolean areEqual;
        c0177fg.g.add(c0407og);
        C0631xg c0631xg = c0177fg.c;
        if (c0407og == null) {
            c0631xg.getClass();
        } else {
            SafePackageManager safePackageManager = c0631xg.b;
            Context context = c0631xg.f1566a;
            String installerPackageName = safePackageManager.getInstallerPackageName(context, context.getPackageName());
            int ordinal = c0407og.d.ordinal();
            if (ordinal == 1) {
                areEqual = Intrinsics.areEqual(c0631xg.f, installerPackageName);
            } else if (ordinal == 2) {
                areEqual = Intrinsics.areEqual(c0631xg.g, installerPackageName);
            }
            if (areEqual) {
                c0177fg.a(c0407og);
                return;
            }
        }
        xf.a();
    }

    public final void a(C0407og c0407og) {
        C0357mg c0357mg = this.f1257a;
        synchronized (c0357mg) {
            c0357mg.b = c0407og;
            c0357mg.c = true;
            c0357mg.d.a(c0407og);
            c0357mg.d.d();
            c0357mg.a(c0357mg.b);
        }
    }
}
