package I;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.icefishing.icefish.ice.fishing.s294s.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: I.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0106b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f1172c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f1173a;

    /* renamed from: b, reason: collision with root package name */
    public final C0105a f1174b;

    public C0106b() {
        this(f1172c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f1173a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, J.g gVar) {
        this.f1173a.onInitializeAccessibilityNodeInfo(view, gVar.f1318a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i5 = 0; i5 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((J.d) list.get(i5)).f1315a).getId() != i2; i5++) {
        }
        boolean performAccessibilityAction = this.f1173a.performAccessibilityAction(view, i2, bundle);
        if (performAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i7 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i7)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i8 = 0; clickableSpanArr != null && i8 < clickableSpanArr.length; i8++) {
                if (clickableSpan.equals(clickableSpanArr[i8])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    public C0106b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f1173a = accessibilityDelegate;
        this.f1174b = new C0105a(this);
    }
}
