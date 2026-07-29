package com.tapjoy.internal;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: classes2.dex */
public final class el {

    /* renamed from: a, reason: collision with root package name */
    final iu f8007a;

    /* renamed from: d, reason: collision with root package name */
    private int f8010d;
    private eh h;

    /* renamed from: b, reason: collision with root package name */
    private long f8008b = 0;

    /* renamed from: c, reason: collision with root package name */
    private long f8009c = Long.MAX_VALUE;
    private int e = 2;
    private int f = -1;
    private long g = -1;

    public el(iu iuVar) {
        this.f8007a = iuVar;
    }

    public final long a() {
        if (this.e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i = this.f8010d + 1;
        this.f8010d = i;
        if (i > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.g;
        this.g = -1L;
        this.e = 6;
        return j;
    }

    public final void a(long j) {
        if (this.e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i = this.f8010d - 1;
        this.f8010d = i;
        if (i < 0 || this.g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f8008b != this.f8009c && this.f8010d != 0) {
            throw new IOException("Expected to end at " + this.f8009c + " but was " + this.f8008b);
        }
        this.f8009c = j;
    }

    public final int b() {
        if (this.e == 7) {
            this.e = 2;
            return this.f;
        }
        if (this.e != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f8008b < this.f8009c && !this.f8007a.b()) {
            int i = i();
            if (i == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            this.f = i >> 3;
            int i2 = i & 7;
            switch (i2) {
                case 0:
                    this.h = eh.VARINT;
                    this.e = 0;
                    return this.f;
                case 1:
                    this.h = eh.FIXED64;
                    this.e = 1;
                    return this.f;
                case 2:
                    this.h = eh.LENGTH_DELIMITED;
                    this.e = 2;
                    int i3 = i();
                    if (i3 < 0) {
                        throw new ProtocolException("Negative length: " + i3);
                    }
                    if (this.g != -1) {
                        throw new IllegalStateException();
                    }
                    this.g = this.f8009c;
                    this.f8009c = this.f8008b + i3;
                    if (this.f8009c > this.g) {
                        throw new EOFException();
                    }
                    return this.f;
                case 3:
                    a(this.f);
                case 4:
                    throw new ProtocolException("Unexpected end group");
                case 5:
                    this.h = eh.FIXED32;
                    this.e = 5;
                    return this.f;
                default:
                    throw new ProtocolException("Unexpected field encoding: " + i2);
            }
        }
        return -1;
    }

    public final eh c() {
        return this.h;
    }

    private void a(int i) {
        while (this.f8008b < this.f8009c && !this.f8007a.b()) {
            int i2 = i();
            if (i2 == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i3 = i2 >> 3;
            int i4 = i2 & 7;
            switch (i4) {
                case 0:
                    this.e = 0;
                    e();
                    break;
                case 1:
                    this.e = 1;
                    g();
                    break;
                case 2:
                    long i5 = i();
                    this.f8008b += i5;
                    this.f8007a.d(i5);
                    break;
                case 3:
                    a(i3);
                    break;
                case 4:
                    if (i3 != i) {
                        throw new ProtocolException("Unexpected end group");
                    }
                    return;
                case 5:
                    this.e = 5;
                    f();
                    break;
                default:
                    throw new ProtocolException("Unexpected field encoding: " + i4);
            }
        }
        throw new EOFException();
    }

    public final int d() {
        if (this.e != 0 && this.e != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.e);
        }
        int i = i();
        b(0);
        return i;
    }

    private int i() {
        this.f8008b++;
        byte c2 = this.f8007a.c();
        if (c2 >= 0) {
            return c2;
        }
        int i = c2 & Byte.MAX_VALUE;
        this.f8008b++;
        byte c3 = this.f8007a.c();
        if (c3 >= 0) {
            return i | (c3 << 7);
        }
        int i2 = i | ((c3 & Byte.MAX_VALUE) << 7);
        this.f8008b++;
        byte c4 = this.f8007a.c();
        if (c4 >= 0) {
            return i2 | (c4 << com.umeng.commonsdk.proguard.ao.l);
        }
        int i3 = i2 | ((c4 & Byte.MAX_VALUE) << 14);
        this.f8008b++;
        byte c5 = this.f8007a.c();
        if (c5 >= 0) {
            return i3 | (c5 << 21);
        }
        int i4 = i3 | ((c5 & Byte.MAX_VALUE) << 21);
        this.f8008b++;
        byte c6 = this.f8007a.c();
        int i5 = i4 | (c6 << 28);
        if (c6 >= 0) {
            return i5;
        }
        for (int i6 = 0; i6 < 5; i6++) {
            this.f8008b++;
            if (this.f8007a.c() >= 0) {
                return i5;
            }
        }
        throw new ProtocolException("Malformed VARINT");
    }

    public final long e() {
        if (this.e != 0 && this.e != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.e);
        }
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            this.f8008b++;
            j |= (r1 & Byte.MAX_VALUE) << i;
            if ((this.f8007a.c() & 128) == 0) {
                b(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final int f() {
        if (this.e != 5 && this.e != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.e);
        }
        this.f8007a.a(4L);
        this.f8008b += 4;
        int e = this.f8007a.e();
        b(5);
        return e;
    }

    public final long g() {
        if (this.e != 1 && this.e != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.e);
        }
        this.f8007a.a(8L);
        this.f8008b += 8;
        long f = this.f8007a.f();
        b(1);
        return f;
    }

    private void b(int i) {
        if (this.e == i) {
            this.e = 6;
            return;
        }
        if (this.f8008b > this.f8009c) {
            throw new IOException("Expected to end at " + this.f8009c + " but was " + this.f8008b);
        }
        if (this.f8008b == this.f8009c) {
            this.f8009c = this.g;
            this.g = -1L;
            this.e = 6;
            return;
        }
        this.e = 7;
    }

    final long h() {
        if (this.e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.e);
        }
        long j = this.f8009c - this.f8008b;
        this.f8007a.a(j);
        this.e = 6;
        this.f8008b = this.f8009c;
        this.f8009c = this.g;
        this.g = -1L;
        return j;
    }
}
