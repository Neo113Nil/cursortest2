package K;

import c3.C0297i;
import com.google.android.gms.internal.play_billing.AbstractC0347t0;
import f3.InterfaceC0425c;
import g3.EnumC0441a;
import java.util.List;

/* renamed from: K.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055d extends h3.g implements o3.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1338a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1340c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0055d(List list, InterfaceC0425c interfaceC0425c) {
        super(2, interfaceC0425c);
        this.f1340c = list;
    }

    @Override // h3.AbstractC0448a
    public final InterfaceC0425c create(Object obj, InterfaceC0425c interfaceC0425c) {
        C0055d c0055d = new C0055d(this.f1340c, interfaceC0425c);
        c0055d.f1339b = obj;
        return c0055d;
    }

    @Override // o3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0055d) create((C0062k) obj, (InterfaceC0425c) obj2)).invokeSuspend(C0297i.f5732a);
    }

    @Override // h3.AbstractC0448a
    public final Object invokeSuspend(Object obj) {
        EnumC0441a enumC0441a = EnumC0441a.f9038a;
        int i4 = this.f1338a;
        if (i4 == 0) {
            O3.l.w(obj);
            C0062k c0062k = (C0062k) this.f1339b;
            this.f1338a = 1;
            if (AbstractC0347t0.a(this.f1340c, c0062k, this) == enumC0441a) {
                return enumC0441a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            O3.l.w(obj);
        }
        return C0297i.f5732a;
    }
}
