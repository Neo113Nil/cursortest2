package N0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f1070d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f1071a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1072b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1073c;

    public y(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f1071a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f1072b = "com.google.android.gms";
        this.f1073c = z;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f1071a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f1073c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f1070d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e3) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e3.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f1072b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return r.e(this.f1071a, yVar.f1071a) && r.e(this.f1072b, yVar.f1072b) && r.e(null, null) && this.f1073c == yVar.f1073c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1071a, this.f1072b, null, 4225, Boolean.valueOf(this.f1073c)});
    }

    public final String toString() {
        String str = this.f1071a;
        if (str != null) {
            return str;
        }
        r.c(null);
        throw null;
    }
}
