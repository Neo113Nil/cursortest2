package n0;

import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v extends p1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6820b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6821c;

    public v() {
        super(new u(0));
        this.f6821c = new w();
    }

    @Override // n0.p1
    public final q1 a(Object obj) {
        switch (this.f6820b) {
            case 0:
                return new q1(this, obj, obj == null, null, true);
            default:
                return new q1(this, obj, obj == null, (e) this.f6821c, true);
        }
    }

    @Override // n0.p1
    public p2 b() {
        switch (this.f6820b) {
            case 0:
                return (w) this.f6821c;
            default:
                return super.b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Function0 function0) {
        super(function0);
        e eVar = e.f6663u;
        this.f6821c = eVar;
    }
}
