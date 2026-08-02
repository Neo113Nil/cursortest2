package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.play_billing.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298a extends AbstractC0307d implements InterfaceC0304c {
    public final int d(int i4, String str, String str2, Bundle bundle) {
        Parcel a3 = a();
        a3.writeInt(i4);
        a3.writeString(str);
        a3.writeString(str2);
        int i5 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        Parcel b4 = b(a3, 10);
        int readInt = b4.readInt();
        b4.recycle();
        return readInt;
    }

    public final Bundle e(String str, String str2, Bundle bundle) {
        Parcel a3 = a();
        a3.writeInt(9);
        a3.writeString(str);
        a3.writeString(str2);
        int i4 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        Parcel b4 = b(a3, 902);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle2;
    }

    public final Bundle f(String str, String str2, Bundle bundle) {
        Parcel a3 = a();
        a3.writeInt(9);
        a3.writeString(str);
        a3.writeString(str2);
        int i4 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        Parcel b4 = b(a3, 12);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle2;
    }

    public final Bundle g(String str, String str2, String str3) {
        Parcel a3 = a();
        a3.writeInt(3);
        a3.writeString(str);
        a3.writeString(str2);
        a3.writeString(str3);
        a3.writeString(null);
        Parcel b4 = b(a3, 3);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle;
    }

    public final Bundle h(int i4, String str, String str2, String str3, Bundle bundle) {
        Parcel a3 = a();
        a3.writeInt(i4);
        a3.writeString(str);
        a3.writeString(str2);
        a3.writeString(str3);
        a3.writeString(null);
        int i5 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        Parcel b4 = b(a3, 8);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle2;
    }

    public final Bundle i(String str, String str2, String str3) {
        Parcel a3 = a();
        a3.writeInt(3);
        a3.writeString(str);
        a3.writeString(str2);
        a3.writeString(str3);
        Parcel b4 = b(a3, 4);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle;
    }

    public final Bundle j(int i4, String str, String str2, String str3, Bundle bundle) {
        Parcel a3 = a();
        a3.writeInt(i4);
        a3.writeString(str);
        a3.writeString(str2);
        a3.writeString(str3);
        int i5 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        Parcel b4 = b(a3, 11);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle2 = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle2;
    }

    public final Bundle k(int i4, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel a3 = a();
        a3.writeInt(i4);
        a3.writeString(str);
        a3.writeString(str2);
        int i5 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        a3.writeInt(1);
        bundle2.writeToParcel(a3, 0);
        Parcel b4 = b(a3, 901);
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle3 = (Bundle) AbstractC0313f.a(b4);
        b4.recycle();
        return bundle3;
    }

    public final void l(String str, Bundle bundle, E1.L l4) {
        Parcel a3 = a();
        a3.writeInt(21);
        a3.writeString(str);
        int i4 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        a3.writeStrongBinder(l4);
        c(a3, 1501);
    }

    public final void m(String str, Bundle bundle, E1.M m4) {
        Parcel a3 = a();
        a3.writeInt(21);
        a3.writeString(str);
        int i4 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        a3.writeStrongBinder(m4);
        c(a3, 1601);
    }

    public final void n(String str, Bundle bundle, E1.L l4) {
        Parcel a3 = a();
        a3.writeInt(18);
        a3.writeString(str);
        int i4 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        a3.writeStrongBinder(l4);
        Parcel obtain = Parcel.obtain();
        try {
            this.f5941b.transact(1301, a3, obtain, 0);
            obtain.readException();
        } finally {
            a3.recycle();
            obtain.recycle();
        }
    }

    public final void o(String str, Bundle bundle, E1.L l4) {
        Parcel a3 = a();
        a3.writeInt(21);
        a3.writeString(str);
        int i4 = AbstractC0313f.f5945a;
        a3.writeInt(1);
        bundle.writeToParcel(a3, 0);
        a3.writeStrongBinder(l4);
        c(a3, 1401);
    }
}
