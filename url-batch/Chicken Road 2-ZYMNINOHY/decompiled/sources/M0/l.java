package M0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: b, reason: collision with root package name */
    public final int f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1727c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1728d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1729e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f1730f;

    public l(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f1726b = i4;
        this.f1727c = i5;
        this.f1728d = i6;
        this.f1729e = iArr;
        this.f1730f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && l.class == obj.getClass()) {
            l lVar = (l) obj;
            if (this.f1726b == lVar.f1726b && this.f1727c == lVar.f1727c && this.f1728d == lVar.f1728d && Arrays.equals(this.f1729e, lVar.f1729e) && Arrays.equals(this.f1730f, lVar.f1730f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1730f) + ((Arrays.hashCode(this.f1729e) + ((((((527 + this.f1726b) * 31) + this.f1727c) * 31) + this.f1728d) * 31)) * 31);
    }
}
