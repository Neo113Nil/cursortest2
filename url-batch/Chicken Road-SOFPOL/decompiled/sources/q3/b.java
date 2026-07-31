package q3;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.snovikpovik.vuevnxsj.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f6075c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f6076a;

    /* renamed from: b, reason: collision with root package name */
    public final a f6077b;

    public b() {
        this(f6075c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6076a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public k b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f6076a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new k(6, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f6076a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, r3.f fVar) {
        this.f6076a.onInitializeAccessibilityNodeInfo(view, fVar.f6557a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f6076a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6076a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z3;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z7 = false;
        int i8 = 0;
        while (true) {
            if (i8 >= list.size()) {
                break;
            }
            r3.d dVar = (r3.d) list.get(i8);
            if (dVar.a() == i) {
                Class cls = dVar.f6554c;
                r3.p pVar = dVar.f6555d;
                if (pVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e8) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e8);
                        }
                    }
                    z3 = pVar.d(view);
                }
            } else {
                i8++;
            }
        }
        z3 = false;
        if (!z3) {
            z3 = this.f6076a.performAccessibilityAction(view, i, bundle);
        }
        if (z3 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z3;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i10 = 0;
            while (true) {
                if (clickableSpanArr == null || i10 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i10])) {
                    clickableSpan.onClick(view);
                    z7 = true;
                    break;
                }
                i10++;
            }
        }
        return z7;
    }

    public void h(View view, int i) {
        this.f6076a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f6076a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6076a = accessibilityDelegate;
        this.f6077b = new a(this);
    }
}
