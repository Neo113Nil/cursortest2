package defpackage;

import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cdi extends cdt {
    private final byte[] a;
    private final List b;

    public cdi(byte[] bArr, List list) {
        this.a = bArr;
        this.b = list;
    }

    @Override // defpackage.cdt
    public final List a() {
        return this.b;
    }

    @Override // defpackage.cdt
    public final byte[] b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdt) {
            cdt cdtVar = (cdt) obj;
            if (Arrays.equals(this.a, cdtVar instanceof cdi ? ((cdi) cdtVar).a : cdtVar.b()) && ((list = this.b) != null ? list.equals(cdtVar.a()) : cdtVar.a() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.a) ^ 1000003;
        List list = this.b;
        return (list == null ? 0 : list.hashCode()) ^ (hashCode * 1000003);
    }

    public final String toString() {
        List list = this.b;
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + String.valueOf(list) + "}";
    }
}
