package defpackage;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.s;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public final class xe implements Runnable {
    public final /* synthetic */ s f;
    public final /* synthetic */ s g;
    public final /* synthetic */ boolean h;

    public xe(s sVar, s sVar2, boolean z, e7 e7Var) {
        this.f = sVar;
        this.g = sVar2;
        this.h = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.f.c;
        Fragment fragment2 = this.g.c;
        kl klVar = fl.a;
        if (this.h) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
