package h;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.gms.internal.ads.CL;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: h.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC4537D implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final View f38018n;

    /* renamed from: u, reason: collision with root package name */
    public final String f38019u;

    /* renamed from: v, reason: collision with root package name */
    public Method f38020v;

    /* renamed from: w, reason: collision with root package name */
    public Context f38021w;

    public ViewOnClickListenerC4537D(View view, String str) {
        this.f38018n = view;
        this.f38019u = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f38020v == null) {
            View view2 = this.f38018n;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f38019u;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder m8 = CL.m("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    m8.append(view2.getClass());
                    m8.append(str);
                    throw new IllegalStateException(m8.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f38020v = method;
                        this.f38021w = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f38020v.invoke(this.f38021w, view);
        } catch (IllegalAccessException e6) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e6);
        } catch (InvocationTargetException e9) {
            throw new IllegalStateException("Could not execute method for android:onClick", e9);
        }
    }
}
