package y1;

import com.android.installreferrer.api.InstallReferrerClient;
import d6.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class o extends r6.l implements q6.e {

    /* renamed from: h, reason: collision with root package name */
    public static final o f9846h;

    /* renamed from: i, reason: collision with root package name */
    public static final o f9847i;

    /* renamed from: j, reason: collision with root package name */
    public static final o f9848j;

    /* renamed from: k, reason: collision with root package name */
    public static final o f9849k;

    /* renamed from: l, reason: collision with root package name */
    public static final o f9850l;

    /* renamed from: m, reason: collision with root package name */
    public static final o f9851m;

    /* renamed from: n, reason: collision with root package name */
    public static final o f9852n;

    /* renamed from: o, reason: collision with root package name */
    public static final o f9853o;

    /* renamed from: p, reason: collision with root package name */
    public static final o f9854p;

    /* renamed from: q, reason: collision with root package name */
    public static final o f9855q;

    /* renamed from: r, reason: collision with root package name */
    public static final o f9856r;

    /* renamed from: s, reason: collision with root package name */
    public static final o f9857s;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f9858g;

    static {
        int i7 = 2;
        f9846h = new o(i7, 0);
        f9847i = new o(i7, 1);
        f9848j = new o(i7, 2);
        f9849k = new o(i7, 3);
        f9850l = new o(i7, 4);
        f9851m = new o(i7, 5);
        f9852n = new o(i7, 6);
        f9853o = new o(i7, 7);
        f9854p = new o(i7, 8);
        f9855q = new o(i7, 9);
        f9856r = new o(i7, 10);
        f9857s = new o(i7, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i7, int i8) {
        super(i7);
        this.f9858g = i8;
    }

    @Override // q6.e
    public final Object d(Object obj, Object obj2) {
        String str;
        d6.e eVar;
        switch (this.f9858g) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList x02 = e6.l.x0(list);
                x02.addAll(list2);
                return x02;
            case 1:
                return (z) obj;
            case 2:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 3:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 4:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 5:
                f fVar = (f) obj;
                int i7 = ((f) obj2).f9803a;
                return fVar;
            case 6:
                return (String) obj;
            case j3.i.DOUBLE_FIELD_NUMBER /* 7 */:
                List list3 = (List) obj;
                List list4 = (List) obj2;
                if (list3 == null) {
                    return list4;
                }
                ArrayList x03 = e6.l.x0(list3);
                x03.addAll(list4);
                return x03;
            case 8:
                Float f9 = (Float) obj;
                ((Number) obj2).floatValue();
                return f9;
            case q.c.f7259c /* 9 */:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case q.c.f7261e /* 10 */:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f9793a) == null) {
                    str = aVar2.f9793a;
                }
                if (aVar == null || (eVar = aVar.f9794b) == null) {
                    eVar = aVar2.f9794b;
                }
                return new a(str, eVar);
            default:
                return obj == null ? obj2 : obj;
        }
    }
}
