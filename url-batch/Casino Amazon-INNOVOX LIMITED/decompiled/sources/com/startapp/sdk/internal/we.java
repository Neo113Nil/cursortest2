package com.startapp.sdk.internal;

import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class we implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ StackTraceElement[] f483a;
    public final /* synthetic */ int b;
    public final /* synthetic */ xe c;

    public we(xe xeVar, StackTraceElement[] stackTraceElementArr, int i) {
        this.c = xeVar;
        this.f483a = stackTraceElementArr;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            xe xeVar = this.c;
            StackTraceElement[] stackTraceElementArr = this.f483a;
            int i = this.b;
            xeVar.d.getClass();
            RcdMetadata M = MetaData.A().M();
            if (M == null || !M.c()) {
                M = null;
            }
            RcdTargets b = M != null ? M.b() : null;
            if (b == null) {
                return;
            }
            for (StackTraceElement stackTraceElement : stackTraceElementArr) {
                xeVar.a(b, stackTraceElement.getClassName(), i);
            }
            ((Executor) xeVar.c.a()).execute(xeVar.j);
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
