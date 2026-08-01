package L;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.winfour.winrandom.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: L.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0002b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f505c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f506a;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f507b;

    public C0002b() {
        this(f505c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f506a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public D.g b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f506a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new D.g(7, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f506a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, M.j jVar) {
        this.f506a.onInitializeAccessibilityNodeInfo(view, jVar.f615a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f506a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f506a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            M.e eVar = (M.e) list.get(i2);
            if (eVar.a() == i) {
                M.s sVar = eVar.d;
                if (sVar != null) {
                    Class cls = eVar.f614c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z2 = sVar.b(view);
                }
            } else {
                i2++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f506a.performAccessibilityAction(view, i, bundle);
        }
        if (z2 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z2;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i4++;
            }
        }
        return z3;
    }

    public void h(View view, int i) {
        this.f506a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f506a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0002b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f506a = accessibilityDelegate;
        this.f507b = new C0000a(this);
    }
}
