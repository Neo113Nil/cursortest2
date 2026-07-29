package com.tapjoy.internal;

import com.tapjoy.internal.ek;

/* loaded from: classes2.dex */
public abstract class eg extends ek {
    public abstract en a(int i);

    @Override // com.tapjoy.internal.ek
    public final /* bridge */ /* synthetic */ int a(Object obj) {
        return em.a(((en) obj).a());
    }

    @Override // com.tapjoy.internal.ek
    public final /* synthetic */ void a(em emVar, Object obj) {
        emVar.c(((en) obj).a());
    }

    protected eg(Class cls) {
        super(eh.VARINT, cls);
    }

    @Override // com.tapjoy.internal.ek
    public final /* synthetic */ Object a(el elVar) {
        int d2 = elVar.d();
        en a2 = a(d2);
        if (a2 != null) {
            return a2;
        }
        throw new ek.a(d2, this.f8004a);
    }
}
