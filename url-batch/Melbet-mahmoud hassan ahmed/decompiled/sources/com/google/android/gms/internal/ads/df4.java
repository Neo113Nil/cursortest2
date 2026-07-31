package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class df4 implements b81 {
    public static final Parcelable.Creator<df4> CREATOR = new cf4();

    /* renamed from: f, reason: collision with root package name */
    public final String f4203f;

    /* renamed from: g, reason: collision with root package name */
    public final String f4204g;

    df4(Parcel parcel) {
        String readString = parcel.readString();
        int i7 = n13.f8865a;
        this.f4203f = readString;
        this.f4204g = parcel.readString();
    }

    public df4(String str, String str2) {
        this.f4203f = str;
        this.f4204g = str2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.b81
    public final void b(ds dsVar) {
        char c7;
        String str = this.f4203f;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c7 = 2;
                    break;
                }
                c7 = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c7 = 0;
                    break;
                }
                c7 = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c7 = 4;
                    break;
                }
                c7 = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c7 = 3;
                    break;
                }
                c7 = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c7 = 1;
                    break;
                }
                c7 = 65535;
                break;
            default:
                c7 = 65535;
                break;
        }
        if (c7 == 0) {
            dsVar.x(this.f4204g);
            return;
        }
        if (c7 == 1) {
            dsVar.n(this.f4204g);
            return;
        }
        if (c7 == 2) {
            dsVar.m(this.f4204g);
        } else if (c7 == 3) {
            dsVar.l(this.f4204g);
        } else {
            if (c7 != 4) {
                return;
            }
            dsVar.q(this.f4204g);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && df4.class == obj.getClass()) {
            df4 df4Var = (df4) obj;
            if (this.f4203f.equals(df4Var.f4203f) && this.f4204g.equals(df4Var.f4204g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f4203f.hashCode() + 527) * 31) + this.f4204g.hashCode();
    }

    public final String toString() {
        String str = this.f4203f;
        String str2 = this.f4204g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f4203f);
        parcel.writeString(this.f4204g);
    }
}
