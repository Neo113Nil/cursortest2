package L5;

import J5.q;
import J5.s;
import k5.v;
import p5.EnumC0580a;
import q5.AbstractC0607c;

/* loaded from: classes.dex */
public final class m implements K5.d {

    /* renamed from: f, reason: collision with root package name */
    public final s f1516f;

    public m(q qVar) {
        this.f1516f = qVar;
    }

    @Override // K5.d
    public final Object a(Object obj, AbstractC0607c abstractC0607c) {
        Object b7 = this.f1516f.b(obj, abstractC0607c);
        return b7 == EnumC0580a.f5697f ? b7 : v.f5219a;
    }
}
