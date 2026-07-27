package H1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f3299d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f3300a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3301b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3302c;

    public v(String str, boolean z4) {
        o.b(str);
        this.f3300a = str;
        o.b("com.google.android.gms");
        this.f3301b = "com.google.android.gms";
        this.f3302c = z4;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f3300a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f3302c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f3299d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f3301b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return o.f(this.f3300a, vVar.f3300a) && o.f(this.f3301b, vVar.f3301b) && o.f(null, null) && this.f3302c == vVar.f3302c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3300a, this.f3301b, null, 4225, Boolean.valueOf(this.f3302c)});
    }

    public final String toString() {
        String str = this.f3300a;
        if (str != null) {
            return str;
        }
        o.d(null);
        throw null;
    }
}
