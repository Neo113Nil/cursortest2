package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class wb0 extends g80 {
    public final /* synthetic */ int e;

    public wb0(int i, Class cls, int i2, int i3, int i4) {
        this.e = i4;
        this.a = i;
        this.d = cls;
        this.c = i2;
        this.b = i3;
    }

    @Override // defpackage.g80
    public final Object b(View view) {
        switch (this.e) {
            case 0:
                return Boolean.valueOf(dc0.c(view));
            case 1:
                return dc0.a(view);
            default:
                return Boolean.valueOf(dc0.b(view));
        }
    }

    @Override // defpackage.g80
    public final void c(View view, Object obj) {
        switch (this.e) {
            case 0:
                dc0.f(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                dc0.e(view, (CharSequence) obj);
                break;
            default:
                dc0.d(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // defpackage.g80
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
