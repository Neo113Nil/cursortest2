package T;

import android.view.ViewStructure;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f4030a = new c();

    public final int a(ViewStructure viewStructure, int i2) {
        return viewStructure.addChildCount(i2);
    }

    public final ViewStructure b(ViewStructure viewStructure, int i2) {
        return viewStructure.newChild(i2);
    }

    public final void c(ViewStructure viewStructure, int i2, int i4, int i5, int i6, int i7, int i8) {
        viewStructure.setDimens(i2, i4, i5, i6, i7, i8);
    }

    public final void d(ViewStructure viewStructure, int i2, String str, String str2, String str3) {
        viewStructure.setId(i2, str, str2, str3);
    }
}
