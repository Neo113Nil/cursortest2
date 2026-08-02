package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.IdentityHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kdw {
    public Object a;
    public Object b;

    public kdw(byte[] bArr) {
        this.b = null;
        this.a = hxc.b;
    }

    public final jwt a() {
        if (this.b != null) {
            this.a = new jwt((IdentityHashMap) this.b);
            this.b = null;
        }
        return (jwt) this.a;
    }

    public final IdentityHashMap b(int i) {
        if (this.b == null) {
            Object obj = this.a;
            jwt jwtVar = jwt.a;
            IdentityHashMap identityHashMap = new IdentityHashMap(((jwt) obj).b.size() + i);
            this.b = identityHashMap;
            identityHashMap.putAll(((jwt) this.a).b);
            this.a = null;
        }
        return (IdentityHashMap) this.b;
    }

    public final void c(jws jwsVar, Object obj) {
        b(1).put(jwsVar, obj);
    }

    public final hxd d() {
        Object obj = this.b;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a != null) {
            return new hxd(((Integer) obj).intValue(), (hxc) this.a);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public final void e(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.b = Integer.valueOf(i);
    }

    public kdw(jwt jwtVar) {
        this.a = jwtVar;
    }
}
