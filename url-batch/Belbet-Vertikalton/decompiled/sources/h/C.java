package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class C implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f2721a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2722b;

    /* renamed from: c, reason: collision with root package name */
    public Method f2723c;

    /* renamed from: d, reason: collision with root package name */
    public Context f2724d;

    public C(View view, String str) {
        this.f2721a = view;
        this.f2722b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2723c == null) {
            View view2 = this.f2721a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2722b;
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
                        this.f2723c = method;
                        this.f2724d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f2723c.invoke(this.f2724d, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
