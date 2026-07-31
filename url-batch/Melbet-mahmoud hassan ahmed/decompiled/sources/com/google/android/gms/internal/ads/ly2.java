package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes.dex */
public abstract class ly2 {
    public static ly2 a(my2 my2Var, ny2 ny2Var) {
        if (iy2.b()) {
            return new py2(my2Var, ny2Var);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void b(View view, ry2 ry2Var, String str);

    public abstract void c();

    public abstract void d(View view);

    public abstract void e();
}
