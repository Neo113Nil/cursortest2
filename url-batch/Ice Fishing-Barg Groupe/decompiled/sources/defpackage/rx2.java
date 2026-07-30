package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class rx2 {
    public static final Uri Y1f8riQaR6yg = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String PxuCJdSBwIXG;
    public final boolean TSizfFm2Yiuu;
    public final String lS5Rgt96tfkO;

    public rx2(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            u9.XL4ISE6Oc65B("Given String is empty or null");
            throw null;
        }
        this.PxuCJdSBwIXG = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            u9.XL4ISE6Oc65B("Given String is empty or null");
            throw null;
        }
        this.lS5Rgt96tfkO = "com.google.android.gms";
        this.TSizfFm2Yiuu = z;
    }

    public final Intent PxuCJdSBwIXG(Context context) {
        Bundle bundle;
        String str = this.PxuCJdSBwIXG;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.TSizfFm2Yiuu) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(Y1f8riQaR6yg, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.lS5Rgt96tfkO) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx2)) {
            return false;
        }
        rx2 rx2Var = (rx2) obj;
        return ni0.BRwzKIf41E4i(this.PxuCJdSBwIXG, rx2Var.PxuCJdSBwIXG) && ni0.BRwzKIf41E4i(this.lS5Rgt96tfkO, rx2Var.lS5Rgt96tfkO) && ni0.BRwzKIf41E4i(null, null) && this.TSizfFm2Yiuu == rx2Var.TSizfFm2Yiuu;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.PxuCJdSBwIXG, this.lS5Rgt96tfkO, null, 4225, Boolean.valueOf(this.TSizfFm2Yiuu)});
    }

    public final String toString() {
        String str = this.PxuCJdSBwIXG;
        if (str != null) {
            return str;
        }
        jh0.x50lh2ztY7Y5(null);
        throw null;
    }
}
