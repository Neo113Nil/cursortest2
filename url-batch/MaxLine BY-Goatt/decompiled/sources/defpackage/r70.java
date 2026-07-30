package defpackage;

import android.os.Parcel;
import defpackage.q13;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class r70 {
    public Parcel a;

    public long a() {
        int i = aw.h;
        long readLong = this.a.readLong();
        long j = 63 & readLong;
        if (j >= 16) {
            readLong = (readLong & (-64)) | (j + 1);
        }
        q13.a aVar = q13.m;
        return readLong;
    }

    public long b() {
        Parcel parcel = this.a;
        byte readByte = parcel.readByte();
        long j = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return tw2.a(j, 0L) ? sw2.c : mi2.n(j, parcel.readFloat());
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long b = sw2.b(j);
        byte b2 = 0;
        if (!tw2.a(b, 0L)) {
            if (tw2.a(b, 4294967296L)) {
                b2 = 1;
            } else if (tw2.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        c(b2);
        if (tw2.a(sw2.b(j), 0L)) {
            return;
        }
        d(sw2.c(j));
    }

    public void f(long j) {
        long j2 = 63 & j;
        q13.a aVar = q13.m;
        if (Long.compare(Long.MIN_VALUE ^ j2, -9223372036854775792L) >= 0) {
            j = (j & (-64)) | (j2 - 1);
        }
        this.a.writeLong(j);
    }
}
