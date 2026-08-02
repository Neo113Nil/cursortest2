package O1;

import P1.v;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f1135a;

    /* renamed from: b, reason: collision with root package name */
    public int f1136b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1137c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.p f1138d;

    public a(G1.b bVar) {
        B0.p pVar = new B0.p((P1.f) bVar, "flutter/lifecycle", (P1.k) v.f1275b, (K0.j) null);
        this.f1135a = 0;
        this.f1136b = 0;
        this.f1137c = true;
        this.f1138d = pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i3, boolean z) {
        int i4;
        String str;
        int i5 = this.f1135a;
        if (i5 == i3 && z == this.f1137c) {
            return;
        }
        if (i3 == 0 && i5 == 0) {
            this.f1137c = z;
            return;
        }
        int b3 = M.j.b(i3);
        if (b3 != 0) {
            if (b3 == 1) {
                i4 = z ? 2 : 3;
            } else if (b3 != 2 && b3 != 3 && b3 != 4) {
                i4 = 0;
            }
            this.f1135a = i3;
            this.f1137c = z;
            if (i4 != this.f1136b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i4 == 1) {
                str = "DETACHED";
            } else if (i4 == 2) {
                str = "RESUMED";
            } else if (i4 == 3) {
                str = "INACTIVE";
            } else if (i4 == 4) {
                str = "HIDDEN";
            } else {
                if (i4 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f1138d.h(sb.toString(), null);
            this.f1136b = i4;
            return;
        }
        i4 = i3;
        this.f1135a = i3;
        this.f1137c = z;
        if (i4 != this.f1136b) {
        }
    }
}
