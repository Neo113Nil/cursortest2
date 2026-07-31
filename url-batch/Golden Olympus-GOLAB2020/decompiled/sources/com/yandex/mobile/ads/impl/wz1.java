package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.mobile.ads.impl.wz0;
import com.yandex.mobile.ads.impl.wz1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class wz1 implements wz0.b {
    public static final Parcelable.Creator<wz1> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final List<b> f34347b;

    final class a implements Parcelable.Creator<wz1> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public final wz1 createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new wz1(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final wz1[] newArray(int i4) {
            return new wz1[i4];
        }
    }

    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public final long f34348b;

        /* renamed from: c, reason: collision with root package name */
        public final long f34349c;

        /* renamed from: d, reason: collision with root package name */
        public final int f34350d;

        final class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public final b createFromParcel(Parcel parcel) {
                return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final b[] newArray(int i4) {
                return new b[i4];
            }
        }

        static {
            new Comparator() { // from class: com.yandex.mobile.ads.impl.Bl
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int a4;
                    a4 = wz1.b.a((wz1.b) obj, (wz1.b) obj2);
                    return a4;
                }
            };
            CREATOR = new a();
        }

        public b(int i4, long j4, long j5) {
            C2253tf.a(j4 < j5);
            this.f34348b = j4;
            this.f34349c = j5;
            this.f34350d = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            return lq.b().a(bVar.f34348b, bVar2.f34348b).a(bVar.f34349c, bVar2.f34349c).a(bVar.f34350d, bVar2.f34350d).a();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && b.class == obj.getClass()) {
                b bVar = (b) obj;
                if (this.f34348b == bVar.f34348b && this.f34349c == bVar.f34349c && this.f34350d == bVar.f34350d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Long.valueOf(this.f34348b), Long.valueOf(this.f34349c), Integer.valueOf(this.f34350d)});
        }

        public final String toString() {
            long j4 = this.f34348b;
            long j5 = this.f34349c;
            int i4 = this.f34350d;
            int i5 = u82.f32873a;
            Locale locale = Locale.US;
            return "Segment: startTimeMs=" + j4 + ", endTimeMs=" + j5 + ", speedDivisor=" + i4;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeLong(this.f34348b);
            parcel.writeLong(this.f34349c);
            parcel.writeInt(this.f34350d);
        }
    }

    public wz1(ArrayList arrayList) {
        this.f34347b = arrayList;
        C2253tf.a(!a(arrayList));
    }

    private static boolean a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j4 = ((b) arrayList.get(0)).f34349c;
        for (int i4 = 1; i4 < arrayList.size(); i4++) {
            if (((b) arrayList.get(i4)).f34348b < j4) {
                return true;
            }
            j4 = ((b) arrayList.get(i4)).f34349c;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wz1.class != obj.getClass()) {
            return false;
        }
        return this.f34347b.equals(((wz1) obj).f34347b);
    }

    public final int hashCode() {
        return this.f34347b.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f34347b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeList(this.f34347b);
    }
}
