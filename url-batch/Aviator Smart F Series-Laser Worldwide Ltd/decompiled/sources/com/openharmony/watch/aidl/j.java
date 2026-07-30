package com.openharmony.watch.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.openharmony.watch.aidl.a;
import com.openharmony.watch.aidl.k;
import com.openharmony.watch.aidl.l;
import com.openharmony.watch.aidl.m;

/* loaded from: classes4.dex */
public interface j extends IInterface {
    public static final String DESCRIPTOR = "com.openharmony.watch.aidl.P2pClient";

    public static abstract class a extends Binder implements j {
        static final int TRANSACTION_cancelFileTransfer = 5;
        static final int TRANSACTION_getAppVersion = 7;
        static final int TRANSACTION_isAppInstalled = 6;
        static final int TRANSACTION_ping = 1;
        static final int TRANSACTION_registerReceiver = 2;
        static final int TRANSACTION_send = 3;
        static final int TRANSACTION_unregisterReceiver = 4;

        /* renamed from: com.openharmony.watch.aidl.j$a$a, reason: collision with other inner class name */
        private static class C0322a implements j {
            private IBinder mRemote;

            C0322a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.openharmony.watch.aidl.j
            public void cancelFileTransfer(Peer peer, Message message, com.openharmony.watch.aidl.a aVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    b.writeTypedObject(obtain, peer, 0);
                    b.writeTypedObject(obtain, message, 0);
                    obtain.writeStrongInterface(aVar);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.j
            public int getAppVersion(Peer peer) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    b.writeTypedObject(obtain, peer, 0);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return j.DESCRIPTOR;
            }

            @Override // com.openharmony.watch.aidl.j
            public boolean isAppInstalled(Peer peer) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    b.writeTypedObject(obtain, peer, 0);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.j
            public void ping(Peer peer, k kVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    b.writeTypedObject(obtain, peer, 0);
                    obtain.writeStrongInterface(kVar);
                    this.mRemote.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.j
            public void registerReceiver(Peer peer, l lVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    b.writeTypedObject(obtain, peer, 0);
                    obtain.writeStrongInterface(lVar);
                    this.mRemote.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.j
            public void send(Peer peer, Message message, m mVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    b.writeTypedObject(obtain, peer, 0);
                    b.writeTypedObject(obtain, message, 0);
                    obtain.writeStrongInterface(mVar);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.openharmony.watch.aidl.j
            public void unregisterReceiver(l lVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(j.DESCRIPTOR);
                    obtain.writeStrongInterface(lVar);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, j.DESCRIPTOR);
        }

        public static j asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(j.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof j)) ? new C0322a(iBinder) : (j) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ void cancelFileTransfer(Peer peer, Message message, com.openharmony.watch.aidl.a aVar);

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ int getAppVersion(Peer peer);

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ boolean isAppInstalled(Peer peer);

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 >= 1 && i8 <= 16777215) {
                parcel.enforceInterface(j.DESCRIPTOR);
            }
            if (i8 == 1598968902) {
                parcel2.writeString(j.DESCRIPTOR);
                return true;
            }
            switch (i8) {
                case 1:
                    ping((Peer) b.readTypedObject(parcel, Peer.CREATOR), k.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    registerReceiver((Peer) b.readTypedObject(parcel, Peer.CREATOR), l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    send((Peer) b.readTypedObject(parcel, Peer.CREATOR), (Message) b.readTypedObject(parcel, Message.CREATOR), m.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    unregisterReceiver(l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    cancelFileTransfer((Peer) b.readTypedObject(parcel, Peer.CREATOR), (Message) b.readTypedObject(parcel, Message.CREATOR), a.AbstractBinderC0314a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    boolean isAppInstalled = isAppInstalled((Peer) b.readTypedObject(parcel, Peer.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(isAppInstalled ? 1 : 0);
                    return true;
                case 7:
                    int appVersion = getAppVersion((Peer) b.readTypedObject(parcel, Peer.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(appVersion);
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
        }

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ void ping(Peer peer, k kVar);

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ void registerReceiver(Peer peer, l lVar);

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ void send(Peer peer, Message message, m mVar);

        @Override // com.openharmony.watch.aidl.j
        public abstract /* synthetic */ void unregisterReceiver(l lVar);
    }

    public static class b {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T readTypedObject(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void writeTypedObject(Parcel parcel, T t7, int i8) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t7.writeToParcel(parcel, i8);
            }
        }
    }

    void cancelFileTransfer(Peer peer, Message message, com.openharmony.watch.aidl.a aVar);

    int getAppVersion(Peer peer);

    boolean isAppInstalled(Peer peer);

    void ping(Peer peer, k kVar);

    void registerReceiver(Peer peer, l lVar);

    void send(Peer peer, Message message, m mVar);

    void unregisterReceiver(l lVar);
}
