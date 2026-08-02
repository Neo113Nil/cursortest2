package defpackage;

import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hfr extends heq {
    private static final long serialVersionUID = 0;
    private final Comparator a;

    public hfr(hfs hfsVar) {
        super(hfsVar);
        this.a = hfsVar.comparator();
    }

    @Override // defpackage.heq
    public final /* bridge */ /* synthetic */ hen a(int i) {
        return new hfq(this.a);
    }
}
