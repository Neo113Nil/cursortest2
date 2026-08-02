package E;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.rockchicken.pump.up.road.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0001b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f403c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f404a = f403c;

    /* renamed from: b, reason: collision with root package name */
    public final C0000a f405b = new C0000a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f404a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, F.f fVar) {
        this.f404a.onInitializeAccessibilityNodeInfo(view, fVar.f742a);
    }

    public boolean c(View view, int i4, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i5 = 0; i5 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((F.d) list.get(i5)).f739a).getId() != i4; i5++) {
        }
        boolean performAccessibilityAction = this.f404a.performAccessibilityAction(view, i4, bundle);
        if (performAccessibilityAction || i4 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i6 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i6)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i7 = 0; clickableSpanArr != null && i7 < clickableSpanArr.length; i7++) {
                if (clickableSpan.equals(clickableSpanArr[i7])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
}
