package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class of implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f7398a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7399b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pf f7400c;

    public of(pf pfVar, StackTraceElement[] stackTraceElementArr, int i4) {
        this.f7400c = pfVar;
        this.f7398a = stackTraceElementArr;
        this.f7399b = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pf pfVar = this.f7400c;
            StackTraceElement[] stackTraceElementArr = this.f7398a;
            int i4 = this.f7399b;
            pfVar.f7452d.getClass();
            RcdMetadata R3 = MetaData.E().R();
            if (R3 == null || !R3.c()) {
                R3 = null;
            }
            RcdTargets b4 = R3 != null ? R3.b() : null;
            if (b4 == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                pfVar.a(b4, stackTraceElement.getClassName(), i4);
            }
            ((Executor) pfVar.f7451c.a()).execute(pfVar.f7458j);
        } catch (Throwable th) {
            d9.a(th);
        }
    }
}
