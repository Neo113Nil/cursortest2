package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class xq0 implements b9 {
    public int a;
    public int b;
    public final Object c;

    public xq0(Context context) {
        this.b = 0;
        this.c = context;
    }

    @Override // defpackage.b9
    public void a(int i, Object obj) {
        ((b9) this.c).a(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.b9
    public void b(Object obj) {
        this.b++;
        ((b9) this.c).b(obj);
    }

    @Override // defpackage.b9
    public void c() {
        ((b9) this.c).c();
    }

    @Override // defpackage.b9
    public void d(int i, Object obj) {
        ((b9) this.c).d(i + (this.b == 0 ? this.a : 0), obj);
    }

    @Override // defpackage.b9
    public void f(int i, int i2, int i3) {
        int i4 = this.b == 0 ? this.a : 0;
        ((b9) this.c).f(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.b9
    public Object g() {
        return ((b9) this.c).g();
    }

    @Override // defpackage.b9
    public void h(int i, int i2) {
        ((b9) this.c).h(i + (this.b == 0 ? this.a : 0), i2);
    }

    @Override // defpackage.b9
    public void i() {
        if (this.b <= 0) {
            kl.a("OffsetApplier up called with no corresponding down");
        }
        this.b--;
        ((b9) this.c).i();
    }

    @Override // defpackage.b9
    public void j(Object obj, Function2 function2) {
        ((b9) this.c).j(obj, function2);
    }

    public synchronized int k() {
        PackageInfo packageInfo;
        if (this.a == 0) {
            try {
                packageInfo = nq1.a((Context) this.c).d.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.a = packageInfo.versionCode;
            }
        }
        return this.a;
    }

    public synchronized int l() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.c;
        PackageManager packageManager = context.getPackageManager();
        if (nq1.a(context).d.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
        intent.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            this.b = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        this.b = 2;
        return 2;
    }

    public xq0(b9 b9Var, int i) {
        this.c = b9Var;
        this.a = i;
    }
}
