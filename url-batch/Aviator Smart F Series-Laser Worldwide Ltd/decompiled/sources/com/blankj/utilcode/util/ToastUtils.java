package com.blankj.utilcode.util;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.blankj.utilcode.R$id;
import com.blankj.utilcode.R$layout;
import com.blankj.utilcode.util.z0;
import com.google.android.exoplayer2.ExoPlayer;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class ToastUtils {
    private static final int COLOR_DEFAULT = -16777217;
    private static final ToastUtils DEFAULT_MAKER = make();
    private static final String NOTHING = "toast nothing";
    private static final String NULL = "toast null";
    private static final String TAG_TOAST = "TAG_TOAST";
    private static WeakReference<e> sWeakToast;
    private String mMode;
    private int mGravity = -1;
    private int mXOffset = -1;
    private int mYOffset = -1;
    private int mBgColor = COLOR_DEFAULT;
    private int mBgResource = -1;
    private int mTextColor = COLOR_DEFAULT;
    private int mTextSize = -1;
    private boolean isLong = false;
    private Drawable[] mIcons = new Drawable[4];
    private boolean isNotUseSystemToast = false;

    public static final class UtilsMaxWidthRelativeLayout extends RelativeLayout {
        private static final int SPACING = c1.dp2px(80.0f);

        public UtilsMaxWidthRelativeLayout(Context context) {
            super(context);
        }

        @Override // android.widget.RelativeLayout, android.view.View
        protected void onMeasure(int i8, int i9) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(c1.getAppScreenWidth() - SPACING, Integer.MIN_VALUE), i9);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public UtilsMaxWidthRelativeLayout(Context context, AttributeSet attributeSet, int i8) {
            super(context, attributeSet, i8);
        }
    }

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ToastUtils.sWeakToast != null) {
                e eVar = (e) ToastUtils.sWeakToast.get();
                if (eVar != null) {
                    eVar.cancel();
                }
                WeakReference unused = ToastUtils.sWeakToast = null;
            }
        }
    }

    static class b implements Runnable {
        final /* synthetic */ int val$duration;
        final /* synthetic */ CharSequence val$text;
        final /* synthetic */ View val$view;

        b(View view, CharSequence charSequence, int i8) {
            this.val$view = view;
            this.val$text = charSequence;
            this.val$duration = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            ToastUtils.cancel();
            e newToast = ToastUtils.newToast(ToastUtils.this);
            WeakReference unused = ToastUtils.sWeakToast = new WeakReference(newToast);
            View view = this.val$view;
            if (view != null) {
                newToast.setToastView(view);
            } else {
                newToast.setToastView(this.val$text);
            }
            newToast.show(this.val$duration);
        }
    }

    static abstract class c implements e {
        protected Toast mToast = new Toast(z0.getApp());
        protected ToastUtils mToastUtils;
        protected View mToastView;

        c(ToastUtils toastUtils) {
            this.mToastUtils = toastUtils;
            if (toastUtils.mGravity == -1 && this.mToastUtils.mXOffset == -1 && this.mToastUtils.mYOffset == -1) {
                return;
            }
            this.mToast.setGravity(this.mToastUtils.mGravity, this.mToastUtils.mXOffset, this.mToastUtils.mYOffset);
        }

        private void processRtlIfNeed() {
            if (c1.isLayoutRtl()) {
                setToastView(getToastViewSnapshot(-1));
            }
        }

        private void setBg(TextView textView) {
            if (this.mToastUtils.mBgResource != -1) {
                this.mToastView.setBackgroundResource(this.mToastUtils.mBgResource);
                textView.setBackgroundColor(0);
                return;
            }
            if (this.mToastUtils.mBgColor != ToastUtils.COLOR_DEFAULT) {
                Drawable background = this.mToastView.getBackground();
                Drawable background2 = textView.getBackground();
                if (background != null && background2 != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.mToastUtils.mBgColor, PorterDuff.Mode.SRC_IN));
                    textView.setBackgroundColor(0);
                } else if (background != null) {
                    background.mutate().setColorFilter(new PorterDuffColorFilter(this.mToastUtils.mBgColor, PorterDuff.Mode.SRC_IN));
                } else if (background2 != null) {
                    background2.mutate().setColorFilter(new PorterDuffColorFilter(this.mToastUtils.mBgColor, PorterDuff.Mode.SRC_IN));
                } else {
                    this.mToastView.setBackgroundColor(this.mToastUtils.mBgColor);
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        @CallSuper
        public void cancel() {
            Toast toast = this.mToast;
            if (toast != null) {
                toast.cancel();
            }
            this.mToast = null;
            this.mToastView = null;
        }

        View getToastViewSnapshot(int i8) {
            Bitmap view2Bitmap = c1.view2Bitmap(this.mToastView);
            ImageView imageView = new ImageView(z0.getApp());
            imageView.setTag(ToastUtils.TAG_TOAST + i8);
            imageView.setImageBitmap(view2Bitmap);
            return imageView;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void setToastView(View view) {
            this.mToastView = view;
            this.mToast.setView(view);
        }

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public abstract /* synthetic */ void show(int i8);

        @Override // com.blankj.utilcode.util.ToastUtils.e
        public void setToastView(CharSequence charSequence) {
            View tryApplyUtilsToastView = this.mToastUtils.tryApplyUtilsToastView(charSequence);
            if (tryApplyUtilsToastView != null) {
                setToastView(tryApplyUtilsToastView);
                processRtlIfNeed();
                return;
            }
            View view = this.mToast.getView();
            this.mToastView = view;
            if (view == null || view.findViewById(R.id.message) == null) {
                setToastView(c1.layoutId2View(R$layout.utils_toast_view));
            }
            TextView textView = (TextView) this.mToastView.findViewById(R.id.message);
            textView.setText(charSequence);
            if (this.mToastUtils.mTextColor != ToastUtils.COLOR_DEFAULT) {
                textView.setTextColor(this.mToastUtils.mTextColor);
            }
            if (this.mToastUtils.mTextSize != -1) {
                textView.setTextSize(this.mToastUtils.mTextSize);
            }
            setBg(textView);
            processRtlIfNeed();
        }
    }

    static final class d extends c {
        private static int sShowingIndex;
        private e iToast;
        private z0.a mActivityLifecycleCallbacks;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.cancel();
            }
        }

        class b extends z0.a {
            final /* synthetic */ int val$index;

            b(int i8) {
                this.val$index = i8;
            }

            @Override // com.blankj.utilcode.util.z0.a
            public void onActivityCreated(@NonNull Activity activity) {
                if (d.this.isShowing()) {
                    d.this.showWithActivityView(activity, this.val$index, false);
                }
            }
        }

        d(ToastUtils toastUtils) {
            super(toastUtils);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean isShowing() {
            return this.mActivityLifecycleCallbacks != null;
        }

        private void registerLifecycleCallback() {
            b bVar = new b(sShowingIndex);
            this.mActivityLifecycleCallbacks = bVar;
            c1.addActivityLifecycleCallbacks(bVar);
        }

        private e showSystemToast(int i8) {
            f fVar = new f(this.mToastUtils);
            fVar.mToast = this.mToast;
            fVar.show(i8);
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void showWithActivityView(Activity activity, int i8, boolean z7) {
            Window window = activity.getWindow();
            if (window != null) {
                ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = this.mToast.getGravity();
                layoutParams.bottomMargin = this.mToast.getYOffset() + c1.getNavBarHeight();
                layoutParams.topMargin = this.mToast.getYOffset() + c1.getStatusBarHeight();
                layoutParams.leftMargin = this.mToast.getXOffset();
                View toastViewSnapshot = getToastViewSnapshot(i8);
                if (z7) {
                    toastViewSnapshot.setAlpha(0.0f);
                    toastViewSnapshot.animate().alpha(1.0f).setDuration(200L).start();
                }
                viewGroup.addView(toastViewSnapshot, layoutParams);
            }
        }

        private e showWithActivityWindow(Activity activity, int i8) {
            g gVar = new g(this.mToastUtils, activity.getWindowManager(), 99);
            gVar.mToastView = getToastViewSnapshot(-1);
            gVar.mToast = this.mToast;
            gVar.show(i8);
            return gVar;
        }

        private void unregisterLifecycleCallback() {
            c1.removeActivityLifecycleCallbacks(this.mActivityLifecycleCallbacks);
            this.mActivityLifecycleCallbacks = null;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void cancel() {
            Window window;
            if (isShowing()) {
                unregisterLifecycleCallback();
                for (Activity activity : c1.getActivityList()) {
                    if (c1.isActivityAlive(activity) && (window = activity.getWindow()) != null) {
                        ViewGroup viewGroup = (ViewGroup) window.getDecorView();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ToastUtils.TAG_TOAST);
                        sb.append(sShowingIndex - 1);
                        View findViewWithTag = viewGroup.findViewWithTag(sb.toString());
                        if (findViewWithTag != null) {
                            try {
                                viewGroup.removeView(findViewWithTag);
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            e eVar = this.iToast;
            if (eVar != null) {
                eVar.cancel();
                this.iToast = null;
            }
            super.cancel();
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void show(int i8) {
            if (this.mToast == null) {
                return;
            }
            if (!c1.isAppForeground()) {
                this.iToast = showSystemToast(i8);
                return;
            }
            boolean z7 = false;
            for (Activity activity : c1.getActivityList()) {
                if (c1.isActivityAlive(activity)) {
                    if (z7) {
                        showWithActivityView(activity, sShowingIndex, true);
                    } else {
                        this.iToast = showWithActivityWindow(activity, i8);
                        z7 = true;
                    }
                }
            }
            if (!z7) {
                this.iToast = showSystemToast(i8);
                return;
            }
            registerLifecycleCallback();
            c1.runOnUiThreadDelayed(new a(), i8 == 0 ? ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS : 3500L);
            sShowingIndex++;
        }
    }

    interface e {
        void cancel();

        void setToastView(View view);

        void setToastView(CharSequence charSequence);

        void show(int i8);
    }

    static final class f extends c {

        static class a extends Handler {
            private Handler impl;

            a(Handler handler) {
                this.impl = handler;
            }

            @Override // android.os.Handler
            public void dispatchMessage(@NonNull Message message) {
                try {
                    this.impl.dispatchMessage(message);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }

            @Override // android.os.Handler
            public void handleMessage(@NonNull Message message) {
                this.impl.handleMessage(message);
            }
        }

        f(ToastUtils toastUtils) {
            super(toastUtils);
            if (Build.VERSION.SDK_INT == 25) {
                try {
                    Field declaredField = Toast.class.getDeclaredField("mTN");
                    declaredField.setAccessible(true);
                    Object obj = declaredField.get(this.mToast);
                    Field declaredField2 = declaredField.getType().getDeclaredField("mHandler");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, new a((Handler) declaredField2.get(obj)));
                } catch (Exception unused) {
                }
            }
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void show(int i8) {
            Toast toast = this.mToast;
            if (toast == null) {
                return;
            }
            toast.setDuration(i8);
            this.mToast.show();
        }
    }

    public static void cancel() {
        c1.runOnUiThread(new a());
    }

    @NonNull
    public static ToastUtils getDefaultMaker() {
        return DEFAULT_MAKER;
    }

    private int getDuration() {
        return this.isLong ? 1 : 0;
    }

    private static CharSequence getToastFriendlyText(CharSequence charSequence) {
        return charSequence == null ? NULL : charSequence.length() == 0 ? NOTHING : charSequence;
    }

    @NonNull
    public static ToastUtils make() {
        return new ToastUtils();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static e newToast(ToastUtils toastUtils) {
        if (!toastUtils.isNotUseSystemToast && NotificationManagerCompat.from(z0.getApp()).areNotificationsEnabled()) {
            if (Build.VERSION.SDK_INT < 23) {
                return new f(toastUtils);
            }
            if (!c1.isGrantedDrawOverlays()) {
                return new f(toastUtils);
            }
        }
        int i8 = Build.VERSION.SDK_INT;
        return i8 < 25 ? new g(toastUtils, 2005) : c1.isGrantedDrawOverlays() ? i8 >= 26 ? new g(toastUtils, 2038) : new g(toastUtils, 2002) : new d(toastUtils);
    }

    public static void showLong(@Nullable CharSequence charSequence) {
        show(charSequence, 1, DEFAULT_MAKER);
    }

    public static void showShort(@Nullable CharSequence charSequence) {
        show(charSequence, 0, DEFAULT_MAKER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View tryApplyUtilsToastView(CharSequence charSequence) {
        if (!"dark".equals(this.mMode) && !"light".equals(this.mMode)) {
            Drawable[] drawableArr = this.mIcons;
            if (drawableArr[0] == null && drawableArr[1] == null && drawableArr[2] == null && drawableArr[3] == null) {
                return null;
            }
        }
        View layoutId2View = c1.layoutId2View(R$layout.utils_toast_view);
        TextView textView = (TextView) layoutId2View.findViewById(R.id.message);
        if ("dark".equals(this.mMode)) {
            ((GradientDrawable) layoutId2View.getBackground().mutate()).setColor(Color.parseColor("#BB000000"));
            textView.setTextColor(-1);
        }
        textView.setText(charSequence);
        if (this.mIcons[0] != null) {
            View findViewById = layoutId2View.findViewById(R$id.utvLeftIconView);
            ViewCompat.setBackground(findViewById, this.mIcons[0]);
            findViewById.setVisibility(0);
        }
        if (this.mIcons[1] != null) {
            View findViewById2 = layoutId2View.findViewById(R$id.utvTopIconView);
            ViewCompat.setBackground(findViewById2, this.mIcons[1]);
            findViewById2.setVisibility(0);
        }
        if (this.mIcons[2] != null) {
            View findViewById3 = layoutId2View.findViewById(R$id.utvRightIconView);
            ViewCompat.setBackground(findViewById3, this.mIcons[2]);
            findViewById3.setVisibility(0);
        }
        if (this.mIcons[3] != null) {
            View findViewById4 = layoutId2View.findViewById(R$id.utvBottomIconView);
            ViewCompat.setBackground(findViewById4, this.mIcons[3]);
            findViewById4.setVisibility(0);
        }
        return layoutId2View;
    }

    @NonNull
    public final ToastUtils setBgColor(@ColorInt int i8) {
        this.mBgColor = i8;
        return this;
    }

    @NonNull
    public final ToastUtils setBgResource(@DrawableRes int i8) {
        this.mBgResource = i8;
        return this;
    }

    @NonNull
    public final ToastUtils setBottomIcon(int i8) {
        return setBottomIcon(ContextCompat.getDrawable(z0.getApp(), i8));
    }

    @NonNull
    public final ToastUtils setDurationIsLong(boolean z7) {
        this.isLong = z7;
        return this;
    }

    @NonNull
    public final ToastUtils setGravity(int i8, int i9, int i10) {
        this.mGravity = i8;
        this.mXOffset = i9;
        this.mYOffset = i10;
        return this;
    }

    @NonNull
    public final ToastUtils setLeftIcon(@DrawableRes int i8) {
        return setLeftIcon(ContextCompat.getDrawable(z0.getApp(), i8));
    }

    @NonNull
    public final ToastUtils setMode(String str) {
        this.mMode = str;
        return this;
    }

    @NonNull
    public final ToastUtils setNotUseSystemToast() {
        this.isNotUseSystemToast = true;
        return this;
    }

    @NonNull
    public final ToastUtils setRightIcon(@DrawableRes int i8) {
        return setRightIcon(ContextCompat.getDrawable(z0.getApp(), i8));
    }

    @NonNull
    public final ToastUtils setTextColor(@ColorInt int i8) {
        this.mTextColor = i8;
        return this;
    }

    @NonNull
    public final ToastUtils setTextSize(int i8) {
        this.mTextSize = i8;
        return this;
    }

    @NonNull
    public final ToastUtils setTopIcon(@DrawableRes int i8) {
        return setTopIcon(ContextCompat.getDrawable(z0.getApp(), i8));
    }

    public final void show(@Nullable CharSequence charSequence) {
        show(charSequence, getDuration(), this);
    }

    public static void showLong(@StringRes int i8) {
        show(c1.getString(i8), 1, DEFAULT_MAKER);
    }

    public static void showShort(@StringRes int i8) {
        show(c1.getString(i8), 0, DEFAULT_MAKER);
    }

    @NonNull
    public final ToastUtils setBottomIcon(@Nullable Drawable drawable) {
        this.mIcons[3] = drawable;
        return this;
    }

    @NonNull
    public final ToastUtils setLeftIcon(@Nullable Drawable drawable) {
        this.mIcons[0] = drawable;
        return this;
    }

    @NonNull
    public final ToastUtils setRightIcon(@Nullable Drawable drawable) {
        this.mIcons[2] = drawable;
        return this;
    }

    @NonNull
    public final ToastUtils setTopIcon(@Nullable Drawable drawable) {
        this.mIcons[1] = drawable;
        return this;
    }

    public final void show(@StringRes int i8) {
        show(c1.getString(i8), getDuration(), this);
    }

    public static void showLong(@StringRes int i8, Object... objArr) {
        show(c1.getString(i8, objArr), 1, DEFAULT_MAKER);
    }

    public static void showShort(@StringRes int i8, Object... objArr) {
        show(c1.getString(i8, objArr), 0, DEFAULT_MAKER);
    }

    public final void show(@StringRes int i8, Object... objArr) {
        show(c1.getString(i8, objArr), getDuration(), this);
    }

    static final class g extends c {
        private WindowManager.LayoutParams mParams;
        private WindowManager mWM;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.cancel();
            }
        }

        g(ToastUtils toastUtils, int i8) {
            super(toastUtils);
            this.mParams = new WindowManager.LayoutParams();
            this.mWM = (WindowManager) z0.getApp().getSystemService("window");
            this.mParams.type = i8;
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void cancel() {
            try {
                WindowManager windowManager = this.mWM;
                if (windowManager != null) {
                    windowManager.removeViewImmediate(this.mToastView);
                    this.mWM = null;
                }
            } catch (Exception unused) {
            }
            super.cancel();
        }

        @Override // com.blankj.utilcode.util.ToastUtils.c, com.blankj.utilcode.util.ToastUtils.e
        public void show(int i8) {
            if (this.mToast == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = this.mParams;
            layoutParams.height = -2;
            layoutParams.width = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation.Toast;
            layoutParams.setTitle("ToastWithoutNotification");
            WindowManager.LayoutParams layoutParams2 = this.mParams;
            layoutParams2.flags = 152;
            layoutParams2.packageName = z0.getApp().getPackageName();
            this.mParams.gravity = this.mToast.getGravity();
            WindowManager.LayoutParams layoutParams3 = this.mParams;
            int i9 = layoutParams3.gravity;
            if ((i9 & 7) == 7) {
                layoutParams3.horizontalWeight = 1.0f;
            }
            if ((i9 & 112) == 112) {
                layoutParams3.verticalWeight = 1.0f;
            }
            layoutParams3.x = this.mToast.getXOffset();
            this.mParams.y = this.mToast.getYOffset();
            this.mParams.horizontalMargin = this.mToast.getHorizontalMargin();
            this.mParams.verticalMargin = this.mToast.getVerticalMargin();
            try {
                WindowManager windowManager = this.mWM;
                if (windowManager != null) {
                    windowManager.addView(this.mToastView, this.mParams);
                }
            } catch (Exception unused) {
            }
            c1.runOnUiThreadDelayed(new a(), i8 == 0 ? ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS : 3500L);
        }

        g(ToastUtils toastUtils, WindowManager windowManager, int i8) {
            super(toastUtils);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            this.mParams = layoutParams;
            this.mWM = windowManager;
            layoutParams.type = i8;
        }
    }

    public static void showLong(@Nullable String str, Object... objArr) {
        show(c1.format(str, objArr), 1, DEFAULT_MAKER);
    }

    public static void showShort(@Nullable String str, Object... objArr) {
        show(c1.format(str, objArr), 0, DEFAULT_MAKER);
    }

    public final void show(@Nullable String str, Object... objArr) {
        show(c1.format(str, objArr), getDuration(), this);
    }

    public final void show(@NonNull View view) {
        show(view, getDuration(), this);
    }

    private static void show(@Nullable CharSequence charSequence, int i8, ToastUtils toastUtils) {
        show(null, getToastFriendlyText(charSequence), i8, toastUtils);
    }

    private static void show(@NonNull View view, int i8, ToastUtils toastUtils) {
        show(view, null, i8, toastUtils);
    }

    private static void show(@Nullable View view, @Nullable CharSequence charSequence, int i8, @NonNull ToastUtils toastUtils) {
        c1.runOnUiThread(toastUtils.new b(view, charSequence, i8));
    }
}
