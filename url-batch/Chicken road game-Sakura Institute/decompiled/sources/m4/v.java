package m4;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f6401d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f6402a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6403b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6404c;

    public v(String str, boolean z8) {
        o.b(str);
        this.f6402a = str;
        o.b("com.google.android.gms");
        this.f6403b = "com.google.android.gms";
        this.f6404c = z8;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f6402a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f6404c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f6401d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e9) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e9.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f6403b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return o.f(this.f6402a, vVar.f6402a) && o.f(this.f6403b, vVar.f6403b) && o.f(null, null) && this.f6404c == vVar.f6404c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6402a, this.f6403b, null, 4225, Boolean.valueOf(this.f6404c)});
    }

    public final String toString() {
        String str = this.f6402a;
        if (str != null) {
            return str;
        }
        o.d(null);
        throw null;
    }
}
