package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.k implements l2.l {

    /* renamed from: a, reason: collision with root package name */
    public static final p f5610a = new p();

    public p() {
        super(1);
    }

    @Override // l2.l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i3 = t.f5614a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new s(iBinder) : (u) queryLocalInterface;
    }
}
