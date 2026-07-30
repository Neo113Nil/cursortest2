package com.anythink.expressad.foundation.f.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.anythink.basead.b.c.i;
import com.anythink.core.common.d.t;
import com.anythink.expressad.f.a;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.k;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.FeedbackRadioGroup;
import com.anythink.expressad.widget.a.b;
import com.anythink.expressad.widget.a.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    private static int f19180n = -1;

    /* renamed from: s, reason: collision with root package name */
    private static String f19181s;

    /* renamed from: a, reason: collision with root package name */
    private String f19182a;

    /* renamed from: b, reason: collision with root package name */
    private d f19183b;

    /* renamed from: c, reason: collision with root package name */
    private FeedBackButton f19184c;

    /* renamed from: d, reason: collision with root package name */
    private int f19185d;

    /* renamed from: e, reason: collision with root package name */
    private int f19186e;

    /* renamed from: j, reason: collision with root package name */
    private String f19190j;

    /* renamed from: k, reason: collision with root package name */
    private String f19191k;

    /* renamed from: p, reason: collision with root package name */
    private c f19195p;

    /* renamed from: q, reason: collision with root package name */
    private List<C0119a> f19196q;

    /* renamed from: f, reason: collision with root package name */
    private int f19187f = -1;

    /* renamed from: g, reason: collision with root package name */
    private int f19188g = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f19189h = -1;
    private int i = -1;

    /* renamed from: l, reason: collision with root package name */
    private float f19192l = 1.0f;

    /* renamed from: m, reason: collision with root package name */
    private int f19193m = i.e(20.0f);

    /* renamed from: o, reason: collision with root package name */
    private int f19194o = f19180n;

    /* renamed from: r, reason: collision with root package name */
    private b f19197r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.1
        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            a.a(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            a.b(a.this);
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
            a.c(a.this);
        }
    };

    public a(String str) {
        this.f19196q = new ArrayList();
        this.f19182a = str;
        if (this.f19196q == null) {
            this.f19196q = new ArrayList();
        }
        g();
        n();
        h();
    }

    private void g() {
        if (this.f19197r == null) {
            this.f19197r = new b() { // from class: com.anythink.expressad.foundation.f.a.a.2
                @Override // com.anythink.expressad.widget.a.b
                public final void a() {
                    a.a(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void b() {
                    a.b(a.this);
                }

                @Override // com.anythink.expressad.widget.a.b
                public final void c() {
                    a.c(a.this);
                }
            };
        }
    }

    private void h() {
        try {
            com.anythink.expressad.foundation.f.b.a();
            if (com.anythink.expressad.foundation.f.b.a(t.b().g()) != null) {
                com.anythink.expressad.f.b.a();
                com.anythink.expressad.foundation.b.a.c().f();
                com.anythink.expressad.f.a b9 = com.anythink.expressad.f.b.b();
                if (b9 == null) {
                    com.anythink.expressad.f.b.a();
                    b9 = com.anythink.expressad.f.b.c();
                }
                a.b L8 = b9.L();
                if (L8 == null) {
                    return;
                }
                g();
                com.anythink.expressad.foundation.f.b.a();
                this.f19195p = new c(com.anythink.expressad.foundation.f.b.a(t.b().g()), this.f19197r);
                FeedbackRadioGroup a9 = a(L8);
                this.f19195p.c(L8.c());
                this.f19195p.b(L8.b());
                this.f19195p.a(L8.a());
                this.f19195p.a(a9);
                this.f19195p.a(!TextUtils.isEmpty(f19181s));
                a(a9, L8);
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private void i() {
        List<C0119a> list = this.f19196q;
        if (list != null) {
            for (C0119a c0119a : list) {
                if (c0119a != null) {
                    c0119a.b();
                }
            }
        }
        f19181s = "";
    }

    private void j() {
        List<C0119a> list = this.f19196q;
        if (list != null) {
            for (C0119a c0119a : list) {
                if (c0119a != null) {
                    c0119a.a();
                }
            }
        }
        f19181s = "";
    }

    private void k() {
        List<C0119a> list = this.f19196q;
        if (list != null) {
            Iterator<C0119a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    private String l() {
        return this.f19182a;
    }

    private void m() {
        FeedBackButton feedBackButton = this.f19184c;
        if (feedBackButton != null) {
            int i = this.f19187f;
            if (i >= 0) {
                feedBackButton.setX(i);
            }
            int i4 = this.f19188g;
            if (i4 >= 0) {
                this.f19184c.setY(i4);
            }
            float f6 = this.f19192l;
            if (f6 >= 0.0f) {
                this.f19184c.setAlpha(f6);
                this.f19184c.setEnabled(this.f19192l != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f19184c.getLayoutParams();
            int i9 = this.f19189h;
            if (i9 > 0) {
                this.f19184c.setWidth(i9);
                if (layoutParams != null) {
                    layoutParams.width = this.f19189h;
                }
            }
            int i10 = this.i;
            if (i10 > 0) {
                this.f19184c.setHeight(i10);
                if (layoutParams != null) {
                    layoutParams.height = this.i;
                }
            }
            if (layoutParams != null) {
                this.f19184c.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f19190j)) {
                    this.f19184c.setTextColor(Color.parseColor(this.f19190j));
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i11 = this.f19193m;
            if (i11 > 0) {
                gradientDrawable.setCornerRadius(i11);
            }
            if (TextUtils.isEmpty(this.f19191k)) {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            } else {
                gradientDrawable.setColor(Color.parseColor(this.f19191k));
            }
            try {
                this.f19184c.setBackgroundDrawable(gradientDrawable);
            } catch (Throwable unused) {
            }
        }
    }

    private void n() {
        Context g9 = t.b().g();
        if (g9 != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(g9);
                this.f19184c = feedBackButton;
                int i = 8;
                if (this.f19194o != 8) {
                    i = 0;
                }
                feedBackButton.setVisibility(i);
                this.f19184c.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.4
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        a.this.a();
                    }
                });
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    private int o() {
        return this.f19185d;
    }

    private int p() {
        return this.f19186e;
    }

    public final void b() {
        c cVar = this.f19195p;
        if (cVar == null || !cVar.isShowing()) {
            return;
        }
        this.f19195p.cancel();
    }

    public final FeedBackButton c() {
        if (this.f19184c == null) {
            n();
        }
        return this.f19184c;
    }

    public final d e() {
        return this.f19183b;
    }

    public final void a() {
        com.anythink.expressad.foundation.f.b.a();
        Activity a9 = com.anythink.expressad.foundation.f.b.a(t.b().g());
        c cVar = this.f19195p;
        if (cVar == null || cVar.getContext() != a9) {
            h();
        }
        Context g9 = t.b().g();
        FeedBackButton feedBackButton = this.f19184c;
        if (feedBackButton != null) {
            g9 = feedBackButton.getContext();
        }
        com.anythink.expressad.foundation.f.b.a();
        boolean a10 = com.anythink.expressad.foundation.f.b.a(g9, this.f19195p);
        List<C0119a> list = this.f19196q;
        if (list != null) {
            for (C0119a c0119a : list) {
                if (c0119a != null) {
                    c0119a.a(a10);
                }
            }
        }
    }

    public final void d() {
        FeedBackButton feedBackButton = this.f19184c;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f19184c.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f19184c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f19184c);
            }
        }
        c cVar = this.f19195p;
        if (cVar != null) {
            cVar.a((b) null);
        }
        this.f19195p = null;
        this.f19196q = null;
        this.f19184c = null;
        this.f19197r = null;
    }

    /* renamed from: com.anythink.expressad.foundation.f.a.a$a, reason: collision with other inner class name */
    public static class C0119a implements b {

        /* renamed from: a, reason: collision with root package name */
        private com.anythink.expressad.foundation.f.a f19203a;

        /* renamed from: b, reason: collision with root package name */
        private String f19204b;

        public C0119a(String str, com.anythink.expressad.foundation.f.a aVar) {
            this.f19203a = aVar;
            this.f19204b = str;
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void a() {
            com.anythink.expressad.foundation.f.b.f19207c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f19203a;
            if (aVar != null) {
                String unused = a.f19181s;
                aVar.c();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void b() {
            com.anythink.expressad.foundation.f.b.f19207c = false;
            com.anythink.expressad.foundation.f.a aVar = this.f19203a;
            if (aVar != null) {
                aVar.b();
            }
        }

        @Override // com.anythink.expressad.widget.a.b
        public final void c() {
        }

        public final void a(boolean z8) {
            com.anythink.expressad.foundation.f.b.f19207c = true;
            com.anythink.expressad.foundation.f.a aVar = this.f19203a;
            if (aVar == null || !z8) {
                return;
            }
            aVar.a();
        }
    }

    private void b(C0119a c0119a) {
        List<C0119a> list = this.f19196q;
        if (list != null) {
            list.remove(c0119a);
        }
    }

    public final void c(int i) {
        this.f19186e = i;
    }

    public static /* synthetic */ void c(a aVar) {
        List<C0119a> list = aVar.f19196q;
        if (list != null) {
            Iterator<C0119a> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    public final void b(int i) {
        this.f19185d = i;
    }

    public static /* synthetic */ void b(a aVar) {
        List<C0119a> list = aVar.f19196q;
        if (list != null) {
            for (C0119a c0119a : list) {
                if (c0119a != null) {
                    c0119a.b();
                }
            }
        }
        f19181s = "";
    }

    public final void a(int i) {
        this.f19194o = i;
        FeedBackButton feedBackButton = this.f19184c;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(FeedbackRadioGroup feedbackRadioGroup, a.b bVar) {
        ColorStateList colorStateList;
        int i;
        JSONArray d2 = bVar.d();
        Context g9 = t.b().g();
        if (d2 == null || d2.length() <= 0 || g9 == null) {
            return;
        }
        int a9 = k.a(g9, "anythink_cm_feedback_choice_btn_bg", k.f19790c);
        Resources a10 = k.a(g9);
        int a11 = k.a(g9, "anythink_cm_feedback_rb_text_color_color_list", k.f19791d);
        if (a10 != null) {
            try {
                colorStateList = a10.getColorStateList(a11);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
            int b9 = v.b(g9, 14.0f);
            int b10 = v.b(g9, 7.0f);
            int b11 = v.b(g9, 6.0f);
            for (i = 0; i < d2.length(); i++) {
                String optString = d2.optString(i);
                RadioButton radioButton = new RadioButton(g9);
                radioButton.setButtonDrawable((Drawable) null);
                radioButton.setBackgroundResource(a9);
                radioButton.setText(optString);
                if (colorStateList != null) {
                    radioButton.setTextColor(colorStateList);
                }
                radioButton.setPadding(b9, b10, b9, b10);
                RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-2, -2);
                int i4 = b11 / 4;
                layoutParams.setMargins(b11, i4, b11, i4);
                a(radioButton);
                feedbackRadioGroup.addView(radioButton, layoutParams);
            }
        }
        colorStateList = null;
        int b92 = v.b(g9, 14.0f);
        int b102 = v.b(g9, 7.0f);
        int b112 = v.b(g9, 6.0f);
        while (i < d2.length()) {
        }
    }

    private static FeedbackRadioGroup a(a.b bVar) {
        JSONArray d2 = bVar.d();
        Context g9 = t.b().g();
        if (d2 == null || d2.length() <= 0 || g9 == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(g9);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    private void a(RadioButton radioButton) {
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.anythink.expressad.foundation.f.a.a.3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z8) {
                if (z8) {
                    String unused = a.f19181s = (String) compoundButton.getText();
                }
                if (a.this.f19195p != null) {
                    a.this.f19195p.a(!TextUtils.isEmpty(a.f19181s));
                }
            }
        });
    }

    public final void a(C0119a c0119a) {
        if (this.f19196q == null) {
            this.f19196q = new ArrayList();
        }
        this.f19196q.add(c0119a);
    }

    private void a(boolean z8) {
        List<C0119a> list = this.f19196q;
        if (list != null) {
            for (C0119a c0119a : list) {
                if (c0119a != null) {
                    c0119a.a(z8);
                }
            }
        }
    }

    public final void a(int i, int i4, int i9, int i10, int i11, float f6, String str, String str2) {
        this.f19187f = i;
        this.f19188g = i4;
        this.f19189h = i9;
        this.i = i10;
        this.f19190j = str;
        this.f19191k = str2;
        this.f19192l = f6;
        this.f19193m = i11;
        m();
    }

    public final void a(d dVar) {
        this.f19183b = dVar;
    }

    public final void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f19184c;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f19192l);
            feedBackButton.setEnabled(this.f19192l != 0.0f);
            feedBackButton.setVisibility(this.f19194o != 8 ? 0 : 8);
            this.f19184c = feedBackButton;
            d dVar = this.f19183b;
            if (dVar != null && !dVar.j()) {
                m();
            }
            feedBackButton.setOnClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.f.a.a.5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    a.this.a();
                }
            });
        }
    }

    public static /* synthetic */ void a(a aVar) {
        List<C0119a> list = aVar.f19196q;
        if (list != null) {
            for (C0119a c0119a : list) {
                if (c0119a != null) {
                    c0119a.a();
                }
            }
        }
        f19181s = "";
    }
}
