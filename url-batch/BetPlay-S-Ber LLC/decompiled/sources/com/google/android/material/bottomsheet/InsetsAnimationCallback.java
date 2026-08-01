package com.google.android.material.bottomsheet;

import android.view.View;
import defpackage.ac0;
import defpackage.gb0;
import defpackage.o3;
import defpackage.ya0;
import defpackage.za0;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-9fea5842fe02e932dfed9a581eb1db18ad6fbe2fdbe2eb471e1a0b06e64b43e7 */
/* loaded from: classes.dex */
class InsetsAnimationCallback extends za0 {
    private int startTranslationY;
    private int startY;
    private final int[] tmpLocation = new int[2];
    private final View view;

    public InsetsAnimationCallback(View view) {
        this.view = view;
    }

    @Override // defpackage.za0
    public void onEnd(gb0 gb0Var) {
        this.view.setTranslationY(0.0f);
    }

    @Override // defpackage.za0
    public void onPrepare(gb0 gb0Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        this.startY = this.tmpLocation[1];
    }

    @Override // defpackage.za0
    public ac0 onProgress(ac0 ac0Var, List<gb0> list) {
        Iterator<gb0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().a.d() & 8) != 0) {
                this.view.setTranslationY(o3.c(this.startTranslationY, 0, r0.a.c()));
                break;
            }
        }
        return ac0Var;
    }

    @Override // defpackage.za0
    public ya0 onStart(gb0 gb0Var, ya0 ya0Var) {
        this.view.getLocationOnScreen(this.tmpLocation);
        int i = this.startY - this.tmpLocation[1];
        this.startTranslationY = i;
        this.view.setTranslationY(i);
        return ya0Var;
    }
}
