package te;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class w extends d1 {

    /* renamed from: l, reason: collision with root package name */
    public final re.g f9454l;

    /* renamed from: m, reason: collision with root package name */
    public final hd.q f9455m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(final String str, final int i3) {
        super(str, null, i3);
        str.getClass();
        this.f9454l = re.g.g;
        this.f9455m = hd.h.b(new Function0() { // from class: te.v
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i10 = i3;
                re.e[] eVarArr = new re.e[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    String str2 = str + '.' + this.f9361e[i11];
                    re.h hVar = re.h.j;
                    re.e[] eVarArr2 = new re.e[0];
                    if (StringsKt.r(str2)) {
                        a1.e("Blank serial names are prohibited");
                        return null;
                    }
                    if (hVar.equals(re.h.g)) {
                        a1.e("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
                        return null;
                    }
                    re.a aVar = new re.a(str2);
                    eVarArr[i11] = new re.f(str2, hVar, aVar.f8230b.size(), kotlin.collections.w.v(eVarArr2), aVar);
                }
                return eVarArr;
            }
        });
    }

    @Override // te.d1, re.e
    public final i7.a b() {
        return this.f9454l;
    }

    @Override // te.d1
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof re.e)) {
            return false;
        }
        re.e eVar = (re.e) obj;
        return eVar.b() == re.g.g && Intrinsics.a(this.f9357a, eVar.a()) && Intrinsics.a(b1.b(this), b1.b(eVar));
    }

    @Override // te.d1, re.e
    public final re.e h(int i3) {
        return ((re.e[]) this.f9455m.getValue())[i3];
    }

    @Override // te.d1
    public final int hashCode() {
        int hashCode = this.f9357a.hashCode();
        hd.u uVar = new hd.u(this);
        int i3 = 1;
        while (uVar.hasNext()) {
            int i10 = i3 * 31;
            String str = (String) uVar.next();
            i3 = i10 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i3;
    }

    @Override // te.d1
    public final String toString() {
        return CollectionsKt.B(new de.m(2, this), ", ", n0.l.h(new StringBuilder(), this.f9357a, '('), ")", null, 56);
    }
}
