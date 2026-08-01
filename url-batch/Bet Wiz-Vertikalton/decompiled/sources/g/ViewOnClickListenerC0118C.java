package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: g.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0118C implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f2375a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2376b;

    /* renamed from: c, reason: collision with root package name */
    public Method f2377c;
    public Context d;

    public ViewOnClickListenerC0118C(View view, String str) {
        this.f2375a = view;
        this.f2376b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f2377c == null) {
            View view2 = this.f2375a;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f2376b;
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
                        this.f2377c = method;
                        this.d = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f2377c.invoke(this.d, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
