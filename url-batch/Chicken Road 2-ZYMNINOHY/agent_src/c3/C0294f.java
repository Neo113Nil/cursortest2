package c3;

import java.io.Serializable;

/* renamed from: c3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294f implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5727a;

    public static final Throwable a(Object obj) {
        if (obj instanceof C0293e) {
            return ((C0293e) obj).f5726a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0294f) {
            return kotlin.jvm.internal.i.a(this.f5727a, ((C0294f) obj).f5727a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f5727a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f5727a;
        if (obj instanceof C0293e) {
            return ((C0293e) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
