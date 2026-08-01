package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class i6 implements View.OnClickListener {
    public final View f;
    public final String g;
    public Method h;
    public Context i;

    public i6(View view, String str) {
        this.f = view;
        this.g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.h == null) {
            View view2 = this.f;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.g;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.h = method;
                        this.i = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.h.invoke(this.i, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
