package K;

import android.text.TextUtils;
import android.view.View;

/* loaded from: classes.dex */
public final class G extends I {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f404e;

    public G(int i, Class cls, int i2, int i3, int i4) {
        this.f404e = i4;
        this.f406a = i;
        this.f409d = cls;
        this.f408c = i2;
        this.f407b = i3;
    }

    @Override // K.I
    public final Object b(View view) {
        switch (this.f404e) {
            case 0:
                return Boolean.valueOf(P.d(view));
            case 1:
                return P.b(view);
            default:
                return Boolean.valueOf(P.c(view));
        }
    }

    @Override // K.I
    public final void c(View view, Object obj) {
        switch (this.f404e) {
            case 0:
                P.j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                P.h(view, (CharSequence) obj);
                break;
            default:
                P.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // K.I
    public final boolean e(Object obj, Object obj2) {
        switch (this.f404e) {
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
