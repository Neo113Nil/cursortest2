package com.liulishuo.filedownloader.i;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.liulishuo.filedownloader.i.a;
import com.liulishuo.filedownloader.model.FileDownloadHeader;

/* loaded from: classes4.dex */
public interface b extends IInterface {

    public static abstract class a extends Binder implements b {
        private static final String DESCRIPTOR = "com.liulishuo.filedownloader.i.IFileDownloadIPCService";
        static final int TRANSACTION_checkDownloading = 3;
        static final int TRANSACTION_clearAllTaskData = 15;
        static final int TRANSACTION_clearTaskData = 14;
        static final int TRANSACTION_getSofar = 8;
        static final int TRANSACTION_getStatus = 10;
        static final int TRANSACTION_getTotal = 9;
        static final int TRANSACTION_isIdle = 11;
        static final int TRANSACTION_pause = 5;
        static final int TRANSACTION_pauseAllTasks = 6;
        static final int TRANSACTION_registerCallback = 1;
        static final int TRANSACTION_setMaxNetworkThreadCount = 7;
        static final int TRANSACTION_start = 4;
        static final int TRANSACTION_startForeground = 12;
        static final int TRANSACTION_stopForeground = 13;
        static final int TRANSACTION_unregisterCallback = 2;

        /* renamed from: com.liulishuo.filedownloader.i.b$a$a, reason: collision with other inner class name */
        private static class C0296a implements b {
            private IBinder mRemote;

            C0296a(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.liulishuo.filedownloader.i.b
            public boolean checkDownloading(String str, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    this.mRemote.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void clearAllTaskData() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    this.mRemote.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public boolean clearTaskData(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return a.DESCRIPTOR;
            }

            @Override // com.liulishuo.filedownloader.i.b
            public long getSofar(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public byte getStatus(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readByte();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public long getTotal(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public boolean isIdle() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    this.mRemote.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public boolean pause(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void pauseAllTasks() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    this.mRemote.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void registerCallback(com.liulishuo.filedownloader.i.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.mRemote.transact(1, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public boolean setMaxNetworkThreadCount(int i8) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    this.mRemote.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeInt(z7 ? 1 : 0);
                    obtain.writeInt(i8);
                    obtain.writeInt(i9);
                    obtain.writeInt(i10);
                    obtain.writeInt(z8 ? 1 : 0);
                    if (fileDownloadHeader != null) {
                        obtain.writeInt(1);
                        fileDownloadHeader.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z9 ? 1 : 0);
                    this.mRemote.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void startForeground(int i8, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(i8);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.mRemote.transact(12, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void stopForeground(boolean z7) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeInt(z7 ? 1 : 0);
                    this.mRemote.transact(13, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            @Override // com.liulishuo.filedownloader.i.b
            public void unregisterCallback(com.liulishuo.filedownloader.i.a aVar) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.DESCRIPTOR);
                    obtain.writeStrongBinder(aVar != null ? aVar.asBinder() : null);
                    this.mRemote.transact(2, obtain, null, 1);
                    obtain.recycle();
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            }
        }

        public a() {
            attachInterface(this, DESCRIPTOR);
        }

        public static b asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new C0296a(iBinder) : (b) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ boolean checkDownloading(String str, String str2);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void clearAllTaskData();

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ boolean clearTaskData(int i8);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ long getSofar(int i8);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ byte getStatus(int i8);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ long getTotal(int i8);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ boolean isIdle();

        @Override // android.os.Binder
        public boolean onTransact(int i8, Parcel parcel, Parcel parcel2, int i9) {
            if (i8 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i8) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    registerCallback(a.AbstractBinderC0294a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    unregisterCallback(a.AbstractBinderC0294a.asInterface(parcel.readStrongBinder()));
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean checkDownloading = checkDownloading(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(checkDownloading ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    start(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0 ? FileDownloadHeader.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean pause = pause(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(pause ? 1 : 0);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    pauseAllTasks();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean maxNetworkThreadCount = setMaxNetworkThreadCount(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(maxNetworkThreadCount ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    long sofar = getSofar(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(sofar);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    long total = getTotal(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeLong(total);
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte status = getStatus(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeByte(status);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isIdle = isIdle();
                    parcel2.writeNoException();
                    parcel2.writeInt(isIdle ? 1 : 0);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    startForeground(parcel.readInt(), parcel.readInt() != 0 ? (Notification) Notification.CREATOR.createFromParcel(parcel) : null);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    stopForeground(parcel.readInt() != 0);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean clearTaskData = clearTaskData(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(clearTaskData ? 1 : 0);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    clearAllTaskData();
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i8, parcel, parcel2, i9);
            }
        }

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ boolean pause(int i8);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void pauseAllTasks();

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void registerCallback(com.liulishuo.filedownloader.i.a aVar);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ boolean setMaxNetworkThreadCount(int i8);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void startForeground(int i8, Notification notification);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void stopForeground(boolean z7);

        @Override // com.liulishuo.filedownloader.i.b
        public abstract /* synthetic */ void unregisterCallback(com.liulishuo.filedownloader.i.a aVar);
    }

    boolean checkDownloading(String str, String str2);

    void clearAllTaskData();

    boolean clearTaskData(int i8);

    long getSofar(int i8);

    byte getStatus(int i8);

    long getTotal(int i8);

    boolean isIdle();

    boolean pause(int i8);

    void pauseAllTasks();

    void registerCallback(com.liulishuo.filedownloader.i.a aVar);

    boolean setMaxNetworkThreadCount(int i8);

    void start(String str, String str2, boolean z7, int i8, int i9, int i10, boolean z8, FileDownloadHeader fileDownloadHeader, boolean z9);

    void startForeground(int i8, Notification notification);

    void stopForeground(boolean z7);

    void unregisterCallback(com.liulishuo.filedownloader.i.a aVar);
}
