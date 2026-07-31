package com.appsflyer;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f13350b;

    public /* synthetic */ a(Function1 function1) {
        this.f13350b = function1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFLogger.getMediationNetwork(this.f13350b);
    }
}
