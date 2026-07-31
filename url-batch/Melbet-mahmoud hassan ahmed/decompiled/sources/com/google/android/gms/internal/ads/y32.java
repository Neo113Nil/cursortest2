package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class y32 {

    /* renamed from: h, reason: collision with root package name */
    private static final SparseArray<ot> f14525h;

    /* renamed from: a, reason: collision with root package name */
    private final Context f14526a;

    /* renamed from: b, reason: collision with root package name */
    private final aa1 f14527b;

    /* renamed from: c, reason: collision with root package name */
    private final TelephonyManager f14528c;

    /* renamed from: d, reason: collision with root package name */
    private final r32 f14529d;

    /* renamed from: e, reason: collision with root package name */
    private final n32 f14530e;

    /* renamed from: f, reason: collision with root package name */
    private final a3.t1 f14531f;

    /* renamed from: g, reason: collision with root package name */
    private int f14532g;

    static {
        SparseArray<ot> sparseArray = new SparseArray<>();
        f14525h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), ot.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        ot otVar = ot.CONNECTING;
        sparseArray.put(ordinal, otVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), otVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), otVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), ot.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        ot otVar2 = ot.DISCONNECTED;
        sparseArray.put(ordinal2, otVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), otVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), ot.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), otVar);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), otVar);
    }

    y32(Context context, aa1 aa1Var, r32 r32Var, n32 n32Var, a3.t1 t1Var) {
        this.f14526a = context;
        this.f14527b = aa1Var;
        this.f14529d = r32Var;
        this.f14530e = n32Var;
        this.f14528c = (TelephonyManager) context.getSystemService("phone");
        this.f14531f = t1Var;
    }

    static /* bridge */ /* synthetic */ ft a(y32 y32Var, Bundle bundle) {
        xs F = ft.F();
        int i7 = bundle.getInt("cnt", -2);
        int i8 = bundle.getInt("gnt", 0);
        int i9 = 2;
        if (i7 == -1) {
            y32Var.f14532g = 2;
        } else {
            y32Var.f14532g = 1;
            if (i7 == 0) {
                F.s(2);
            } else if (i7 != 1) {
                F.s(1);
            } else {
                F.s(3);
            }
            switch (i8) {
                case 1:
                case 2:
                case 4:
                case c4.w0.f2149o /* 7 */:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case c4.w0.f2150p /* 8 */:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i9 = 3;
                    break;
                case 13:
                    i9 = 5;
                    break;
                default:
                    i9 = 1;
                    break;
            }
            F.r(i9);
        }
        return F.o();
    }

    static /* bridge */ /* synthetic */ byte[] f(y32 y32Var, boolean z6, ArrayList arrayList, ft ftVar, ot otVar) {
        jt M = kt.M();
        M.r(arrayList);
        M.y(g(y2.t.r().a(y32Var.f14526a.getContentResolver()) != 0));
        M.z(y2.t.r().p(y32Var.f14526a, y32Var.f14528c));
        M.w(y32Var.f14529d.d());
        M.v(y32Var.f14529d.b());
        M.s(y32Var.f14529d.a());
        M.t(otVar);
        M.u(ftVar);
        M.A(y32Var.f14532g);
        M.B(g(z6));
        M.x(y2.t.a().b());
        M.C(g(y2.t.r().b(y32Var.f14526a.getContentResolver()) != 0));
        return M.o().d();
    }

    private static final int g(boolean z6) {
        return z6 ? 2 : 1;
    }

    public final void e(boolean z6) {
        rb3.r(this.f14527b.b(), new x32(this, z6), wo0.f13899f);
    }
}
