package P;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class G extends X5.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public Object f1978d;

    /* renamed from: e, reason: collision with root package name */
    public int f1979e;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ boolean f1980i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Q f1981l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1982m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(Q q4, int i2, V5.b bVar) {
        super(2, bVar);
        this.f1981l = q4;
        this.f1982m = i2;
    }

    @Override // X5.a
    public final V5.b create(Object obj, V5.b bVar) {
        G g7 = new G(this.f1981l, this.f1982m, bVar);
        g7.f1980i = ((Boolean) obj).booleanValue();
        return g7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((G) create(bool, (V5.b) obj2)).invokeSuspend(Unit.f6114a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // X5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z7;
        Object obj2;
        int i2;
        W5.a aVar = W5.a.f2787d;
        int i5 = this.f1979e;
        Q q4 = this.f1981l;
        if (i5 == 0) {
            V6.b.P(obj);
            z7 = this.f1980i;
            this.f1980i = z7;
            this.f1979e = 1;
            obj = q4.i(this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f1978d;
                V6.b.P(obj);
                i2 = ((Number) obj).intValue();
                return new C0139d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
            }
            z7 = this.f1980i;
            V6.b.P(obj);
        }
        if (!z7) {
            obj2 = obj;
            i2 = this.f1982m;
            return new C0139d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        l0 g7 = q4.g();
        this.f1978d = obj;
        this.f1979e = 2;
        Integer a7 = g7.a();
        if (a7 != aVar) {
            obj2 = obj;
            obj = a7;
            i2 = ((Number) obj).intValue();
            return new C0139d(obj2, obj2 != null ? obj2.hashCode() : 0, i2);
        }
        return aVar;
    }
}
