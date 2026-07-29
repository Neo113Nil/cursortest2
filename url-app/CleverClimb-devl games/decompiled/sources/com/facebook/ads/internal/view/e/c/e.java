package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.HashMap;

/* loaded from: classes.dex */
public class e extends com.facebook.ads.internal.view.e.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f5730a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f5731b;

    /* renamed from: c, reason: collision with root package name */
    private final com.facebook.ads.internal.m.c f5732c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5733d;
    private final Paint e;
    private final RectF f;

    public e(Context context, String str, com.facebook.ads.internal.m.c cVar, String str2, String str3) {
        super(context);
        this.f5730a = str;
        this.f5732c = cVar;
        this.f5733d = str2;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f5731b = new TextView(getContext());
        this.f5731b.setTextColor(-3355444);
        this.f5731b.setTextSize(16.0f);
        this.f5731b.setPadding((int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f), (int) (displayMetrics.density * 6.0f), (int) (displayMetrics.density * 4.0f));
        this.e = new Paint();
        this.e.setStyle(Paint.Style.FILL);
        this.e.setColor(-16777216);
        this.e.setAlpha(178);
        this.f = new RectF();
        setBackgroundColor(0);
        this.f5731b.setText(str3);
        addView(this.f5731b, new RelativeLayout.LayoutParams(-2, -2));
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void a() {
        super.a();
        this.f5731b.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.e.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (e.this.getVideoView() == null) {
                    return;
                }
                Uri parse = Uri.parse(e.this.f5730a);
                e.this.getVideoView().getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) new com.facebook.ads.internal.view.e.b.a(parse));
                com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(e.this.getContext(), e.this.f5732c, e.this.f5733d, parse, new HashMap());
                if (a2 != null) {
                    a2.b();
                }
            }
        });
    }

    @Override // com.facebook.ads.internal.view.e.a.c
    protected void b() {
        this.f5731b.setOnClickListener(null);
        super.b();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        this.f.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.f, 0.0f, 0.0f, this.e);
        super.onDraw(canvas);
    }
}
