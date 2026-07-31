package androidx.compose.foundation;

import f1.i0;
import f1.p;
import q6.i;
import r2.f;
import t.s;
import w1.x0;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class BorderModifierNodeElement extends x0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f461a;

    /* renamed from: b, reason: collision with root package name */
    public final p f462b;

    /* renamed from: c, reason: collision with root package name */
    public final i0 f463c;

    public BorderModifierNodeElement(float f6, p pVar, i0 i0Var) {
        this.f461a = f6;
        this.f462b = pVar;
        this.f463c = i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BorderModifierNodeElement)) {
            return false;
        }
        BorderModifierNodeElement borderModifierNodeElement = (BorderModifierNodeElement) obj;
        return f.a(this.f461a, borderModifierNodeElement.f461a) && this.f462b.equals(borderModifierNodeElement.f462b) && i.a(this.f463c, borderModifierNodeElement.f463c);
    }

    @Override // w1.x0
    public final l f() {
        return new s(this.f461a, this.f462b, this.f463c);
    }

    @Override // w1.x0
    public final void g(l lVar) {
        s sVar = (s) lVar;
        float f6 = sVar.f6850u;
        c1.b bVar = sVar.f6853x;
        float f8 = this.f461a;
        if (!f.a(f6, f8)) {
            sVar.f6850u = f8;
            bVar.r0();
        }
        p pVar = sVar.f6851v;
        p pVar2 = this.f462b;
        if (!i.a(pVar, pVar2)) {
            sVar.f6851v = pVar2;
            bVar.r0();
        }
        i0 i0Var = sVar.f6852w;
        i0 i0Var2 = this.f463c;
        if (i.a(i0Var, i0Var2)) {
            return;
        }
        sVar.f6852w = i0Var2;
        bVar.r0();
    }

    public final int hashCode() {
        return this.f463c.hashCode() + ((this.f462b.hashCode() + (Float.hashCode(this.f461a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + ((Object) f.b(this.f461a)) + ", brush=" + this.f462b + ", shape=" + this.f463c + ')';
    }
}
