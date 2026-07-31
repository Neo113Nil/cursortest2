package j1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f5272d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5273e;

    public /* synthetic */ p(String str, int i3) {
        this.f5272d = i3;
        this.f5273e = str;
    }

    @Override // j1.o
    public boolean b(CharSequence charSequence, int i3, int i4, t tVar) {
        if (!TextUtils.equals(charSequence.subSequence(i3, i4), this.f5273e)) {
            return true;
        }
        tVar.f5291c = (tVar.f5291c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f5272d) {
            case 1:
                return "<" + this.f5273e + '>';
            default:
                return super.toString();
        }
    }

    @Override // j1.o
    public Object a() {
        return this;
    }
}
