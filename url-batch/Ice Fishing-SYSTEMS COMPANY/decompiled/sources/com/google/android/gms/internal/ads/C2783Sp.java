package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;

/* renamed from: com.google.android.gms.internal.ads.Sp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2783Sp extends D2.a {

    /* renamed from: B, reason: collision with root package name */
    public static final SparseArray f27620B;

    /* renamed from: A, reason: collision with root package name */
    public int f27621A;

    /* renamed from: w, reason: collision with root package name */
    public final Context f27622w;

    /* renamed from: x, reason: collision with root package name */
    public final C3.j f27623x;

    /* renamed from: y, reason: collision with root package name */
    public final TelephonyManager f27624y;

    /* renamed from: z, reason: collision with root package name */
    public final C2749Qp f27625z;

    static {
        SparseArray sparseArray = new SparseArray();
        f27620B = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC3456k9.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC3456k9 enumC3456k9 = EnumC3456k9.CONNECTING;
        sparseArray.put(ordinal, enumC3456k9);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC3456k9);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC3456k9);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC3456k9.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC3456k9 enumC3456k92 = EnumC3456k9.DISCONNECTED;
        sparseArray.put(ordinal2, enumC3456k92);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC3456k92);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC3456k92);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC3456k92);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC3456k92);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC3456k9.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC3456k9);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC3456k9);
    }

    public C2783Sp(Context context, C3.j jVar, C2749Qp c2749Qp, C2593Hm c2593Hm, t2.E e6) {
        super(c2593Hm, e6);
        this.f27622w = context;
        this.f27623x = jVar;
        this.f27625z = c2749Qp;
        this.f27624y = (TelephonyManager) context.getSystemService("phone");
    }
}
