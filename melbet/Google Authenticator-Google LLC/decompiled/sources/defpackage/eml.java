package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eml {
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final hac e;
    public final koe f;
    public final gzp g;
    public final gzp h;
    public final gzp i;
    public final koe j;
    public final int k;
    public final gwh l;
    public final iyi m;

    public eml(Context context, gzp gzpVar, String str, koe koeVar, iyi iyiVar, gzp gzpVar2, gzp gzpVar3, gzp gzpVar4, koe koeVar2) {
        this.a = context;
        this.f = koeVar;
        this.b = context.getPackageName();
        ActivityManager activityManager = elh.a;
        this.c = elh.c(context.getPackageName(), elh.b());
        if (gzpVar.f()) {
        }
        this.d = str;
        PackageManager packageManager = context.getPackageManager();
        this.k = true == packageManager.hasSystemFeature("android.hardware.type.automotive") ? 5 : packageManager.hasSystemFeature("android.hardware.type.watch") ? 3 : packageManager.hasSystemFeature("android.software.leanback") ? 4 : 2;
        this.l = new gwh(context);
        this.e = hoq.v(new eks(this, 5));
        this.m = iyiVar;
        this.g = gzpVar2;
        this.h = gzpVar3;
        this.i = gzpVar4;
        this.j = koeVar2;
    }

    public static List a(List list, int i) {
        return list.size() > i ? list.subList(0, i) : list;
    }
}
