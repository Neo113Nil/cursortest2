package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class of implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f4263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pf f4265c;

    public of(pf pfVar, StackTraceElement[] stackTraceElementArr, int i3) {
        this.f4265c = pfVar;
        this.f4263a = stackTraceElementArr;
        this.f4264b = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pf pfVar = this.f4265c;
            StackTraceElement[] stackTraceElementArr = this.f4263a;
            int i3 = this.f4264b;
            pfVar.f4317d.getClass();
            RcdMetadata R2 = MetaData.E().R();
            if (R2 == null || !R2.c()) {
                R2 = null;
            }
            RcdTargets b3 = R2 != null ? R2.b() : null;
            if (b3 == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                pfVar.a(b3, stackTraceElement.getClassName(), i3);
            }
            ((Executor) pfVar.f4316c.a()).execute(pfVar.f4322j);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
