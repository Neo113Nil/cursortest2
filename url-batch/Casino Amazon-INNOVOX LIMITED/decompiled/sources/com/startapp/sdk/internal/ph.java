package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.Point;
import android.util.TypedValue;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Set;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public abstract class ph {
    public static int a(Context context, int i) {
        return Math.round(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    public static int b(Context context, int i) {
        return Math.round(i / context.getResources().getDisplayMetrics().density);
    }

    public static void a(TextView textView, Set set) {
        if (set.contains("UNDERLINE")) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        }
        textView.setTypeface(null, (set.contains("BOLD") && set.contains("ITALIC")) ? 3 : set.contains("BOLD") ? 1 : set.contains("ITALIC") ? 2 : 0);
    }

    public static RelativeLayout.LayoutParams a(Context context, int[] iArr, int[] iArr2) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        for (int i : iArr2) {
            layoutParams.addRule(i);
        }
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = i3 == 0 ? 0 : a(context, i3);
        }
        layoutParams.setMargins(iArr[0], iArr[1], iArr[2], iArr[3]);
        return layoutParams;
    }

    public static void a(Context context, WindowManager windowManager, Point point) {
        windowManager.getDefaultDisplay().getSize(point);
        point.x = Math.round(point.x / context.getResources().getDisplayMetrics().density);
        point.y = Math.round(point.y / context.getResources().getDisplayMetrics().density);
    }
}
