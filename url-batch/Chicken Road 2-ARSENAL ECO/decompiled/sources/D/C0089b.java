package D;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.strategylink.Row.Five.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: D.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0089b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f275c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f276a = f275c;

    /* renamed from: b, reason: collision with root package name */
    public final C0088a f277b = new C0088a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f276a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, E.h hVar) {
        this.f276a.onInitializeAccessibilityNodeInfo(view, hVar.f585a);
    }

    public boolean c(View view, int i7, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((E.c) list.get(i8)).f581a).getId() != i7; i8++) {
        }
        boolean performAccessibilityAction = this.f276a.performAccessibilityAction(view, i7, bundle);
        if (performAccessibilityAction || i7 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i9 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i9)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i10 = 0; clickableSpanArr != null && i10 < clickableSpanArr.length; i10++) {
                if (clickableSpan.equals(clickableSpanArr[i10])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }
}
