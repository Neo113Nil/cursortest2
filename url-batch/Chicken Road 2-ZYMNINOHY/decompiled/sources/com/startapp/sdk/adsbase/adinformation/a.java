package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.AdDebuggerMetadata;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.b0;
import com.startapp.sdk.internal.g6;
import com.startapp.sdk.internal.q;
import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f6344a;

    /* renamed from: b, reason: collision with root package name */
    public final AdInformationView f6345b;

    /* renamed from: c, reason: collision with root package name */
    public final AdPreferences.Placement f6346c;

    /* renamed from: d, reason: collision with root package name */
    public final ConsentData f6347d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6348e;

    /* renamed from: f, reason: collision with root package name */
    public final String f6349f;

    /* renamed from: g, reason: collision with root package name */
    public final AdInformationOverrides f6350g;

    /* renamed from: h, reason: collision with root package name */
    public final String f6351h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6352i;

    public a(Context context, AdInformationConfig.ImageResourceType imageResourceType, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2, String str3, String str4) {
        this.f6344a = new WeakReference(context);
        this.f6346c = placement;
        this.f6350g = adInformationOverrides;
        this.f6347d = consentData;
        this.f6348e = str;
        this.f6349f = str2;
        this.f6351h = str3;
        this.f6352i = str4;
        this.f6345b = new AdInformationView(context, imageResourceType, placement, adInformationOverrides, this, (str3 == null && str4 == null) ? false : true);
    }

    public final void a(RelativeLayout relativeLayout) {
        Set a3;
        Context context = relativeLayout.getContext();
        AdInformationConfig a4 = AdInformationMetaData.c().a();
        AdInformationOverrides adInformationOverrides = this.f6350g;
        if ((adInformationOverrides == null || !adInformationOverrides.d()) ? a4.isEnabled(context) : this.f6350g.c()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.f6350g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                a4.getPosition(this.f6346c).addRules(layoutParams);
            } else {
                this.f6350g.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.f6345b, layoutParams);
        }
        q qVar = (q) com.startapp.sdk.components.a.a(context).f6555P.a();
        AdDebuggerMetadata d4 = MetaData.E().d();
        if ((d4 == null || (a3 = d4.a()) == null) ? false : a3.contains(((com.startapp.sdk.common.advertisingid.b) qVar.f7465b.a()).a().f7169a)) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, (this.f6345b.c() * 2) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(Integer.MIN_VALUE);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new b0(this, qVar));
            AdInformationPositions.Position flipHorizontal = this.f6345b.d().flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.f6345b.e(), this.f6345b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            flipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.f6345b.b(), this.f6345b.a());
            flipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = (Context) this.f6344a.get();
        if (context == null) {
            return;
        }
        g6 g6Var = (g6) com.startapp.sdk.components.a.a(context).f6569j.a();
        ConsentData consentData = this.f6347d;
        String c4 = consentData != null ? consentData.c() : null;
        ConsentData consentData2 = this.f6347d;
        String d4 = consentData2 != null ? consentData2.d() : null;
        ConsentData consentData3 = this.f6347d;
        g6Var.a(true, c4, d4, consentData3 != null ? consentData3.b() : null, this.f6351h, this.f6352i);
    }
}
