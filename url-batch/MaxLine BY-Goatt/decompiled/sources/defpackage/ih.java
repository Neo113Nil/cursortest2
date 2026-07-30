package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.firebase.encoders.json.BuildConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ih implements View.OnClickListener {
    public final View m;
    public final String n;
    public Method o;
    public Context p;

    public ih(View view, String str) {
        this.m = view;
        this.n = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.o == null) {
            View view2 = this.m;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.n;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = BuildConfig.FLAVOR;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.o = method;
                        this.p = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.o.invoke(this.p, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
