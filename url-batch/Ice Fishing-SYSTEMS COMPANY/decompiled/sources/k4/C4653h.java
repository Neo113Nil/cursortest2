package k4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: k4.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4653h implements NativeAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f38758n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f38759u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeBannerAd f38760v;

    public C4653h(Context context, ViewGroup viewGroup, NativeBannerAd nativeBannerAd) {
        this.f38758n = context;
        this.f38759u = viewGroup;
        this.f38760v = nativeBannerAd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeBannerAd nativeBannerAd = this.f38760v;
        if (nativeBannerAd == null || nativeBannerAd != ad) {
            return;
        }
        this.f38759u.addView(NativeBannerAdView.render(this.f38758n, nativeBannerAd, NativeBannerAdView.Type.HEIGHT_100));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (m.f38791g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f38758n);
            ViewGroup viewGroup = this.f38759u;
            View inflate = from.inflate(C5284R.layout.qureka_nativebanner_layout, viewGroup, false);
            m.d(inflate.findViewById(C5284R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.iv_round_gif);
            TextView textView = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_name);
            TextView textView2 = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(m.f38782P[nextInt]);
            textView2.setText(m.f38783Q[nextInt]);
            gifImageView.setImageResource(m.f38784R[nextInt]);
            inflate.findViewById(C5284R.id.bannerclick).setOnClickListener(new com.google.android.material.datepicker.j(5, this));
            viewGroup.removeAllViews();
            viewGroup.addView(inflate);
        }
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.NativeAdListener
    public final void onMediaDownloaded(Ad ad) {
    }
}
