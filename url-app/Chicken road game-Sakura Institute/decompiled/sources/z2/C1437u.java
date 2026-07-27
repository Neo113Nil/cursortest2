package z2;

import java.util.Iterator;
import kotlin.sequences.Sequence;

/* renamed from: z2.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1437u implements Sequence {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11959a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11960b;

    public /* synthetic */ C1437u(int i2, Object obj) {
        this.f11959a = i2;
        this.f11960b = obj;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        switch (this.f11959a) {
            case 0:
                return M2.J.f((Object[]) this.f11960b);
            default:
                return ((Iterable) this.f11960b).iterator();
        }
    }
}
