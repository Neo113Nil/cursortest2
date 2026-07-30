package com.baidu.ar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.baidu.ar.arplay.core.engine.ARPEngine;

/* loaded from: classes.dex */
public class s4 extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public b f3193a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3194b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc f3195a;

        public a(lc lcVar) {
            this.f3195a = lcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            lc lcVar = this.f3195a;
            if (lcVar != null) {
                lcVar.d();
                s4.this.f3194b = false;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f3197a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3198b;

        /* renamed from: c, reason: collision with root package name */
        public String f3199c;

        /* renamed from: d, reason: collision with root package name */
        public String f3200d;

        /* renamed from: e, reason: collision with root package name */
        public int f3201e;

        /* renamed from: f, reason: collision with root package name */
        public int f3202f;
    }

    public s4(Context context) {
        super(context);
        this.f3194b = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f3193a == null || canvas == null || !this.f3194b) {
            return;
        }
        lc a8 = mc.a().a(this.f3193a.f3197a);
        if (a8 == null) {
            Log.e("GLWebView", "HtmlTextureHolder is null: mTextureId: " + this.f3193a.f3197a);
            return;
        }
        Canvas a9 = a8.a();
        if (a9 != null) {
            float width = a9.getWidth() / canvas.getWidth();
            a9.scale(width, width);
            a9.translate(-getScrollX(), -getScrollY());
            a9.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(a9);
        }
        a8.c();
        ARPEngine.getInstance().getARPRenderer().runSyncOnRenderContext(new a(a8));
    }

    public b getWebViewData() {
        return this.f3193a;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setIsNeedRender(boolean z7) {
        this.f3194b = z7;
    }

    public void setWebViewData(b bVar) {
        this.f3193a = bVar;
    }
}
