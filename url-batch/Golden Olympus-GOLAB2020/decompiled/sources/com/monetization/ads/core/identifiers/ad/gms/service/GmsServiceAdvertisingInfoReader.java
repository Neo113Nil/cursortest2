package com.monetization.ads.core.identifiers.ad.gms.service;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.yandex.mobile.ads.impl.InterfaceC2018jc;
import com.yandex.mobile.ads.impl.ap0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class GmsServiceAdvertisingInfoReader implements InterfaceC2018jc, IInterface {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final IBinder f20679a;

    public GmsServiceAdvertisingInfoReader(@NotNull IBinder binder) {
        Intrinsics.checkNotNullParameter(binder, "binder");
        this.f20679a = binder;
    }

    @Override // android.os.IInterface
    @NotNull
    public IBinder asBinder() {
        return this.f20679a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2018jc
    @Nullable
    public Boolean readAdTrackingLimited() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean z4 = true;
                obtain.writeInt(1);
                this.f20679a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC2018jc
    @Nullable
    public String readAdvertisingId() {
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        Parcel obtain2 = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
        try {
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f20679a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        } catch (Throwable unused) {
            ap0.c(new Object[0]);
            obtain2.recycle();
            obtain.recycle();
            return null;
        }
    }
}
