package S;

import K.X;
import L.j;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
import w0.C0358c;

/* loaded from: classes.dex */
public final class a extends B0.d {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b f737d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(8);
        this.f737d = bVar;
    }

    @Override // B0.d
    public final j u(int i) {
        return new j(AccessibilityNodeInfo.obtain(this.f737d.n(i).f665a));
    }

    @Override // B0.d
    public final j v(int i) {
        b bVar = this.f737d;
        int i2 = i == 2 ? bVar.f746k : bVar.f747l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i2);
    }

    @Override // B0.d
    public final boolean y(int i, int i2, Bundle bundle) {
        int i3;
        b bVar = this.f737d;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = X.f418a;
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
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = bVar.f746k) != i) {
                if (i3 != Integer.MIN_VALUE) {
                    bVar.f746k = Integer.MIN_VALUE;
                    bVar.i.invalidate();
                    bVar.q(i3, 65536);
                }
                bVar.f746k = i;
                chip.invalidate();
                bVar.q(i, 32768);
            }
            z2 = false;
        } else {
            if (i2 != 128) {
                C0358c c0358c = (C0358c) bVar;
                if (i2 != 16) {
                    return false;
                }
                Chip chip2 = c0358c.f4529q;
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
                if (!chip2.f1848s) {
                    return z3;
                }
                chip2.f1847r.q(1, 1);
                return z3;
            }
            if (bVar.f746k == i) {
                bVar.f746k = Integer.MIN_VALUE;
                chip.invalidate();
                bVar.q(i, 65536);
            }
            z2 = false;
        }
        return z2;
    }
}
