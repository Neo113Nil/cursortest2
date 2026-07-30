package com.icefishing.icefishingliveapp;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import h.AbstractActivityC4553l;

/* loaded from: classes2.dex */
public class CountryActivity extends AbstractActivityC4553l {

    /* renamed from: A, reason: collision with root package name */
    public CardView f36517A;

    /* renamed from: B, reason: collision with root package name */
    public CardView f36518B;

    /* renamed from: C, reason: collision with root package name */
    public CardView f36519C;

    /* renamed from: D, reason: collision with root package name */
    public View f36520D;

    /* renamed from: E, reason: collision with root package name */
    public View f36521E;

    /* renamed from: F, reason: collision with root package name */
    public View f36522F;

    /* renamed from: G, reason: collision with root package name */
    public View f36523G;

    /* renamed from: H, reason: collision with root package name */
    public View f36524H;

    /* renamed from: I, reason: collision with root package name */
    public View f36525I;
    public View J;

    /* renamed from: K, reason: collision with root package name */
    public View f36526K;

    /* renamed from: L, reason: collision with root package name */
    public CountryActivity f36527L;

    /* renamed from: M, reason: collision with root package name */
    public ImageView f36528M;

    /* renamed from: N, reason: collision with root package name */
    public ImageView f36529N;

    /* renamed from: O, reason: collision with root package name */
    public ImageView f36530O;

    /* renamed from: P, reason: collision with root package name */
    public ImageView f36531P;

    /* renamed from: Q, reason: collision with root package name */
    public ImageView f36532Q;

    /* renamed from: R, reason: collision with root package name */
    public ImageView f36533R;

    /* renamed from: S, reason: collision with root package name */
    public ImageView f36534S;

    /* renamed from: T, reason: collision with root package name */
    public ImageView f36535T;

    /* renamed from: n, reason: collision with root package name */
    public boolean f36536n = false;

    /* renamed from: u, reason: collision with root package name */
    public CardView f36537u;

    /* renamed from: v, reason: collision with root package name */
    public CardView f36538v;

    /* renamed from: w, reason: collision with root package name */
    public CardView f36539w;

    /* renamed from: x, reason: collision with root package name */
    public CardView f36540x;

    /* renamed from: y, reason: collision with root package name */
    public CardView f36541y;

