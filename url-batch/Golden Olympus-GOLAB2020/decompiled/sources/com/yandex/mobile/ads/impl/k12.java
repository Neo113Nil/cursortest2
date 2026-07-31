package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class k12 extends g12 {
    public static final Parcelable.Creator<k12> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<c> f27971b;

    final class a implements Parcelable.Creator<k12> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final k12 createFromParcel(Parcel parcel) {
            return new k12(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final k12[] newArray(int i4) {
            return new k12[i4];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f27972a;

        /* renamed from: b, reason: collision with root package name */
        public final long f27973b;

        /* JADX INFO: Access modifiers changed from: private */
        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        private b(int i4, long j4) {
            this.f27972a = i4;
            this.f27973b = j4;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f27974a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f27975b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f27976c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27977d;

        /* renamed from: e, reason: collision with root package name */
        public final long f27978e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f27979f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f27980g;

        /* renamed from: h, reason: collision with root package name */
        public final long f27981h;

        /* renamed from: i, reason: collision with root package name */
        public final int f27982i;

        /* renamed from: j, reason: collision with root package name */
        public final int f27983j;

        /* renamed from: k, reason: collision with root package name */
        public final int f27984k;

        /* JADX INFO: Access modifiers changed from: private */
        public static c a(Parcel parcel) {
            return new c(parcel);
        }

        private c(long j4, boolean z4, boolean z5, boolean z6, ArrayList arrayList, long j5, boolean z7, long j6, int i4, int i5, int i6) {
            this.f27974a = j4;
            this.f27975b = z4;
            this.f27976c = z5;
            this.f27977d = z6;
            this.f27979f = Collections.unmodifiableList(arrayList);
            this.f27978e = j5;
            this.f27980g = z7;
            this.f27981h = j6;
            this.f27982i = i4;
            this.f27983j = i5;
            this.f27984k = i6;
        }

        private c(Parcel parcel) {
            this.f27974a = parcel.readLong();
            this.f27975b = parcel.readByte() == 1;
            this.f27976c = parcel.readByte() == 1;
            this.f27977d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i4 = 0; i4 < readInt; i4++) {
                arrayList.add(b.a(parcel));
            }
            this.f27979f = Collections.unmodifiableList(arrayList);
            this.f27978e = parcel.readLong();
            this.f27980g = parcel.readByte() == 1;
            this.f27981h = parcel.readLong();
            this.f27982i = parcel.readInt();
            this.f27983j = parcel.readInt();
            this.f27984k = parcel.readInt();
        }
    }

    static k12 a(sf1 sf1Var) {
        boolean z4;
        int i4;
        int i5;
        long j4;
        ArrayList arrayList;
        boolean z5;
        boolean z6;
        long j5;
        boolean z7;
        long j6;
        int i6;
        int i7;
        int i8;
        long j7;
        boolean z8;
        int t4 = sf1Var.t();
        ArrayList arrayList2 = new ArrayList(t4);
        int i9 = 0;
        while (i9 < t4) {
            long v4 = sf1Var.v();
            boolean z9 = true;
            if ((sf1Var.t() & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z4 = true;
            } else {
                z4 = true;
                z9 = false;
            }
            ArrayList arrayList3 = new ArrayList();
            if (z9) {
                i4 = t4;
                i5 = i9;
                j4 = v4;
                arrayList = arrayList3;
                z5 = false;
                z6 = false;
                j5 = -9223372036854775807L;
                z7 = false;
                j6 = -9223372036854775807L;
                i6 = 0;
                i7 = 0;
                i8 = 0;
            } else {
                int t5 = sf1Var.t();
                boolean z10 = (t5 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? z4 : false;
                boolean z11 = (t5 & 64) != 0 ? z4 : false;
                boolean z12 = (t5 & 32) != 0 ? z4 : false;
                long v5 = z11 ? sf1Var.v() : -9223372036854775807L;
                if (!z11) {
                    int t6 = sf1Var.t();
                    ArrayList arrayList4 = new ArrayList(t6);
                    int i10 = 0;
                    while (i10 < t6) {
                        arrayList4.add(new b(sf1Var.t(), sf1Var.v()));
                        i10++;
                        i9 = i9;
                        t4 = t4;
                        v4 = v4;
                    }
                    arrayList3 = arrayList4;
                }
                i4 = t4;
                i5 = i9;
                j4 = v4;
                if (z12) {
                    long t7 = sf1Var.t();
                    z8 = (128 & t7) != 0;
                    j7 = ((((t7 & 1) << 32) | sf1Var.v()) * 1000) / 90;
                } else {
                    j7 = -9223372036854775807L;
                    z8 = false;
                }
                int z13 = sf1Var.z();
                arrayList = arrayList3;
                z5 = z10;
                j5 = v5;
                j6 = j7;
                i7 = sf1Var.t();
                i8 = sf1Var.t();
                z6 = z11;
                z7 = z8;
                i6 = z13;
            }
            arrayList2.add(new c(j4, z9, z5, z6, arrayList, j5, z7, j6, i6, i7, i8));
            i9 = i5 + 1;
            t4 = i4;
        }
        return new k12(arrayList2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int size = this.f27971b.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            c cVar = this.f27971b.get(i5);
            parcel.writeLong(cVar.f27974a);
            parcel.writeByte(cVar.f27975b ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f27976c ? (byte) 1 : (byte) 0);
            parcel.writeByte(cVar.f27977d ? (byte) 1 : (byte) 0);
            int size2 = cVar.f27979f.size();
            parcel.writeInt(size2);
            for (int i6 = 0; i6 < size2; i6++) {
                b bVar = cVar.f27979f.get(i6);
                parcel.writeInt(bVar.f27972a);
                parcel.writeLong(bVar.f27973b);
            }
            parcel.writeLong(cVar.f27978e);
            parcel.writeByte(cVar.f27980g ? (byte) 1 : (byte) 0);
            parcel.writeLong(cVar.f27981h);
            parcel.writeInt(cVar.f27982i);
            parcel.writeInt(cVar.f27983j);
            parcel.writeInt(cVar.f27984k);
        }
    }

    private k12(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            arrayList.add(c.a(parcel));
        }
        this.f27971b = Collections.unmodifiableList(arrayList);
    }

    private k12(ArrayList arrayList) {
        this.f27971b = Collections.unmodifiableList(arrayList);
    }
}
