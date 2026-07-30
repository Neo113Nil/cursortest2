package com.icefishing.icefishingliveapp;

import O.E0;
import O.L;
import O.X;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import h.AbstractActivityC4553l;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class IntroActivity extends AbstractActivityC4553l {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f36935y = 0;

    /* renamed from: n, reason: collision with root package name */
    public ImageView[] f36936n = null;

    /* renamed from: u, reason: collision with root package name */
    public final IntroActivity f36937u = this;

    /* renamed from: v, reason: collision with root package name */
    public ViewPager f36938v;

    /* renamed from: w, reason: collision with root package name */
    public TextView f36939w;

    /* renamed from: x, reason: collision with root package name */
    public Intent f36940x;

    public final void e(int i) {
        for (int i4 = 0; i4 < 3; i4++) {
            if (i4 == i) {
                this.f36936n[i4].setImageResource(C5284R.drawable.ic_dot_select);
            } else {
                this.f36936n[i4].setImageResource(C5284R.drawable.ic_dot_not_select);
                this.f36939w.setText("NEXT");
            }
            if (i == 2) {
                this.f36939w.setText("DONE");
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, androidx.activity.p, D.AbstractActivityC0294n, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 0;
        super.onCreate(bundle);
        setContentView(C5284R.layout.activity_intro);
        View findViewById = findViewById(C5284R.id.main);
        com.anythink.core.common.n.b.A a9 = new com.anythink.core.common.n.b.A(3);
        WeakHashMap weakHashMap = X.f2240a;
        L.u(findViewById, a9);
        this.f36938v = (ViewPager) findViewById(C5284R.id.viewPager);
        k4.m.i(this.f36937u, k4.m.f38802s, k4.m.f38794k, k4.m.f38775H, k4.m.f38778L, (ViewGroup) findViewById(C5284R.id.banner_container));
        this.f36939w = (TextView) findViewById(C5284R.id.txtNext);
        this.f36936n = new ImageView[]{(ImageView) findViewById(C5284R.id.view_1), (ImageView) findViewById(C5284R.id.view_2), (ImageView) findViewById(C5284R.id.view_3)};
        ViewPager viewPager = this.f36938v;
        j4.e eVar = new j4.e();
        eVar.f38566b = new int[]{C5284R.drawable.intro1, C5284R.drawable.intro2, C5284R.drawable.intro3};
        eVar.f38567c = new int[]{C5284R.string.app_name, C5284R.string.intro2, C5284R.string.intro3};
        eVar.f38568d = new int[]{C5284R.string.intro1_dec, C5284R.string.intro2_dec, C5284R.string.intro3_dec};
        eVar.f38565a = this;
        viewPager.setAdapter(eVar);
        ViewPager viewPager2 = this.f36938v;
        m mVar = new m(this, 0);
        if (viewPager2.f5466z0 == null) {
            viewPager2.f5466z0 = new ArrayList();
        }
        viewPager2.f5466z0.add(mVar);
        this.f36939w.setOnClickListener(new n(this, i));
        findViewById(C5284R.id.skip).setOnClickListener(new n(this, 1));
    }

    @Override // androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public final void onResume() {
        super.onResume();
        E0 h9 = Build.VERSION.SDK_INT >= 30 ? X.h(getWindow().getDecorView()) : new E0(getWindow(), null);
        if (h9 != null) {
            p8.g gVar = h9.f2225a;
            gVar.o();
            gVar.i();
            getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new o(this));
        }
    }

    @Override // h.AbstractActivityC4553l, androidx.fragment.app.AbstractActivityC0490x, android.app.Activity
    public final void onStart() {
        super.onStart();
        e(this.f36938v.getCurrentItem());
    }
}
