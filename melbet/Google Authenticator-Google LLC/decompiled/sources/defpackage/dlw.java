package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dlw implements dlv {
    public final int a;
    public final int b;
    private final List c;

    public dlw(int i, List list, int i2) {
        this.b = i;
        this.c = DesugarCollections.unmodifiableList(list);
        this.a = i2;
        if (i == 3) {
            hoq.x(i2 == -1);
        } else {
            hoq.x(i2 != -1);
        }
    }

    @Override // defpackage.dlv
    public final /* synthetic */ dkx a() {
        return dih.f(this);
    }

    @Override // defpackage.dlv
    public final List b() {
        return this.c;
    }
}
