package m0;

import e0.h0;
import java.util.Locale;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f768a;

    /* renamed from: b, reason: collision with root package name */
    public int f769b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f770c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f771d;

    public c(g0.b bVar) {
        h0 h0Var = new h0(bVar, "flutter/lifecycle", n0.n.f938b);
        this.f768a = 0;
        this.f769b = 0;
        this.f770c = true;
        this.f771d = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f768a;
        if (i4 == i2 && z2 == this.f770c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f770c = z2;
            return;
        }
        int a2 = o.d.a(i2);
        if (a2 != 0) {
            if (a2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (a2 != 2 && a2 != 3 && a2 != 4) {
                i3 = 0;
            }
            this.f768a = i2;
            this.f770c = z2;
            if (i3 != this.f769b) {
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
            this.f771d.g(sb.toString(), null);
            this.f769b = i3;
            return;
        }
        i3 = i2;
        this.f768a = i2;
        this.f770c = z2;
        if (i3 != this.f769b) {
        }
    }
}
