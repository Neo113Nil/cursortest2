package com.facebook.ads.internal.view.component;

import android.R;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.support.v4.graphics.ColorUtils;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import com.facebook.ads.internal.adapters.j;
import com.facebook.ads.internal.q.a.v;
import com.facebook.ads.internal.view.a;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends Button {

    /* renamed from: c, reason: collision with root package name */
    private final Paint f5574c;

    /* renamed from: d, reason: collision with root package name */
    private final RectF f5575d;
    private final boolean e;
    private final String f;
    private final com.facebook.ads.internal.m.c g;
    private final a.InterfaceC0352a h;

    /* renamed from: b, reason: collision with root package name */
    private static final int f5573b = (int) (v.f5438b * 4.0f);

    /* renamed from: a, reason: collision with root package name */
    public static final int f5572a = (int) (v.f5438b * 16.0f);

    public a(Context context, boolean z, boolean z2, String str, j jVar, com.facebook.ads.internal.m.c cVar, a.InterfaceC0352a interfaceC0352a) {
        super(context);
        this.g = cVar;
        this.h = interfaceC0352a;
        this.e = z;
        this.f = str;
        setTextSize(2, 16.0f);
        setTypeface(Typeface.create("sans-serif-medium", 0));
        setGravity(17);
        setPadding(f5572a, f5572a, f5572a, f5572a);
        setTextColor(jVar.f(z2));
        int e = jVar.e(z2);
        int blendARGB = ColorUtils.blendARGB(e, -16777216, 0.1f);
        this.f5574c = new Paint();
        this.f5574c.setStyle(Paint.Style.FILL);
        this.f5574c.setColor(e);
        this.f5575d = new RectF();
        if (z) {
            return;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, new ColorDrawable(blendARGB));
        stateListDrawable.addState(new int[0], new ColorDrawable(e));
        setBackgroundDrawable(stateListDrawable);
    }

    public void a(String str, final String str2, final String str3, final Map<String, String> map) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || this.g == null) {
            setVisibility(8);
        } else {
            setText(str.toUpperCase(Locale.US));
            setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.component.a.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    String valueOf;
                    String str4;
                    try {
                        com.facebook.ads.internal.a.a a2 = com.facebook.ads.internal.a.b.a(a.this.getContext(), a.this.g, str3, Uri.parse(str2), map);
                        if (a2 != null) {
                            a2.b();
                        }
                        if (a.this.h != null) {
                            a.this.h.a(a.this.f);
                        }
                    } catch (ActivityNotFoundException e) {
                        e = e;
                        valueOf = String.valueOf(a.class);
                        str4 = "Error while opening " + str2;
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
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.e) {
            this.f5575d.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(this.f5575d, f5573b, f5573b, this.f5574c);
        }
        super.onDraw(canvas);
    }
}
