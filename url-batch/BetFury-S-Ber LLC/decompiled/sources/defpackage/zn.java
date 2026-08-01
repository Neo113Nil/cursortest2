package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class zn extends o0 {
    public final /* synthetic */ rb h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(rb rbVar) {
        super(0);
        this.h = rbVar;
    }

    @Override // defpackage.o0
    public final m0 A(int i) {
        rb rbVar = this.h;
        int i2 = i == 2 ? rbVar.k : rbVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return z(i2);
    }

    @Override // defpackage.o0
    public final boolean D(int i, int i2, Bundle bundle) {
        int i3;
        rb rbVar = this.h;
        Chip chip = rbVar.i;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return rbVar.p(i);
        }
        if (i2 == 2) {
            return rbVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = rbVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = rbVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                rbVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                rbVar.q(i3, 65536);
            }
            rbVar.k = i;
            chip.invalidate();
            rbVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (rbVar.k != i) {
                return false;
            }
            rbVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            rbVar.q(i, 65536);
            return true;
        }
        Chip chip2 = rbVar.n;
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

    @Override // defpackage.o0
    public final m0 z(int i) {
        return new m0(AccessibilityNodeInfo.obtain(this.h.n(i).a));
    }
}
