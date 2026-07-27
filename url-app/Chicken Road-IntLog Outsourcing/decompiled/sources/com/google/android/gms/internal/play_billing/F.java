package com.google.android.gms.internal.play_billing;

import b2.AbstractC0279e;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends AbstractC0344k implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final F f5044b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f5045c;

    /* renamed from: a, reason: collision with root package name */
    public final transient S f5046a;

    static {
        C0388z c0388z = C.f5030b;
        f5044b = new F(S.f5100e);
        Object[] objArr = {P.f5088c};
        for (int i2 = 0; i2 < 1; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC0279e.d(i2, "at index "));
            }
        }
        f5045c = new F(C.j(1, objArr));
    }

    public F(S s2) {
        this.f5046a = s2;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0344k
    public final /* bridge */ /* synthetic */ H a() {
        S s2 = this.f5046a;
        return s2.isEmpty() ? Y.f5136i : new Z(s2, O.f5086a);
    }
}
