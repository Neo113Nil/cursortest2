package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public interface ITrustedWebActivityService extends IInterface {
    public static final String DESCRIPTOR = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', '.');

    Bundle areNotificationsEnabled(Bundle bundle);

    void cancelNotification(Bundle bundle);

    Bundle extraCommand(String str, Bundle bundle, IBinder iBinder);

    Bundle getActiveNotifications();

    Bundle getSmallIconBitmap();

    int getSmallIconId();

    Bundle notifyNotificationWithChannel(Bundle bundle);

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public static ITrustedWebActivityService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityService.DESCRIPTOR);
            if (queryLocalInterface != null && (queryLocalInterface instanceof ITrustedWebActivityService)) {
                return (ITrustedWebActivityService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ITrustedWebActivityService.DESCRIPTOR;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Bundle notifyNotificationWithChannel = notifyNotificationWithChannel((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, notifyNotificationWithChannel, 1);
                    return true;
                case 3:
                    cancelNotification((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int smallIconId = getSmallIconId();
                    parcel2.writeNoException();
                    parcel2.writeInt(smallIconId);
                    return true;
                case 5:
                    Bundle activeNotifications = getActiveNotifications();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, activeNotifications, 1);
                    return true;
                case 6:
                    Bundle areNotificationsEnabled = areNotificationsEnabled((Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, areNotificationsEnabled, 1);
                    return true;
                case 7:
                    Bundle smallIconBitmap = getSmallIconBitmap();
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, smallIconBitmap, 1);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    Bundle extraCommand = extraCommand(parcel.readString(), (Bundle) _Parcel.readTypedObject(parcel, Bundle.CREATOR), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    _Parcel.writeTypedObject(parcel2, extraCommand, 1);
                    return true;
            }
        }

        private static class Proxy implements ITrustedWebActivityService {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
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
