package U;

import M.P;
import N.i;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends C1.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f1194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(8);
        this.f1194d = bVar;
    }

    @Override // C1.d
    public final i q(int i) {
        return new i(AccessibilityNodeInfo.obtain(this.f1194d.n(i).f878a));
    }

    @Override // C1.d
    public final i r(int i) {
        b bVar = this.f1194d;
        int i2 = i == 2 ? bVar.f1202k : bVar.f1203l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return q(i2);
    }

    @Override // C1.d
    public final boolean v(int i, int i2, Bundle bundle) {
        int i3;
        b bVar = this.f1194d;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = P.f711a;
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
            AccessibilityManager accessibilityManager = bVar.f1201h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = bVar.f1202k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    bVar.f1202k = Integer.MIN_VALUE;
                    bVar.i.invalidate();
                    bVar.q(i3, 65536);
                }
                bVar.f1202k = i;
                chip.invalidate();
                bVar.q(i, 32768);
            }
            z2 = false;
        } else {
            if (i2 != 128) {
                C0.d dVar = (C0.d) bVar;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = dVar.f74q;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f2339h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z3 = true;
                }
                if (!chip2.f2348s) {
                    return z3;
                }
                chip2.f2347r.q(1, 1);
                return z3;
            }
            if (bVar.f1202k == i) {
                bVar.f1202k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i, 65536);
            }
            z2 = false;
        }
        return z2;
    }
}
