package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class crh implements cmk {
    public static final crh b = new crh(null);
    public final String c;

    public crh(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof crh) {
            return Objects.equals(this.c, ((crh) obj).c);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c});
    }
}
