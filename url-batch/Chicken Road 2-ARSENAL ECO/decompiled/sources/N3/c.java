package N3;

import java.util.Locale;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f1681a;

    /* renamed from: b, reason: collision with root package name */
    public int f1682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1683c;

    /* renamed from: d, reason: collision with root package name */
    public final B0.c f1684d;

    public c(F3.b bVar) {
        B0.c cVar = new B0.c((Object) bVar, "flutter/lifecycle", (Object) O3.n.f1776b, 11);
        this.f1681a = 0;
        this.f1682b = 0;
        this.f1683c = true;
        this.f1684d = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i7, boolean z5) {
        int i8;
        String str;
        int i9 = this.f1681a;
        if (i9 == i7 && z5 == this.f1683c) {
            return;
        }
        if (i7 == 0 && i9 == 0) {
            this.f1683c = z5;
            return;
        }
        int c7 = N.p.c(i7);
        if (c7 != 0) {
            if (c7 == 1) {
                i8 = z5 ? 2 : 3;
            } else if (c7 != 2 && c7 != 3 && c7 != 4) {
                i8 = 0;
            }
            this.f1681a = i7;
            this.f1683c = z5;
            if (i8 != this.f1682b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i8 == 1) {
                str = "DETACHED";
            } else if (i8 == 2) {
                str = "RESUMED";
            } else if (i8 == 3) {
                str = "INACTIVE";
            } else if (i8 == 4) {
                str = "HIDDEN";
            } else {
                if (i8 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f1684d.z(sb.toString(), null);
            this.f1682b = i8;
            return;
        }
        i8 = i7;
        this.f1681a = i7;
        this.f1683c = z5;
        if (i8 != this.f1682b) {
        }
    }
}
