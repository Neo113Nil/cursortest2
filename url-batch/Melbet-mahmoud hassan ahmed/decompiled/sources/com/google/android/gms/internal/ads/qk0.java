package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class qk0 implements i3.b {

    /* renamed from: a, reason: collision with root package name */
    private final ck0 f10736a;

    public qk0(ck0 ck0Var) {
        this.f10736a = ck0Var;
    }

    @Override // i3.b
    public final int a() {
        ck0 ck0Var = this.f10736a;
        if (ck0Var != null) {
            try {
                return ck0Var.b();
            } catch (RemoteException e7) {
                io0.h("Could not forward getAmount to RewardItem", e7);
            }
        }
        return 0;
    }

    @Override // i3.b
    public final String getType() {
        ck0 ck0Var = this.f10736a;
        if (ck0Var != null) {
            try {
                return ck0Var.d();
            } catch (RemoteException e7) {
                io0.h("Could not forward getType to RewardItem", e7);
            }
        }
        return null;
    }
}
