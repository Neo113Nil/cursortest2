package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-f21f5e89e3d3d92eca33bfe12a7775f49cadfb54340e756eb509706243ac6f5c */
/* loaded from: classes.dex */
public final class si extends k0 {
    public final /* synthetic */ ha h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public si(ha haVar) {
        super(0);
        this.h = haVar;
    }

    @Override // defpackage.k0
    public final i0 D(int i) {
        return new i0(AccessibilityNodeInfo.obtain(this.h.n(i).a));
    }

    @Override // defpackage.k0
    public final i0 E(int i) {
        ha haVar = this.h;
        int i2 = i == 2 ? haVar.k : haVar.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return D(i2);
    }

    @Override // defpackage.k0
    public final boolean H(int i, int i2, Bundle bundle) {
        int i3;
        ha haVar = this.h;
        Chip chip = haVar.i;
        if (i == -1) {
            return chip.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return haVar.p(i);
        }
        if (i2 == 2) {
            return haVar.j(i);
        }
        boolean z = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = haVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = haVar.k) == i) {
                return false;
            }
            if (i3 != Integer.MIN_VALUE) {
                haVar.k = Integer.MIN_VALUE;
                chip.invalidate();
                haVar.q(i3, 65536);
            }
            haVar.k = i;
            chip.invalidate();
            haVar.q(i, 32768);
            return true;
        }
        if (i2 == 128) {
            if (haVar.k != i) {
                return false;
            }
            haVar.k = Integer.MIN_VALUE;
            chip.invalidate();
            haVar.q(i, 65536);
            return true;
        }
        Chip chip2 = haVar.n;
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
                if (chip2.x) {
                    chip2.w.q(1, 1);
                }
            }
        }
        return z;
    }
}
