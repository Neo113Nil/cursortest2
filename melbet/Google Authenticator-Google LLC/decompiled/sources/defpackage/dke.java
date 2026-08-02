package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dke {
    public final int a;
    private final String b;

    public dke(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public static dke a(String str) {
        str.getClass();
        return new dke(1, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dke) {
            dke dkeVar = (dke) obj;
            if (dkeVar.a - 1 == this.a - 1 && Objects.equals(dkeVar.b, this.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.b;
        return (this.a - 1) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
