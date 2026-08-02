package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Ao {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10063a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f10064b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final C1064wo f10065c;

    /* renamed from: d, reason: collision with root package name */
    public final C1064wo f10066d;

    public Ao(Context context) {
        this.f10063a = context;
        C0507ba c0507ba = new C0507ba(context, "appmetrica_vital.dat");
        this.f10065c = new C1064wo(C0817na.k().y(), c0507ba);
        this.f10066d = new C1064wo(new Ze(C0817na.k().B().e(context)), c0507ba);
    }

    public final C1064wo a() {
        return this.f10065c;
    }

    public final C1064wo b() {
        return this.f10066d;
    }
}
