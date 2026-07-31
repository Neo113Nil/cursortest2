package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C1569t5;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;

/* loaded from: classes2.dex */
public class IronSourceBannerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ISBannerSize f17249a;

    /* renamed from: b, reason: collision with root package name */
    private String f17250b;

    /* renamed from: c, reason: collision with root package name */
    private Activity f17251c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17252d;

    /* renamed from: e, reason: collision with root package name */
    private a f17253e;

    public interface a {
        void onWindowFocusChanged(boolean z4);
    }

    @Deprecated
    public IronSourceBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f17252d = false;
        this.f17251c = activity;
        this.f17249a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }

    protected void a() {
        this.f17252d = true;
        this.f17251c = null;
        this.f17249a = null;
        this.f17250b = null;
        this.f17253e = null;
        removeBannerListener();
    }

    protected IronSourceBannerLayout b() {
        IronSourceBannerLayout ironSourceBannerLayout = new IronSourceBannerLayout(getContext(), this.f17249a);
        ironSourceBannerLayout.setPlacementName(this.f17250b);
        return ironSourceBannerLayout;
    }

    @Deprecated
    public Activity getActivity() {
        return this.f17251c;
    }

    public LevelPlayBannerListener getLevelPlayBannerListener() {
        return C1569t5.a().b();
    }

    public String getPlacementName() {
        return this.f17250b;
    }

    public ISBannerSize getSize() {
        return this.f17249a;
    }

    public a getWindowFocusChangedListener() {
        return this.f17253e;
    }

    public boolean isDestroyed() {
        return this.f17252d;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z4) {
        super.onWindowFocusChanged(z4);
        a aVar = this.f17253e;
        if (aVar != null) {
            aVar.onWindowFocusChanged(z4);
        }
    }

    public void removeBannerListener() {
        IronLog.API.info();
        C1569t5.a().a((LevelPlayBannerListener) null);
    }

    public void setBannerSize(ISBannerSize iSBannerSize) {
        this.f17249a = iSBannerSize;
    }

    @Deprecated
    public void setLevelPlayBannerListener(LevelPlayBannerListener levelPlayBannerListener) {
        IronLog.API.info();
        C1569t5.a().a(levelPlayBannerListener);
    }

    public void setPlacementName(String str) {
        this.f17250b = str;
    }

    public void setWindowFocusChangedListener(a aVar) {
        this.f17253e = aVar;
    }

    public IronSourceBannerLayout(Context context) {
        super(context);
        this.f17252d = false;
    }

    public IronSourceBannerLayout(Context context, ISBannerSize iSBannerSize) {
        super(context);
        this.f17252d = false;
        this.f17249a = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
    }
}
