package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes10.dex */
public interface IEngagementSignalsCallback extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$IEngagementSignalsCallback".replace('$', '.');

    void onGreatestScrollPercentageIncreased(int i, Bundle bundle);

    void onSessionEnded(boolean z, Bundle bundle);

    void onVerticalScrollEvent(boolean z, Bundle bundle);

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public Stub() {
            attachInterface(this, IEngagementSignalsCallback.DESCRIPTOR);
        }

        public static IEngagementSignalsCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof IEngagementSignalsCallback)) {
                return (IEngagementSignalsCallback) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IEngagementSignalsCallback.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                onVerticalScrollEvent(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else if (i == 3) {
                onGreatestScrollPercentageIncreased(parcel.readInt(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else if (i == 4) {
                onSessionEnded(parcel.readInt() != 0, (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        private static class Proxy implements IEngagementSignalsCallback {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onVerticalScrollEvent(boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onGreatestScrollPercentageIncreased(int i, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    obtain.writeInt(i);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onSessionEnded(boolean z, Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(IEngagementSignalsCallback.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    _Parcel.writeTypedObject(obtain, bundle, 0);
                    this.mRemote.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }

    public static class _Parcel {
        /* JADX INFO: Access modifiers changed from: private */
        public static Object readTypedObject(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void writeTypedObject(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
