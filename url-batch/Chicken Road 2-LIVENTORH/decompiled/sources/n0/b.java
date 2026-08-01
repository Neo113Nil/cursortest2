package n0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.oriondriftchasers.arordrft.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f2713c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f2714a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2715b;

    public b() {
        this(f2713c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2714a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public a0.a b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f2714a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new a0.a(24, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f2714a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, o0.e eVar) {
        this.f2714a.onInitializeAccessibilityNodeInfo(view, eVar.f2861a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f2714a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2714a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z4 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            o0.c cVar = (o0.c) list.get(i4);
            if (cVar.a() == i) {
                Class cls = cVar.f2859c;
                o0.o oVar = cVar.d;
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
                    z3 = oVar.g(view);
                }
            } else {
                i4++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = this.f2714a.performAccessibilityAction(view, i, bundle);
        }
        if (z3 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i6 = 0;
            while (true) {
                if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z4 = true;
                    break;
                }
                i6++;
            }
        }
        return z4;
    }

    public void h(View view, int i) {
        this.f2714a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f2714a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f2714a = accessibilityDelegate;
        this.f2715b = new a(this);
    }
}
