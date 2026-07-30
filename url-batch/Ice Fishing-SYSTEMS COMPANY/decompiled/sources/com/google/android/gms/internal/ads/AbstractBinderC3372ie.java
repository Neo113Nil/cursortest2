package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.ie, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC3372ie extends AbstractBinderC3186f8 implements InterfaceC3424je {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f31860n = 0;

    public AbstractBinderC3372ie() {
        super("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3186f8
    public final boolean F3(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                Bundle bundle = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                r3(bundle);
                parcel2.writeNoException();
                return true;
            case 2:
                l();
                parcel2.writeNoException();
                return true;
            case 3:
                h();
                parcel2.writeNoException();
                return true;
            case 4:
                j();
                parcel2.writeNoException();
                return true;
            case 5:
                k();
                parcel2.writeNoException();
                return true;
            case 6:
                Bundle bundle2 = (Bundle) AbstractC3241g8.b(parcel, Bundle.CREATOR);
                AbstractC3241g8.f(parcel);
                g1(bundle2);
                parcel2.writeNoException();
                AbstractC3241g8.d(parcel2, bundle2);
                return true;
            case 7:
                I();
                parcel2.writeNoException();
                return true;
            case 8:
                y();
                parcel2.writeNoException();
                return true;
            case 9:
                w();
                parcel2.writeNoException();
                return true;
            case 10:
                c();
                parcel2.writeNoException();
                return true;
            case 11:
                boolean e6 = e();
                parcel2.writeNoException();
                ClassLoader classLoader = AbstractC3241g8.f30958a;
                parcel2.writeInt(e6 ? 1 : 0);
                return true;
            case 12:
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                Intent intent = (Intent) AbstractC3241g8.b(parcel, Intent.CREATOR);
                AbstractC3241g8.f(parcel);
                l1(readInt, readInt2, intent);
                parcel2.writeNoException();
                return true;
            case 13:
                V2.b.u0(parcel.readStrongBinder());
                AbstractC3241g8.f(parcel);
                parcel2.writeNoException();
                return true;
            case 14:
                f();
                parcel2.writeNoException();
                return true;
            case 15:
                int readInt3 = parcel.readInt();
                String[] createStringArray = parcel.createStringArray();
                int[] createIntArray = parcel.createIntArray();
                AbstractC3241g8.f(parcel);
                d1(readInt3, createStringArray, createIntArray);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
