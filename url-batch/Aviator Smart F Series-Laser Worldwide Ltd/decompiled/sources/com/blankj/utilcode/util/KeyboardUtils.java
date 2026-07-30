package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class KeyboardUtils {
    private static final int TAG_ON_GLOBAL_LAYOUT_LISTENER = -8;
    private static long millis;
    private static int sDecorViewDelta;

    static class a implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ int[] val$decorViewInvisibleHeightPre;
        final /* synthetic */ c val$listener;
        final /* synthetic */ Window val$window;

        a(Window window, int[] iArr, c cVar) {
            this.val$window = window;
            this.val$decorViewInvisibleHeightPre = iArr;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (this.val$decorViewInvisibleHeightPre[0] != KeyboardUtils.getDecorViewInvisibleHeight(this.val$window)) {
                throw null;
            }
        }
    }

    static class b implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ View val$contentViewChild;
        final /* synthetic */ int[] val$contentViewInvisibleHeightPre5497;
        final /* synthetic */ int val$paddingBottom;
        final /* synthetic */ Window val$window;

        b(Window window, int[] iArr, View view, int i8) {
            this.val$window = window;
            this.val$contentViewInvisibleHeightPre5497 = iArr;
            this.val$contentViewChild = view;
            this.val$paddingBottom = i8;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            int contentViewInvisibleHeight = KeyboardUtils.getContentViewInvisibleHeight(this.val$window);
            if (this.val$contentViewInvisibleHeightPre5497[0] != contentViewInvisibleHeight) {
                View view = this.val$contentViewChild;
                view.setPadding(view.getPaddingLeft(), this.val$contentViewChild.getPaddingTop(), this.val$contentViewChild.getPaddingRight(), this.val$paddingBottom + KeyboardUtils.getDecorViewInvisibleHeight(this.val$window));
                this.val$contentViewInvisibleHeightPre5497[0] = contentViewInvisibleHeight;
            }
        }
    }

    public interface c {
    }

    private KeyboardUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void clickBlankArea2HideSoftInput() {
        Log.i("KeyboardUtils", "Please refer to the following code.");
    }

    public static void fixAndroidBug5497(@NonNull Activity activity) {
        fixAndroidBug5497(activity.getWindow());
    }

    public static void fixSoftInputLeaks(@NonNull Activity activity) {
        fixSoftInputLeaks(activity.getWindow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getContentViewInvisibleHeight(Window window) {
        View findViewById = window.findViewById(R.id.content);
        if (findViewById == null) {
            return 0;
        }
        Rect rect = new Rect();
        findViewById.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getContentViewInvisibleHeight: " + (findViewById.getBottom() - rect.bottom));
        int abs = Math.abs(findViewById.getBottom() - rect.bottom);
        if (abs <= c1.getStatusBarHeight() + c1.getNavBarHeight()) {
            return 0;
        }
        return abs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getDecorViewInvisibleHeight(@NonNull Window window) {
        View decorView = window.getDecorView();
        Rect rect = new Rect();
        decorView.getWindowVisibleDisplayFrame(rect);
        Log.d("KeyboardUtils", "getDecorViewInvisibleHeight: " + (decorView.getBottom() - rect.bottom));
        int abs = Math.abs(decorView.getBottom() - rect.bottom);
        if (abs > c1.getNavBarHeight() + c1.getStatusBarHeight()) {
            return abs - sDecorViewDelta;
        }
        sDecorViewDelta = abs;
        return 0;
    }

    public static void hideSoftInput(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        hideSoftInput(activity.getWindow());
    }

    public static void hideSoftInputByToggle(@Nullable Activity activity) {
        if (activity == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (Math.abs(elapsedRealtime - millis) > 500 && isSoftInputVisible(activity)) {
            toggleSoftInput();
        }
        millis = elapsedRealtime;
    }

    public static boolean isSoftInputVisible(@NonNull Activity activity) {
        return getDecorViewInvisibleHeight(activity.getWindow()) > 0;
    }

    public static void registerSoftInputChangedListener(@NonNull Activity activity, @NonNull c cVar) {
        registerSoftInputChangedListener(activity.getWindow(), cVar);
    }

    public static void showSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) z0.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(2, 1);
    }

    public static void toggleSoftInput() {
        InputMethodManager inputMethodManager = (InputMethodManager) z0.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 0);
    }

    public static void unregisterSoftInputChangedListener(@NonNull Window window) {
        View findViewById = window.findViewById(R.id.content);
        if (findViewById == null) {
            return;
        }
        Object tag = findViewById.getTag(-8);
        if (tag instanceof ViewTreeObserver.OnGlobalLayoutListener) {
            findViewById.getViewTreeObserver().removeOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener) tag);
            findViewById.setTag(-8, null);
        }
    }

    public static void fixAndroidBug5497(@NonNull Window window) {
        window.setSoftInputMode(window.getAttributes().softInputMode & (-17));
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        View childAt = frameLayout.getChildAt(0);
        int paddingBottom = childAt.getPaddingBottom();
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new b(window, new int[]{getContentViewInvisibleHeight(window)}, childAt, paddingBottom));
    }

    public static void fixSoftInputLeaks(@NonNull Window window) {
        InputMethodManager inputMethodManager = (InputMethodManager) z0.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        String[] strArr = {"mLastSrvView", "mCurRootView", "mServedView", "mNextServedView"};
        for (int i8 = 0; i8 < 4; i8++) {
            try {
                Field declaredField = InputMethodManager.class.getDeclaredField(strArr[i8]);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                Object obj = declaredField.get(inputMethodManager);
                if ((obj instanceof View) && ((View) obj).getRootView() == window.getDecorView().getRootView()) {
                    declaredField.set(inputMethodManager, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static void hideSoftInput(@Nullable Window window) {
        if (window == null) {
            return;
        }
        View currentFocus = window.getCurrentFocus();
        if (currentFocus == null) {
            View decorView = window.getDecorView();
            View findViewWithTag = decorView.findViewWithTag("keyboardTagView");
            if (findViewWithTag == null) {
                findViewWithTag = new EditText(window.getContext());
                findViewWithTag.setTag("keyboardTagView");
                ((ViewGroup) decorView).addView(findViewWithTag, 0, 0);
            }
            currentFocus = findViewWithTag;
            currentFocus.requestFocus();
        }
        hideSoftInput(currentFocus);
    }

    public static void registerSoftInputChangedListener(@NonNull Window window, @NonNull c cVar) {
        if ((window.getAttributes().flags & 512) != 0) {
            window.clearFlags(512);
        }
        FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.content);
        a aVar = new a(window, new int[]{getDecorViewInvisibleHeight(window)}, cVar);
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(aVar);
        frameLayout.setTag(-8, aVar);
    }

    public static void showSoftInput(@Nullable Activity activity) {
        if (activity == null || isSoftInputVisible(activity)) {
            return;
        }
        toggleSoftInput();
    }

    public static void showSoftInput(@NonNull View view) {
        showSoftInput(view, 0);
    }

    public static void showSoftInput(@NonNull View view, int i8) {
        InputMethodManager inputMethodManager = (InputMethodManager) z0.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        inputMethodManager.showSoftInput(view, i8, new ResultReceiver(new Handler()) { // from class: com.blankj.utilcode.util.KeyboardUtils.1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i9, Bundle bundle) {
                if (i9 == 1 || i9 == 3) {
                    KeyboardUtils.toggleSoftInput();
                }
            }
        });
        inputMethodManager.toggleSoftInput(2, 1);
    }

    public static void hideSoftInput(@NonNull View view) {
        InputMethodManager inputMethodManager = (InputMethodManager) z0.getApp().getSystemService("input_method");
        if (inputMethodManager == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
