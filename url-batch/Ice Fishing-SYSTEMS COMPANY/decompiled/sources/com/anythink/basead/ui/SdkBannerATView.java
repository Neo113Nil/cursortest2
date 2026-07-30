package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.b.c.i;
import com.anythink.basead.d.j;
import com.anythink.basead.ui.component.a;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.res.image.RecycleImageView;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes.dex */
public class SdkBannerATView extends BaseBannerATView {

    /* renamed from: D, reason: collision with root package name */
    private static final int f10401D = 1;

    /* renamed from: E, reason: collision with root package name */
    private static final int f10402E = 2;

    /* renamed from: A, reason: collision with root package name */
    String f10403A;

    /* renamed from: B, reason: collision with root package name */
    SimplePlayerBannerMediaView f10404B;

    /* renamed from: C, reason: collision with root package name */
    private int f10405C;

    /* renamed from: F, reason: collision with root package name */
    private final View.OnClickListener f10406F;

    /* renamed from: G, reason: collision with root package name */
    private final View.OnClickListener f10407G;

    /* renamed from: com.anythink.basead.ui.SdkBannerATView$3, reason: invalid class name */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ RoundImageView f10410a;

        public AnonymousClass3(RoundImageView roundImageView) {
            this.f10410a = roundImageView;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(SdkBannerATView.this.f9893g.z(), str)) {
                this.f10410a.setImageBitmap(bitmap);
            }
        }
    }

    public SdkBannerATView(Context context) {
        super(context);
        this.f10406F = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView.this.a(1, 3);
            }
        };
        this.f10407G = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f9902q;
                if (view2 == null || view2 != view) {
                    sdkBannerATView.a(1, 2);
                } else {
                    sdkBannerATView.a(1, 1);
                }
            }
        };
    }

    private void w() {
        RoundImageView roundImageView = (RoundImageView) i.h(this, "myoffer_banner_icon", "id");
        TextView textView = (TextView) i.h(this, "myoffer_banner_ad_title", "id");
        TextView textView2 = (TextView) i.h(this, "myoffer_banner_desc", "id");
        Button button = (Button) i.h(this, "myoffer_banner_ad_install_btn", "id");
        this.f9902q = button;
        this.f9972b = (CloseImageView) i.h(this, "myoffer_banner_close", "id");
        if (this.f9892f.f14325o.E() == 0) {
            this.f9972b.setVisibility(0);
            a((b) this.f9972b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f9972b, true);
        }
        if (roundImageView != null) {
            if (TextUtils.isEmpty(this.f9893g.z())) {
                roundImageView.setVisibility(0);
                com.anythink.basead.ui.f.b.a((View) roundImageView, false);
            } else {
                ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                roundImageView.setVisibility(0);
                roundImageView.setRadiusInDip(6);
                roundImageView.setNeedRadiu(true);
                this.f9899n.add(roundImageView);
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), layoutParams.width, layoutParams.height, new AnonymousClass3(roundImageView));
            }
        }
        if (TextUtils.isEmpty(this.f9893g.D())) {
            button.setVisibility(8);
        } else {
            button.setText(this.f9893g.D());
            button.setVisibility(0);
            this.f9899n.add(button);
            this.f9900o = button;
        }
        if (TextUtils.isEmpty(this.f9893g.x())) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f9893g.x());
            textView.setVisibility(0);
            this.f9899n.add(textView);
        }
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.f9893g.y())) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.f9893g.y());
                textView2.setVisibility(0);
                this.f9899n.add(textView2);
            }
        }
        a((ViewGroup) i.h(this, "myoffer_main_resouce_container", "id"), (String) null);
    }

    @Override // com.anythink.basead.ui.BaseATView
    public void destroy() {
        super.destroy();
        SimplePlayerBannerMediaView simplePlayerBannerMediaView = this.f10404B;
        if (simplePlayerBannerMediaView != null) {
            simplePlayerBannerMediaView.destroyPlayerView(4);
        }
    }

    private int a(String str) {
        w wVar = this.f9893g;
        int i = 1;
        if (!(wVar instanceof bj) ? !(wVar instanceof ay) || TextUtils.equals(str, wVar.B()) : ((bj) wVar).aJ() != 1) {
            i = 2;
        }
        this.f10405C = i;
        return i;
    }

    private void b(String str) {
        RelativeLayout relativeLayout = (RelativeLayout) i.h(this, "myoffer_banner_root", "id");
        this.f9972b = (CloseImageView) i.h(this, "myoffer_banner_close", "id");
        if (this.f9892f.f14325o.E() == 0) {
            this.f9972b.setVisibility(0);
            if (TextUtils.equals(y.f14337d, this.f10403A)) {
                ViewGroup.LayoutParams layoutParams = this.f9972b.getLayoutParams();
                layoutParams.width = q.a(getContext(), 23.0f);
                layoutParams.height = q.a(getContext(), 23.0f);
                this.f9972b.setLayoutParams(layoutParams);
            }
            a((b) this.f9972b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f9972b, true);
        }
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams2.width = -1;
        layoutParams2.height = -1;
        relativeLayout.setLayoutParams(layoutParams2);
        a(this, str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void d() {
        char c4;
        String str;
        int a9;
        int a10;
        String D8 = this.f9892f.f14325o.D();
        String d2 = this.f9893g.d((w) this.f9892f.f14325o);
        switch (D8.hashCode()) {
            case -559799608:
                if (D8.equals(y.f14336c)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809730:
                if (D8.equals(y.f14334a)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809854:
                if (D8.equals(y.f14335b)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1622564786:
                if (D8.equals(y.f14337d)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 == 0) {
            this.f10403A = y.f14335b;
            str = (this.f9893g.L() || !TextUtils.isEmpty(d2)) ? "myoffer_banner_ad_layout_320x90" : "myoffer_banner_ad_layout_no_main_res_320x90";
        } else if (c4 == 1) {
            this.f10403A = y.f14336c;
            str = "myoffer_banner_ad_layout_300x250";
        } else if (c4 != 2) {
            this.f10403A = y.f14334a;
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.f10403A = y.f14337d;
            str = "myoffer_banner_ad_layout_728x90";
        }
        w wVar = this.f9893g;
        int i = (!(wVar instanceof bj) ? !(!(wVar instanceof ay) || TextUtils.equals(d2, wVar.B())) : ((bj) wVar).aJ() == 1) ? 2 : 1;
        this.f10405C = i;
        if (1 != i) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), str, "layout"), this);
            RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_banner_icon", "id"));
            TextView textView = (TextView) i.h(this, "myoffer_banner_ad_title", "id");
            TextView textView2 = (TextView) i.h(this, "myoffer_banner_desc", "id");
            Button button = (Button) i.h(this, "myoffer_banner_ad_install_btn", "id");
            this.f9902q = button;
            this.f9972b = (CloseImageView) i.h(this, "myoffer_banner_close", "id");
            if (this.f9892f.f14325o.E() == 0) {
                this.f9972b.setVisibility(0);
                a((b) this.f9972b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f9972b, true);
            }
            if (roundImageView != null) {
                if (TextUtils.isEmpty(this.f9893g.z())) {
                    roundImageView.setVisibility(0);
                    com.anythink.basead.ui.f.b.a((View) roundImageView, false);
                } else {
                    ViewGroup.LayoutParams layoutParams = roundImageView.getLayoutParams();
                    roundImageView.setVisibility(0);
                    roundImageView.setRadiusInDip(6);
                    roundImageView.setNeedRadiu(true);
                    this.f9899n.add(roundImageView);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), layoutParams.width, layoutParams.height, new AnonymousClass3(roundImageView));
                }
            }
            if (TextUtils.isEmpty(this.f9893g.D())) {
                button.setVisibility(8);
            } else {
                button.setText(this.f9893g.D());
                button.setVisibility(0);
                this.f9899n.add(button);
                this.f9900o = button;
            }
            if (TextUtils.isEmpty(this.f9893g.x())) {
                textView.setVisibility(8);
            } else {
                textView.setText(this.f9893g.x());
                textView.setVisibility(0);
                this.f9899n.add(textView);
            }
            if (textView2 != null) {
                if (TextUtils.isEmpty(this.f9893g.y())) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(this.f9893g.y());
                    textView2.setVisibility(0);
                    this.f9899n.add(textView2);
                }
            }
            a((ViewGroup) i.h(this, "myoffer_main_resouce_container", "id"), (String) null);
            return;
        }
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
        a9 = q.a(getContext(), 320.0f);
        a10 = q.a(getContext(), 50.0f);
        switch (D8) {
            case "300x250":
                a9 = q.a(getContext(), 300.0f);
                a10 = q.a(getContext(), 250.0f);
                break;
            case "320x50":
                a9 = q.a(getContext(), 320.0f);
                a10 = q.a(getContext(), 50.0f);
                break;
            case "320x90":
                a9 = q.a(getContext(), 320.0f);
                a10 = q.a(getContext(), 90.0f);
                break;
            case "728x90":
                a9 = q.a(getContext(), 720.0f);
                a10 = q.a(getContext(), 90.0f);
                break;
        }
        if (this.f9892f.f14325o.k() > 0) {
            a9 = this.f9892f.f14325o.k();
        }
        if (this.f9892f.f14325o.l() > 0) {
            a10 = this.f9892f.f14325o.l();
        }
        setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_banner_root", "id"));
        this.f9972b = (CloseImageView) i.h(this, "myoffer_banner_close", "id");
        if (this.f9892f.f14325o.E() == 0) {
            this.f9972b.setVisibility(0);
            if (TextUtils.equals(y.f14337d, this.f10403A)) {
                ViewGroup.LayoutParams layoutParams2 = this.f9972b.getLayoutParams();
                layoutParams2.width = q.a(getContext(), 23.0f);
                layoutParams2.height = q.a(getContext(), 23.0f);
                this.f9972b.setLayoutParams(layoutParams2);
            }
            a((b) this.f9972b, false);
        } else {
            com.anythink.basead.ui.f.b.a((View) this.f9972b, true);
        }
        RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        relativeLayout.setLayoutParams(layoutParams3);
        a(this, d2);
    }

    @Override // com.anythink.basead.ui.BaseBannerATView
    public final void c() {
        super.c();
        if (this.f10405C == 1) {
            setOnClickListener(this.f10406F);
            return;
        }
        if (this.f9892f.f14325o.J() == 1) {
            View view = this.f9902q;
            if (view != null) {
                view.setOnClickListener(this.f10407G);
            }
        } else {
            int size = this.f9899n.size();
            for (int i = 0; i < size; i++) {
                View view2 = this.f9899n.get(i);
                if (view2 != null) {
                    view2.setOnClickListener(this.f10407G);
                }
            }
        }
        if (this.f9892f.f14325o.J() == 0) {
            setOnClickListener(this.f10406F);
        }
    }

    public SdkBannerATView(Context context, x xVar, w wVar, com.anythink.basead.g.a aVar) {
        super(context, xVar, wVar, aVar);
        this.f10406F = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView.this.a(1, 3);
            }
        };
        this.f10407G = new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SdkBannerATView sdkBannerATView = SdkBannerATView.this;
                View view2 = sdkBannerATView.f9902q;
                if (view2 == null || view2 != view) {
                    sdkBannerATView.a(1, 2);
                } else {
                    sdkBannerATView.a(1, 1);
                }
            }
        };
        b();
        c();
    }

    private void a(ViewGroup viewGroup, final String str) {
        if (viewGroup != null) {
            if (com.anythink.basead.b.e.a(this.f9893g, this.f9892f)) {
                SimplePlayerBannerMediaView simplePlayerBannerMediaView = new SimplePlayerBannerMediaView(getContext());
                this.f10404B = simplePlayerBannerMediaView;
                simplePlayerBannerMediaView.setmIsPureMode(this.f10405C == 1);
                viewGroup.addView(this.f10404B, 0, new RelativeLayout.LayoutParams(-1, -1));
                this.f10404B.setATImproveClickViewController(this.f9904s);
                this.f10404B.setIsMuted(true);
                this.f10404B.initPlayerView(this.f9893g, this.f9892f, new a.InterfaceC0055a() { // from class: com.anythink.basead.ui.SdkBannerATView.4
                    @Override // com.anythink.basead.ui.component.a.InterfaceC0055a
                    public final j a() {
                        return SdkBannerATView.this.l();
                    }

                    @Override // com.anythink.basead.ui.component.a.InterfaceC0055a
                    public final com.anythink.basead.d.a b() {
                        return SdkBannerATView.this.m();
                    }
                }, this.f9911z);
                this.f10404B.setPlayerOnClickListener(new View.OnClickListener() { // from class: com.anythink.basead.ui.SdkBannerATView.5
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        SdkBannerATView.this.f10407G.onClick(view);
                    }
                });
            } else {
                if (TextUtils.isEmpty(str)) {
                    str = this.f9893g.d((w) this.f9892f.f14325o);
                }
                if (TextUtils.isEmpty(str)) {
                    str = this.f9893g.z();
                }
                if (!TextUtils.isEmpty(str)) {
                    final RecycleImageView recycleImageView = new RecycleImageView(getContext());
                    recycleImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    final RecycleImageView recycleImageView2 = new RecycleImageView(getContext());
                    recycleImageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    viewGroup.addView(recycleImageView2, 0, new RelativeLayout.LayoutParams(-1, -1));
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, str), new b.a() { // from class: com.anythink.basead.ui.SdkBannerATView.6
                        @Override // com.anythink.core.common.res.b.a
                        public final void onFail(String str2, String str3) {
                        }

                        @Override // com.anythink.core.common.res.b.a
                        public final void onSuccess(String str2, Bitmap bitmap) {
                            if (TextUtils.equals(str, str2)) {
                                recycleImageView.setImageBitmap(bitmap);
                                h.a(SdkBannerATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SdkBannerATView.6.1
                                    @Override // com.anythink.core.common.v.h.a
                                    public final void a() {
                                    }

                                    @Override // com.anythink.core.common.v.h.a
                                    public final void a(Bitmap bitmap2) {
                                        recycleImageView2.setImageBitmap(bitmap2);
                                    }
                                });
                            }
                        }
                    });
                    viewGroup.addView(recycleImageView, 1, new RelativeLayout.LayoutParams(-1, -1));
                    this.f9899n.add(recycleImageView);
                } else {
                    viewGroup.setVisibility(8);
                    return;
                }
            }
            viewGroup.setVisibility(0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.anythink.basead.ui.BaseATView
    public final void a() {
        char c4;
        String str;
        int a9;
        int a10;
        String D8 = this.f9892f.f14325o.D();
        String d2 = this.f9893g.d((w) this.f9892f.f14325o);
        switch (D8.hashCode()) {
            case -559799608:
                if (D8.equals(y.f14336c)) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809730:
                if (D8.equals(y.f14334a)) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case 1507809854:
                if (D8.equals(y.f14335b)) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case 1622564786:
                if (D8.equals(y.f14337d)) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        if (c4 == 0) {
            this.f10403A = y.f14335b;
            if (!this.f9893g.L() && TextUtils.isEmpty(d2)) {
                str = "myoffer_banner_ad_layout_no_main_res_320x90";
            } else {
                str = "myoffer_banner_ad_layout_320x90";
            }
        } else if (c4 == 1) {
            this.f10403A = y.f14336c;
            str = "myoffer_banner_ad_layout_300x250";
        } else if (c4 != 2) {
            this.f10403A = y.f14334a;
            str = "myoffer_banner_ad_layout_320x50";
        } else {
            this.f10403A = y.f14337d;
            str = "myoffer_banner_ad_layout_728x90";
        }
        w wVar = this.f9893g;
        int i = (!(wVar instanceof bj) ? !(!(wVar instanceof ay) || TextUtils.equals(d2, wVar.B())) : ((bj) wVar).aJ() == 1) ? 2 : 1;
        this.f10405C = i;
        if (1 == i) {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_banner_ad_layout_pure_picture", "layout"), this);
            a9 = q.a(getContext(), 320.0f);
            a10 = q.a(getContext(), 50.0f);
            switch (D8) {
                case "300x250":
                    a9 = q.a(getContext(), 300.0f);
                    a10 = q.a(getContext(), 250.0f);
                    break;
                case "320x50":
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 50.0f);
                    break;
                case "320x90":
                    a9 = q.a(getContext(), 320.0f);
                    a10 = q.a(getContext(), 90.0f);
                    break;
                case "728x90":
                    a9 = q.a(getContext(), 720.0f);
                    a10 = q.a(getContext(), 90.0f);
                    break;
            }
            if (this.f9892f.f14325o.k() > 0) {
                a9 = this.f9892f.f14325o.k();
            }
            if (this.f9892f.f14325o.l() > 0) {
                a10 = this.f9892f.f14325o.l();
            }
            setLayoutParams(new ViewGroup.LayoutParams(Math.min(a9, getResources().getDisplayMetrics().widthPixels), a10));
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(q.a(getContext(), "myoffer_banner_root", "id"));
            this.f9972b = (CloseImageView) i.h(this, "myoffer_banner_close", "id");
            if (this.f9892f.f14325o.E() == 0) {
                this.f9972b.setVisibility(0);
                if (TextUtils.equals(y.f14337d, this.f10403A)) {
                    ViewGroup.LayoutParams layoutParams = this.f9972b.getLayoutParams();
                    layoutParams.width = q.a(getContext(), 23.0f);
                    layoutParams.height = q.a(getContext(), 23.0f);
                    this.f9972b.setLayoutParams(layoutParams);
                }
                a((b) this.f9972b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f9972b, true);
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            relativeLayout.setLayoutParams(layoutParams2);
            a(this, d2);
        } else {
            LayoutInflater.from(getContext()).inflate(q.a(getContext(), str, "layout"), this);
            RoundImageView roundImageView = (RoundImageView) findViewById(q.a(getContext(), "myoffer_banner_icon", "id"));
            TextView textView = (TextView) i.h(this, "myoffer_banner_ad_title", "id");
            TextView textView2 = (TextView) i.h(this, "myoffer_banner_desc", "id");
            Button button = (Button) i.h(this, "myoffer_banner_ad_install_btn", "id");
            this.f9902q = button;
            this.f9972b = (CloseImageView) i.h(this, "myoffer_banner_close", "id");
            if (this.f9892f.f14325o.E() == 0) {
                this.f9972b.setVisibility(0);
                a((b) this.f9972b, false);
            } else {
                com.anythink.basead.ui.f.b.a((View) this.f9972b, true);
            }
            if (roundImageView != null) {
                if (!TextUtils.isEmpty(this.f9893g.z())) {
                    ViewGroup.LayoutParams layoutParams3 = roundImageView.getLayoutParams();
                    roundImageView.setVisibility(0);
                    roundImageView.setRadiusInDip(6);
                    roundImageView.setNeedRadiu(true);
                    this.f9899n.add(roundImageView);
                    com.anythink.core.common.res.b.a(getContext()).a(new e(1, this.f9893g.z()), layoutParams3.width, layoutParams3.height, new AnonymousClass3(roundImageView));
                } else {
                    roundImageView.setVisibility(0);
                    com.anythink.basead.ui.f.b.a((View) roundImageView, false);
                }
            }
            if (!TextUtils.isEmpty(this.f9893g.D())) {
                button.setText(this.f9893g.D());
                button.setVisibility(0);
                this.f9899n.add(button);
                this.f9900o = button;
            } else {
                button.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f9893g.x())) {
                textView.setText(this.f9893g.x());
                textView.setVisibility(0);
                this.f9899n.add(textView);
            } else {
                textView.setVisibility(8);
            }
            if (textView2 != null) {
                if (!TextUtils.isEmpty(this.f9893g.y())) {
                    textView2.setText(this.f9893g.y());
                    textView2.setVisibility(0);
                    this.f9899n.add(textView2);
                } else {
                    textView2.setVisibility(8);
                }
            }
            a((ViewGroup) i.h(this, "myoffer_main_resouce_container", "id"), (String) null);
        }
        com.anythink.basead.ui.f.a aVar = new com.anythink.basead.ui.f.a(this.f9893g, this.f9892f);
        this.f9974d = aVar;
        aVar.b(this);
    }
}
