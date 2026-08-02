package L0;

import E.AbstractC0005f;
import T.B;
import T.D;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements D {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1610a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1611b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1612c;

    public c(byte[] bArr, String str, String str2) {
        this.f1610a = bArr;
        this.f1611b = str;
        this.f1612c = str2;
    }

    @Override // T.D
    public final void c(B b4) {
        String str = this.f1611b;
        if (str != null) {
            b4.f2609a = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f1610a, ((c) obj).f1610a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1610a);
    }

    public final String toString() {
        int length = this.f1610a.length;
        StringBuilder sb = new StringBuilder("ICY: title=\"");
        sb.append(this.f1611b);
        sb.append("\", url=\"");
        sb.append(this.f1612c);
        sb.append("\", rawMetadata.length=\"");
        return AbstractC0005f.o(sb, length, "\"");
    }
}
