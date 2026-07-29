package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.internal.IGmsCallbacks;

/* loaded from: classes.dex */
public interface IGmsServiceBroker extends IInterface {

    public static abstract class Stub extends Binder implements IGmsServiceBroker {

        private static class zza implements IGmsServiceBroker {
            private final IBinder zza;

            zza(IBinder iBinder) {
                this.zza = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.zza;
            }

            @Override // com.google.android.gms.common.internal.IGmsServiceBroker
            public final void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(iGmsCallbacks != null ? iGmsCallbacks.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.zza.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        public static IGmsServiceBroker asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IGmsServiceBroker)) ? new zza(iBinder) : (IGmsServiceBroker) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        protected void getLegacyService(int i, IGmsCallbacks iGmsCallbacks, int i2, String str, String str2, String[] strArr, Bundle bundle, IBinder iBinder, String str3, String str4) throws RemoteException {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0072. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
        @Override // android.os.Binder
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            Bundle bundle;
            String str;
            String[] strArr;
            IBinder iBinder;
            String str2;
            String str3;
            String[] createStringArray;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IGmsCallbacks asInterface = IGmsCallbacks.Stub.asInterface(parcel.readStrongBinder());
            if (i == 46) {
                getService(asInterface, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
            } else if (i == 47) {
                validateAccount(asInterface, parcel.readInt() != 0 ? ValidateAccountRequest.CREATOR.createFromParcel(parcel) : null);
            } else {
                int readInt = parcel.readInt();
                String readString = i != 4 ? parcel.readString() : null;
                if (i != 23 && i != 25 && i != 27) {
                    if (i != 30) {
                        if (i == 34) {
                            str = parcel.readString();
                            strArr = null;
                            bundle = strArr;
                            iBinder = bundle;
                            str3 = iBinder;
                            str2 = str3;
                            getLegacyService(i, asInterface, readInt, readString, str, strArr, bundle, iBinder, str3, str2);
                        } else if (i != 41 && i != 43) {
                            switch (i) {
                                case 1:
                                    String readString2 = parcel.readString();
                                    createStringArray = parcel.createStringArray();
                                    str = parcel.readString();
                                    if (parcel.readInt() != 0) {
                                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                        str3 = readString2;
                                        iBinder = null;
                                    } else {
                                        str3 = readString2;
                                        bundle = null;
                                        iBinder = null;
                                    }
                                    str2 = iBinder;
                                    strArr = createStringArray;
                                    break;
                                default:
                                    switch (i) {
                                        case 5:
                                        case 6:
                                        case 7:
                                        case 8:
                                        case 11:
                                        case 12:
                                        case 13:
                                        case 14:
                                        case 15:
                                        case 16:
                                        case 17:
                                        case 18:
                                            break;
                                        case 9:
                                            String readString3 = parcel.readString();
                                            createStringArray = parcel.createStringArray();
                                            String readString4 = parcel.readString();
                                            IBinder readStrongBinder = parcel.readStrongBinder();
                                            String readString5 = parcel.readString();
                                            if (parcel.readInt() != 0) {
                                                str3 = readString4;
                                                iBinder = readStrongBinder;
                                                str2 = readString5;
                                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                str = readString3;
                                            } else {
                                                str3 = readString4;
                                                iBinder = readStrongBinder;
                                                str2 = readString5;
                                                str = readString3;
                                                bundle = null;
                                            }
                                            strArr = createStringArray;
                                            break;
                                        case 10:
                                            String readString6 = parcel.readString();
                                            strArr = parcel.createStringArray();
                                            str = readString6;
                                            bundle = null;
                                            iBinder = bundle;
                                            str3 = iBinder;
                                            str2 = str3;
                                            break;
                                        case 19:
                                            IBinder readStrongBinder2 = parcel.readStrongBinder();
                                            if (parcel.readInt() != 0) {
                                                bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                                iBinder = readStrongBinder2;
                                                str = null;
                                                strArr = null;
                                                str3 = null;
                                            } else {
                                                iBinder = readStrongBinder2;
                                                str = null;
                                                strArr = null;
                                                bundle = null;
                                                str3 = null;
                                            }
                                            str2 = str3;
                                            break;
                                        case 20:
                                            break;
                                        default:
                                            switch (i) {
                                                case 37:
                                                case 38:
                                                    break;
                                                default:
                                                    str = null;
                                                    strArr = null;
                                                    bundle = strArr;
                                                    iBinder = bundle;
                                                    break;
                                            }
                                            str3 = iBinder;
                                            str2 = str3;
                                            break;
                                    }
                                case 2:
                                    if (parcel.readInt() != 0) {
                                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                                        str = null;
                                        strArr = null;
                                        iBinder = null;
                                        str3 = iBinder;
                                        str2 = str3;
                                        break;
                                    }
                                    str = null;
                                    strArr = null;
                                    bundle = strArr;
                                    iBinder = bundle;
                                    str3 = iBinder;
                                    str2 = str3;
                            }
                            getLegacyService(i, asInterface, readInt, readString, str, strArr, bundle, iBinder, str3, str2);
                        }
                    }
                    String[] createStringArray2 = parcel.createStringArray();
                    String readString7 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                        strArr = createStringArray2;
                        iBinder = null;
                    } else {
                        strArr = createStringArray2;
                        bundle = null;
                        iBinder = null;
                    }
                    str3 = iBinder;
                    str2 = str3;
                    str = readString7;
                    getLegacyService(i, asInterface, readInt, readString, str, strArr, bundle, iBinder, str3, str2);
                }
                if (parcel.readInt() != 0) {
                }
                str = null;
                strArr = null;
                bundle = strArr;
                iBinder = bundle;
                str3 = iBinder;
                str2 = str3;
                getLegacyService(i, asInterface, readInt, readString, str, strArr, bundle, iBinder, str3, str2);
            }
            parcel2.writeNoException();
            return true;
        }

        protected void validateAccount(IGmsCallbacks iGmsCallbacks, ValidateAccountRequest validateAccountRequest) throws RemoteException {
            throw new UnsupportedOperationException();
        }
    }

    void getService(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) throws RemoteException;
}
