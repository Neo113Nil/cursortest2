package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Objects;
import java.util.Random;
import k2.AbstractC4632c;
import k2.AbstractC4641l;
import k2.C4639j;
import k2.C4643n;
import pl.droidsonroids.gif.GifImageView;

/* renamed from: com.google.android.gms.internal.ads.Vo, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2833Vo extends AbstractC4632c {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28305n = 1;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28306u;

    /* renamed from: v, reason: collision with root package name */
    public Object f28307v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f28308w;

    public C2833Vo(ViewGroup viewGroup, C4639j c4639j, Context context) {
        this.f28306u = viewGroup;
        this.f28307v = c4639j;
        this.f28308w = context;
    }

    @Override // k2.AbstractC4632c
    public void onAdClicked() {
        switch (this.f28305n) {
            case 2:
                synchronized (this.f28306u) {
                    try {
                        AbstractC4632c abstractC4632c = (AbstractC4632c) this.f28307v;
                        if (abstractC4632c != null) {
                            abstractC4632c.onAdClicked();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdClosed() {
        switch (this.f28305n) {
            case 2:
                synchronized (this.f28306u) {
                    try {
                        AbstractC4632c abstractC4632c = (AbstractC4632c) this.f28307v;
                        if (abstractC4632c != null) {
                            abstractC4632c.onAdClosed();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onAdClosed();
                return;
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdFailedToLoad(C4643n c4643n) {
        switch (this.f28305n) {
            case 0:
                ((BinderC2948ap) this.f28308w).H3(BinderC2948ap.K3(c4643n));
                return;
            case 1:
                if (k4.m.f38791g == 1) {
                    LayoutInflater from = LayoutInflater.from((Context) this.f28308w);
                    ViewGroup viewGroup = (ViewGroup) this.f28306u;
                    View inflate = from.inflate(C5284R.layout.qureka_nativebanner_layout, viewGroup, false);
                    k4.m.d(inflate.findViewById(C5284R.id.playNowLL));
                    GifImageView gifImageView = (GifImageView) inflate.findViewById(C5284R.id.iv_round_gif);
                    TextView textView = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_name);
                    TextView textView2 = (TextView) inflate.findViewById(C5284R.id.tv_text_ad_desc);
                    int nextInt = new Random().nextInt(5);
                    textView.setText(k4.m.f38782P[nextInt]);
                    textView2.setText(k4.m.f38783Q[nextInt]);
                    gifImageView.setImageResource(k4.m.f38784R[nextInt]);
                    inflate.findViewById(C5284R.id.bannerclick).setOnClickListener(new com.google.android.material.datepicker.j(7, this));
                    viewGroup.removeAllViews();
                    viewGroup.addView(inflate);
                    return;
                }
                return;
            default:
                q2.G0 g02 = (q2.G0) this.f28308w;
                k2.v vVar = g02.f39946c;
                q2.K k6 = g02.i;
                q2.A0 a02 = null;
                if (k6 != null) {
                    try {
                        a02 = k6.B();
                    } catch (RemoteException e6) {
                        u2.i.i("#007 Could not call remote method.", e6);
                    }
                }
                vVar.b(a02);
                synchronized (this.f28306u) {
                    try {
                        AbstractC4632c abstractC4632c = (AbstractC4632c) this.f28307v;
                        if (abstractC4632c != null) {
                            abstractC4632c.onAdFailedToLoad(c4643n);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdImpression() {
        switch (this.f28305n) {
            case 2:
                synchronized (this.f28306u) {
                    try {
                        AbstractC4632c abstractC4632c = (AbstractC4632c) this.f28307v;
                        if (abstractC4632c != null) {
                            abstractC4632c.onAdImpression();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                return;
        }
    }

    @Override // k2.AbstractC4632c
    public final void onAdLoaded() {
        switch (this.f28305n) {
            case 0:
                String str = (String) this.f28306u;
                ((BinderC2948ap) this.f28308w).G3((AbstractC4641l) this.f28307v, str);
                return;
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f28306u;
                viewGroup.removeAllViews();
                viewGroup.addView((C4639j) this.f28307v);
                return;
            default:
                q2.G0 g02 = (q2.G0) this.f28308w;
                k2.v vVar = g02.f39946c;
                q2.K k6 = g02.i;
                q2.A0 a02 = null;
                if (k6 != null) {
                    try {
                        a02 = k6.B();
                    } catch (RemoteException e6) {
                        u2.i.i("#007 Could not call remote method.", e6);
                    }
                }
                vVar.b(a02);
                synchronized (this.f28306u) {
                    try {
                        AbstractC4632c abstractC4632c = (AbstractC4632c) this.f28307v;
                        if (abstractC4632c != null) {
                            abstractC4632c.onAdLoaded();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // k2.AbstractC4632c
    public void onAdOpened() {
        switch (this.f28305n) {
            case 2:
                synchronized (this.f28306u) {
                    try {
                        AbstractC4632c abstractC4632c = (AbstractC4632c) this.f28307v;
                        if (abstractC4632c != null) {
                            abstractC4632c.onAdOpened();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            default:
                super.onAdOpened();
                return;
        }
    }

    public C2833Vo(BinderC2948ap binderC2948ap, String str, AbstractC4641l abstractC4641l) {
        this.f28306u = str;
        this.f28307v = abstractC4641l;
        Objects.requireNonNull(binderC2948ap);
        this.f28308w = binderC2948ap;
    }

    public C2833Vo(q2.G0 g02) {
        Objects.requireNonNull(g02);
        this.f28308w = g02;
        this.f28306u = new Object();
    }
}
