package com.anythink.expressad.video.dynview.g;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;

/* loaded from: classes.dex */
public final class a extends ShapeDrawable {

    /* renamed from: a, reason: collision with root package name */
    private int f21340a;

    /* renamed from: b, reason: collision with root package name */
    private float f21341b;

    /* renamed from: c, reason: collision with root package name */
    private float f21342c;

    /* renamed from: d, reason: collision with root package name */
    private int f21343d;

    /* renamed from: e, reason: collision with root package name */
    private int f21344e;

    /* renamed from: f, reason: collision with root package name */
    private Bitmap f21345f;

    /* renamed from: g, reason: collision with root package name */
    private Bitmap f21346g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f21347h;
    private Paint i;

    /* renamed from: com.anythink.expressad.video.dynview.g.a$a, reason: collision with other inner class name */
    public static class C0135a implements b {

        /* renamed from: a, reason: collision with root package name */
        private RectShape f21348a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f21349b;

        /* renamed from: c, reason: collision with root package name */
        private Bitmap f21350c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f21351d;

        /* renamed from: e, reason: collision with root package name */
        private int f21352e;

        /* renamed from: f, reason: collision with root package name */
        private int f21353f;

        /* renamed from: g, reason: collision with root package name */
        private int f21354g;

        /* renamed from: h, reason: collision with root package name */
        private float f21355h;
        private float i;

        public /* synthetic */ C0135a(byte b9) {
            this();
        }

