package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abo extends aak {
    final /* synthetic */ abp b;

    public abo(abp abpVar) {
        this.b = abpVar;
    }

    @Override // defpackage.aak
    public final aah a(int i) {
        return new aah(AccessibilityNodeInfo.obtain(this.b.j(i).a));
    }

    @Override // defpackage.aak
    public final aah b(int i) {
        abp abpVar = this.b;
        int i2 = i == 2 ? abpVar.d : abpVar.e;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.aak
    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        abp abpVar = this.b;
        if (i == -1) {
            return abpVar.b.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            View view = abpVar.b;
            if ((!view.isFocused() && !view.requestFocus()) || (i3 = abpVar.e) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                abpVar.q(i3);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            abpVar.e = i;
            abpVar.o(i, true);
            abpVar.s(i, 8);
            return true;
        }
        if (i2 == 2) {
            return abpVar.q(i);
        }
        if (i2 != 64) {
            return i2 != 128 ? abpVar.r(i, i2) : abpVar.p(i);
        }
        AccessibilityManager accessibilityManager = abpVar.a;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i4 = abpVar.d) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            abpVar.p(i4);
        }
        abpVar.d = i;
        abpVar.b.invalidate();
        abpVar.s(i, 32768);
        return true;
    }
}
