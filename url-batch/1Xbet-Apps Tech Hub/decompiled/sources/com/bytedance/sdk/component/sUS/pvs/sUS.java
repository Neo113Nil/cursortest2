package com.bytedance.sdk.component.sUS.pvs;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* compiled from: IListenerEventManager.java */
/* loaded from: classes.dex */
public interface sUS extends IInterface {
    int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException;

    int pvs(Uri uri, String str, String[] strArr) throws RemoteException;

    String pvs(Uri uri) throws RemoteException;

    String pvs(Uri uri, ContentValues contentValues) throws RemoteException;

    Map pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException;

    /* compiled from: IListenerEventManager.java */
    public static abstract class pvs extends Binder implements sUS {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public pvs() {
            attachInterface(this, "com.bytedance.sdk.component.log.impl.IListenerEventManager");
        }

        public static sUS pvs(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            if (queryLocalInterface != null && (queryLocalInterface instanceof sUS)) {
                return (sUS) queryLocalInterface;
            }
            return new C0054pvs(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                Map pvs = pvs(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.createStringArray(), parcel.readString(), parcel.createStringArray(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeMap(pvs);
                return true;
            }
            if (i == 2) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String pvs2 = pvs(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(pvs2);
                return true;
            }
            if (i == 3) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                String pvs3 = pvs(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null);
                parcel2.writeNoException();
                parcel2.writeString(pvs3);
                return true;
            }
            if (i == 4) {
                parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                int pvs4 = pvs(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
                parcel2.writeNoException();
                parcel2.writeInt(pvs4);
                return true;
            }
            if (i != 5) {
                if (i == 1598968902) {
                    parcel2.writeString("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.bytedance.sdk.component.log.impl.IListenerEventManager");
            int pvs5 = pvs(parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (ContentValues) ContentValues.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArray());
            parcel2.writeNoException();
            parcel2.writeInt(pvs5);
            return true;
        }

        /* compiled from: IListenerEventManager.java */
        /* renamed from: com.bytedance.sdk.component.sUS.pvs.sUS$pvs$pvs, reason: collision with other inner class name */
        private static class C0054pvs implements sUS {
            public static sUS pvs;
            private IBinder icD;

            C0054pvs(IBinder iBinder) {
                this.icD = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.icD;
            }

            @Override // com.bytedance.sdk.component.sUS.pvs.sUS
            public Map pvs(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeStringArray(strArr);
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr2);
                    obtain.writeString(str2);
                    if (!this.icD.transact(1, obtain, obtain2, 0) && pvs.pvs() != null) {
                        return pvs.pvs().pvs(uri, strArr, str, strArr2, str2);
                    }
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.sUS.pvs.sUS
            public String pvs(Uri uri) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.icD.transact(2, obtain, obtain2, 0) && pvs.pvs() != null) {
                        return pvs.pvs().pvs(uri);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.sUS.pvs.sUS
            public String pvs(Uri uri, ContentValues contentValues) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.icD.transact(3, obtain, obtain2, 0) && pvs.pvs() != null) {
                        return pvs.pvs().pvs(uri, contentValues);
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.sUS.pvs.sUS
            public int pvs(Uri uri, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.icD.transact(4, obtain, obtain2, 0) && pvs.pvs() != null) {
                        return pvs.pvs().pvs(uri, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.bytedance.sdk.component.sUS.pvs.sUS
            public int pvs(Uri uri, ContentValues contentValues, String str, String[] strArr) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.bytedance.sdk.component.log.impl.IListenerEventManager");
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (contentValues != null) {
                        obtain.writeInt(1);
                        contentValues.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeStringArray(strArr);
                    if (!this.icD.transact(5, obtain, obtain2, 0) && pvs.pvs() != null) {
                        return pvs.pvs().pvs(uri, contentValues, str, strArr);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static sUS pvs() {
            return C0054pvs.pvs;
        }
    }
}
