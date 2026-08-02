package v0;

import I.C0079n;
import java.util.Locale;
import w0.q;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0313c {

    /* renamed from: a, reason: collision with root package name */
    public int f3476a;

    /* renamed from: b, reason: collision with root package name */
    public int f3477b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3478c;

    /* renamed from: d, reason: collision with root package name */
    public final C0079n f3479d;

    public C0313c(o0.b bVar) {
        C0079n c0079n = new C0079n(bVar, "flutter/lifecycle", q.f3566b, null);
        this.f3476a = 0;
        this.f3477b = 0;
        this.f3478c = true;
        this.f3479d = c0079n;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i2, boolean z2) {
        int i3;
        String str;
        int i4 = this.f3476a;
        if (i4 == i2 && z2 == this.f3478c) {
            return;
        }
        if (i2 == 0 && i4 == 0) {
            this.f3478c = z2;
            return;
        }
        int b2 = K.j.b(i2);
        if (b2 != 0) {
            if (b2 == 1) {
                i3 = z2 ? 2 : 3;
            } else if (b2 != 2 && b2 != 3 && b2 != 4) {
                i3 = 0;
            }
            this.f3476a = i2;
            this.f3478c = z2;
            if (i3 != this.f3477b) {
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
            this.f3479d.h(sb.toString(), null);
            this.f3477b = i3;
            return;
        }
        i3 = i2;
        this.f3476a = i2;
        this.f3478c = z2;
        if (i3 != this.f3477b) {
        }
    }
}
