package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.anythink.basead.ui.BaseEndCardView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.ui.component.RoundImageView;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;
import com.anythink.expressad.foundation.h.k;

/* loaded from: classes.dex */
public class EndCardView extends BaseEndCardView {

    /* renamed from: e, reason: collision with root package name */
    private int f10170e;

    /* renamed from: f, reason: collision with root package name */
    private int f10171f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f10172g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f10173h;
    private TextView i;

    /* renamed from: j, reason: collision with root package name */
    private Bitmap f10174j;

    /* renamed from: k, reason: collision with root package name */
    private final View.OnClickListener f10175k;

    /* renamed from: com.anythink.basead.ui.EndCardView$2, reason: invalid class name */
    public class AnonymousClass2 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ w f10177a;

        public AnonymousClass2(w wVar) {
            this.f10177a = wVar;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10177a.B())) {
                EndCardView.this.f10172g.setImageBitmap(bitmap);
                h.a(EndCardView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.EndCardView.2.1
                    @Override // com.anythink.core.common.v.h.a
                    public final void a() {
                    }

                    @Override // com.anythink.core.common.v.h.a
                    public final void a(Bitmap bitmap2) {
                        EndCardView.this.f10174j = bitmap2;
                        EndCardView.this.setBackgroundDrawable(new BitmapDrawable(EndCardView.this.f10174j));
                    }
                });
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.EndCardView$3, reason: invalid class name */
    public class AnonymousClass3 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f10180a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f10181b;

        public AnonymousClass3(String str, int i) {
            this.f10180a = str;
            this.f10181b = i;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, Bitmap bitmap) {
            if (TextUtils.equals(str, this.f10180a)) {
                int i = this.f10181b;
                ViewGroup.LayoutParams layoutParams = EndCardView.this.f10173h.getLayoutParams();
                layoutParams.width = (int) (i * ((bitmap.getWidth() * 1.0f) / bitmap.getHeight()));
                layoutParams.height = i;
                EndCardView.this.f10173h.setLayoutParams(layoutParams);
                EndCardView.this.f10173h.setScaleType(ImageView.ScaleType.FIT_XY);
                EndCardView.this.f10173h.setImageBitmap(bitmap);
            }
        }
    }

    public EndCardView(Context context, w wVar, x xVar) {
        super(context, wVar, xVar);
        this.f10175k = new View.OnClickListener() { // from class: com.anythink.basead.ui.EndCardView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BaseEndCardView.a aVar;
                y yVar = EndCardView.this.f9981d;
                if (yVar != null) {
                    if (yVar.J() == 0) {
                        int i = view != EndCardView.this.i ? 7 : 6;
                        BaseEndCardView.a aVar2 = EndCardView.this.mListener;
                        if (aVar2 != null) {
                            aVar2.a(i);
                            return;
                        }
                        return;
                    }
                    if (EndCardView.this.i == null || view != EndCardView.this.i || EndCardView.this.i.getVisibility() != 0 || (aVar = EndCardView.this.mListener) == null) {
                        return;
                    }
                    aVar.a(6);
                }
            }
        };
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final void a() {
    }

    public View getLearnMoreButton() {
        return this.i;
    }

    public void init(boolean z8, boolean z9, BaseEndCardView.a aVar) {
        setId(q.a(getContext(), "myoffer_end_card_id", "id"));
        this.mListener = aVar;
        this.f10172g = new RoundImageView(getContext());
        addView(this.f10172g, new RelativeLayout.LayoutParams(-1, -1));
        if (z8) {
            w wVar = this.f9979b;
            this.f10173h = new RoundImageView(getContext());
            int a9 = q.a(getContext(), 12.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, a9);
            layoutParams.addRule(11);
            layoutParams.addRule(12);
            addView(this.f10173h, layoutParams);
            String C7 = wVar.C();
            if (!TextUtils.isEmpty(C7)) {
                ViewGroup.LayoutParams layoutParams2 = this.f10173h.getLayoutParams();
                com.anythink.core.common.res.b.a(getContext()).a(new e(1, C7), layoutParams2.width, layoutParams2.height, new AnonymousClass3(C7, a9));
            }
        }
        if (z9) {
            ScanningAnimButton scanningAnimButton = new ScanningAnimButton(getContext());
            this.i = scanningAnimButton;
            scanningAnimButton.setText(q.a(getContext(), "myoffer_cta_learn_more", k.f19794g));
            this.i.setTextColor(Color.parseColor("#ffffffff"));
            this.i.setTextSize(14.0f);
            this.i.setGravity(17);
            this.i.setBackgroundResource(q.a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", k.f19790c));
            if (!this.f9979b.c()) {
                this.i.setOnClickListener(this.f10175k);
            }
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, q.a(getContext(), 48.0f));
            layoutParams3.addRule(12);
            layoutParams3.bottomMargin = q.a(getContext(), 96.0f);
            layoutParams3.leftMargin = q.a(getContext(), 24.0f);
            layoutParams3.rightMargin = q.a(getContext(), 24.0f);
            addView(this.i, layoutParams3);
        }
        if (this.f9979b.c()) {
            return;
        }
        setOnClickListener(this.f10175k);
    }

    public void load() {
        w wVar = this.f9979b;
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, wVar.B()), this.f10170e, this.f10171f, new AnonymousClass2(wVar));
        } catch (Exception e6) {
            e6.printStackTrace();
        } catch (OutOfMemoryError e9) {
            e9.printStackTrace();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setSize(int i, int i4) {
        this.f10170e = i;
        this.f10171f = i4;
    }

    private void b(w wVar) {
        this.f10173h = new RoundImageView(getContext());
        int a9 = q.a(getContext(), 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, a9);
        layoutParams.addRule(11);
        layoutParams.addRule(12);
        addView(this.f10173h, layoutParams);
        String C7 = wVar.C();
        if (TextUtils.isEmpty(C7)) {
            return;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f10173h.getLayoutParams();
        com.anythink.core.common.res.b.a(getContext()).a(new e(1, C7), layoutParams2.width, layoutParams2.height, new AnonymousClass3(C7, a9));
    }

    private void c() {
        ScanningAnimButton scanningAnimButton = new ScanningAnimButton(getContext());
        this.i = scanningAnimButton;
        scanningAnimButton.setText(q.a(getContext(), "myoffer_cta_learn_more", k.f19794g));
        this.i.setTextColor(Color.parseColor("#ffffffff"));
        this.i.setTextSize(14.0f);
        this.i.setGravity(17);
        this.i.setBackgroundResource(q.a(getContext(), "myoffer_splash_bg_rectangle_btn_cta_asseblem", k.f19790c));
        if (!this.f9979b.c()) {
            this.i.setOnClickListener(this.f10175k);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, q.a(getContext(), 48.0f));
        layoutParams.addRule(12);
        layoutParams.bottomMargin = q.a(getContext(), 96.0f);
        layoutParams.leftMargin = q.a(getContext(), 24.0f);
        layoutParams.rightMargin = q.a(getContext(), 24.0f);
        addView(this.i, layoutParams);
    }

    private void a(w wVar) {
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, wVar.B()), this.f10170e, this.f10171f, new AnonymousClass2(wVar));
        } catch (Exception e6) {
            e6.printStackTrace();
        } catch (OutOfMemoryError e9) {
            e9.printStackTrace();
        }
    }

    @Override // com.anythink.basead.ui.BaseEndCardView
    public final Drawable b() {
        Bitmap bitmap = this.f10174j;
        if (bitmap != null && !bitmap.isRecycled()) {
            return new BitmapDrawable(this.f10174j);
        }
        return super.b();
    }
}
