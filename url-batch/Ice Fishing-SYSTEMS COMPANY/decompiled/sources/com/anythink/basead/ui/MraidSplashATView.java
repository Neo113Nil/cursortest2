package com.anythink.basead.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.anythink.basead.d.g;
import com.anythink.basead.ui.MraidContainerView;
import com.anythink.basead.ui.f.d;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class MraidSplashATView extends BaseSplashATView {

    /* renamed from: a, reason: collision with root package name */
    MraidContainerView f10310a;

    /* renamed from: b, reason: collision with root package name */
    boolean f10311b;

    /* renamed from: com.anythink.basead.ui.MraidSplashATView$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            MraidSplashATView mraidSplashATView = MraidSplashATView.this;
            if (mraidSplashATView.f10098O == null) {
                return;
            }
            mraidSplashATView.j();
        }
    }

    public MraidSplashATView(Context context) {
        super(context);
    }

    private void c() {
        if (this.f9893g.n() && this.f10310a == null) {
            return;
        }
        super.a(this.f9892f.f14325o.ab() < 0 ? 100 : this.f9892f.f14325o.ab(), new AnonymousClass3());
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        MraidContainerView mraidContainerView = this.f10310a;
        if (mraidContainerView != null) {
            mraidContainerView.release();
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView, android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        MraidContainerView mraidContainerView = this.f10310a;
        if (mraidContainerView != null) {
            mraidContainerView.fireMraidIsViewable(z8);
        }
    }

    @Override // com.anythink.basead.ui.BaseSplashATView
    public final void x() {
        int size = this.f9899n.size();
        for (int i = 0; i < size; i++) {
            View view = this.f9899n.get(i);
            if (view != null) {
                view.setOnClickListener(this.f10102S);
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.MraidSplashATView$2, reason: invalid class name */
    public class AnonymousClass2 implements MraidContainerView.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a(String str) {
            MraidSplashATView.this.f9893g.w(str);
            MraidSplashATView.this.a(1, 13);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void b() {
            MraidSplashATView.this.a(106);
            MraidSplashATView.this.x();
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void c() {
            MraidSplashATView.this.a(g.a(g.f6336k, g.f6323V));
            MraidSplashATView.this.a(true, 5);
        }

        @Override // com.anythink.basead.ui.MraidContainerView.a
        public final void a() {
            try {
                MraidSplashATView.a(MraidSplashATView.this);
            } catch (Throwable unused) {
            }
        }
    }

    public MraidSplashATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
    }

    private void b() {
        if (this.f9911z != null) {
            a((View) this);
            this.f9911z.a(findViewById(q.a(getContext(), "myoffer_splash_skip_area", "id")));
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f9893g, this.f9892f, this.f9911z, new AnonymousClass2());
        this.f10310a = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f10310a.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            this.f10310a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f10310a);
        }
    }

    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_web_splash_ad_layout", "layout"), this);
        d dVar = this.f10103T;
        if (dVar != null) {
            dVar.a(d.f10958c).a(new com.anythink.basead.ui.d.a() { // from class: com.anythink.basead.ui.MraidSplashATView.1
                @Override // com.anythink.basead.ui.d.a
                public final void a(int i, int i4) {
                    MraidSplashATView.this.a(i, i4);
                }
            }).a(getContext(), this);
        }
        if (this.f9911z != null) {
            a((View) this);
            this.f9911z.a(findViewById(q.a(getContext(), "myoffer_splash_skip_area", "id")));
        }
        MraidContainerView mraidContainerView = new MraidContainerView(getContext(), this.f9893g, this.f9892f, this.f9911z, new AnonymousClass2());
        this.f10310a = mraidContainerView;
        mraidContainerView.setNeedRegisterVolumeChangeReceiver(true);
        this.f10310a.init();
        FrameLayout frameLayout = (FrameLayout) findViewById(q.a(getContext(), "myoffer_splash_web", "id"));
        if (frameLayout != null) {
            this.f10310a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(this.f10310a);
        }
    }

    public static /* synthetic */ void a(MraidSplashATView mraidSplashATView) {
        if (mraidSplashATView.f9893g.n() && mraidSplashATView.f10310a == null) {
            return;
        }
        super.a(mraidSplashATView.f9892f.f14325o.ab() < 0 ? 100 : mraidSplashATView.f9892f.f14325o.ab(), mraidSplashATView.new AnonymousClass3());
    }
}
