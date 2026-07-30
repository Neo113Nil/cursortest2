package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class l60 extends e6tOsSdd2EFb implements k60, RandomAccess, Serializable {
    public final Enum[] rtx2ld2ELZv4;

    public l60(Enum[] enumArr) {
        this.rtx2ld2ELZv4 = enumArr;
    }

    @Override // defpackage.QrzZRwfaDlRX
    public final int PxuCJdSBwIXG() {
        return this.rtx2ld2ELZv4.length;
    }

    @Override // defpackage.QrzZRwfaDlRX, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) na.cJeY36nTk9tz(r2.ordinal(), this.rtx2ld2ELZv4)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        S2OOm9zPNm0h s2OOm9zPNm0h = e6tOsSdd2EFb.Companion;
        Enum[] enumArr = this.rtx2ld2ELZv4;
        int length = enumArr.length;
        s2OOm9zPNm0h.getClass();
        S2OOm9zPNm0h.PxuCJdSBwIXG(i, length);
        return enumArr[i];
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) na.cJeY36nTk9tz(ordinal, this.rtx2ld2ELZv4)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.e6tOsSdd2EFb, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) na.cJeY36nTk9tz(ordinal, this.rtx2ld2ELZv4)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
