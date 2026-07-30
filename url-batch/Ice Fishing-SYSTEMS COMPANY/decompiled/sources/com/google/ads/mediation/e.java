package com.google.ads.mediation;

import O2.w;
import android.content.Context;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.ads.C4017ue;
import com.google.android.gms.internal.ads.InterfaceC3693od;
import com.google.android.gms.internal.ads.Rx;
import com.google.android.material.datepicker.j;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Random;
import k2.AbstractC4632c;
import k2.C4643n;
import pl.droidsonroids.gif.GifImageView;
import u2.i;
import w2.m;

/* loaded from: classes.dex */
public final class e extends AbstractC4632c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23704n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f23705u;

    /* renamed from: v, reason: collision with root package name */
    public final Object f23706v;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.f23704n = i;
        this.f23705u = obj;
        this.f23706v = obj2;
    }

    @Override // k2.AbstractC4632c
    public void onAdClicked() {
        switch (this.f23704n) {
            case 0:
                C4017ue c4017ue = (C4017ue) ((m) this.f23706v);
                c4017ue.getClass();
                w.d("#008 Must be called on the main UI thread.");
                a aVar = (a) c4017ue.f34631v;
                if (((Rx) c4017ue.f34632w) == null) {
                    if (aVar != null) {
                        if (!aVar.f23698n) {
                            i.a("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                            break;
                        }
                    } else {
                        i.i("#007 Could not call remote method.", null);
                        break;
                    }
                }
                i.a("Adapter called onAdClicked.");
                try {
                    ((InterfaceC3693od) c4017ue.f34630u).c();
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdClosed() {
        switch (this.f23704n) {
            case 0:
                C4017ue c4017ue = (C4017ue) ((m) this.f23706v);
                c4017ue.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdClosed.");
                try {
                    ((InterfaceC3693od) c4017ue.f34630u).f();
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
            default:
                super.onAdClosed();
                break;
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdFailedToLoad(C4643n c4643n) {
        switch (this.f23704n) {
            case 0:
                ((C4017ue) ((m) this.f23706v)).i(c4643n);
                break;
            default:
                if (k4.m.f38791g == 1) {
                    LayoutInflater from = LayoutInflater.from((Context) this.f23705u);
                    ViewGroup viewGroup = (ViewGroup) this.f23706v;
                    View inflate = from.inflate(C5284R.layout.qureka_native, viewGroup, false);
                    k4.m.d(inflate.findViewById(C5284R.id.playNowLL));
                    GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.gif1);
                    TextView textView = (TextView) inflate.findViewById(C5284R.id.native_ad_title);
                    TextView textView2 = (TextView) inflate.findViewById(C5284R.id.desc);
                    int nextInt = new Random().nextInt(5);
                    textView.setText(k4.m.f38785S[nextInt]);
                    textView2.setText(k4.m.f38786T[nextInt]);
                    gifImageView.setBackgroundResource(k4.m.f38787U[nextInt]);
                    inflate.findViewById(C5284R.id.nativeclick).setOnClickListener(new j(4, this));
                    viewGroup.removeAllViews();
                    viewGroup.addView(inflate);
                    break;
                }
                break;
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdImpression() {
        switch (this.f23704n) {
            case 0:
                C4017ue c4017ue = (C4017ue) ((m) this.f23706v);
                c4017ue.getClass();
                w.d("#008 Must be called on the main UI thread.");
                a aVar = (a) c4017ue.f34631v;
                if (((Rx) c4017ue.f34632w) == null) {
                    if (aVar != null) {
                        if (!aVar.f23697m) {
                            i.a("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                            break;
                        }
                    } else {
                        i.i("#007 Could not call remote method.", null);
                        break;
                    }
                }
                i.a("Adapter called onAdImpression.");
                try {
                    ((InterfaceC3693od) c4017ue.f34630u).j();
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdLoaded() {
        switch (this.f23704n) {
            case 0:
                break;
            default:
                super.onAdLoaded();
                break;
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdOpened() {
        switch (this.f23704n) {
            case 0:
                C4017ue c4017ue = (C4017ue) ((m) this.f23706v);
                c4017ue.getClass();
                w.d("#008 Must be called on the main UI thread.");
                i.a("Adapter called onAdOpened.");
                try {
                    ((InterfaceC3693od) c4017ue.f34630u).l();
                    break;
                } catch (RemoteException e6) {
                    i.i("#007 Could not call remote method.", e6);
                    return;
                }
            default:
                super.onAdOpened();
                break;
        }
    }

    private final void a() {
    }
}
