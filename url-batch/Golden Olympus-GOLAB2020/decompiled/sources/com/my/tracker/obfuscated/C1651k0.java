package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1651k0 extends AbstractC1641h2 {
    public ArrayList a(long j4, boolean z4) {
        AbstractC1708y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z4) + "onTick: start collecting foreground TimeSpents");
        if (z4) {
            f(j4);
            a(j4);
        }
        ArrayList a4 = a();
        this.f21361b.clear();
        AbstractC1708y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(z4) + "onTick: collected " + a4.size() + " foreground TimeSpents");
        return a4;
    }

    public void b(long j4) {
    }

    public void c(long j4) {
        AbstractC1708y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "updating all running foreground TimeSpents timestamps (size = " + this.f21360a.size() + ", new timestamp = " + j4 + ")");
        a(j4);
    }

    public void d(long j4) {
        f(j4);
    }

    public void e(long j4) {
    }

    void f(long j4) {
        AbstractC1708y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing all running foreground TimeSpents (size = " + this.f21360a.size() + ")");
        for (int i4 = 0; i4 < this.f21360a.size(); i4++) {
            a(j4, (InterfaceC1695v1) this.f21360a.valueAt(i4));
        }
    }

    public void a(int i4, long j4, boolean z4) {
        if (!z4) {
            j4 = -2147483648L;
        }
        this.f21360a.put(i4, new C1699w1(i4, j4));
        AbstractC1708y2.c("TimeSpent: " + a(z4) + "registered new foreground TimeSpent with id = " + i4);
    }

    public void b(int i4, long j4, boolean z4) {
        InterfaceC1695v1 interfaceC1695v1 = (InterfaceC1695v1) this.f21360a.get(i4);
        if (interfaceC1695v1 == null) {
            AbstractC1708y2.c("TimeSpent: " + a(z4) + " can't stop foreground TimeSpent with id = " + i4 + " (reason: not found)");
            throw new Exception();
        }
        if (z4) {
            a(j4, interfaceC1695v1);
        }
        this.f21360a.remove(i4);
        AbstractC1708y2.c("TimeSpent: " + a(z4) + "stopped foreground TimeSpent, id = " + i4);
    }

    void a(long j4, InterfaceC1695v1 interfaceC1695v1) {
        InterfaceC1629e2 a4 = a(interfaceC1695v1.a());
        long e4 = j4 - interfaceC1695v1.e();
        if (AbstractC1708y2.a()) {
            long b4 = a4.b();
            AbstractC1708y2.a("TimeSpentCore: ForegroundTimeSpentsManager: " + a(true) + "slicing foreground TimeSpent, id = " + interfaceC1695v1.a() + ", " + b4 + "(existed ms) + " + e4 + "(add ms) = " + (b4 + e4) + "(total ms), timestamp = " + j4);
        }
        a4.c(e4);
    }
}
