package f1;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import y2.AbstractC1343r;

/* renamed from: f1.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0603D extends E2.j implements Function2 {

    /* renamed from: k, reason: collision with root package name */
    public Object f6482k;

    /* renamed from: l, reason: collision with root package name */
    public int f6483l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ boolean f6484m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ N f6485n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f6486o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0603D(N n2, int i2, C2.a aVar) {
        super(2, aVar);
        this.f6485n = n2;
        this.f6486o = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object h(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0603D) j((C2.a) obj2, bool)).l(Unit.f7487a);
    }

    @Override // E2.a
    public final C2.a j(C2.a aVar, Object obj) {
        C0603D c0603d = new C0603D(this.f6485n, this.f6486o, aVar);
        c0603d.f6484m = ((Boolean) obj).booleanValue();
        return c0603d;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // E2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(Object obj) {
        boolean z4;
        Object obj2;
        int i2;
        D2.a aVar = D2.a.f2163d;
        int i4 = this.f6483l;
        N n2 = this.f6485n;
        if (i4 == 0) {
            AbstractC1343r.b(obj);
            z4 = this.f6484m;
            this.f6484m = z4;
            this.f6483l = 1;
            obj = n2.g(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f6482k;
                AbstractC1343r.b(obj);
                i2 = ((Number) obj).intValue();
                return new C0610d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
            }
            z4 = this.f6484m;
            AbstractC1343r.b(obj);
        }
        if (!z4) {
            obj2 = obj;
            i2 = this.f6486o;
            return new C0610d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
        }
        X e4 = n2.e();
        this.f6482k = obj;
        this.f6483l = 2;
        Integer a4 = e4.a();
        if (a4 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a4;
        i2 = ((Number) obj).intValue();
        return new C0610d(obj2 != null ? obj2.hashCode() : 0, i2, obj2);
    }
}
