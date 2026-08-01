package k0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.gglhk.bofio.fortunetiger.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class b {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2715b;

    public b() {
        this(c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2714a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a2.e b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2714a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a2.e(24, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2714a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, l0.e eVar) {
        this.f2714a.onInitializeAccessibilityNodeInfo(view, eVar.f2855a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2714a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2714a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i4, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z4 = false;
        int i5 = 0;
        while (true) {
            if (i5 >= list.size()) {
                break;
            }
            l0.d dVar = (l0.d) list.get(i5);
            if (dVar.a() == i4) {
                Class cls = dVar.c;
                l0.o oVar = dVar.f2854d;
                if (oVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e4) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e4);
                        }
                    }
                    z3 = oVar.d(view);
                }
            } else {
                i5++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = this.f2714a.performAccessibilityAction(view, i4, bundle);
        }
        if (z3 || i4 != R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i7 = 0;
            while (true) {
                if (clickableSpanArr == null || i7 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i7++;
            }
        }
        return z4;
    }

    public void h(View view, int i4) {
        this.f2714a.sendAccessibilityEvent(view, i4);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2714a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2714a = accessibilityDelegate;
        this.f2715b = new a(this);
    }
}
