package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class p30 implements Parcelable {
    public static final Parcelable.Creator<p30> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f30307b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f30308c;

    /* renamed from: d, reason: collision with root package name */
    public final String f30309d;

    /* renamed from: e, reason: collision with root package name */
    public final List<l22> f30310e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f30311f;

    /* renamed from: g, reason: collision with root package name */
    public final String f30312g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f30313h;

    final class a implements Parcelable.Creator<p30> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final p30 createFromParcel(Parcel parcel) {
            return new p30(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final p30[] newArray(int i4) {
            return new p30[i4];
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f30314a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f30315b;

        /* renamed from: c, reason: collision with root package name */
        private String f30316c;

        /* renamed from: d, reason: collision with root package name */
        private List<l22> f30317d;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f30318e;

        /* renamed from: f, reason: collision with root package name */
        private String f30319f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f30320g;

        public b(Uri uri, String str) {
            this.f30314a = str;
            this.f30315b = uri;
        }

        public final p30 a() {
            String str = this.f30314a;
            Uri uri = this.f30315b;
            String str2 = this.f30316c;
            List list = this.f30317d;
            if (list == null) {
                list = sj0.h();
            }
            return new p30(str, uri, str2, list, this.f30318e, this.f30319f, this.f30320g);
        }

        public final b b(byte[] bArr) {
            this.f30318e = bArr;
            return this;
        }

        public final b b(String str) {
            this.f30316c = str;
            return this;
        }

        public final b a(String str) {
            this.f30319f = str;
            return this;
        }

        public final b a(byte[] bArr) {
            this.f30320g = bArr;
            return this;
        }

        public final b a(ArrayList arrayList) {
            this.f30317d = arrayList;
            return this;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    public final p30 a(p30 p30Var) {
        List list;
        if (!this.f30307b.equals(p30Var.f30307b)) {
            throw new IllegalArgumentException();
        }
        if (this.f30310e.isEmpty() || p30Var.f30310e.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            list = new ArrayList(this.f30310e);
            for (int i4 = 0; i4 < p30Var.f30310e.size(); i4++) {
                l22 l22Var = p30Var.f30310e.get(i4);
                if (!list.contains(l22Var)) {
                    list.add(l22Var);
                }
            }
        }
        return new p30(this.f30307b, p30Var.f30308c, p30Var.f30309d, list, p30Var.f30311f, p30Var.f30312g, p30Var.f30313h);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p30)) {
            return false;
        }
        p30 p30Var = (p30) obj;
        return this.f30307b.equals(p30Var.f30307b) && this.f30308c.equals(p30Var.f30308c) && u82.a(this.f30309d, p30Var.f30309d) && this.f30310e.equals(p30Var.f30310e) && Arrays.equals(this.f30311f, p30Var.f30311f) && u82.a(this.f30312g, p30Var.f30312g) && Arrays.equals(this.f30313h, p30Var.f30313h);
    }

    public final int hashCode() {
        int hashCode = (this.f30308c.hashCode() + (this.f30307b.hashCode() * 961)) * 31;
        String str = this.f30309d;
        int hashCode2 = (Arrays.hashCode(this.f30311f) + ((this.f30310e.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31;
        String str2 = this.f30312g;
        return Arrays.hashCode(this.f30313h) + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return this.f30309d + StringUtils.PROCESS_POSTFIX_DELIMITER + this.f30307b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f30307b);
        parcel.writeString(this.f30308c.toString());
        parcel.writeString(this.f30309d);
        parcel.writeInt(this.f30310e.size());
        for (int i5 = 0; i5 < this.f30310e.size(); i5++) {
            parcel.writeParcelable(this.f30310e.get(i5), 0);
        }
        parcel.writeByteArray(this.f30311f);
        parcel.writeString(this.f30312g);
        parcel.writeByteArray(this.f30313h);
    }

    p30(Parcel parcel) {
        this.f30307b = (String) u82.a(parcel.readString());
        this.f30308c = Uri.parse((String) u82.a(parcel.readString()));
        this.f30309d = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add((l22) parcel.readParcelable(l22.class.getClassLoader()));
        }
        this.f30310e = Collections.unmodifiableList(arrayList);
        this.f30311f = parcel.createByteArray();
        this.f30312g = parcel.readString();
        this.f30313h = (byte[]) u82.a(parcel.createByteArray());
    }

    private p30(String str, Uri uri, String str2, List<l22> list, byte[] bArr, String str3, byte[] bArr2) {
        int a4 = u82.a(uri, str2);
        if (a4 == 0 || a4 == 2 || a4 == 1) {
            C2253tf.a("customCacheKey must be null for type: " + a4, str3 == null);
        }
        this.f30307b = str;
        this.f30308c = uri;
        this.f30309d = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f30310e = Collections.unmodifiableList(arrayList);
        this.f30311f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f30312g = str3;
        this.f30313h = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : u82.f32878f;
    }
}
