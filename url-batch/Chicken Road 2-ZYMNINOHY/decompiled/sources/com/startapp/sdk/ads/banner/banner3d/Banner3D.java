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
import android.view.View;
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
import com.startapp.sdk.internal.a1;
import com.startapp.sdk.internal.c1;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.db;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.og;
import com.startapp.sdk.internal.pg;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.z0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class Banner3D extends BannerBase implements AdEventListener, BannerInterface {
    protected boolean addedDisplayEvent;
    protected a1 ads;
    protected List<AdDetails> adsItems;
    protected boolean animation;
    protected boolean attachedToWindow;
    protected boolean callListener;
    protected Camera camera;
    protected int currentBannerIndex;
    protected boolean defaultLoad;
    protected List<c1> faces;
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
        a1 a1Var = this.ads;
        String requestUrl = a1Var != null ? a1Var.getRequestUrl() : null;
        a1 a1Var2 = this.ads;
        String dParam = a1Var2 != null ? a1Var2.getDParam() : null;
        a1 a1Var3 = this.ads;
        String erid = a1Var3 != null ? a1Var3.getErid() : null;
        a1 a1Var4 = this.ads;
        new com.startapp.sdk.adsbase.adinformation.a(context, imageResourceType, placement, adInformationOverrides, null, requestUrl, dParam, erid, a1Var4 != null ? a1Var4.getEridUrl() : null).a(relativeLayout);
    }

    private void cleanFaces() {
        List<c1> list = this.faces;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (c1 c1Var : this.faces) {
            if (c1Var != null) {
                Bitmap bitmap = c1Var.f6729c;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                Bitmap bitmap2 = c1Var.f6730d;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                }
                c1Var.f6729c = null;
                c1Var.f6730d = null;
                xf xfVar = c1Var.f6733g;
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
                Banner3DView banner3DView = c1Var.f6734h;
                if (banner3DView != null) {
                    banner3DView.removeAllViews();
                    c1Var.f6734h = null;
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
            this.faces.add(new c1(getContext(), this, it.next(), getBannerOptions(), new TrackingParams(getAdTag())));
        }
        this.currentBannerIndex = 0;
    }

    private void dispatchOnDetatchedFromWindow() {
        List<c1> list = this.faces;
        if (list != null) {
            Iterator<c1> it = list.iterator();
            while (it.hasNext()) {
                xf xfVar = it.next().f6733g;
                if (xfVar != null) {
                    xfVar.a("AD_CLOSED_TOO_QUICKLY", null);
                }
            }
        }
    }

    private void drawFace(Canvas canvas, Bitmap bitmap, int i4, int i5, int i6, int i7, float f4, float f5) {
        if (this.camera == null) {
            this.camera = new Camera();
        }
        this.camera.save();
        this.camera.translate(0.0f, 0.0f, i7);
        this.camera.rotateX(f5);
        float f6 = -i7;
        this.camera.translate(0.0f, 0.0f, f6);
        if (this.matrix == null) {
            this.matrix = new Matrix();
        }
        this.camera.getMatrix(this.matrix);
        this.camera.restore();
        this.matrix.preTranslate(-i6, f6);
        this.matrix.postScale(f4, f4);
        this.matrix.postTranslate(i5 + i6, i4 + i7);
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
            float g4 = ((1.0f - this.options.g()) * ((float) Math.pow(Math.abs(this.rotation - 45.0f) / 45.0f, this.options.l()))) + this.options.g();
            if (!this.firstRotationFinished) {
                try {
                    g4 = this.options.g();
                } catch (Throwable th2) {
                    th = th2;
                    d9.a(th);
                }
            }
            float f4 = g4;
            Bitmap previousBitmap = getPreviousBitmap();
            Bitmap currentBitmap = getCurrentBitmap();
            if (currentBitmap == null || previousBitmap == null) {
                return;
            }
            float f5 = this.rotation;
            try {
                if (f5 >= 45.0f) {
                    if (f5 < 87.0f) {
                        float a3 = this.options.c().a() * f5;
                        canvas2 = canvas;
                        drawFace(canvas2, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f4, a3);
                    } else {
                        canvas2 = canvas;
                    }
                    drawFace(canvas2, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f4, (this.rotation - 90.0f) * this.options.c().a());
                    if (this.firstRotation) {
                        return;
                    }
                    this.firstRotationFinished = true;
                    return;
                }
                if (f5 > 3.0f) {
                    float a4 = (f5 - 90.0f) * this.options.c().a();
                    banner3D = this;
                    canvas3 = canvas;
                    banner3D.drawFace(canvas3, currentBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f4, a4);
                } else {
                    banner3D = this;
                    canvas3 = canvas;
                }
                banner3D.drawFace(canvas3, previousBitmap, faceStartTop, faceStartLeft, faceWidth / 2, faceHeight / 2, f4, banner3D.rotation * banner3D.options.c().a());
            } catch (Throwable th3) {
                th = th3;
                th = th;
                d9.a(th);
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private Bitmap getCurrentBitmap() {
        return this.faces.get(getCurrentBannerIndex()).f6730d;
    }

    private int getFaceHeight() {
        return (int) (this.options.e() * ii.a(getContext(), this.options.d()));
    }

    private int getFaceStartLeft() {
        return (getWidth() - getFaceWidth()) / 2;
    }

    private int getFaceStartTop() {
        return (getHeight() - getFaceHeight()) / 2;
    }

    private int getFaceWidth() {
        return (int) (this.options.p() * ii.a(getContext(), this.options.o()));
    }

    private Bitmap getPreviousBitmap() {
        return this.faces.get((this.faces.size() + (getCurrentBannerIndex() - 1)) % this.faces.size()).f6730d;
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
        Iterator<c1> it = this.faces.iterator();
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
    public void makeImpression(c1 c1Var) {
        xf xfVar;
        Context context = getContext();
        if (c1Var.f6727a.t().length <= 0 || !c1Var.f6731e.compareAndSet(false, true)) {
            xfVar = null;
        } else {
            xfVar = new xf(context, AdPreferences.Placement.INAPP_BANNER, c1Var.f6727a.t(), c1Var.f6732f, c1Var.f6727a.i() != null ? TimeUnit.SECONDS.toMillis(c1Var.f6727a.i().longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z()), false, null);
            c1Var.f6733g = xfVar;
        }
        if (xfVar != null) {
            startVisibilityRunnable(xfVar);
        }
    }

    private void nextBanner() {
        this.currentBannerIndex = (this.currentBannerIndex + 1) % getTotalBaners();
    }

    private void prevBanner() {
        this.currentBannerIndex = ((this.currentBannerIndex - 1) + getTotalBaners()) % getTotalBaners();
    }

    private boolean shouldCreateFaces() {
        List<c1> list = this.faces;
        return list == null || list.size() == 0;
    }

    private void showBannerView() {
        setVisibility(0);
        if (this.ads != null) {
            pg pgVar = (pg) this.showIntentionsKeeper.a();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
            String adId = this.ads.getAdId();
            if (adId != null) {
                pgVar.f7459a.put(new og(placement), adId);
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
    public String getBannerName() {
        return "StartApp Banner3D";
    }

    public BannerOptions getBannerOptions() {
        return this.options;
    }

    public String getBidToken() {
        a1 a1Var = this.ads;
        if (a1Var == null || a1Var.f6800a.isEmpty()) {
            return null;
        }
        return ((AdDetails) a1Var.f6800a.get(0)).e();
    }

    public int getCurrentBannerIndex() {
        return this.currentBannerIndex;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getHeightInDp() {
        return 50;
    }

    public int getNextBannerIndex() {
        return (this.currentBannerIndex + 1) % getTotalBaners();
    }

    public int getOffset() {
        a1 a1Var = this.ads;
        if (a1Var == null) {
            return 0;
        }
        return a1Var.f6636b;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getRefreshRate() {
        return BannerMetaData.c().a().j();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public int getWidthInDp() {
        return 300;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, com.startapp.sdk.ads.banner.BannerInterface
    public void hideBanner() {
        this.visible = false;
        setVisibility(8);
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase
    public void initRuntime() {
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

    public void loadBanners(List<AdDetails> list, boolean z) {
        a1 a1Var;
        this.adsItems = list;
        if (list == null) {
            setErrorMessage("No ads to load");
            if (z) {
                j1.a(getContext(), this.listener, (BannerBase) this, (String) null);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<AdDetails> it = list.iterator();
        while (it.hasNext()) {
            sb.append(g0.a(it.next().h(), (String) null));
            sb.append(StringUtils.COMMA);
        }
        BannerSize[] bannerSizeArr = {BannerSize.ZERO};
        if (!Banner3DSize.setOptimiseSize(getContext(), getParent(), getBannerOptions(), this, bannerSizeArr)) {
            setErrorMessage("Error in banner screen size");
            setVisibility(8);
            if (z) {
                j1.a(getContext(), this.listener, (BannerBase) this, sb.toString());
                return;
            }
            return;
        }
        setMinimumWidth(ii.a(getContext(), this.options.o()));
        setMinimumHeight(ii.a(getContext(), this.options.d()));
        if (getLayoutParams() != null && getLayoutParams().width == -1) {
            setMinimumWidth(ii.a(getContext(), bannerSizeArr[0].getWidth()));
        }
        if (getLayoutParams() != null && getLayoutParams().height == -1) {
            setMinimumHeight(ii.a(getContext(), bannerSizeArr[0].getHeight()));
        }
        if (getLayoutParams() != null) {
            if (getLayoutParams().width > 0) {
                setMinimumWidth(getLayoutParams().width);
            }
            if (getLayoutParams().height > 0) {
                setMinimumHeight(getLayoutParams().height);
            }
            if (getLayoutParams().width > 0 && getLayoutParams().height > 0 && (a1Var = this.ads) != null) {
                a1Var.f6637c = true;
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
            j1.b(getContext(), this.listener, this, sb.toString());
        }
        onAdLoadedToView();
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
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
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attachedToWindow = false;
        removeCallbacks(this.mAutoRotation);
        dispatchOnDetatchedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
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
        j1.a(getContext(), this.listener, (BannerBase) this, (String) null);
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public void onReceiveAd(Ad ad) {
        this.loaded = true;
        this.loading = false;
        this.overrides = this.ads.getAdInfoOverride();
        List<AdDetails> list = ((db) ad).f6800a;
        this.adsItems = list;
        loadBanners(list, this.callListener);
        this.callListener = false;
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof z0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        z0 z0Var = (z0) parcelable;
        super.onRestoreInstanceState(z0Var.getSuperState());
        boolean z = z0Var.f7997l;
        this.visible = z;
        if (z) {
            this.adsItems = Arrays.asList(z0Var.f7986a);
            this.rotation = z0Var.f7987b;
            this.firstRotation = z0Var.f7988c == 1;
            this.firstRotationFinished = z0Var.f7989d == 1;
            this.currentBannerIndex = z0Var.f7990e;
            c1[] c1VarArr = z0Var.f7998m;
            cleanFaces();
            this.faces = new ArrayList();
            if (c1VarArr != null) {
                for (c1 c1Var : c1VarArr) {
                    this.faces.add(c1Var);
                }
            }
            this.loaded = z0Var.f7991f;
            this.loading = z0Var.f7992g;
            this.defaultLoad = z0Var.f7993h;
            this.overrides = z0Var.f7994i;
            this.options = z0Var.f7995j;
            if (this.adsItems.size() != 0) {
                post(new c(this));
            } else {
                this.defaultLoad = true;
                init();
            }
        }
    }

    @Override // com.startapp.sdk.ads.banner.BannerBase, android.view.View
    public Parcelable onSaveInstanceState() {
        z0 z0Var = new z0(super.onSaveInstanceState());
        z0Var.f7997l = this.visible;
        List<AdDetails> list = this.adsItems;
        z0Var.f7986a = new AdDetails[list.size()];
        for (int i4 = 0; i4 < list.size(); i4++) {
            z0Var.f7986a[i4] = list.get(i4);
        }
        z0Var.f7987b = this.rotation;
        z0Var.f7988c = this.firstRotation ? 1 : 0;
        z0Var.f7989d = this.firstRotationFinished ? 1 : 0;
        z0Var.f7990e = this.currentBannerIndex;
        z0Var.f7995j = this.options;
        z0Var.f7998m = new c1[this.faces.size()];
        z0Var.f7991f = this.loaded;
        z0Var.f7992g = this.loading;
        z0Var.f7994i = this.overrides;
        for (int i5 = 0; i5 < this.faces.size(); i5++) {
            z0Var.f7998m[i5] = this.faces.get(i5);
        }
        return z0Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        List<c1> list;
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
            c1 c1Var = this.faces.get(getCurrentBannerIndex());
            Context context = getContext();
            String p2 = c1Var.f6727a.p();
            AdPreferences.Placement placement = AdPreferences.Placement.INAPP_FULL_SCREEN;
            boolean a3 = g0.a(context);
            xf xfVar = c1Var.f6733g;
            if (xfVar != null) {
                xfVar.a(null, null);
            }
            if (p2 != null && !"null".equals(p2) && !TextUtils.isEmpty(p2)) {
                g0.a(p2, c1Var.f6727a.o(), c1Var.f6727a.h(), context, c1Var.f6732f);
                str = null;
            } else if (!c1Var.f6727a.D() || a3) {
                str = null;
                g0.a(context, c1Var.f6727a.h(), c1Var.f6727a.y(), c1Var.f6732f, c1Var.f6727a.E() && !a3, false);
            } else {
                g0.a(context, c1Var.f6727a.h(), c1Var.f6727a.y(), c1Var.f6727a.s(), c1Var.f6732f, AdsCommonMetaData.k().y(), AdsCommonMetaData.k().x(), c1Var.f6727a.E(), c1Var.f6727a.F(), false, null);
                str = null;
            }
            j1.a(getContext(), this.listener, (View) this, getCurrentBannerIndex() < this.adsItems.size() ? g0.a(this.adsItems.get(getCurrentBannerIndex()).h(), str) : str);
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
    public void reload(String str) {
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
        a1 a1Var = new a1(getContext(), this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, getOffset());
        this.ads = a1Var;
        a1Var.load(prepareAdPreferences(), this);
    }

    public void rotate(float f4) {
        float f5 = this.rotation + f4;
        this.rotation = f5;
        if (f5 >= 90.0f) {
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

    public Banner3D(Activity activity, AttributeSet attributeSet, int i4) {
        this((Context) activity, attributeSet, i4);
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
            d9.a(th);
        }
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Deprecated
    public Banner3D(Context context, AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, com.startapp.sdk.components.a.a(context).f6551K, com.startapp.sdk.components.a.a(context).f6569j, com.startapp.sdk.components.a.a(context).f6552M, com.startapp.sdk.components.a.a(context).f6553N, com.startapp.sdk.components.a.a(context).f6561b, com.startapp.sdk.components.a.a(context).n, com.startapp.sdk.components.a.a(context).f6541A, com.startapp.sdk.components.a.a(context).f6579w, com.startapp.sdk.components.a.a(context).f6562c, com.startapp.sdk.components.a.a(context).f6578u, com.startapp.sdk.components.a.a(context).f6571l);
    }

    public Banner3D(Context context, AttributeSet attributeSet, int i4, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10, ib ibVar11) {
        super(context, attributeSet, i4, ibVar, ibVar2, ibVar3, ibVar4, ibVar5, ibVar6, ibVar7, ibVar8, ibVar9, ibVar10, ibVar11);
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
            d9.a(th);
        }
    }
}
