package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.adapters.ab;
import com.facebook.ads.internal.n.d;
import com.facebook.ads.internal.n.e;
import com.facebook.ads.internal.n.f;
import com.facebook.ads.internal.n.g;
import com.facebook.ads.internal.protocol.a;
import com.facebook.ads.internal.q.a.i;
import com.facebook.ads.internal.view.hscroll.b;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class NativeAd implements Ad {

    /* renamed from: a, reason: collision with root package name */
    private final e f4803a;

    public static class Image {

        /* renamed from: a, reason: collision with root package name */
        private final f f4806a;

        Image(f fVar) {
            this.f4806a = fVar;
        }

        public Image(String str, int i, int i2) {
            this.f4806a = new f(str, i, i2);
        }

        public static Image fromJSONObject(JSONObject jSONObject) {
            f a2 = f.a(jSONObject);
            if (a2 == null) {
                return null;
            }
            return new Image(a2);
        }

        public int getHeight() {
            return this.f4806a.c();
        }

        public String getUrl() {
            return this.f4806a.a();
        }

        public int getWidth() {
            return this.f4806a.b();
        }
    }

    public enum MediaCacheFlag {
        NONE(d.NONE),
        ICON(d.ICON),
        IMAGE(d.IMAGE),
        VIDEO(d.VIDEO);

        public static final EnumSet<MediaCacheFlag> ALL = EnumSet.allOf(MediaCacheFlag.class);

        /* renamed from: a, reason: collision with root package name */
        private final d f4808a;

        MediaCacheFlag(d dVar) {
            this.f4808a = dVar;
        }

        public static Set<d> setToInternalSet(EnumSet<MediaCacheFlag> enumSet) {
            HashSet hashSet = new HashSet();
            Iterator it = enumSet.iterator();
            while (it.hasNext()) {
                hashSet.add(((MediaCacheFlag) it.next()).a());
            }
            return hashSet;
        }

        d a() {
            return this.f4808a;
        }

        public long getCacheFlagValue() {
            return this.f4808a.a();
        }
    }

    public enum NativeComponentTag {
        AD_ICON(i.INTERNAL_AD_ICON),
        AD_TITLE(i.INTERNAL_AD_TITLE),
        AD_COVER_IMAGE(i.INTERNAL_AD_COVER_IMAGE),
        AD_SUBTITLE(i.INTERNAL_AD_SUBTITLE),
        AD_BODY(i.INTERNAL_AD_BODY),
        AD_CALL_TO_ACTION(i.INTERNAL_AD_CALL_TO_ACTION),
        AD_SOCIAL_CONTEXT(i.INTERNAL_AD_SOCIAL_CONTEXT),
        AD_CHOICES_ICON(i.INTERNAL_AD_CHOICES_ICON),
        AD_MEDIA(i.INTERNAL_AD_MEDIA);


        /* renamed from: a, reason: collision with root package name */
        private final i f4810a;

        NativeComponentTag(i iVar) {
            this.f4810a = iVar;
        }

        public static void tagView(View view, NativeComponentTag nativeComponentTag) {
            if (view == null || nativeComponentTag == null) {
                return;
            }
            i.a(view, nativeComponentTag.f4810a);
        }
    }

    public static class Rating {

        /* renamed from: a, reason: collision with root package name */
        private final g f4811a;

        public Rating(double d2, double d3) {
            this.f4811a = new g(d2, d3);
        }

        Rating(g gVar) {
            this.f4811a = gVar;
        }

        public static Rating fromJSONObject(JSONObject jSONObject) {
            g a2 = g.a(jSONObject);
            if (a2 == null) {
                return null;
            }
            return new Rating(a2);
        }

        public double getScale() {
            return this.f4811a.b();
        }

        public double getValue() {
            return this.f4811a.a();
        }
    }

    public NativeAd(Context context, ab abVar, com.facebook.ads.internal.h.d dVar) {
        this.f4803a = new e(context, abVar, dVar, getViewTraversalPredicate());
    }

    public NativeAd(Context context, String str) {
        this.f4803a = new e(context, str, getViewTraversalPredicate());
    }

    NativeAd(NativeAd nativeAd) {
        this.f4803a = new e(nativeAd.f4803a);
    }

    NativeAd(e eVar) {
        this.f4803a = eVar;
    }

    public static void downloadAndDisplayImage(Image image, ImageView imageView) {
        if (image == null || imageView == null) {
            return;
        }
        e.a(image.f4806a, imageView);
    }

    private int getMinViewabilityPercentage() {
        return this.f4803a.d();
    }

    public static e.d getViewTraversalPredicate() {
        return new e.d() { // from class: com.facebook.ads.NativeAd.2
            @Override // com.facebook.ads.internal.n.e.d
            public boolean a(View view) {
                return (view instanceof MediaViewVideoRenderer) || (view instanceof AdChoicesView) || (view instanceof b);
            }
        };
    }

    private void logExternalClick(String str) {
        this.f4803a.b(str);
    }

    private void logExternalImpression() {
        this.f4803a.F();
    }

    private void registerExternalLogReceiver(String str) {
        this.f4803a.a(str);
    }

    ab a() {
        return this.f4803a.a();
    }

    void a(MediaView mediaView) {
        if (mediaView != null) {
            this.f4803a.c(true);
        }
    }

    void a(NativeAdView.Type type) {
        this.f4803a.a(type.a());
    }

    void a(boolean z) {
        this.f4803a.b(z);
    }

    String b() {
        return this.f4803a.w();
    }

    String c() {
        return this.f4803a.x();
    }

    String d() {
        return this.f4803a.y();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.f4803a.c();
    }

    VideoAutoplayBehavior e() {
        return VideoAutoplayBehavior.fromInternalAutoplayBehavior(this.f4803a.z());
    }

    List<NativeAd> f() {
        if (this.f4803a.A() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<e> it = this.f4803a.A().iterator();
        while (it.hasNext()) {
            arrayList.add(new NativeAd(it.next()));
        }
        return arrayList;
    }

    String g() {
        return this.f4803a.B();
    }

    public String getAdBody() {
        return this.f4803a.n();
    }

    public String getAdCallToAction() {
        return this.f4803a.p();
    }

    public Image getAdChoicesIcon() {
        if (this.f4803a.t() == null) {
            return null;
        }
        return new Image(this.f4803a.t());
    }

    public String getAdChoicesLinkUrl() {
        return this.f4803a.u();
    }

    public String getAdChoicesText() {
        return this.f4803a.v();
    }

    public Image getAdCoverImage() {
        if (this.f4803a.j() == null) {
            return null;
        }
        return new Image(this.f4803a.j());
    }

    public Image getAdIcon() {
        if (this.f4803a.i() == null) {
            return null;
        }
        return new Image(this.f4803a.i());
    }

    public AdNetwork getAdNetwork() {
        return AdNetwork.fromInternalAdNetwork(this.f4803a.b());
    }

    public String getAdRawBody() {
        return this.f4803a.o();
    }

    public String getAdSocialContext() {
        return this.f4803a.q();
    }

    @Deprecated
    public Rating getAdStarRating() {
        if (this.f4803a.r() == null) {
            return null;
        }
        return new Rating(this.f4803a.r());
    }

    public String getAdSubtitle() {
        return this.f4803a.m();
    }

    public String getAdTitle() {
        return this.f4803a.l();
    }

    public NativeAdViewAttributes getAdViewAttributes() {
        if (this.f4803a.k() == null) {
            return null;
        }
        return new NativeAdViewAttributes(this.f4803a.k());
    }

    public String getId() {
        return this.f4803a.s();
    }

    public e getInternalNativeAd() {
        return this.f4803a;
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.f4803a.e();
    }

    public boolean hasCallToAction() {
        return this.f4803a.h();
    }

    public boolean isAdLoaded() {
        return this.f4803a.f();
    }

    public boolean isNativeConfigEnabled() {
        return this.f4803a.g();
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        loadAd(EnumSet.of(MediaCacheFlag.NONE));
    }

    public void loadAd(EnumSet<MediaCacheFlag> enumSet) {
        this.f4803a.a(MediaCacheFlag.setToInternalSet(enumSet), (String) null);
    }

    @Override // com.facebook.ads.Ad
    public void loadAdFromBid(String str) {
        loadAdFromBid(str, EnumSet.of(MediaCacheFlag.NONE));
    }

    public void loadAdFromBid(String str, EnumSet<MediaCacheFlag> enumSet) {
        this.f4803a.a(MediaCacheFlag.setToInternalSet(enumSet), str);
    }

    public void onCtaBroadcast() {
        this.f4803a.C();
    }

    public void registerExternalLogReceiverIfNeeded() {
        this.f4803a.E();
    }

    public void registerViewForInteraction(View view) {
        this.f4803a.a(view);
    }

    public void registerViewForInteraction(View view, List<View> list) {
        this.f4803a.a(view, list);
    }

    public void setAdListener(final AdListener adListener) {
        if (adListener == null) {
            return;
        }
        this.f4803a.a(new com.facebook.ads.internal.n.b() { // from class: com.facebook.ads.NativeAd.1
            @Override // com.facebook.ads.internal.n.b
            public void a() {
                adListener.onAdLoaded(NativeAd.this);
            }

            @Override // com.facebook.ads.internal.n.b
            public void a(a aVar) {
                adListener.onError(NativeAd.this, AdError.getAdErrorFromWrapper(aVar));
            }

            @Override // com.facebook.ads.internal.n.b
            public void b() {
                adListener.onAdClicked(NativeAd.this);
            }

            @Override // com.facebook.ads.internal.n.b
            public void c() {
                adListener.onLoggingImpression(NativeAd.this);
            }
        });
    }

    @Deprecated
    public void setMediaViewAutoplay(boolean z) {
        this.f4803a.a(z);
    }

    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f4803a.a(onTouchListener);
    }

    public void unregisterView() {
        this.f4803a.D();
    }
}
