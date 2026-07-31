package y;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.crane.slab.beam.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import z.C0281c;
import z.C0286h;

/* renamed from: y.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0258b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f3135c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3136a = f3135c;

    /* renamed from: b, reason: collision with root package name */
    public final C0257a f3137b = new C0257a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f3136a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, C0286h c0286h) {
        this.f3136a.onInitializeAccessibilityNodeInfo(view, c0286h.f3177a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((C0281c) list.get(i3)).f3173a).getId() != i2; i3++) {
        }
        boolean performAccessibilityAction = this.f3136a.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i5 = 0; clickableSpanArr != null && i5 < clickableSpanArr.length; i5++) {
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
}
