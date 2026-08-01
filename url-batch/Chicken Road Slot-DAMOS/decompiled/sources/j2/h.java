package j2;

import com.appsflyer.attribution.RequestError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import k1.f0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends wd.p implements Function2 {
    public static final h A;
    public static final h B;
    public static final h C;
    public static final h D;
    public static final h E;
    public static final h F;
    public static final h G;
    public static final h H;
    public static final h I;

    /* renamed from: e, reason: collision with root package name */
    public static final h f4939e;

    /* renamed from: i, reason: collision with root package name */
    public static final h f4940i;

    /* renamed from: r, reason: collision with root package name */
    public static final h f4941r;

    /* renamed from: s, reason: collision with root package name */
    public static final h f4942s;

    /* renamed from: t, reason: collision with root package name */
    public static final h f4943t;

    /* renamed from: u, reason: collision with root package name */
    public static final h f4944u;

    /* renamed from: v, reason: collision with root package name */
    public static final h f4945v;

    /* renamed from: w, reason: collision with root package name */
    public static final h f4946w;

    /* renamed from: x, reason: collision with root package name */
    public static final h f4947x;

    /* renamed from: y, reason: collision with root package name */
    public static final h f4948y;

    /* renamed from: z, reason: collision with root package name */
    public static final h f4949z;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f4950d;

    static {
        int i3 = 2;
        f4939e = new h(i3, 0);
        f4940i = new h(i3, 1);
        f4941r = new h(i3, 2);
        f4942s = new h(i3, 3);
        f4943t = new h(i3, 4);
        f4944u = new h(i3, 5);
        f4945v = new h(i3, 6);
        f4946w = new h(i3, 7);
        f4947x = new h(i3, 8);
        f4948y = new h(i3, 9);
        f4949z = new h(i3, 10);
        A = new h(i3, 11);
        B = new h(i3, 12);
        C = new h(i3, 13);
        D = new h(i3, 14);
        E = new h(i3, 15);
        F = new h(i3, 16);
        G = new h(i3, 17);
        H = new h(i3, 18);
        I = new h(i3, 19);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i3, int i10) {
        super(i3);
        this.f4950d = i10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        hd.c cVar;
        switch (this.f4950d) {
            case 0:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = j0.f5574d;
                }
                return CollectionsKt.G(collection, list);
            case 1:
                return (e1.c) obj;
            case 2:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case a4.j.INTEGER_FIELD_NUMBER /* 3 */:
                return (e1.m) obj;
            case a4.j.LONG_FIELD_NUMBER /* 4 */:
                return (e1.e) obj;
            case a4.j.STRING_FIELD_NUMBER /* 5 */:
                return (Unit) obj;
            case a4.j.STRING_SET_FIELD_NUMBER /* 6 */:
                return (Unit) obj;
            case a4.j.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case a4.j.BYTES_FIELD_NUMBER /* 8 */:
                return (Unit) obj;
            case 9:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 10:
                g gVar = (g) obj;
                int i3 = ((g) obj2).f4938a;
                return gVar;
            case RequestError.STOP_TRACKING /* 11 */:
                return (f0) obj;
            case 12:
                return (String) obj;
            case 13:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 14:
                Float f3 = (Float) obj;
                ((Number) obj2).floatValue();
                return f3;
            case 15:
                return (String) obj;
            case 16:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 17:
                a aVar = (a) obj;
                a aVar2 = (a) obj2;
                if (aVar == null || (str = aVar.f4928a) == null) {
                    str = aVar2.f4928a;
                }
                if (aVar == null || (cVar = aVar.f4929b) == null) {
                    cVar = aVar2.f4929b;
                }
                return new a(str, cVar);
            case 18:
                return obj == null ? obj2 : obj;
            default:
                m mVar = (m) obj2;
                Object valueOf = Float.valueOf(0.0f);
                j jVar = ((m) obj).f4983d;
                t tVar = q.f5010t;
                Object g = jVar.f4975d.g(tVar);
                if (g == null) {
                    g = valueOf;
                }
                float floatValue = ((Number) g).floatValue();
                Object g2 = mVar.f4983d.f4975d.g(tVar);
                if (g2 != null) {
                    valueOf = g2;
                }
                return Integer.valueOf(Float.compare(floatValue, ((Number) valueOf).floatValue()));
        }
    }
}
