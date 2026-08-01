package K;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.winworm.neongrid.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: K.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0002b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f455c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f456a;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f457b;

    public C0002b() {
        this(f455c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f456a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C.g b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f456a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C.g(7, accessibilityNodeProvider);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f456a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, L.j jVar) {
        this.f456a.onInitializeAccessibilityNodeInfo(view, jVar.f561a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f456a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f456a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
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
            L.e eVar = (L.e) list.get(i2);
            if (eVar.a() == i) {
                L.s sVar = eVar.d;
                if (sVar != null) {
                    Class cls = eVar.f560c;
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
            z2 = this.f456a.performAccessibilityAction(view, i, bundle);
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
        this.f456a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f456a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0002b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f456a = accessibilityDelegate;
        this.f457b = new C0000a(this);
    }
}
