package com.startapp.sdk.components;

import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.p;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3492b;

    public /* synthetic */ f(int i3, Object obj) {
        this.f3491a = i3;
        this.f3492b = obj;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        switch (this.f3491a) {
            case 0:
                return ((a) this.f3492b).e();
            case 1:
                return ((p) this.f3492b).a();
            default:
                return Integer.valueOf(((AtomicInteger) this.f3492b).get());
        }
    }
}
