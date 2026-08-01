package M;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class A extends C {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f501e;

    public A(int i, Class cls, int i2, int i3, int i4) {
        this.f501e = i4;
        this.f503a = i;
        this.d = cls;
        this.f505c = i2;
        this.f504b = i3;
    }

    @Override // M.C
    public final Object b(View view) {
        switch (this.f501e) {
            case 0:
                return Boolean.valueOf(J.d(view));
            case 1:
                return J.b(view);
            default:
                return Boolean.valueOf(J.c(view));
        }
    }

    @Override // M.C
    public final void c(View view, Object obj) {
        switch (this.f501e) {
            case 0:
                J.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                J.h(view, (CharSequence) obj);
                break;
            default:
                J.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // M.C
    public final boolean e(Object obj, Object obj2) {
        switch (this.f501e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
