package fe;

import hd.a0;
import hd.z;
import java.io.Serializable;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class b implements Comparable, Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final b f4215i = new b(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final long f4216d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4217e;

    public b(long j, long j3) {
        this.f4216d = j;
        this.f4217e = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        bVar.getClass();
        long j = bVar.f4216d;
        long j3 = this.f4216d;
        if (j3 != j) {
            z zVar = a0.f4495e;
            return Long.compare(j3 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        z zVar2 = a0.f4495e;
        return Long.compare(this.f4217e ^ Long.MIN_VALUE, bVar.f4217e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4216d == bVar.f4216d && this.f4217e == bVar.f4217e;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4216d ^ this.f4217e);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        a.a.t(this.f4216d, bArr, 0, 0, 4);
        bArr[8] = 45;
        a.a.t(this.f4216d, bArr, 9, 4, 6);
        bArr[13] = 45;
        a.a.t(this.f4216d, bArr, 14, 6, 8);
        bArr[18] = 45;
        a.a.t(this.f4217e, bArr, 19, 0, 2);
        bArr[23] = 45;
        a.a.t(this.f4217e, bArr, 24, 2, 8);
        return new String(bArr, Charsets.UTF_8);
    }
}
