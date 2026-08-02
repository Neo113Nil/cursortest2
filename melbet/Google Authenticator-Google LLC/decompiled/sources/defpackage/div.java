package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class div {
    private final int a;

    public div(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof div) && this.a == ((div) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public void a() {
    }
}
