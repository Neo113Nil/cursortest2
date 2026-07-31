package z0;

import L1.z;
import f.AbstractC0382a;
import h1.C0438i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends Z1.j implements Y1.e {

    /* renamed from: f, reason: collision with root package name */
    public static final p f8997f = new p(2, 0);

    /* renamed from: g, reason: collision with root package name */
    public static final p f8998g = new p(2, 1);

    /* renamed from: h, reason: collision with root package name */
    public static final p f8999h = new p(2, 2);

    /* renamed from: i, reason: collision with root package name */
    public static final p f9000i = new p(2, 3);

    /* renamed from: j, reason: collision with root package name */
    public static final p f9001j = new p(2, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final p f9002k = new p(2, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final p f9003l = new p(2, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final p f9004m = new p(2, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final p f9005n = new p(2, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final p f9006o = new p(2, 9);
    public static final p p = new p(2, 10);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i3, int i4) {
        super(i3);
        this.f9007e = i4;
    }

    @Override // Y1.e
    public final Object g(Object obj, Object obj2) {
        String str;
        L1.e eVar;
        switch (this.f9007e) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList D02 = M1.l.D0(list);
                D02.addAll(list2);
                return D02;
            case 1:
                return (z) obj;
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                f fVar = (f) obj;
                int i3 = ((f) obj2).f8953a;
                return fVar;
            case 5:
                return (String) obj;
            case 6:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList D03 = M1.l.D0(list3);
                D03.addAll(list4);
                return D03;
            case C0438i.DOUBLE_FIELD_NUMBER /* 7 */:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case 8:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case AbstractC0382a.f4777a /* 9 */:
                C1076a c1076a = (C1076a) obj;
                C1076a c1076a2 = (C1076a) obj2;
                if (c1076a == null || (str = c1076a.f8942a) == null) {
                    str = c1076a2.f8942a;
                }
                if (c1076a == null || (eVar = c1076a.f8943b) == null) {
                    eVar = c1076a2.f8943b;
                }
                return new C1076a(str, eVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
