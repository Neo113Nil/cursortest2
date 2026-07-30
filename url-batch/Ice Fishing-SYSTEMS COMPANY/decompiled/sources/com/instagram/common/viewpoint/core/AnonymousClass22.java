package com.instagram.common.viewpoint.core;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.anythink.basead.exoplayer.b;

/* renamed from: com.facebook.ads.redexgen.X.22, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AnonymousClass22 extends Binder {
    public static final int A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static BP<Bundle> A00(IBinder iBinder) {
        C2K A01 = BP.A01();
        int i = 0;
        int i4 = 1;
        while (i4 != 0) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInt(i);
                try {
                    iBinder.transact(1, obtain, obtain2, 0);
                    while (true) {
                        i4 = obtain2.readInt();
                        if (i4 == 1) {
                            A01.A04((Bundle) AbstractC06233y.A01(obtain2.readBundle()));
                            i++;
                        }
                    }
                } catch (RemoteException e6) {
                    throw new RuntimeException(e6);
                }
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        return A01.A05();
    }

    static {
        A00 = C5C.A02 >= 30 ? IBinder.getSuggestedMaxIpcSizeBytes() : b.aX;
    }
}
