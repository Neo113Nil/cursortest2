package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.insets.ProtectionLayout;
import com.awerser.monnit.betplay.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.ac0;
import defpackage.ay;
import defpackage.bc0;
import defpackage.dc0;
import defpackage.dw;
import defpackage.e90;
import defpackage.ec0;
import defpackage.hs;
import defpackage.i0;
import defpackage.ix;
import defpackage.j8;
import defpackage.ks;
import defpackage.op;
import defpackage.rt;
import defpackage.v4;
import defpackage.w;
import defpackage.w80;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class BottomSheetDialog extends v4 {
    private ks backOrchestrator;
    private BottomSheetBehavior<FrameLayout> behavior;
    private FrameLayout bottomSheet;
    private BottomSheetBehavior.BottomSheetCallback bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;
    private FrameLayout container;
    private CoordinatorLayout coordinator;
    boolean dismissWithAnimation;
    private EdgeToEdgeCallback edgeToEdgeCallback;
    private boolean edgeToEdgeEnabled;
    private ProtectionLayout protectionLayout;
    private List<ay> protectionsList;

    /* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
    public static class EdgeToEdgeCallback extends BottomSheetBehavior.BottomSheetCallback {
        private final ac0 insetsCompat;
        private final Boolean lightBottomSheet;
        private boolean lightStatusBar;
        private Window window;

        private EdgeToEdgeCallback(View view, ac0 ac0Var) {
            this.insetsCompat = ac0Var;
            rt materialShapeDrawable = BottomSheetBehavior.from(view).getMaterialShapeDrawable();
            ColorStateList backgroundTintList = materialShapeDrawable != null ? materialShapeDrawable.g.c : view.getBackgroundTintList();
            if (backgroundTintList != null) {
                this.lightBottomSheet = Boolean.valueOf(j8.C(backgroundTintList.getDefaultColor()));
                return;
            }
            ColorStateList r = j8.r(view.getBackground());
            Integer valueOf = r != null ? Integer.valueOf(r.getDefaultColor()) : null;
            if (valueOf != null) {
                this.lightBottomSheet = Boolean.valueOf(j8.C(valueOf.intValue()));
            } else {
                this.lightBottomSheet = null;
            }
        }

        private void setPaddingForPosition(View view) {
            if (view.getTop() < this.insetsCompat.d()) {
                Window window = this.window;
                if (window != null) {
                    Boolean bool = this.lightBottomSheet;
                    boolean booleanValue = bool == null ? this.lightStatusBar : bool.booleanValue();
                    ix ixVar = new ix(window.getDecorView(), 12);
                    int i = Build.VERSION.SDK_INT;
                    (i >= 35 ? new ec0(window, ixVar) : i >= 30 ? new dc0(window, ixVar) : new bc0(window, ixVar)).U(booleanValue);
                }
                view.setPadding(view.getPaddingLeft(), this.insetsCompat.d() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
                return;
            }
            if (view.getTop() != 0) {
                Window window2 = this.window;
                if (window2 != null) {
                    boolean z = this.lightStatusBar;
                    ix ixVar2 = new ix(window2.getDecorView(), 12);
                    int i2 = Build.VERSION.SDK_INT;
                    (i2 >= 35 ? new ec0(window2, ixVar2) : i2 >= 30 ? new dc0(window2, ixVar2) : new bc0(window2, ixVar2)).U(z);
                }
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onLayout(View view) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
            setPaddingForPosition(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            setPaddingForPosition(view);
        }

        public void setWindow(Window window) {
            if (this.window == window) {
                return;
            }
            this.window = window;
            if (window != null) {
                ix ixVar = new ix(window.getDecorView(), 12);
                int i = Build.VERSION.SDK_INT;
                this.lightStatusBar = (i >= 35 ? new ec0(window, ixVar) : i >= 30 ? new dc0(window, ixVar) : new bc0(window, ixVar)).x();
            }
        }
    }

    public BottomSheetDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) {
                if (i2 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }
        };
        supportRequestWindowFeature(1);
        initialize();
    }

    private FrameLayout ensureContainerAndBehavior() {
        if (this.container == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.container = frameLayout;
            this.protectionLayout = (ProtectionLayout) frameLayout.findViewById(R.id.protection_layout);
            List<ay> list = this.protectionsList;
            if (list != null) {
                setProtections(list);
            }
            this.coordinator = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.container.findViewById(R.id.design_bottom_sheet);
            this.bottomSheet = frameLayout2;
            BottomSheetBehavior<FrameLayout> from = BottomSheetBehavior.from(frameLayout2);
            this.behavior = from;
            from.addBottomSheetCallback(this.bottomSheetCallback);
            this.behavior.setHideable(this.cancelable);
            this.backOrchestrator = new ks(this.behavior, this.bottomSheet);
        }
        return this.container;
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
    }

    private void initialize() {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.edgeToEdgeEnabled = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    @Deprecated
    public static void setLightStatusBar(View view, boolean z) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private void updateListeningForBackCallbacks() {
        ks ksVar = this.backOrchestrator;
        if (ksVar == null) {
            return;
        }
        View view = ksVar.c;
        boolean z = this.cancelable;
        hs hsVar = ksVar.a;
        if (z) {
            if (hsVar != null) {
                hsVar.b(ksVar.b, view, false);
            }
        } else if (hsVar != null) {
            hsVar.c(view);
        }
    }

    private View wrapInBottomSheet(int i, View view, ViewGroup.LayoutParams layoutParams) {
        ensureContainerAndBehavior();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.container.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.edgeToEdgeEnabled) {
            FrameLayout frameLayout = this.container;
            dw dwVar = new dw() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.1
                @Override // defpackage.dw
                public ac0 onApplyWindowInsets(View view2, ac0 ac0Var) {
                    if (BottomSheetDialog.this.edgeToEdgeCallback != null) {
                        BottomSheetDialog.this.behavior.removeBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
                    }
                    if (ac0Var != null) {
                        BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                        bottomSheetDialog.edgeToEdgeCallback = new EdgeToEdgeCallback(bottomSheetDialog.bottomSheet, ac0Var);
                        BottomSheetDialog.this.edgeToEdgeCallback.setWindow(BottomSheetDialog.this.getWindow());
                        BottomSheetDialog.this.behavior.addBottomSheetCallback(BottomSheetDialog.this.edgeToEdgeCallback);
                    }
                    return ac0Var;
                }
            };
            WeakHashMap weakHashMap = e90.a;
            w80.c(frameLayout, dwVar);
        }
        this.bottomSheet.removeAllViews();
        FrameLayout frameLayout2 = this.bottomSheet;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                if (bottomSheetDialog.cancelable && bottomSheetDialog.isShowing() && BottomSheetDialog.this.shouldWindowCloseOnTouchOutside()) {
                    BottomSheetDialog.this.cancel();
                }
            }
        });
        e90.m(this.bottomSheet, new w() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.3
            @Override // defpackage.w
            public void onInitializeAccessibilityNodeInfo(View view2, i0 i0Var) {
                super.onInitializeAccessibilityNodeInfo(view2, i0Var);
                AccessibilityNodeInfo accessibilityNodeInfo = i0Var.a;
                if (!BottomSheetDialog.this.cancelable) {
                    accessibilityNodeInfo.setDismissable(false);
                } else {
                    i0Var.a(1048576);
                    accessibilityNodeInfo.setDismissable(true);
                }
            }

            @Override // defpackage.w
            public boolean performAccessibilityAction(View view2, int i2, Bundle bundle) {
                if (i2 == 1048576) {
                    BottomSheetDialog bottomSheetDialog = BottomSheetDialog.this;
                    if (bottomSheetDialog.cancelable) {
                        bottomSheetDialog.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view2, i2, bundle);
            }
        });
        this.bottomSheet.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.4
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                return true;
            }
        });
        return this.container;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> behavior = getBehavior();
        if (!this.dismissWithAnimation || behavior.getState() == 5) {
            super.cancel();
        } else {
            behavior.setState(5);
        }
    }

    public BottomSheetBehavior<FrameLayout> getBehavior() {
        if (this.behavior == null) {
            ensureContainerAndBehavior();
        }
        return this.behavior;
    }

    public boolean getDismissWithAnimation() {
        return this.dismissWithAnimation;
    }

    public boolean getEdgeToEdgeEnabled() {
        return this.edgeToEdgeEnabled;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.edgeToEdgeEnabled) {
                if (Color.alpha(Build.VERSION.SDK_INT < 35 ? window.getNavigationBarColor() : 0) < 255) {
                    z = true;
                }
            }
            FrameLayout frameLayout = this.container;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z);
            }
            CoordinatorLayout coordinatorLayout = this.coordinator;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z);
            }
            op.P(window, !z);
            EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
            if (edgeToEdgeCallback != null) {
                edgeToEdgeCallback.setWindow(window);
            }
        }
        updateListeningForBackCallbacks();
    }

    @Override // defpackage.v4, defpackage.cc, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (Build.VERSION.SDK_INT < 35) {
                window.setStatusBarColor(0);
            }
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        hs hsVar;
        EdgeToEdgeCallback edgeToEdgeCallback = this.edgeToEdgeCallback;
        if (edgeToEdgeCallback != null) {
            edgeToEdgeCallback.setWindow(null);
        }
        ks ksVar = this.backOrchestrator;
        if (ksVar == null || (hsVar = ksVar.a) == null) {
            return;
        }
        hsVar.c(ksVar.c);
    }

    @Override // defpackage.cc, android.app.Dialog
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior == null || bottomSheetBehavior.getState() != 5) {
            return;
        }
        this.behavior.setState(4);
    }

    public void removeDefaultCallback() {
        this.behavior.removeBottomSheetCallback(this.bottomSheetCallback);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.setHideable(z);
            }
            if (getWindow() != null) {
                updateListeningForBackCallbacks();
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    @Override // defpackage.v4, defpackage.cc, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    public void setDismissWithAnimation(boolean z) {
        this.dismissWithAnimation = z;
    }

    public void setProtections(List<ay> list) {
        this.protectionsList = list;
        ProtectionLayout protectionLayout = this.protectionLayout;
        if (protectionLayout != null) {
            protectionLayout.setProtections(list);
            this.protectionLayout.setVisibility(list.isEmpty() ? 8 : 0);
        }
    }

    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{android.R.attr.windowCloseOnTouchOutside});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    @Override // defpackage.v4, defpackage.cc, android.app.Dialog
    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    @Override // defpackage.v4, defpackage.cc, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }

    public BottomSheetDialog(Context context) {
        this(context, 0);
        initialize();
    }

    public BottomSheetDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new BottomSheetBehavior.BottomSheetCallback() { // from class: com.google.android.material.bottomsheet.BottomSheetDialog.5
            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onStateChanged(View view, int i2) {
                if (i2 == 5) {
                    BottomSheetDialog.this.cancel();
                }
            }

            @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
            public void onSlide(View view, float f) {
            }
        };
        supportRequestWindowFeature(1);
        this.cancelable = z;
        initialize();
    }
}
