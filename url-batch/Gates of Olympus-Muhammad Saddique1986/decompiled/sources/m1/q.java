package m1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class q implements o, z1.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6965d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6966e;

    public /* synthetic */ q(String str, int i3) {
        this.f6965d = i3;
        this.f6966e = str;
    }

    @Override // m1.o
    public boolean c(CharSequence charSequence, int i3, int i4, u uVar) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i4), this.f6966e)) {
            return true;
        }
        uVar.f6984c = (uVar.f6984c & 3) | 4;
        return false;
    }

    @Override // z1.c
    public String d() {
        return this.f6966e;
    }

    public String toString() {
        switch (this.f6965d) {
            case 1:
                return "<" + this.f6966e + '>';
            default:
                return super.toString();
        }
    }

    public q(String str) {
        this.f6965d = 2;
        f2.j.f(str, "query");
        this.f6966e = str;
    }

    @Override // m1.o
    public Object b() {
        return this;
    }

    @Override // z1.c
    public void a(z1.b bVar) {
    }
}
