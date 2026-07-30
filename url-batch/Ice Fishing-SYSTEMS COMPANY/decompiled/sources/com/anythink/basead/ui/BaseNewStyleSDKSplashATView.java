package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.b.e;
import com.anythink.basead.b.f;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.h;

/* loaded from: classes.dex */
public abstract class BaseNewStyleSDKSplashATView extends BaseSdkSplashATView {

    /* renamed from: A, reason: collision with root package name */
    int f9994A;

    /* renamed from: B, reason: collision with root package name */
    int f9995B;

    /* renamed from: a, reason: collision with root package name */
    private boolean f9996a;

    public BaseNewStyleSDKSplashATView(Context context) {
        super(context);
    }

    private void D() {
        String B8 = this.f9893g.B();
        if (TextUtils.isEmpty(B8)) {
            if (this.f9893g.V() <= 0 || this.f9893g.W() <= 0) {
                return;
            }
            this.f9994A = this.f9893g.V();
            this.f9995B = this.f9893g.W();
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B8));
        if (a9 != null) {
            this.f9994A = a9[0];
            this.f9995B = a9[1];
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final void a(boolean z8, int i) {
        int i4;
        super.a(z8, i);
        if (this.f9996a) {
            return;
        }
        this.f9996a = true;
        x xVar = this.f9892f;
        w wVar = this.f9893g;
        e.a(xVar);
        int i9 = 2;
        if (this.f9994A > this.f9995B) {
            i4 = 2;
        } else {
            i4 = 2;
            i9 = 1;
        }
        com.anythink.core.common.u.e.a(xVar, wVar, 1, i9, BaseSdkSplashATView.isSinglePicture(this.f9893g, this.f9892f.f14325o) ? i4 : 1, this.f9909x, this.f9910y);
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public final void e() {
        super.e();
        String B8 = this.f9893g.B();
        if (TextUtils.isEmpty(B8)) {
            if (this.f9893g.V() <= 0 || this.f9893g.W() <= 0) {
                return;
            }
            this.f9994A = this.f9893g.V();
            this.f9995B = this.f9893g.W();
            return;
        }
        f.a();
        int[] a9 = h.a(f.a(1, B8));
        if (a9 != null) {
            this.f9994A = a9[0];
            this.f9995B = a9[1];
        }
    }

    public BaseNewStyleSDKSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }
}
