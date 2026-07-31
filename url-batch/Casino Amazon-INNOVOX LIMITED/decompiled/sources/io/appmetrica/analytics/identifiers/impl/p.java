package io.appmetrica.analytics.identifiers.impl;

import android.os.IBinder;
import android.os.IInterface;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class p extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final p f717a = new p();

    public p() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IBinder iBinder = (IBinder) obj;
        int i = t.f721a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.yandex.android.advid.service.YandexAdvIdInterface");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof u)) ? new s(iBinder) : (u) queryLocalInterface;
    }
}
