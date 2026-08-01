package M;

import android.text.TextUtils;
import android.view.View;

/* renamed from: M.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0029z extends B {
    public final /* synthetic */ int e;

    public C0029z(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.f699a = i;
        this.f702d = cls;
        this.f701c = i2;
        this.f700b = i3;
    }

    @Override // M.B
    public final Object c(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(I.d(view));
            case 1:
                return I.b(view);
            case 2:
                return K.b(view);
            default:
                return Boolean.valueOf(I.c(view));
        }
    }

    @Override // M.B
    public final void d(View view, Object obj) {
        switch (this.e) {
            case 0:
                I.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                I.h(view, (CharSequence) obj);
                break;
            case 2:
                K.e(view, (CharSequence) obj);
                break;
            default:
                I.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // M.B
    public final boolean g(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            case 2:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
