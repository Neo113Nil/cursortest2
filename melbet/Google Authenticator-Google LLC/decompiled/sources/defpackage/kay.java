package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kay {
    public final int a;
    protected final String b;
    public final List c;
    public final List d;

    public kay(int i, String str, List list, List list2) {
        this.a = i;
        this.b = str;
        this.c = hel.o(list);
        this.d = hel.o(list2);
    }

    public final String toString() {
        return getClass().getName() + "(" + this.b + ")";
    }
}
