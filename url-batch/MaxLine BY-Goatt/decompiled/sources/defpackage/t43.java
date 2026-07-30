package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t43 extends xh1 {
    public final /* synthetic */ int q;

    public t43(int i, Class cls, int i2, int i3, int i4) {
        this.q = i4;
        this.m = i;
        this.p = cls;
        this.o = i2;
        this.n = i3;
    }

    @Override // defpackage.xh1
    public final Object c(View view) {
        switch (this.q) {
            case 0:
                return Boolean.valueOf(z43.c(view));
            case 1:
                return z43.a(view);
            default:
                return Boolean.valueOf(z43.b(view));
        }
    }

    @Override // defpackage.xh1
    public final void d(View view, Object obj) {
        switch (this.q) {
            case 0:
                z43.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                z43.e(view, (CharSequence) obj);
                break;
            default:
                z43.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.xh1
    public final boolean g(Object obj, Object obj2) {
        switch (this.q) {
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
