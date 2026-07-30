package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: i.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0502D implements View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final View f5355d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5356e;

    /* renamed from: i, reason: collision with root package name */
    public Method f5357i;

    /* renamed from: l, reason: collision with root package name */
    public Context f5358l;

    public ViewOnClickListenerC0502D(View view, String str) {
        this.f5355d = view;
        this.f5356e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f5357i == null) {
            View view2 = this.f5355d;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f5356e;
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
                        this.f5357i = method;
                        this.f5358l = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f5357i.invoke(this.f5358l, view);
        } catch (IllegalAccessException e7) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e7);
        } catch (InvocationTargetException e8) {
            throw new IllegalStateException("Could not execute method for android:onClick", e8);
        }
    }
}
