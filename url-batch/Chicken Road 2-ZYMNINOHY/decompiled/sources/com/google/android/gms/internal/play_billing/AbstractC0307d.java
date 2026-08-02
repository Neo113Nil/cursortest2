package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0307d implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5940a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f5941b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5942c;

    public /* synthetic */ AbstractC0307d(IBinder iBinder, String str, int i4) {
        this.f5940a = i4;
        this.f5941b = iBinder;
        this.f5942c = str;
    }

    public Parcel a() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f5942c);
        return obtain;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        switch (this.f5940a) {
        }
        return this.f5941b;
    }

    public Parcel b(Parcel parcel, int i4) {
        Parcel obtain = Parcel.obtain();
        try {
            try {
                this.f5941b.transact(i4, parcel, obtain, 0);
                obtain.readException();
                return obtain;
            } catch (RuntimeException e4) {
                obtain.recycle();
                throw e4;
            }
        } finally {
            parcel.recycle();
        }
    }

    public void c(Parcel parcel, int i4) {
        try {
            this.f5941b.transact(i4, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
