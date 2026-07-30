package com.realsil.sdk.core.d;

import com.realsil.sdk.core.logger.ZLogger;

/* loaded from: classes4.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f15650a;

    public d(f fVar) {
        this.f15650a = fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ZLogger.v("scan delay time reached");
        this.f15650a.b();
    }
}
