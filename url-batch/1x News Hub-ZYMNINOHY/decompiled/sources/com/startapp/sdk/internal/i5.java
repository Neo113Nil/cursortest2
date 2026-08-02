package com.startapp.sdk.internal;

import android.content.Context;
import java.util.Collections;

/* loaded from: classes.dex */
public final class i5 implements i7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f3957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.components.a f3958b;

    public i5(com.startapp.sdk.components.a aVar, Context context) {
        this.f3958b = aVar;
        this.f3957a = context;
    }

    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        return new b6(Collections.singletonMap("gam", new o7(this.f3957a, this.f3958b.f3445C)));
    }
}
