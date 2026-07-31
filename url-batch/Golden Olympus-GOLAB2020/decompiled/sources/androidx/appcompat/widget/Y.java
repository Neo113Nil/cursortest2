package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
class Y extends P {

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f10857b;

    public Y(Context context, Resources resources) {
        super(resources);
        this.f10857b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i4) {
        Drawable a4 = a(i4);
        Context context = (Context) this.f10857b.get();
        if (a4 != null && context != null) {
            O.g().w(context, i4, a4);
        }
        return a4;
    }
}
