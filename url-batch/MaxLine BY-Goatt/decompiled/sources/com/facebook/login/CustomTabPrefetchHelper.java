package com.facebook.login;

import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import defpackage.oz0;
import defpackage.pz0;
import defpackage.rz0;
import defpackage.u50;
import defpackage.v50;
import defpackage.y50;
import defpackage.z50;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomTabPrefetchHelper extends y50 {
    private static v50 client;
    private static z50 session;
    public static final Companion Companion = new Companion(null);
    private static final ReentrantLock lock = new ReentrantLock();

    public static final z50 getPreparedSessionOnce() {
        return Companion.getPreparedSessionOnce();
    }

    public static final void mayLaunchUrl(Uri uri) {
        Companion.mayLaunchUrl(uri);
    }

    @Override // defpackage.y50
    public void onCustomTabsServiceConnected(ComponentName componentName, v50 v50Var) {
        componentName.getClass();
        v50Var.getClass();
        try {
            ((pz0) v50Var.a).d();
        } catch (RemoteException unused) {
        }
        client = v50Var;
        Companion.prepareSession();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void prepareSession() {
            v50 v50Var;
            z50 z50Var;
            CustomTabPrefetchHelper.lock.lock();
            if (CustomTabPrefetchHelper.session == null && (v50Var = CustomTabPrefetchHelper.client) != null) {
                rz0 rz0Var = v50Var.a;
                u50 u50Var = new u50();
                u50Var.attachInterface(u50Var, oz0.a);
                new Handler(Looper.getMainLooper());
                if (((pz0) rz0Var).c(u50Var)) {
                    z50Var = new z50(rz0Var, u50Var, v50Var.b);
                    CustomTabPrefetchHelper.session = z50Var;
                }
                z50Var = null;
                CustomTabPrefetchHelper.session = z50Var;
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        public final z50 getPreparedSessionOnce() {
            CustomTabPrefetchHelper.lock.lock();
            z50 z50Var = CustomTabPrefetchHelper.session;
            CustomTabPrefetchHelper.session = null;
            CustomTabPrefetchHelper.lock.unlock();
            return z50Var;
        }

        public final void mayLaunchUrl(Uri uri) {
            uri.getClass();
            prepareSession();
            CustomTabPrefetchHelper.lock.lock();
            z50 z50Var = CustomTabPrefetchHelper.session;
            if (z50Var != null) {
                Bundle bundle = new Bundle();
                try {
                    ((pz0) z50Var.a).b(z50Var.b, uri, bundle);
                } catch (RemoteException unused) {
                }
            }
            CustomTabPrefetchHelper.lock.unlock();
        }

        private Companion() {
        }
    }
}
