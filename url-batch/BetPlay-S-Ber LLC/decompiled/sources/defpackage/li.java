package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class li extends k0 {
    public final /* synthetic */ fa b;

    public li(fa faVar) {
        this.b = faVar;
    }

    @Override // defpackage.k0
    public final i0 a(int i) {
        return new i0(AccessibilityNodeInfo.obtain(this.b.e(i).a));
    }

    @Override // defpackage.k0
    public final i0 b(int i) {
        fa faVar = this.b;
        int i2 = i == 2 ? faVar.h : faVar.i;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return a(i2);
    }

    @Override // defpackage.k0
    public final boolean c(int i, int i2, Bundle bundle) {
        int i3;
        fa faVar = this.b;
        Chip chip = faVar.f;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return faVar.g(i);
        }
        if (i2 == 2) {
            return faVar.a(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = faVar.e;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = faVar.h) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                faVar.h = Integer.MIN_VALUE;
                chip.invalidate();
                faVar.h(i3, 65536);
            }
            faVar.h = i;
            chip.invalidate();
            faVar.h(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (faVar.h != i) {
                return false;
            }
            faVar.h = Integer.MIN_VALUE;
            chip.invalidate();
            faVar.h(i, 65536);
            return true;
        }
        Chip chip2 = faVar.k;
        if (i2 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z = true;
                }
                if (chip2.y) {
                    chip2.x.h(1, 1);
                }
            }
        }
        return z;
    }
}
