package u0;

import F.C0032n;
import java.util.Locale;

/* renamed from: u0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0232d {

    /* renamed from: a, reason: collision with root package name */
    public int f2988a;

    /* renamed from: b, reason: collision with root package name */
    public int f2989b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2990c;

    /* renamed from: d, reason: collision with root package name */
    public final C0032n f2991d;

    public C0232d(m0.b bVar) {
        C0032n c0032n = new C0032n(bVar, "flutter/lifecycle", v0.p.f3094b, null);
        this.f2988a = 0;
        this.f2989b = 0;
        this.f2990c = true;
        this.f2991d = c0032n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f2988a;
        if (i4 == i2 && z2 == this.f2990c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f2990c = z2;
            return;
        }
        int a2 = H.j.a(i2);
        if (a2 != 0) {
            if (a2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (a2 != 2 && a2 != 3 && a2 != 4) {
                i3 = 0;
            }
            this.f2988a = i2;
            this.f2990c = z2;
            if (i3 != this.f2989b) {
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
            this.f2991d.i(sb.toString(), null);
            this.f2989b = i3;
            return;
        }
        i3 = i2;
        this.f2988a = i2;
        this.f2990c = z2;
        if (i3 != this.f2989b) {
        }
    }
}
