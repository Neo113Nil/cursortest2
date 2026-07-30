package com.icefishing.icefishingliveapp;

import O.L;
import O.X;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.gms.internal.ads.CL;
import h.AbstractActivityC4553l;
import h.C4545d;
import h.InterfaceC4543b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Timer;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class MainActivity extends AbstractActivityC4553l {

    /* renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ int f36970a1 = 0;

    /* renamed from: A, reason: collision with root package name */
    public LinearLayout f36971A;

    /* renamed from: A0, reason: collision with root package name */
    public ImageView f36972A0;

    /* renamed from: B, reason: collision with root package name */
    public LinearLayout f36973B;

    /* renamed from: B0, reason: collision with root package name */
    public ImageView f36974B0;

    /* renamed from: C, reason: collision with root package name */
    public ImageView f36975C;
    public ImageView C0;

    /* renamed from: D, reason: collision with root package name */
    public ImageView f36976D;

    /* renamed from: D0, reason: collision with root package name */
    public ImageView f36977D0;

    /* renamed from: E, reason: collision with root package name */
    public ImageView f36978E;

    /* renamed from: E0, reason: collision with root package name */
    public ImageView f36979E0;

    /* renamed from: F, reason: collision with root package name */
    public ImageView f36980F;

    /* renamed from: F0, reason: collision with root package name */
    public ImageView f36981F0;

    /* renamed from: G, reason: collision with root package name */
    public ImageView f36982G;

    /* renamed from: G0, reason: collision with root package name */
    public ImageView f36983G0;

    /* renamed from: H, reason: collision with root package name */
    public ImageView f36984H;

    /* renamed from: H0, reason: collision with root package name */
    public LinearLayout f36985H0;

    /* renamed from: I, reason: collision with root package name */
    public ImageView f36986I;

    /* renamed from: I0, reason: collision with root package name */
    public LinearLayout f36987I0;
    public ImageView J;

    /* renamed from: J0, reason: collision with root package name */
    public LinearLayout f36988J0;

    /* renamed from: K, reason: collision with root package name */
    public ImageView f36989K;

    /* renamed from: K0, reason: collision with root package name */
    public LinearLayout f36990K0;

    /* renamed from: L, reason: collision with root package name */
    public Intent f36991L;

    /* renamed from: L0, reason: collision with root package name */
    public LinearLayout f36992L0;

    /* renamed from: M0, reason: collision with root package name */
    public LinearLayout f36994M0;

    /* renamed from: N, reason: collision with root package name */
    public ViewPager f36995N;

    /* renamed from: N0, reason: collision with root package name */
    public LinearLayout f36996N0;

    /* renamed from: O0, reason: collision with root package name */
    public LinearLayout f36998O0;

    /* renamed from: P0, reason: collision with root package name */
    public LinearLayout f37000P0;

    /* renamed from: Q0, reason: collision with root package name */
    public LinearLayout f37002Q0;

    /* renamed from: R0, reason: collision with root package name */
    public LinearLayout f37004R0;

    /* renamed from: S0, reason: collision with root package name */
    public LinearLayout f37006S0;

    /* renamed from: T0, reason: collision with root package name */
    public LinearLayout f37008T0;

    /* renamed from: U0, reason: collision with root package name */
    public LinearLayout f37010U0;

    /* renamed from: V0, reason: collision with root package name */
    public LinearLayout f37012V0;

    /* renamed from: W, reason: collision with root package name */
    public LinearLayout f37013W;

    /* renamed from: W0, reason: collision with root package name */
    public LinearLayout f37014W0;

    /* renamed from: X, reason: collision with root package name */
    public RecyclerView f37015X;

    /* renamed from: X0, reason: collision with root package name */
    public DrawerLayout f37016X0;
    public ArrayList Y;

    /* renamed from: Y0, reason: collision with root package name */
    public Toolbar f37017Y0;

    /* renamed from: Z, reason: collision with root package name */
    public LinearLayout f37018Z;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f37020n;

    /* renamed from: n0, reason: collision with root package name */
    public LinearLayout f37021n0;

    /* renamed from: o0, reason: collision with root package name */
    public LinearLayout f37022o0;

    /* renamed from: q0, reason: collision with root package name */
    public LinearLayout f37024q0;

    /* renamed from: r0, reason: collision with root package name */
    public ImageView f37025r0;

    /* renamed from: s0, reason: collision with root package name */
    public ImageView f37026s0;

    /* renamed from: t0, reason: collision with root package name */
    public ImageView f37027t0;

    /* renamed from: u, reason: collision with root package name */
    public LinearLayout f37028u;

    /* renamed from: u0, reason: collision with root package name */
    public ImageView f37029u0;

    /* renamed from: v, reason: collision with root package name */
    public LinearLayout f37030v;

    /* renamed from: v0, reason: collision with root package name */
    public ImageView f37031v0;

    /* renamed from: w, reason: collision with root package name */
    public LinearLayout f37032w;

    /* renamed from: w0, reason: collision with root package name */
    public ImageView f37033w0;

    /* renamed from: x, reason: collision with root package name */
    public LinearLayout f37034x;

    /* renamed from: x0, reason: collision with root package name */
    public ImageView f37035x0;

    /* renamed from: y, reason: collision with root package name */
    public LinearLayout f37036y;

    /* renamed from: y0, reason: collision with root package name */
    public ImageView f37037y0;

    /* renamed from: z, reason: collision with root package name */
    public LinearLayout f37038z;

    /* renamed from: z0, reason: collision with root package name */
    public ImageView f37039z0;

    /* renamed from: M, reason: collision with root package name */
    public final MainActivity f36993M = this;

    /* renamed from: O, reason: collision with root package name */
    public final Intent f36997O = new Intent();

    /* renamed from: P, reason: collision with root package name */
    public final ArrayList f36999P = new ArrayList();

    /* renamed from: Q, reason: collision with root package name */
    public final Intent f37001Q = new Intent();

    /* renamed from: R, reason: collision with root package name */
    public final Intent f37003R = new Intent();

    /* renamed from: S, reason: collision with root package name */
    public final Intent f37005S = new Intent();

    /* renamed from: T, reason: collision with root package name */
    public final Intent f37007T = new Intent();

    /* renamed from: U, reason: collision with root package name */
    public double f37009U = 0.0d;

    /* renamed from: V, reason: collision with root package name */
    public final Intent f37011V = new Intent();

    /* renamed from: p0, reason: collision with root package name */
    public final Timer f37023p0 = new Timer();

    /* renamed from: Z0, reason: collision with root package name */
    public final String f37019Z0 = "1. What is ice fishing?\nIce fishing is a winter activity where people catch fish through a hole drilled in a frozen lake or river.\n\n2. Why do people go ice fishing?\nPeople enjoy ice fishing for recreation, relaxation, and the challenge of catching fish in cold conditions.\n\n3. What equipment is used in ice fishing?\nCommon equipment includes an ice auger, fishing rod, bait, fishing line, and a shelter.\n\n4. How is a hole made in the ice?\nAn ice auger is used to drill a hole through the frozen surface of the lake.\n\n5. What kinds of fish can be caught while ice fishing?\nPopular catches include perch, trout, pike, walleye, and crappie.\n\n6. Is ice fishing safe?\nIce fishing can be safe when the ice is thick enough and proper safety precautions are followed.\n\n7. What is an ice fishing shelter?\nIt is a portable tent or small hut that protects anglers from wind, snow, and cold temperatures.\n\n8. When is the best time for ice fishing?\nIce fishing is usually done during winter when lakes and rivers are frozen.\n\n9. Can beginners try ice fishing?\nYes, beginners can enjoy ice fishing with basic equipment and guidance from experienced anglers.\n\n10. What makes ice fishing fun?\nThe excitement of catching fish, spending time outdoors, and enjoying winter scenery makes ice fishing enjoyable.";

    public static void e(MainActivity mainActivity, Intent intent) {
        mainActivity.getClass();
        try {
            k4.m.e(mainActivity.f36993M).j(mainActivity, k4.m.f38803t, k4.m.f38795l, k4.m.f38776I, new S0.l(mainActivity, intent, 11, false));
        } catch (ActivityNotFoundException e6) {
            e6.printStackTrace();
        }
    }

    @Override // androidx.activity.p, android.app.Activity
    public final void onBackPressed() {
        View e6 = this.f37016X0.e(8388611);
        if (e6 != null ? DrawerLayout.n(e6) : false) {
            this.f37016X0.c();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 3;
        int i4 = 2;
        int i9 = 0;
        int i10 = 8;
        int i11 = 4;
        int i12 = 1;
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_main);
        View findViewById = findViewById(C5284R.id._drawer);
        com.anythink.core.common.n.b.A a9 = new com.anythink.core.common.n.b.A(i11);
        WeakHashMap weakHashMap = X.f2240a;
        L.u(findViewById, a9);
        int[] iArr = {C5284R.drawable.ic_one, C5284R.drawable.ic_two, C5284R.drawable.ic_three, C5284R.drawable.ic_four, C5284R.drawable.ic_five, C5284R.drawable.ic_six, C5284R.drawable.ic_seven, C5284R.drawable.ic_eight};
        String[] strArr = {getResources().getString(C5284R.string.a), getResources().getString(C5284R.string.b), getResources().getString(C5284R.string.c), getResources().getString(C5284R.string.d), getResources().getString(C5284R.string.e), getResources().getString(C5284R.string.f), getResources().getString(C5284R.string.g), getResources().getString(C5284R.string.h)};
        String[] strArr2 = {getResources().getString(C5284R.string.aa), getResources().getString(C5284R.string.bb), getResources().getString(C5284R.string.cc), getResources().getString(C5284R.string.dd), getResources().getString(C5284R.string.ee), getResources().getString(C5284R.string.ff), getResources().getString(C5284R.string.gg), getResources().getString(C5284R.string.hh)};
        int[] iArr2 = {getResources().getColor(C5284R.color.c1), getResources().getColor(C5284R.color.c2), getResources().getColor(C5284R.color.c3), getResources().getColor(C5284R.color.c4), getResources().getColor(C5284R.color.c1), getResources().getColor(C5284R.color.c2), getResources().getColor(C5284R.color.c3), getResources().getColor(C5284R.color.c4)};
        this.f37015X = (RecyclerView) findViewById(C5284R.id.recyclerView);
        this.Y = new ArrayList();
        for (int i13 = 0; i13 < 8; i13++) {
            j4.d dVar = new j4.d();
            dVar.f38563b = iArr[i13];
            dVar.f38564c = strArr[i13];
            dVar.f38562a = strArr2[i13];
            int i14 = iArr2[i13];
            this.Y.add(dVar);
        }
        Context applicationContext = getApplicationContext();
        ArrayList arrayList = this.Y;
        j4.c cVar = new j4.c();
        cVar.f38560c = applicationContext;
        j4.c.f38559e = arrayList;
        cVar.f38561d = this;
        RecyclerView recyclerView = this.f37015X;
        MainActivity mainActivity = this.f36993M;
        recyclerView.setLayoutManager(new LinearLayoutManager(0));
        this.f37015X.setAdapter(cVar);
        k4.m.i(mainActivity, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        k4.m.k(mainActivity, k4.m.f38804u, k4.m.f38796m, k4.m.f38777K, (ViewGroup) findViewById(C5284R.id.native_ad_container));
        Toolbar toolbar = (Toolbar) findViewById(C5284R.id._toolbar);
        this.f37017Y0 = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().m(true);
        getSupportActionBar().p();
        this.f37017Y0.setNavigationOnClickListener(new t(this, 10));
        this.f37016X0 = (DrawerLayout) findViewById(C5284R.id._drawer);
        ((ImageView) findViewById(C5284R.id.imageview_drawer)).setOnClickListener(new t(this, 21));
        C4545d c4545d = new C4545d(this, this.f37016X0, this.f37017Y0);
        DrawerLayout drawerLayout = this.f37016X0;
        if (drawerLayout.f4858M == null) {
            drawerLayout.f4858M = new ArrayList();
        }
        drawerLayout.f4858M.add(c4545d);
        DrawerLayout drawerLayout2 = c4545d.f38079b;
        View e6 = drawerLayout2.e(8388611);
        if (e6 != null ? DrawerLayout.n(e6) : false) {
            c4545d.a(1.0f);
        } else {
            c4545d.a(0.0f);
        }
        View e9 = drawerLayout2.e(8388611);
        int i15 = e9 != null ? DrawerLayout.n(e9) : false ? c4545d.f38082e : c4545d.f38081d;
        boolean z8 = c4545d.f38083f;
        InterfaceC4543b interfaceC4543b = c4545d.f38078a;
        if (!z8 && !interfaceC4543b.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            c4545d.f38083f = true;
        }
        interfaceC4543b.w(c4545d.f38080c, i15);
        this.f37038z = (LinearLayout) findViewById(C5284R.id.first);
        this.f36971A = (LinearLayout) findViewById(C5284R.id.two);
        this.f36973B = (LinearLayout) findViewById(C5284R.id.third);
        this.f36986I = (ImageView) findViewById(C5284R.id.img_thumbnail1);
        this.J = (ImageView) findViewById(C5284R.id.img_thumbnail2);
        this.f36989K = (ImageView) findViewById(C5284R.id.img_thumbnail3);
        ((com.bumptech.glide.n) CL.e("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhCCUkqT5_VqTwk1yuIAVcdHQczbUjpUg3yKmZTpN_s43aF0zK3Na6gzbG2iTgY0tYQ_NAiGspyhyd2PXs11V9s9ja9eUkAI6LGwHiyj3hxFz_-IKCfa2TCrl99YsFi0RUwnVgIJxsqZEfO1Iyaj0dx5QNqhRY5ZPvOKfsM--dpE8Td3hvA5axdznj-M2Ld/s320/Screenshot_7.png", CL.h((com.bumptech.glide.n) CL.e("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgz6u_keAbU1ARZoaZsnuVQ76eORUpwChcazd6vmvS6iLAMF1i-V8y7zWKyq3TcbwSw_qRrVzH80OREfZZ_5uBM5r4UR5x2F_9TpalbrhHrDh-POtQLd0O2qC8oIFMiKzW5UKPHwKd_kS1WzMIKMPG04e7Bj88IsQ3IWgu-4M-oZOgNti0xMR1yx6Fx51Cr/s320/Screenshot_6.png", CL.h((com.bumptech.glide.n) CL.e("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiWkn20kBu3bWIoejHYz4sGjoyDvsZNePmBYt9zlR2h-Zt8autmBuhiOVqnzJ2q-GTziq4owdt0wt7o3MRxVAOw1IcYyLvcyH0GfvqH0BsdSJY7Gmh_BvwXLXs71rbb7uLct8WPlZqYLowF6A_Bbrn6lCWtIPTFDUd7bWNAeCz8mW46KRmRJVAg3V7-51oM/s320/Screenshot_14.png", com.bumptech.glide.c.c(getApplicationContext())), this.f36986I, this)), this.J, this))).E(this.f36989K);
        this.f37038z.setOnClickListener(new u(this, i12));
        this.f36971A.setOnClickListener(new u(this, i4));
        this.f36973B.setOnClickListener(new u(this, i));
        findViewById(C5284R.id.intro).setOnClickListener(new u(this, i11));
        this.f37013W = (LinearLayout) findViewById(C5284R.id.dot1);
        this.f37018Z = (LinearLayout) findViewById(C5284R.id.dot2);
        this.f37021n0 = (LinearLayout) findViewById(C5284R.id.dot3);
        this.f37022o0 = (LinearLayout) findViewById(C5284R.id.dot4);
        this.f37024q0 = (LinearLayout) findViewById(C5284R.id.dot5);
        ViewPager viewPager = (ViewPager) findViewById(C5284R.id.viewpager1);
        this.f36995N = viewPager;
        m mVar = new m(this, i12);
        if (viewPager.f5466z0 == null) {
            viewPager.f5466z0 = new ArrayList();
        }
        viewPager.f5466z0.add(mVar);
        HashMap hashMap = new HashMap();
        hashMap.put("a", "b");
        ArrayList arrayList2 = this.f36999P;
        arrayList2.add(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("c", "d");
        arrayList2.add(hashMap2);
        HashMap hashMap3 = new HashMap();
        hashMap3.put("e", "f");
        arrayList2.add(hashMap3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put("g", "h");
        arrayList2.add(hashMap4);
        HashMap hashMap5 = new HashMap();
        hashMap5.put("i", com.anythink.expressad.foundation.d.j.cD);
        arrayList2.add(hashMap5);
        HashMap hashMap6 = new HashMap();
        hashMap6.put("k", "l");
        arrayList2.add(hashMap6);
        this.f36995N.setPageMargin(-30);
        this.f36995N.setOffscreenPageLimit(2);
        this.f36995N.v(new W3.e(17));
        this.f36995N.setAdapter(new x(this, arrayList2));
        this.f37023p0.scheduleAtFixedRate(new v(this), 4000L, 4000L);
        this.f37020n = (LinearLayout) findViewById(C5284R.id.linear_newest_1);
        this.f37028u = (LinearLayout) findViewById(C5284R.id.linear_newest_2);
        this.f37030v = (LinearLayout) findViewById(C5284R.id.linear_newest_3);
        this.f37032w = (LinearLayout) findViewById(C5284R.id.linear_newest_4);
        this.f37034x = (LinearLayout) findViewById(C5284R.id.linear_newest_5);
        this.f37036y = (LinearLayout) findViewById(C5284R.id.linear_newest_6);
        this.f36975C = (ImageView) findViewById(C5284R.id.imageview_newest_1);
        this.f36976D = (ImageView) findViewById(C5284R.id.imageview_newest_2);
        this.f36978E = (ImageView) findViewById(C5284R.id.imageview_newest_3);
        this.f36980F = (ImageView) findViewById(C5284R.id.imageview_newest_4);
        this.f36982G = (ImageView) findViewById(C5284R.id.imageview_newest_5);
        this.f36984H = (ImageView) findViewById(C5284R.id.imageview_newest_6);
        this.f37025r0 = (ImageView) findViewById(C5284R.id.image_toprated_1);
        this.f37026s0 = (ImageView) findViewById(C5284R.id.image_toprated_2);
        this.f37027t0 = (ImageView) findViewById(C5284R.id.image_toprated_3);
        this.f37029u0 = (ImageView) findViewById(C5284R.id.image_toprated_4);
        this.f37031v0 = (ImageView) findViewById(C5284R.id.image_toprated_5);
        this.f37033w0 = (ImageView) findViewById(C5284R.id.image_toprated_6);
        this.f37035x0 = (ImageView) findViewById(C5284R.id.image_toprated_7);
        this.f37037y0 = (ImageView) findViewById(C5284R.id.image_toprated_8);
        this.f37039z0 = (ImageView) findViewById(C5284R.id.image_toprated_9);
        this.f36972A0 = (ImageView) findViewById(C5284R.id.image_toprated_10);
        this.f36974B0 = (ImageView) findViewById(C5284R.id.image_toprated_11);
        this.C0 = (ImageView) findViewById(C5284R.id.image_toprated_12);
        this.f36977D0 = (ImageView) findViewById(C5284R.id.image_toprated_13);
        this.f36979E0 = (ImageView) findViewById(C5284R.id.image_toprated_14);
        this.f36981F0 = (ImageView) findViewById(C5284R.id.image_toprated_15);
        this.f36983G0 = (ImageView) findViewById(C5284R.id.image_toprated_16);
        this.f36985H0 = (LinearLayout) findViewById(C5284R.id.top1);
        this.f36987I0 = (LinearLayout) findViewById(C5284R.id.top2);
        this.f36988J0 = (LinearLayout) findViewById(C5284R.id.top3);
        this.f36990K0 = (LinearLayout) findViewById(C5284R.id.top4);
        this.f36992L0 = (LinearLayout) findViewById(C5284R.id.top5);
        this.f36994M0 = (LinearLayout) findViewById(C5284R.id.top6);
        this.f36996N0 = (LinearLayout) findViewById(C5284R.id.top7);
        this.f36998O0 = (LinearLayout) findViewById(C5284R.id.top8);
        this.f37000P0 = (LinearLayout) findViewById(C5284R.id.top9);
        this.f37002Q0 = (LinearLayout) findViewById(C5284R.id.top10);
        this.f37004R0 = (LinearLayout) findViewById(C5284R.id.top11);
        this.f37006S0 = (LinearLayout) findViewById(C5284R.id.top12);
        this.f37008T0 = (LinearLayout) findViewById(C5284R.id.top13);
        this.f37010U0 = (LinearLayout) findViewById(C5284R.id.top14);
        this.f37012V0 = (LinearLayout) findViewById(C5284R.id.top15);
        this.f37014W0 = (LinearLayout) findViewById(C5284R.id.top16);
        ((com.bumptech.glide.n) CL.e("https://static.gamezop.com/r10-NLT86bx/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/H1IEpMJP917/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1gBpzJwqJQ/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rkYbNLTIT-x/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/H1PJn6mqAr/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/r1z13aXqAB/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SyfxJ3a75Cr/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/rJ57aMJDcJm/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/BkdJhTX50B/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/S1Wrpf1v5ym/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SkhljT2fdgb/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/B1fSpMkP51m/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/H1Tz6z1Dqym/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/HJP4afkvqJQ/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/Skz4pzkDqyX/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/H1AN6fkwqJ7/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/SklmW1ad_/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/4kZgf_1z-9l/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/ryJGkhT7qAB/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/wMm3YDfJC/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/Bk4ML6470x/cover.jpg", CL.h((com.bumptech.glide.n) CL.e("https://static.gamezop.com/Cg8EBuMp7/cover.jpg", com.bumptech.glide.c.c(getApplicationContext())), this.f36975C, this)), this.f36976D, this)), this.f36978E, this)), this.f36980F, this)), this.f36982G, this)), this.f36984H, this)), this.f37025r0, this)), this.f37026s0, this)), this.f37027t0, this)), this.f37029u0, this)), this.f37031v0, this)), this.f37033w0, this)), this.f37035x0, this)), this.f37037y0, this)), this.f37039z0, this)), this.f36972A0, this)), this.f36974B0, this)), this.C0, this)), this.f36977D0, this)), this.f36979E0, this)), this.f36981F0, this))).E(this.f36983G0);
        findViewById(C5284R.id.actionmenu).setOnClickListener(new u(this, 5));
        findViewById(C5284R.id.adventuremenu).setOnClickListener(new u(this, 6));
        findViewById(C5284R.id.arcademenu).setOnClickListener(new t(this, i9));
        findViewById(C5284R.id.puzzlemenu).setOnClickListener(new t(this, i12));
        findViewById(C5284R.id.sportsmenu).setOnClickListener(new t(this, i4));
        findViewById(C5284R.id.strategymenu).setOnClickListener(new t(this, i));
        this.f37020n.setOnClickListener(new t(this, i11));
        this.f37028u.setOnClickListener(new t(this, 5));
        this.f37030v.setOnClickListener(new t(this, 6));
        this.f37032w.setOnClickListener(new t(this, 7));
        this.f37034x.setOnClickListener(new t(this, i10));
        this.f37036y.setOnClickListener(new t(this, 9));
        this.f36985H0.setOnClickListener(new t(this, 11));
        this.f36987I0.setOnClickListener(new t(this, 12));
        this.f36988J0.setOnClickListener(new t(this, 13));
        this.f36990K0.setOnClickListener(new t(this, 14));
        this.f36992L0.setOnClickListener(new t(this, 15));
        this.f36994M0.setOnClickListener(new t(this, 16));
        this.f36996N0.setOnClickListener(new t(this, 17));
        this.f36998O0.setOnClickListener(new t(this, 18));
        this.f37000P0.setOnClickListener(new t(this, 19));
        this.f37002Q0.setOnClickListener(new t(this, 20));
        this.f37004R0.setOnClickListener(new t(this, 22));
        this.f37006S0.setOnClickListener(new t(this, 23));
        this.f37008T0.setOnClickListener(new t(this, 24));
        this.f37010U0.setOnClickListener(new t(this, 25));
        this.f37012V0.setOnClickListener(new t(this, 26));
        this.f37014W0.setOnClickListener(new t(this, 27));
        findViewById(C5284R.id.sharemenu).setOnClickListener(new t(this, 28));
        findViewById(C5284R.id.privacymenu).setOnClickListener(new t(this, 29));
        findViewById(C5284R.id.ratemenu).setOnClickListener(new u(this, i9));
    }
}
