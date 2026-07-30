package r4;

import j4.C0573b;
import java.util.Locale;
import s4.x;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f7462a;

    /* renamed from: b, reason: collision with root package name */
    public int f7463b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7464c;

    /* renamed from: d, reason: collision with root package name */
    public final P0.i f7465d;

    public c(C0573b c0573b) {
        P0.i iVar = new P0.i(c0573b, "flutter/lifecycle", x.f7777b, null);
        this.f7462a = 0;
        this.f7463b = 0;
        this.f7464c = true;
        this.f7465d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z7) {
        int i5;
        String str;
        int i7 = this.f7462a;
        if (i7 == i2 && z7 == this.f7464c) {
            return;
        }
        if (i2 == 0 && i7 == 0) {
            this.f7464c = z7;
            return;
        }
        int b7 = S.i.b(i2);
        if (b7 != 0) {
            if (b7 == 1) {
                i5 = z7 ? 2 : 3;
            } else if (b7 != 2 && b7 != 3 && b7 != 4) {
                i5 = 0;
            }
            this.f7462a = i2;
            this.f7464c = z7;
            if (i5 != this.f7463b) {
                return;
            }
            StringBuilder sb = new StringBuilder("AppLifecycleState.");
            if (i5 == 1) {
                str = "DETACHED";
            } else if (i5 == 2) {
                str = "RESUMED";
            } else if (i5 == 3) {
                str = "INACTIVE";
            } else if (i5 == 4) {
                str = "HIDDEN";
            } else {
                if (i5 != 5) {
                    throw null;
                }
                str = "PAUSED";
            }
            sb.append(str.toLowerCase(Locale.ROOT));
            this.f7465d.l(sb.toString(), null);
            this.f7463b = i5;
            return;
        }
        i5 = i2;
        this.f7462a = i2;
        this.f7464c = z7;
        if (i5 != this.f7463b) {
        }
    }
}
