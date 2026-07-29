package com.chartboost.sdk.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class ah {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f3709a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3710b;

    /* renamed from: c, reason: collision with root package name */
    private final ao f3711c;

    /* renamed from: d, reason: collision with root package name */
    private final ai f3712d;
    private final com.chartboost.sdk.Libraries.i e;
    private final Handler f;

    public ah(Executor executor, ao aoVar, ai aiVar, com.chartboost.sdk.Libraries.i iVar, Handler handler, Executor executor2) {
        this.f3709a = executor2;
        this.f3710b = executor;
        this.f3711c = aoVar;
        this.f3712d = aiVar;
        this.e = iVar;
        this.f = handler;
    }

    public <T> void a(ad<T> adVar) {
        this.f3709a.execute(new an(this.f3710b, this.f3711c, this.f3712d, this.e, this.f, adVar));
    }
}
