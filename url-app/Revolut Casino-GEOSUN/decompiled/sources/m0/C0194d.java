package m0;

import D.C0013n;
import e0.C0114b;
import java.util.Locale;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0194d {

    /* renamed from: a, reason: collision with root package name */
    public int f2707a;

    /* renamed from: b, reason: collision with root package name */
    public int f2708b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2709c;

    /* renamed from: d, reason: collision with root package name */
    public final C0013n f2710d;

    public C0194d(C0114b c0114b) {
        C0013n c0013n = new C0013n(c0114b, "flutter/lifecycle", n0.p.f2791b, null);
        this.f2707a = 0;
        this.f2708b = 0;
        this.f2709c = true;
        this.f2710d = c0013n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f2707a;
        if (i4 == i2 && z2 == this.f2709c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f2709c = z2;
            return;
        }
        int b2 = F.j.b(i2);
        if (b2 != 0) {
            if (b2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (b2 != 2 && b2 != 3 && b2 != 4) {
                i3 = 0;
            }
            this.f2707a = i2;
            this.f2709c = z2;
            if (i3 != this.f2708b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i3 == 1) {
                str = "DETACHED";
            } else if (i3 == 2) {
                str = "RESUMED";
            } else if (i3 == 3) {
                str = "INACTIVE";
            } else if (i3 == 4) {
                str = "HIDDEN";
            } else {
                if (i3 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f2710d.i(sb.toString(), null);
            this.f2708b = i3;
            return;
        }
        i3 = i2;
        this.f2707a = i2;
        this.f2709c = z2;
        if (i3 != this.f2708b) {
        }
    }
}
