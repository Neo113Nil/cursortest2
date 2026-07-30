package com.baidu.platform.comapi.walknavi.segmentbrowse.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class a extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private Context f10292a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList<String> f10293b;

    /* renamed from: c, reason: collision with root package name */
    private int f10294c;

    public a(Context context, ArrayList<String> arrayList, int i8) {
        super(context);
        this.f10292a = context;
        this.f10293b = arrayList;
        this.f10294c = i8;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        com.baidu.platform.comapi.h.g.a.c("AutoTextView.onDraw", " canvas" + canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setTextSize(b.a(this.f10292a, 22.0f));
        if (this.f10294c != -1) {
            Bitmap decodeResource = BitmapFactory.decodeResource(com.baidu.platform.comapi.h.t.p.a.e(), this.f10294c);
            RectF rectF = new RectF(b.a(this.f10292a, 27.0f), b.a(this.f10292a, 21.0f), b.a(this.f10292a, 80.0f), b.a(this.f10292a, 74.0f));
            if (decodeResource != null) {
                try {
                    canvas.drawBitmap(decodeResource, new Rect(0, 0, decodeResource.getWidth(), decodeResource.getHeight()), rectF, (Paint) null);
                } catch (Exception unused) {
                }
            }
        }
        ArrayList<String> arrayList = this.f10293b;
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                canvas.drawText(this.f10293b.get(0), b.a(this.f10292a, 100.0f), b.a(this.f10292a, 51.0f), paint);
            } else if (this.f10293b.size() == 2) {
                int a8 = b.a(this.f10292a, 40.0f);
                float a9 = b.a(this.f10292a, 100.0f);
                canvas.drawText(this.f10293b.get(0), a9, a8, paint);
                paint.setTextSize(b.a(this.f10292a, 18.0f));
                canvas.drawText(this.f10293b.get(1), a9, a8 + b.a(this.f10292a, 30.0f), paint);
            }
        }
    }

    public void setContent(ArrayList<String> arrayList) {
        this.f10293b = arrayList;
        invalidate();
    }
}
