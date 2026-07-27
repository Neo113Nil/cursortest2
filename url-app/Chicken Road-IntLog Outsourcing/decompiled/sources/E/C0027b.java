package E;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.chickyneer.roadway.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: E.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0027b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f598c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f599a = f598c;

    /* renamed from: b, reason: collision with root package name */
    public final C0026a f600b = new C0026a(this);

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f599a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, F.i iVar) {
        this.f599a.onInitializeAccessibilityNodeInfo(view, iVar.f671a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z = false;
        for (int i3 = 0; i3 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((F.d) list.get(i3)).f668a).getId() != i2; i3++) {
        }
        boolean performAccessibilityAction = this.f599a.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
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
                    z = true;
                    break;
                }
                i7++;
            }
        }
        return z;
    }
}
