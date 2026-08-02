package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djt extends hsw {
    Object a;

    public djt(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.hsw
    public final String a() {
        Object obj = this.a;
        return obj == null ? "" : obj.toString();
    }

    @Override // defpackage.hsw
    protected final void b() {
        this.a = null;
    }
}
