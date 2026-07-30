package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.lang.reflect.Array;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yq implements rh, d43 {
    public final /* synthetic */ int m;
    public int n;
    public int o;
    public final Object p;

    public yq(int i, int i2, int i3) {
        this.m = i3;
        switch (i3) {
            case 1:
                this.p = null;
                this.n = i;
                int i4 = i2 & 7;
                this.o = i4 == 0 ? 8 : i4;
                break;
            default:
                this.p = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i2, i);
                this.n = i;
                this.o = i2;
                break;
        }
    }

    @Override // defpackage.rh
    public void b(int i, Object obj) {
        ((rh) this.p).b(i + (this.o == 0 ? this.n : 0), obj);
    }

    @Override // defpackage.rh
    public void c(Object obj) {
        this.o++;
        ((rh) this.p).c(obj);
    }

    @Override // defpackage.rh
    public void d() {
        ((rh) this.p).d();
    }

    @Override // defpackage.rh
    public void f(int i, Object obj) {
        ((rh) this.p).f(i + (this.o == 0 ? this.n : 0), obj);
    }

    @Override // defpackage.rh
    public void h(int i, int i2, int i3) {
        int i4 = this.o == 0 ? this.n : 0;
        ((rh) this.p).h(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.rh
    public Object i() {
        return ((rh) this.p).i();
    }

    @Override // defpackage.rh
    public void j(int i, int i2) {
        ((rh) this.p).j(i + (this.o == 0 ? this.n : 0), i2);
    }

    @Override // defpackage.d43
    public int k() {
        return this.o;
    }

    @Override // defpackage.c43
    public sd l(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        return ((js0) this.p).l(j, sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.d43
    public int m() {
        return this.n;
    }

    @Override // defpackage.c43
    public sd n(long j, sd sdVar, sd sdVar2, sd sdVar3) {
        return ((js0) this.p).n(j, sdVar, sdVar2, sdVar3);
    }

    @Override // defpackage.rh
    public void p() {
        if (this.o <= 0) {
            b00.c("OffsetApplier up called with no corresponding down");
        }
        this.o--;
        ((rh) this.p).p();
    }

    @Override // defpackage.rh
    public void q(Object obj, Function2 function2) {
        ((rh) this.p).q(obj, function2);
    }

    public byte r(int i, int i2) {
        return ((byte[][]) this.p)[i2][i];
    }

    public void s(int i, int i2, int i3) {
        ((byte[][]) this.p)[i2][i] = (byte) i3;
    }

    public void t(int i, int i2, boolean z) {
        ((byte[][]) this.p)[i2][i] = z ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        switch (this.m) {
            case 0:
                int i = this.n;
                int i2 = this.o;
                StringBuilder sb = new StringBuilder((i * 2 * i2) + 2);
                for (int i3 = 0; i3 < i2; i3++) {
                    byte[] bArr = ((byte[][]) this.p)[i3];
                    for (int i4 = 0; i4 < i; i4++) {
                        byte b = bArr[i4];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append('\n');
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public synchronized int u() {
        PackageInfo packageInfo;
        if (this.n == 0) {
            try {
                packageInfo = i93.a((Context) this.p).c(0, "com.google.android.gms");
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.n = packageInfo.versionCode;
            }
        }
        return this.n;
    }

    public synchronized int v() {
        int i = this.o;
        if (i != 0) {
            return i;
        }
        Context context = (Context) this.p;
        PackageManager packageManager = context.getPackageManager();
        if (((Context) i93.a(context).a).getPackageManager().checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!s03.A()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.o = i2;
                return i2;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.o = i2;
            return i2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == s03.A()) {
            i2 = 2;
        }
        this.o = i2;
        return i2;
    }

    public yq(Context context) {
        this.m = 4;
        this.o = 0;
        this.p = context;
    }

    public yq() {
        this.m = 1;
        this.p = new yq[256];
        this.n = 0;
        this.o = 0;
    }

    public yq(rh rhVar, int i) {
        this.m = 2;
        this.p = rhVar;
        this.n = i;
    }

    public yq(int i, int i2, bf0 bf0Var) {
        this.m = 3;
        this.n = i;
        this.o = i2;
        this.p = new js0((tm0) new vm0(i, i2, bf0Var));
    }
}
