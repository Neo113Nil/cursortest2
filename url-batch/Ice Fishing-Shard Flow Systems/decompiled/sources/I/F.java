package I;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class F extends H {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f1140m;

    public F(int i2, Class cls, int i5, int i7, int i8) {
        this.f1140m = i8;
        this.f1142d = i2;
        this.f1145l = cls;
        this.f1144i = i5;
        this.f1143e = i7;
    }

    @Override // I.H
    public final Object c(View view) {
        switch (this.f1140m) {
            case 0:
                return Boolean.valueOf(N.c(view));
            case 1:
                return N.a(view);
            case 2:
                return P.b(view);
            default:
                return Boolean.valueOf(N.b(view));
        }
    }

    @Override // I.H
    public final void d(View view, Object obj) {
        switch (this.f1140m) {
            case 0:
                N.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                N.e(view, (CharSequence) obj);
                break;
            case 2:
                P.c(view, (CharSequence) obj);
                break;
            default:
                N.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // I.H
    public final boolean g(Object obj, Object obj2) {
        boolean equals;
        switch (this.f1140m) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
