package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jgo implements jfy {
    public static final jgo a = new jgo();
    private static final jiv b = jiv.a;

    private jgo() {
    }

    @Override // defpackage.jfy
    public final jiv a() {
        return b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 1082450443;
    }

    public final String toString() {
        return "CloseButtonClick";
    }
}
