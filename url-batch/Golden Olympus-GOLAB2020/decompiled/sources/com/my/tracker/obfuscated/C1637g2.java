package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.g2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1637g2 implements InterfaceC1629e2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f21339a;

    /* renamed from: b, reason: collision with root package name */
    private long f21340b;

    /* renamed from: c, reason: collision with root package name */
    private long f21341c;

    public C1637g2(int i4) {
        this(i4, 0L, 0L);
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1629e2
    public void a(long j4) {
        this.f21341c += j4;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1629e2, com.my.tracker.obfuscated.InterfaceC1633f2
    public long b() {
        return this.f21340b;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1629e2
    public void c(long j4) {
        this.f21340b += j4;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1629e2
    public void g() {
        this.f21340b = 0L;
        this.f21341c = 0L;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1629e2
    /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C1637g2 m23clone() {
        try {
            C1637g2 c1637g2 = (C1637g2) super.clone();
            c1637g2.g();
            c1637g2.a(this.f21341c);
            c1637g2.c(this.f21340b);
            return c1637g2;
        } catch (CloneNotSupportedException unused) {
            return new C1637g2(this.f21339a, this.f21340b, this.f21341c);
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        String str2;
        String str3 = "total time = " + (this.f21340b + this.f21341c) + " ms : ";
        String str4 = "foreground = " + this.f21340b;
        if (this.f21339a == 0) {
            str = "[App Time   TS] id = " + this.f21339a;
            sb = new StringBuilder();
            str2 = "useful background = ";
        } else {
            str = "[Time Based TS] id = " + this.f21339a;
            sb = new StringBuilder();
            str2 = "background = ";
        }
        sb.append(str2);
        sb.append(this.f21341c);
        return str + ", " + str3 + str4 + ", " + sb.toString();
    }

    public C1637g2(int i4, long j4, long j5) {
        this.f21339a = i4;
        this.f21340b = j4;
        this.f21341c = j5;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1669o2, com.my.tracker.obfuscated.InterfaceC1633f2
    public int a() {
        return this.f21339a;
    }

    @Override // com.my.tracker.obfuscated.InterfaceC1629e2, com.my.tracker.obfuscated.InterfaceC1633f2
    public long c() {
        return this.f21341c;
    }
}
