package com.facebook.ads.internal.view.e.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.internal.view.e.b.v;
import com.facebook.ads.internal.view.e.b.w;

/* loaded from: classes.dex */
public class f extends ImageView implements com.facebook.ads.internal.view.e.a.b {

    /* renamed from: a, reason: collision with root package name */
    private static final int f5735a = (int) (Resources.getSystem().getDisplayMetrics().density * 4.0f);

    /* renamed from: b, reason: collision with root package name */
    private final Paint f5736b;

    /* renamed from: c, reason: collision with root package name */
    private com.facebook.ads.internal.view.e.b f5737c;

    /* renamed from: d, reason: collision with root package name */
    private final w f5738d;

    public f(Context context) {
        super(context);
        this.f5738d = new w() { // from class: com.facebook.ads.internal.view.e.c.f.1
            @Override // com.facebook.ads.internal.j.f
            public void a(v vVar) {
                f.this.a();
            }
        };
        this.f5736b = new Paint();
        this.f5736b.setColor(-1728053248);
        setColorFilter(-1);
        setPadding(f5735a, f5735a, f5735a, f5735a);
        c();
        setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.internal.view.e.c.f.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                com.facebook.ads.internal.view.e.b bVar;
                float f;
                if (f.this.f5737c == null) {
                    return;
                }
                if (f.this.b()) {
                    bVar = f.this.f5737c;
                    f = 1.0f;
                } else {
                    bVar = f.this.f5737c;
                    f = 0.0f;
                }
                bVar.setVolume(f);
                f.this.a();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        return this.f5737c != null && this.f5737c.getVolume() == 0.0f;
    }

    private void c() {
        setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.SOUND_ON));
    }

    private void d() {
        setImageBitmap(com.facebook.ads.internal.q.b.c.a(com.facebook.ads.internal.q.b.b.SOUND_OFF));
    }

    public final void a() {
        if (this.f5737c == null) {
            return;
        }
        if (b()) {
            d();
        } else {
            c();
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void a(com.facebook.ads.internal.view.e.b bVar) {
        this.f5737c = bVar;
        if (this.f5737c != null) {
            this.f5737c.getEventBus().a((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f5738d);
        }
    }

    @Override // com.facebook.ads.internal.view.e.a.b
    public void b(com.facebook.ads.internal.view.e.b bVar) {
        if (this.f5737c != null) {
            this.f5737c.getEventBus().b((com.facebook.ads.internal.j.e<com.facebook.ads.internal.j.f, com.facebook.ads.internal.j.d>) this.f5738d);
        }
        this.f5737c = null;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2, getHeight() / 2, Math.min(r0, r1), this.f5736b);
        super.onDraw(canvas);
    }
}
