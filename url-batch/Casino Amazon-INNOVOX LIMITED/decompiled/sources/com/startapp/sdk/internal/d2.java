package com.startapp.sdk.internal;

import android.content.Context;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f209a;
    public boolean b;
    public final String c;
    public final c2 d;
    public final int e;

    public d2(Context context, String str, c2 c2Var, int i) {
        this.f209a = context;
        this.c = str;
        this.d = c2Var;
        this.e = i;
    }

    public final void a() {
        ((Executor) com.startapp.sdk.components.a.a(this.f209a).B.a()).execute(new b2(this));
    }
}
