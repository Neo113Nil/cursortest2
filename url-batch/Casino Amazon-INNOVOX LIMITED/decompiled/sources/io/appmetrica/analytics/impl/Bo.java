package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class Bo {

    /* renamed from: a, reason: collision with root package name */
    public final Context f782a;
    public final LinkedHashMap b = new LinkedHashMap();
    public final xo c;
    public final xo d;

    public Bo(Context context) {
        this.f782a = context;
        C0094ca c0094ca = new C0094ca(context, "appmetrica_vital.dat");
        this.c = new xo(C0401oa.k().y(), c0094ca);
        this.d = new xo(new C0047af(C0401oa.k().B().e(context)), c0094ca);
    }

    public final xo a() {
        return this.c;
    }

    public final xo b() {
        return this.d;
    }
}
