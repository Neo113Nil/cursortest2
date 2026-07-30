package com.anythink.basead.exoplayer.g.c;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.k.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f extends com.anythink.basead.exoplayer.g.c.b {
    public static final Parcelable.Creator<f> CREATOR = new Parcelable.Creator<f>() { // from class: com.anythink.basead.exoplayer.g.c.f.1
        private static f a(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ f createFromParcel(Parcel parcel) {
            return new f(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ f[] newArray(int i) {
            return new f[i];
        }

        private static f[] a(int i) {
            return new f[i];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final List<b> f7521a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7522a;

        /* renamed from: b, reason: collision with root package name */
        public final long f7523b;

        public /* synthetic */ a(int i, long j9, byte b9) {
            this(i, j9);
        }

        public static /* synthetic */ a a(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private static a b(Parcel parcel) {
            return new a(parcel.readInt(), parcel.readLong());
        }

        private void c(Parcel parcel) {
            parcel.writeInt(this.f7522a);
            parcel.writeLong(this.f7523b);
        }

        private a(int i, long j9) {
            this.f7522a = i;
            this.f7523b = j9;
        }

        public static /* synthetic */ void a(a aVar, Parcel parcel) {
            parcel.writeInt(aVar.f7522a);
            parcel.writeLong(aVar.f7523b);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f7524a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7525b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7526c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7527d;

        /* renamed from: e, reason: collision with root package name */
        public final long f7528e;

        /* renamed from: f, reason: collision with root package name */
        public final List<a> f7529f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f7530g;

        /* renamed from: h, reason: collision with root package name */
        public final long f7531h;
        public final int i;

        /* renamed from: j, reason: collision with root package name */
        public final int f7532j;

        /* renamed from: k, reason: collision with root package name */
        public final int f7533k;

        private b(long j9, boolean z8, boolean z9, boolean z10, List<a> list, long j10, boolean z11, long j11, int i, int i4, int i9) {
            this.f7524a = j9;
            this.f7525b = z8;
            this.f7526c = z9;
            this.f7527d = z10;
            this.f7529f = Collections.unmodifiableList(list);
            this.f7528e = j10;
            this.f7530g = z11;
            this.f7531h = j11;
            this.i = i;
            this.f7532j = i4;
            this.f7533k = i9;
        }

        public static /* synthetic */ b a(Parcel parcel) {
            return new b(parcel);
        }

        private static b b(s sVar) {
            boolean z8;
            boolean z9;
            int i;
            int i4;
            int i9;
            ArrayList arrayList;
            long j9;
            long j10;
            boolean z10;
            long j11;
            long h9 = sVar.h();
            boolean z11 = true;
            boolean z12 = false;
            boolean z13 = false;
            if ((sVar.d() & 128) != 0) {
                z8 = true;
            } else {
                z8 = true;
                z11 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                z9 = false;
                i = 0;
                i4 = 0;
                i9 = 0;
                arrayList = arrayList2;
                j9 = com.anythink.basead.exoplayer.b.f6539b;
                j10 = com.anythink.basead.exoplayer.b.f6539b;
                z10 = false;
            } else {
                int d2 = sVar.d();
                boolean z14 = (d2 & 128) != 0 ? z8 : false;
                boolean z15 = (d2 & 64) != 0 ? z8 : false;
                char c4 = ' ';
                boolean z16 = (d2 & 32) != 0 ? z8 : false;
                long h10 = z15 ? sVar.h() : com.anythink.basead.exoplayer.b.f6539b;
                if (!z15) {
                    int d3 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d3);
                    int i10 = 0;
                    while (i10 < d3) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z12 ? (byte) 1 : (byte) 0));
                        i10++;
                        c4 = c4;
                    }
                    arrayList2 = arrayList3;
                }
                char c9 = c4;
                if (z16) {
                    long d9 = sVar.d();
                    boolean z17 = (128 & d9) != 0;
                    j11 = ((((d9 & 1) << c9) | sVar.h()) * 1000) / 90;
                    z13 = z17;
                } else {
                    j11 = com.anythink.basead.exoplayer.b.f6539b;
                }
                int e6 = sVar.e();
                int d10 = sVar.d();
                boolean z18 = z14;
                z9 = z13;
                z12 = z18;
                i9 = sVar.d();
                long j12 = h10;
                i = e6;
                i4 = d10;
                long j13 = j11;
                arrayList = arrayList2;
                z10 = z15;
                j9 = j12;
                j10 = j13;
            }
            return new b(h9, z11, z12, z10, arrayList, j9, z9, j10, i, i4, i9);
        }

        private static b c(Parcel parcel) {
            return new b(parcel);
        }

        public static /* synthetic */ b a(s sVar) {
            boolean z8;
            boolean z9;
            int i;
            int i4;
            int i9;
            ArrayList arrayList;
            long j9;
            long j10;
            boolean z10;
            long j11;
            long h9 = sVar.h();
            boolean z11 = true;
            boolean z12 = false;
            boolean z13 = false;
            if ((sVar.d() & 128) != 0) {
                z8 = true;
            } else {
                z8 = true;
                z11 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (z11) {
                z9 = false;
                i = 0;
                i4 = 0;
                i9 = 0;
                arrayList = arrayList2;
                j9 = com.anythink.basead.exoplayer.b.f6539b;
                j10 = com.anythink.basead.exoplayer.b.f6539b;
                z10 = false;
            } else {
                int d2 = sVar.d();
                boolean z14 = (d2 & 128) != 0 ? z8 : false;
                boolean z15 = (d2 & 64) != 0 ? z8 : false;
                char c4 = ' ';
                boolean z16 = (d2 & 32) != 0 ? z8 : false;
                long h10 = z15 ? sVar.h() : com.anythink.basead.exoplayer.b.f6539b;
                if (!z15) {
                    int d3 = sVar.d();
                    ArrayList arrayList3 = new ArrayList(d3);
                    int i10 = 0;
                    while (i10 < d3) {
                        arrayList3.add(new a(sVar.d(), sVar.h(), z12 ? (byte) 1 : (byte) 0));
                        i10++;
                        c4 = c4;
                    }
                    arrayList2 = arrayList3;
                }
                char c9 = c4;
                if (z16) {
                    long d9 = sVar.d();
                    boolean z17 = (128 & d9) != 0;
                    j11 = ((((d9 & 1) << c9) | sVar.h()) * 1000) / 90;
                    z13 = z17;
                } else {
                    j11 = com.anythink.basead.exoplayer.b.f6539b;
                }
                int e6 = sVar.e();
                int d10 = sVar.d();
                boolean z18 = z14;
                z9 = z13;
                z12 = z18;
                i9 = sVar.d();
                long j12 = h10;
                i = e6;
                i4 = d10;
                long j13 = j11;
                arrayList = arrayList2;
                z10 = z15;
                j9 = j12;
                j10 = j13;
            }
            return new b(h9, z11, z12, z10, arrayList, j9, z9, j10, i, i4, i9);
        }

        private b(Parcel parcel) {
            this.f7524a = parcel.readLong();
            this.f7525b = parcel.readByte() == 1;
            this.f7526c = parcel.readByte() == 1;
            this.f7527d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add(a.a(parcel));
            }
            this.f7529f = Collections.unmodifiableList(arrayList);
            this.f7528e = parcel.readLong();
            this.f7530g = parcel.readByte() == 1;
            this.f7531h = parcel.readLong();
            this.i = parcel.readInt();
            this.f7532j = parcel.readInt();
            this.f7533k = parcel.readInt();
        }

        private void b(Parcel parcel) {
            parcel.writeLong(this.f7524a);
            parcel.writeByte(this.f7525b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7526c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f7527d ? (byte) 1 : (byte) 0);
            int size = this.f7529f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(this.f7529f.get(i), parcel);
            }
            parcel.writeLong(this.f7528e);
            parcel.writeByte(this.f7530g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f7531h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.f7532j);
            parcel.writeInt(this.f7533k);
        }

        private static /* synthetic */ void a(b bVar, Parcel parcel) {
            parcel.writeLong(bVar.f7524a);
            parcel.writeByte(bVar.f7525b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7526c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7527d ? (byte) 1 : (byte) 0);
            int size = bVar.f7529f.size();
            parcel.writeInt(size);
            for (int i = 0; i < size; i++) {
                a.a(bVar.f7529f.get(i), parcel);
            }
            parcel.writeLong(bVar.f7528e);
            parcel.writeByte(bVar.f7530g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f7531h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.f7532j);
            parcel.writeInt(bVar.f7533k);
        }
    }

    public /* synthetic */ f(Parcel parcel, byte b9) {
        this(parcel);
    }

    public static f a(s sVar) {
        int d2 = sVar.d();
        ArrayList arrayList = new ArrayList(d2);
        for (int i = 0; i < d2; i++) {
            arrayList.add(b.a(sVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.f7521a.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = this.f7521a.get(i4);
            parcel.writeLong(bVar.f7524a);
            parcel.writeByte(bVar.f7525b ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7526c ? (byte) 1 : (byte) 0);
            parcel.writeByte(bVar.f7527d ? (byte) 1 : (byte) 0);
            int size2 = bVar.f7529f.size();
            parcel.writeInt(size2);
            for (int i9 = 0; i9 < size2; i9++) {
                a.a(bVar.f7529f.get(i9), parcel);
            }
            parcel.writeLong(bVar.f7528e);
            parcel.writeByte(bVar.f7530g ? (byte) 1 : (byte) 0);
            parcel.writeLong(bVar.f7531h);
            parcel.writeInt(bVar.i);
            parcel.writeInt(bVar.f7532j);
            parcel.writeInt(bVar.f7533k);
        }
    }

    private f(List<b> list) {
        this.f7521a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(b.a(parcel));
        }
        this.f7521a = Collections.unmodifiableList(arrayList);
    }
}
