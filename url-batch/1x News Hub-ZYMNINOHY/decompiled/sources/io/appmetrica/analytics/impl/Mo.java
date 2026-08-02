package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class Mo implements R1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ T1 f6353b;

    public /* synthetic */ Mo(T1 t12, int i3) {
        this.f6352a = i3;
        this.f6353b = t12;
    }

    @Override // io.appmetrica.analytics.impl.R1
    public final boolean a(Intent intent) {
        switch (this.f6352a) {
            case 0:
                return T1.b(this.f6353b, intent);
            case 1:
                return T1.c(this.f6353b, intent);
            default:
                return T1.a(this.f6353b, intent);
        }
    }
}
