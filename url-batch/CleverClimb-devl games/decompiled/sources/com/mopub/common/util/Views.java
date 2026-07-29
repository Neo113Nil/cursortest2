package com.mopub.common.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.ViewGroup;
import com.mopub.common.logging.MoPubLog;

/* loaded from: classes2.dex */
public class Views {
    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static View getTopmostView(Context context, View view) {
        View rootViewFromActivity = getRootViewFromActivity(context);
        return rootViewFromActivity != null ? rootViewFromActivity : getRootViewFromView(view);
    }

    private static View getRootViewFromActivity(Context context) {
        if (context instanceof Activity) {
            return ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        }
        return null;
    }

    private static View getRootViewFromView(View view) {
        if (view == null) {
            return null;
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            MoPubLog.d("Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View findViewById = rootView.findViewById(R.id.content);
        return findViewById != null ? findViewById : rootView;
    }
}
