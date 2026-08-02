package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvv implements gzf {
    final /* synthetic */ guq a;
    final /* synthetic */ gzf b;

    public gvv(guq guqVar, gzf gzfVar) {
        this.a = guqVar;
        this.b = gzfVar;
    }

    @Override // defpackage.gzf
    public final Object a(Object obj) {
        guq g = gta.g(gta.a(), this.a);
        try {
            return this.b.a(obj);
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
