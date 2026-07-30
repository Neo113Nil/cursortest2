package com.anythink.basead.ui.animplayerview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.anythink.basead.d.f;
import com.anythink.basead.j.e;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.List;

/* loaded from: classes.dex */
public abstract class BasePlayerView extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private int f10614a;
    protected long i;

    /* renamed from: j, reason: collision with root package name */
    protected long f10615j;

    /* renamed from: k, reason: collision with root package name */
    protected int f10616k;

    /* renamed from: l, reason: collision with root package name */
    protected int f10617l;

    /* renamed from: m, reason: collision with root package name */
    protected int f10618m;

    /* renamed from: n, reason: collision with root package name */
    protected boolean f10619n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f10620o;

    /* renamed from: p, reason: collision with root package name */
    protected boolean f10621p;

    /* renamed from: q, reason: collision with root package name */
    protected boolean f10622q;

    /* renamed from: r, reason: collision with root package name */
    protected boolean f10623r;

    /* renamed from: s, reason: collision with root package name */
    protected boolean f10624s;

    /* renamed from: t, reason: collision with root package name */
    protected boolean f10625t;

    /* renamed from: u, reason: collision with root package name */
    protected Thread f10626u;

    /* renamed from: v, reason: collision with root package name */
    protected Handler f10627v;

    /* renamed from: w, reason: collision with root package name */
    protected a f10628w;

    /* renamed from: x, reason: collision with root package name */
    protected w f10629x;

    /* renamed from: y, reason: collision with root package name */
    protected x f10630y;

    /* renamed from: z, reason: collision with root package name */
    protected boolean f10631z;

    public interface a {
        void a();

        void a(int i);

        void a(long j9);

        void a(f fVar);

        void b();

        void b(int i);

        void b(long j9);

        void c();

        void d();

        void e();

        void f();
    }

    public BasePlayerView(Context context) {
        super(context);
        this.i = com.anythink.basead.exoplayer.f.f7344a;
        this.f10615j = -1L;
        this.f10623r = false;
        this.f10624s = false;
        this.f10625t = false;
        this.f10631z = false;
    }

    public void a(f fVar) {
        a aVar = this.f10628w;
        if (aVar != null) {
            aVar.a(fVar);
        }
        this.f10628w = null;
    }

    public final void b(f fVar) {
        a aVar = this.f10628w;
        if (aVar != null) {
            aVar.a(fVar);
        }
        if (this.f10631z) {
            return;
        }
        this.f10628w = null;
    }

    public abstract long getCurrentPosition();

    public abstract long getVideoLength();

    public int getViewType() {
        return this.f10614a;
    }

    public final void h() {
        this.f10628w = null;
    }

    public abstract boolean hasVideo();

    public void init(w wVar, x xVar, boolean z8, List<Bitmap> list, e eVar) {
        this.f10629x = wVar;
        this.f10630y = xVar;
    }

    public abstract boolean isMute();

    public boolean isPlayCompletion() {
        return this.f10625t;
    }

    public abstract boolean isPlaying();

    public abstract void pause();

    public void rePlayVideo() {
    }

    public void release(int i) {
    }

    public abstract void setListener(a aVar);

    public abstract void setMute(boolean z8);

    public void setNeedInterruptRelease(boolean z8) {
        this.f10631z = z8;
    }

    public void setViewType(int i) {
        this.f10614a = i;
    }

    public abstract void start();

    public abstract void stop();

    public BasePlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = com.anythink.basead.exoplayer.f.f7344a;
        this.f10615j = -1L;
        this.f10623r = false;
        this.f10624s = false;
        this.f10625t = false;
        this.f10631z = false;
    }

    public BasePlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = com.anythink.basead.exoplayer.f.f7344a;
        this.f10615j = -1L;
        this.f10623r = false;
        this.f10624s = false;
        this.f10625t = false;
        this.f10631z = false;
    }
}
