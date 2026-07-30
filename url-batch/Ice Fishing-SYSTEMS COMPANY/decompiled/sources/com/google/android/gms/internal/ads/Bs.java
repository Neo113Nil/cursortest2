package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class Bs implements Qs {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24100a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f24101b;

    public /* synthetic */ Bs(Boolean bool, int i) {
        this.f24100a = i;
        this.f24101b = bool;
    }

    @Override // com.google.android.gms.internal.ads.Qs
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        switch (this.f24100a) {
            case 0:
                Bundle bundle = (Bundle) obj;
                Boolean bool = this.f24101b;
                if (bool != null) {
                    bundle.putBoolean("hw_accel", bool.booleanValue());
                    break;
                }
                break;
            default:
                Bundle bundle2 = (Bundle) obj;
                Boolean bool2 = this.f24101b;
                if (bool2 != null) {
                    if (!bool2.booleanValue()) {
                        bundle2.putInt("lft", 0);
                        break;
                    } else {
                        bundle2.putInt("lft", 1);
                        break;
                    }
                } else {
                    bundle2.putInt("lft", -1);
                    break;
                }
        }
    }
}
