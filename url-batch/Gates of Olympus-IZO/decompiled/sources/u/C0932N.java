package u;

import java.util.Map;

/* renamed from: u.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0932N extends Z1.j implements Y1.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ R.k f8029f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0932N(R.k kVar, int i3) {
        super(1);
        this.f8028e = i3;
        this.f8029f = kVar;
    }

    @Override // Y1.c
    public final Object j(Object obj) {
        switch (this.f8028e) {
            case 0:
                R.k kVar = this.f8029f;
                return Boolean.valueOf(kVar != null ? kVar.c(obj) : true);
            default:
                return new P(this.f8029f, (Map) obj);
        }
    }
}
