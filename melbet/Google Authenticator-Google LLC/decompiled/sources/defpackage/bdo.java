package defpackage;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bdo implements bbh {
    private final Object b;
    private final int c;
    private final int d;
    private final Class e;
    private final Class f;
    private final bbh g;
    private final Map h;
    private final bbl i;
    private int j;

    public bdo(Object obj, bbh bbhVar, int i, int i2, Map map, Class cls, Class cls2, bbl bblVar) {
        a.v(obj, "Argument must not be null");
        this.b = obj;
        a.v(bbhVar, "Signature must not be null");
        this.g = bbhVar;
        this.c = i;
        this.d = i2;
        a.v(map, "Argument must not be null");
        this.h = map;
        a.v(cls, "Resource class must not be null");
        this.e = cls;
        this.f = cls2;
        a.v(bblVar, "Argument must not be null");
        this.i = bblVar;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bdo) {
            bdo bdoVar = (bdo) obj;
            if (this.b.equals(bdoVar.b) && this.g.equals(bdoVar.g) && this.d == bdoVar.d && this.c == bdoVar.c && this.h.equals(bdoVar.h) && this.e.equals(bdoVar.e) && this.f.equals(bdoVar.f) && this.i.equals(bdoVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        int i = this.j;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.j = hashCode;
        int hashCode2 = (((((hashCode * 31) + this.g.hashCode()) * 31) + this.c) * 31) + this.d;
        this.j = hashCode2;
        int hashCode3 = (hashCode2 * 31) + this.h.hashCode();
        this.j = hashCode3;
        int hashCode4 = (hashCode3 * 31) + this.e.hashCode();
        this.j = hashCode4;
        int hashCode5 = (hashCode4 * 31) + this.f.hashCode();
        this.j = hashCode5;
        int hashCode6 = (hashCode5 * 31) + this.i.hashCode();
        this.j = hashCode6;
        return hashCode6;
    }

    public final String toString() {
        bbl bblVar = this.i;
        Map map = this.h;
        bbh bbhVar = this.g;
        Class cls = this.f;
        Class cls2 = this.e;
        return "EngineKey{model=" + this.b.toString() + ", width=" + this.c + ", height=" + this.d + ", resourceClass=" + cls2.toString() + ", transcodeClass=" + cls.toString() + ", signature=" + bbhVar.toString() + ", hashCode=" + this.j + ", transformations=" + map.toString() + ", options=" + bblVar.toString() + "}";
    }
}
