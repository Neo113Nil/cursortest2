package U0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: d, reason: collision with root package name */
    public static final Uri f2486d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    public final String f2487a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2488b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2489c;

    public A(String str, boolean z5) {
        t.c(str);
        this.f2487a = str;
        t.c("com.google.android.gms");
        this.f2488b = "com.google.android.gms";
        this.f2489c = z5;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        String str = this.f2487a;
        if (str == null) {
            return new Intent().setComponent(null);
        }
        if (this.f2489c) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", str);
            try {
                bundle = context.getContentResolver().call(f2486d, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e4) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e4.toString()));
                bundle = null;
            }
            r1 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r1 == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
            }
        }
        return r1 == null ? new Intent(str).setPackage(this.f2488b) : r1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a7 = (A) obj;
        return t.i(this.f2487a, a7.f2487a) && t.i(this.f2488b, a7.f2488b) && t.i(null, null) && this.f2489c == a7.f2489c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f2487a, this.f2488b, null, 4225, Boolean.valueOf(this.f2489c)});
    }

    public final String toString() {
        String str = this.f2487a;
        if (str != null) {
            return str;
        }
        t.f(null);
        throw null;
    }
}
