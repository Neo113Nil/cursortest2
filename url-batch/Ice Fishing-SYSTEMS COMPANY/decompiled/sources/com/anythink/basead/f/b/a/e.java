package com.anythink.basead.f.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends d {

    /* renamed from: a, reason: collision with root package name */
    com.anythink.basead.f.c.d f9046a;

    public e(Context context, bj bjVar, x xVar, com.anythink.basead.f.c.d dVar, boolean z8) {
        super(context, bjVar, xVar, z8);
        this.f9046a = dVar;
        if (dVar != null) {
            dVar.b();
        }
        this.f9045z = this.f9046a.c();
    }

    @Override // com.anythink.basead.f.b.a.d
    public final View H() {
        return this.f9046a.d();
    }

    @Override // com.anythink.basead.f.a
    public final void a(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
    }

    @Override // com.anythink.basead.f.a
    public final ViewGroup b() {
        return null;
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final boolean p() {
        return true;
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void r() {
        super.r();
        try {
            com.anythink.basead.f.c.d dVar = this.f9046a;
            if (dVar != null) {
                dVar.i();
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void s() {
        super.s();
        com.anythink.basead.f.c.d dVar = this.f9046a;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void t() {
        super.t();
        com.anythink.basead.f.c.d dVar = this.f9046a;
        if (dVar != null) {
            dVar.f();
        }
    }

    @Override // com.anythink.basead.f.a
    public final View a(Context context, boolean z8, BaseMediaATView.a aVar) {
        com.anythink.basead.f.c.d dVar = this.f9046a;
        if (dVar == null) {
            return null;
        }
        dVar.a(z8 ? 1 : 0);
        return this.f9046a.d();
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(int i, int i4) {
        super.a(i, i4);
        if (this.f9033B <= 0) {
            this.f9033B = (int) ((this.f9032A * 3.0f) / 4.0f);
        }
        com.anythink.basead.f.c.d dVar = this.f9046a;
        if (dVar != null) {
            dVar.a(i4, i);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(com.anythink.basead.g.a aVar) {
        super.a(aVar);
        com.anythink.basead.f.c.d dVar = this.f9046a;
        if (dVar != null) {
            dVar.a(aVar);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(boolean z8) {
        super.a(z8);
        com.anythink.basead.f.c.d dVar = this.f9046a;
        if (dVar != null) {
            dVar.b(z8 ? 1 : 2);
        }
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final void a(String str) {
        super.a(str);
        if (this.f9046a != null) {
            if (!TextUtils.isEmpty(this.f9044y)) {
                String str2 = this.f9044y;
                str2.getClass();
                switch (str2) {
                    case "1":
                        this.f9046a.c(3);
                        break;
                    case "2":
                        this.f9046a.c(1);
                        break;
                    case "3":
                        this.f9046a.c(2);
                        break;
                }
                return;
            }
            this.f9046a.c(3);
        }
    }
}
