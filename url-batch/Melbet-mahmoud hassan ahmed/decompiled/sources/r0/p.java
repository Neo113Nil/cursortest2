package r0;

import android.os.Bundle;
import r0.i;

/* loaded from: classes.dex */
public final class p implements i {

    /* renamed from: i, reason: collision with root package name */
    public static final p f20878i = new p(0, 0, 0);

    /* renamed from: j, reason: collision with root package name */
    public static final i.a<p> f20879j = new i.a() { // from class: r0.o
        @Override // r0.i.a
        public final i a(Bundle bundle) {
            p c7;
            c7 = p.c(bundle);
            return c7;
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public final int f20880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f20881g;

    /* renamed from: h, reason: collision with root package name */
    public final int f20882h;

    public p(int i7, int i8, int i9) {
        this.f20880f = i7;
        this.f20881g = i8;
        this.f20882h = i9;
    }

    private static String b(int i7) {
        return Integer.toString(i7, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p c(Bundle bundle) {
        return new p(bundle.getInt(b(0), 0), bundle.getInt(b(1), 0), bundle.getInt(b(2), 0));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f20880f == pVar.f20880f && this.f20881g == pVar.f20881g && this.f20882h == pVar.f20882h;
    }

    public int hashCode() {
        return ((((527 + this.f20880f) * 31) + this.f20881g) * 31) + this.f20882h;
    }
}
