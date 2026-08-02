package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bjc {
    private static volatile boolean a = true;

    public static Drawable a(Context context, Context context2, int i, Resources.Theme theme) {
        Context context3;
        try {
            if (a) {
                if (theme != null) {
                    on onVar = new on(context2, theme);
                    onVar.a(theme.getResources().getConfiguration());
                    context3 = onVar;
                } else {
                    context3 = context2;
                }
                return e.f(context3, i);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e;
            }
            return context2.getDrawable(i);
        } catch (NoClassDefFoundError unused2) {
            a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = uy.a;
        return resources.getDrawable(i, theme);
    }
}
