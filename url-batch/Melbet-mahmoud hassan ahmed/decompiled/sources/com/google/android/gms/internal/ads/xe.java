package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class xe implements Parcelable {
    public static final Parcelable.Creator<xe> CREATOR = new we();
    public final int A;
    public final long B;
    public final int C;
    public final String D;
    public final int E;
    private int F;

    /* renamed from: f, reason: collision with root package name */
    public final String f14160f;

    /* renamed from: g, reason: collision with root package name */
    public final int f14161g;

    /* renamed from: h, reason: collision with root package name */
    public final String f14162h;

    /* renamed from: i, reason: collision with root package name */
    public final mj f14163i;

    /* renamed from: j, reason: collision with root package name */
    public final String f14164j;

    /* renamed from: k, reason: collision with root package name */
    public final String f14165k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14166l;

    /* renamed from: m, reason: collision with root package name */
    public final List<byte[]> f14167m;

    /* renamed from: n, reason: collision with root package name */
    public final yg f14168n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14169o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14170p;

    /* renamed from: q, reason: collision with root package name */
    public final float f14171q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14172r;

    /* renamed from: s, reason: collision with root package name */
    public final float f14173s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14174t;

    /* renamed from: u, reason: collision with root package name */
    public final byte[] f14175u;

    /* renamed from: v, reason: collision with root package name */
    public final cn f14176v;

    /* renamed from: w, reason: collision with root package name */
    public final int f14177w;

    /* renamed from: x, reason: collision with root package name */
    public final int f14178x;

    /* renamed from: y, reason: collision with root package name */
    public final int f14179y;

    /* renamed from: z, reason: collision with root package name */
    public final int f14180z;

    xe(Parcel parcel) {
        this.f14160f = parcel.readString();
        this.f14164j = parcel.readString();
        this.f14165k = parcel.readString();
        this.f14162h = parcel.readString();
        this.f14161g = parcel.readInt();
        this.f14166l = parcel.readInt();
        this.f14169o = parcel.readInt();
        this.f14170p = parcel.readInt();
        this.f14171q = parcel.readFloat();
        this.f14172r = parcel.readInt();
        this.f14173s = parcel.readFloat();
        this.f14175u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.f14174t = parcel.readInt();
        this.f14176v = (cn) parcel.readParcelable(cn.class.getClassLoader());
        this.f14177w = parcel.readInt();
        this.f14178x = parcel.readInt();
        this.f14179y = parcel.readInt();
        this.f14180z = parcel.readInt();
        this.A = parcel.readInt();
        this.C = parcel.readInt();
        this.D = parcel.readString();
        this.E = parcel.readInt();
        this.B = parcel.readLong();
        int readInt = parcel.readInt();
        this.f14167m = new ArrayList(readInt);
        for (int i7 = 0; i7 < readInt; i7++) {
            this.f14167m.add(parcel.createByteArray());
        }
        this.f14168n = (yg) parcel.readParcelable(yg.class.getClassLoader());
        this.f14163i = (mj) parcel.readParcelable(mj.class.getClassLoader());
    }

    xe(String str, String str2, String str3, String str4, int i7, int i8, int i9, int i10, float f7, int i11, float f8, byte[] bArr, int i12, cn cnVar, int i13, int i14, int i15, int i16, int i17, int i18, String str5, int i19, long j7, List<byte[]> list, yg ygVar, mj mjVar) {
        this.f14160f = str;
        this.f14164j = str2;
        this.f14165k = str3;
        this.f14162h = str4;
        this.f14161g = i7;
        this.f14166l = i8;
        this.f14169o = i9;
        this.f14170p = i10;
        this.f14171q = f7;
        this.f14172r = i11;
        this.f14173s = f8;
        this.f14175u = bArr;
        this.f14174t = i12;
        this.f14176v = cnVar;
        this.f14177w = i13;
        this.f14178x = i14;
        this.f14179y = i15;
        this.f14180z = i16;
        this.A = i17;
        this.C = i18;
        this.D = str5;
        this.E = i19;
        this.B = j7;
        this.f14167m = list == null ? Collections.emptyList() : list;
        this.f14168n = ygVar;
        this.f14163i = mjVar;
    }

    public static xe k(String str, String str2, String str3, int i7, int i8, int i9, int i10, List<byte[]> list, yg ygVar, int i11, String str4) {
        return l(str, str2, null, -1, -1, i9, i10, -1, -1, -1, null, ygVar, 0, str4, null);
    }

    public static xe l(String str, String str2, String str3, int i7, int i8, int i9, int i10, int i11, int i12, int i13, List<byte[]> list, yg ygVar, int i14, String str4, mj mjVar) {
        return new xe(str, null, str2, null, -1, i8, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i9, i10, i11, -1, -1, i14, str4, -1, Long.MAX_VALUE, list, ygVar, null);
    }

    public static xe m(String str, String str2, String str3, int i7, List<byte[]> list, String str4, yg ygVar) {
        return new xe(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, str4, -1, Long.MAX_VALUE, list, ygVar, null);
    }

    public static xe n(String str, String str2, String str3, int i7, yg ygVar) {
        return new xe(str, null, "application/x-camera-motion", null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, null, ygVar, null);
    }

    public static xe o(String str, String str2, String str3, int i7, int i8, String str4, int i9, yg ygVar, long j7, List<byte[]> list) {
        return new xe(str, null, str2, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, i8, str4, -1, j7, list, ygVar, null);
    }

    public static xe p(String str, String str2, String str3, int i7, int i8, int i9, int i10, float f7, List<byte[]> list, int i11, float f8, byte[] bArr, int i12, cn cnVar, yg ygVar) {
        return new xe(str, null, str2, null, -1, i8, i9, i10, -1.0f, i11, f8, bArr, i12, cnVar, -1, -1, -1, -1, -1, 0, null, -1, Long.MAX_VALUE, list, ygVar, null);
    }

    @TargetApi(16)
    private static void q(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public final int a() {
        int i7;
        int i8 = this.f14169o;
        if (i8 == -1 || (i7 = this.f14170p) == -1) {
            return -1;
        }
        return i8 * i7;
    }

    @SuppressLint({"InlinedApi"})
    @TargetApi(16)
    public final MediaFormat c() {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", this.f14165k);
        String str = this.D;
        if (str != null) {
            mediaFormat.setString("language", str);
        }
        q(mediaFormat, "max-input-size", this.f14166l);
        q(mediaFormat, "width", this.f14169o);
        q(mediaFormat, "height", this.f14170p);
        float f7 = this.f14171q;
        if (f7 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f7);
        }
        q(mediaFormat, "rotation-degrees", this.f14172r);
        q(mediaFormat, "channel-count", this.f14177w);
        q(mediaFormat, "sample-rate", this.f14178x);
        q(mediaFormat, "encoder-delay", this.f14180z);
        q(mediaFormat, "encoder-padding", this.A);
        for (int i7 = 0; i7 < this.f14167m.size(); i7++) {
            StringBuilder sb = new StringBuilder(15);
            sb.append("csd-");
            sb.append(i7);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(this.f14167m.get(i7)));
        }
        cn cnVar = this.f14176v;
        if (cnVar != null) {
            q(mediaFormat, "color-transfer", cnVar.f3876h);
            q(mediaFormat, "color-standard", cnVar.f3874f);
            q(mediaFormat, "color-range", cnVar.f3875g);
            byte[] bArr = cnVar.f3877i;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        return mediaFormat;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && xe.class == obj.getClass()) {
            xe xeVar = (xe) obj;
            if (this.f14161g == xeVar.f14161g && this.f14166l == xeVar.f14166l && this.f14169o == xeVar.f14169o && this.f14170p == xeVar.f14170p && this.f14171q == xeVar.f14171q && this.f14172r == xeVar.f14172r && this.f14173s == xeVar.f14173s && this.f14174t == xeVar.f14174t && this.f14177w == xeVar.f14177w && this.f14178x == xeVar.f14178x && this.f14179y == xeVar.f14179y && this.f14180z == xeVar.f14180z && this.A == xeVar.A && this.B == xeVar.B && this.C == xeVar.C && zm.o(this.f14160f, xeVar.f14160f) && zm.o(this.D, xeVar.D) && this.E == xeVar.E && zm.o(this.f14164j, xeVar.f14164j) && zm.o(this.f14165k, xeVar.f14165k) && zm.o(this.f14162h, xeVar.f14162h) && zm.o(this.f14168n, xeVar.f14168n) && zm.o(this.f14163i, xeVar.f14163i) && zm.o(this.f14176v, xeVar.f14176v) && Arrays.equals(this.f14175u, xeVar.f14175u) && this.f14167m.size() == xeVar.f14167m.size()) {
                for (int i7 = 0; i7 < this.f14167m.size(); i7++) {
                    if (!Arrays.equals(this.f14167m.get(i7), xeVar.f14167m.get(i7))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final xe g(yg ygVar) {
        return new xe(this.f14160f, this.f14164j, this.f14165k, this.f14162h, this.f14161g, this.f14166l, this.f14169o, this.f14170p, this.f14171q, this.f14172r, this.f14173s, this.f14175u, this.f14174t, this.f14176v, this.f14177w, this.f14178x, this.f14179y, this.f14180z, this.A, this.C, this.D, this.E, this.B, this.f14167m, ygVar, this.f14163i);
    }

    public final xe h(int i7, int i8) {
        return new xe(this.f14160f, this.f14164j, this.f14165k, this.f14162h, this.f14161g, this.f14166l, this.f14169o, this.f14170p, this.f14171q, this.f14172r, this.f14173s, this.f14175u, this.f14174t, this.f14176v, this.f14177w, this.f14178x, this.f14179y, i7, i8, this.C, this.D, this.E, this.B, this.f14167m, this.f14168n, this.f14163i);
    }

    public final int hashCode() {
        int i7 = this.F;
        if (i7 != 0) {
            return i7;
        }
        String str = this.f14160f;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 527) * 31;
        String str2 = this.f14164j;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14165k;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14162h;
        int hashCode4 = (((((((((((hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31) + this.f14161g) * 31) + this.f14169o) * 31) + this.f14170p) * 31) + this.f14177w) * 31) + this.f14178x) * 31;
        String str5 = this.D;
        int hashCode5 = (((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.E) * 31;
        yg ygVar = this.f14168n;
        int hashCode6 = (hashCode5 + (ygVar == null ? 0 : ygVar.hashCode())) * 31;
        mj mjVar = this.f14163i;
        int hashCode7 = hashCode6 + (mjVar != null ? mjVar.hashCode() : 0);
        this.F = hashCode7;
        return hashCode7;
    }

    public final xe i(int i7) {
        return new xe(this.f14160f, this.f14164j, this.f14165k, this.f14162h, this.f14161g, i7, this.f14169o, this.f14170p, this.f14171q, this.f14172r, this.f14173s, this.f14175u, this.f14174t, this.f14176v, this.f14177w, this.f14178x, this.f14179y, this.f14180z, this.A, this.C, this.D, this.E, this.B, this.f14167m, this.f14168n, this.f14163i);
    }

    public final xe j(mj mjVar) {
        return new xe(this.f14160f, this.f14164j, this.f14165k, this.f14162h, this.f14161g, this.f14166l, this.f14169o, this.f14170p, this.f14171q, this.f14172r, this.f14173s, this.f14175u, this.f14174t, this.f14176v, this.f14177w, this.f14178x, this.f14179y, this.f14180z, this.A, this.C, this.D, this.E, this.B, this.f14167m, this.f14168n, mjVar);
    }

    public final String toString() {
        String str = this.f14160f;
        String str2 = this.f14164j;
        String str3 = this.f14165k;
        int i7 = this.f14161g;
        String str4 = this.D;
        int i8 = this.f14169o;
        int i9 = this.f14170p;
        float f7 = this.f14171q;
        int i10 = this.f14177w;
        int i11 = this.f14178x;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 100 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append(", ");
        sb.append(i7);
        sb.append(", ");
        sb.append(str4);
        sb.append(", [");
        sb.append(i8);
        sb.append(", ");
        sb.append(i9);
        sb.append(", ");
        sb.append(f7);
        sb.append("], [");
        sb.append(i10);
        sb.append(", ");
        sb.append(i11);
        sb.append("])");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f14160f);
        parcel.writeString(this.f14164j);
        parcel.writeString(this.f14165k);
        parcel.writeString(this.f14162h);
        parcel.writeInt(this.f14161g);
        parcel.writeInt(this.f14166l);
        parcel.writeInt(this.f14169o);
        parcel.writeInt(this.f14170p);
        parcel.writeFloat(this.f14171q);
        parcel.writeInt(this.f14172r);
        parcel.writeFloat(this.f14173s);
        parcel.writeInt(this.f14175u != null ? 1 : 0);
        byte[] bArr = this.f14175u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.f14174t);
        parcel.writeParcelable(this.f14176v, i7);
        parcel.writeInt(this.f14177w);
        parcel.writeInt(this.f14178x);
        parcel.writeInt(this.f14179y);
        parcel.writeInt(this.f14180z);
        parcel.writeInt(this.A);
        parcel.writeInt(this.C);
        parcel.writeString(this.D);
        parcel.writeInt(this.E);
        parcel.writeLong(this.B);
        int size = this.f14167m.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeByteArray(this.f14167m.get(i8));
        }
        parcel.writeParcelable(this.f14168n, 0);
        parcel.writeParcelable(this.f14163i, 0);
    }
}
