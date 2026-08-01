package com.google.android.gms.internal.measurement;

import android.os.Process;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class bd implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2168d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2169e;

    public /* synthetic */ bd(int i3, Object obj) {
        this.f2168d = i3;
        this.f2169e = obj;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f2168d) {
            case 0:
                throw new RuntimeException(((ExecutionException) this.f2169e).getCause());
            case 1:
                try {
                    f8.l0.b((ListenableFuture) this.f2169e);
                    return;
                } catch (ExecutionException e2) {
                    oa.g().post(new bd(0, e2));
                    return;
                }
            case 2:
                try {
                    f8.l0.b((f8.g0) this.f2169e);
                    return;
                } catch (Exception e9) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e9);
                    return;
                }
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                if (((Boolean) ((hd) this.f2169e).f2380c.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            default:
                try {
                    f8.l0.b((f8.h0) this.f2169e);
                    return;
                } catch (Exception e10) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e10);
                        return;
                    }
                    return;
                }
        }
    }
}
