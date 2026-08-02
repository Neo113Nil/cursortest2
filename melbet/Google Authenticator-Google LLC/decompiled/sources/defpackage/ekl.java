package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ekl implements ekk {
    public abstract Object a();

    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof ekl) {
            return Objects.equals(a(), ((ekl) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return b();
    }
}
