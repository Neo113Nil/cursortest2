package k0;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class w extends y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2787e;

    public w(int i4, Class cls, int i5, int i6, int i7) {
        this.f2787e = i7;
        this.f2793a = i4;
        this.f2795d = cls;
        this.c = i5;
        this.f2794b = i6;
    }

    @Override // k0.y
    public final Object b(View view) {
        switch (this.f2787e) {
            case 0:
                return Boolean.valueOf(e0.c(view));
            case 1:
                return e0.a(view);
            default:
                return Boolean.valueOf(e0.b(view));
        }
    }

    @Override // k0.y
    public final void c(View view, Object obj) {
        switch (this.f2787e) {
            case 0:
                e0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                e0.e(view, (CharSequence) obj);
                break;
            default:
                e0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // k0.y
    public final boolean e(Object obj, Object obj2) {
        switch (this.f2787e) {
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
