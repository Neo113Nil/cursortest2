package o3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.appsflyer.R;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static Field f7378a = null;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f7379b = false;

    /* renamed from: c, reason: collision with root package name */
    public static final t f7380c = new t();

    public static View.AccessibilityDelegate a(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z.a(view);
        }
        if (f7379b) {
            return null;
        }
        if (f7378a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f7378a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f7379b = true;
                return null;
            }
        }
        try {
            Object obj = f7378a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f7379b = true;
            return null;
        }
    }

    public static void b(View view, int i3) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i10 = Build.VERSION.SDK_INT;
            CharSequence charSequence = null;
            if (i10 >= 28) {
                tag = y.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z10 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z10 ? 32 : 2048);
                obtain.setContentChangeTypes(i3);
                if (z10) {
                    List<CharSequence> text = obtain.getText();
                    if (i10 >= 28) {
                        charSequence = y.a(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            charSequence = tag2;
                        }
                    }
                    text.add(charSequence);
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i3 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i3);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i3);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            List<CharSequence> text2 = obtain2.getText();
            if (i10 >= 28) {
                charSequence = y.a(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    charSequence = tag3;
                }
            }
            text2.add(charSequence);
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static void c(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            z.b(view, context, iArr, attributeSet, typedArray, i3, 0);
        }
    }

    public static void d(View view, b bVar) {
        if (bVar == null && (a(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f7366e);
    }

    public static void e(View view, CharSequence charSequence) {
        Object tag;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            y.d(view, charSequence);
        } else {
            if (i3 >= 28) {
                tag = y.a(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate a9 = a(view);
                b bVar = a9 != null ? a9 instanceof a ? ((a) a9).f7362a : new b(a9) : null;
                if (bVar == null) {
                    bVar = new b();
                }
                d(view, bVar);
                view.setTag(R.id.tag_accessibility_pane_title, charSequence);
                b(view, 8);
            }
        }
        t tVar = f7380c;
        if (charSequence == null) {
            tVar.f7447d.remove(view);
            view.removeOnAttachStateChangeListener(tVar);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(tVar);
        } else {
            tVar.f7447d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(tVar);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(tVar);
            }
        }
    }

    public static void f(View view, androidx.datastore.preferences.protobuf.i iVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(iVar != null ? new n0(iVar) : null);
            return;
        }
        PathInterpolator pathInterpolator = l0.f7417e;
        View.OnApplyWindowInsetsListener k0Var = iVar != null ? new k0(view, iVar) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, k0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(k0Var);
        }
    }
}
