package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class Co {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5868a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5869b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final yo f5870c;

    /* renamed from: d, reason: collision with root package name */
    public final yo f5871d;

    public Co(Context context) {
        this.f5868a = context;
        C0566ia c0566ia = new C0566ia(context, "appmetrica_vital.dat");
        this.f5870c = new yo(C0876ua.k().z(), c0566ia);
        this.f5871d = new yo(new C0467ef(C0511g7.a(context).d()), c0566ia);
    }

    public final yo a() {
        return this.f5870c;
    }

    public final yo b() {
        return this.f5871d;
    }
}
