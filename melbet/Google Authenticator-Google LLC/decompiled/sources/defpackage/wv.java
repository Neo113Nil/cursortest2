package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.apps.authenticator2.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class wv {
    private static final View.AccessibilityDelegate a = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate b;
    public final View.AccessibilityDelegate c;

    public wv(View.AccessibilityDelegate accessibilityDelegate) {
        this.b = accessibilityDelegate;
        this.c = new wu(this);
    }

    static List l(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public aak a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.b.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new aak(accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, aah aahVar) {
        this.b.onInitializeAccessibilityNodeInfo(view, aahVar.a);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.b.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, int i) {
        this.b.sendAccessibilityEvent(view, i);
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.b.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public boolean g(View view, AccessibilityEvent accessibilityEvent) {
        return this.b.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean h(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.b.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean i(View view, int i, Bundle bundle) {
        boolean z;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List l = l(view);
        int i2 = 0;
        while (true) {
            if (i2 >= l.size()) {
                break;
            }
            aag aagVar = (aag) l.get(i2);
            if (aagVar.a() != i) {
                i2++;
            } else if (aagVar.n != null) {
                Class cls = aagVar.m;
                if (cls != null) {
                    try {
                    } catch (Exception e) {
                        Class cls2 = aagVar.m;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(String.valueOf(cls2 == null ? "null" : cls2.getName())), e);
                    }
                }
                z = aagVar.n.a(view);
            }
        }
        z = false;
        if (!z) {
            z = this.b.performAccessibilityAction(view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
        for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
            if (clickableSpan.equals(clickableSpanArr[i4])) {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public wv() {
        this(a);
    }
}
