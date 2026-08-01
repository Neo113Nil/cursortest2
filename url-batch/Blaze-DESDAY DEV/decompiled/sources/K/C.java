package K;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class C extends E {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f426e;

    public C(int i, Class cls, int i2, int i3, int i4) {
        this.f426e = i4;
        this.f430a = i;
        this.d = cls;
        this.f432c = i2;
        this.f431b = i3;
    }

    @Override // K.E
    public final Object b(View view) {
        switch (this.f426e) {
            case 0:
                return Boolean.valueOf(L.d(view));
            case 1:
                return L.b(view);
            default:
                return Boolean.valueOf(L.c(view));
        }
    }

    @Override // K.E
    public final void c(View view, Object obj) {
        switch (this.f426e) {
            case 0:
                L.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                L.h(view, (CharSequence) obj);
                break;
            default:
                L.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // K.E
    public final boolean e(Object obj, Object obj2) {
        switch (this.f426e) {
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
