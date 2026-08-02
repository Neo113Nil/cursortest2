package K;

import b2.C0195i;
import d2.InterfaceC0300c;
import e2.EnumC0317a;

/* loaded from: classes.dex */
public final class F extends f2.i implements l2.p {

    /* renamed from: e, reason: collision with root package name */
    public Object f669e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ N f671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(N n3, int i3, InterfaceC0300c interfaceC0300c) {
        super(2, interfaceC0300c);
        this.f671h = n3;
        this.f672i = i3;
    }

    @Override // f2.AbstractC0324a
    public final InterfaceC0300c b(InterfaceC0300c interfaceC0300c, Object obj) {
        F f = new F(this.f671h, this.f672i, interfaceC0300c);
        f.f670g = ((Boolean) obj).booleanValue();
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // f2.AbstractC0324a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        boolean z;
        Object obj2;
        int i3;
        EnumC0317a enumC0317a = EnumC0317a.f4969a;
        int i4 = this.f;
        N n3 = this.f671h;
        if (i4 == 0) {
            android.support.v4.media.session.a.T(obj);
            z = this.f670g;
            this.f670g = z;
            this.f = 1;
            obj = n3.i(this);
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f669e;
                android.support.v4.media.session.a.T(obj);
                i3 = ((Number) obj).intValue();
                return new C0039c(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
            }
            z = this.f670g;
            android.support.v4.media.session.a.T(obj);
        }
        if (!z) {
            obj2 = obj;
            i3 = this.f672i;
            return new C0039c(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
        }
        h0 g3 = n3.g();
        this.f669e = obj;
        this.f = 2;
        Integer a3 = g3.a();
        if (a3 != enumC0317a) {
            obj2 = obj;
            obj = a3;
            i3 = ((Number) obj).intValue();
            return new C0039c(obj2 != null ? obj2.hashCode() : 0, i3, obj2);
        }
        return enumC0317a;
    }

    @Override // l2.p
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((F) b((InterfaceC0300c) obj2, bool)).g(C0195i.f2555a);
    }
}
