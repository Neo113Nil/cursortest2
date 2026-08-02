package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jrc implements jrq {
    public final agl a;
    public final Object b;

    public jrc(agl aglVar, Object obj) {
        this.a = aglVar;
        this.b = obj;
    }

    public static agj b(agl aglVar, Object obj) {
        return new agj(aglVar, new jqd(obj, 4));
    }

    @Override // defpackage.jrq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public jpy C() {
        return ((jra) b(this.a, this.b).a(jra.class)).a;
    }
}
