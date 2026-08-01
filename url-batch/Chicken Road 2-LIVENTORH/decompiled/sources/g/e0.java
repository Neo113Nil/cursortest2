package g;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class e0 implements View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final View f1628f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1629g;

    /* renamed from: h, reason: collision with root package name */
    public Method f1630h;
    public Context i;

    public e0(View view, String str) {
        this.f1628f = view;
        this.f1629g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f1630h == null) {
            View view2 = this.f1628f;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f1629g;
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
                        this.f1630h = method;
                        this.i = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f1630h.invoke(this.i, view);
        } catch (IllegalAccessException e4) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
        } catch (InvocationTargetException e5) {
            throw new IllegalStateException("Could not execute method for android:onClick", e5);
        }
    }
}
