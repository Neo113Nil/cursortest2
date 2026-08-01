package a3;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f75a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f76b;

    public /* synthetic */ e(int i4, Object obj) {
        this.f75a = i4;
        this.f76b = obj;
    }

    @Override // a3.f
    public final Iterator iterator() {
        switch (this.f75a) {
            case 0:
                return new d(this);
            default:
                return ((List) this.f76b).iterator();
        }
    }
}
