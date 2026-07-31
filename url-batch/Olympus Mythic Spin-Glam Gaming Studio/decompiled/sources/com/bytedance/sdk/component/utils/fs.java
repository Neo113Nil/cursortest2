package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.h;
import java.util.concurrent.ExecutorService;

/* loaded from: classes11.dex */
public class fs {
    private static zmn zmn;

    /* renamed from: com.bytedance.sdk.component.utils.fs$fs, reason: collision with other inner class name */
    public interface InterfaceC0135fs {
        void zmn();

        void zmn(Throwable th);
    }

    public interface zmn {
        boolean fs();

        boolean zmn();

        ExecutorService zn();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, h.u);
        p0.startActivity(p1);
    }

    public static void zmn(zmn zmnVar) {
        zmn = zmnVar;
    }

    public static void zmn(final Context context, final Intent intent, final InterfaceC0135fs interfaceC0135fs) {
        ExecutorService zn;
        zmn zmnVar = zmn;
        if (zmnVar != null && zmnVar.fs() && (zn = zmn.zn()) != null) {
            zn.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.fs.1
                @Override // java.lang.Runnable
                public void run() {
                    fs.zn(context, intent, interfaceC0135fs);
                }
            });
        } else {
            zn(context, intent, interfaceC0135fs);
        }
    }

    public static boolean zmn(final Context context, final Intent intent, final InterfaceC0135fs interfaceC0135fs, boolean z) {
        zmn zmnVar;
        ExecutorService zn;
        if (z && (zmnVar = zmn) != null && zmnVar.zmn() && (zn = zmn.zn()) != null) {
            zn.execute(new Runnable() { // from class: com.bytedance.sdk.component.utils.fs.2
                @Override // java.lang.Runnable
                public void run() {
                    fs.zn(context, intent, interfaceC0135fs);
                }
            });
            return true;
        }
        return zn(context, intent, interfaceC0135fs);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zn(Context context, Intent intent, InterfaceC0135fs interfaceC0135fs) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
                if (interfaceC0135fs == null) {
                    return true;
                }
                interfaceC0135fs.zmn();
                return true;
            } catch (Throwable th) {
                if (interfaceC0135fs != null) {
                    interfaceC0135fs.zmn(th);
                }
            }
        }
        return false;
    }

    public static Activity zmn(View view) {
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

    public static boolean zmn(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
