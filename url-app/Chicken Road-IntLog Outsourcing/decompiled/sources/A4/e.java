package A4;

import f4.InterfaceC0426c;
import java.util.Iterator;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93a;

    /* renamed from: b, reason: collision with root package name */
    public final f f94b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0426c f95c;

    /* JADX WARN: Multi-variable type inference failed */
    public e(f fVar, InterfaceC1441l transformer, int i2) {
        this.f93a = i2;
        switch (i2) {
            case 1:
                kotlin.jvm.internal.i.e(transformer, "transformer");
                this.f94b = fVar;
                this.f95c = transformer;
                break;
            default:
                kotlin.jvm.internal.i.e(transformer, "predicate");
                this.f94b = fVar;
                this.f95c = (kotlin.jvm.internal.j) transformer;
                break;
        }
    }

    @Override // A4.f
    public final Iterator iterator() {
        switch (this.f93a) {
            case 0:
                return new d(this);
            default:
                return new j(this);
        }
    }
}
