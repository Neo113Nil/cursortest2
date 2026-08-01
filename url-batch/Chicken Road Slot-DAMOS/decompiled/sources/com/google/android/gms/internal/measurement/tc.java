package com.google.android.gms.internal.measurement;

import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class tc implements a8.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f2825e;

    public /* synthetic */ tc(int i3, Object obj) {
        this.f2824d = i3;
        this.f2825e = obj;
    }

    @Override // a8.d
    public final Object apply(Object obj) {
        switch (this.f2824d) {
            case 0:
                Log.w("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((vc) this.f2825e).f2887c)), (Throwable) obj);
                return null;
            case 1:
                ec ecVar = (ec) obj;
                ye yeVar = ad.f2142a;
                String str = (String) this.f2825e;
                ac acVar = (ac) ecVar.t(str, bc.u()).k();
                if (!Collections.unmodifiableList(((bc) acVar.f2389e).t()).contains("")) {
                    acVar.b();
                    ((bc) acVar.f2389e).v("");
                }
                dc dcVar = (dc) ecVar.k();
                acVar.b();
                ((bc) acVar.f2389e).w("");
                bc bcVar = (bc) acVar.d();
                dcVar.b();
                ((ec) dcVar.f2389e).v().put(str, bcVar);
                return (ec) dcVar.d();
            default:
                rd rdVar = (rd) this.f2825e;
                zb zbVar = (zb) obj;
                l5 l5Var = new l5(7);
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (rd.j) {
                            zd zdVar = (zd) rdVar.f2751d.get();
                            Uri uri = rdVar.g;
                            l5 l5Var2 = new l5(zbVar.t());
                            l5Var2.f2500i = new l5[]{l5Var};
                            zdVar.a(uri, l5Var2);
                            rdVar.f2754h = zbVar.t();
                        }
                        synchronized (rd.f2747k) {
                            zd zdVar2 = (zd) rdVar.f2751d.get();
                            Uri uri2 = rdVar.f2755i;
                            l5 l5Var3 = new l5(zbVar.u());
                            l5Var3.f2500i = new l5[]{l5Var};
                            zdVar2.a(uri2, l5Var3);
                            zbVar.u();
                        }
                        return null;
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } finally {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
        }
    }
}
