package com.youappi.sdk.ui.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.games.GamesStatusCodes;
import com.youappi.sdk.AdType;
import com.youappi.sdk.BaseAd;
import com.youappi.sdk.YAErrorCode;
import com.youappi.sdk.ads.YAInterstitialVideoAd;
import com.youappi.sdk.ads.YARewardedVideoAd;
import com.youappi.sdk.logic.IAdEventListener;
import com.youappi.sdk.logic.IAssetResolver;
import com.youappi.sdk.net.model.AdItem;
import com.youappi.sdk.net.model.VastError;
import com.youappi.sdk.net.model.VideoEvent;
import com.youappi.sdk.net.model.VideoItem;
import com.youappi.sdk.ui.model.AdViewModel;
import com.youappi.sdk.ui.model.VideoViewModel;
import com.youappi.sdk.ui.subviews.OptOutClippingLayout;
import com.youappi.sdk.ui.widgets.CircularProgressBarView;
import com.youappi.sdk.utils.g;
import com.youappi.sdk.utils.i;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public class VideoAdView extends RelativeLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, View.OnClickListener, MediaController.MediaPlayerControl, IAdView<VideoViewModel, YAInterstitialVideoAd.InterstitialVideoAdListener> {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9495a = "VideoAdView";
    private YAInterstitialVideoAd.InterstitialVideoAdListener A;
    private BaseAd.AdStateListener B;
    private AtomicInteger C;
    private IAssetResolver D;
    private int E;
    private int F;
    private SurfaceHolder G;
    private Animation H;
    private Animation I;
    private Animation J;
    private Animation K;
    private Animation L;
    private Animation M;
    private Animation N;
    private Context O;
    private Boolean P;
    private int Q;
    private boolean R;
    private AtomicBoolean S;
    private AtomicBoolean T;
    private AtomicBoolean U;
    private AtomicBoolean V;
    private AtomicBoolean W;
    private AtomicBoolean aa;
    private e ab;
    private d ac;
    private c ad;
    private b ae;
    private f af;
    private boolean ag;
    private boolean ah;
    private String ai;
    private int aj;
    private Runnable ak;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9496b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f9497c;

    /* renamed from: d, reason: collision with root package name */
    private SurfaceView f9498d;
    private MediaPlayer e;
    private boolean f;
    private Uri g;
    private AtomicBoolean h;
    private AtomicBoolean i;
    private AtomicBoolean j;
    private AtomicBoolean k;
    private Map<String, Boolean> l;
    private AdViewModel m;
    private IAdEventListener n;
    private CircularProgressBarView o;
    private RelativeLayout p;
    private RelativeLayout q;
    private RelativeLayout r;
    private OptOutClippingLayout s;
    private Button t;
    private RelativeLayout u;
    private ImageView v;
    private ImageView w;
    private ImageView x;
    private Handler y;
    private Handler z;

    private static class a implements Animation.AnimationListener {

        /* renamed from: a, reason: collision with root package name */
        private View[] f9508a;

        /* renamed from: b, reason: collision with root package name */
        private AtomicBoolean f9509b;

        /* renamed from: c, reason: collision with root package name */
        private AtomicBoolean f9510c;

        a(AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, View... viewArr) {
            this.f9509b = atomicBoolean2;
            this.f9508a = viewArr;
            this.f9510c = atomicBoolean;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f9510c != null) {
                this.f9510c.set(false);
            }
            this.f9509b.set(false);
            for (View view : this.f9508a) {
                view.setVisibility(4);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f9510c != null) {
                this.f9510c.set(true);
            }
        }
    }

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoAdView.this.u();
        }
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoAdView.this.x();
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoAdView.this.y();
        }
    }

    private class e implements Runnable {
        private e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoAdView.this.V.set(false);
            VideoAdView.this.t.startAnimation(VideoAdView.this.M);
        }
    }

    private class f implements Runnable {
        private f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoAdView.this.w();
        }
    }

    public VideoAdView(Context context) {
        super(context);
        this.f9496b = new Object();
        this.f9497c = new Object();
        this.f = false;
        this.C = new AtomicInteger(1);
        this.S = new AtomicBoolean(false);
        this.U = new AtomicBoolean(false);
        this.W = new AtomicBoolean(false);
        this.aa = new AtomicBoolean(false);
        this.ab = new e();
        this.ac = new d();
        this.ad = new c();
        this.ae = new b();
        this.af = new f();
        this.ah = true;
        this.ak = new Runnable() { // from class: com.youappi.sdk.ui.views.VideoAdView.1
            @Override // java.lang.Runnable
            public void run() {
                if (VideoAdView.this.e != null) {
                    int duration = VideoAdView.this.e.getDuration() / 1000;
                    int currentPosition = VideoAdView.this.e.getCurrentPosition() / 1000;
                    int i = duration - currentPosition;
                    if (i < 0 || i > duration) {
                        i = 0;
                    }
                    VideoAdView.this.o.setProgress(i);
                    float f2 = duration / 4.0f;
                    if (com.youappi.sdk.utils.d.a(VideoEvent.EVENT_SKIP, VideoAdView.this.m.getAdItem()) && VideoAdView.this.b(currentPosition) && !VideoAdView.this.R) {
                        VideoAdView.this.a();
                    }
                    float f3 = currentPosition;
                    if (f3 >= f2 && f3 < f2 * 2.0f) {
                        VideoAdView.this.a("firstQuartile");
                    }
                    float f4 = 2.0f * f2;
                    if (f3 >= f4 && f3 < f2 * 3.0f) {
                        VideoAdView.this.a("midpoint");
                    }
                    if (f3 >= f2 * 3.0f && currentPosition < duration) {
                        VideoAdView.this.a("thirdQuartile");
                    }
                    if (VideoAdView.this.r() && VideoAdView.this.u.getVisibility() != 0 && f3 >= f4) {
                        VideoAdView.this.u.setVisibility(0);
                    }
                    if (currentPosition < duration) {
                        VideoAdView.this.postDelayed(this, 1000L);
                    }
                }
            }
        };
        this.O = context;
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i) {
        return com.youappi.sdk.utils.f.a(getContext(), i);
    }

    private Point a(float f2, float f3, float f4, float f5) {
        float min = Math.min(f4 / f2, f5 / f3);
        return new Point(Math.round(f2 * min), Math.round(f3 * min));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(float f2, float f3) {
        Point a2 = a(this.E, this.F, f2, f3);
        this.f9498d.getLayoutParams().width = Math.round(a2.x);
        this.f9498d.getLayoutParams().height = Math.round(a2.y);
        this.f9498d.getHolder().setFixedSize(a2.x, a2.y);
    }

    private void a(VastError vastError, String str) {
        if (this.n != null) {
            this.n.onGotEvent("error", vastError, str, g.c(getContext()), this.e != null ? this.e.getCurrentPosition() : 0, this.m.getAdItem());
        }
    }

    private void a(IOException iOException) {
        if (this.A != null) {
            this.A.onShowFailure(null, YAErrorCode.PLAYBACK_ERROR, iOException);
        }
        a(VastError.VAST_ERROR_UNABLE_TO_FIND_MEDIA, iOException.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (this.l.get(str) == null || this.l.get(str).booleanValue()) {
            return;
        }
        this.l.put(str, true);
        b(str);
    }

    private void b(String str) {
        if ((!VideoEvent.EVENT_MUTE.equals(str) || this.Q <= 2) && this.n != null) {
            this.n.onGotEvent(str, null, null, g.c(getContext()), this.e != null ? this.e.getCurrentPosition() : 0, this.m.getAdItem());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(int i) {
        int intValue;
        return this.m != null && (intValue = ((VideoItem) this.m.getAdItem()).getVideoConfig().getSkipOffset().intValue()) >= 0 && i >= intValue;
    }

    private void c() {
        this.aj = a(15);
        this.P = false;
        this.l = new HashMap();
        this.l.put("firstQuartile", false);
        this.l.put("midpoint", false);
        this.l.put("thirdQuartile", false);
        this.y = new Handler();
        this.z = new Handler();
        this.h = new AtomicBoolean();
        this.i = new AtomicBoolean();
        this.j = new AtomicBoolean(false);
        this.k = new AtomicBoolean(false);
        this.e = new MediaPlayer();
        this.e.setOnCompletionListener(this);
        this.e.setOnPreparedListener(this);
        this.e.setOnBufferingUpdateListener(this);
        this.e.setOnVideoSizeChangedListener(this);
        this.e.setOnErrorListener(this);
        d();
        e();
        f();
        j();
        i();
        h();
        k();
        g();
        setKeepScreenOn(true);
    }

    private void c(int i) {
        this.y.postDelayed(this.ae, i);
    }

    private void c(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(268435456);
        intent.setData(Uri.parse(str));
        this.O.startActivity(intent);
    }

    private void d() {
        this.f9498d = new SurfaceView(getContext());
        this.f9498d.setId(l());
        this.f9498d.setContentDescription("PlayerSurfaceView");
        this.f9498d.getHolder().addCallback(this);
        this.f9498d.setContentDescription("PlayerSurfaceView");
        setOnClickListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.f9498d, layoutParams);
        setBackgroundColor(-16777216);
    }

    private void d(int i) {
        this.y.removeCallbacks(this.ad);
        this.y.postDelayed(this.ad, i);
    }

    private void e() {
        this.o = new CircularProgressBarView(getContext());
        this.o.setProgress(0);
        this.o.setVisibility(4);
        this.o.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VideoAdView.this.o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                if (VideoAdView.this.getWidth() <= 0) {
                    VideoAdView.this.o.getViewTreeObserver().addOnGlobalLayoutListener(this);
                    return;
                }
                VideoAdView.this.o.a(VideoAdView.this.getContext(), VideoAdView.this.a(30));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(11, -1);
                layoutParams.addRule(12, -1);
                layoutParams.setMargins(0, 0, VideoAdView.this.aj, VideoAdView.this.aj);
                VideoAdView.this.o.setLayoutParams(layoutParams);
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12, -1);
        layoutParams.addRule(9, -1);
        addView(this.o, layoutParams);
    }

    private void e(int i) {
        this.z.postDelayed(this.ac, i);
    }

    private void f() {
        this.p = new RelativeLayout(getContext());
        this.p.setVisibility(4);
        this.p.setId(l());
        this.p.setBackgroundColor(Color.parseColor("#B2000000"));
        this.p.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VideoAdView.this.p.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                layoutParams.setMargins(0, VideoAdView.this.aj, VideoAdView.this.aj, 0);
                VideoAdView.this.p.setLayoutParams(layoutParams);
                int a2 = VideoAdView.this.a(5);
                VideoAdView.this.p.setPadding(a2, a2, a2, a2);
                TextView textView = new TextView(VideoAdView.this.getContext());
                textView.setId(VideoAdView.this.l());
                textView.setText("Skip");
                textView.setTextSize(VideoAdView.this.a(5));
                textView.setTextColor(Color.parseColor("#aaa4a7"));
                textView.setTypeface(null, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(15);
                layoutParams2.setMargins(0, 0, VideoAdView.this.a(5), 0);
                VideoAdView.this.p.addView(textView, layoutParams2);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(15, -1);
                layoutParams3.addRule(1, textView.getId());
                ImageView imageView = new ImageView(VideoAdView.this.getContext());
                imageView.setImageBitmap(i.b("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"));
                VideoAdView.this.p.addView(imageView, layoutParams3);
                imageView.getLayoutParams().width = VideoAdView.this.a(12);
                imageView.getLayoutParams().height = VideoAdView.this.a(12);
            }
        });
        addView(this.p, new RelativeLayout.LayoutParams(-2, -2));
    }

    private void f(int i) {
        this.z.removeCallbacks(this.ab);
        this.z.postDelayed(this.ab, i);
    }

    private void g() {
        this.u = new RelativeLayout(getContext());
        this.u.setId(l());
        this.u.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.4
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VideoAdView.this.u.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(14, -1);
                layoutParams.addRule(12, -1);
                layoutParams.width = VideoAdView.this.a(100);
                layoutParams.height = VideoAdView.this.a(30);
                layoutParams.setMargins(0, 0, 0, VideoAdView.this.aj);
                VideoAdView.this.u.setLayoutParams(layoutParams);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                float a2 = VideoAdView.this.a(12);
                gradientDrawable.setCornerRadii(new float[]{a2, a2, a2, a2, a2, a2, a2, a2});
                gradientDrawable.setColor(Color.parseColor("#4DFFFFFF"));
                gradientDrawable.setStroke(VideoAdView.this.a(1), -1);
                VideoAdView.this.u.setBackground(gradientDrawable);
                TextView textView = new TextView(VideoAdView.this.getContext());
                textView.setId(VideoAdView.this.l());
                textView.setText("Learn more");
                textView.setTextSize(VideoAdView.this.a(4));
                textView.setTextColor(-1);
                textView.setTypeface(null, 0);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(15);
                layoutParams2.addRule(14);
                layoutParams2.setMargins(0, 0, 0, 0);
                VideoAdView.this.u.addView(textView, layoutParams2);
            }
        });
        addView(this.u, new RelativeLayout.LayoutParams(-2, -2));
        this.u.setOnClickListener(this);
    }

    private void g(int i) {
        this.y.removeCallbacks(this.af);
        this.y.postDelayed(this.af, i);
    }

    private void h() {
        this.r = new RelativeLayout(getContext());
        this.r.setVisibility(0);
        this.r.setId(l());
        this.r.setBackgroundColor(0);
        this.r.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.5
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VideoAdView.this.r.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(9, -1);
                layoutParams.addRule(10, -1);
                layoutParams.width = VideoAdView.this.a(30);
                layoutParams.height = VideoAdView.this.a(30);
                layoutParams.setMargins(VideoAdView.this.aj, VideoAdView.this.aj, 0, 0);
                VideoAdView.this.r.setLayoutParams(layoutParams);
                VideoAdView.this.x = new ImageView(VideoAdView.this.getContext());
                VideoAdView.this.x.setImageBitmap(i.b("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAABmJLR0QAAAAAAAD5Q7t/AAAACXBIWXMAADddAAA3XQEZgEZdAAAAB3RJTUUH4gEWDjU5KOBWbgAACT1JREFUeNrtXWuMVdUV/tY4MA4DI0gcmGFQASvqRKQJPjpBCwV8NrYVpRERtUmjremvJk3Tkpb4w1oRLW1KosGSqm3SRrAgUkqlim1RQPEJdmCCaRXlURVmGIeXfv1x96SH7T7n3HPvOvfuM3O+5Gbm7Ny719pr7cdaa++zNpAjR44cVYNkkWmSIwDUAzjVFB0B0CsiH+cK0BNyE4BLAVwAoM38PR/AkJiffgLgbQDbAewwfzeLyIFcAdECHw5gBoBpAKYbgWvxR6OI5wA8D2CDiBwa8PMfyaEk55P8K8kTrBxOGJrzSTYMuBFAshnA9wHcDmBkgp8eBrAfQLeZanpMeYOZmoYBaAIwNEGd/wWwHMBiEdnXrxVA8iwAPwDwrcACGoadAP4G4DXz/04R2VMknVYA5wL4AoAvAviK+T8KvQCWAVgkIu/2t6mmkeQvSB6LmBaOkFxhpoXWFHgYS/I2kk8ZWmE4SvIBksP6g+CF5FyS70c0+O8kv21My4qZsSTvJPmPCL7eI/nNLAu/leSGiAauJfklD/hsJ7kugs/1JFuyJvxrSR4IadBfSE7xkOdLST4bwvM+kldlQfC1JO8n+ZmjEf8hOTsDbZhD8l0H/5+SvJdkra+MDyG5JoTxRdW2t0vwTx4M6UirSNZ7FzYg+bKD2T0kv5zhdWxaiAGxheQZvjDZQvJNB5MvkByTEs06kpNIzgx8JpEcnJL5+k9H+14nObrawh9FcpeDuUdInqJM6zyS95B8ieTxkMXyOMkXSS4kOVF5bVvmoLed5MhqzpNbHEwtJCmKdC4zllMpWEfyEkWf5j4Hjc0VX99Mj1jtEr4ijUEkF5tFvNzA2yKSg5T4usdBY6X2iI9jYrGDiZ8r1n8myVeUI6AvkzxTib8HHPX/rFLC/7rDPFumNe2QnGB8hjTwb5ITlKaj5Vbdn5G8Pm3hjyG53yK8Ucv6MEG7t2KEuNtMKdeQvIjkePP3WtMzd8f8voPk6UqWmG0d7U3VMnK46vu04iQka0IcuT68SfKGuJFmeufsGEU+ozFiTbzLDrn8OS3hz3eYfFco1n93hMCWJF3kjKHwy4g671R01uzdvJu1hT/MeLVB3KscxtgfIqiHyqx7SUi9e7VCCib+Zce9GjQVsNgxD9cr1v/diMjpKWXWXRsR5bxLif8Gs8AHcZ+WcMY5drJmKY8wVyijRyuUQfLskF2wVxTbcJVV9zGzBVt2xfY8ulpZ+ONCeuevlOksDaEzVpHGWqvuBzUCbUes0PL5yoK5LUQw7cp0Lg+hM0+RxkWWj9RrToCEoiamzu8BqAs8rxWRt5UNrAsdZR8B2KxM50UABx3lk7QIiMjrANYFik4FcHc5jsaHVm+5OAXzdoUrbJCSKb3NQeuPyjQuserfHxWHihoBVwIIeoybRGRrCnJxHf9I64DUXkfZaZoERGQLgJcCRWcAmFWKAu6wnh9NSSiu3tGTEq3DjrLBKdD5jfV8eyIFmIOy1wSKegGsQI5i8SSAo4Hnr5JsdH2xNmL6CR4dXKV9mticPJsCwHUgayzJm1IQjMvkHEFyOoCtInJYaRr6mOTTAG40RfUAZgJYWaxwHrEWkjnKYYclxkTzCZ+QfEgxPDHXqn9pkh93WnHuJiWm6sxRRJ+xkWSdQlubLZ+gI4nbflIYWLH3/5TZwAKl9u6w6m0tZhG2jw1uVGKmBsBdyAa+Y/gtF7bsLi5GAedZz68qNaoVwOiMKKDFfMrFqzGydSrAPk+zM0WHy2doOGg7Y2RbUQUMRJSkgPGB/7uq8d5UP8IHlvc9PlIBZqN6eAViMgMCIkJLhiPiRkA9gOAWYHcuxrIRlOEg28ewFTA04sc5ylfA54yRmhhLJVdA+eiynhvjFuEcFURtTI9v9JTvowCeALAahTfmGwBcD2Ae0onvl4PGqBERpwAfnaddAK4TkV1W+SqS9wNYA+AcjxXQHToFiUgvgBMeK6AbwNUO4ffx34HCRlKPRzwHZXhMRI7GrQHBjZcmzxTwaxHZHWN7dwJY6gOzxq8KyvBgMZ5wZ3D4ePaW+FPK30sbrZZp31mMAv4VF7+oIvYU+T1fsp1MjJGtUwEdHiug2BcrRnqqgI5iFGAvcJM9UkCxh4Kv9ITfyTGydS4cLdY2WqfSgtSmsFX4XtjxjgCd02LS4xSLNoU2v2PtrY+KHQEi8r41V01QOWatgzEAVoQlUzLKWQmg2QMLaByAswNFO1yh/bBQhL2XeYVH09BMANtIzuuz0MyovRXANhTSk/kAO0fG864vhSngWevZtzQz5wB4HMAekjTW0WMAJnjE4+wYmcYq4Ejg+epKphTLOkz+iKAh0ItCAsLiFCAiBwH8KVBUB+DmXLRFYy5ODgquFJGuJCMAAH5vPd+SyzWRAqJkWZQC1gEI5ltu9yHJXgamn6kALgsU7QOwPrECROQ4Pv9OwI9yEcfCltEyETlR8mJCsttyUKaUWFcbs4W2EtrYbtXRFZeXInJLUkQ+RCGvchA/yTt5KBY4ev9H5c5po83Z+SBuKKGe8RkbAeMStm+O432DUVoLS9mpCkgONkMyCziUJMNWqqkKDAGVZB0kH86IApYmbFe6yToMkdmODFFfS1hHk6On+IZ3kuQEJfkNRwaxdDJnaSRsInmWST3pIzYlySunkbBJEgpvDAovHQR7yAsAZonIsQT11JhYyeU4+SxqtfCpacd6c6C2mDbUmfhOu+V0TRaRvWl6eq4MUau8TWqdjgxqST6dZgaxOAYWOobvwwNE+ELyMUf7f1zpHpBq4laPFVD9xK0Bu96VUnh5f5yOTKf7bUh65EHVYmpYSIZb/3Lsl9fOISEjfhPJIdVmrpnkG5VMX1/h9oWlr3+t6unrLVf8mRCX/qYMC3+OaYONNd7dCGLyQPxhAFxh8rs0LorQYryG5IKQeyGzfonPcZI/1LwbIc1GzDBhiv5yjdUHJKdlbf5s6UcXuTUji8ivMvRHEfllniHIr7P9P6pynW1+oXOVL3T2wWydarYqK7lf3GVoTlXKjJWtERCijOEAZgCYBmA6gAsU+SOA7QCeQ+GY+AbtNJyZV4BDIU0o5FibaD7nms9wM9240IPCa7YdfesGCi+bbBWRAz62UzI6ddWikFKsL63YIQCHSj4CmCNHjhwDE/8D7EWQFgzhozcAAAAASUVORK5CYII="));
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(14, -1);
                layoutParams2.addRule(15, -1);
                VideoAdView.this.x.setPadding(0, 0, 0, 0);
                VideoAdView.this.r.addView(VideoAdView.this.x, layoutParams2);
            }
        });
        addView(this.r, new RelativeLayout.LayoutParams(-2, -2));
        this.r.setOnClickListener(this);
    }

    @SuppressLint({"WrongConstant"})
    private void i() {
        this.s = new OptOutClippingLayout(getContext());
        this.s.setRadius(this.aj);
        this.s.setVisibility(4);
        this.s.setId(l());
        this.s.setBackgroundColor(0);
        this.t = new Button(getContext());
        this.t.setVisibility(0);
        this.t.setId(l());
        float a2 = a(15);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{0.0f, 0.0f, a2, a2, a2, a2, 0.0f, 0.0f}, null, null));
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setStyle(Paint.Style.STROKE);
        shapeDrawable.getPaint().setStrokeWidth(a(1));
        this.t.setBackground(shapeDrawable);
        this.t.setText("Privacy");
        this.t.setTextColor(-1);
        this.t.setPadding(a(10), 0, 0, 0);
        this.t.setTextSize(a(4));
        this.s.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.6
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VideoAdView.this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(9, -1);
                layoutParams.addRule(10, -1);
                layoutParams.width = VideoAdView.this.a(80);
                layoutParams.height = VideoAdView.this.a(30);
                layoutParams.setMargins(VideoAdView.this.a(30), VideoAdView.this.aj, 0, 0);
                VideoAdView.this.s.setLayoutParams(layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(14, -1);
                layoutParams2.addRule(15, -1);
                int a3 = VideoAdView.this.a(1);
                layoutParams2.setMargins(a3, a3, a3, a3);
                VideoAdView.this.s.addView(VideoAdView.this.t, layoutParams2);
            }
        });
        addView(this.s, new RelativeLayout.LayoutParams(-2, -2));
        this.t.setOnClickListener(this);
    }

    private void j() {
        this.q = new RelativeLayout(getContext());
        this.q.setVisibility(0);
        this.q.setId(l());
        this.q.setBackgroundColor(0);
        this.q.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                VideoAdView.this.q.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(9, -1);
                layoutParams.addRule(12, -1);
                layoutParams.width = VideoAdView.this.a(30);
                layoutParams.height = VideoAdView.this.a(30);
                layoutParams.setMargins(VideoAdView.this.aj, 0, 0, VideoAdView.this.aj);
                VideoAdView.this.q.setLayoutParams(layoutParams);
                VideoAdView.this.w = new ImageView(VideoAdView.this.getContext());
                VideoAdView.this.w.setImageBitmap(i.b("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAA3XQAAN10BGYBGXQAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAAUJSURBVHic7Z1NiBxFFMdfRbMIRiNKREL8JCpBIyrqZVHwA/wKiIKCnpdcEz0Y8aCCFw9+IIpexJsQgiAYEBQRVJRAoqi4JMYEUUTIuoGVxGg2a34eepqdGTZdr7qranqm3+9aVa/+9f5dMz3V1TUihmEYhmEYhmEYhmEYhjEGADsUdV4GZoBp4IIcujoBsANAUa+f/4BvgdeALcBUDq0TR5n8GgYMMw+8CdyaQ/dEALzQn0FFfS3fAVuBc3KMYyzpv/ITGFDyE/BgjvGMFSslP5EBJR8CV+YYW+th6GMnkwEA/wDbAJdjnK2EM1z5mQwoeZ8u3sL6kq804GngPeBAQxP2AxtzjLsVaJKvMWAo5lXAduDrmibMA7enGnNr0CY/1IChPq6l+EF2ItCEv4G7Yo63VYQkv4kBff2tB94ClgJNuDPGeFtFaPJjGNDX903AnoCujwE3xOp/5FBxq5nDgJ4GR3Hbuajs/g9gQ0wNI4EaV34KA/r03AssKCV8CZydQkcWmiQ/lQE9XZuB35Qynk2lIynU/NjJYUBP3wbgF4WMU8BtKbVEh4ZXfg4DejqvA44qpOwDVqXWEwUiXPm5DOjpnQZOKuTM5NDTCCJd+TkN6Ol+SiHnd+DcXJqCiZ18jQHAk8DFEbSvAj5XSNrWtK8kpEi+0gAo7ut3Alc3HMNGiiXqKg4DZzXpJzqpkh9gQMlJ4FUaPHYEXlLIeqRu/OiQMPlQ+3nAN8AVNcezlmJVtIqP6sQOGUBraKB/DthUMycvemQtAhdpYo3HfWsa1onIp9R77vuGiPxbUb5aRB7TBOqyASIi60VkF4FrOc65ORH52FPtfk2srhsgInKLiDxfo90uT/kdKO6GvE/7NZ+zo8Q5VzkGpf5FEbnGOfertl+Kh/TzIlKV5Budc99XxbEZUDAlIttDGjjnFkSkMrki4l2gMwOWmQHOC2zzlafc+8PPDFhmjYjcHdjmB0+5GRBI6IP2w55y7y2uGTBI6DZ135e2dzedGTDIJYH1//KUr/EFMAMGCV22PuYp936pmwEjxgwY5Ehgfd8V7pshZsAQoQas9ZQf9wUwAwbZG1j/ck/5gi+AGTDIJ4H1fT+0DvkCmAHLHBeRLwLbXO8pNwMCeMc55/3SHGLaU37QF8CWowtSLUdvds79WBXHZkDBcyHJ7/GQVCd/TkRmfUHMAJF9IvJKjXYPe8r3OOe8s6/rBsyKyAPOuaWQRsClIuJ7m363JlaXDTgoIvc55/6s0XariFQ9yD8lIh/UUhUbdDvJaqPofyV2AufXHE/ejVkxIKEJir77OQQ8nmEs7dmaWKIUHoyi3yXgM4pTs1Y3HMN4bs4tSWGCos91kbSP9/b0ktgmZNQ9/i9olDB+ryhtoThvzscTOfREgUgzIYPOyXtJr4T2v6a6iWIbu48T1NzqPnJoOBMS6pr8F7VLmpiQSE93jioooR2HdUwBrwOnld3/DFwYU8NIocZMiNh3t4+rKQk1IUJ/lwFvYwc2LRNiQoM+bgbeRX82UH/yJ/fIshKtCYExy0P79gYmvaQbh/aVaExQxLBjK5vgM0HRPgbdPLi1hNEdXXwUeDTHGFsPZ5gJinZ1scO7h1nJBEWbUOz4+ipI8wcOp4HdwD10+aR0Lf0zQVG3CvsLk7qUJijq9dO6P/EZ21U859wzivyLFLveDojIfhGZ7b3hbhiGYRiGYRiGYRiGYRjZ+R/JlFem9VzBMwAAAABJRU5ErkJggg=="));
                VideoAdView.this.v = new ImageView(VideoAdView.this.getContext());
                VideoAdView.this.v.setImageBitmap(i.b("iVBORw0KGgoAAAANSUhEUgAAAGAAAABgCAYAAADimHc4AAAABHNCSVQICAgIfAhkiAAAAAlwSFlzAAA3XQAAN10BGYBGXQAAABl0RVh0U29mdHdhcmUAd3d3Lmlua3NjYXBlLm9yZ5vuPBoAAARCSURBVHic7ZtNb1tFFIbfQeqGqEQs+hNgS9oVNK1IQwO0NP3IP2lVqSzTHVI/fkslioB2gUACVsAfaYKUxEnTBQ8Lj8Fxbd9z753riT3nkaxIyZwz77zvtR3PHUuO4ziO4ziO4ziO4ziOMwcAD3JrKBZgGyC3jiIZmO8BZGDYfA9gxoya7wHMkHHmewAzYpL5HsAMmGa+B9AxVeZ7AB1iMd8D6Air+R5AB9Qx3wNITF3zPYCENDHfA0hEU/M9gAS0Md8DaElb8z2AFgAP2ppfJwDgIfBVB+u4AWyn7tspJLjy6wQAPI3D3wC3E67jduwJ8DRV305Jab4lAODJSMkxcDPBOm4NmT/gSdu+nZLa/KoAgMcTyo6BzRbruBl7jONx076d0oX5MDkA4FFF6TFwo8E6Npls/oBH7dxKDInecMcxYb6vjeUHwKc11rEG9Iy9T8eJDTq68gdMmHMDODS2OAQ+M6zjao2e+9QItmriU80U3deBI2ObPWB1Sq9V+qZaOAKuJTF/ngOI2i9jN64HXBnT4wr2l5194HIy8+c9gKj/Ev0r3EIPWBuqrfOavwdcqutvsARQt+ksCSFY1rAq6XtJZw0te5Kuq+/Nd5KWDDX7kq6FEH41jD1BEQFIErAu6VtJ7xqG/x1/vm8Y25O0GUL4yaJjlGICkCTgovrPhPcSTb8n6csQwu9NG7yTSMhcEEL4TdK6/r/C27Arab2N+VJhAUhSCOEPSRvqG9iUXUkbsVcrigtAOhHCToPyHUlXQwh/ptBSZACSFA2sG8LA/L9S6Sg2gMg/8dHV+EqKDQD4WNLPks7VKDsn6ZdYm4QiAwA+kfSjpOUG5cuSfog9WlNcAPT3e16q3WeBZUkvh7ctmlJUAPHT8HPZtheqWJL0PPZsTDEBxI2yZ7JvRVg+rC1JetZkE25AEQEAG5JeyLYZ90rSWnxY/kU9K+lFnCM9xq3YbBj0bwKvje1eAR8N1a7E31l4TYsb/QsZAP2jI1U30AfsACtjeqzEv1k4Bm55AH3dd6hn/vkpvc5TL4Rkh7/mMgBgi7cPTU1iF7hg8OFCHGvhDbBl8XdR34Q/lHTGMK4n6Y5lYy2O2ZJ0aOh7RtIHhnHV1L8mZ8sU3XcrSvfo36Cp68dFqu8x323n+skJTzUV2u9NKJt6DMXgybRjKvea9u0E4JsOfP8Pw/wPR0qOgM8TrOsL3j53tN22byfQ4ek44/z34/ADEp7boX/u6CD2vp+qbyfQ0TOhxvz+BQ1mfDzdGQOJnwm51zOXMOOvKDljSBVC7nXMNSlCyL2GuadtCLn1LwRtQsitfWFoGkJu3QtFkxBya1446oaQW+9CUieE3FoXFmsIuXUuNJYQcmtceKpCyK2vCKaFkFtbMUwKIbeuohgXQm5NxTEaQm49RTIcQm4txTIIIbeOomFeboY7juM4juM4juM4juM4jqR/ATVFjiaHaE5jAAAAAElFTkSuQmCC"));
                VideoAdView.this.v.setVisibility(4);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams2.addRule(15, -1);
                layoutParams2.addRule(14, -1);
                VideoAdView.this.w.setPadding(0, 0, 0, 0);
                VideoAdView.this.q.addView(VideoAdView.this.w, layoutParams2);
                VideoAdView.this.q.addView(VideoAdView.this.v, layoutParams2);
                VideoAdView.this.s();
            }
        });
        addView(this.q, new RelativeLayout.LayoutParams(-2, -2));
        this.q.setOnClickListener(this);
    }

    private void k() {
        this.T = new AtomicBoolean(true);
        this.V = new AtomicBoolean(false);
        this.J = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -0.07f);
        this.J.setDuration(500L);
        this.L = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, -0.07f, 2, 0.0f);
        this.L.setDuration(500L);
        this.K = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, -0.07f);
        this.K.setDuration(500L);
        this.J.setAnimationListener(new a(this.W, this.T, this.r, this.s));
        this.K.setAnimationListener(new a(this.aa, this.S, this.p));
        this.M = new TranslateAnimation(2, 0.0f, 2, -1.0f, 2, 0.0f, 2, 0.0f);
        this.M.setDuration(300L);
        this.M.setInterpolator(new DecelerateInterpolator());
        this.N = new TranslateAnimation(2, -1.0f, 2, 0.0f, 2, 0.0f, 2, 0.0f);
        this.N.setDuration(300L);
        this.N.setInterpolator(new DecelerateInterpolator());
        this.M.setAnimationListener(new a(null, this.V, this.t));
        a aVar = new a(null, this.T, this.o, this.q);
        this.H = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.07f, 2, 0.0f);
        this.H.setDuration(500L);
        this.I = new TranslateAnimation(2, 0.0f, 2, 0.0f, 2, 0.0f, 2, 0.07f);
        this.I.setDuration(500L);
        this.I.setAnimationListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l() {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 17) {
            return generateViewId();
        }
        do {
            i = this.C.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!this.C.compareAndSet(i, i2));
        return i;
    }

    private void m() {
        if (this.e == null || this.f) {
            return;
        }
        this.e.seekTo(this.e.getCurrentPosition());
        this.e.start();
        this.f = true;
        n();
        if (this.A != null) {
            com.youappi.sdk.trackers.b.a().a(this.m.getAdItem(), this.e, this);
            if (this.ah) {
                this.A.onVideoStart(null);
                this.ah = false;
            }
        }
        d(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    private void n() {
        int duration = ((VideoItem) this.m.getAdItem()).getVideoConfig().getDuration();
        this.o.setProgress(duration);
        this.o.setMaxProgress(duration);
        this.o.setVisibility(0);
        this.o.bringToFront();
        this.y.post(this.ak);
    }

    private void o() {
        this.k.set(false);
        if (this.h.get() && this.i.get() && this.G != null) {
            this.i.set(false);
            m();
            b(VideoEvent.EVENT_RESUME);
        }
    }

    private void p() {
        setKeepScreenOn(false);
        if (this.e == null || !this.f) {
            return;
        }
        this.e.stop();
        this.f = false;
        Log.w(f9495a, "Cleaning up MediaPlayer");
        this.e.release();
        this.e = null;
    }

    private void q() {
        if (this.ak != null) {
            removeCallbacks(this.ak);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r() {
        return this.m.getAdType() == AdType.REWARDED_VIDEO && this.m.getAdItem().getPromotedItem().getType() == AdItem.AdvertiserType.AdvertiserBrand;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        if (this.P.booleanValue()) {
            this.e.setVolume(0.0f, 0.0f);
            this.v.setVisibility(0);
            this.w.setVisibility(4);
        } else {
            this.e.setVolume(1.0f, 1.0f);
            this.v.setVisibility(4);
            this.w.setVisibility(0);
        }
    }

    private void t() {
        q();
        if (this.o != null) {
            this.o.setProgress(0);
        }
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        this.T.set(true);
        this.o.setVisibility(0);
        this.q.setVisibility(0);
        this.r.setVisibility(0);
        this.o.startAnimation(this.H);
        this.q.startAnimation(this.H);
        this.r.startAnimation(this.L);
        if (this.s.getVisibility() == 0) {
            this.s.startAnimation(this.L);
        }
        if ((this.R && !this.S.get()) || this.aa.get()) {
            v();
        } else if (!this.S.get() || this.aa.get()) {
            return;
        }
        this.y.removeCallbacks(this.af);
        this.U.set(true);
    }

    private void v() {
        this.S.set(true);
        this.p.setVisibility(0);
        this.p.startAnimation(this.L);
        if (this.T.get()) {
            this.U.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        this.p.startAnimation(this.K);
        if (this.T.get()) {
            return;
        }
        this.U.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        this.W.set(true);
        this.o.startAnimation(this.I);
        this.q.startAnimation(this.I);
        this.r.startAnimation(this.J);
        if (this.s.getVisibility() == 0) {
            this.s.startAnimation(this.J);
            this.V.set(false);
        }
        if (this.R && this.U.get()) {
            w();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y() {
        this.V.set(true);
        this.s.setVisibility(0);
        this.t.setVisibility(0);
        this.t.startAnimation(this.N);
    }

    public void a() {
        this.R = true;
        if (this.S.get()) {
            return;
        }
        this.p.bringToFront();
        this.p.setOnClickListener(this);
        v();
        if (this.T.get() && !this.W.get()) {
            d(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
        }
        g(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
    }

    public void b() {
        if (this.m != null) {
            if (!com.youappi.sdk.utils.d.a(VideoEvent.EVENT_SKIP, this.m.getAdItem()) || ((VideoItem) this.m.getAdItem()).getVideoConfig().getSkipOffset().intValue() == 0) {
                this.R = true;
                this.S.set(true);
                this.p.bringToFront();
                this.p.setOnClickListener(this);
                this.p.setVisibility(0);
                this.U.set(true);
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        return 0;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public VideoAdView getView() {
        return this;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return false;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void loadAd() {
        Uri assetUri;
        this.h.set(false);
        this.i.set(false);
        try {
            if (this.D != null && (assetUri = this.D.getAssetUri(this.g.toString())) != null) {
                this.g = assetUri;
            }
            this.e.setDataSource(getContext(), this.g);
        } catch (IOException e2) {
            a(e2);
            e2.printStackTrace();
        }
        this.e.prepareAsync();
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        String str = f9495a;
        StringBuilder sb = new StringBuilder();
        sb.append("onBufferingUpdate : percent = ");
        sb.append(i);
        sb.append(" _prepared.get() = ");
        sb.append(this.h.get());
        sb.append(" getDuration = ");
        sb.append(this.h.get() ? mediaPlayer.getDuration() / 1000 : -1);
        Log.w(str, sb.toString());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str = "";
        if (view.getId() == this.p.getId()) {
            this.p.setOnClickListener(null);
            if (this.A != null) {
                this.A.onVideoSkipped(null, 0);
                this.A.onVideoEnd(null);
            }
            if (this.B != null) {
                this.B.onAdSkipped(this);
            }
            p();
            str = VideoEvent.EVENT_SKIP;
        } else if (view.getId() == this.q.getId()) {
            this.P = Boolean.valueOf(!this.P.booleanValue());
            this.Q++;
            str = this.P.booleanValue() ? VideoEvent.EVENT_MUTE : VideoEvent.EVENT_UNMUTE;
            s();
        } else if (view.getId() == this.u.getId()) {
            str = "click";
            c(this.m.getAdItem().getPromotedItem().getClickThroughUrl());
            if (this.A != null) {
                this.A.onAdClick(null);
                this.A.onAdLeftApplication(null);
            }
        } else if (view.getId() == this.r.getId()) {
            if (this.V.get()) {
                this.y.removeCallbacksAndMessages(this.ab);
                f(0);
            } else {
                e(0);
                f(1000);
            }
        } else if (view.getId() == this.t.getId()) {
            c(i.a(this.ai));
            this.A.onAdLeftApplication(null);
        }
        if (!this.T.get()) {
            c(0);
        }
        d(GamesStatusCodes.STATUS_ACHIEVEMENT_UNLOCK_FAILURE);
        b(str);
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.j.get()) {
            return;
        }
        b("complete");
        t();
        this.A.onVideoEnd(null);
        if (this.A != null && this.m.getAdItem().getCardConfig() == null && this.m.getAdType() == AdType.REWARDED_VIDEO) {
            ((YARewardedVideoAd.RewardedVideoAdListener) this.A).onRewarded(null);
        }
        if (this.B != null) {
            this.B.onAdClosed(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a(getHeight(), getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.j.set(true);
        t();
        if (this.A != null) {
            this.A.onShowFailure(null, YAErrorCode.PLAYBACK_ERROR, new Exception("Video playback error: " + i + ", extra: " + i2));
        }
        if (this.B != null) {
            this.B.onAdError(this, i, null);
        }
        a(VastError.VAST_ERROR_DISPLAY, "Video playback error: " + i + ", extra: " + i2);
        return true;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onPause() {
        pause();
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        synchronized (this.f9496b) {
            this.h.set(true);
            if (this.i.get()) {
                m();
                this.i.set(false);
                b("start");
                b(VideoEvent.EVENT_IMPRESSION);
            }
        }
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onResume() {
        o();
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onStart() {
        b();
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void onUserInteraction() {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.E = i;
        this.F = i2;
        if (getWidth() == 0 || getHeight() == 0) {
            this.f9498d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.youappi.sdk.ui.views.VideoAdView.8
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (VideoAdView.this.getWidth() <= 0 || VideoAdView.this.getHeight() <= 0) {
                        return;
                    }
                    if ((VideoAdView.this.getWidth() <= VideoAdView.this.getHeight() || VideoAdView.this.getResources().getConfiguration().orientation != 2) && ((VideoAdView.this.getWidth() >= VideoAdView.this.getHeight() || VideoAdView.this.getResources().getConfiguration().orientation != 1) && VideoAdView.this.getResources().getConfiguration().orientation != 0)) {
                        return;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    VideoAdView.this.f9498d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    VideoAdView.this.a(VideoAdView.this.getWidth(), VideoAdView.this.getHeight());
                }
            });
        } else {
            this.f9498d.post(new Runnable() { // from class: com.youappi.sdk.ui.views.VideoAdView.9
                @Override // java.lang.Runnable
                public void run() {
                    VideoAdView.this.a(VideoAdView.this.getWidth(), VideoAdView.this.getHeight());
                }
            });
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        this.k.set(true);
        if (this.e != null && this.f) {
            this.i.set(true);
            b(VideoEvent.EVENT_PAUSE);
            this.e.pause();
            this.f = false;
        }
        q();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setAdItem(VideoViewModel videoViewModel) {
        this.m = videoViewModel;
        if (this.m.getAdItem().getPromotedItem().getType() == AdItem.AdvertiserType.AdvertiserApp || TextUtils.isEmpty(this.m.getAdItem().getPromotedItem().getClickThroughUrl()) || r()) {
            this.u.setVisibility(4);
        } else {
            this.u.setVisibility(0);
        }
        this.g = Uri.parse(videoViewModel.getAdItem().getVideoConfig().getVideoUrl());
        this.P = Boolean.valueOf(videoViewModel.getAdItem().getVideoConfig().isMute());
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setAssetResolver(IAssetResolver iAssetResolver) {
        this.D = iAssetResolver;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setDeviceId(String str) {
        this.ai = str;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setInternalEventListener(IAdEventListener iAdEventListener) {
        this.n = iAdEventListener;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setListener(YAInterstitialVideoAd.InterstitialVideoAdListener interstitialVideoAdListener) {
        this.A = interstitialVideoAdListener;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void setStateListener(BaseAd.AdStateListener adStateListener) {
        this.B = adStateListener;
    }

    @Override // com.youappi.sdk.ui.views.IAdView
    public void show() {
        start();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        synchronized (this.f9496b) {
            if (this.h.get()) {
                m();
                b("start");
                b(VideoEvent.EVENT_IMPRESSION);
            } else {
                this.i.set(true);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        synchronized (this.f9497c) {
            this.G = surfaceHolder;
            if (this.e != null && this.ag) {
                this.e.setDisplay(surfaceHolder);
                if (!this.k.get()) {
                    o();
                }
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        synchronized (this.f9497c) {
            this.G = surfaceHolder;
            this.ag = true;
            if (this.e != null) {
                this.e.setDisplay(surfaceHolder);
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        synchronized (this.f9497c) {
            if (surfaceHolder.equals(this.G)) {
                if (this.e != null && this.e.isPlaying()) {
                    this.e.setDisplay(null);
                }
                this.G = null;
                this.ag = false;
                this.J.cancel();
                this.L.cancel();
                this.I.cancel();
                this.H.cancel();
            }
            pause();
        }
    }
}
