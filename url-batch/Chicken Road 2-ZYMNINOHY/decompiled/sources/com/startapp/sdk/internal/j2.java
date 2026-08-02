package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7116a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7117b;

    /* renamed from: c, reason: collision with root package name */
    public final String f7118c;

    /* renamed from: d, reason: collision with root package name */
    public final i2 f7119d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7120e;

    public j2(Context context, String str, i2 i2Var, int i4) {
        this.f7116a = context;
        this.f7118c = str;
        this.f7119d = i2Var;
        this.f7120e = i4;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f7116a).f6542B.a()).execute(new h2(this));
    }
}
