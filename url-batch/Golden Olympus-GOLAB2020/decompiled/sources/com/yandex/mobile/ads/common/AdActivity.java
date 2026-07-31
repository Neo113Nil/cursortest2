package com.yandex.mobile.ads.common;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.activity.j;
import com.yandex.mobile.ads.impl.C1792a1;
import com.yandex.mobile.ads.impl.C1871d8;
import com.yandex.mobile.ads.impl.C2031k1;
import com.yandex.mobile.ads.impl.C2193r1;
import com.yandex.mobile.ads.impl.C2330x0;
import com.yandex.mobile.ads.impl.C2353y0;
import com.yandex.mobile.ads.impl.C2376z0;
import com.yandex.mobile.ads.impl.InterfaceC1984i1;
import com.yandex.mobile.ads.impl.ap0;
import com.yandex.mobile.ads.impl.jh2;
import com.yandex.mobile.ads.impl.ne1;
import com.yandex.mobile.ads.impl.qe1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AdActivity extends j {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    private ne1 f22382a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    private C2330x0 f22383b;

    @Override // androidx.activity.j, android.app.Activity
    public final void onBackPressed() {
        C2330x0 c2330x0 = this.f22383b;
        if (c2330x0 == null || c2330x0.c()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.activity.j, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NotNull Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onConfigurationChanged(config);
        C2330x0 c2330x0 = this.f22383b;
        if (c2330x0 != null) {
            c2330x0.a(config);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003a, code lost:
    
        if (r10 == (-1)) goto L11;
     */
    @Override // androidx.activity.j, androidx.core.app.h, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(@Nullable Bundle bundle) {
        Long l4;
        C1871d8 d4;
        InterfaceC1984i1 a4;
        AdActivity adActivity;
        C2330x0 c2330x0;
        super.onCreate(bundle);
        Intrinsics.checkNotNullParameter(this, "activity");
        C1792a1 c1792a1 = new C1792a1(this);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        Intent intent = getIntent();
        Unit unit = null;
        if (intent == null) {
            a4 = null;
        } else {
            Window window = getWindow();
            int i4 = C2376z0.f35409d;
            C2376z0 a5 = C2376z0.a.a();
            try {
                if (intent.hasExtra("data_identifier")) {
                    long longExtra = intent.getLongExtra("data_identifier", -1L);
                    l4 = Long.valueOf(longExtra);
                }
            } catch (Exception unused) {
                ap0.b(new Object[0]);
            }
            l4 = null;
            C2353y0 a6 = l4 != null ? a5.a(l4.longValue()) : null;
            if (a6 != null) {
                try {
                    d4 = a6.d();
                } catch (Exception unused2) {
                    ap0.b(new Object[0]);
                }
                C2193r1 c2193r1 = new C2193r1(this, d4);
                C2031k1 a7 = C2031k1.f27968b.a();
                Intrinsics.checkNotNull(window);
                a4 = a7.a(this, relativeLayout, c2193r1, c1792a1, intent, window, a6);
            }
            d4 = null;
            C2193r1 c2193r12 = new C2193r1(this, d4);
            C2031k1 a72 = C2031k1.f27968b.a();
            Intrinsics.checkNotNull(window);
            a4 = a72.a(this, relativeLayout, c2193r12, c1792a1, intent, window, a6);
        }
        if (a4 != null) {
            adActivity = this;
            c2330x0 = new C2330x0(adActivity, relativeLayout, a4, c1792a1, new jh2());
        } else {
            adActivity = this;
            c2330x0 = null;
        }
        adActivity.f22383b = c2330x0;
        if (c2330x0 != null) {
            c2330x0.b();
            unit = Unit.f41027a;
        }
        if (unit == null) {
            finish();
        }
        new qe1();
        ne1 a8 = qe1.a(this, adActivity.f22383b);
        adActivity.f22382a = a8;
        if (a8 != null) {
            a8.a();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        C2330x0 c2330x0 = this.f22383b;
        if (c2330x0 != null) {
            c2330x0.a();
        }
        ne1 ne1Var = this.f22382a;
        if (ne1Var != null) {
            ne1Var.destroy();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        C2330x0 c2330x0 = this.f22383b;
        if (c2330x0 != null) {
            c2330x0.d();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        C2330x0 c2330x0 = this.f22383b;
        if (c2330x0 != null) {
            c2330x0.e();
        }
    }
}
