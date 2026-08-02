package defpackage;

import android.content.Context;
import android.os.Build;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kl extends ki implements kj {
    public static Method a;
    public kj b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public kl(Context context, int i) {
        super(context, null, i);
    }

    @Override // defpackage.ki
    public final jp p(Context context, boolean z) {
        kk kkVar = new kk(context, z);
        kkVar.e = this;
        return kkVar;
    }
}
