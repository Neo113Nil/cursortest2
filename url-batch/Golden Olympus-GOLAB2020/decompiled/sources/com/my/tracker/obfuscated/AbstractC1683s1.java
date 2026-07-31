package com.my.tracker.obfuscated;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import kotlin.KotlinVersion;

/* renamed from: com.my.tracker.obfuscated.s1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1683s1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Charset f21526b = StandardCharsets.UTF_8;

    /* renamed from: a, reason: collision with root package name */
    protected final OutputStream f21527a;

    public AbstractC1683s1(OutputStream outputStream) {
        this.f21527a = outputStream;
    }

    public int a(int i4, double d4) {
        return b(i4, 1) + a(d4);
    }

    public int b(byte[] bArr) {
        this.f21527a.write(bArr);
        return bArr.length;
    }

    private int b(int i4, int i5) {
        return a((i4 << 3) | i5);
    }

    public int a(int i4, float f4) {
        return b(i4, 5) + a(f4);
    }

    private int b(int i4) {
        return i4 < 0 ? a(i4) : a(i4);
    }

    public int a(int i4, int i5) {
        return b(i4, 0) + b(i5);
    }

    public int a(int i4, long j4) {
        return b(i4, 0) + a(j4);
    }

    public int a(int i4, r rVar) {
        if (rVar == null) {
            return 0;
        }
        int b4 = b(i4, 2);
        int b5 = rVar.b();
        int b6 = b4 + b(b5) + b5;
        rVar.a(this.f21527a);
        return b6;
    }

    public int a(int i4, String str) {
        if (str == null) {
            return 0;
        }
        return b(i4, 2) + a(str.getBytes(f21526b));
    }

    public int a(int i4, byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return b(i4, 2) + a(bArr);
    }

    private int a(byte[] bArr) {
        int b4 = b(bArr.length) + bArr.length;
        this.f21527a.write(bArr);
        return b4;
    }

    public int a(int i4, Map map, r rVar) {
        int i5 = 0;
        if (map != null && !map.isEmpty()) {
            Iterator it = new TreeSet(map.keySet()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                rVar.a();
                rVar.a(1, str);
                rVar.a(2, (String) map.get(str));
                if (rVar.b() > 0) {
                    i5 += a(i4, rVar);
                }
            }
        }
        return i5;
    }

    private int a(int i4) {
        int i5 = 0;
        while (true) {
            i5++;
            if ((i4 & (-128)) == 0) {
                this.f21527a.write(i4);
                return i5;
            }
            this.f21527a.write((i4 & 127) | UserVerificationMethods.USER_VERIFY_PATTERN);
            i4 >>>= 7;
        }
    }

    private int a(long j4) {
        int i4 = 0;
        while (true) {
            i4++;
            if (((-128) & j4) == 0) {
                this.f21527a.write((int) j4);
                return i4;
            }
            this.f21527a.write(((int) (127 & j4)) | UserVerificationMethods.USER_VERIFY_PATTERN);
            j4 >>>= 7;
        }
    }

    public int a(int i4, String[] strArr) {
        if (strArr == null) {
            return 0;
        }
        int i5 = 0;
        for (String str : strArr) {
            i5 += a(i4, str);
        }
        return i5;
    }

    private int a(double d4) {
        long doubleToRawLongBits = Double.doubleToRawLongBits(d4);
        this.f21527a.write(((int) doubleToRawLongBits) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write(((int) (doubleToRawLongBits >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 8;
    }

    private int a(float f4) {
        int floatToRawIntBits = Float.floatToRawIntBits(f4);
        this.f21527a.write(floatToRawIntBits & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write((floatToRawIntBits >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write((floatToRawIntBits >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f21527a.write((floatToRawIntBits >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
        return 4;
    }
}
