package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.xo, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3102xo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f40238a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f40239b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C2998to f40240c;

    /* renamed from: d, reason: collision with root package name */
    public final C2998to f40241d;

    public C3102xo(Context context) {
        this.f40238a = context;
        C3062wa c3062wa = new C3062wa(context, "appmetrica_vital.dat");
        this.f40240c = new C2998to(Ia.j().x(), c3062wa);
        this.f40241d = new C2998to(new C2834nf(C3007u7.a(context).d()), c3062wa);
    }

    public final C2998to a() {
        return this.f40240c;
    }

    public final C2998to b() {
        return this.f40241d;
    }
}
