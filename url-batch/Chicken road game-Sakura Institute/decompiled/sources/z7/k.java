package z7;

import java.io.IOException;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class k extends v7.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f10171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f10172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f8.f f10173g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f10174h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i7, f8.f fVar, int i8, boolean z8) {
        super(str, true);
        this.f10171e = nVar;
        this.f10172f = i7;
        this.f10173g = fVar;
        this.f10174h = i8;
    }

    @Override // v7.a
    public final long a() {
        try {
            y yVar = this.f10171e.f10191p;
            f8.f fVar = this.f10173g;
            int i7 = this.f10174h;
            yVar.getClass();
            fVar.skip(i7);
            this.f10171e.B.w(this.f10172f, 9);
            synchronized (this.f10171e) {
                this.f10171e.D.remove(Integer.valueOf(this.f10172f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