    /* renamed from: z, reason: collision with root package name */
    public CardView f36542z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void e(CountryActivity countryActivity, String str) {
        boolean z8;
        char c4 = 7;
        countryActivity.f36520D.setVisibility(8);
        countryActivity.f36521E.setVisibility(8);
        countryActivity.f36522F.setVisibility(8);
        countryActivity.f36523G.setVisibility(8);
        countryActivity.f36524H.setVisibility(8);
        countryActivity.f36525I.setVisibility(8);
        countryActivity.J.setVisibility(8);
        countryActivity.f36526K.setVisibility(8);
        countryActivity.f36528M.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36529N.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36530O.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36531P.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36532Q.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36533R.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36534S.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36535T.setImageResource(C5284R.drawable.ic_unselelct);
        countryActivity.f36536n = true;
        switch (str.hashCode()) {
            case 2718:
                if (str.equals("US")) {
                    z8 = false;
                    break;
                }
                z8 = -1;
                break;
            case 69808407:
                if (str.equals("INDIA")) {
                    z8 = true;
                    break;
                }
                z8 = -1;
                break;
            case 69984387:
                if (str.equals("ITALY")) {
                    z8 = 2;
                    break;
                }
                z8 = -1;
                break;
            case 75532016:
                if (str.equals("OTHER")) {
                    z8 = 3;
                    break;
                }
                z8 = -1;
                break;
            case 79100329:
                if (str.equals("SPAIN")) {
                    z8 = 4;
                    break;
                }
                z8 = -1;
                break;
            case 641750931:
                if (str.equals("GERMANY")) {
                    z8 = 5;
                    break;
                }
                z8 = -1;
                break;
            case 1938625706:
                if (str.equals("ARABIA")) {
                    z8 = 6;
                    break;
                }
                z8 = -1;
                break;
            case 2081782811:
                if (str.equals("FRANCE")) {
                    z8 = 7;
                    break;
                }
                z8 = -1;
                break;
            default:
                z8 = -1;
                break;
        }
        switch (z8) {
            case false:
                c4 = 0;
                break;
            case true:
                c4 = 1;
                break;
            case true:
                c4 = 2;
                break;
            case true:
                break;
            case true:
                c4 = 3;
                break;
            case true:
                c4 = 4;
                break;
            case true:
                c4 = 5;
                break;
            case true:
                c4 = 6;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                countryActivity.f36520D.setVisibility(0);
                countryActivity.f36528M.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 1:
                countryActivity.f36522F.setVisibility(0);
                countryActivity.f36530O.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 2:
                countryActivity.f36525I.setVisibility(0);
                countryActivity.f36533R.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 3:
                countryActivity.f36521E.setVisibility(0);
                countryActivity.f36529N.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 4:
                countryActivity.f36524H.setVisibility(0);
                countryActivity.f36532Q.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 5:
                countryActivity.J.setVisibility(0);
                countryActivity.f36534S.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 6:
                countryActivity.f36523G.setVisibility(0);
                countryActivity.f36531P.setImageResource(C5284R.drawable.ic_selelct);
                break;
            case 7:
                countryActivity.f36526K.setVisibility(0);
                countryActivity.f36535T.setImageResource(C5284R.drawable.ic_selelct);
                break;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_country);
        this.f36520D = findViewById(C5284R.id.v_us);
        this.f36521E = findViewById(C5284R.id.v_spain);
        this.f36522F = findViewById(C5284R.id.v_india);
        this.f36523G = findViewById(C5284R.id.v_france);
        this.f36524H = findViewById(C5284R.id.v_germany);
        this.f36525I = findViewById(C5284R.id.v_italy);
        this.J = findViewById(C5284R.id.v_arabia);
        this.f36526K = findViewById(C5284R.id.v_other);
        this.f36527L = this;
        this.f36537u = (CardView) findViewById(C5284R.id.card_us);
        this.f36538v = (CardView) findViewById(C5284R.id.card_spain);
        this.f36539w = (CardView) findViewById(C5284R.id.card_india);
        this.f36540x = (CardView) findViewById(C5284R.id.card_france);
        this.f36541y = (CardView) findViewById(C5284R.id.card_germany);
        this.f36542z = (CardView) findViewById(C5284R.id.card_italy);
        this.f36517A = (CardView) findViewById(C5284R.id.card_arabia);
        this.f36519C = (CardView) findViewById(C5284R.id.card_other);
        this.f36518B = (CardView) findViewById(C5284R.id.accept);
        this.f36528M = (ImageView) findViewById(C5284R.id.iv_us_select);
        this.f36529N = (ImageView) findViewById(C5284R.id.iv_spain_select);
        this.f36530O = (ImageView) findViewById(C5284R.id.iv_india_select);
        this.f36531P = (ImageView) findViewById(C5284R.id.iv_france_select);
        this.f36532Q = (ImageView) findViewById(C5284R.id.iv_germany_select);
        this.f36533R = (ImageView) findViewById(C5284R.id.iv_italy_select);
        this.f36534S = (ImageView) findViewById(C5284R.id.iv_arabia_select);
        this.f36535T = (ImageView) findViewById(C5284R.id.iv_other_select);
        k4.m.i(this.f36527L, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(this.f36527L, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        this.f36537u.setOnClickListener(new ViewOnClickListenerC4413b(this, 0));
        this.f36538v.setOnClickListener(new ViewOnClickListenerC4413b(this, 1));
        this.f36539w.setOnClickListener(new ViewOnClickListenerC4413b(this, 2));
        this.f36540x.setOnClickListener(new ViewOnClickListenerC4413b(this, 3));
        this.f36541y.setOnClickListener(new ViewOnClickListenerC4413b(this, 4));
        this.f36542z.setOnClickListener(new ViewOnClickListenerC4413b(this, 5));
        this.f36517A.setOnClickListener(new ViewOnClickListenerC4413b(this, 6));
        this.f36519C.setOnClickListener(new ViewOnClickListenerC4413b(this, 7));
        this.f36518B.setOnClickListener(new ViewOnClickListenerC4413b(this, 8));
    }
}
