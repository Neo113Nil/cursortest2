package M0;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f1731b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1732c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f1731b = str;
        this.f1732c = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f1731b, mVar.f1731b) && Arrays.equals(this.f1732c, mVar.f1732c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f1731b;
        return Arrays.hashCode(this.f1732c) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // M0.i
    public final String toString() {
        return this.f1721a + ": owner=" + this.f1731b;
    }
}
