package q0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public final class a extends a2.e {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f3092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(24);
        this.f3092i = bVar;
    }

    @Override // a2.e
    public final l0.e w(int i4) {
        return new l0.e(AccessibilityNodeInfo.obtain(this.f3092i.n(i4).f2855a));
    }

    @Override // a2.e
    public final l0.e x(int i4) {
        b bVar = this.f3092i;
        int i5 = i4 == 2 ? bVar.f3101k : bVar.f3102l;
        if (i5 == Integer.MIN_VALUE) {
            return null;
        }
        return w(i5);
    }

    @Override // a2.e
    public final boolean z(int i4, int i5, Bundle bundle) {
        int i6;
        b bVar = this.f3092i;
        Chip chip = bVar.f3099i;
        if (i4 == -1) {
            return chip.performAccessibilityAction(i5, bundle);
        }
        if (i5 == 1) {
            return bVar.q(i4);
        }
        if (i5 == 2) {
            return bVar.j(i4);
        }
        boolean z3 = false;
        if (i5 == 64) {
            AccessibilityManager accessibilityManager = bVar.h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i6 = bVar.f3101k) == i4) {
                return false;
            }
            if (i6 != Integer.MIN_VALUE) {
                bVar.f3101k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.r(i6, 65536);
            }
            bVar.f3101k = i4;
            chip.invalidate();
            bVar.r(i4, 32768);
            return true;
        }
        if (i5 == 128) {
            if (bVar.f3101k != i4) {
                return false;
            }
            bVar.f3101k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.r(i4, 65536);
            return true;
        }
        Chip chip2 = ((u1.c) bVar).f3402q;
        if (i5 == 16) {
            if (i4 == 0) {
                return chip2.performClick();
            }
            if (i4 == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f1258m;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (chip2.f1269x) {
                    chip2.f1268w.r(1, 1);
                }
            }
        }
        return z3;
    }
}
