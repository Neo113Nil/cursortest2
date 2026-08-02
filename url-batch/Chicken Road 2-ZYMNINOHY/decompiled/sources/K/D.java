package K;

import c3.C0297i;
import f3.InterfaceC0425c;
import g3.EnumC0441a;

/* loaded from: classes.dex */
public final class D extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public Object f1235a;

    /* renamed from: b, reason: collision with root package name */
    public int f1236b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f1237c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ M f1238d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1239e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(M m4, int i4, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1238d = m4;
        this.f1239e = i4;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        D d4 = new D(this.f1238d, this.f1239e, interfaceC0425c);
        d4.f1237c = ((Boolean) obj).booleanValue();
        return d4;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((D) create(bool, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // h3.AbstractC0448a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object obj2;
        int i4;
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i5 = this.f1236b;
        M m4 = this.f1238d;
        if (i5 == 0) {
            O3.l.w(obj);
            z = this.f1237c;
            this.f1237c = z;
            this.f1236b = 1;
            obj = m4.i(this);
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f1235a;
                O3.l.w(obj);
                i4 = ((Number) obj).intValue();
                return new C0054c(obj2 != null ? obj2.hashCode() : 0, i4, obj2);
            }
            z = this.f1237c;
            O3.l.w(obj);
        }
        if (!z) {
            obj2 = obj;
            i4 = this.f1239e;
            return new C0054c(obj2 != null ? obj2.hashCode() : 0, i4, obj2);
        }
        g0 g4 = m4.g();
        this.f1235a = obj;
        this.f1236b = 2;
        Integer a3 = g4.a();
        if (a3 != enumC0441a) {
            obj2 = obj;
            obj = a3;
            i4 = ((Number) obj).intValue();
            return new C0054c(obj2 != null ? obj2.hashCode() : 0, i4, obj2);
        }
        return enumC0441a;
    }
}
