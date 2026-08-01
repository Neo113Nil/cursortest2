package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;

/* compiled from: ActivityUtil.java */
/* loaded from: classes.dex */
public class icD {

    /* compiled from: ActivityUtil.java */
    public interface pvs {
        void pvs();

        void pvs(Throwable th);
    }

    public static boolean pvs(Context context, Intent intent, pvs pvsVar) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (pvsVar == null) {
                    return true;
                }
                pvsVar.pvs();
                return true;
            } catch (Throwable th) {
                if (pvsVar != null) {
                    pvsVar.pvs(th);
                }
            }
        }
        return false;
    }

    public static Activity pvs(View view) {
        View findViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (findViewById = rootView.findViewById(R.id.content)) == null || (context = findViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }
}
