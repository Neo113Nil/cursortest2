package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3990a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3991b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3992c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f3993d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3994e;

    public j2(Context context, String str, i2 i2Var, int i3) {
        this.f3990a = context;
        this.f3992c = str;
        this.f3993d = i2Var;
        this.f3994e = i3;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f3990a).f3444B.a()).execute(new h2(this));
    }
}
