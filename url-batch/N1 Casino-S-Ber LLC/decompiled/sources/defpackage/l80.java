package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class l80 extends c50 {
    public final /* synthetic */ int e;

    public l80(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.c50
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(s80.c(view));
            case 1:
                return s80.a(view);
            default:
                return Boolean.valueOf(s80.b(view));
        }
    }

    @Override // defpackage.c50
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                s80.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                s80.e(view, (CharSequence) obj);
                break;
            default:
                s80.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.c50
    public final boolean e(Object obj, Object obj2) {
        switch (this.e) {
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
