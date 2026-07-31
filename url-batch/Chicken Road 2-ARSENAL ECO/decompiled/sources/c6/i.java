package c6;

import X5.y;
import n6.q;

/* loaded from: classes.dex */
public final class i extends y {

    /* renamed from: g, reason: collision with root package name */
    public final String f3835g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3836h;

    /* renamed from: i, reason: collision with root package name */
    public final q f3837i;

    public i(String str, long j4, q qVar) {
        this.f3835g = str;
        this.f3836h = j4;
        this.f3837i = qVar;
    }

    @Override // X5.y
    public final long a() {
        return this.f3836h;
    }

    @Override // X5.y
    public final X5.q d() {
        String str = this.f3835g;
        if (str == null) {
            return null;
        }
        F5.i iVar = X5.q.f2982b;
        try {
            return A3.c.P(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Override // X5.y
    public final n6.h e() {
        return this.f3837i;
    }
}
