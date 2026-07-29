package com.aiming.mdt.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.view.InputDeviceCompat;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.aiming.mdt.utils.C0282;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.aiming.mdt.a.ʼʾˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class SurfaceHolderCallbackC0134 extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private float f421;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private float f422;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private int f423;

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private int f424;

    /* renamed from: ʻʼʾ, reason: contains not printable characters */
    private SurfaceHolder f425;

    /* renamed from: ʻʼʿ, reason: contains not printable characters */
    private float f426;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private int f427;

    /* renamed from: ʻʽʾ, reason: contains not printable characters */
    private int f428;

    /* renamed from: ʻʽʿ, reason: contains not printable characters */
    private int f429;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private int f430;

    /* renamed from: ʻʿ, reason: contains not printable characters */
    private Map<Integer, Float> f431;

    /* renamed from: ʼ, reason: contains not printable characters */
    private int f432;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private List<C0039> f433;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private InterfaceC0102 f434;

    /* renamed from: ʼʽʿ, reason: contains not printable characters */
    private int f435;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private LinkedList<String> f436;

    /* renamed from: ʼʿ, reason: contains not printable characters */
    private boolean f437;

    /* renamed from: ʽ, reason: contains not printable characters */
    private int f438;

    /* renamed from: ʽʾ, reason: contains not printable characters */
    private Canvas f439;

    /* renamed from: ʽʿ, reason: contains not printable characters */
    private Paint f440;

    /* renamed from: ʾ, reason: contains not printable characters */
    private int[] f441;

    /* renamed from: ʾʿ, reason: contains not printable characters */
    private boolean f442;

    /* renamed from: ʿ, reason: contains not printable characters */
    private float f443;

    public SurfaceHolderCallbackC0134(Context context) {
        super(context);
        this.f430 = 10;
        this.f423 = 1;
        this.f436 = null;
        this.f441 = new int[]{SupportMenu.CATEGORY_MASK, -1, -16776961, InputDeviceCompat.SOURCE_ANY};
        this.f433 = new ArrayList();
        this.f437 = true;
        this.f431 = new HashMap();
        this.f426 = -1.0f;
        this.f443 = 0.33f;
        this.f442 = false;
        this.f429 = 0;
        this.f435 = 0;
        this.f422 = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 16.0f) + 0.5f);
        this.f432 = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 2.0f) + 0.5f);
        this.f427 = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 10.0f) + 0.5f);
        this.f438 = (int) (((getContext().getResources().getDisplayMetrics().densityDpi / 160.0f) * 20.0f) + 0.5f);
        setWillNotCacheDrawing(true);
        setDrawingCacheEnabled(false);
        setZOrderMediaOverlay(true);
        setZOrderOnTop(true);
        this.f440 = new Paint();
        this.f440.setAntiAlias(true);
        this.f440.setTextSize(this.f422);
        Paint.FontMetrics fontMetrics = this.f440.getFontMetrics();
        this.f421 = fontMetrics.descent - fontMetrics.ascent;
        this.f425 = getHolder();
        this.f425.setFormat(-3);
        this.f425.addCallback(this);
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    private boolean m508() {
        if ((this.f436 == null || this.f436.size() == 0) && this.f433.size() == 0) {
            this.f437 = false;
            if (this.f434 != null) {
                this.f434.mo375();
            }
        }
        return this.f437;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SurfaceHolder surfaceHolder;
        Canvas canvas;
        while (m508() && !this.f442) {
            try {
                try {
                } catch (Exception e) {
                    C0282.m972("DanmakuTextureView", e);
                    C0076.m232().m236(e);
                    if (this.f439 != null && this.f425 != null && this.f425.getSurface().isValid()) {
                        surfaceHolder = this.f425;
                        canvas = this.f439;
                    }
                }
                if (this.f425 == null) {
                    try {
                        if (this.f439 != null && this.f425 != null && this.f425.getSurface().isValid()) {
                            surfaceHolder = this.f425;
                            canvas = this.f439;
                            surfaceHolder.unlockCanvasAndPost(canvas);
                        }
                        Thread.sleep(1L);
                    } catch (Exception e2) {
                        C0282.m972("DanmakuTextureView", e2);
                        C0076.m232().m236(e2);
                    }
                } else {
                    this.f439 = this.f425.lockCanvas();
                    if (this.f439 == null) {
                        if (this.f439 != null && this.f425 != null && this.f425.getSurface().isValid()) {
                            surfaceHolder = this.f425;
                            canvas = this.f439;
                            surfaceHolder.unlockCanvasAndPost(canvas);
                        }
                        Thread.sleep(1L);
                    } else {
                        if (this.f428 == 0) {
                            this.f428 = this.f439.getHeight();
                        }
                        if (this.f424 == 0) {
                            this.f424 = this.f439.getWidth();
                        }
                        if (this.f433.isEmpty()) {
                            int length = this.f441.length;
                            Iterator<String> it = this.f436.iterator();
                            int i = 0;
                            while (it.hasNext()) {
                                String next = it.next();
                                C0039 c0039 = new C0039();
                                c0039.m83(next);
                                c0039.m88(this.f440.measureText(next));
                                c0039.m91(this.f441[i % length]);
                                c0039.m82((i % this.f430) + 1);
                                c0039.m81(0.0f);
                                c0039.m85(0.0f);
                                c0039.m89(false);
                                this.f433.add(c0039);
                                i++;
                            }
                            this.f436.clear();
                            for (int i2 = 1; i2 <= this.f430; i2++) {
                                this.f431.put(Integer.valueOf(i2), Float.valueOf(-1.0f));
                            }
                        }
                        int i3 = this.f423;
                        Iterator<C0039> it2 = this.f433.iterator();
                        if (i3 == 1) {
                            while (it2.hasNext()) {
                                C0039 next2 = it2.next();
                                if (next2.m92() && next2.m87() < 0.0f - next2.m79()) {
                                    it2.remove();
                                }
                            }
                        }
                        if (i3 == 2) {
                            float f = this.f428 * this.f443;
                            while (it2.hasNext()) {
                                C0039 next3 = it2.next();
                                if (next3.m92()) {
                                    if (next3.m90() == 0.0f || next3.m90() >= f) {
                                        float m90 = (next3.m90() - f) / 255.0f;
                                        float f2 = m90 < 1.0f ? 255.0f * m90 : 255.0f;
                                        int m80 = next3.m80();
                                        next3.m91(Color.argb(Math.round(f2), Color.red(m80), Color.green(m80), Color.blue(m80)));
                                    } else {
                                        it2.remove();
                                    }
                                }
                            }
                        }
                        this.f439.drawColor(0, PorterDuff.Mode.CLEAR);
                        int size = this.f433.size();
                        if (size == 0) {
                            if (this.f439 != null && this.f425 != null && this.f425.getSurface().isValid()) {
                                surfaceHolder = this.f425;
                                canvas = this.f439;
                                surfaceHolder.unlockCanvasAndPost(canvas);
                            }
                            Thread.sleep(1L);
                        } else {
                            for (int i4 = 0; i4 < size; i4++) {
                                C0039 c00392 = this.f433.get(i4);
                                if (c00392 != null) {
                                    if (this.f423 == 1) {
                                        if (!c00392.m92()) {
                                            if (!this.f431.isEmpty() && c00392.m86() < this.f431.size()) {
                                                float floatValue = this.f431.get(Integer.valueOf(c00392.m86())).floatValue();
                                                if (floatValue == -1.0f || floatValue + this.f438 < this.f424) {
                                                    c00392.m81(this.f424);
                                                    c00392.m85(c00392.m86() * (this.f421 + this.f427));
                                                    c00392.m89(true);
                                                }
                                            }
                                        }
                                        if (c00392.m92()) {
                                            float m87 = c00392.m87() - this.f432;
                                            this.f431.put(Integer.valueOf(c00392.m86()), Float.valueOf(c00392.m79() + m87));
                                            c00392.m81(m87);
                                        }
                                    }
                                    if (this.f423 == 2) {
                                        if (!c00392.m92() && (this.f426 == -1.0f || this.f426 < this.f428)) {
                                            c00392.m81((this.f438 / 2.0f) + 0.0f);
                                            c00392.m85(this.f428 + this.f427 + this.f421);
                                            c00392.m89(true);
                                        }
                                        if (c00392.m92()) {
                                            float m902 = c00392.m90() - this.f432;
                                            this.f426 = m902;
                                            c00392.m85(m902);
                                        }
                                    }
                                    if (c00392.m92()) {
                                        this.f440.setColor(c00392.m80());
                                        this.f439.drawText(c00392.m84(), c00392.m87(), c00392.m90(), this.f440);
                                    }
                                }
                            }
                            if (this.f439 != null && this.f425 != null && this.f425.getSurface().isValid()) {
                                surfaceHolder = this.f425;
                                canvas = this.f439;
                                surfaceHolder.unlockCanvasAndPost(canvas);
                            }
                            Thread.sleep(1L);
                        }
                    }
                }
            } catch (Throwable th) {
                if (this.f439 != null && this.f425 != null && this.f425.getSurface().isValid()) {
                    this.f425.unlockCanvasAndPost(this.f439);
                }
                throw th;
            }
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C0282.m973("DanmakuTextureView", "surfaceChanged");
        this.f442 = false;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C0282.m973("DanmakuTextureView", "surfaceCreated");
        this.f442 = false;
        new Thread(this).start();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C0282.m973("DanmakuTextureView", "surfaceDestroyed");
        this.f442 = true;
        this.f436.clear();
        this.f433.clear();
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final void m509(int[] iArr) {
        this.f441 = iArr;
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    public final void m510(int i) {
        this.f423 = i;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public final void m511(InterfaceC0102 interfaceC0102) {
        this.f434 = interfaceC0102;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final void m512(LinkedList<String> linkedList) {
        this.f436 = linkedList;
    }
}
