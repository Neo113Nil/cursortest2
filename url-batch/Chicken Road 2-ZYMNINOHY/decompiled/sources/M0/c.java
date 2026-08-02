package M0;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1698b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1699c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1700d;

    /* renamed from: e, reason: collision with root package name */
    public final long f1701e;

    /* renamed from: f, reason: collision with root package name */
    public final long f1702f;

    /* renamed from: g, reason: collision with root package name */
    public final i[] f1703g;

    public c(String str, int i4, int i5, long j4, long j5, i[] iVarArr) {
        super("CHAP");
        this.f1698b = str;
        this.f1699c = i4;
        this.f1700d = i5;
        this.f1701e = j4;
        this.f1702f = j5;
        this.f1703g = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f1699c == cVar.f1699c && this.f1700d == cVar.f1700d && this.f1701e == cVar.f1701e && this.f1702f == cVar.f1702f && Objects.equals(this.f1698b, cVar.f1698b) && Arrays.equals(this.f1703g, cVar.f1703g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (((((((527 + this.f1699c) * 31) + this.f1700d) * 31) + ((int) this.f1701e)) * 31) + ((int) this.f1702f)) * 31;
        String str = this.f1698b;
        return i4 + (str != null ? str.hashCode() : 0);
    }
}
