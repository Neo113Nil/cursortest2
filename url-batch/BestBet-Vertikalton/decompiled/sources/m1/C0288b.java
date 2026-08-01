package m1;

import java.util.Random;
import k1.e;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288b extends AbstractC0287a {

    /* renamed from: c, reason: collision with root package name */
    public final E1.c f3538c = new E1.c(1);

    @Override // m1.AbstractC0287a
    public final Random a() {
        Object obj = this.f3538c.get();
        e.d(obj, "get(...)");
        return (Random) obj;
    }
}
