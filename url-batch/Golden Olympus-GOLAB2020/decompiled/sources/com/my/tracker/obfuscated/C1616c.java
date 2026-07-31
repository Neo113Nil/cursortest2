package com.my.tracker.obfuscated;

import java.util.ArrayList;

/* renamed from: com.my.tracker.obfuscated.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1616c extends AbstractC1641h2 {
    public ArrayList a(long j4, boolean z4) {
        AbstractC1708y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z4) + "onTick: start collecting anytime TimeSpents");
        b(j4, z4);
        a(j4);
        ArrayList a4 = a();
        this.f21361b.clear();
        AbstractC1708y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z4) + "onTick: collected " + a4.size() + " anytime TimeSpents");
        return a4;
    }

    public void b(long j4) {
        AbstractC1708y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(false) + "updating all running anytime TimeSpents timestamps (size = " + this.f21360a.size() + ", new timestamp = " + j4 + ")");
        a(j4);
    }

    public void c(long j4) {
        AbstractC1708y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(true) + "updating all running anytime TimeSpents timestamps (size = " + this.f21360a.size() + ", new timestamp = " + j4 + ")");
        a(j4);
    }

    public void d(long j4) {
        b(j4, true);
    }

    public void e(long j4) {
        b(j4, false);
    }

    public void a(int i4, long j4, boolean z4) {
        this.f21360a.put(i4, new C1699w1(i4, j4));
        AbstractC1708y2.c("TimeSpent: " + a(z4) + "registered new anytime TimeSpent with id = " + i4);
    }

    void b(long j4, boolean z4) {
        AbstractC1708y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z4) + "slicing all running anytime TimeSpents (size = " + this.f21360a.size() + ")");
        for (int i4 = 0; i4 < this.f21360a.size(); i4++) {
            a(j4, (InterfaceC1695v1) this.f21360a.valueAt(i4), z4);
        }
    }

    void a(long j4, InterfaceC1695v1 interfaceC1695v1, boolean z4) {
        InterfaceC1629e2 a4 = a(interfaceC1695v1.a());
        long e4 = j4 - interfaceC1695v1.e();
        if (AbstractC1708y2.a()) {
            long b4 = z4 ? a4.b() : a4.c();
            AbstractC1708y2.a("TimeSpentCore: AnytimeTimeSpentsManager: " + a(z4) + "slicing anytime TimeSpent, id = " + interfaceC1695v1.a() + ", " + b4 + "(existed ms) + " + e4 + "(add ms) = " + (b4 + e4) + "(total ms), timestamp = " + j4);
        }
        if (z4) {
            a4.c(e4);
        } else {
            a4.a(e4);
        }
    }

    public void b(int i4, long j4, boolean z4) {
        InterfaceC1695v1 interfaceC1695v1 = (InterfaceC1695v1) this.f21360a.get(i4);
        if (interfaceC1695v1 == null) {
            AbstractC1708y2.c("TimeSpent: " + a(z4) + "can't stop anytime TimeSpent with id = " + i4 + " (reason: not found)");
            throw new Exception();
        }
        a(j4, interfaceC1695v1, z4);
        this.f21360a.remove(i4);
        AbstractC1708y2.c("TimeSpent: " + a(z4) + "stopped anytime TimeSpent, id = " + i4);
    }
}
