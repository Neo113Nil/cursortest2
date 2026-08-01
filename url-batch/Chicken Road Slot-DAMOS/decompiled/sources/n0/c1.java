package n0;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c1 implements a, v.e1 {

    /* renamed from: d, reason: collision with root package name */
    public int f6647d;

    /* renamed from: e, reason: collision with root package name */
    public int f6648e;

    /* renamed from: i, reason: collision with root package name */
    public final Object f6649i;

    public c1(int i3, int i10, v.n nVar) {
        this.f6647d = i3;
        this.f6648e = i10;
        this.f6649i = new com.google.firebase.messaging.v(new v.s(i3, i10, nVar));
    }

    @Override // n0.a
    public void b(int i3, Object obj) {
        ((a) this.f6649i).b(i3 + (this.f6648e == 0 ? this.f6647d : 0), obj);
    }

    @Override // n0.a
    public void c(Object obj) {
        this.f6648e++;
        ((a) this.f6649i).c(obj);
    }

    @Override // n0.a
    public void d() {
        ((a) this.f6649i).d();
    }

    @Override // n0.a
    public void e(int i3, Object obj) {
        ((a) this.f6649i).e(i3 + (this.f6648e == 0 ? this.f6647d : 0), obj);
    }

    @Override // n0.a
    public void g(int i3, int i10, int i11) {
        int i12 = this.f6648e == 0 ? this.f6647d : 0;
        ((a) this.f6649i).g(i3 + i12, i10 + i12, i11);
    }

    @Override // n0.a
    public Object getCurrent() {
        return ((a) this.f6649i).getCurrent();
    }

    @Override // n0.a
    public void h(int i3, int i10) {
        ((a) this.f6649i).h(i3 + (this.f6648e == 0 ? this.f6647d : 0), i10);
    }

    @Override // v.b1
    public v.l i(long j, v.l lVar, v.l lVar2, v.l lVar3) {
        return ((com.google.firebase.messaging.v) this.f6649i).i(j, lVar, lVar2, lVar3);
    }

    @Override // v.b1
    public long j(v.l lVar, v.l lVar2, v.l lVar3) {
        return (this.f6648e + this.f6647d) * 1000000;
    }

    @Override // n0.a
    public void l() {
        if (this.f6648e <= 0) {
            m.a("OffsetApplier up called with no corresponding down");
        }
        this.f6648e--;
        ((a) this.f6649i).l();
    }

    @Override // n0.a
    public void m(Object obj, Function2 function2) {
        ((a) this.f6649i).m(obj, function2);
    }

    @Override // v.b1
    public v.l n(long j, v.l lVar, v.l lVar2, v.l lVar3) {
        return ((com.google.firebase.messaging.v) this.f6649i).n(j, lVar, lVar2, lVar3);
    }

    public synchronized int o() {
        int i3 = this.f6648e;
        if (i3 != 0) {
            return i3;
        }
        Context context = (Context) this.f6649i;
        PackageManager packageManager = context.getPackageManager();
        if (i7.b.a(context).f1772d.getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i10 = 1;
        if (!g7.b.b()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.f6648e = i10;
                return i10;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i10 = 2;
            this.f6648e = i10;
            return i10;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == g7.b.b()) {
            i10 = 2;
        }
        this.f6648e = i10;
        return i10;
    }

    public synchronized int p() {
        PackageInfo packageInfo;
        if (this.f6647d == 0) {
            try {
                packageInfo = i7.b.a((Context) this.f6649i).e(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w("Metadata", "Failed to find package ".concat(e2.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f6647d = packageInfo.versionCode;
            }
        }
        return this.f6647d;
    }

    public c1(a aVar, int i3) {
        this.f6649i = aVar;
        this.f6647d = i3;
    }

    public c1(Context context) {
        this.f6648e = 0;
        this.f6649i = context;
    }
}
