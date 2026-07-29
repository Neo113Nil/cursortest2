package com.facebook.ads;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.q.a.v;
import com.google.android.gms.common.util.CrashUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4812a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeAdsManager f4813b;

    /* renamed from: c, reason: collision with root package name */
    private final AdViewProvider f4814c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAdView.Type f4815d;
    private final int e;
    private final b f;
    private final NativeAdViewAttributes g;

    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i);

        void destroyView(NativeAd nativeAd, View view);
    }

    private class a extends PagerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private List<NativeAd> f4817b = new ArrayList();

        public a() {
        }

        public void a() {
            this.f4817b.clear();
            int min = Math.min(NativeAdScrollView.this.e, NativeAdScrollView.this.f4813b.getUniqueNativeAdCount());
            for (int i = 0; i < min; i++) {
                NativeAd nextNativeAd = NativeAdScrollView.this.f4813b.nextNativeAd();
                nextNativeAd.a(true);
                this.f4817b.add(nextNativeAd);
            }
            notifyDataSetChanged();
        }

        @Override // android.support.v4.view.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            if (i < this.f4817b.size()) {
                if (NativeAdScrollView.this.f4815d != null) {
                    this.f4817b.get(i).unregisterView();
                } else {
                    NativeAdScrollView.this.f4814c.destroyView(this.f4817b.get(i), (View) obj);
                }
            }
            viewGroup.removeView((View) obj);
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getCount() {
            return this.f4817b.size();
        }

        @Override // android.support.v4.view.PagerAdapter
        public int getItemPosition(Object obj) {
            int indexOf = this.f4817b.indexOf(obj);
            if (indexOf >= 0) {
                return indexOf;
            }
            return -2;
        }

        @Override // android.support.v4.view.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            View render = NativeAdScrollView.this.f4815d != null ? NativeAdView.render(NativeAdScrollView.this.f4812a, this.f4817b.get(i), NativeAdScrollView.this.f4815d, NativeAdScrollView.this.g) : NativeAdScrollView.this.f4814c.createView(this.f4817b.get(i), i);
            viewGroup.addView(render);
            return render;
        }

        @Override // android.support.v4.view.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    private class b extends ViewPager {
        public b(Context context) {
            super(context);
        }

        @Override // android.support.v4.view.ViewPager, android.view.View
        protected void onMeasure(int i, int i2) {
            int i3 = 0;
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(0, 0));
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > i3) {
                    i3 = measuredHeight;
                }
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, CrashUtils.ErrorDialogData.SUPPRESSED));
        }
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i) {
        this(context, nativeAdsManager, adViewProvider, null, null, i);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i) {
        super(context);
        if (!nativeAdsManager.isLoaded()) {
            throw new IllegalStateException("NativeAdsManager not loaded");
        }
        if (type == null && adViewProvider == null) {
            throw new IllegalArgumentException("Must provide a NativeAdView.Type or AdViewProvider");
        }
        this.f4812a = context;
        this.f4813b = nativeAdsManager;
        this.g = nativeAdViewAttributes;
        this.f4814c = adViewProvider;
        this.f4815d = type;
        this.e = i;
        a aVar = new a();
        this.f = new b(context);
        this.f.setAdapter(aVar);
        setInset(20);
        aVar.a();
        addView(this.f);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type) {
        this(context, nativeAdsManager, null, type, new NativeAdViewAttributes(), 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, type, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i) {
        this(context, nativeAdsManager, null, type, nativeAdViewAttributes, i);
    }

    public void setInset(int i) {
        if (i > 0) {
            float f = v.f5438b;
            int round = Math.round(i * f);
            this.f.setPadding(round, 0, round, 0);
            this.f.setPageMargin(Math.round((i / 2) * f));
            this.f.setClipToPadding(false);
        }
    }
}
