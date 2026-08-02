package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class edd {
    protected abstract int a();

    protected abstract int b();

    public abstract int c();

    public abstract boolean d();

    public final Context e(Context context) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{a()});
        try {
            Context contextThemeWrapper = new ContextThemeWrapper(new ContextThemeWrapper(context, obtainStyledAttributes.getResourceId(0, b())), c());
            if (d()) {
                contextThemeWrapper = fhk.c(contextThemeWrapper);
            }
            return contextThemeWrapper;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
