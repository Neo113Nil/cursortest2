package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.InterfaceC2259tl;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class eq implements InterfaceC2259tl {

    /* renamed from: g, reason: collision with root package name */
    public static final InterfaceC2259tl.a<eq> f25385g = new InterfaceC2259tl.a() { // from class: com.yandex.mobile.ads.impl.V1
        @Override // com.yandex.mobile.ads.impl.InterfaceC2259tl.a
        public final InterfaceC2259tl fromBundle(Bundle bundle) {
            eq a4;
            a4 = eq.a(bundle);
            return a4;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final int f25386b;

    /* renamed from: c, reason: collision with root package name */
    public final int f25387c;

    /* renamed from: d, reason: collision with root package name */
    public final int f25388d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f25389e;

    /* renamed from: f, reason: collision with root package name */
    private int f25390f;

    public eq(int i4, int i5, int i6, byte[] bArr) {
        this.f25386b = i4;
        this.f25387c = i5;
        this.f25388d = i6;
        this.f25389e = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static eq a(Bundle bundle) {
        return new eq(bundle.getInt(Integer.toString(0, 36), -1), bundle.getInt(Integer.toString(1, 36), -1), bundle.getInt(Integer.toString(2, 36), -1), bundle.getByteArray(Integer.toString(3, 36)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eq.class == obj.getClass()) {
            eq eqVar = (eq) obj;
            if (this.f25386b == eqVar.f25386b && this.f25387c == eqVar.f25387c && this.f25388d == eqVar.f25388d && Arrays.equals(this.f25389e, eqVar.f25389e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f25390f == 0) {
            this.f25390f = Arrays.hashCode(this.f25389e) + ((((((this.f25386b + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f25387c) * 31) + this.f25388d) * 31);
        }
        return this.f25390f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f25386b);
        sb.append(", ");
        sb.append(this.f25387c);
        sb.append(", ");
        sb.append(this.f25388d);
        sb.append(", ");
        sb.append(this.f25389e != null);
        sb.append(")");
        return sb.toString();
    }
}
