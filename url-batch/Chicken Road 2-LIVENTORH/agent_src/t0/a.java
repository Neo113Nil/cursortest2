package t0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import n0.l0;

/* compiled from: r8-map-id-fb2637cf2a71147074b02d847622f707cfc12821f1b81d08e7915f8e7b9519ab */
/* loaded from: classes.dex */
public final class a extends a0.a {
    public final /* synthetic */ b i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(24);
        this.i = bVar;
    }

    @Override // a0.a
    public final boolean B(int i, int i4, Bundle bundle) {
        int i5;
        b bVar = this.i;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = l0.f2757a;
            return chip.performAccessibilityAction(i4, bundle);
        }
        if (i4 == 1) {
            return bVar.q(i);
        }
        if (i4 == 2) {
            return bVar.j(i);
        }
        boolean z3 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = bVar.f3279h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i5 = bVar.f3281k) == i) {
                return false;
            }
            if (i5 != Integer.MIN_VALUE) {
                bVar.f3281k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.r(i5, 65536);
            }
            bVar.f3281k = i;
            chip.invalidate();
            bVar.r(i, 32768);
            return true;
        }
        if (i4 == 128) {
            if (bVar.f3281k != i) {
                return false;
            }
            bVar.f3281k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.r(i, 65536);
            return true;
        }
        Chip chip2 = ((z1.c) bVar).f3854q;
        if (i4 == 16) {
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f885m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (chip2.f896x) {
                    chip2.f895w.r(1, 1);
                }
            }
        }
        return z3;
    }

    @Override // a0.a
    public final o0.e y(int i) {
        return new o0.e(AccessibilityNodeInfo.obtain(this.i.n(i).f2861a));
    }

    @Override // a0.a
    public final o0.e z(int i) {
        b bVar = this.i;
        int i4 = i == 2 ? bVar.f3281k : bVar.f3282l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return y(i4);
    }
}
