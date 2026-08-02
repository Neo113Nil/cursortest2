package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgk implements jgm {
    public final jhb a;
    public final jhb b;

    public jgk(jhb jhbVar) {
        jhb jhbVar2;
        jhbVar.getClass();
        this.a = jhbVar;
        int ordinal = jhbVar.ordinal();
        if (ordinal == 4) {
            jhbVar2 = jhb.d;
        } else if (ordinal == 5) {
            jhbVar2 = jhb.k;
        } else if (ordinal == 6) {
            jhbVar2 = jhb.h;
        } else if (ordinal == 8 || ordinal == 9 || ordinal == 11) {
            jhbVar2 = jhb.c;
        } else {
            if (ordinal != 19) {
                Objects.toString(jhbVar);
                throw new IllegalArgumentException("Unsupported background color: ".concat(jhbVar.toString()));
            }
            jhbVar2 = jhb.u;
        }
        this.b = jhbVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jgk) && this.a == ((jgk) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonStyleFilled(backgroundColor=" + this.a + ")";
    }
}
