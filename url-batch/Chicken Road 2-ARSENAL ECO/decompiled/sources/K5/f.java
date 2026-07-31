package K5;

import com.onesignal.core.activities.PermissionsActivity;
import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import u0.AbstractC0676f;
import x5.InterfaceC0748q;

/* loaded from: classes.dex */
public final class f extends q5.g implements InterfaceC0748q {

    /* renamed from: f, reason: collision with root package name */
    public int f1398f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ d f1399g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f1400h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ PermissionsActivity.b.a f1401i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(PermissionsActivity.b.a aVar, InterfaceC0564d interfaceC0564d) {
        super(3, interfaceC0564d);
        this.f1401i = aVar;
    }

    @Override // x5.InterfaceC0748q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        f fVar = new f(this.f1401i, (InterfaceC0564d) obj3);
        fVar.f1399g = (d) obj;
        fVar.f1400h = obj2;
        return fVar.invokeSuspend(v.f5219a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r1.a(r5, r4) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r5 == r0) goto L15;
     */
    @Override // q5.AbstractC0605a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        d dVar;
        EnumC0580a enumC0580a = EnumC0580a.f5697f;
        int i7 = this.f1398f;
        if (i7 == 0) {
            AbstractC0676f.w(obj);
            dVar = this.f1399g;
            Object obj2 = this.f1400h;
            this.f1399g = dVar;
            this.f1398f = 1;
            obj = this.f1401i.invoke(obj2, this);
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0676f.w(obj);
                return v.f5219a;
            }
            dVar = this.f1399g;
            AbstractC0676f.w(obj);
        }
        this.f1399g = null;
        this.f1398f = 2;
    }
}
