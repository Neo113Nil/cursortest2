package v1;

import N1.p;
import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final C5121e f41350a;

    /* renamed from: b, reason: collision with root package name */
    public int f41351b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f41352c;

    public i(C5121e c5121e) {
        this.f41350a = c5121e;
    }

    @Override // v1.g
    public final void a() {
        this.f41350a.f(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f41351b == iVar.f41351b && p.b(this.f41352c, iVar.f41352c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f41351b * 31;
        Bitmap.Config config = this.f41352c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return j.c(this.f41351b, this.f41352c);
    }
}
