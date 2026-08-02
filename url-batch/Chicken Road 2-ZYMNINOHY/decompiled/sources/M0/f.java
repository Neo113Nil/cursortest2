package M0;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1712b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1713c;

    /* renamed from: d, reason: collision with root package name */
    public final String f1714d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1715e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f1712b = str;
        this.f1713c = str2;
        this.f1714d = str3;
        this.f1715e = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f1712b, fVar.f1712b) && Objects.equals(this.f1713c, fVar.f1713c) && Objects.equals(this.f1714d, fVar.f1714d) && Arrays.equals(this.f1715e, fVar.f1715e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1712b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1713c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f1714d;
        return Arrays.hashCode(this.f1715e) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": mimeType=" + this.f1712b + ", filename=" + this.f1713c + ", description=" + this.f1714d;
    }
}
