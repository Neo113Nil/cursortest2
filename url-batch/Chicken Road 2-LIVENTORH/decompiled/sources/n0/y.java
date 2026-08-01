package n0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class y extends a0 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2802e;

    public y(int i, Class cls, int i4, int i5, int i6) {
        this.f2802e = i6;
        this.f2710a = i;
        this.d = cls;
        this.f2712c = i4;
        this.f2711b = i5;
    }

    @Override // n0.a0
    public final Object b(View view) {
        switch (this.f2802e) {
            case 0:
                return Boolean.valueOf(g0.c(view));
            case 1:
                return g0.a(view);
            default:
                return Boolean.valueOf(g0.b(view));
        }
    }

    @Override // n0.a0
    public final void c(View view, Object obj) {
        switch (this.f2802e) {
            case 0:
                g0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                g0.e(view, (CharSequence) obj);
                break;
            default:
                g0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // n0.a0
    public final boolean e(Object obj, Object obj2) {
        switch (this.f2802e) {
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
