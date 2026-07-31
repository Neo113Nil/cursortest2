package h1;

import android.R;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* renamed from: h1.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2460v {

    /* renamed from: b, reason: collision with root package name */
    public static ProgressBar f36763b;

    /* renamed from: c, reason: collision with root package name */
    public static View f36764c;

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f36762a = {R.attr.progressBarStyleLarge, R.attr.progressBarStyleLargeInverse, R.attr.progressBarStyleSmall, R.attr.progressBarStyleSmallInverse};

    /* renamed from: d, reason: collision with root package name */
    public static int f36765d = -1;

    public static void a(Activity activity, FrameLayout frameLayout, int i4) {
        if (i4 >= 0) {
            int[] iArr = f36762a;
            if (i4 >= 4) {
                return;
            }
            if (frameLayout == null) {
                throw new IllegalArgumentException("ViewGroup cannot be null.");
            }
            if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
                return;
            }
            ProgressBar progressBar = f36763b;
            if (progressBar != null) {
                if (f36765d == i4) {
                    return;
                }
                if (f36764c != null) {
                    ViewGroup viewGroup = (ViewGroup) progressBar.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(f36763b);
                        viewGroup.removeView(f36764c);
                    }
                    f36763b = null;
                    f36764c = null;
                }
                f36765d = -1;
            }
            f36765d = i4;
            ProgressBar progressBar2 = new ProgressBar(activity, null, iArr[i4]);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            progressBar2.setLayoutParams(layoutParams);
            progressBar2.setBackground(new ColorDrawable(0));
            progressBar2.setIndeterminate(true);
            f36763b = progressBar2;
            View view = new View(activity);
            view.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            view.setBackgroundColor(0);
            view.setFocusableInTouchMode(true);
            view.requestFocus();
            view.setOnTouchListener(new ViewOnTouchListenerC2458t());
            view.setOnKeyListener(new ViewOnKeyListenerC2459u());
            f36764c = view;
            frameLayout.addView(view);
            frameLayout.addView(f36763b);
        }
    }
}
