package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhl implements jgu {
    public final int a = 3;
    private final float b = 0.0f;

    @Override // defpackage.jgu
    public final jhh b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jhl)) {
            return false;
        }
        jhl jhlVar = (jhl) obj;
        int i = jhlVar.a;
        float f = jhlVar.b;
        return Float.compare(0.0f, 0.0f) == 0;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + 93;
    }

    public final String toString() {
        return "ProgressOgImage(type=LOADING_INDICATOR, progress=0.0)";
    }
}
