package k4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Random;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: k4.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4656k implements NativeAdListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Context f38765n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f38766u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ NativeAd f38767v;

    public C4656k(Context context, ViewGroup viewGroup, NativeAd nativeAd) {
        this.f38765n = context;
        this.f38766u = viewGroup;
        this.f38767v = nativeAd;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        NativeAd nativeAd = this.f38767v;
        if (nativeAd == null || !nativeAd.isAdLoaded()) {
            return;
        }
        this.f38766u.addView(NativeAdView.render(this.f38765n, nativeAd, NativeAdView.Type.HEIGHT_300));
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        if (m.f38791g == 1) {
            LayoutInflater from = LayoutInflater.from(this.f38765n);
            ViewGroup viewGroup = this.f38766u;
            View inflate = from.inflate(C5284R.layout.qureka_native, viewGroup, false);
            m.d(inflate.findViewById(C5284R.id.playNowLL));
            GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.gif1);
            TextView textView = (TextView) inflate.findViewById(C5284R.id.native_ad_title);
            TextView textView2 = (TextView) inflate.findViewById(C5284R.id.desc);
            int nextInt = new Random().nextInt(5);
            textView.setText(m.f38785S[nextInt]);
            textView2.setText(m.f38786T[nextInt]);
            gifImageView.setBackgroundResource(m.f38787U[nextInt]);
            inflate.findViewById(C5284R.id.nativeclick).setOnClickListener(new com.google.android.material.datepicker.j(8, this));
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
