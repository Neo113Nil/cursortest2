package com.my.tracker.obfuscated;

/* renamed from: com.my.tracker.obfuscated.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1680r2 {

    /* renamed from: a, reason: collision with root package name */
    private final long f21517a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1633f2 f21518b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1633f2[] f21519c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1697w[] f21520d;

    public C1680r2(long j4, InterfaceC1633f2 interfaceC1633f2, InterfaceC1633f2[] interfaceC1633f2Arr, InterfaceC1697w[] interfaceC1697wArr) {
        this.f21517a = j4;
        this.f21518b = interfaceC1633f2;
        this.f21519c = interfaceC1633f2Arr;
        this.f21520d = interfaceC1697wArr;
    }

    public InterfaceC1633f2 a() {
        return this.f21518b;
    }

    public InterfaceC1697w[] b() {
        return this.f21520d;
    }

    public long c() {
        return this.f21517a;
    }

    public InterfaceC1633f2[] d() {
        return this.f21519c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f21518b != null) {
            sb.append("|-----\n");
            sb.append("| ");
            sb.append(this.f21518b);
            sb.append("\n");
        }
        InterfaceC1633f2[] interfaceC1633f2Arr = this.f21519c;
        if (interfaceC1633f2Arr != null && interfaceC1633f2Arr.length > 0) {
            sb.append("|-----\n");
            for (InterfaceC1633f2 interfaceC1633f2 : this.f21519c) {
                sb.append("| ");
                sb.append(interfaceC1633f2);
                sb.append("\n");
            }
        }
        StringBuilder sb2 = new StringBuilder();
        InterfaceC1697w[] interfaceC1697wArr = this.f21520d;
        if (interfaceC1697wArr != null && interfaceC1697wArr.length > 0) {
            sb2.append("|-----\n");
            for (InterfaceC1697w interfaceC1697w : this.f21520d) {
                sb2.append("| ");
                sb2.append(interfaceC1697w);
                sb2.append("\n");
            }
        }
        return "[TimeSpentTickDTO]\n| timestamp = " + this.f21517a + "\n" + ((Object) sb) + ((Object) sb2) + "[/TimeSpentTickDTO]\n";
    }
}
