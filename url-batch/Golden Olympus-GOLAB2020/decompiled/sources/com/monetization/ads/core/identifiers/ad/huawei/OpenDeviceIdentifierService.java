package com.monetization.ads.core.identifiers.ad.huawei;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public interface OpenDeviceIdentifierService extends IInterface {

    @Metadata
    public static abstract class Stub extends Binder implements OpenDeviceIdentifierService {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f20680a = 0;

        /* JADX INFO: Access modifiers changed from: private */
        @Metadata
        static final class Proxy implements OpenDeviceIdentifierService {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final IBinder f20681a;

            public Proxy(@NotNull IBinder remote) {
                Intrinsics.checkNotNullParameter(remote, "remote");
                this.f20681a = remote;
            }

            @Override // android.os.IInterface
            @NotNull
            public IBinder asBinder() {
                return this.f20681a;
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            @Nullable
            public String getOaid() {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                Parcel obtain2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f20681a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.monetization.ads.core.identifiers.ad.huawei.OpenDeviceIdentifierService
            public boolean getOaidTrackLimited() {
                Parcel obtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
                Parcel obtain2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(obtain2, "obtain(...)");
                try {
                    obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    this.f20681a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
        }

        @Override // android.os.IInterface
        @NotNull
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        protected final boolean onTransact(int i4, @NotNull Parcel data, @Nullable Parcel parcel, int i5) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (i4 == 1) {
                data.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                String oaid = getOaid();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel != null) {
                    parcel.writeString(oaid);
                }
            } else if (i4 == 2) {
                data.enforceInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                boolean oaidTrackLimited = getOaidTrackLimited();
                if (parcel != null) {
                    parcel.writeNoException();
                }
                if (parcel != null) {
                    parcel.writeInt(oaidTrackLimited ? 1 : 0);
                }
            } else {
                if (i4 != 1598968902) {
                    return super.onTransact(i4, data, parcel, i5);
                }
                if (parcel != null) {
                    parcel.writeString("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                }
            }
            return true;
        }
    }

    @Nullable
    String getOaid();

    boolean getOaidTrackLimited();
}
