package com.startapp.sdk.ads.banner.banner3d;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.startapp.sdk.ads.banner.BannerBase;
import com.startapp.sdk.ads.banner.BannerInterface;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.banner.BannerMetaData;
import com.startapp.sdk.ads.banner.BannerOptions;
import com.startapp.sdk.ads.banner.BannerSize;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.e0;
import com.startapp.sdk.internal.f1;
import com.startapp.sdk.internal.ff;
import com.startapp.sdk.internal.g1;
import com.startapp.sdk.internal.ka;
import com.startapp.sdk.internal.n8;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.ph;
import com.startapp.sdk.internal.u6;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.x0;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.yf;
import com.startapp.sdk.internal.z0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {
    protected boolean addedDisplayEvent;
    protected x0 ads;
    protected List<AdDetails> adsItems;
    protected boolean animation;
    protected boolean attachedToWindow;
    protected boolean callListener;
    protected Camera camera;
    protected int currentBannerIndex;
    protected boolean defaultLoad;
    protected List<z0> faces;
    protected boolean firstRotation;
    protected boolean firstRotationFinished;
    protected BannerListener listener;
    protected boolean loaded;
    protected boolean loading;
    private Runnable mAutoRotation;
    protected Matrix matrix;
    protected BannerOptions options;
    protected AdInformationOverrides overrides;
    protected Paint paint;
    protected boolean rotating;
    protected float rotation;
    protected boolean rotationEnabled;
    protected float startY;
    protected boolean touchDown;
    protected boolean visible;

    public Banner3D(Activity activity) {
        this((Context) activity);
    }

    private void addAdInformationLayout() {
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(getFaceWidth(), getFaceHeight());
        layoutParams.addRule(13);
        int faceStartLeft = getFaceStartLeft();
        layoutParams.rightMargin = faceStartLeft;
        layoutParams.leftMargin = faceStartLeft;
        int faceStartTop = getFaceStartTop();
        layoutParams.topMargin = faceStartTop;
        layoutParams.bottomMargin = faceStartTop;
        addView(relativeLayout, layoutParams);
        Context context = getContext();
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_S;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        AdInformationOverrides adInformationOverrides = this.overrides;
        x0 x0Var = this.ads;
        String requestUrl = x0Var != null ? x0Var.getRequestUrl() : null;
        x0 x0Var2 = this.ads;
        String dParam = x0Var2 != null ? x0Var2.getDParam() : null;
        x0 x0Var3 = this.ads;
        String erid = x0Var3 != null ? x0Var3.getErid() : null;
        x0 x0Var4 = this.ads;
        new com.startapp.sdk.adsbase.adinformation.a(context, imageResourceType, placement, adInformationOverrides, null, requestUrl, dParam, erid, x0Var4 != null ? x0Var4.getEridUrl() : null).a(relativeLayout);
    }

    private void cleanFaces() {
        List<z0> list = this.faces;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (z0 z0Var : this.faces) {
            if (z0Var != null) {
                Bitmap bitmap = z0Var.c;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                Bitmap bitmap2 = z0Var.d;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                z0Var.c = null;
                z0Var.d = null;
                ff ffVar = z0Var.g;
                if (ffVar != null) {
                    ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
                Banner3DView banner3DView = z0Var.h;
                if (banner3DView != null) {
                    banner3DView.removeAllViews();
                    z0Var.h = null;
                }
            }
        }
    }

    private void createFaces(List<AdDetails> list) {
        cleanFaces();
        removeAllViews();
        this.faces = new ArrayList();
        Iterator<AdDetails> it = list.iterator();
        while (it.hasNext()) {
            this.faces.add(new z0(getContext(), this, it.next(), getBannerOptions(), new TrackingParams(getAdTag())));
        }
        this.currentBannerIndex = 0;
    }

    private void dispatchOnDetatchedFromWindow() {
        List<z0> list = this.faces;
        if (list != null) {
            Iterator<z0> it = list.iterator();
            while (it.hasNext()) {
                ff ffVar = it.next().g;
                if (ffVar != null) {
                    ffVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
    }

    private void drawFace(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, float f, float f2) {
        if (this.camera == null) {
            this.camera = new Camera();
        }
        this.camera.save();
        this.camera.translate(0.0f, 0.0f, i4);
        this.camera.rotateX(f2);
        float f3 = -i4;
        this.camera.translate(0.0f, 0.0f, f3);
        if (this.matrix == null) {
            this.matrix = new Matrix();
        }
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        this.matrix.preTranslate(-i3, f3);
        this.matrix.postScale(f, f);
        this.matrix.postTranslate(i2 + i3, i + i4);
        canvas.drawBitmap(bitmap, this.matrix, this.paint);
    }

    private void drawFrame(Canvas canvas) {
        Throwable th;
        Canvas canvas2;
        Banner3D banner3D;
        Canvas canvas3;
        try {
            int faceWidth = getFaceWidth();
            int faceHeight = getFaceHeight();
            int faceStartLeft = getFaceStartLeft();
            int faceStartTop = getFaceStartTop();
            float g = ((1.0f - this.options.g()) * ((float) Math.pow(Math.abs(this.rotation - 45.0f) / 45.0f, this.options.l()))) + this.options.g();
            if (!this.firstRotationFinished) {
                try {
                    g = this.options.g();
                } catch (Throwable th2) {
                    th = th2;
                    n8.a(th);
                }
            }
            float f = g;
            Bitmap previousBitmap = getPreviousBitmap();
            Bitmap currentBitmap = getCurrentBitmap();
            if (currentBitmap == null || previousBitmap == null) {
                return;
            }
            float f2 = this.rotation;
            try {
                if (f2 >= 45.0f) {
                    if (f2 < 87.0f) {
                        float a2 = this.options.c().a() * f2;
                        canvas2 = canvas;
                        drawFace(canvas2, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, a2);
                    } else {
                        canvas2 = canvas;
                    }
                    drawFace(canvas2, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, (this.rotation - 90.0f) * this.options.c().a());
                    if (this.firstRotation) {
                        return;
                    }
                    this.firstRotationFinished = true;
                    return;
                }
                if (f2 > 3.0f) {
                    float a3 = (f2 - 90.0f) * this.options.c().a();
                    banner3D = this;
                    canvas3 = canvas;
                    banner3D.drawFace(canvas3, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, a3);
                } else {
                    banner3D = this;
                    canvas3 = canvas;
                }
                banner3D.drawFace(canvas3, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f, banner3D.rotation * banner3D.options.c().a());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                n8.a(th);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private Bitmap getCurrentBitmap() {
        return this.faces.get(getCurrentBannerIndex()).d;
    }

    private int getFaceHeight() {
        return (int) (this.options.e() * ph.a(getContext(), this.options.d()));
    }

    private int getFaceStartLeft() {
        return (getWidth() - getFaceWidth()) / 2;
    }

    private int getFaceStartTop() {
        return (getHeight() - getFaceHeight()) / 2;
    }

    private int getFaceWidth() {
        return (int) (this.options.p() * ph.a(getContext(), this.options.o()));
    }

    private Bitmap getPreviousBitmap() {
        return this.faces.get((this.faces.size() + (getCurrentBannerIndex() - 1)) % this.faces.size()).d;
    }

    private int getTotalBaners() {
        return this.faces.size();
    }

    private void initFaces(List<AdDetails> list) {
        if (shouldCreateFaces()) {
            createFaces(list);
        } else {
            initFacesViews();
        }
    }

    private void initFacesViews() {
        Iterator<z0> it = this.faces.iterator();
        while (it.hasNext()) {
            it.next().a(getContext(), getBannerOptions(), this);
        }
    }

    private boolean isEventInsideBanner(MotionEvent motionEvent) {
        int faceWidth = getFaceWidth();
        int faceHeight = getFaceHeight();
        int faceStartLeft = getFaceStartLeft();
        int faceStartTop = getFaceStartTop();
        return motionEvent.getX() >= ((float) faceStartLeft) && motionEvent.getY() >= ((float) faceStartTop) && motionEvent.getX() <= ((float) (faceStartLeft + faceWidth)) && motionEvent.getY() <= ((float) (faceStartTop + faceHeight));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeImpression(z0 z0Var) {
        ff ffVar;
        Context context = getContext();
        if (z0Var.f516a.t().length <= 0 || !z0Var.e.compareAndSet(false, true)) {
            ffVar = null;
        } else {
            ffVar = new ff(context, AdPreferences.Placement.INAPP_BANNER, z0Var.f516a.t(), z0Var.f, z0Var.f516a.i() != null ? TimeUnit.SECONDS.toMillis(z0Var.f516a.i().longValue()) : TimeUnit.SECONDS.toMillis(MetaData.A().w()), false, null);
            z0Var.g = ffVar;
        }
        if (ffVar != null) {
            startVisibilityRunnable(ffVar);
        }
    }

    private void nextBanner() {
        this.currentBannerIndex = (this.currentBannerIndex + 1) % getTotalBaners();
    }

    private void prevBanner() {
        this.currentBannerIndex = ((this.currentBannerIndex - 1) + getTotalBaners()) % getTotalBaners();
    }

    private boolean shouldCreateFaces() {
        List<z0> list = this.faces;
        return list == null || list.size() == 0;
    }

    private void showBannerView() {
        setVisibility(0);
        if (this.ads != null) {
            yf yfVar = (yf) this.showIntentionsKeeper.a();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.ads.getAdId();
            if (adId != null) {
                yfVar.f511a.put(new xf(placement), adId);
            }
        }
    }

    private void startRotation() {
        if (this.attachedToWindow && this.drawn) {
            removeCallbacks(this.mAutoRotation);
            post(this.mAutoRotation);
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected String getBannerName() {
        return "StartApp Banner3D";
    }

    protected BannerOptions getBannerOptions() {
        return this.options;
    }

    public String getBidToken() {
        x0 x0Var = this.ads;
        if (x0Var == null || x0Var.f302a.isEmpty()) {
            return null;
        }
        return ((AdDetails) x0Var.f302a.get(0)).e();
    }

    protected int getCurrentBannerIndex() {
        return this.currentBannerIndex;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getHeightInDp() {
        return 50;
    }

    protected int getNextBannerIndex() {
        return (this.currentBannerIndex + 1) % getTotalBaners();
    }

    protected int getOffset() {
        x0 x0Var = this.ads;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.b;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getRefreshRate() {
        return BannerMetaData.c().a().j();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected int getWidthInDp() {
        return 300;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.visible = false;
        setVisibility(8);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void initRuntime() {
        if (this.loading) {
            return;
        }
        this.options = BannerMetaData.c().b();
        this.adsItems = new ArrayList();
        this.overrides = AdInformationOverrides.a();
        cleanFaces();
        this.faces = new ArrayList();
        this.loading = true;
        setBackgroundColor(0);
    }

    protected void loadBanners(List<AdDetails> list, boolean z) {
        x0 x0Var;
        this.adsItems = list;
        if (list == null) {
            setErrorMessage("No ads to load");
            if (z) {
                g1.a(getContext(), this.listener, this, null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<AdDetails> it = list.iterator();
        while (it.hasNext()) {
            sb.append(e0.a(it.next().h(), (String) null));
            sb.append(StringUtils.COMMA);
        }
        BannerSize[] bannerSizeArr = {BannerSize.ZERO};
        if (!Banner3DSize.setOptimiseSize(getContext(), getParent(), getBannerOptions(), this, bannerSizeArr)) {
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z) {
                g1.a(getContext(), this.listener, this, sb.toString());
                return;
            }
            return;
        }
        setMinimumWidth(ph.a(getContext(), this.options.o()));
        setMinimumHeight(ph.a(getContext(), this.options.d()));
        if (getLayoutParams() != null && getLayoutParams().width == -1) {
            setMinimumWidth(ph.a(getContext(), bannerSizeArr[0].getWidth()));
        }
        if (getLayoutParams() != null && getLayoutParams().height == -1) {
            setMinimumHeight(ph.a(getContext(), bannerSizeArr[0].getHeight()));
        }
        if (getLayoutParams() != null) {
            if (getLayoutParams().width > 0) {
                setMinimumWidth(getLayoutParams().width);
            }
            if (getLayoutParams().height > 0) {
                setMinimumHeight(getLayoutParams().height);
            }
            if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (x0Var = this.ads) != null) {
                x0Var.c = true;
            }
        }
        initFaces(list);
        addAdInformationLayout();
        if (this.paint == null) {
            Paint paint = new Paint();
            this.paint = paint;
            paint.setAntiAlias(true);
            this.paint.setFilterBitmap(true);
        }
        if (!this.animation) {
            this.animation = true;
            startRotation();
        }
        if (this.visible) {
            showBannerView();
        }
        if (z) {
            g1.b(getContext(), this.listener, this, sb.toString());
        }
        onAdLoadedToView();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attachedToWindow = true;
        if (this.defaultLoad && !this.loaded) {
            loadBanner(null);
        }
        BannerOptions bannerOptions = this.options;
        if (bannerOptions == null || !bannerOptions.v()) {
            this.firstRotation = false;
            this.firstRotationFinished = true;
        }
        startRotation();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        removeCallbacks(this.mAutoRotation);
        dispatchOnDetatchedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.drawn && !this.loading) {
            this.drawn = true;
            startRotation();
        }
        if (isInEditMode() || !this.visible || shouldCreateFaces()) {
            return;
        }
        drawFrame(canvas);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onFailedToReceiveAd(Ad ad) {
        if (ad != null) {
            setErrorMessage(ad.getErrorMessage());
        }
        g1.a(getContext(), this.listener, this, null);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        this.loaded = true;
        this.loading = false;
        this.overrides = this.ads.getAdInfoOverride();
        List<AdDetails> list = ((ka) ad).f302a;
        this.adsItems = list;
        loadBanners(list, this.callListener);
        this.callListener = false;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof w0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w0 w0Var = (w0) parcelable;
        super.onRestoreInstanceState(w0Var.getSuperState());
        boolean z = w0Var.l;
        this.visible = z;
        if (z) {
            this.adsItems = Arrays.asList(w0Var.f475a);
            this.rotation = w0Var.b;
            this.firstRotation = w0Var.c == 1;
            this.firstRotationFinished = w0Var.d == 1;
            this.currentBannerIndex = w0Var.e;
            z0[] z0VarArr = w0Var.m;
            cleanFaces();
            this.faces = new ArrayList();
            if (z0VarArr != null) {
                for (z0 z0Var : z0VarArr) {
                    this.faces.add(z0Var);
                }
            }
            this.loaded = w0Var.f;
            this.loading = w0Var.g;
            this.defaultLoad = w0Var.h;
            this.overrides = w0Var.i;
            this.options = w0Var.j;
            if (this.adsItems.size() != 0) {
                post(new c(this));
            } else {
                this.defaultLoad = true;
                init();
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    protected Parcelable onSaveInstanceState() {
        w0 w0Var = new w0(super.onSaveInstanceState());
        w0Var.l = this.visible;
        List<AdDetails> list = this.adsItems;
        w0Var.f475a = new AdDetails[list.size()];
        for (int i = 0; i < list.size(); i++) {
            w0Var.f475a[i] = list.get(i);
        }
        w0Var.b = this.rotation;
        w0Var.c = this.firstRotation ? 1 : 0;
        w0Var.d = this.firstRotationFinished ? 1 : 0;
        w0Var.e = this.currentBannerIndex;
        w0Var.j = this.options;
        w0Var.m = new z0[this.faces.size()];
        w0Var.f = this.loaded;
        w0Var.g = this.loading;
        w0Var.i = this.overrides;
        for (int i2 = 0; i2 < this.faces.size(); i2++) {
            w0Var.m[i2] = this.faces.get(i2);
        }
        return w0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Runnable] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        List<z0> list;
        String str;
        if (!isEventInsideBanner(motionEvent) || (list = this.faces) == null || list.size() == 0) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.touchDown = true;
            this.startY = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2 && this.startY - motionEvent.getY() >= 10.0f) {
                this.touchDown = false;
                this.startY = motionEvent.getY();
            }
        } else if (this.touchDown) {
            if (this.rotation < 45.0f) {
                prevBanner();
            }
            this.touchDown = false;
            this.rotationEnabled = false;
            setClicked(true);
            postDelayed(new b(this), AdsCommonMetaData.k().y());
            z0 z0Var = this.faces.get(getCurrentBannerIndex());
            Context context = getContext();
            String p = z0Var.f516a.p();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean a2 = e0.a(context);
            ff ffVar = z0Var.g;
            if (ffVar != null) {
                ffVar.a(null, null);
            }
            if (p != null && !AbstractJsonLexerKt.NULL.equals(p) && !TextUtils.isEmpty(p)) {
                e0.a(p, z0Var.f516a.o(), z0Var.f516a.h(), context, z0Var.f);
                str = null;
            } else if (!z0Var.f516a.D() || a2) {
                str = null;
                e0.a(context, z0Var.f516a.h(), z0Var.f516a.y(), z0Var.f, z0Var.f516a.E() && !a2, false);
            } else {
                e0.a(context, z0Var.f516a.h(), z0Var.f516a.y(), z0Var.f516a.s(), z0Var.f, AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), z0Var.f516a.E(), z0Var.f516a.F(), false, null);
                str = null;
            }
            String a3 = getCurrentBannerIndex() < this.adsItems.size() ? e0.a(this.adsItems.get(getCurrentBannerIndex()).h(), str) : str;
            Context context2 = getContext();
            BannerListener bannerListener = this.listener;
            u6.a("onClicked", bannerListener != null, a3, str);
            e0.a((Runnable) (bannerListener == null ? str : new f1(context2, bannerListener, this)));
        }
        return true;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            this.attachedToWindow = false;
            if (this.rotating) {
                return;
            }
            removeCallbacks(this.mAutoRotation);
            return;
        }
        this.attachedToWindow = true;
        BannerOptions bannerOptions = this.options;
        if (bannerOptions == null || !bannerOptions.v()) {
            this.firstRotation = false;
            this.firstRotationFinished = true;
        }
        startRotation();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    protected void reload(String str) {
        this.loaded = false;
        this.loading = true;
        this.animation = false;
        this.rotationEnabled = true;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.drawn = false;
        this.adRulesResult = null;
        cleanFaces();
        this.faces = new ArrayList();
        x0 x0Var = new x0(getContext(), this.eventTracer, this.consentManager, this.adCacheManager, this.videoDownloader, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
        this.ads = x0Var;
        x0Var.load(prepareAdPreferences(), this);
    }

    protected void rotate(float f) {
        float f2 = this.rotation + f;
        this.rotation = f2;
        if (f2 >= 90.0f) {
            nextBanner();
            this.rotation -= 90.0f;
        }
        if (this.rotation <= 0.0f) {
            prevBanner();
            this.rotation += 90.0f;
        }
        invalidate();
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void setBannerListener(BannerListener bannerListener) {
        this.listener = bannerListener;
    }

    @Override // com.startapp.sdk.ads.banner.BannerInterface
    public void showBanner() {
        this.visible = true;
        showBannerView();
    }

    public Banner3D(Activity activity, AdPreferences adPreferences) {
        this((Context) activity, adPreferences);
    }

    public Banner3D(Activity activity, BannerListener bannerListener) {
        this((Context) activity, bannerListener);
    }

    public Banner3D(Activity activity, AdPreferences adPreferences, BannerListener bannerListener) {
        this((Context) activity, adPreferences, bannerListener);
    }

    public Banner3D(Activity activity, boolean z) {
        this((Context) activity, z);
    }

    public Banner3D(Activity activity, boolean z, AdPreferences adPreferences) {
        this((Context) activity, z, adPreferences);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet) {
        this((Context) activity, attributeSet);
    }

    public Banner3D(Activity activity, AttributeSet attributeSet, int i) {
        this((Context) activity, attributeSet, i);
    }

    @Deprecated
    public Banner3D(Context context) {
        this(context, true, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences) {
        this(context, true, adPreferences);
    }

    @Deprecated
    public Banner3D(Context context, BannerListener bannerListener) {
        this(context, true, (AdPreferences) null);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, AdPreferences adPreferences, BannerListener bannerListener) {
        this(context, true, adPreferences);
        setBannerListener(bannerListener);
    }

    @Deprecated
    public Banner3D(Context context, boolean z) {
        this(context, z, (AdPreferences) null);
    }

    @Deprecated
    public Banner3D(Context context, boolean z, AdPreferences adPreferences) {
        this(context, (AttributeSet) null, 0);
        try {
            this.defaultLoad = z;
            setAdPreferences(adPreferences);
            init();
        } catch (Throwable th) {
            n8.a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).i, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).S, com.startapp.sdk.components.a.a(context).f160a, com.startapp.sdk.components.a.a(context).m, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).w, com.startapp.sdk.components.a.a(context).b, com.startapp.sdk.components.a.a(context).u, com.startapp.sdk.components.a.a(context).k);
    }

    public Banner3D(Context context, AttributeSet attributeSet, int i, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9, pa paVar10, pa paVar11) {
        super(context, attributeSet, i, paVar, paVar2, paVar3, paVar4, paVar5, paVar6, paVar7, paVar8, paVar9, paVar10, paVar11);
        this.camera = null;
        this.matrix = null;
        this.paint = null;
        this.rotation = 45.0f;
        this.startY = 0.0f;
        this.rotationEnabled = true;
        this.rotating = false;
        this.firstRotation = true;
        this.firstRotationFinished = false;
        this.addedDisplayEvent = false;
        this.touchDown = false;
        this.animation = false;
        this.visible = true;
        this.defaultLoad = true;
        this.loaded = false;
        this.loading = false;
        this.attachedToWindow = false;
        this.callListener = true;
        this.faces = new ArrayList();
        this.currentBannerIndex = 0;
        this.mAutoRotation = new a(this);
        try {
            init();
        } catch (Throwable th) {
            n8.a(th);
        }
    }
}
