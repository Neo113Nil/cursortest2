package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzecc extends com.google.android.gms.ads.internal.client.zzdv {
    final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzebq zzd;
    private final zzgzy zze;
    private zzebf zzf;

    zzecc(Context context, WeakReference weakReference, zzebq zzebqVar, zzece zzeceVar, zzgzy zzgzyVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzebqVar;
        this.zze = zzgzyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzebx(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzeby(this), this.zze);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public final void zzb(zzebf zzebfVar) {
        this.zzf = zzebfVar;
    }

    public final synchronized void zzc(zzecd zzecdVar) {
        char c;
        String zzb = zzecdVar.zzb();
        switch (zzb.hashCode()) {
            case -1999289321:
                if (zzb.equals("NATIVE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1372958932:
                if (zzb.equals("INTERSTITIAL")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -428325382:
                if (zzb.equals("APP_OPEN_AD")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 543046670:
                if (zzb.equals("REWARDED")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1854800829:
                if (zzb.equals("REWARDED_INTERSTITIAL")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1951953708:
                if (zzb.equals("BANNER")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            String zza = zzecdVar.zza();
            AppOpenAd.load(zzl(), zza, zzecdVar.zzc(), new zzebr(this, zza));
            return;
        }
        if (c == 1) {
            String zza2 = zzecdVar.zza();
            zzbgv zzbgvVar = zzbhe.zzkQ;
            BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzecdVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
            adManagerAdView.setAdSize(zzecdVar.zzd());
            adManagerAdView.setAdUnitId(zza2);
            adManagerAdView.setAdListener(new zzebs(this, zza2, adManagerAdView));
            VideoOptions zzf = zzecdVar.zzf();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzecdVar.zzg() && zzf != null) {
                ((AdManagerAdView) adManagerAdView).setVideoOptions(zzf);
            }
            adManagerAdView.loadAd(zzecdVar.zzc());
            return;
        }
        if (c == 2) {
            String zza3 = zzecdVar.zza();
            InterstitialAd.load(zzl(), zza3, zzecdVar.zzc(), new zzebt(this, zza3));
            return;
        }
        if (c != 3) {
            if (c == 4) {
                String zza4 = zzecdVar.zza();
                RewardedAd.load(zzl(), zza4, zzecdVar.zzc(), new zzebu(this, zza4));
                return;
            } else {
                if (c != 5) {
                    return;
                }
                String zza5 = zzecdVar.zza();
                RewardedInterstitialAd.load(zzl(), zza5, zzecdVar.zzc(), new zzebv(this, zza5));
                return;
            }
        }
        final String zza6 = zzecdVar.zza();
        AdLoader.Builder builder = new AdLoader.Builder(zzl(), zza6);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                zzecc.this.zzf(zza6, nativeAd);
            }
        });
        builder.withAdListener(new zzebw(this));
        NativeAdOptions zze = zzecdVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkQ)).booleanValue() && zze != null) {
            builder.withNativeAdOptions(zze);
        }
        builder.build().loadAd(zzecdVar.zzc());
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        Activity zzo = this.zzd.zzo();
        if (zzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbgv zzbgvVar = zzbhe.zzkP;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(zzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(zzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(zzo, zzecb.zza);
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(zzo, zzebz.zza);
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context zzl = zzl();
                intent.setClassName(zzl, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra(OutOfContextTestingActivity.AD_UNIT_KEY, str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzaa(zzl, intent);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        Map map = this.zza;
        Object obj = map.get(str);
        if (obj != null) {
            map.remove(str);
        }
        if (obj instanceof AdView) {
            zzece.zza(context, viewGroup, (AdView) obj);
        } else if (obj instanceof NativeAd) {
            zzece.zzb(context, viewGroup, (NativeAd) obj);
        }
    }

    protected final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    final /* synthetic */ zzebq zzi() {
        return this.zzd;
    }
}
