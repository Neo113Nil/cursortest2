package defpackage;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.facebook.internal.Utility;
import com.majelw.libystne.R;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class eb0 extends ay {
    public Function0 q;
    public cb0 r;
    public final View s;
    public final ya0 t;
    public boolean u;

    public eb0(Function0 function0, cb0 cb0Var, View view, u81 u81Var, ca0 ca0Var, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), cb0Var.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.q = function0;
        this.r = cb0Var;
        this.s = view;
        Window window = getWindow();
        if (window == null) {
            lh.g("Dialog has no window");
            throw null;
        }
        int i = 1;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        ak2.l(window, this.r.e);
        window.setGravity(17);
        if (!this.r.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 28) {
                de.a.a(attributes);
            }
            if (i2 >= 30) {
                ee eeVar = ee.a;
                eeVar.a(attributes, 0);
                eeVar.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        ya0 ya0Var = new ya0(getContext(), window);
        setTitle(this.r.f);
        ya0Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        ya0Var.setClipChildren(false);
        ya0Var.setElevation(ca0Var.D(8.0f));
        ya0Var.setOutlineProvider(new db0(0));
        this.t = ya0Var;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(ya0Var);
        ya0Var.setTag(R.id.view_tree_lifecycle_owner, ij2.g(view));
        ya0Var.setTag(R.id.view_tree_view_model_store_owner, zj2.h(view));
        ya0Var.setTag(R.id.view_tree_saved_state_registry_owner, uj2.b(view));
        e(this.q, this.r, u81Var);
        ru1 onBackPressedDispatcher = getOnBackPressedDispatcher();
        g9 g9Var = new g9(this, i);
        onBackPressedDispatcher.getClass();
        onBackPressedDispatcher.a(new tm(g9Var), this);
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof ya0) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(Function0 function0, cb0 cb0Var, u81 u81Var) {
        int i;
        this.q = function0;
        this.r = cb0Var;
        jg2 jg2Var = cb0Var.c;
        boolean b = cb.b(this.s);
        int ordinal = jg2Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                b = true;
            } else {
                if (ordinal != 2) {
                    a.b();
                    return;
                }
                b = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(b ? 8192 : -8193, Utility.DEFAULT_STREAM_BUFFER_SIZE);
        int ordinal2 = u81Var.ordinal();
        if (ordinal2 == 0) {
            i = 0;
        } else {
            if (ordinal2 != 1) {
                a.b();
                return;
            }
            i = 1;
        }
        ya0 ya0Var = this.t;
        ya0Var.setLayoutDirection(i);
        boolean z = cb0Var.e;
        boolean z2 = cb0Var.d;
        Window window2 = ya0Var.u;
        boolean z3 = (ya0Var.y && z2 == ya0Var.w && z == ya0Var.x) ? false : true;
        ya0Var.w = z2;
        ya0Var.x = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i2 = z2 ? -2 : -1;
            if (i2 != attributes.width || !ya0Var.y) {
                window2.setLayout(i2, -2);
                ya0Var.y = true;
            }
        }
        setCanceledOnTouchOutside(cb0Var.b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.r.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.q.invoke();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.r.b) {
            ya0 ya0Var = this.t;
            ya0Var.getClass();
            float x = motionEvent.getX();
            if (!Float.isInfinite(x) && !Float.isNaN(x)) {
                float y = motionEvent.getY();
                if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = ya0Var.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + ya0Var.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + ya0Var.getTop();
                    int height = childAt.getHeight() + top;
                    int b = si1.b(motionEvent.getX());
                    if (left <= b) {
                        if (b <= width) {
                            int b2 = si1.b(motionEvent.getY());
                            if (top <= b2) {
                            }
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.u = true;
                return true;
            }
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    this.u = false;
                    return onTouchEvent;
                }
            } else if (this.u) {
                this.q.invoke();
                this.u = false;
                return true;
            }
            return onTouchEvent;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.u = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
