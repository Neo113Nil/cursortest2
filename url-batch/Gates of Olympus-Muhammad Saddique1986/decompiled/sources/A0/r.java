package A0;

import R1.y;
import e2.InterfaceC0426e;
import java.util.ArrayList;
import java.util.List;
import r.AbstractC0856c;

/* loaded from: classes.dex */
public final class r extends f2.k implements InterfaceC0426e {

    /* renamed from: f, reason: collision with root package name */
    public static final r f148f = new r(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final r f149g = new r(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final r f150h = new r(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final r f151i = new r(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final r f152j = new r(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final r f153k = new r(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final r f154l = new r(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final r f155m = new r(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final r f156n = new r(2, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final r f157o = new r(2, 9);

    /* renamed from: p, reason: collision with root package name */
    public static final r f158p = new r(2, 10);

    /* renamed from: q, reason: collision with root package name */
    public static final r f159q = new r(2, 11);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f160e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i3, int i4) {
        super(i3);
        this.f160e = i4;
    }

    @Override // e2.InterfaceC0426e
    public final Object h(Object obj, Object obj2) {
        String str;
        R1.e eVar;
        switch (this.f160e) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList b12 = S1.l.b1(list);
                b12.addAll(list2);
                return b12;
            case 1:
                return (y) obj;
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                f fVar = (f) obj;
                int i3 = ((f) obj2).f98a;
                return fVar;
            case 6:
                return (String) obj;
            case k1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList b13 = S1.l.b1(list3);
                b13.addAll(list4);
                return b13;
            case k1.i.BYTES_FIELD_NUMBER /* 8 */:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case AbstractC0856c.f8037c /* 9 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case AbstractC0856c.f8039e /* 10 */:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f88a) == null) {
                    str = aVar2.f88a;
                }
                if (aVar == null || (eVar = aVar.f89b) == null) {
                    eVar = aVar2.f89b;
                }
                return new a(str, eVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
