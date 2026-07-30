package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.ui.animplayerview.BasePlayerView;
import com.anythink.basead.ui.f.b;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LetterHalfScreenATView extends HalfScreenATView {
    com.anythink.basead.b.d.a an;
    int ao;
    int ap;

    /* renamed from: com.anythink.basead.ui.LetterHalfScreenATView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.ui.f.b.a
        public final void a(int i, int i4) {
            LetterHalfScreenATView.this.a(i, i4);
        }
    }

    public LetterHalfScreenATView(Context context) {
        super(context);
    }

    private void ah() {
        this.an.a(this.f9893g, this.f9892f, new AnonymousClass2());
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void F() {
        super.F();
        com.anythink.basead.b.d.a aVar = this.an;
        if (aVar != null) {
            aVar.c();
        }
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void Q() {
        if (b(this.f10001E)) {
            super.Q();
        } else {
            aa().setVisibility(8);
        }
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void U() {
        BasePlayerView l9 = this.f9903r.l();
        if (l9 != null) {
            this.f10010O.setPadding(l9.getPaddingLeft(), l9.getPaddingTop(), l9.getPaddingRight(), l9.getPaddingBottom());
        }
        super.U();
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseATView
    public final void a() {
        this.ao = q.a(getContext(), 38.0f);
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_half_screen_letter_vertical", "layout"), this);
        int i = this.ao;
        setPadding(i, 0, i, 0);
        setBackgroundResource(q.a(getContext(), "dailog_background_color", k.f19791d));
    }

    @Override // com.anythink.basead.ui.HalfScreenATView
    public final int af() {
        return 9;
    }

    @Override // com.anythink.basead.ui.HalfScreenATView
    public final void ag() {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f10009N.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f10008M.getLayoutParams();
        BasePlayerView l9 = this.f9903r.l();
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) l9.getLayoutParams();
        int i = this.f10021c;
        int i4 = (i - layoutParams2.leftMargin) - layoutParams2.rightMargin;
        int i9 = this.ao;
        int i10 = i4 - (i9 * 2);
        this.f9997A = i10;
        this.f9998B = i10;
        this.an.a(i - (i9 * 2));
        int a9 = this.an.a();
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        this.f10008M.setLayoutParams(layoutParams2);
        layoutParams3.width = this.f9997A;
        layoutParams3.height = this.f9998B;
        l9.setLayoutParams(layoutParams3);
        layoutParams.width = -1;
        layoutParams.height = -2;
        layoutParams.topMargin = this.f9998B;
        layoutParams.bottomMargin = this.an.b();
        this.f10009N.setLayoutParams(layoutParams);
        PanelView panelView = this.f10009N;
        panelView.setPadding(panelView.getPaddingLeft(), this.f10009N.getPaddingTop(), this.f10009N.getPaddingRight(), q.a(getContext(), 9.0f) + (a9 - this.an.b()));
        if (!b(this.f10001E)) {
            layoutParams3.bottomMargin = this.an.b();
            layoutParams3.height = (this.an.a() + this.f9998B) - (this.an.b() * 2);
            l9.setLayoutParams(layoutParams3);
            l9.setPadding(l9.getPaddingLeft(), l9.getPaddingTop(), l9.getPaddingRight(), this.an.a() - (this.an.b() * 2));
        }
        this.ap = layoutParams3.height;
        this.an.a(this.f10008M);
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final void b() {
        y yVar;
        super.b();
        x xVar = this.f9892f;
        if (xVar == null || (yVar = xVar.f14325o) == null || yVar.J() != 0) {
            return;
        }
        this.f10008M.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.LetterHalfScreenATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LetterHalfScreenATView.this.a(1, 7);
            }
        });
    }

    @Override // com.anythink.basead.ui.BaseScreenATView
    public final void c() {
        super.c();
        com.anythink.basead.b.d.a aVar = new com.anythink.basead.b.d.a(getContext());
        this.an = aVar;
        aVar.a((RelativeLayout) this.f10008M.getParent(), this.f10008M.getId());
        this.f9902q = this.an.d();
        this.an.a(this.f9893g, this.f9892f, new AnonymousClass2());
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView, com.anythink.basead.ui.BaseATView
    public final RelativeLayout.LayoutParams q() {
        int i = (this.ap * 2) / 3;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, i, 0, 0);
        return layoutParams;
    }

    public LetterHalfScreenATView(Context context, x xVar, w wVar, String str, int i, int i4) {
        super(context, xVar, wVar, str, i, i4);
        if (this.f9904s != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(g.a.f11323a, 1);
            this.f9904s.a(hashMap);
        }
    }

    @Override // com.anythink.basead.ui.HalfScreenATView, com.anythink.basead.ui.BaseScreenATView
    public final boolean b(int i) {
        if (this.f9893g.n()) {
            return false;
        }
        return (TextUtils.isEmpty(this.f9893g.z()) && TextUtils.isEmpty(this.f9893g.x()) && TextUtils.isEmpty(this.f9893g.y())) ? false : true;
    }
}
