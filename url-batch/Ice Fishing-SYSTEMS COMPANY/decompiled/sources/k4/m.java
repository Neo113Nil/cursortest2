package k4;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.banner.api.ATBannerView;
import com.anythink.interstitial.api.ATInterstitial;
import com.anythink.nativead.api.ATNative;
import com.anythink.nativead.api.ATNativeAdView;
import com.anythink.nativead.api.ATNativePrepareInfo;
import com.bumptech.glide.manager.n;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeBannerAd;
import com.google.android.gms.internal.ads.C2833Vo;
import com.google.android.gms.internal.ads.C3261gb;
import com.icefishing.icefishingliveapp.C5284R;
import g1.C4523c;
import h.AbstractActivityC4553l;
import java.util.Random;
import k2.C4633d;
import k2.C4634e;
import k2.C4635f;
import k2.C4636g;
import k2.C4637h;
import k2.C4639j;
import org.json.JSONException;
import org.json.JSONObject;
import q2.E0;
import q2.F0;
import v2.AbstractC5123a;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: A, reason: collision with root package name */
    public static InterfaceC4657l f38768A = null;

    /* renamed from: B, reason: collision with root package name */
    public static ATBannerView f38769B = null;

    /* renamed from: C, reason: collision with root package name */
    public static ATNative f38770C = null;

    /* renamed from: D, reason: collision with root package name */
    public static ATNativeAdView f38771D = null;

    /* renamed from: E, reason: collision with root package name */
    public static int f38772E = 0;

    /* renamed from: F, reason: collision with root package name */
    public static int f38773F = 0;

    /* renamed from: G, reason: collision with root package name */
    public static int f38774G = 0;

    /* renamed from: H, reason: collision with root package name */
    public static String f38775H = "";

    /* renamed from: I, reason: collision with root package name */
    public static String f38776I = "";
    public static String J = "";

    /* renamed from: K, reason: collision with root package name */
    public static String f38777K = "";

    /* renamed from: L, reason: collision with root package name */
    public static String f38778L = "";

    /* renamed from: M, reason: collision with root package name */
    public static AdView f38779M = null;

    /* renamed from: N, reason: collision with root package name */
    public static InterstitialAd f38780N = null;

    /* renamed from: O, reason: collision with root package name */
    public static ATNativePrepareInfo f38781O = null;

    /* renamed from: P, reason: collision with root package name */
    public static final String[] f38782P = {"Play & Win Coins", "Play Bubble Shooter Game", "Play Fruit Chop Game", "Play Don't Crash Game", "Play Car Racing Game"};

    /* renamed from: Q, reason: collision with root package name */
    public static final String[] f38783Q = {"Win 5,00,000 Coins & More", "Win 50,000 Coins With Mobile Games", "Win 50,000 Coins No Install Required", "Collect 50,000 Coins Now", "Win Coin & No Installation Required"};

    /* renamed from: R, reason: collision with root package name */
    public static final int[] f38784R = {C5284R.drawable.ads_round1, C5284R.drawable.ads_round2, C5284R.drawable.ads_round3, C5284R.drawable.ads_round4, C5284R.drawable.ads_round5};

    /* renamed from: S, reason: collision with root package name */
    public static final String[] f38785S = {"Play Cricket Win Coins", "Play Bubble Shooter Game", "Play Fruit Chop Game", "Play Don't Crash Game", "Play Car Racing Game"};

    /* renamed from: T, reason: collision with root package name */
    public static final String[] f38786T = {"Win 5,00,000 Coins & More", "Win 50,000 Coins With Mobile Games", "Win 50,000 Coins No Install Required", "Collect 50,000 Coins Now", "Win Coin & No Installation Required"};

    /* renamed from: U, reason: collision with root package name */
    public static final int[] f38787U = {C5284R.drawable.ads_qureka, C5284R.drawable.ads_qureka1, C5284R.drawable.ads_qureka2, C5284R.drawable.ads_qureka3, C5284R.drawable.ads_qureka4};

    /* renamed from: d, reason: collision with root package name */
    public static SharedPreferences f38788d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Context f38789e = null;

    /* renamed from: f, reason: collision with root package name */
    public static int f38790f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static int f38791g = 0;

    /* renamed from: h, reason: collision with root package name */
    public static int f38792h = 0;
    public static int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public static int f38793j = 0;

    /* renamed from: k, reason: collision with root package name */
    public static String f38794k = "";

    /* renamed from: l, reason: collision with root package name */
    public static String f38795l = "";

    /* renamed from: m, reason: collision with root package name */
    public static String f38796m = "";

    /* renamed from: n, reason: collision with root package name */
    public static int f38797n = 0;

    /* renamed from: o, reason: collision with root package name */
    public static int f38798o = 0;

    /* renamed from: p, reason: collision with root package name */
    public static int f38799p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static String f38800q = "";

    /* renamed from: r, reason: collision with root package name */
    public static String f38801r = "";

    /* renamed from: s, reason: collision with root package name */
    public static String f38802s = "";

    /* renamed from: t, reason: collision with root package name */
    public static String f38803t = "";

    /* renamed from: u, reason: collision with root package name */
    public static String f38804u = "";

    /* renamed from: v, reason: collision with root package name */
    public static m f38805v = null;

    /* renamed from: w, reason: collision with root package name */
    public static String f38806w = "";

    /* renamed from: x, reason: collision with root package name */
    public static String f38807x = "";

    /* renamed from: y, reason: collision with root package name */
    public static String f38808y = "";

    /* renamed from: z, reason: collision with root package name */
    public static DialogC4646a f38809z;

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences.Editor f38810a;

    /* renamed from: b, reason: collision with root package name */
    public ATInterstitial f38811b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC5123a f38812c;

    public static void a(Context context, String str, String str2, String str3, String str4, ViewGroup viewGroup) {
        if (f38773F == 1) {
            if (f38774G == 1) {
                NativeBannerAd nativeBannerAd = new NativeBannerAd(context, str4);
                nativeBannerAd.loadAd(nativeBannerAd.buildLoadAdConfig().withAdListener(new C4653h(context, viewGroup, nativeBannerAd)).build());
                return;
            }
            AdView adView = new AdView(context, str3, AdSize.BANNER_HEIGHT_50);
            f38779M = adView;
            viewGroup.addView(adView);
            AdView adView2 = f38779M;
            adView2.loadAd(adView2.buildLoadAdConfig().withAdListener(new C4654i(context, viewGroup)).build());
            return;
        }
        if (f38772E == 1) {
            ATBannerView aTBannerView = new ATBannerView(context);
            f38769B = aTBannerView;
            aTBannerView.setPlacementId(str);
            viewGroup.addView(f38769B);
            f38769B.setBannerAdListener(new S0.e(14, context, viewGroup));
            f38769B.loadAd();
            return;
        }
        if (f38793j == 1) {
            C4639j c4639j = new C4639j(f38789e);
            c4639j.setAdSize(C4637h.i);
            c4639j.setAdUnitId(str2);
            c4639j.b(new C4636g(new C4635f(1)));
            c4639j.setAdListener(new C2833Vo(viewGroup, c4639j, context));
        }
    }

    public static void c(Context context, String str, String str2, String str3, ViewGroup viewGroup) {
        if (f38773F == 1) {
            NativeAd nativeAd = new NativeAd(context, str3);
            nativeAd.loadAd(nativeAd.buildLoadAdConfig().withAdListener(new C4656k(context, viewGroup, nativeAd)).build());
            return;
        }
        if (f38772E == 1) {
            f38771D = new ATNativeAdView(context);
            ATNative aTNative = new ATNative(context, str, new S0.l(14, viewGroup, context));
            f38770C = aTNative;
            aTNative.makeAdRequest();
            return;
        }
        if (f38793j == 1) {
            C4633d c4633d = new C4633d(context, str2);
            c4633d.b(new S0.c(14, context, viewGroup));
            c4633d.c(new com.google.ads.mediation.e(1, context, viewGroup));
            try {
                c4633d.f38701b.t0(new C3261gb(4, false, -1, false, 1, null, false, 0, 0, false, 1 - 1));
            } catch (RemoteException e6) {
                u2.i.g("Failed to specify native ad options", e6);
            }
            C4634e a9 = c4633d.a();
            E0 e02 = new E0();
            e02.f39921d.add("B3EEABB8EE11C2BE770B684D95219ECB");
            a9.a(new F0(e02));
        }
    }

    public static void d(View view) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.9f, 1.0f));
        ofPropertyValuesHolder.setDuration(500L);
        ofPropertyValuesHolder.setRepeatMode(2);
        ofPropertyValuesHolder.setRepeatCount(-1);
        ofPropertyValuesHolder.start();
    }

    public static m e(Context context) {
        f38789e = context;
        if (f38805v == null) {
            m mVar = new m();
            f38789e = context;
            SharedPreferences sharedPreferences = context.getSharedPreferences("MyPref", 0);
            f38788d = sharedPreferences;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            mVar.f38810a = edit;
            String string = f38788d.getString("response", "");
            if (!string.isEmpty()) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    f38790f = jSONObject.getInt("splash_inter");
                    i = jSONObject.getInt("link_redirect");
                    f38791g = jSONObject.getInt("splash_redirect");
                    f38806w = jSONObject.getString("link1");
                    f38807x = jSONObject.getString("link2");
                    f38808y = jSONObject.getString("link3");
                    jSONObject.getString("livetv");
                    f38800q = jSONObject.getString("topon_appid");
                    f38801r = jSONObject.getString("topon_appkey");
                    f38802s = jSONObject.getString("topon_banner");
                    f38803t = jSONObject.getString("topon_inter1");
                    jSONObject.getString("topon_inter2");
                    f38804u = jSONObject.getString("topon_native");
                    f38772E = jSONObject.getInt("topon_showStatus");
                    f38793j = jSONObject.getInt("admob_showAdStatus");
                    jSONObject.getString("AppID");
                    f38794k = jSONObject.getString("Admob_Banner");
                    f38795l = jSONObject.getString("Admob_Interstitial");
                    f38796m = jSONObject.getString("Admob_Native");
                    f38792h = jSONObject.getInt("adposition");
                    f38775H = jSONObject.getString("FB_banner");
                    f38778L = jSONObject.getString("FB_nativebanner");
                    f38776I = jSONObject.getString("FB_inter1");
                    J = jSONObject.getString("FB_inter2");
                    f38777K = jSONObject.getString("FB_native");
                    f38773F = jSONObject.getInt("FB_showAdStatus");
                    f38774G = jSONObject.getInt("FB_bannernative");
                    edit.putInt("adposition", f38792h);
                    edit.putString("interstitial_id", f38803t);
                    edit.commit();
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
            f38805v = mVar;
        }
        return f38805v;
    }

    public static void f() {
        InterfaceC4657l interfaceC4657l = f38768A;
        if (interfaceC4657l != null) {
            interfaceC4657l.OnCall();
            f38768A = null;
        }
    }

    public static void g(Context context) {
        try {
            n nVar = new n();
            ((C4523c) nVar.f23619v).f37856u = Integer.valueOf(E.b.a(context, C5284R.color.colorPrimary) | (-16777216));
            ((Intent) nVar.f23618u).putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 1);
            int nextInt = new Random().nextInt(3);
            if (nextInt == 1) {
                h(context, nVar.b(), Uri.parse(f38806w));
            } else if (nextInt == 2) {
                h(context, nVar.b(), Uri.parse(f38807x));
            } else {
                h(context, nVar.b(), Uri.parse(f38808y));
            }
        } catch (ActivityNotFoundException e6) {
            e6.printStackTrace();
        }
    }

    public static void h(Context context, S0.l lVar, Uri uri) {
        try {
            ((Intent) lVar.f2910u).setPackage("com.android.chrome");
            lVar.q(context, uri);
        } catch (Exception e6) {
            e6.printStackTrace();
            try {
                context.startActivity(new Intent("android.intent.action.VIEW", uri));
            } catch (Exception e9) {
                e9.printStackTrace();
            }
        }
    }

    public static void i(Context context, String str, String str2, String str3, String str4, ViewGroup viewGroup) {
        int i4 = f38798o + 1;
        f38798o = i4;
        int i9 = f38792h;
        if (i9 == 1) {
            if (i4 >= 2) {
                f38798o = 0;
                a(context, str, str2, str3, str4, viewGroup);
                return;
            }
            viewGroup.removeAllViews();
            if (i == 1 && f38791g == 1) {
                a(context, str, str2, str3, str4, viewGroup);
                return;
            }
            return;
        }
        if (i9 != 2) {
            a(context, str, str2, str3, str4, viewGroup);
            return;
        }
        if (i4 >= 3) {
            f38798o = 0;
            a(context, str, str2, str3, str4, viewGroup);
            return;
        }
        viewGroup.removeAllViews();
        if (i == 1 && f38791g == 1) {
            a(context, str, str2, str3, str4, viewGroup);
        }
    }

    public static void k(Context context, String str, String str2, String str3, ViewGroup viewGroup) {
        int i4 = f38799p + 1;
        f38799p = i4;
        int i9 = f38792h;
        if (i9 == 1) {
            if (i4 >= 3) {
                f38799p = 0;
                c(context, str, str2, str3, viewGroup);
                return;
            }
            viewGroup.removeAllViews();
            if (i == 1 && f38791g == 1) {
                c(context, str, str2, str3, viewGroup);
                return;
            }
            return;
        }
        if (i9 != 2) {
            c(context, str, str2, str3, viewGroup);
            return;
        }
        if (i4 >= 2) {
            f38799p = 0;
            c(context, str, str2, str3, viewGroup);
            return;
        }
        viewGroup.removeAllViews();
        if (i == 1 && f38791g == 1) {
            c(context, str, str2, str3, viewGroup);
        }
    }

    public final void b(AbstractActivityC4553l abstractActivityC4553l, String str, String str2, String str3, InterfaceC4657l interfaceC4657l) {
        if (f38773F == 1) {
            InterstitialAd interstitialAd = new InterstitialAd(abstractActivityC4553l, str3);
            f38780N = interstitialAd;
            interstitialAd.loadAd(interstitialAd.buildLoadAdConfig().withAdListener(new C4652g(this, interfaceC4657l, abstractActivityC4553l)).build());
            return;
        }
        if (f38772E == 1) {
            ATInterstitial aTInterstitial = new ATInterstitial(abstractActivityC4553l, str);
            this.f38811b = aTInterstitial;
            aTInterstitial.setAdListener(new C4650e(1, abstractActivityC4553l, interfaceC4657l, this));
            this.f38811b.load();
            return;
        }
        if (f38793j == 1) {
            AbstractC5123a.b(abstractActivityC4553l, str2, new C4636g(new C4635f(1)), new C4651f(1, abstractActivityC4553l, interfaceC4657l, this));
            return;
        }
        if (f38809z.isShowing()) {
            f38809z.dismiss();
        }
        f();
    }

    public final void j(AbstractActivityC4553l abstractActivityC4553l, String str, String str2, String str3, InterfaceC4657l interfaceC4657l) {
        f38768A = interfaceC4657l;
        f38797n++;
        try {
            DialogC4646a dialogC4646a = new DialogC4646a(abstractActivityC4553l);
            f38809z = dialogC4646a;
            if (dialogC4646a.getWindow() != null) {
                f38809z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            }
            f38809z.setCanceledOnTouchOutside(false);
            f38809z.setCancelable(false);
            if (!abstractActivityC4553l.isFinishing()) {
                f38809z.show();
            }
        } catch (Exception e6) {
            e6.printStackTrace();
        }
        int i4 = f38792h;
        if (i4 == 1) {
            if (f38797n >= 2) {
                f38797n = 0;
                b(abstractActivityC4553l, str, str2, str3, interfaceC4657l);
                return;
            }
            try {
                DialogC4646a dialogC4646a2 = f38809z;
                if (dialogC4646a2 != null && dialogC4646a2.isShowing()) {
                    f38809z.dismiss();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
            }
            f();
            if (i == 1 && f38791g == 1) {
                g(abstractActivityC4553l);
                return;
            }
            return;
        }
        if (i4 != 2) {
            b(abstractActivityC4553l, str, str2, str3, interfaceC4657l);
            return;
        }
        if (f38797n >= 3) {
            f38797n = 0;
            b(abstractActivityC4553l, str, str2, str3, interfaceC4657l);
            return;
        }
        try {
            DialogC4646a dialogC4646a3 = f38809z;
            if (dialogC4646a3 != null && dialogC4646a3.isShowing()) {
                f38809z.dismiss();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        f();
        if (i == 1 && f38791g == 1) {
            g(abstractActivityC4553l);
        }
    }
}
