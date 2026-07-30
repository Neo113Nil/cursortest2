package com.google.firebase;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bx;
import defpackage.in1;
import defpackage.lh;
import defpackage.m52;
import defpackage.q40;
import j$.time.Instant;
import java.util.Date;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class Timestamp implements Comparable<Timestamp>, Parcelable {
    private final int nanoseconds;
    private final long seconds;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Timestamp> CREATOR = new Parcelable.Creator<Timestamp>() { // from class: com.google.firebase.Timestamp$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Timestamp(parcel.readLong(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Timestamp[] newArray(int i) {
            return new Timestamp[i];
        }
    };

    public Timestamp(Date date) {
        date.getClass();
        Companion companion = Companion;
        Pair preciseTime = companion.toPreciseTime(date);
        long longValue = ((Number) preciseTime.m).longValue();
        int intValue = ((Number) preciseTime.n).intValue();
        companion.validateRange(longValue, intValue);
        this.seconds = longValue;
        this.nanoseconds = intValue;
    }

    public static final Timestamp now() {
        return Companion.now();
    }

    @Override // java.lang.Comparable
    public int compareTo(Timestamp timestamp) {
        timestamp.getClass();
        Function1[] function1Arr = {new m52() { // from class: com.google.firebase.Timestamp$compareTo$1
            @Override // defpackage.s71
            public Object get(Object obj) {
                return Long.valueOf(((Timestamp) obj).getSeconds());
            }
        }, new m52() { // from class: com.google.firebase.Timestamp$compareTo$2
            @Override // defpackage.s71
            public Object get(Object obj) {
                return Integer.valueOf(((Timestamp) obj).getNanoseconds());
            }
        }};
        for (int i = 0; i < 2; i++) {
            Function1 function1 = function1Arr[i];
            int a = bx.a((Comparable) function1.invoke(this), (Comparable) function1.invoke(timestamp));
            if (a != 0) {
                return a;
            }
        }
        return 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
        }
        return true;
    }

    public final int getNanoseconds() {
        return this.nanoseconds;
    }

    public final long getSeconds() {
        return this.seconds;
    }

    public int hashCode() {
        long j = this.seconds;
        return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.nanoseconds;
    }

    public final Date toDate() {
        return new Date((this.seconds * 1000) + (this.nanoseconds / 1000000));
    }

    public final Instant toInstant() {
        Instant ofEpochSecond = Instant.ofEpochSecond(this.seconds, this.nanoseconds);
        ofEpochSecond.getClass();
        return ofEpochSecond;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(seconds=");
        sb.append(this.seconds);
        sb.append(", nanoseconds=");
        return q40.o(sb, this.nanoseconds, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeLong(this.seconds);
        parcel.writeInt(this.nanoseconds);
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Pair<Long, Integer> toPreciseTime(Date date) {
            long time = date.getTime() / 1000;
            int time2 = (int) ((date.getTime() % 1000) * 1000000);
            return time2 < 0 ? new Pair<>(Long.valueOf(time - 1), Integer.valueOf(time2 + 1000000000)) : new Pair<>(Long.valueOf(time), Integer.valueOf(time2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void validateRange(long j, int i) {
            if (i < 0 || i >= 1000000000) {
                lh.c(in1.k(i, "Timestamp nanoseconds out of range: "));
            } else if (-62135596800L > j || j >= 253402300800L) {
                lh.c(q40.i(j, "Timestamp seconds out of range: "));
            }
        }

        public final Timestamp now() {
            return new Timestamp(new Date());
        }

        private Companion() {
        }
    }

    public Timestamp(long j, int i) {
        Companion.validateRange(j, i);
        this.seconds = j;
        this.nanoseconds = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Timestamp(Instant instant) {
        this(instant.getEpochSecond(), instant.getNano());
        instant.getClass();
    }
}
