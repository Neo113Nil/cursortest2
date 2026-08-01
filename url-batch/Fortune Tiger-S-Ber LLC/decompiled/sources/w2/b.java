package w2;

import java.util.Random;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class b extends a {
    public final h3.c g = new h3.c(1);

    @Override // w2.a
    public final Random a() {
        Object obj = this.g.get();
        u2.c.d(obj, "get(...)");
        return (Random) obj;
    }
}
