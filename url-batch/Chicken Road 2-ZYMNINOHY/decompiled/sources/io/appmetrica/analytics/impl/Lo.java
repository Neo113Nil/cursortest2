package io.appmetrica.analytics.impl;

import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class Lo implements H1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10612a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ J1 f10613b;

    public /* synthetic */ Lo(J1 j12, int i4) {
        this.f10612a = i4;
        this.f10613b = j12;
    }

    @Override // io.appmetrica.analytics.impl.H1
    public final boolean a(Intent intent) {
        switch (this.f10612a) {
            case 0:
                return J1.b(this.f10613b, intent);
            case 1:
                return J1.a(this.f10613b, intent);
            default:
                return J1.c(this.f10613b, intent);
        }
    }
}
