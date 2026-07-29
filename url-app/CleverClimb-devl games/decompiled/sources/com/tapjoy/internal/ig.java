package com.tapjoy.internal;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ig {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f8373b;

    /* renamed from: c, reason: collision with root package name */
    private Cif f8374c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f8372a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f8375d = 0;

    public final ig a(byte[] bArr) {
        if (bArr != null) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f8373b = null;
            Arrays.fill(this.f8372a, (byte) 0);
            this.f8374c = new Cif();
            this.f8375d = 0;
            this.f8373b = wrap.asReadOnlyBuffer();
            this.f8373b.position(0);
            this.f8373b.order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.f8373b = null;
            this.f8374c.f8369b = 2;
        }
        return this;
    }

    public final Cif a() {
        if (this.f8373b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (h()) {
            return this.f8374c;
        }
        d();
        if (!h()) {
            b();
            if (this.f8374c.f8370c < 0) {
                this.f8374c.f8369b = 1;
            }
        }
        return this.f8374c;
    }

    private void b() {
        boolean z = false;
        while (!z && !h() && this.f8374c.f8370c <= Integer.MAX_VALUE) {
            int g = g();
            if (g == 33) {
                int g2 = g();
                if (g2 != 1) {
                    if (g2 == 249) {
                        this.f8374c.f8371d = new ie();
                        g();
                        int g3 = g();
                        this.f8374c.f8371d.g = (g3 & 28) >> 2;
                        if (this.f8374c.f8371d.g == 0) {
                            this.f8374c.f8371d.g = 1;
                        }
                        this.f8374c.f8371d.f = (g3 & 1) != 0;
                        short s = this.f8373b.getShort();
                        if (s < 2) {
                            s = 10;
                        }
                        this.f8374c.f8371d.i = s * 10;
                        this.f8374c.f8371d.h = g();
                        g();
                    } else {
                        switch (g2) {
                            case 254:
                                e();
                                break;
                            case 255:
                                f();
                                String str = "";
                                for (int i = 0; i < 11; i++) {
                                    str = str + ((char) this.f8372a[i]);
                                }
                                if (str.equals("NETSCAPE2.0")) {
                                    c();
                                    break;
                                } else {
                                    e();
                                    break;
                                }
                            default:
                                e();
                                break;
                        }
                    }
                } else {
                    e();
                }
            } else if (g == 44) {
                if (this.f8374c.f8371d == null) {
                    this.f8374c.f8371d = new ie();
                }
                this.f8374c.f8371d.f8364a = this.f8373b.getShort();
                this.f8374c.f8371d.f8365b = this.f8373b.getShort();
                this.f8374c.f8371d.f8366c = this.f8373b.getShort();
                this.f8374c.f8371d.f8367d = this.f8373b.getShort();
                int g4 = g();
                boolean z2 = (g4 & 128) != 0;
                int pow = (int) Math.pow(2.0d, (g4 & 7) + 1);
                this.f8374c.f8371d.e = (g4 & 64) != 0;
                if (z2) {
                    this.f8374c.f8371d.k = a(pow);
                } else {
                    this.f8374c.f8371d.k = null;
                }
                this.f8374c.f8371d.j = this.f8373b.position();
                g();
                e();
                if (!h()) {
                    this.f8374c.f8370c++;
                    this.f8374c.e.add(this.f8374c.f8371d);
                }
            } else if (g != 59) {
                this.f8374c.f8369b = 1;
            } else {
                z = true;
            }
        }
    }

    private void c() {
        do {
            f();
            if (this.f8372a[0] == 1) {
                this.f8374c.m = (this.f8372a[1] & 255) | ((this.f8372a[2] & 255) << 8);
                if (this.f8374c.m == 0) {
                    this.f8374c.m = -1;
                }
            }
            if (this.f8375d <= 0) {
                return;
            }
        } while (!h());
    }

    private void d() {
        String str = "";
        for (int i = 0; i < 6; i++) {
            str = str + ((char) g());
        }
        if (!str.startsWith("GIF")) {
            this.f8374c.f8369b = 1;
            return;
        }
        this.f8374c.f = this.f8373b.getShort();
        this.f8374c.g = this.f8373b.getShort();
        int g = g();
        this.f8374c.h = (g & 128) != 0;
        this.f8374c.i = 2 << (g & 7);
        this.f8374c.j = g();
        this.f8374c.k = g();
        if (!this.f8374c.h || h()) {
            return;
        }
        this.f8374c.f8368a = a(this.f8374c.i);
        this.f8374c.l = this.f8374c.f8368a[this.f8374c.j];
    }

    private int[] a(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.f8373b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException e) {
                    e = e;
                    new Object[1][0] = e;
                    this.f8374c.f8369b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException e2) {
            e = e2;
            iArr = null;
        }
        return iArr;
    }

    private void e() {
        int g;
        do {
            try {
                g = g();
                this.f8373b.position(this.f8373b.position() + g);
            } catch (IllegalArgumentException unused) {
                return;
            }
        } while (g > 0);
    }

    private int f() {
        this.f8375d = g();
        if (this.f8375d <= 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (i < this.f8375d) {
            try {
                i2 = this.f8375d - i;
                this.f8373b.get(this.f8372a, i, i2);
                i += i2;
            } catch (Exception e) {
                Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f8375d), e};
                this.f8374c.f8369b = 1;
                return i;
            }
        }
        return i;
    }

    private int g() {
        try {
            return this.f8373b.get() & 255;
        } catch (Exception unused) {
            this.f8374c.f8369b = 1;
            return 0;
        }
    }

    private boolean h() {
        return this.f8374c.f8369b != 0;
    }
}
