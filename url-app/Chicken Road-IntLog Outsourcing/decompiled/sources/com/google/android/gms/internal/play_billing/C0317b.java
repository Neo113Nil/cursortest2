package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.play_billing.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0317b extends B1.a implements InterfaceC0323d {
    public final int g(int i2, String str, String str2, Bundle bundle) {
        Parcel c2 = c();
        c2.writeInt(i2);
        c2.writeString(str);
        c2.writeString(str2);
        int i3 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 10);
        int readInt = d6.readInt();
        d6.recycle();
        return readInt;
    }

    public final Bundle h(String str, String str2, Bundle bundle) {
        Parcel c2 = c();
        c2.writeInt(9);
        c2.writeString(str);
        c2.writeString(str2);
        int i2 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 902);
        Bundle bundle2 = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle2;
    }

    public final Bundle i(String str, String str2, Bundle bundle) {
        Parcel c2 = c();
        c2.writeInt(9);
        c2.writeString(str);
        c2.writeString(str2);
        int i2 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 12);
        Bundle bundle2 = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle2;
    }

    public final Bundle j(String str, String str2, String str3) {
        Parcel c2 = c();
        c2.writeInt(3);
        c2.writeString(str);
        c2.writeString(str2);
        c2.writeString(str3);
        c2.writeString(null);
        Parcel d6 = d(c2, 3);
        Bundle bundle = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle;
    }

    public final Bundle k(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel c2 = c();
        c2.writeInt(i2);
        c2.writeString(str);
        c2.writeString(str2);
        c2.writeString(str3);
        c2.writeString(null);
        int i3 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 8);
        Bundle bundle2 = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle2;
    }

    public final Bundle l(String str, String str2, String str3, Bundle bundle) {
        Parcel c2 = c();
        c2.writeInt(6);
        c2.writeString(str);
        c2.writeString(str2);
        c2.writeString(str3);
        int i2 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 9);
        Bundle bundle2 = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle2;
    }

    public final Bundle m(String str, String str2, String str3) {
        Parcel c2 = c();
        c2.writeInt(3);
        c2.writeString(str);
        c2.writeString(str2);
        c2.writeString(str3);
        Parcel d6 = d(c2, 4);
        Bundle bundle = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle;
    }

    public final Bundle n(int i2, String str, String str2, String str3, Bundle bundle) {
        Parcel c2 = c();
        c2.writeInt(i2);
        c2.writeString(str);
        c2.writeString(str2);
        c2.writeString(str3);
        int i3 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 11);
        Bundle bundle2 = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle2;
    }

    public final Bundle o(int i2, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel c2 = c();
        c2.writeInt(i2);
        c2.writeString(str);
        c2.writeString(str2);
        int i3 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        c2.writeInt(1);
        bundle2.writeToParcel(c2, 0);
        Parcel d6 = d(c2, 901);
        Bundle bundle3 = (Bundle) AbstractC0326e.a(d6, Bundle.CREATOR);
        d6.recycle();
        return bundle3;
    }

    public final void p(String str, Bundle bundle, G0.C c2) {
        Parcel c6 = c();
        c6.writeInt(21);
        c6.writeString(str);
        int i2 = AbstractC0326e.f5173a;
        c6.writeInt(1);
        bundle.writeToParcel(c6, 0);
        c6.writeStrongBinder(c2);
        f(c6, 1501);
    }

    public final void q(String str, Bundle bundle, G0.D d6) {
        Parcel c2 = c();
        c2.writeInt(21);
        c2.writeString(str);
        int i2 = AbstractC0326e.f5173a;
        c2.writeInt(1);
        bundle.writeToParcel(c2, 0);
        c2.writeStrongBinder(d6);
        f(c2, 1601);
    }

    public final void r(String str, Bundle bundle, G0.C c2) {
        Parcel c6 = c();
        c6.writeInt(18);
        c6.writeString(str);
        int i2 = AbstractC0326e.f5173a;
        c6.writeInt(1);
        bundle.writeToParcel(c6, 0);
        c6.writeStrongBinder(c2);
        Parcel obtain = Parcel.obtain();
        try {
            this.f210e.transact(1301, c6, obtain, 0);
            obtain.readException();
        } finally {
            c6.recycle();
            obtain.recycle();
        }
    }

    public final void s(String str, Bundle bundle, G0.C c2) {
        Parcel c6 = c();
        c6.writeInt(21);
        c6.writeString(str);
        int i2 = AbstractC0326e.f5173a;
        c6.writeInt(1);
        bundle.writeToParcel(c6, 0);
        c6.writeStrongBinder(c2);
        f(c6, 1401);
    }
}
