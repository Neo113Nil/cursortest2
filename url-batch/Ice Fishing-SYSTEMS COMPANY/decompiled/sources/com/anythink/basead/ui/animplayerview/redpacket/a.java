package com.anythink.basead.ui.animplayerview.redpacket;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import java.util.Random;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f10694a;

    /* renamed from: b, reason: collision with root package name */
    public float f10695b;

    /* renamed from: c, reason: collision with root package name */
    private Bitmap f10696c;

    /* renamed from: d, reason: collision with root package name */
    private int f10697d;

    /* renamed from: e, reason: collision with root package name */
    private int f10698e;

    /* renamed from: f, reason: collision with root package name */
    private float f10699f;

    /* renamed from: g, reason: collision with root package name */
    private float f10700g;

    public a(Context context, Bitmap bitmap, double d2, double d3, int i) {
        i = i == 0 ? Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels) : i;
        double nextInt = ((d2 * 100.0d) + new Random().nextInt(6)) / 100.0d;
        if (nextInt >= d2 && nextInt <= d3) {
            d3 = nextInt;
        }
        Log.d("RedPacketBean", "widthScale: ".concat(String.valueOf(d3)));
        int i4 = (int) (i * d3);
        this.f10697d = i4;
        int height = (bitmap.getHeight() * i4) / bitmap.getWidth();
        this.f10698e = height;
        try {
            this.f10696c = Bitmap.createScaledBitmap(bitmap, this.f10697d, height, true);
        } catch (Exception e6) {
            Log.e("RedPacketBean", "createScaledBitmap failed: " + e6.getMessage());
        }
        this.f10699f = 400.0f;
        this.f10700g = (new Random().nextFloat() * 30.0f) - 15.0f;
    }

    private float f() {
        return this.f10699f;
    }

    public final int a() {
        return this.f10698e;
    }

    public final int b() {
        return this.f10697d;
    }

    public final Bitmap c() {
        return this.f10696c;
    }

    public final void d() {
        Bitmap bitmap = this.f10696c;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f10696c.recycle();
        this.f10696c = null;
    }

    public final float e() {
        return this.f10700g;
    }
}
