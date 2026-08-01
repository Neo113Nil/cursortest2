package te;

import java.util.Arrays;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class x implements pe.a {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f9460a;

    /* renamed from: b, reason: collision with root package name */
    public final hd.q f9461b;

    public x(String str, Enum[] enumArr) {
        str.getClass();
        this.f9460a = enumArr;
        this.f9461b = hd.h.b(new a4.a(11, this, str));
    }

    @Override // pe.a
    public final void a(e3.o oVar, Object obj) {
        Enum r52 = (Enum) obj;
        r52.getClass();
        Enum[] enumArr = this.f9460a;
        int p4 = kotlin.collections.w.p(enumArr, r52);
        if (p4 != -1) {
            re.e d10 = d();
            oVar.getClass();
            d10.getClass();
            oVar.o(Integer.valueOf(p4));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r52);
        String a9 = d().a();
        String arrays = Arrays.toString(enumArr);
        arrays.getClass();
        sb2.append(" is not a valid enum ");
        sb2.append(a9);
        sb2.append(", must be one of ");
        sb2.append(arrays);
        throw new ee.h(sb2.toString());
    }

    @Override // pe.a
    public final Object b(y6.l lVar) {
        d().getClass();
        int intValue = ((Integer) lVar.e()).intValue();
        Enum[] enumArr = this.f9460a;
        if (intValue >= 0 && intValue < enumArr.length) {
            return enumArr[intValue];
        }
        throw new ee.h(intValue + " is not among valid " + d().a() + " enum values, values size is " + enumArr.length);
    }

    @Override // pe.a
    public final re.e d() {
        return (re.e) this.f9461b.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + d().a() + '>';
    }
}
