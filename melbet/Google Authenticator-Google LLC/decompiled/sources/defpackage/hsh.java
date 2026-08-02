package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hsh extends RuntimeException {
    private static final long serialVersionUID = 1;
    public final List a;

    public hsh(List list) {
        super("Cyclical graphs can not be topologically sorted.");
        this.a = list;
    }
}
