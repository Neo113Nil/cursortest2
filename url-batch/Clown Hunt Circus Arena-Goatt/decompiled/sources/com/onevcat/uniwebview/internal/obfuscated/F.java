package com.onevcat.uniwebview.internal.obfuscated;

import android.content.ComponentName;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class F extends CustomTabsServiceConnection {
    public final WeakReference a;

    public F(B3 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.a = new WeakReference(owner);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName name, CustomTabsClient client) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(client, "client");
        B3 b3 = (B3) this.a.get();
        if (b3 == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(this, "connection");
        if (b3.i) {
            try {
                b3.a.unbindService(this);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        b3.e = client;
        if (Intrinsics.areEqual(b3.x, Boolean.TRUE)) {
            client.warmup(0L);
        }
        b3.a();
        if (b3.p) {
            b3.b();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        B3 b3 = (B3) this.a.get();
        if (b3 != null) {
            b3.e = null;
            b3.h = false;
        }
    }
}
