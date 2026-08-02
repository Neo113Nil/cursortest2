package v1;

import E.AbstractC0005f;
import i2.AbstractC0457a;
import kotlin.jvm.internal.i;
import o3.InterfaceC1339l;

/* loaded from: classes.dex */
public final class g extends AbstractC0457a {

    /* renamed from: k, reason: collision with root package name */
    public final Object f15548k;

    /* renamed from: l, reason: collision with root package name */
    public final int f15549l;

    /* renamed from: m, reason: collision with root package name */
    public final C1451a f15550m;

    public g(Object value, int i4, C1451a c1451a) {
        i.e(value, "value");
        AbstractC0005f.t(i4, "verificationMode");
        this.f15548k = value;
        this.f15549l = i4;
        this.f15550m = c1451a;
    }

    @Override // i2.AbstractC0457a
    public final Object g() {
        return this.f15548k;
    }

    @Override // i2.AbstractC0457a
    public final AbstractC0457a z(String str, InterfaceC1339l interfaceC1339l) {
        Object obj = this.f15548k;
        return ((Boolean) interfaceC1339l.invoke(obj)).booleanValue() ? this : new f(obj, str, this.f15550m, this.f15549l);
    }
}
