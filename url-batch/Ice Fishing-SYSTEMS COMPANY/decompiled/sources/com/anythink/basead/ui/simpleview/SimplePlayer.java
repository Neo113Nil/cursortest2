package com.anythink.basead.ui.simpleview;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.b.f;
import com.anythink.basead.exoplayer.ad;
import com.anythink.basead.exoplayer.d;
import com.anythink.basead.exoplayer.h.o;
import com.anythink.basead.exoplayer.h.s;
import com.anythink.basead.exoplayer.i;
import com.anythink.basead.exoplayer.i.c;
import com.anythink.basead.exoplayer.j.q;
import com.anythink.basead.exoplayer.l.g;
import com.anythink.basead.exoplayer.w;
import java.io.File;
import u.AbstractC5088e;

/* loaded from: classes.dex */
public class SimplePlayer extends RelativeLayout {
    public static final String TAG = "SimplePlayer";

    /* renamed from: a, reason: collision with root package name */
    w.a f11430a;

    /* renamed from: b, reason: collision with root package name */
    g f11431b;

    /* renamed from: c, reason: collision with root package name */
    boolean f11432c;

    /* renamed from: d, reason: collision with root package name */
    boolean f11433d;

    /* renamed from: e, reason: collision with root package name */
    private ad f11434e;

    /* renamed from: f, reason: collision with root package name */
    private s f11435f;

    /* renamed from: g, reason: collision with root package name */
    private TextureView f11436g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11437h;
    private String i;

    /* renamed from: j, reason: collision with root package name */
    private String f11438j;

    /* renamed from: k, reason: collision with root package name */
    private final long f11439k;

    /* renamed from: l, reason: collision with root package name */
    private a f11440l;

    /* renamed from: com.anythink.basead.ui.simpleview.SimplePlayer$2, reason: invalid class name */
    public class AnonymousClass2 extends w.a {
        public AnonymousClass2() {
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerError(com.anythink.basead.exoplayer.g gVar) {
            String str;
            super.onPlayerError(gVar);
            boolean z8 = false;
            if (gVar != null) {
                int i = gVar.f7426d;
                if (i != 0) {
                    str = i != 1 ? i != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException.";
                } else {
                    str = "Play error, because have a SourceException.";
                    z8 = true;
                }
                if (gVar.getCause() != null && !TextUtils.isEmpty(gVar.getCause().getMessage())) {
                    AbstractC5088e.c(str, ",eception:").append(gVar.getCause().getMessage());
                }
            }
            if (SimplePlayer.this.f11437h && z8) {
                SimplePlayer.c(SimplePlayer.this);
                SimplePlayer.d(SimplePlayer.this);
            }
        }

        @Override // com.anythink.basead.exoplayer.w.a, com.anythink.basead.exoplayer.w.c
        public final void onPlayerStateChanged(boolean z8, int i) {
            super.onPlayerStateChanged(z8, i);
            String str = SimplePlayer.TAG;
            if (i != 3) {
                return;
            }
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.f11433d = true;
            if (simplePlayer.f11440l != null) {
                SimplePlayer.this.f11440l.a();
            }
        }
    }

    /* renamed from: com.anythink.basead.ui.simpleview.SimplePlayer$3, reason: invalid class name */
    public class AnonymousClass3 implements g {
        public AnonymousClass3() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a() {
        }

        @Override // com.anythink.basead.exoplayer.l.g
        public final void a(int i, int i4) {
            SimplePlayer simplePlayer = SimplePlayer.this;
            simplePlayer.autoFitVideoSize(i, i4, simplePlayer.f11436g);
        }
    }

    public interface a {
        void a();

        void b();
    }

    public SimplePlayer(Context context) {
        this(context, null);
    }

    public static /* synthetic */ boolean c(SimplePlayer simplePlayer) {
        simplePlayer.f11437h = false;
        return false;
    }

    private void d() {
        this.f11434e.a(this.f11435f);
    }

    private void g() {
        ad adVar = this.f11434e;
        if (adVar != null) {
            if (adVar.J()) {
                this.f11434e.m();
            }
            w.a aVar = this.f11430a;
            if (aVar != null) {
                this.f11434e.b(aVar);
            }
            g gVar = this.f11431b;
            if (gVar != null) {
                this.f11434e.b(gVar);
            }
            this.f11434e.n();
            this.f11434e = null;
        }
        this.f11440l = null;
    }

    public void autoFitVideoSize(int i, int i4, View view) {
        float max = Math.max(i / view.getMeasuredWidth(), i4 / view.getMeasuredHeight());
        int ceil = (int) Math.ceil(r4 / max);
        int ceil2 = (int) Math.ceil(r5 / max);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = ceil;
        layoutParams.height = ceil2;
        view.setLayoutParams(layoutParams);
    }

