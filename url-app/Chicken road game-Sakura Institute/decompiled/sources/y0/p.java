package y0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import q.AbstractC1024c;
import y2.InterfaceC1332g;
import z2.C1403G;

/* loaded from: classes.dex */
public final class p extends M2.p implements Function2 {

    /* renamed from: e, reason: collision with root package name */
    public static final p f11593e = new p(2, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final p f11594i = new p(2, 1);

    /* renamed from: j, reason: collision with root package name */
    public static final p f11595j = new p(2, 2);

    /* renamed from: k, reason: collision with root package name */
    public static final p f11596k = new p(2, 3);

    /* renamed from: l, reason: collision with root package name */
    public static final p f11597l = new p(2, 4);

    /* renamed from: m, reason: collision with root package name */
    public static final p f11598m = new p(2, 5);

    /* renamed from: n, reason: collision with root package name */
    public static final p f11599n = new p(2, 6);

    /* renamed from: o, reason: collision with root package name */
    public static final p f11600o = new p(2, 7);

    /* renamed from: p, reason: collision with root package name */
    public static final p f11601p = new p(2, 8);

    /* renamed from: q, reason: collision with root package name */
    public static final p f11602q = new p(2, 9);

    /* renamed from: r, reason: collision with root package name */
    public static final p f11603r = new p(2, 10);

    /* renamed from: s, reason: collision with root package name */
    public static final p f11604s = new p(2, 11);

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f11605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i2, int i4) {
        super(i2);
        this.f11605d = i4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        String str;
        InterfaceC1332g interfaceC1332g;
        switch (this.f11605d) {
            case 0:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList I3 = C1403G.I(list);
                I3.addAll(list2);
                return I3;
            case 1:
                return (Unit) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                f fVar = (f) obj;
                int i2 = ((f) obj2).f11545a;
                return fVar;
            case 6:
                return (String) obj;
            case i1.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList I4 = C1403G.I(list3);
                I4.addAll(list4);
                return I4;
            case i1.i.BYTES_FIELD_NUMBER /* 8 */:
                Float f4 = (Float) obj;
                ((Number) obj2).floatValue();
                return f4;
            case AbstractC1024c.f9242c /* 9 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 10:
                C1317a c1317a = (C1317a) obj;
                C1317a c1317a2 = (C1317a) obj2;
                if (c1317a == null || (str = c1317a.f11535a) == null) {
                    str = c1317a2.f11535a;
                }
                if (c1317a == null || (interfaceC1332g = c1317a.f11536b) == null) {
                    interfaceC1332g = c1317a2.f11536b;
                }
                return new C1317a(str, interfaceC1332g);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
