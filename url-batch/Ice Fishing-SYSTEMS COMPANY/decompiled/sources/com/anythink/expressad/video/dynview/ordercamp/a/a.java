package com.anythink.expressad.video.dynview.ordercamp.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.g.d.c;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.dynview.h.b;
import com.anythink.expressad.video.dynview.widget.ATRotationView;
import com.anythink.expressad.video.dynview.widget.AnyThinkImageView;
import com.anythink.expressad.video.dynview.widget.AnyThinkLevelLayoutView;
import com.anythink.expressad.video.dynview.widget.AnyThinkTextView;
import com.anythink.expressad.videocommon.view.RoundImageView;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public static final String f21462a = "template_config.json";

    /* renamed from: b, reason: collision with root package name */
    private static final String f21463b = "OrderCampAdapter";

    /* renamed from: f, reason: collision with root package name */
    private static final String f21464f = "anythink_lv_item_rl";

    /* renamed from: g, reason: collision with root package name */
    private static final String f21465g = "anythink_lv_iv";

    /* renamed from: h, reason: collision with root package name */
    private static final String f21466h = "anythink_lv_icon_iv";
    private static final String i = "anythink_lv_title_tv";

    /* renamed from: j, reason: collision with root package name */
    private static final String f21467j = "anythink_lv_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private static final String f21468k = "anythink_lv_sv_starlevel";

    /* renamed from: l, reason: collision with root package name */
    private static final String f21469l = "anythink_lv_sv_heat_level";

    /* renamed from: m, reason: collision with root package name */
    private static final String f21470m = "anythink_lv_ration";

    /* renamed from: n, reason: collision with root package name */
    private static final String f21471n = "anythink_lv_desc_tv";

    /* renamed from: o, reason: collision with root package name */
    private static final String f21472o = "anythink_iv_flag";

    /* renamed from: p, reason: collision with root package name */
    private static final String f21473p = "anythink_order_viewed_tv";

    /* renamed from: q, reason: collision with root package name */
    private static final String f21474q = "anythink_order_layout_item";

    /* renamed from: r, reason: collision with root package name */
    private static final String f21475r = "anythink_lv_iv_burl";

    /* renamed from: s, reason: collision with root package name */
    private static final String f21476s = "501";

    /* renamed from: t, reason: collision with root package name */
    private static final String f21477t = "\\.xml";

    /* renamed from: u, reason: collision with root package name */
    private static final String f21478u = "\\/xml";

    /* renamed from: v, reason: collision with root package name */
    private static final String f21479v = "_item.xml";

    /* renamed from: c, reason: collision with root package name */
    private boolean f21480c = false;

    /* renamed from: d, reason: collision with root package name */
    private C0138a f21481d;

    /* renamed from: e, reason: collision with root package name */
    private List<d> f21482e;

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$2, reason: invalid class name */
    public class AnonymousClass2 implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f21486a;

        public AnonymousClass2(Context context) {
            this.f21486a = context;
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(String str, String str2) {
        }

        @Override // com.anythink.expressad.foundation.g.d.c
        public final void a(Bitmap bitmap, String str) {
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            try {
                int b9 = v.b(this.f21486a, 12.0f);
                a.this.f21481d.f21496j.getLayoutParams().height = b9;
                a.this.f21481d.f21496j.getLayoutParams().width = (int) (b9 * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                a.this.f21481d.f21496j.setImageBitmap(bitmap);
                a.this.f21481d.f21496j.setBackgroundColor(1426063360);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com.anythink.expressad.video.dynview.ordercamp.a.a$a, reason: collision with other inner class name */
    public static class C0138a {

        /* renamed from: a, reason: collision with root package name */
        RelativeLayout f21488a;

        /* renamed from: b, reason: collision with root package name */
        ATRotationView f21489b;

        /* renamed from: c, reason: collision with root package name */
        AnyThinkImageView f21490c;

        /* renamed from: d, reason: collision with root package name */
        RoundImageView f21491d;

        /* renamed from: e, reason: collision with root package name */
        TextView f21492e;

        /* renamed from: f, reason: collision with root package name */
        TextView f21493f;

        /* renamed from: g, reason: collision with root package name */
        TextView f21494g;

        /* renamed from: h, reason: collision with root package name */
        TextView f21495h;
        AnyThinkLevelLayoutView i;

        /* renamed from: j, reason: collision with root package name */
        ImageView f21496j;
    }

    public a(List<d> list) {
        this.f21482e = list;
    }

    private View b() {
        View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f21474q, "layout"), (ViewGroup) null);
        C0138a c0138a = new C0138a();
        this.f21481d = c0138a;
        c0138a.f21490c = (AnyThinkImageView) inflate.findViewById(b(f21465g));
        this.f21481d.f21491d = (RoundImageView) inflate.findViewById(b(f21466h));
        this.f21481d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f21468k));
        this.f21481d.f21489b = (ATRotationView) inflate.findViewById(b(f21470m));
        inflate.setTag(this.f21481d);
        return inflate;
    }

    private static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    private int d(String str) {
        return this.f21480c ? c(str) : b(str);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        List<d> list = this.f21482e;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return this.f21482e.size();
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        List<d> list = this.f21482e;
        if (list != null) {
            return list.get(i4);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        try {
            if (view == null) {
                View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f21474q, "layout"), (ViewGroup) null);
                C0138a c0138a = new C0138a();
                this.f21481d = c0138a;
                c0138a.f21490c = (AnyThinkImageView) inflate.findViewById(b(f21465g));
                this.f21481d.f21491d = (RoundImageView) inflate.findViewById(b(f21466h));
                this.f21481d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f21468k));
                this.f21481d.f21489b = (ATRotationView) inflate.findViewById(b(f21470m));
                inflate.setTag(this.f21481d);
                view = inflate;
            } else {
                this.f21481d = (C0138a) view.getTag();
            }
            this.f21481d.f21488a = (RelativeLayout) view.findViewById(d(f21464f));
            this.f21481d.f21492e = (TextView) view.findViewById(d(i));
            this.f21481d.f21494g = (TextView) view.findViewById(d(f21467j));
            this.f21481d.f21493f = (TextView) view.findViewById(d(f21471n));
            this.f21481d.f21496j = (ImageView) view.findViewById(d(f21472o));
            this.f21481d.f21495h = (TextView) view.findViewById(d(f21473p));
            List<d> list = this.f21482e;
            if (list != null && this.f21481d != null && list.size() != 0) {
                AnyThinkImageView anyThinkImageView = this.f21481d.f21490c;
                if (anyThinkImageView != null) {
                    a(anyThinkImageView, this.f21482e.get(i4).bm(), false);
                }
                RoundImageView roundImageView = this.f21481d.f21491d;
                if (roundImageView != null) {
                    roundImageView.setBorderRadius(25);
                    a(this.f21481d.f21491d, this.f21482e.get(i4).bl(), true);
                }
                double bf = this.f21482e.get(i4).bf();
                if (bf <= 0.0d) {
                    bf = 5.0d;
                }
                AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f21481d.i;
                if (anyThinkLevelLayoutView != null) {
                    anyThinkLevelLayoutView.setRatingAndUser(bf, this.f21482e.get(i4).bg());
                    this.f21481d.i.setOrientation(0);
                }
                ATRotationView aTRotationView = this.f21481d.f21489b;
                if (aTRotationView != null) {
                    aTRotationView.setWidthRatio(1.0f);
                    this.f21481d.f21489b.setHeightRatio(1.0f);
                    this.f21481d.f21489b.setAutoscroll(false);
                }
                AnyThinkImageView anyThinkImageView2 = this.f21481d.f21490c;
                if (anyThinkImageView2 != null) {
                    anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
                }
            }
            if (this.f21481d != null) {
                d dVar = this.f21482e.get(i4);
                if (this.f21481d.f21492e != null) {
                    this.f21481d.f21492e.setText(dVar.bj());
                }
                if (this.f21481d.f21493f != null) {
                    this.f21481d.f21493f.setText(dVar.bk());
                }
                TextView textView = this.f21481d.f21494g;
                if (textView != null) {
                    String str = dVar.dj;
                    if (textView instanceof AnyThinkTextView) {
                        new b();
                        ((AnyThinkTextView) this.f21481d.f21494g).setObjectAnimator(b.c(this.f21481d.f21494g));
                    }
                    this.f21481d.f21494g.setText(str);
                }
                if (this.f21481d.f21496j != null) {
                    try {
                        Locale.getDefault().getLanguage();
                        Context g9 = t.b().g();
                        v.a(this.f21481d.f21496j, dVar, t.b().g(), false);
                        com.anythink.expressad.foundation.g.d.b.a(g9).a(dVar.aH(), new AnonymousClass2(g9));
                    } catch (Exception e6) {
                        e6.getMessage();
                    }
                }
                if (this.f21481d.f21495h != null) {
                    try {
                        this.f21481d.f21495h.setText(t.b().g().getResources().getString(k.a(t.b().g(), "anythink_reward_viewed_text_str", k.f19794g)));
                        this.f21481d.f21495h.setVisibility(0);
                    } catch (Exception e9) {
                        e9.getMessage();
                    }
                }
            }
        } catch (Exception e10) {
            e10.getMessage();
        }
        return view;
    }

    private void a(int i4) {
        List<d> list = this.f21482e;
        if (list == null || this.f21481d == null || list.size() == 0) {
            return;
        }
        AnyThinkImageView anyThinkImageView = this.f21481d.f21490c;
        if (anyThinkImageView != null) {
            a(anyThinkImageView, this.f21482e.get(i4).bm(), false);
        }
        RoundImageView roundImageView = this.f21481d.f21491d;
        if (roundImageView != null) {
            roundImageView.setBorderRadius(25);
            a(this.f21481d.f21491d, this.f21482e.get(i4).bl(), true);
        }
        double bf = this.f21482e.get(i4).bf();
        if (bf <= 0.0d) {
            bf = 5.0d;
        }
        AnyThinkLevelLayoutView anyThinkLevelLayoutView = this.f21481d.i;
        if (anyThinkLevelLayoutView != null) {
            anyThinkLevelLayoutView.setRatingAndUser(bf, this.f21482e.get(i4).bg());
            this.f21481d.i.setOrientation(0);
        }
        ATRotationView aTRotationView = this.f21481d.f21489b;
        if (aTRotationView != null) {
            aTRotationView.setWidthRatio(1.0f);
            this.f21481d.f21489b.setHeightRatio(1.0f);
            this.f21481d.f21489b.setAutoscroll(false);
        }
        AnyThinkImageView anyThinkImageView2 = this.f21481d.f21490c;
        if (anyThinkImageView2 != null) {
            anyThinkImageView2.setCustomBorder(30, 30, 30, 30, 10, -1728053248);
        }
    }

    private static int b(String str) {
        return k.a(t.b().g().getApplicationContext(), str, "id");
    }

    private void b(int i4) {
        if (this.f21481d != null) {
            d dVar = this.f21482e.get(i4);
            if (this.f21481d.f21492e != null) {
                this.f21481d.f21492e.setText(dVar.bj());
            }
            if (this.f21481d.f21493f != null) {
                this.f21481d.f21493f.setText(dVar.bk());
            }
            TextView textView = this.f21481d.f21494g;
            if (textView != null) {
                String str = dVar.dj;
                if (textView instanceof AnyThinkTextView) {
                    new b();
                    ((AnyThinkTextView) this.f21481d.f21494g).setObjectAnimator(b.c(this.f21481d.f21494g));
                }
                this.f21481d.f21494g.setText(str);
            }
            if (this.f21481d.f21496j != null) {
                try {
                    Locale.getDefault().getLanguage();
                    Context g9 = t.b().g();
                    v.a(this.f21481d.f21496j, dVar, t.b().g(), false);
                    com.anythink.expressad.foundation.g.d.b.a(g9).a(dVar.aH(), new AnonymousClass2(g9));
                } catch (Exception e6) {
                    e6.getMessage();
                }
            }
            if (this.f21481d.f21495h != null) {
                try {
                    this.f21481d.f21495h.setText(t.b().g().getResources().getString(k.a(t.b().g(), "anythink_reward_viewed_text_str", k.f19794g)));
                    this.f21481d.f21495h.setVisibility(0);
                } catch (Exception e9) {
                    e9.getMessage();
                }
            }
        }
    }

    private void a(View view) {
        this.f21481d.f21488a = (RelativeLayout) view.findViewById(d(f21464f));
        this.f21481d.f21492e = (TextView) view.findViewById(d(i));
        this.f21481d.f21494g = (TextView) view.findViewById(d(f21467j));
        this.f21481d.f21493f = (TextView) view.findViewById(d(f21471n));
        this.f21481d.f21496j = (ImageView) view.findViewById(d(f21472o));
        this.f21481d.f21495h = (TextView) view.findViewById(d(f21473p));
    }

    private void a(final ImageView imageView, String str, final boolean z8) {
        if (imageView == null) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            com.anythink.expressad.foundation.g.d.b.a(imageView.getContext()).a(str, new c() { // from class: com.anythink.expressad.video.dynview.ordercamp.a.a.1
                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(Bitmap bitmap, String str2) {
                    try {
                        if (bitmap.isRecycled()) {
                            return;
                        }
                        imageView.setImageBitmap(bitmap);
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }

                @Override // com.anythink.expressad.foundation.g.d.c
                public final void a(String str2, String str3) {
                    if (z8) {
                        imageView.setVisibility(8);
                    }
                }
            });
        } else if (z8) {
            imageView.setVisibility(8);
        }
    }

    private static int a(String str) {
        return k.a(t.b().g().getApplicationContext(), str, "layout");
    }

    private View a() {
        View inflate = LayoutInflater.from(t.b().g()).inflate(k.a(t.b().g().getApplicationContext(), f21474q, "layout"), (ViewGroup) null);
        C0138a c0138a = new C0138a();
        this.f21481d = c0138a;
        c0138a.f21490c = (AnyThinkImageView) inflate.findViewById(b(f21465g));
        this.f21481d.f21491d = (RoundImageView) inflate.findViewById(b(f21466h));
        this.f21481d.i = (AnyThinkLevelLayoutView) inflate.findViewById(b(f21468k));
        this.f21481d.f21489b = (ATRotationView) inflate.findViewById(b(f21470m));
        inflate.setTag(this.f21481d);
        return inflate;
    }
}
