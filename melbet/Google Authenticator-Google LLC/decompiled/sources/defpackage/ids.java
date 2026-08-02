package defpackage;

import android.content.Intent;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ids {
    public Object a;
    public Object b;
    public Object c;
    public Object d;

    public ids(byte[] bArr) {
        this.b = null;
        this.c = null;
        this.d = null;
        this.a = hzh.d;
    }

    public static String l(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.concurrent.ThreadFactory] */
    public static ThreadFactory p(ids idsVar) {
        Object obj = idsVar.d;
        Object obj2 = idsVar.c;
        Object obj3 = idsVar.a;
        Object obj4 = idsVar.b;
        Object obj5 = obj4;
        if (obj4 == null) {
            obj5 = Executors.defaultThreadFactory();
        }
        return new hvx(obj5, (String) obj, obj != null ? new AtomicLong(0L) : null, (Boolean) obj2, (Integer) obj3);
    }

    public final hzi a() {
        Object obj = this.b;
        if (obj == null) {
            throw new GeneralSecurityException("key size is not set");
        }
        if (this.c == null) {
            throw new GeneralSecurityException("tag size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("hash type is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("variant is not set");
        }
        ((Integer) obj).intValue();
        Integer num = (Integer) this.c;
        int intValue = num.intValue();
        Object obj2 = this.d;
        if (obj2 == hzg.a) {
            if (intValue > 20) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", num));
            }
        } else if (obj2 == hzg.b) {
            if (intValue > 28) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", num));
            }
        } else if (obj2 == hzg.c) {
            if (intValue > 32) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", num));
            }
        } else if (obj2 == hzg.d) {
            if (intValue > 48) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", num));
            }
        } else if (obj2 != hzg.e) {
            throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
        }
        return new hzi(((Integer) this.b).intValue(), ((Integer) this.c).intValue(), (hzh) this.a, (hzg) this.d);
    }

    public final void b(int i) {
        this.b = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }

    public final hwz d() {
        Object obj = this.c;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = ((Integer) obj).intValue();
        ((Integer) this.b).intValue();
        ((Integer) this.d).intValue();
        return new hwz(intValue, (hwy) this.a);
    }

    public final void e() {
        this.b = 12;
    }

    public final void f(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void g() {
        this.d = 16;
    }

    public final hwu h() {
        Object obj = this.c;
        if (obj == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.b == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.a == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.d == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int intValue = ((Integer) obj).intValue();
        ((Integer) this.b).intValue();
        ((Integer) this.d).intValue();
        return new hwu(intValue, (hwt) this.a);
    }

    public final void i() {
        this.b = 16;
    }

    public final void j(int i) {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.c = Integer.valueOf(i);
    }

    public final void k() {
        this.d = 16;
    }

    public final void m(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    public final void n(String str) {
        l(str, 0);
        this.d = str;
    }

    public final void o(int i, String str, Intent intent) {
        if (this.a == null) {
            int i2 = hel.d;
            this.a = new heg(4);
        }
        ((heg) this.a).h(new gny(i, str, intent));
    }

    public ids(byte[] bArr, byte[] bArr2) {
        this.c = null;
        this.b = null;
        this.d = null;
        this.a = hwt.b;
    }

    public ids(char[] cArr) {
        this.c = null;
        this.b = null;
        this.d = null;
        this.a = hwy.b;
    }

    public ids(char[] cArr, byte[] bArr) {
        this.d = null;
        this.c = null;
        this.a = null;
        this.b = null;
    }
}
