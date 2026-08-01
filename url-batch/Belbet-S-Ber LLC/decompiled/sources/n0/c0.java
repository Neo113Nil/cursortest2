package n0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class c0 extends e0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2760e;

    public c0(int i, Class cls, int i4, int i5, int i6) {
        this.f2760e = i6;
        this.f2771a = i;
        this.d = cls;
        this.f2773c = i4;
        this.f2772b = i5;
    }

    @Override // n0.e0
    public final Object b(View view) {
        switch (this.f2760e) {
            case 0:
                return Boolean.valueOf(k0.c(view));
            case 1:
                return k0.a(view);
            default:
                return Boolean.valueOf(k0.b(view));
        }
    }

    @Override // n0.e0
    public final void c(View view, Object obj) {
        switch (this.f2760e) {
            case 0:
                k0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                k0.e(view, (CharSequence) obj);
                break;
            default:
                k0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // n0.e0
    public final boolean e(Object obj, Object obj2) {
        switch (this.f2760e) {
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
