package I5;

import k5.v;
import kotlin.jvm.internal.j;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class d extends j implements InterfaceC0743l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f1223f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ A.a f1224g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, A.a aVar) {
        super(1);
        this.f1223f = eVar;
        this.f1224g = aVar;
    }

    @Override // x5.InterfaceC0743l
    public final Object invoke(Object obj) {
        this.f1223f.f1225h.removeCallbacks(this.f1224g);
        return v.f5219a;
    }
}
