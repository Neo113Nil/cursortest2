package defpackage;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class bp3 {
    public static final Uri d = new Uri.Builder().scheme(FirebaseAnalytics.Param.CONTENT).authority("com.google.android.gms.chimera").build();
    public final String a;
    public final String b;
    public final boolean c;

    public bp3(String str, boolean z) {
        ll3.s(str);
        this.a = str;
        ll3.s("com.google.android.gms");
        this.b = "com.google.android.gms";
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent a(Context context) {
        Bundle bundle;
        PendingIntent pendingIntent;
        ContentProviderClient acquireUnstableContentProviderClient;
        Intent intent = null;
        String str = this.a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(d);
            } catch (RemoteException e) {
                e = e;
                bundle = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundle == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                bundle = null;
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                if (bundle == null) {
                }
                if (intent == null) {
                }
                if (intent == null) {
                }
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                try {
                } catch (RemoteException e3) {
                    e = e3;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                } catch (IllegalArgumentException e4) {
                    e = e4;
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    if (bundle == null) {
                    }
                    if (intent == null) {
                    }
                    if (intent == null) {
                    }
                }
                if (bundle == null && (intent = (Intent) bundle.getParcelable("serviceResponseIntentKey")) == null && (pendingIntent = (PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey")) != null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action " + str + " but has possible resolution");
                    throw new bc3(new c10(25, pendingIntent));
                }
                if (intent == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(str));
                }
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        }
        return intent == null ? new Intent(str).setPackage(this.b) : intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp3)) {
            return false;
        }
        bp3 bp3Var = (bp3) obj;
        return ll3.C(this.a, bp3Var.a) && ll3.C(this.b, bp3Var.b) && ll3.C(null, null) && this.c == bp3Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, 4225, Boolean.valueOf(this.c)});
    }

    public final String toString() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        ll3.v(null);
        throw null;
    }
}
