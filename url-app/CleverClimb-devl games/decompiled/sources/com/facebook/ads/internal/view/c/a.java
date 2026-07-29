package com.facebook.ads.internal.view.c;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.ads.internal.j.e;
import com.facebook.ads.internal.j.f;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f5556a;

    /* renamed from: b, reason: collision with root package name */
    private com.facebook.ads.internal.view.e.b f5557b;

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5558c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f5559d;

    public a(Context context, String str, String str2, int i, com.facebook.ads.internal.view.e.b bVar, final com.facebook.ads.internal.m.c cVar, final String str3) {
        super(context);
        this.f5556a = str;
        this.f5557b = bVar;
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setTextSize(16.0f);
        textView.setText(str2);
        textView.setTypeface(Typeface.defaultFromStyle(1));
        setGravity(17);
        addView(textView);
        this.f5558c = new Paint();
        this.f5558c.setStyle(Paint.Style.FILL);
        this.f5558c.setColor(i);
        this.f5559d = new RectF();
        setBackgroundColor(0);
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.c.a.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                String valueOf;
                String str4;
                try {
                    Uri parse = Uri.parse(a.this.f5556a);
                    a.this.f5557b.getEventBus().a((e<f, com.facebook.ads.internal.j.d>) new com.facebook.ads.internal.view.e.b.a(parse));
                    com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(a.this.getContext(), cVar, str3, parse, new HashMap());
                    if (a2 != null) {
                        a2.b();
                    }
                } catch (ActivityNotFoundException e) {
                    e = e;
                    valueOf = String.valueOf(a.class);
                    str4 = "Error while opening " + a.this.f5556a;
                    Log.e(valueOf, str4, e);
                } catch (Exception e2) {
                    e = e2;
                    valueOf = String.valueOf(a.class);
                    str4 = "Error executing action";
                    Log.e(valueOf, str4, e);
                }
            }
        });
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f5559d.set(0.0f, 0.0f, getWidth(), getHeight());
        float f2 = f * 10.0f;
        canvas.drawRoundRect(this.f5559d, f2, f2, this.f5558c);
        super.onDraw(canvas);
    }
}
