package r3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f21344f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f21345a;

    /* renamed from: b, reason: collision with root package name */
    private final String f21346b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f21347c;

    /* renamed from: d, reason: collision with root package name */
    private final int f21348d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f21349e;

    public z0(String str, String str2, int i7, boolean z6) {
        o.f(str);
        this.f21345a = str;
        o.f(str2);
        this.f21346b = str2;
        this.f21347c = null;
        this.f21348d = i7;
        this.f21349e = z6;
    }

    public final String a() {
        return this.f21346b;
    }

    public final ComponentName b() {
        return this.f21347c;
    }

    public final int c() {
        return this.f21348d;
    }

    public final Intent d(Context context) {
        Bundle bundle;
        if (this.f21345a == null) {
            return new Intent().setComponent(this.f21347c);
        }
        if (this.f21349e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f21345a);
            try {
                bundle = context.getContentResolver().call(f21344f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e7) {
                String valueOf = String.valueOf(e7);
                StringBuilder sb = new StringBuilder(valueOf.length() + 34);
                sb.append("Dynamic intent resolution failed: ");
                sb.append(valueOf);
                Log.w("ConnectionStatusConfig", sb.toString());
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                String valueOf2 = String.valueOf(this.f21345a);
                Log.w("ConnectionStatusConfig", valueOf2.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf2) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return r2 != null ? r2 : new Intent(this.f21345a).setPackage(this.f21346b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return n.a(this.f21345a, z0Var.f21345a) && n.a(this.f21346b, z0Var.f21346b) && n.a(this.f21347c, z0Var.f21347c) && this.f21348d == z0Var.f21348d && this.f21349e == z0Var.f21349e;
    }

    public final int hashCode() {
        return n.b(this.f21345a, this.f21346b, this.f21347c, Integer.valueOf(this.f21348d), Boolean.valueOf(this.f21349e));
    }

    public final String toString() {
        String str = this.f21345a;
        if (str != null) {
            return str;
        }
        o.i(this.f21347c);
        return this.f21347c.flattenToString();
    }
}
