package d0;

import E1.AbstractC0033i;
import kotlin.jvm.internal.j;
import l2.l;

/* loaded from: classes.dex */
public final class g extends S0.a {

    /* renamed from: i, reason: collision with root package name */
    public final Object f4922i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4923j;

    /* renamed from: k, reason: collision with root package name */
    public final C0294a f4924k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Object value, int i3, C0294a c0294a) {
        super(15);
        j.e(value, "value");
        AbstractC0033i.n(i3, "verificationMode");
        this.f4922i = value;
        this.f4923j = i3;
        this.f4924k = c0294a;
    }

    @Override // S0.a
    public final S0.a B(String str, l lVar) {
        Object obj = this.f4922i;
        return ((Boolean) lVar.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f4924k, this.f4923j);
    }

    @Override // S0.a
    public final Object b() {
        return this.f4922i;
    }
}
