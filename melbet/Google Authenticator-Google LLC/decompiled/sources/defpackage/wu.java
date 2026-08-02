package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wu extends View.AccessibilityDelegate {
    final wv a;

    public wu(wv wvVar) {
        this.a = wvVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.g(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        aak a = this.a.a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.a;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.b(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        aah aahVar = new aah(accessibilityNodeInfo);
        int i = yq.a;
        Boolean bool = (Boolean) new ya(Boolean.class).d(view);
        boolean z = bool != null && bool.booleanValue();
        AccessibilityNodeInfo accessibilityNodeInfo2 = aahVar.a;
        accessibilityNodeInfo2.setScreenReaderFocusable(z);
        Boolean bool2 = (Boolean) new yd(Boolean.class).d(view);
        aahVar.w(bool2 != null && bool2.booleanValue());
        accessibilityNodeInfo2.setPaneTitle(yq.f(view));
        CharSequence charSequence = (CharSequence) new yc(CharSequence.class).d(view);
        if (Build.VERSION.SDK_INT >= 30) {
            accessibilityNodeInfo2.setStateDescription(charSequence);
        } else {
            accessibilityNodeInfo2.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.a.c(view, aahVar);
        accessibilityNodeInfo.getText();
        List l = wv.l(view);
        for (int i2 = 0; i2 < l.size(); i2++) {
            aahVar.h((aag) l.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.h(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.i(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.a.e(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.f(view, accessibilityEvent);
    }
}
