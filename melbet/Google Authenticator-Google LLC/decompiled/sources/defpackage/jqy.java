package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jqy implements jrq {
    private final Object a = new Object();
    private final Object b;
    private final jpu c;
    private volatile bnh d;

    protected jqy(Object obj, jpu jpuVar) {
        this.b = obj;
        this.c = jpuVar;
    }

    protected bnh a() {
        bny h = ((jqx) imq.a(this.b, jqx.class)).h();
        jpu jpuVar = this.c;
        int d = jpuVar.d() - 1;
        h.a = ((jqi) ((jrr) (d != 0 ? d != 2 ? jpuVar.e() : jpuVar.b() : jpuVar.a())).b()).c();
        h.b = jpuVar;
        iwm.a(h.a, jpy.class);
        iwm.a(h.b, jpu.class);
        return new bnh(h.c, h.d, h.e, h.b);
    }

    @Override // defpackage.jrq
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bnh C() {
        if (this.d == null) {
            synchronized (this.a) {
                if (this.d == null) {
                    this.d = a();
                }
            }
        }
        return this.d;
    }
}
