package kotlin.uuid;

import java.io.Serializable;
import kotlin.ULong;
import kotlin.text.Charsets;

/* loaded from: classes3.dex */
public final class Uuid implements Comparable, Serializable {
    public static final Companion Companion = new Companion();
    public static final Uuid NIL = new Uuid(0, 0);
    public final long leastSignificantBits;
    public final long mostSignificantBits;

    public final class Companion {
    }

    public Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Uuid uuid = (Uuid) obj;
        uuid.getClass();
        long j = uuid.mostSignificantBits;
        long j2 = this.mostSignificantBits;
        if (j2 != j) {
            ULong.Companion companion = ULong.Companion;
            return Long.compareUnsigned(j2, j);
        }
        ULong.Companion companion2 = ULong.Companion;
        return Long.compareUnsigned(this.leastSignificantBits, uuid.leastSignificantBits);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Uuid)) {
            return false;
        }
        Uuid uuid = (Uuid) obj;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    public final int hashCode() {
        return Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 24, 2, 8);
        return new String(bArr, Charsets.UTF_8);
    }
}
