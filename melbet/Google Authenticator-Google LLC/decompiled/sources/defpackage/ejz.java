package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ejz {
    private static final int[] h = new int[0];
    private static final String[] i = new String[0];
    public final long a;
    public final String b;
    public final String c;
    public final int d;
    public final int[] e;
    public final String[] f;
    public final ejy g;

    public ejz(String str, String str2, int i2, long j, int[] iArr, String[] strArr, ejy ejyVar) {
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.a = j;
        this.e = iArr;
        this.f = strArr;
        this.g = ejyVar;
    }

    public static boolean a(Object obj) {
        return obj == null || (obj instanceof ekl);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejz)) {
            return false;
        }
        ejz ejzVar = (ejz) obj;
        return Objects.equals(this.b, ejzVar.b) && Objects.equals(this.c, ejzVar.c) && this.d == ejzVar.d && this.a == ejzVar.a && Arrays.equals(this.e, ejzVar.e) && Arrays.equals(this.f, ejzVar.f) && Objects.equals(this.g, ejzVar.g);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, Integer.valueOf(this.d), Long.valueOf(this.a), Integer.valueOf(Arrays.hashCode(this.e)), Integer.valueOf(Arrays.hashCode(this.f)), this.g);
    }

    public ejz(String str, String str2, int i2, long j, ejy ejyVar) {
        this(str, str2, i2, j, h, i, ejyVar);
    }
}
