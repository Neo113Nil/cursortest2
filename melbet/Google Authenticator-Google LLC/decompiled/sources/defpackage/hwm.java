package defpackage;

import android.content.Context;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hwm {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public hwm() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = hwo.b;
    }

    public final hwp a() {
        if (this.a == null) {
            throw new GeneralSecurityException("AES key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("iv size is not set");
        }
        Object obj = this.d;
        if (obj == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.e == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.f == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        Integer num = (Integer) obj;
        int intValue = num.intValue();
        Object obj2 = this.e;
        if (obj2 == hwn.a) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (obj2 == hwn.b) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (obj2 != hwn.c && obj2 != hwn.d && obj2 != hwn.e) {
            throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
        }
        int intValue2 = ((Integer) this.a).intValue();
        ((Integer) this.b).intValue();
        ((Integer) this.c).intValue();
        return new hwp(intValue2, ((Integer) this.d).intValue(), (hwo) this.f, (hwn) this.e);
    }

    public final void b(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.a = Integer.valueOf(i);
    }

    public final void c() {
        this.b = 32;
    }

    public final void d() {
        this.c = 16;
    }

    public final void e(int i) {
        this.d = Integer.valueOf(i);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [hac, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [hac, java.lang.Object] */
    public final etd f() {
        this.f.getClass();
        if (this.c == null) {
            this.c = etd.b;
        }
        if (this.b == null) {
            this.b = etd.c((Context) this.f);
        }
        if (this.a == null) {
            this.a = new eks(this, 16);
        }
        if (this.d == null) {
            Object obj = this.f;
            AtomicReference atomicReference = etd.a;
            ArrayList arrayList = new ArrayList();
            Collections.addAll(arrayList, new fat(new gwh((Context) obj, (byte[]) null)), new faw());
            this.d = hoq.v(new eks(arrayList, 14));
        }
        if (this.e == null) {
            this.e = new eks(this, 17);
        }
        return new etd((Context) this.f, this.c, this.b, this.a, this.d, this.e);
    }

    public hwm(byte[] bArr) {
    }
}
