package M0;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1704b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1705c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1706d;

    /* renamed from: e, reason: collision with root package name */
    public final String[] f1707e;

    /* renamed from: f, reason: collision with root package name */
    public final i[] f1708f;

    public d(String str, boolean z, boolean z4, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f1704b = str;
        this.f1705c = z;
        this.f1706d = z4;
        this.f1707e = strArr;
        this.f1708f = iVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f1705c == dVar.f1705c && this.f1706d == dVar.f1706d && Objects.equals(this.f1704b, dVar.f1704b) && Arrays.equals(this.f1707e, dVar.f1707e) && Arrays.equals(this.f1708f, dVar.f1708f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (((527 + (this.f1705c ? 1 : 0)) * 31) + (this.f1706d ? 1 : 0)) * 31;
        String str = this.f1704b;
        return i4 + (str != null ? str.hashCode() : 0);
    }
}
