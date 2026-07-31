package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zx2 {

    /* renamed from: a, reason: collision with root package name */
    private final r82 f15297a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15298b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15299c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15300d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f15301e;

    /* renamed from: f, reason: collision with root package name */
    private final fs2 f15302f;

    /* renamed from: g, reason: collision with root package name */
    private final v3.d f15303g;

    /* renamed from: h, reason: collision with root package name */
    private final gb f15304h;

    public zx2(r82 r82Var, po0 po0Var, String str, String str2, Context context, fs2 fs2Var, v3.d dVar, gb gbVar) {
        this.f15297a = r82Var;
        this.f15298b = po0Var.f10301f;
        this.f15299c = str;
        this.f15300d = str2;
        this.f15301e = context;
        this.f15302f = fs2Var;
        this.f15303g = dVar;
        this.f15304h = gbVar;
    }

    public static final List<String> d(int i7, int i8, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i8);
            arrayList.add(f(str, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    private static String e(String str) {
        return (TextUtils.isEmpty(str) || !ho0.l()) ? str : "fakeForAdDebugLog";
    }

    private static String f(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    public final List<String> a(ds2 ds2Var, rr2 rr2Var, List<String> list) {
        return b(ds2Var, rr2Var, false, "", "", list);
    }

    public final List<String> b(ds2 ds2Var, rr2 rr2Var, boolean z6, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z6 ? "0" : "1";
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String f7 = f(f(f(it.next(), "@gw_adlocid@", ds2Var.f4312a.f2953a.f7620f), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.f15298b);
            if (rr2Var != null) {
                f7 = rm0.c(f(f(f(f7, "@gw_qdata@", rr2Var.f11403z), "@gw_adnetid@", rr2Var.f11402y), "@gw_allocid@", rr2Var.f11401x), this.f15301e, rr2Var.T);
            }
            String f8 = f(f(f(f7, "@gw_adnetstatus@", this.f15297a.f()), "@gw_seqnum@", this.f15299c), "@gw_sessid@", this.f15300d);
            boolean z7 = false;
            if (((Boolean) sw.c().b(m10.f8211h2)).booleanValue() && !TextUtils.isEmpty(str)) {
                z7 = true;
            }
            boolean z8 = !TextUtils.isEmpty(str2);
            if (!z7) {
                if (z8) {
                    z8 = true;
                } else {
                    arrayList.add(f8);
                }
            }
            if (this.f15304h.f(Uri.parse(f8))) {
                Uri.Builder buildUpon = Uri.parse(f8).buildUpon();
                if (z7) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z8) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                f8 = buildUpon.build().toString();
            }
            arrayList.add(f8);
        }
        return arrayList;
    }

    public final List<String> c(rr2 rr2Var, List<String> list, mj0 mj0Var) {
        ArrayList arrayList = new ArrayList();
        long b7 = this.f15303g.b();
        try {
            String c7 = mj0Var.c();
            String num = Integer.toString(mj0Var.a());
            fs2 fs2Var = this.f15302f;
            String e7 = fs2Var == null ? "" : e(fs2Var.f5192a);
            fs2 fs2Var2 = this.f15302f;
            String e8 = fs2Var2 != null ? e(fs2Var2.f5193b) : "";
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(rm0.c(f(f(f(f(f(f(it.next(), "@gw_rwd_userid@", Uri.encode(e7)), "@gw_rwd_custom_data@", Uri.encode(e8)), "@gw_tmstmp@", Long.toString(b7)), "@gw_rwd_itm@", Uri.encode(c7)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.f15298b), this.f15301e, rr2Var.T));
            }
            return arrayList;
        } catch (RemoteException e9) {
            io0.e("Unable to determine award type and amount.", e9);
            return arrayList;
        }
    }
}
