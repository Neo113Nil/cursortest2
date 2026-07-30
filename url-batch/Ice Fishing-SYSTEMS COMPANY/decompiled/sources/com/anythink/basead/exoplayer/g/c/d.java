package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.ac;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d extends b {
    public static final Parcelable.Creator<d> CREATOR = new Parcelable.Creator<d>() { // from class: com.anythink.basead.exoplayer.g.c.d.1
        private static d a(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ d createFromParcel(Parcel parcel) {
            return new d(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ d[] newArray(int i) {
            return new d[i];
        }

        private static d[] a(int i) {
            return new d[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final long f7506a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7507b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f7508c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7510e;

    /* renamed from: f, reason: collision with root package name */
    public final long f7511f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7512g;

    /* renamed from: h, reason: collision with root package name */
    public final List<a> f7513h;
    public final boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final long f7514j;

    /* renamed from: k, reason: collision with root package name */
    public final int f7515k;

    /* renamed from: l, reason: collision with root package name */
    public final int f7516l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7517m;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7518a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7519b;

        /* renamed from: c, reason: collision with root package name */
        public final long f7520c;

        public /* synthetic */ a(int i, long j9, long j10, byte b9) {
            this(i, j9, j10);
        }

        public static a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        private void b(Parcel parcel) {
            parcel.writeInt(this.f7518a);
            parcel.writeLong(this.f7519b);
            parcel.writeLong(this.f7520c);
        }

        private a(int i, long j9, long j10) {
            this.f7518a = i;
            this.f7519b = j9;
            this.f7520c = j10;
        }
    }

    public /* synthetic */ d(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static d a(s sVar, long j9, ac acVar) {
        List list;
        long j10;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        int i;
        int i4;
        int i9;
        boolean z12;
        int i10;
        long j11;
        long h9 = sVar.h();
        boolean z13 = (sVar.d() & 128) != 0;
        List list2 = Collections.EMPTY_LIST;
        long j12 = com.anythink.basead.exoplayer.b.f6539b;
        if (z13) {
            list = list2;
            j10 = -9223372036854775807L;
            z8 = false;
            z9 = false;
            z10 = false;
            z11 = false;
            i = 0;
            i4 = 0;
            i9 = 0;
        } else {
            int d2 = sVar.d();
            boolean z14 = (d2 & 128) != 0;
            boolean z15 = (d2 & 64) != 0;
            boolean z16 = (d2 & 32) != 0;
            boolean z17 = (d2 & 16) != 0;
            long a9 = (!z15 || z17) ? -9223372036854775807L : g.a(sVar, j9);
            if (!z15) {
                int d3 = sVar.d();
                ArrayList arrayList = new ArrayList(d3);
                int i11 = 0;
                while (i11 < d3) {
                    int d9 = sVar.d();
                    if (z17) {
                        i10 = d3;
                        j11 = -9223372036854775807L;
                    } else {
                        i10 = d3;
                        j11 = g.a(sVar, j9);
                    }
                    arrayList.add(new a(d9, j11, acVar.a(j11), (byte) 0));
                    i11++;
                    d3 = i10;
                }
                list2 = arrayList;
            }
            if (z16) {
                long d10 = sVar.d();
                boolean z18 = (128 & d10) != 0;
                j12 = ((((d10 & 1) << 32) | sVar.h()) * 1000) / 90;
                z12 = z18;
            } else {
                z12 = false;
            }
            int e6 = sVar.e();
            long j13 = a9;
            j10 = j12;
            j12 = j13;
            i4 = sVar.d();
            i9 = sVar.d();
            i = e6;
            z11 = z12;
            z8 = z14;
            z9 = z15;
            list = list2;
            z10 = z17;
        }
        return new d(h9, z13, z8, z9, z10, j12, acVar.a(j12), list, z11, j10, i, i4, i9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f7506a);
        parcel.writeByte(this.f7507b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7508c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7509d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7510e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7511f);
        parcel.writeLong(this.f7512g);
        int size = this.f7513h.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            a aVar = this.f7513h.get(i4);
            parcel.writeInt(aVar.f7518a);
            parcel.writeLong(aVar.f7519b);
            parcel.writeLong(aVar.f7520c);
        }
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f7514j);
        parcel.writeInt(this.f7515k);
        parcel.writeInt(this.f7516l);
        parcel.writeInt(this.f7517m);
    }

    private d(long j9, boolean z8, boolean z9, boolean z10, boolean z11, long j10, long j11, List<a> list, boolean z12, long j12, int i, int i4, int i9) {
        this.f7506a = j9;
        this.f7507b = z8;
        this.f7508c = z9;
        this.f7509d = z10;
        this.f7510e = z11;
        this.f7511f = j10;
        this.f7512g = j11;
        this.f7513h = Collections.unmodifiableList(list);
        this.i = z12;
        this.f7514j = j12;
        this.f7515k = i;
        this.f7516l = i4;
        this.f7517m = i9;
    }

    private d(Parcel parcel) {
        this.f7506a = parcel.readLong();
        this.f7507b = parcel.readByte() == 1;
        this.f7508c = parcel.readByte() == 1;
        this.f7509d = parcel.readByte() == 1;
        this.f7510e = parcel.readByte() == 1;
        this.f7511f = parcel.readLong();
        this.f7512g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(a.a(parcel));
        }
        this.f7513h = Collections.unmodifiableList(arrayList);
        this.i = parcel.readByte() == 1;
        this.f7514j = parcel.readLong();
        this.f7515k = parcel.readInt();
        this.f7516l = parcel.readInt();
        this.f7517m = parcel.readInt();
    }
}
