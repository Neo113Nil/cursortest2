package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class W0 implements InterfaceC2916aB {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ W0 f28338u = new W0(0);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ W0 f28339v = new W0(1);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ W0 f28340w = new W0(2);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ W0 f28341x = new W0(3);

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ W0 f28342y = new W0(4);

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28343n;

    public /* synthetic */ W0(int i) {
        this.f28343n = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2916aB
    public final /* synthetic */ boolean b(Object obj) {
        switch (this.f28343n) {
            case 0:
                C2907a2 c2907a2 = (C2907a2) obj;
                if (c2907a2.f29160b.equals("com.apple.iTunes") && c2907a2.f29161c.equals("iTunSMPB")) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                int i = S2.f27472G;
                break;
            case 3:
                if (((Map.Entry) obj).getKey() != null) {
                    break;
                }
                break;
            default:
                if (((String) obj) != null) {
                    break;
                }
                break;
        }
        return true;
    }
}
