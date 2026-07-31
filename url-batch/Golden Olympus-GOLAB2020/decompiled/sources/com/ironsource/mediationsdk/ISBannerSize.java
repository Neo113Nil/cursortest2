package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* loaded from: classes2.dex */
public class ISBannerSize {

    /* renamed from: a, reason: collision with root package name */
    private final int f17241a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17242b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17243c;
    public ISContainerParams containerParams;

    /* renamed from: d, reason: collision with root package name */
    private boolean f17244d;
    public static final ISBannerSize BANNER = l.a(l.f17627a, 320, 50);
    public static final ISBannerSize LARGE = l.a(l.f17628b, 320, 90);
    public static final ISBannerSize RECTANGLE = l.a(l.f17629c, 300, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);

    /* renamed from: e, reason: collision with root package name */
    protected static final ISBannerSize f17240e = l.a();
    public static final ISBannerSize SMART = l.a(l.f17631e, 0, 0);

    public ISBannerSize(int i4, int i5) {
        this(l.f17632f, i4, i5);
    }

    public static int getMaximalAdaptiveHeight(int i4) {
        return l.b(i4);
    }

    public String getDescription() {
        return this.f17243c;
    }

    public int getHeight() {
        return this.f17242b;
    }

    public int getWidth() {
        return this.f17241a;
    }

    public boolean isAdaptive() {
        return this.f17244d;
    }

    public boolean isSmart() {
        return this.f17243c.equals(l.f17631e);
    }

    public void setAdaptive(boolean z4) {
        this.f17244d = z4;
    }

    public void setContainerParams(ISContainerParams iSContainerParams) {
        if (l.a(iSContainerParams, this.f17241a, this.f17242b)) {
            this.containerParams = iSContainerParams;
        }
    }

    public ISBannerSize(String str, int i4, int i5) {
        this.f17243c = str;
        this.f17241a = i4;
        this.f17242b = i5;
        this.containerParams = new ISContainerParams(i4, i5);
    }
}
