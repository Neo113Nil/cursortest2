package u0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import o0.g;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public final class a extends a0.a {
    public final /* synthetic */ b h;

    public a(b bVar) {
        this.h = bVar;
    }

    @Override // a0.a
    public final g D(int i) {
        return new g(AccessibilityNodeInfo.obtain(this.h.n(i).f2882a));
    }

    @Override // a0.a
    public final g E(int i) {
        b bVar = this.h;
        int i4 = i == 2 ? bVar.f3549k : bVar.f3550l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return D(i4);
    }

    @Override // a0.a
    public final boolean I(int i, int i4, Bundle bundle) {
        int i5;
        b bVar = this.h;
        Chip chip = bVar.i;
        if (i == -1) {
            return chip.performAccessibilityAction(i4, bundle);
        }
        if (i4 == 1) {
            return bVar.q(i);
        }
        if (i4 == 2) {
            return bVar.j(i);
        }
        boolean z4 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i5 = bVar.f3549k) == i) {
                return false;
            }
            if (i5 != Integer.MIN_VALUE) {
                bVar.f3549k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.r(i5, 65536);
            }
            bVar.f3549k = i;
            chip.invalidate();
            bVar.r(i, 32768);
            return true;
        }
        if (i4 == 128) {
            if (bVar.f3549k != i) {
                return false;
            }
            bVar.f3549k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.r(i, 65536);
            return true;
        }
        Chip chip2 = ((a2.d) bVar).f109q;
        if (i4 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f1003m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z4 = true;
                }
                if (chip2.f1015y) {
                    chip2.f1014x.r(1, 1);
                }
            }
        }
        return z4;
    }
}
