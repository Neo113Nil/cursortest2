package K;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.quicktoss.winflip.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: K.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0000a extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final C0002b f390a;

    public C0000a(C0002b c0002b) {
        this.f390a = c0002b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f390a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        B0.d b2 = this.f390a.b(view);
        if (b2 != null) {
            return (AccessibilityNodeProvider) b2.f59b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f390a.c(view, accessibilityEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object tag2;
        L.j jVar = new L.j(accessibilityNodeInfo);
        WeakHashMap weakHashMap = T.f381a;
        Object obj = null;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = Boolean.valueOf(L.d(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z2 = (bool == null || !bool.booleanValue()) ? 0 : 1;
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z2);
        } else {
            Bundle extras = accessibilityNodeInfo.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", z2 | (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-2)));
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            tag2 = Boolean.valueOf(L.c(view));
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_heading);
            if (!Boolean.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        Boolean bool2 = (Boolean) tag2;
        boolean z3 = bool2 != null && bool2.booleanValue();
        if (i >= 28) {
            accessibilityNodeInfo.setHeading(z3);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (z3 ? 2 : 0) | (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-3)));
            }
        }
        CharSequence d = T.d(view);
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(d);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d);
        }
        if (i >= 30) {
            obj = N.b(view);
        } else {
            Object tag3 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag3)) {
                obj = tag3;
            }
        }
        CharSequence charSequence = (CharSequence) obj;
        if (i >= 30) {
            L.f.c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f390a.d(view, jVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            jVar.b((L.e) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f390a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f390a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f390a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f390a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f390a.i(view, accessibilityEvent);
    }
}
