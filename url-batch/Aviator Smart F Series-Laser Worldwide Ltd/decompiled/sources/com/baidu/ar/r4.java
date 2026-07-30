package com.baidu.ar;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class r4 implements q4 {

    /* renamed from: b, reason: collision with root package name */
    public t9 f3037b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f3038c = n1.a();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3036a = true;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3039d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3040e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3041f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3042g = false;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3043a;

        static {
            int[] iArr = new int[t9.values().length];
            f3043a = iArr;
            try {
                iArr[t9.PING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3043a[t9.PONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3043a[t9.TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3043a[t9.BINARY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3043a[t9.CLOSING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3043a[t9.CONTINUOUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public r4(t9 t9Var) {
        this.f3037b = t9Var;
    }

    public static r4 a(t9 t9Var) {
        if (t9Var == null) {
            throw new IllegalArgumentException("Supplied opcode cannot be null");
        }
        switch (a.f3043a[t9Var.ordinal()]) {
            case 1:
                return new ea();
            case 2:
                return new ga();
            case 3:
                return new rc();
            case 4:
                return new j1();
            case 5:
                return new c2();
            case 6:
                return new p2();
            default:
                throw new IllegalArgumentException("Supplied opcode is invalid");
        }
    }

    public void b(boolean z7) {
        this.f3040e = z7;
    }

    public void c(boolean z7) {
        this.f3041f = z7;
    }

    public void d(boolean z7) {
        this.f3042g = z7;
    }

    public void e(boolean z7) {
        this.f3039d = z7;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        r4 r4Var = (r4) obj;
        if (this.f3036a != r4Var.f3036a || this.f3039d != r4Var.f3039d || this.f3040e != r4Var.f3040e || this.f3041f != r4Var.f3041f || this.f3042g != r4Var.f3042g || this.f3037b != r4Var.f3037b) {
            return false;
        }
        ByteBuffer byteBuffer = this.f3038c;
        ByteBuffer byteBuffer2 = r4Var.f3038c;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    @Override // com.baidu.ar.q4
    public ByteBuffer f() {
        return this.f3038c;
    }

    public abstract void g();

    public int hashCode() {
        int hashCode = (((this.f3036a ? 1 : 0) * 31) + this.f3037b.hashCode()) * 31;
        ByteBuffer byteBuffer = this.f3038c;
        return ((((((((hashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.f3039d ? 1 : 0)) * 31) + (this.f3040e ? 1 : 0)) * 31) + (this.f3041f ? 1 : 0)) * 31) + (this.f3042g ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Framedata{ optcode:");
        sb.append(a());
        sb.append(", fin:");
        sb.append(d());
        sb.append(", rsv1:");
        sb.append(b());
        sb.append(", rsv2:");
        sb.append(e());
        sb.append(", rsv3:");
        sb.append(c());
        sb.append(", payloadlength:[pos:");
        sb.append(this.f3038c.position());
        sb.append(", len:");
        sb.append(this.f3038c.remaining());
        sb.append("], payload:");
        sb.append(this.f3038c.remaining() > 1000 ? "(too big to display)" : new String(this.f3038c.array()));
        sb.append('}');
        return sb.toString();
    }

    @Override // com.baidu.ar.q4
    public t9 a() {
        return this.f3037b;
    }

    @Override // com.baidu.ar.q4
    public boolean b() {
        return this.f3040e;
    }

    @Override // com.baidu.ar.q4
    public boolean c() {
        return this.f3042g;
    }

    @Override // com.baidu.ar.q4
    public boolean d() {
        return this.f3036a;
    }

    @Override // com.baidu.ar.q4
    public boolean e() {
        return this.f3041f;
    }

    public void a(ByteBuffer byteBuffer) {
        this.f3038c = byteBuffer;
    }

    public void a(boolean z7) {
        this.f3036a = z7;
    }
}
