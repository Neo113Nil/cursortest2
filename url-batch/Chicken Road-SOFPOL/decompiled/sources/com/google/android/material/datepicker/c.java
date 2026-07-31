package com.google.android.material.datepicker;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import com.snovikpovik.vuevnxsj.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import r2.r;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class c<S> extends h4.e {

    /* renamed from: s, reason: collision with root package name */
    public final LinkedHashSet f1920s;

    /* renamed from: t, reason: collision with root package name */
    public final LinkedHashSet f1921t;

    public c() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f1920s = new LinkedHashSet();
        this.f1921t = new LinkedHashSet();
    }

    public static boolean i(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(r.S(context, R.attr.materialCalendarStyle, a.class.getCanonicalName()).data, new int[]{i});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    @Override // h4.e, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f1920s.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // h4.e, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f1921t.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }
}
