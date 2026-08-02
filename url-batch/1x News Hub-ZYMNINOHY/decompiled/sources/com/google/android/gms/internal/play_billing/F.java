package com.google.android.gms.internal.play_billing;

import E1.AbstractC0033i;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class F extends AbstractC0235k implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final F f2728b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f2729c;

    /* renamed from: a, reason: collision with root package name */
    public final transient Q f2730a;

    static {
        C0279z c0279z = C.f2714b;
        f2728b = new F(Q.f2774e);
        Object[] objArr = {O.f2770c};
        for (int i3 = 0; i3 < 1; i3++) {
            if (objArr[i3] == null) {
                throw new NullPointerException(AbstractC0033i.h(i3, "at index "));
            }
        }
        f2729c = new F(C.j(1, objArr));
    }

    public F(Q q3) {
        this.f2730a = q3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0235k
    public final /* bridge */ /* synthetic */ H a() {
        Q q3 = this.f2730a;
        return q3.isEmpty() ? X.f2810i : new Y(q3, M.f2762c);
    }
}
