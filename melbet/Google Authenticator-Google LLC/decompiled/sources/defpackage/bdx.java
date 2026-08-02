package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bdx implements bbh {
    private static final bme b = new bme(50);
    private final bbh c;
    private final bbh d;
    private final int e;
    private final int f;
    private final Class g;
    private final bbl h;
    private final bbp i;
    private final bek j;

    public bdx(bek bekVar, bbh bbhVar, bbh bbhVar2, int i, int i2, bbp bbpVar, Class cls, bbl bblVar) {
        this.j = bekVar;
        this.c = bbhVar;
        this.d = bbhVar2;
        this.e = i;
        this.f = i2;
        this.i = bbpVar;
        this.g = cls;
        this.h = bblVar;
    }

    @Override // defpackage.bbh
    public final void a(MessageDigest messageDigest) {
        bek bekVar = this.j;
        byte[] bArr = (byte[]) bekVar.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        bbp bbpVar = this.i;
        if (bbpVar != null) {
            bbpVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        bme bmeVar = b;
        byte[] bArr2 = (byte[]) bmeVar.f(cls);
        if (bArr2 == null) {
            bArr2 = cls.getName().getBytes(a);
            bmeVar.g(cls, bArr2);
        }
        messageDigest.update(bArr2);
        bekVar.c(bArr);
    }

    @Override // defpackage.bbh
    public final boolean equals(Object obj) {
        if (obj instanceof bdx) {
            bdx bdxVar = (bdx) obj;
            if (this.f == bdxVar.f && this.e == bdxVar.e) {
                bbp bbpVar = this.i;
                bbp bbpVar2 = bdxVar.i;
                char[] cArr = bmi.a;
                if (iwo.b(bbpVar, bbpVar2) && this.g.equals(bdxVar.g) && this.c.equals(bdxVar.c) && this.d.equals(bdxVar.d) && this.h.equals(bdxVar.h)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.bbh
    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        bbp bbpVar = this.i;
        int i = (((hashCode * 31) + this.e) * 31) + this.f;
        if (bbpVar != null) {
            i = (i * 31) + bbpVar.hashCode();
        }
        return (((i * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        bbl bblVar = this.h;
        bbp bbpVar = this.i;
        Class cls = this.g;
        bbh bbhVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(bbhVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(bbpVar) + "', options=" + String.valueOf(bblVar) + "}";
    }
}
