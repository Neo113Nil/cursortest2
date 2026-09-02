package E5;

import Z1.c;
import java.util.Iterator;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f696a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0743l f697b;

    /* renamed from: c, reason: collision with root package name */
    public final f f698c;

    public e(h hVar, c.b predicate) {
        kotlin.jvm.internal.i.e(predicate, "predicate");
        this.f698c = hVar;
        this.f697b = predicate;
    }

    @Override // E5.f
    public final Iterator iterator() {
        switch (this.f696a) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }

    public e(f fVar, InterfaceC0743l transformer) {
        kotlin.jvm.internal.i.e(transformer, "transformer");
        this.f698c = fVar;
        this.f697b = transformer;
    }
}
