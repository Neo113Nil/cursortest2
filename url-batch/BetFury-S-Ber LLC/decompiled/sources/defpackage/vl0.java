package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class vl0 extends rz {
    public final /* synthetic */ int j;

    public vl0(int i, Class cls, int i2, int i3, int i4) {
        this.j = i4;
        this.f = i;
        this.i = cls;
        this.h = i2;
        this.g = i3;
    }

    @Override // defpackage.rz
    public final Object c(View view) {
        switch (this.j) {
            case 0:
                return Boolean.valueOf(cm0.c(view));
            case 1:
                return cm0.a(view);
            default:
                return Boolean.valueOf(cm0.b(view));
        }
    }

    @Override // defpackage.rz
    public final void d(View view, Object obj) {
        switch (this.j) {
            case 0:
                cm0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                cm0.e(view, (CharSequence) obj);
                break;
            default:
                cm0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.rz
    public final boolean g(Object obj, Object obj2) {
        switch (this.j) {
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
