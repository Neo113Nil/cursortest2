package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.j implements InterfaceC1339l {

    /* renamed from: a, reason: collision with root package name */
    public static final p f9870a = new p();

    public p() {
        super(1);
    }

    @Override // o3.InterfaceC1339l
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i4 = t.f9874a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new s(iBinder) : (u) queryLocalInterface;
    }
}
