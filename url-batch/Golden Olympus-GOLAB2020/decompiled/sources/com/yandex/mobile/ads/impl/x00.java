package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;

/* loaded from: classes3.dex */
public final class x00 implements InterfaceC2259tl {

    /* renamed from: b, reason: collision with root package name */
    public final int f34356b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34357c;

    /* renamed from: d, reason: collision with root package name */
    public final int f34358d;

    static {
        new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.Cl
            @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
            public final InterfaceC2259tl fromBundle(Bundle bundle) {
                x00 a4;
                a4 = x00.a(bundle);
                return a4;
            }
        };
    }

    public x00(int i4, int i5, int i6) {
        this.f34356b = i4;
        this.f34357c = i5;
        this.f34358d = i6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static x00 a(Bundle bundle) {
        return new x00(bundle.getInt(Integer.toString(0, 36), 0), bundle.getInt(Integer.toString(1, 36), 0), bundle.getInt(Integer.toString(2, 36), 0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x00)) {
            return false;
        }
        x00 x00Var = (x00) obj;
        return this.f34356b == x00Var.f34356b && this.f34357c == x00Var.f34357c && this.f34358d == x00Var.f34358d;
    }

    public final int hashCode() {
        return ((((this.f34356b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f34357c) * 31) + this.f34358d;
    }
}
