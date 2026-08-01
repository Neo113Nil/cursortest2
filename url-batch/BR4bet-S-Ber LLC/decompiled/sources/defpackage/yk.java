package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class yk extends rc0 {
    public final /* synthetic */ va j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk(va vaVar) {
        super(1);
        this.j = vaVar;
    }

    @Override // defpackage.rc0
    public final k0 E(int i) {
        return new k0(AccessibilityNodeInfo.obtain(this.j.n(i).a));
    }

    @Override // defpackage.rc0
    public final k0 F(int i) {
        va vaVar = this.j;
        int i2 = i == 2 ? vaVar.k : vaVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return E(i2);
    }

    @Override // defpackage.rc0
    public final boolean I(int i, int i2, Bundle bundle) {
        int i3;
        va vaVar = this.j;
        Chip chip = vaVar.i;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return vaVar.p(i);
        }
        if (i2 == 2) {
            return vaVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = vaVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = vaVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                vaVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                vaVar.q(i3, 65536);
            }
            vaVar.k = i;
            chip.invalidate();
            vaVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (vaVar.k != i) {
                return false;
            }
            vaVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            vaVar.q(i, 65536);
            return true;
        }
        Chip chip2 = vaVar.n;
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
                    chip2.x.q(1, 1);
                }
            }
        }
        return z;
    }
}
