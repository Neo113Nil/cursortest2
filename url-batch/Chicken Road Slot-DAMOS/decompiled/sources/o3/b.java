package o3;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.appsflyer.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class b {

    /* renamed from: i, reason: collision with root package name */
    public static final View.AccessibilityDelegate f7364i = new View.AccessibilityDelegate();

    /* renamed from: d, reason: collision with root package name */
    public final View.AccessibilityDelegate f7365d;

    /* renamed from: e, reason: collision with root package name */
    public final a f7366e;

    public b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f7365d = accessibilityDelegate;
        this.f7366e = new a(this);
    }

    public l.d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f7365d.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new l.d(16, accessibilityNodeProvider);
        }
        return null;
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.f7365d.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, p3.f fVar) {
        this.f7365d.onInitializeAccessibilityNodeInfo(view, fVar.f7665a);
    }

    public boolean d(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i10 = 0; i10 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((p3.d) list.get(i10)).f7662a).getId() != i3; i10++) {
        }
        boolean performAccessibilityAction = this.f7365d.performAccessibilityAction(view, i3, bundle);
        if (performAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i11 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i11)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i12 = 0; clickableSpanArr != null && i12 < clickableSpanArr.length; i12++) {
                if (clickableSpan.equals(clickableSpanArr[i12])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public b() {
        this(f7364i);
    }
}
