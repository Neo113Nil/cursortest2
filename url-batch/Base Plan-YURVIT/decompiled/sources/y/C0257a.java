package y;

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
import com.crane.slab.beam.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o0.C0211b;
import z.AbstractC0282d;
import z.C0281c;
import z.C0286h;

/* renamed from: y.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0257a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0258b f3134a;

    public C0257a(C0258b c0258b) {
        this.f3134a = c0258b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3134a.f3136a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f3134a.f3136a.getAccessibilityNodeProvider(view);
        C0211b c0211b = accessibilityNodeProvider != null ? new C0211b(23, accessibilityNodeProvider) : null;
        if (c0211b != null) {
            return (AccessibilityNodeProvider) c0211b.f2915f;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3134a.a(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        Object obj2;
        int i2;
        C0286h c0286h = new C0286h(accessibilityNodeInfo);
        Field field = x.f3160a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tag = Boolean.valueOf(AbstractC0275t.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        int i4 = 0;
        boolean z2 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (i3 >= 28) {
            obj = Boolean.valueOf(AbstractC0275t.c(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z3 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)) | (z3 ? 2 : 0));
            }
        }
        if (i3 >= 28) {
            tag2 = AbstractC0275t.b(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i3 >= 30) {
            obj2 = AbstractC0277v.b(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj2 = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i3 >= 30) {
            AbstractC0282d.c(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.f3134a.b(view, c0286h);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                    if (((WeakReference) sparseArray.valueAt(i5)).get() == null) {
                        arrayList.add(Integer.valueOf(i5));
                    }
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    sparseArray.remove(((Integer) arrayList.get(i6)).intValue());
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
                int i7 = 0;
                while (i7 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i7];
                    int i8 = i4;
                    while (true) {
                        if (i8 >= sparseArray2.size()) {
                            i2 = C0286h.f3176b;
                            C0286h.f3176b = i2 + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i8)).get())) {
                                i2 = sparseArray2.keyAt(i8);
                                break;
                            }
                            i8++;
                        }
                    }
                    sparseArray2.put(i2, new WeakReference(clickableSpanArr[i7]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i7];
                    Spanned spanned = (Spanned) text;
                    c0286h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c0286h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c0286h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c0286h.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i2));
                    i7++;
                    i4 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            c0286h.f3177a.addAction((AccessibilityNodeInfo.AccessibilityAction) ((C0281c) list.get(i9)).f3173a);
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f3134a.f3136a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3134a.f3136a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
        return this.f3134a.c(view, i2, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i2) {
        this.f3134a.f3136a.sendAccessibilityEvent(view, i2);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f3134a.f3136a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