        private C0135a() {
            this.f21353f = 100;
            this.f21354g = 10;
            this.f21348a = new RectShape();
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(Bitmap bitmap) {
            this.f21349b = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(Bitmap bitmap) {
            this.f21350c = bitmap;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b c(int i) {
            this.f21354g = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a() {
            this.f21351d = true;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(float f6) {
            this.i = f6;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(int i) {
            this.f21352e = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b b(int i) {
            this.f21353f = i;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final b a(float f6) {
            this.f21355h = f6;
            return this;
        }

        @Override // com.anythink.expressad.video.dynview.g.a.b
        public final a b() {
            return new a(this, (byte) 0);
        }
    }

    public interface b {
        b a();

        b a(float f6);

        b a(int i);

        b a(Bitmap bitmap);

        b b(float f6);

        b b(int i);

        b b(Bitmap bitmap);

        a b();

        b c(int i);
    }

    public /* synthetic */ a(C0135a c0135a, byte b9) {
        this(c0135a);
    }

    private void a(Canvas canvas) {
        float f6 = this.f21342c / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, (this.f21343d + f6) - this.f21344e);
        path.lineTo(this.f21341b, (f6 - this.f21343d) - this.f21344e);
        path.lineTo(this.f21341b, 0.0f);
        if (this.f21347h) {
            try {
                a(canvas, path);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f21345f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f21345f);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(0.0f, this.f21343d + f6 + this.f21344e);
        path2.lineTo(0.0f, this.f21342c);
        path2.lineTo(this.f21341b, this.f21342c);
        path2.lineTo(this.f21341b, (f6 - this.f21343d) + this.f21344e);
        if (this.f21347h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f21346g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f21346g);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void b(Canvas canvas) {
        float f6 = this.f21341b / 2.0f;
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.lineTo(0.0f, this.f21342c);
        path.lineTo((f6 - this.f21343d) - this.f21344e, this.f21342c);
        path.lineTo((this.f21343d + f6) - this.f21344e, 0.0f);
        if (this.f21347h) {
            try {
                a(canvas, path);
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        } else {
            Bitmap bitmap = this.f21345f;
            if (bitmap != null && !bitmap.isRecycled()) {
                try {
                    a(canvas, path, this.f21345f);
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }
        Path path2 = new Path();
        path2.moveTo(this.f21343d + f6 + this.f21344e, 0.0f);
        path2.lineTo(this.f21341b, 0.0f);
        path2.lineTo(this.f21341b, this.f21342c);
        path2.lineTo((f6 - this.f21343d) + this.f21344e, this.f21342c);
        if (this.f21347h) {
            try {
                a(canvas, path2);
                return;
            } catch (Exception e10) {
                e10.printStackTrace();
                return;
            }
        }
        Bitmap bitmap2 = this.f21346g;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        try {
            a(canvas, path2, this.f21346g);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f21340a == 1) {
            float f6 = this.f21342c / 2.0f;
            Path path = new Path();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (this.f21343d + f6) - this.f21344e);
            path.lineTo(this.f21341b, (f6 - this.f21343d) - this.f21344e);
            path.lineTo(this.f21341b, 0.0f);
            if (this.f21347h) {
                try {
                    a(canvas, path);
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
            } else {
                Bitmap bitmap = this.f21345f;
                if (bitmap != null && !bitmap.isRecycled()) {
                    try {
                        a(canvas, path, this.f21345f);
                    } catch (Exception e9) {
                        e9.printStackTrace();
                    }
                }
            }
            Path path2 = new Path();
            path2.moveTo(0.0f, this.f21343d + f6 + this.f21344e);
            path2.lineTo(0.0f, this.f21342c);
            path2.lineTo(this.f21341b, this.f21342c);
            path2.lineTo(this.f21341b, (f6 - this.f21343d) + this.f21344e);
            if (this.f21347h) {
                try {
                    a(canvas, path2);
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            }
            Bitmap bitmap2 = this.f21346g;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                return;
            }
            try {
                a(canvas, path2, this.f21346g);
                return;
            } catch (Exception e11) {
                e11.printStackTrace();
                return;
            }
        }
        float f9 = this.f21341b / 2.0f;
        Path path3 = new Path();
        path3.moveTo(0.0f, 0.0f);
        path3.lineTo(0.0f, this.f21342c);
        path3.lineTo((f9 - this.f21343d) - this.f21344e, this.f21342c);
        path3.lineTo((this.f21343d + f9) - this.f21344e, 0.0f);
        if (this.f21347h) {
            try {
                a(canvas, path3);
            } catch (Exception e12) {
                e12.printStackTrace();
            }
        } else {
            Bitmap bitmap3 = this.f21345f;
            if (bitmap3 != null && !bitmap3.isRecycled()) {
                try {
                    a(canvas, path3, this.f21345f);
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
            }
        }
        Path path4 = new Path();
        path4.moveTo(this.f21343d + f9 + this.f21344e, 0.0f);
        path4.lineTo(this.f21341b, 0.0f);
        path4.lineTo(this.f21341b, this.f21342c);
        path4.lineTo((f9 - this.f21343d) + this.f21344e, this.f21342c);
        if (this.f21347h) {
            try {
                a(canvas, path4);
                return;
            } catch (Exception e14) {
                e14.printStackTrace();
                return;
            }
        }
        Bitmap bitmap4 = this.f21346g;
        if (bitmap4 == null || bitmap4.isRecycled()) {
            return;
        }
        try {
            a(canvas, path4, this.f21346g);
        } catch (Exception e15) {
            e15.printStackTrace();
        }
    }

    @Override // android.graphics.drawable.ShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    private a(C0135a c0135a) {
        super(c0135a.f21348a);
        this.f21347h = false;
        this.f21345f = c0135a.f21349b;
        this.f21346g = c0135a.f21350c;
        this.f21347h = c0135a.f21351d;
        this.f21340a = c0135a.f21352e;
        this.f21343d = c0135a.f21353f;
        this.f21344e = c0135a.f21354g;
        this.f21341b = c0135a.f21355h;
        this.f21342c = c0135a.i;
        Paint paint = new Paint();
        this.i = paint;
        paint.setStyle(Paint.Style.FILL);
        this.i.setAntiAlias(true);
    }

    private void a(Canvas canvas, Path path, Bitmap bitmap) {
        if (canvas == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.i.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        canvas.drawPath(path, this.i);
    }

    private void a(Canvas canvas, Path path) {
        this.i.setColor(Color.parseColor("#40EAEAEA"));
        canvas.drawPath(path, this.i);
    }

    public static C0135a a() {
        return new C0135a((byte) 0);
    }
}
