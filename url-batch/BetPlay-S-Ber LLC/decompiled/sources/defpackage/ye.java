package defpackage;

import android.transition.Transition;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import androidx.fragment.app.s;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class ye extends e {
    public final Object c;
    public final boolean d;
    public final Object e;

    public ye(s sVar, c9 c9Var, boolean z, boolean z2) {
        super(sVar, c9Var);
        int i = sVar.a;
        Fragment fragment = sVar.c;
        if (i == 2) {
            this.c = z ? fragment.getReenterTransition() : fragment.getEnterTransition();
            this.d = z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        } else {
            this.c = z ? fragment.getReturnTransition() : fragment.getExitTransition();
            this.d = true;
        }
        if (!z2) {
            this.e = null;
        } else if (z) {
            this.e = fragment.getSharedElementReturnTransition();
        } else {
            this.e = fragment.getSharedElementEnterTransition();
        }
    }

    public final ml c(Object obj) {
        if (obj == null) {
            return null;
        }
        kl klVar = fl.a;
        if (obj instanceof Transition) {
            return klVar;
        }
        ml mlVar = fl.b;
        if (mlVar != null && mlVar.e(obj)) {
            return mlVar;
        }
        StringBuilder sb = new StringBuilder("Transition ");
        sb.append(obj);
        Fragment fragment = this.a.c;
        sb.append(" for fragment ");
        sb.append(fragment);
        sb.append(" is not a valid framework Transition or AndroidX Transition");
        throw new IllegalArgumentException(sb.toString());
    }
}
