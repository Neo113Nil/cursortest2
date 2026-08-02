package M0;

import T.B;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1693b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1694c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1695d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1696e;

    public a(String str, String str2, byte[] bArr, int i4) {
        super("APIC");
        this.f1693b = str;
        this.f1694c = str2;
        this.f1695d = i4;
        this.f1696e = bArr;
    }

    @Override // T.D
    public final void c(B b4) {
        b4.a(this.f1695d, this.f1696e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f1695d == aVar.f1695d && Objects.equals(this.f1693b, aVar.f1693b) && Objects.equals(this.f1694c, aVar.f1694c) && Arrays.equals(this.f1696e, aVar.f1696e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = (527 + this.f1695d) * 31;
        String str = this.f1693b;
        int hashCode = (i4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f1694c;
        return Arrays.hashCode(this.f1696e) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": mimeType=" + this.f1693b + ", description=" + this.f1694c;
    }
}
