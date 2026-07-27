package V2;

import E1.i;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import u3.d;

/* loaded from: classes.dex */
public final class a implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    public static final i f4185i = new i(6);

    /* renamed from: j, reason: collision with root package name */
    public static final a f4186j = new a(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public final long f4187d;

    /* renamed from: e, reason: collision with root package name */
    public final long f4188e;

    public a(long j4, long j5) {
        this.f4187d = j4;
        this.f4188e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4187d == aVar.f4187d && this.f4188e == aVar.f4188e;
    }

    public final int hashCode() {
        long j4 = this.f4187d ^ this.f4188e;
        return ((int) j4) ^ ((int) (j4 >> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        long j4 = this.f4188e;
        d.k(24, 6, j4, bArr);
        bArr[23] = 45;
        d.k(19, 2, j4 >>> 48, bArr);
        bArr[18] = 45;
        long j5 = this.f4187d;
        d.k(14, 2, j5, bArr);
        bArr[13] = 45;
        d.k(9, 2, j5 >>> 16, bArr);
        bArr[8] = 45;
        d.k(0, 4, j5 >>> 32, bArr);
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new String(bArr, Charsets.UTF_8);
    }
}
