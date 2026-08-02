package com.startapp.sdk.internal;

import android.app.Activity;
import android.view.View;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.Collection;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class mf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f7285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f7286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pf f7287c;

    public mf(pf pfVar, Activity activity, View view) {
        this.f7287c = pfVar;
        this.f7285a = activity;
        this.f7286b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            pf pfVar = this.f7287c;
            Activity activity = this.f7285a;
            View view = this.f7286b;
            pfVar.f7452d.getClass();
            RcdMetadata R3 = MetaData.E().R();
            if (R3 == null || !R3.c()) {
                R3 = null;
            }
            RcdTargets b4 = R3 != null ? R3.b() : null;
            if (b4 == null) {
                return;
            }
            try {
                Collection a3 = b4.a(8);
                String name = activity.getClass().getName();
                if (a3.contains(name)) {
                    pfVar.a(name, 8);
                    return;
                }
            } catch (Throwable th) {
                d9.a(th);
            }
            try {
                pfVar.a(b4, view);
            } catch (Throwable th2) {
                d9.a(th2);
            }
            ((Executor) pfVar.f7451c.a()).execute(pfVar.f7458j);
        } catch (Throwable th3) {
            d9.a(th3);
        }
    }
}
