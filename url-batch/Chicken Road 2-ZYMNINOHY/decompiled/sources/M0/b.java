package M0;

import E.AbstractC0005f;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends i {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1697b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f1697b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f1721a.equals(bVar.f1721a) && Arrays.equals(this.f1697b, bVar.f1697b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1697b) + AbstractC0005f.f(527, 31, this.f1721a);
    }
}
