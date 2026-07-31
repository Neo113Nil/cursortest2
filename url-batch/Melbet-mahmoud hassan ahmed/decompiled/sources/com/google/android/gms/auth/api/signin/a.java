package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import c4.w0;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import s3.b;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<GoogleSignInAccount> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int u6 = b.u(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j7 = 0;
        int i7 = 0;
        while (parcel.dataPosition() < u6) {
            int o7 = b.o(parcel);
            switch (b.l(o7)) {
                case 1:
                    i7 = b.q(parcel, o7);
                    break;
                case 2:
                    str = b.f(parcel, o7);
                    break;
                case 3:
                    str2 = b.f(parcel, o7);
                    break;
                case 4:
                    str3 = b.f(parcel, o7);
                    break;
                case 5:
                    str4 = b.f(parcel, o7);
                    break;
                case 6:
                    uri = (Uri) b.e(parcel, o7, Uri.CREATOR);
                    break;
                case w0.f2149o /* 7 */:
                    str5 = b.f(parcel, o7);
                    break;
                case w0.f2150p /* 8 */:
                    j7 = b.r(parcel, o7);
                    break;
                case 9:
                    str6 = b.f(parcel, o7);
                    break;
                case 10:
                    arrayList = b.j(parcel, o7, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.f(parcel, o7);
                    break;
                case 12:
                    str8 = b.f(parcel, o7);
                    break;
                default:
                    b.t(parcel, o7);
                    break;
            }
        }
        b.k(parcel, u6);
        return new GoogleSignInAccount(i7, str, str2, str3, str4, uri, str5, j7, str6, arrayList, str7, str8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ GoogleSignInAccount[] newArray(int i7) {
        return new GoogleSignInAccount[i7];
    }
}
