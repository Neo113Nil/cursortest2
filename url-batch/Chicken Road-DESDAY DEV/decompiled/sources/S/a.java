package S;

import C.g;
import K.S;
import L.j;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends g {
    public final /* synthetic */ b d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(8);
        this.d = bVar;
    }

    @Override // C.g
    public final boolean C(int i, int i2, Bundle bundle) {
        int i3;
        b bVar = this.d;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = S.f369a;
            return chip.performAccessibilityAction(i2, bundle);
        }
        boolean z2 = true;
        if (i2 == 1) {
            return bVar.p(i);
        }
        if (i2 == 2) {
            return bVar.j(i);
        }
        boolean z3 = false;
        if (i2 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = bVar.f726k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    bVar.f726k = Integer.MIN_VALUE;
                    bVar.i.invalidate();
                    bVar.q(i3, 65536);
                }
                bVar.f726k = i;
                chip.invalidate();
                bVar.q(i, 32768);
            }
            z2 = false;
        } else {
            if (i2 != 128) {
                x0.c cVar = (x0.c) bVar;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = cVar.f4172q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f1694s) {
                    return z3;
                }
                chip2.f1693r.q(1, 1);
                return z3;
            }
            if (bVar.f726k == i) {
                bVar.f726k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i, 65536);
            }
            z2 = false;
        }
        return z2;
    }

    @Override // C.g
    public final j u(int i) {
        return new j(AccessibilityNodeInfo.obtain(this.d.n(i).f488a));
    }

    @Override // C.g
    public final j w(int i) {
        b bVar = this.d;
        int i2 = i == 2 ? bVar.f726k : bVar.f727l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i2);
    }
}
