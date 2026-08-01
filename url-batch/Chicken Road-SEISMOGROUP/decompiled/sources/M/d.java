package M;

import java.util.Locale;
import m.AbstractC0068d;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f333a;

    /* renamed from: b, reason: collision with root package name */
    public int f334b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f335c;

    /* renamed from: d, reason: collision with root package name */
    public final A.e f336d;

    public d(G.b bVar) {
        A.e eVar = new A.e(bVar, "flutter/lifecycle", N.o.f413b, null);
        this.f333a = 0;
        this.f334b = 0;
        this.f335c = true;
        this.f336d = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z) {
        int i3;
        String str;
        int i4 = this.f333a;
        if (i4 == i2 && z == this.f335c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f335c = z;
            return;
        }
        int a2 = AbstractC0068d.a(i2);
        if (a2 != 0) {
            if (a2 == 1) {
                i3 = z ? 2 : 3;
            } else if (a2 != 2 && a2 != 3 && a2 != 4) {
                i3 = 0;
            }
            this.f333a = i2;
            this.f335c = z;
            if (i3 != this.f334b) {
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
            this.f336d.j(sb.toString(), null);
            this.f334b = i3;
            return;
        }
        i3 = i2;
        this.f333a = i2;
        this.f335c = z;
        if (i3 != this.f334b) {
        }
    }
}
