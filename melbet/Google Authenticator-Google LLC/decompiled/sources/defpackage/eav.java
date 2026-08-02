package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eav extends eat {
    private final ebc f;

    public eav(ebc ebcVar, kzg kzgVar, jiw jiwVar, krt krtVar) {
        super(ebcVar, kzgVar, jiwVar, krtVar);
        this.f = ebcVar;
    }

    @Override // defpackage.eat
    public final eba a() {
        eba a = super.a();
        if (a == null) {
            return null;
        }
        jie jieVar = a.a.a;
        if (!(jieVar instanceof jim)) {
            if (jieVar instanceof jih) {
                throw new IllegalStateException("Only Ready state is supported for Progress card.");
            }
            throw new koj();
        }
        jhq jhqVar = ((jim) jieVar).a;
        new jhq(jhqVar.a, jhqVar.b, jhqVar.e, (Integer) 2, jhqVar.d);
        afc afcVar = this.f.a;
        throw null;
    }

    @Override // defpackage.eat
    public final void b() {
        super.b();
        afc afcVar = this.f.a;
        new eaw(this.c, 1, null);
        throw null;
    }

    @Override // defpackage.eat
    public final void c() {
        super.c();
        afc afcVar = this.f.a;
        new eaw(this.c, 1, null);
        throw null;
    }
}
