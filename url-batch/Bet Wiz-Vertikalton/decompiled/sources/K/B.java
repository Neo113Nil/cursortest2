package K;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class B extends D {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f410e;

    public B(int i, Class cls, int i2, int i3, int i4) {
        this.f410e = i4;
        this.f412a = i;
        this.d = cls;
        this.f414c = i2;
        this.f413b = i3;
    }

    @Override // K.D
    public final Object b(View view) {
        switch (this.f410e) {
            case 0:
                return Boolean.valueOf(K.d(view));
            case 1:
                return K.b(view);
            default:
                return Boolean.valueOf(K.c(view));
        }
    }

    @Override // K.D
    public final void c(View view, Object obj) {
        switch (this.f410e) {
            case 0:
                K.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                K.h(view, (CharSequence) obj);
                break;
            default:
                K.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // K.D
    public final boolean e(Object obj, Object obj2) {
        switch (this.f410e) {
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
