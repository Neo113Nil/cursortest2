package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.a;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.SignInConnectionListener;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zbc extends a implements SignInConnectionListener {
    private final Semaphore zba;
    private final Set zbb;

    public zbc(Context context, Set set) {
        super(context);
        this.zba = new Semaphore(0);
        this.zbb = set;
    }

    @Override // androidx.loader.content.a
    public final /* bridge */ /* synthetic */ Object loadInBackground() {
        Iterator it = this.zbb.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (((GoogleApiClient) it.next()).maybeSignIn(this)) {
                i4++;
            }
        }
        try {
            this.zba.tryAcquire(i4, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e4) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e4);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.SignInConnectionListener
    public final void onComplete() {
        this.zba.release();
    }

    @Override // androidx.loader.content.b
    protected final void onStartLoading() {
        this.zba.drainPermits();
        forceLoad();
    }
}
