package l1;

import j1.h;
import java.util.Random;

/* renamed from: l1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0209b extends AbstractC0208a {

    /* renamed from: c, reason: collision with root package name */
    public final E1.c f3268c = new E1.c(1);

    @Override // l1.AbstractC0208a
    public final Random c() {
        Object obj = this.f3268c.get();
        h.d(obj, "get(...)");
        return (Random) obj;
    }
}
