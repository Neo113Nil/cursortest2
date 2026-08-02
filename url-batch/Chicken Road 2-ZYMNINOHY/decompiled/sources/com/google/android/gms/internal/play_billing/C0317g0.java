package com.google.android.gms.internal.play_billing;

import E.AbstractC0005f;

/* renamed from: com.google.android.gms.internal.play_billing.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317g0 implements InterfaceC0357y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0317g0 f5946b = new C0317g0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0317g0 f5947c = new C0317g0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0317g0 f5948d = new C0317g0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0317g0 f5949e = new C0317g0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0317g0 f5950f = new C0317g0(4);

    /* renamed from: g, reason: collision with root package name */
    public static final C0317g0 f5951g = new C0317g0(5);

    /* renamed from: h, reason: collision with root package name */
    public static final C0317g0 f5952h = new C0317g0(6);

    /* renamed from: i, reason: collision with root package name */
    public static final C0317g0 f5953i = new C0317g0(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5954a;

    public /* synthetic */ C0317g0(int i4) {
        this.f5954a = i4;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC0357y0
    public final boolean a(int i4) {
        switch (this.f5954a) {
            case 0:
                switch (i4) {
                }
            case 1:
                switch (i4) {
                    default:
                        switch (i4) {
                        }
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        return true;
                }
            case 2:
                if (AbstractC0005f.b(i4) != 0) {
                }
                break;
            case 3:
                if ((i4 != 0 ? i4 != 1 ? i4 != 2 ? i4 != 3 ? null : l1.ALTERNATIVE_BILLING_ACTION : l1.LOCAL_PURCHASES_UPDATED_ACTION : l1.PURCHASES_UPDATED_ACTION : l1.BROADCAST_ACTION_UNSPECIFIED) != null) {
                }
                break;
            case 4:
                if (i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3) {
                }
                break;
            case 5:
                switch (i4) {
                }
            case 6:
                switch (i4) {
                }
            default:
                if (i4 == 0 || i4 == 1) {
                }
                break;
        }
        return true;
    }
}
