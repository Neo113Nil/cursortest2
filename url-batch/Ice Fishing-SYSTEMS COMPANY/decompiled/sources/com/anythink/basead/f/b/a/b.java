package com.anythink.basead.f.b.a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.e;
import com.anythink.basead.ui.BaseMediaATView;
import com.anythink.basead.ui.OwnNativeATView;
import com.anythink.basead.ui.SimpleMediaATView;
import com.anythink.basead.ui.SimplePlayerMediaView;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: p, reason: collision with root package name */
    FrameLayout f9024p;

    public b(Context context, bj bjVar, x xVar, boolean z8) {
        super(context, bjVar, xVar, z8);
    }

    @Override // com.anythink.basead.f.b.a.d, com.anythink.basead.f.a
    public final View B() {
        if (!com.anythink.basead.b.e.a(this.f9039t)) {
            return null;
        }
        if (this.f9024p == null) {
            FrameLayout frameLayout = new FrameLayout(this.f9037r);
            this.f9024p = frameLayout;
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            this.f9005l.put(g.a.f11324b, this.f9024p);
        }
        return this.f9024p;
    }

    @Override // com.anythink.basead.f.b.a.a
    public final View L() {
        View[] viewArr = new View[1];
        a(this.f8997c, viewArr);
        if (viewArr[0] == null) {
            return this.f8997c;
        }
        this.f8998d = new WeakReference<>(viewArr[0]);
        return viewArr[0];
    }

    @Override // com.anythink.basead.f.a
    public final View a(Context context, boolean z8, BaseMediaATView.a aVar) {
        y yVar;
        if (this.f9045z == 1 && !TextUtils.isEmpty(this.f9038s.E())) {
            SimplePlayerMediaView simplePlayerMediaView = new SimplePlayerMediaView(context);
            a((com.anythink.basead.ui.a) simplePlayerMediaView);
            return simplePlayerMediaView;
        }
        if (TextUtils.isEmpty(this.f9038s.B())) {
            return null;
        }
        SimpleMediaATView simpleMediaATView = new SimpleMediaATView(context);
        simpleMediaATView.initView(this.f9038s);
        x xVar = this.f9039t;
        if (xVar != null && (yVar = xVar.f14325o) != null && yVar.J() != 1) {
            simpleMediaATView.setOnClickListener(this.f9007n);
        }
        return simpleMediaATView;
    }

    @Override // com.anythink.basead.f.a
    public final ViewGroup b() {
        OwnNativeATView G7 = G();
        this.f8997c = G7;
        return G7;
    }

    @Override // com.anythink.basead.f.b.a.a, com.anythink.basead.f.a
    public final void a(View view, List<View> list, List<View> list2, FrameLayout.LayoutParams layoutParams, View view2) {
        bj bjVar;
        final Context context;
        super.a(view, list, list2, layoutParams, view2);
        if (this.f8997c == null || (bjVar = this.f9038s) == null || this.f9039t == null || TextUtils.isEmpty(bjVar.ak()) || (context = this.f8997c.getContext()) == null) {
            return;
        }
        ImageView imageView = new ImageView(context);
        int a9 = q.a(context, 5.0f);
        int a10 = q.a(context, 24.0f);
        int a11 = q.a(context, 4.0f);
        imageView.setPadding(a9, a9, a9, a9);
        imageView.setBackgroundResource(q.a(context, "myoffer_bg_feedback_button", k.f19790c));
        imageView.setImageResource(q.a(context, "myoffer_feedback_icon", k.f19790c));
        if (layoutParams != null) {
            layoutParams.width = a10;
            layoutParams.height = a10;
        } else {
            layoutParams = new FrameLayout.LayoutParams(a10, a10);
            layoutParams.gravity = 83;
            layoutParams.bottomMargin = a11;
            layoutParams.leftMargin = a11;
        }
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.f.b.a.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                com.anythink.basead.e eVar = new com.anythink.basead.e();
                Context context2 = context;
                b bVar = b.this;
                eVar.a(context2, bVar.f9038s, bVar.f9039t, new e.a() { // from class: com.anythink.basead.f.b.a.b.1.1
                    @Override // com.anythink.basead.e.a
                    public final void a() {
                    }

                    @Override // com.anythink.basead.e.a
                    public final void b() {
                    }
                });
            }
        });
        this.f8997c.addView(imageView, layoutParams);
    }

    private void a(View view, View[] viewArr) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                a(viewGroup.getChildAt(i), viewArr);
            }
            return;
        }
        if ((view instanceof TextView) && TextUtils.equals(((TextView) view).getText().toString(), this.f9038s.D())) {
            viewArr[0] = view;
        }
    }
}
