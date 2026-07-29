package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Base64;
import android.widget.ImageView;

/* renamed from: com.aiming.mdt.a.ʻʿ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0095 extends ImageView {

    /* renamed from: ʻ, reason: contains not printable characters */
    private int f276;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private int f277;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private RectF f278;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private String f279;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private float f280;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f281;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f282;

    /* renamed from: ʾ, reason: contains not printable characters */
    private Paint f283;

    public C0095(Context context) {
        super(context);
        this.f281 = 0;
        this.f277 = 6;
        this.f279 = "#999999";
        this.f280 = context.getResources().getDisplayMetrics().density * 30.0f;
        int i = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 8.0f) + 0.5f);
        setPadding(i, i, i, i);
        byte[] decode = Base64.decode("iVBORw0KGgoAAAANSUhEUgAAAgAAAAIACAMAAADDpiTIAAAB11BMVEUAAAD///+AgICqqqqAgICZmZmfn5+Ojo6ioqKVlZWdnZ2SkpKZmZmfn5+ZmZmenp6Xl5ebm5uZmZmdnZ2bm5uVlZWZmZmcnJyXl5eWlpaZmZmYmJiampqWlpaZmZmbm5uXl5eZmZmbm5uampqXl5eZmZmYmJiXl5eZmZmbm5uYmJiampqYmJiampqZmZmYmJiZmZmampqYmJiZmZmYmJiampqYmJiZmZmampqYmJiampqYmJiampqampqZmZmZmZmampqZmZmYmJiZmZmampqZmZmZmZmYmJiZmZmampqZmZmYmJiZmZmampqZmZmampqZmZmZmZmZmZmampqampqZmZmZmZmZmZmYmJiampqZmZmYmJiampqZmZmZmZmYmJiampqZmZmampqZmZmZmZmZmZmYmJiampqZmZmZmZmZmZmZmZmYmJiZmZmYmJiampqZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZmZnDSZNpAAAAnHRSTlMAAQIDBAUICQsMDQ4PEBQVFhcZGhwdHh8gIiMlJicoKSwtLjAxMjQ2Nzg+P0NHS01QUVRVV1hZWlteYGFiZWZpamxtbm9wcXJzdHV3eHl6fn+AgoOIiYyPkJKTlZeYmZqcnaGjqKyusLK0t7m9vsLExsvMz9DR0tPV1tna29ze3+Hi4+Tl5ufo6err7O3u7/Dx8vP09ff4+vv8/f6/a21AAAAAAWJLR0QB/wIt3gAACg9JREFUeNrt2/1rlXUch/HvzlnO5lzZTNuyUlemlVrYo9CzWFBhQY8WBGUU4D/QfxH91AizgAKLqAZlVAYgFDZVDDF1M3Bb6TTcfHZubjk3dcrm0e2Ozj7X9Ybo7OC54dzXa/d5QFNyzjnnnHPOOeecc84555xzzjnnnHPOOeecc84555xzzjnnnHPOOeecc84551wxriSlNG9heeeutQciPr2qRTW9+9dvjV7xqmlX5ytKCv+57mNd7a2HLwBQ8trDfTeOrv7h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", 0);
        setImageBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length));
        this.f283 = new Paint();
        this.f283.setColor(Color.parseColor(this.f279));
        this.f283.setStrokeWidth(this.f277);
        this.f283.setStyle(Paint.Style.STROKE);
        this.f283.setAntiAlias(true);
        this.f276 = (int) (this.f280 / 2.0f);
        this.f282 = ((int) (this.f280 / 2.0f)) - this.f277;
        this.f278 = new RectF(this.f276 - this.f282, this.f276 - this.f282, this.f276 + this.f282, this.f276 + this.f282);
        setClickable(true);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f278, 180.0f, this.f281, false, this.f283);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public final int m364() {
        return this.f281;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m365(int i) {
        this.f281 = i;
        invalidate();
    }
}
