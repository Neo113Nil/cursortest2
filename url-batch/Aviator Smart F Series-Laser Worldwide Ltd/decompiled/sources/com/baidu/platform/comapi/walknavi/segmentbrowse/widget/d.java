package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class d extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10299a = "d";

    /* renamed from: b, reason: collision with root package name */
    private Context f10300b;

    /* renamed from: c, reason: collision with root package name */
    private com.baidu.platform.comapi.walknavi.i.a f10301c;

    /* renamed from: d, reason: collision with root package name */
    private String f10302d;

    /* renamed from: e, reason: collision with root package name */
    protected int f10303e;

    /* renamed from: f, reason: collision with root package name */
    protected int f10304f;

    public d(Context context, com.baidu.platform.comapi.walknavi.i.a aVar, int i8) {
        super(context);
        this.f10300b = context;
        if (this.f10301c == null) {
            this.f10301c = new com.baidu.platform.comapi.walknavi.i.a();
        }
        this.f10301c = aVar;
        a(-4, -3);
    }

    protected void a(int i8, int i9) {
        this.f10303e = i8;
        this.f10304f = i9;
    }

    protected RectF b(Context context) {
        return new RectF(b.a(context, this.f10303e + 27), b.a(context, this.f10304f + 16), b.a(context, this.f10303e + 88), b.a(context, this.f10304f + 77));
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i8;
        int i9;
        int i10;
        boolean z7;
        ArrayList<c> arrayList;
        c cVar;
        Bitmap decodeResource;
        if (canvas == null || this.f10300b == null || this.f10301c == null) {
            return;
        }
        canvas.save();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setTextSize(b.a(this.f10300b, 22.0f));
        if (!TextUtils.isEmpty(this.f10301c.f()) && com.baidu.platform.comapi.walknavi.k.e.c.c(this.f10301c.f()) != 0) {
            if (com.baidu.platform.comapi.h.c.b().d()) {
                decodeResource = BitmapFactory.decodeResource(getResources(), com.baidu.platform.comapi.walknavi.k.e.c.c(this.f10301c.f()));
            } else if (this.f10301c.h() != com.baidu.platform.comapi.walknavi.i.c.g()) {
                decodeResource = BitmapFactory.decodeResource(getResources(), com.baidu.platform.comapi.walknavi.k.e.c.b(this.f10301c.f()));
            } else if (com.baidu.platform.comapi.walknavi.i.c.t() == null) {
                return;
            } else {
                decodeResource = (com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.REFRESH_SEGMENTBROWSE || com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE || com.baidu.platform.comapi.walknavi.b.n().u() == 4) ? BitmapFactory.decodeResource(getResources(), com.baidu.platform.comapi.walknavi.k.e.c.b(this.f10301c.f())) : BitmapFactory.decodeResource(getResources(), com.baidu.platform.comapi.walknavi.k.e.c.c(this.f10301c.f()));
            }
            RectF b8 = b(this.f10300b);
            if (decodeResource == null || b8 == null) {
                return;
            } else {
                try {
                    canvas.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), b8, (Paint) null);
                } catch (Exception unused) {
                }
            }
        }
        int a8 = a(this.f10301c);
        if (this.f10301c.e() == null || this.f10301c.e().size() == 0) {
            return;
        }
        ArrayList<c> e8 = this.f10301c.e();
        boolean a9 = a(e8);
        int a10 = a(this.f10300b, a8, a9);
        int size = e8.size();
        if (this.f10301c.h() != com.baidu.platform.comapi.walknavi.i.c.g()) {
            a(paint, -6710887);
        } else if (com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.REFRESH_SEGMENTBROWSE || com.baidu.platform.comapi.walknavi.i.c.t() == com.baidu.platform.comapi.walknavi.i.b.GUIDING_TO_SEGMENTBROWSE || com.baidu.platform.comapi.walknavi.b.n().u() == 4) {
            a(paint, -6710887);
        } else {
            a(paint, -1);
        }
        int i11 = a10;
        int i12 = 0;
        while (i12 < size) {
            c a11 = e8.get(i12).a();
            float a12 = a(this.f10300b);
            int i13 = 0;
            while (true) {
                if (i13 >= a11.f10297c.length) {
                    i8 = i12;
                    i9 = i11;
                    i10 = size;
                    z7 = a9;
                    arrayList = e8;
                    break;
                }
                int i14 = i13;
                a(this.f10300b, size, paint, a9, a11.f10298d[i13]);
                char[] cArr = a11.f10297c;
                if (cArr != null) {
                    cVar = a11;
                    i8 = i12;
                    i9 = i11;
                    i10 = size;
                    z7 = a9;
                    arrayList = e8;
                    canvas.drawText(cArr, i14, 1, a12, i11, paint);
                } else {
                    cVar = a11;
                    i8 = i12;
                    i9 = i11;
                    i10 = size;
                    z7 = a9;
                    arrayList = e8;
                }
                if (a12 > com.baidu.platform.comapi.h.t.h.c(this.f10300b) - com.baidu.platform.comapi.h.t.h.a(this.f10300b, 90)) {
                    canvas.drawText(" ...", a12 + paint.measureText(" ..."), i9, paint);
                    break;
                }
                a12 += paint.measureText(String.valueOf(cVar.f10297c[i14]));
                i11 = i9;
                a9 = z7;
                i12 = i8;
                size = i10;
                i13 = i14 + 1;
                e8 = arrayList;
                a11 = cVar;
            }
            i11 = i9 + a(this.f10300b, z7);
            i12 = i8 + 1;
            a9 = z7;
            size = i10;
            e8 = arrayList;
        }
        canvas.restore();
    }

    public void a(com.baidu.platform.comapi.walknavi.i.a aVar, int i8) {
        if (this.f10301c == null) {
            this.f10301c = new com.baidu.platform.comapi.walknavi.i.a();
        }
        this.f10301c = aVar;
        postInvalidate();
    }

    public void a(com.baidu.platform.comapi.walknavi.i.a aVar, String str) {
        if (this.f10301c == null) {
            this.f10301c = new com.baidu.platform.comapi.walknavi.i.a();
        }
        this.f10301c = aVar;
        if (com.baidu.platform.comapi.h.c.b().f()) {
            this.f10302d = str;
        } else {
            this.f10302d = "";
        }
        postInvalidate();
    }

    public void a() {
        this.f10301c = null;
        postInvalidate();
    }

    private void a(Paint paint, int i8) {
        paint.setColor(i8);
    }

    private int a(com.baidu.platform.comapi.walknavi.i.a aVar) {
        if (aVar == null || aVar.e() == null) {
            return 0;
        }
        return aVar.e().size();
    }

    protected int a(Context context, int i8, boolean z7) {
        if (i8 == 1) {
            return b.a(context, this.f10304f + 54);
        }
        if (i8 != 2) {
            return 0;
        }
        if (z7) {
            return b.a(context, this.f10304f + 44);
        }
        return b.a(context, this.f10304f + 40);
    }

    protected int a(Context context) {
        return b.a(context, this.f10303e + 100);
    }

    protected int a(Context context, boolean z7) {
        return b.a(context, 31.0f);
    }

    protected boolean a(ArrayList<c> arrayList) {
        boolean z7 = false;
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            c cVar = arrayList.get(i8);
            int i9 = 0;
            while (true) {
                if (i9 >= cVar.f10297c.length) {
                    break;
                }
                if (cVar.f10298d[i9] == 1) {
                    z7 = true;
                    break;
                }
                i9++;
            }
        }
        return z7;
    }

    protected void a(Context context, int i8, Paint paint, boolean z7, int i9) {
        if (i8 == 1) {
            if (i9 == 1) {
                paint.setTextSize(b.a(context, 35.0f));
            } else {
                paint.setTextSize(b.a(context, 24.0f));
            }
            paint.setColor(Color.parseColor("#ffffff"));
            return;
        }
        if (!z7) {
            paint.setTextSize(b.a(context, 21.0f));
            if (i9 != 5 && i9 != 3 && i9 != 4 && i9 != 6 && i9 != 7) {
                paint.setColor(Color.parseColor("#999999"));
                return;
            } else {
                paint.setColor(Color.parseColor("#ffffff"));
                return;
            }
        }
        if (i9 == 1) {
            paint.setTextSize(b.a(context, 35.0f));
            paint.setColor(Color.parseColor("#ffffff"));
            return;
        }
        paint.setTextSize(b.a(context, 18.0f));
        if (i9 != 5 && i9 != 3 && i9 != 4 && i9 != 6 && i9 != 7) {
            paint.setColor(Color.parseColor("#999999"));
        } else {
            paint.setColor(Color.parseColor("#ffffff"));
        }
    }
}