    public void load(String str, boolean z8) {
        this.f11438j = str;
        f.a();
        this.i = f.a(3, str);
        this.f11433d = false;
        if (!new File(this.i).exists() && TextUtils.isEmpty(this.f11438j)) {
            e();
            return;
        }
        if (this.f11434e == null) {
            this.f11434e = i.a(new com.anythink.basead.exoplayer.f(getContext()), new c(), new d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.f11430a = anonymousClass2;
            this.f11434e.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.f11431b = anonymousClass3;
            this.f11434e.a(anonymousClass3);
            this.f11434e.a(1.0f);
            this.f11434e.a(z8);
            a(new File(this.i).exists() ? this.i : this.f11438j, false);
        }
        postDelayed(new Runnable() { // from class: com.anythink.basead.ui.simpleview.SimplePlayer.1
            @Override // java.lang.Runnable
            public final void run() {
                SimplePlayer simplePlayer = SimplePlayer.this;
                if (simplePlayer.f11433d) {
                    return;
                }
                simplePlayer.e();
            }
        }, com.anythink.basead.exoplayer.f.f7344a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ad adVar = this.f11434e;
        if (adVar != null) {
            if (adVar.J()) {
                this.f11434e.m();
            }
            w.a aVar = this.f11430a;
            if (aVar != null) {
                this.f11434e.b(aVar);
            }
            g gVar = this.f11431b;
            if (gVar != null) {
                this.f11434e.b(gVar);
            }
            this.f11434e.n();
            this.f11434e = null;
        }
        this.f11440l = null;
    }

    public void setSimplePlayerViewListener(a aVar) {
        this.f11440l = aVar;
    }

    public void stopVideo() {
        ad adVar = this.f11434e;
        if (adVar == null || !adVar.J()) {
            return;
        }
        this.f11434e.m();
    }

    public SimplePlayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void a() {
        this.f11437h = false;
        setBackgroundColor(Color.parseColor("#000000"));
        if (this.f11436g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f11436g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f11436g, layoutParams);
        }
    }

    private void b() {
        if (this.f11436g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f11436g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f11436g, layoutParams);
        }
    }

    private String c() {
        return new File(this.i).exists() ? this.i : this.f11438j;
    }

    public static /* synthetic */ void d(SimplePlayer simplePlayer) {
        simplePlayer.f11434e.a(simplePlayer.f11435f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a aVar = this.f11440l;
        if (aVar != null) {
            aVar.b();
        }
    }

    private boolean f() {
        return !new File(this.i).exists() && TextUtils.isEmpty(this.f11438j);
    }

    public SimplePlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = "";
        this.f11438j = "";
        this.f11439k = com.anythink.basead.exoplayer.f.f7344a;
        this.f11437h = false;
        setBackgroundColor(Color.parseColor("#000000"));
        if (this.f11436g == null) {
            TextureView textureView = new TextureView(getContext());
            this.f11436g = textureView;
            textureView.setKeepScreenOn(true);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            removeAllViews();
            addView(this.f11436g, layoutParams);
        }
    }

    private void a(boolean z8) {
        String str;
        if (this.f11434e == null) {
            this.f11434e = i.a(new com.anythink.basead.exoplayer.f(getContext()), new c(), new d());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2();
            this.f11430a = anonymousClass2;
            this.f11434e.a(anonymousClass2);
            AnonymousClass3 anonymousClass3 = new AnonymousClass3();
            this.f11431b = anonymousClass3;
            this.f11434e.a(anonymousClass3);
            this.f11434e.a(1.0f);
            this.f11434e.a(z8);
            if (new File(this.i).exists()) {
                str = this.i;
            } else {
                str = this.f11438j;
            }
            a(str, false);
        }
    }

    private void a(String str, boolean z8) {
        while (true) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.f11434e == null) {
                    e();
                    return;
                }
                this.f11437h = TextUtils.equals(str, this.i);
                Uri parse = Uri.parse(str);
                if (str.toLowerCase().startsWith("http")) {
                    this.f11435f = new o.c(new q("Anythink_ExoPlayer")).b(parse);
                    this.f11432c = true;
                } else {
                    this.f11435f = new o.c(new com.anythink.basead.exoplayer.j.o(getContext(), "Anythink_ExoPlayer")).b(parse);
                    this.f11432c = false;
                }
                this.f11434e.a(this.f11436g);
                this.f11434e.a(this.f11435f);
                return;
            } catch (Throwable th) {
                th.printStackTrace();
                if (!TextUtils.equals(str, this.f11438j) && !z8) {
                    str = this.f11438j;
                    z8 = true;
                } else {
                    th.getMessage();
                    e();
                }
            }
        }
        th.getMessage();
        e();
    }
}
