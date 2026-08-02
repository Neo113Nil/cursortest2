package d2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f8313d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f8314a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f8316c;

    public z(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f8314a = str;
        if (TextUtils.isEmpty("com.google.android.gms")) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
        this.f8315b = "com.google.android.gms";
        this.f8316c = z;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f8314a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f8316c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f8313d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f8315b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return s.e(this.f8314a, zVar.f8314a) && s.e(this.f8315b, zVar.f8315b) && s.e(null, null) && this.f8316c == zVar.f8316c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8314a, this.f8315b, null, 4225, Boolean.valueOf(this.f8316c)});
    }

    public final String toString() {
        String str = this.f8314a;
        if (str != null) {
            return str;
        }
        s.c(null);
        throw null;
    }
}
