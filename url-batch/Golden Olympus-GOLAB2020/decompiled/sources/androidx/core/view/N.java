package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private final PointerIcon f11894a;

    static class a {
        static PointerIcon a(Bitmap bitmap, float f4, float f5) {
            return PointerIcon.create(bitmap, f4, f5);
        }

        static PointerIcon b(Context context, int i4) {
            return PointerIcon.getSystemIcon(context, i4);
        }

        static PointerIcon c(Resources resources, int i4) {
            return PointerIcon.load(resources, i4);
        }
    }

    private N(PointerIcon pointerIcon) {
        this.f11894a = pointerIcon;
    }

    public static N b(Context context, int i4) {
        return new N(a.b(context, i4));
    }

    public Object a() {
        return this.f11894a;
    }
}
