package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cyq implements cmk {
    public final int b;
    private final String c = null;

    public cyq(fso fsoVar) {
        this.b = fsoVar.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cyq)) {
            return false;
        }
        cyq cyqVar = (cyq) obj;
        if (this.b == cyqVar.b) {
            String str = cyqVar.c;
            if (Objects.equals(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), null});
    }
}
