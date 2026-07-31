package com.startapp.sdk.internal;

import android.app.Activity;
import android.view.View;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.RcdMetadata;
import com.startapp.sdk.adsbase.remoteconfig.RcdTargets;
import java.util.Collection;
import java.util.concurrent.Executor;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ue implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f455a;
    public final /* synthetic */ View b;
    public final /* synthetic */ xe c;

    public ue(xe xeVar, Activity activity, View view) {
        this.c = xeVar;
        this.f455a = activity;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            xe xeVar = this.c;
            Activity activity = this.f455a;
            View view = this.b;
            xeVar.d.getClass();
            RcdMetadata M = MetaData.A().M();
            if (M == null || !M.c()) {
                M = null;
            }
            RcdTargets b = M != null ? M.b() : null;
            if (b == null) {
                return;
            }
            try {
                Collection a2 = b.a(8);
                String name = activity.getClass().getName();
                if (a2.contains(name)) {
                    xeVar.a(name, 8);
                    return;
                }
            } catch (Throwable th) {
                n8.a(th);
            }
            try {
                xeVar.a(b, view);
            } catch (Throwable th2) {
                n8.a(th2);
            }
            ((Executor) xeVar.c.a()).execute(xeVar.j);
        } catch (Throwable th3) {
            n8.a(th3);
        }
    }
}
