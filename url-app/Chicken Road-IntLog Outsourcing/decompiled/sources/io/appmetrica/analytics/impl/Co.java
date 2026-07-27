package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Co {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6652a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f6653b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final yo f6654c;

    /* renamed from: d, reason: collision with root package name */
    public final yo f6655d;

    public Co(Context context) {
        this.f6652a = context;
        C0717ia c0717ia = new C0717ia(context, "appmetrica_vital.dat");
        this.f6654c = new yo(C1027ua.k().z(), c0717ia);
        this.f6655d = new yo(new C0618ef(C0662g7.a(context).d()), c0717ia);
    }

    public final yo a() {
        return this.f6654c;
    }

    public final yo b() {
        return this.f6655d;
    }
}
