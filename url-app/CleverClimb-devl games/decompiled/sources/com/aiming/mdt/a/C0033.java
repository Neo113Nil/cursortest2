package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

/* renamed from: com.aiming.mdt.a.ʻʼʽʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0033 extends View {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f32;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f33;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private int f34;

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private RectF f35;

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private Paint f36;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private int f37;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private int f38;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private int f39;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f40;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private int f41;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private int f42;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private int f43;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f44;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private int f45;

    /* renamed from: ʽʿ, reason: contains not printable characters */
    private float f46;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int f47;

    /* renamed from: ʿ, reason: contains not printable characters */
    private int f48;

    public C0033(Context context, int i) {
        super(context);
        this.f33 = 0;
        this.f40 = 0;
        this.f32 = 0;
        this.f44 = 0;
        this.f37 = 0;
        this.f41 = 2;
        this.f42 = 6;
        this.f46 = (int) (((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 20.0f) + 0.5f);
        this.f34 = (int) ((this.f46 * 2.0f) / 5.0f);
        this.f48 = -7829368;
        this.f36 = new Paint();
        this.f36.setColor(this.f48);
        this.f36.setStrokeWidth(this.f42);
        this.f36.setStyle(Paint.Style.STROKE);
        this.f36.setAntiAlias(true);
        this.f45 = (int) (this.f46 / 2.0f);
        this.f38 = ((int) (this.f46 / 2.0f)) - this.f42;
        this.f43 = (int) (this.f45 + (this.f46 / 5.0f));
        this.f47 = (int) (this.f45 - (this.f46 / 5.0f));
        this.f39 = (int) (this.f45 - (this.f46 / 5.0f));
        this.f35 = new RectF(this.f45 - this.f38, this.f45 - this.f38, this.f45 + this.f38, this.f45 + this.f38);
        setClickable(true);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f35, 235.0f, -360.0f, false, this.f36);
        this.f40 = this.f34;
        this.f32 = this.f34;
        canvas.drawLine(this.f43, this.f47, this.f43 - this.f40, this.f47 + this.f32, this.f36);
        this.f44 = this.f34;
        this.f37 = this.f34;
        canvas.drawLine(this.f39, this.f47, this.f39 + this.f44, this.f47 + this.f37, this.f36);
    }
}
