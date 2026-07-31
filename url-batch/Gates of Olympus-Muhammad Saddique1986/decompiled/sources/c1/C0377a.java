package c1;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.gatesof.olympus.martu.marku.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z.C1256t;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0377a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0378b f5593a;

    public C0377a(AbstractC0378b abstractC0378b) {
        this.f5593a = abstractC0378b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f5593a.f5595a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C1256t a3 = this.f5593a.a(view);
        if (a3 != null) {
            return (AccessibilityNodeProvider) a3.f10466e;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5593a.f5595a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        Object obj2;
        int i3;
        int i4 = 1;
        d1.h hVar = new d1.h(accessibilityNodeInfo);
        int i5 = AbstractC0394s.f5610a;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 28) {
            tag = Boolean.valueOf(AbstractC0391o.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i7 = 0;
        boolean z3 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i6 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z3);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z3 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i6 >= 28) {
            obj = Boolean.valueOf(AbstractC0391o.c(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z4 = bool2 != null && bool2.booleanValue();
        if (i6 >= 28) {
            accessibilityNodeInfo.setHeading(z4);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z4 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        if (i6 >= 28) {
            tag2 = AbstractC0391o.b(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i6 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i6 >= 30) {
            obj2 = AbstractC0392p.b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj2 = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i6 >= 30) {
            d1.d.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        AbstractC0378b abstractC0378b = this.f5593a;
        abstractC0378b.getClass();
        abstractC0378b.f5595a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i6 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                    if (((WeakReference) sparseArray.valueAt(i8)).get() == null) {
                        arrayList.add(Integer.valueOf(i8));
                    }
                }
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    sparseArray.remove(((Integer) arrayList.get(i9)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i10 = 0;
                while (i10 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i10];
                    int i11 = i7;
                    while (true) {
                        if (i11 >= sparseArray2.size()) {
                            i3 = d1.h.f5671d;
                            d1.h.f5671d = i3 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i11)).get())) {
                                i3 = sparseArray2.keyAt(i11);
                                break;
                            }
                            i11 += i4;
                        }
                    }
                    sparseArray2.put(i3, new WeakReference(clickableSpanArr[i10]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i10];
                    Spanned spanned = (Spanned) text;
                    hVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    hVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    hVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    hVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i3));
                    i4 = 1;
                    i10++;
                    i7 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i12 = 0; i12 < list.size(); i12++) {
            hVar.a((d1.c) list.get(i12));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f5593a.f5595a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f5593a.f5595a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i3, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        AbstractC0378b abstractC0378b = this.f5593a;
        abstractC0378b.getClass();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        for (int i4 = 0; i4 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((d1.c) list.get(i4)).f5669a).getId() != i3; i4++) {
        }
        boolean performAccessibilityAction = abstractC0378b.f5595a.performAccessibilityAction(view, i3, bundle);
        if (performAccessibilityAction || i3 != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i5 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i5)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i6 = 0;
            while (true) {
                if (clickableSpanArr == null || i6 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i6])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i6++;
            }
        }
        return z3;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i3) {
        this.f5593a.f5595a.sendAccessibilityEvent(view, i3);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f5593a.f5595a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
