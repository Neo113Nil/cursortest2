package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
public class qb0 extends pb0 {
    public ip r;

    public qb0(ac0 ac0Var, WindowInsets windowInsets) {
        super(ac0Var, windowInsets);
        this.r = null;
    }

    @Override // defpackage.xb0
    public ac0 b() {
        return ac0.g(null, this.c.consumeStableInsets());
    }

    @Override // defpackage.xb0
    public ac0 c() {
        return ac0.g(null, this.c.consumeSystemWindowInsets());
    }

    @Override // defpackage.xb0
    public final ip k() {
        if (this.r == null) {
            WindowInsets windowInsets = this.c;
            this.r = ip.c(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.r;
    }

    @Override // defpackage.xb0
    public boolean r() {
        return this.c.isConsumed();
    }

    @Override // defpackage.xb0
    public void w(ip ipVar) {
        this.r = ipVar;
    }
}
