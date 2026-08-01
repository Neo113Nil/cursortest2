package defpackage;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class x00 {
    public pp a;
    public dy b;
    public String d;
    public kn e;
    public a10 g;
    public y00 h;
    public y00 i;
    public y00 j;
    public long k;
    public long l;
    public gi m;
    public int c = -1;
    public j1 f = new j1(21);

    public static void b(y00 y00Var, String str) {
        if (y00Var != null) {
            if (y00Var.l != null) {
                o8.e(str.concat(".body != null"));
                return;
            }
            if (y00Var.m != null) {
                o8.e(str.concat(".networkResponse != null"));
            } else if (y00Var.n != null) {
                o8.e(str.concat(".cacheResponse != null"));
            } else {
                if (y00Var.o == null) {
                    return;
                }
                o8.e(str.concat(".priorResponse != null"));
            }
        }
    }

    public final y00 a() {
        int i = this.c;
        if (i < 0) {
            o8.k("code < 0: ", this.c);
            return null;
        }
        pp ppVar = this.a;
        if (ppVar == null) {
            o8.t("request == null");
            return null;
        }
        dy dyVar = this.b;
        if (dyVar == null) {
            o8.t("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new y00(ppVar, dyVar, str, i, this.e, this.f.u(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
        }
        o8.t("message == null");
        return null;
    }
}
