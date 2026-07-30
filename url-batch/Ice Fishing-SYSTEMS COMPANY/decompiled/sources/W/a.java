package W;

import O.X;
import P.k;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import g1.C4524d;
import java.util.WeakHashMap;
import r3.C4961d;

/* loaded from: classes.dex */
public final class a extends C4524d {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b f3373v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar) {
        super(8);
        this.f3373v = bVar;
    }

    @Override // g1.C4524d
    public final k C(int i) {
        return new k(AccessibilityNodeInfo.obtain(this.f3373v.n(i).f2675a));
    }

    @Override // g1.C4524d
    public final k D(int i) {
        b bVar = this.f3373v;
        int i4 = i == 2 ? bVar.f3383k : bVar.f3384l;
        if (i4 == Integer.MIN_VALUE) {
            return null;
        }
        return C(i4);
    }

    @Override // g1.C4524d
    public final boolean G(int i, int i4, Bundle bundle) {
        int i9;
        b bVar = this.f3373v;
        Chip chip = bVar.i;
        if (i == -1) {
            WeakHashMap weakHashMap = X.f2240a;
            return chip.performAccessibilityAction(i4, bundle);
        }
        if (i4 == 1) {
            return bVar.p(i);
        }
        if (i4 == 2) {
            return bVar.j(i);
        }
        boolean z8 = false;
        if (i4 == 64) {
            AccessibilityManager accessibilityManager = bVar.f3381h;
            if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i9 = bVar.f3383k) == i) {
                return false;
            }
            if (i9 != Integer.MIN_VALUE) {
                bVar.f3383k = Integer.MIN_VALUE;
                bVar.i.invalidate();
                bVar.q(i9, com.anythink.basead.exoplayer.b.aX);
            }
            bVar.f3383k = i;
            chip.invalidate();
            bVar.q(i, 32768);
            return true;
        }
        if (i4 == 128) {
            if (bVar.f3383k != i) {
                return false;
            }
            bVar.f3383k = Integer.MIN_VALUE;
            chip.invalidate();
            bVar.q(i, com.anythink.basead.exoplayer.b.aX);
            return true;
        }
        C4961d c4961d = (C4961d) bVar;
        if (i4 == 16) {
            Chip chip2 = c4961d.f40285q;
            if (i == 0) {
                return chip2.performClick();
            }
            if (i == 1) {
                chip2.playSoundEffect(0);
                View.OnClickListener onClickListener = chip2.f36078A;
                if (onClickListener != null) {
                    onClickListener.onClick(chip2);
                    z8 = true;
                }
                if (chip2.f36088L) {
                    chip2.f36087K.q(1, 1);
                }
            }
        }
        return z8;
    }
}
