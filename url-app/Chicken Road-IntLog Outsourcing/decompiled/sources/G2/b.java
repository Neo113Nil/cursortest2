package G2;

import f2.t;
import java.util.Locale;
import y2.C1557b;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f927a;

    /* renamed from: b, reason: collision with root package name */
    public int f928b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f929c;

    /* renamed from: d, reason: collision with root package name */
    public final t f930d;

    public b(C1557b c1557b) {
        t tVar = new t(c1557b, "flutter/lifecycle", H2.t.f1154b, null);
        this.f927a = 0;
        this.f928b = 0;
        this.f929c = true;
        this.f930d = tVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z) {
        int i3;
        String str;
        int i6 = this.f927a;
        if (i6 == i2 && z == this.f929c) {
            return;
        }
        if (i2 == 0 && i6 == 0) {
            this.f929c = z;
            return;
        }
        int b6 = O.j.b(i2);
        if (b6 != 0) {
            if (b6 == 1) {
                i3 = z ? 2 : 3;
            } else if (b6 != 2 && b6 != 3 && b6 != 4) {
                i3 = 0;
            }
            this.f927a = i2;
            this.f929c = z;
            if (i3 != this.f928b) {
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
            this.f930d.g(sb.toString(), null);
            this.f928b = i3;
            return;
        }
        i3 = i2;
        this.f927a = i2;
        this.f929c = z;
        if (i3 != this.f928b) {
        }
    }
}
