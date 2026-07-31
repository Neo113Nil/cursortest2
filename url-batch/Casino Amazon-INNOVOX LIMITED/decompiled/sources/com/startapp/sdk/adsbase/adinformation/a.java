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
import com.startapp.sdk.internal.q;
import com.startapp.sdk.internal.x5;
import java.lang.ref.WeakReference;
import java.util.Set;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f124a;
    public final AdInformationView b;
    public final AdPreferences.Placement c;
    public final ConsentData d;
    public final String e;
    public final String f;
    public final AdInformationOverrides g;
    public final String h;
    public final String i;

    public a(Context context, AdInformationConfig.ImageResourceType imageResourceType, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, ConsentData consentData, String str, String str2, String str3, String str4) {
        this.f124a = new WeakReference(context);
        this.c = placement;
        this.g = adInformationOverrides;
        this.d = consentData;
        this.e = str;
        this.f = str2;
        this.h = str3;
        this.i = str4;
        this.b = new AdInformationView(context, imageResourceType, placement, adInformationOverrides, this, (str3 == null && str4 == null) ? false : true);
    }

    public final void a(RelativeLayout relativeLayout) {
        Set a2;
        Context context = relativeLayout.getContext();
        AdInformationConfig a3 = AdInformationMetaData.c().a();
        AdInformationOverrides adInformationOverrides = this.g;
        if ((adInformationOverrides == null || !adInformationOverrides.d()) ? a3.isEnabled(context) : this.g.c()) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            AdInformationOverrides adInformationOverrides2 = this.g;
            if (adInformationOverrides2 == null || !adInformationOverrides2.e()) {
                a3.getPosition(this.c).addRules(layoutParams);
            } else {
                this.g.b().addRules(layoutParams);
            }
            relativeLayout.addView(this.b, layoutParams);
        }
        q qVar = (q) com.startapp.sdk.components.a.a(context).O.a();
        AdDebuggerMetadata c = MetaData.A().c();
        if ((c == null || (a2 = c.a()) == null) ? false : a2.contains(((com.startapp.sdk.common.advertisingid.b) qVar.b.a()).a().f255a)) {
            TextView textView = new TextView(context);
            textView.setGravity(17);
            textView.setText("D");
            textView.setTypeface(textView.getTypeface(), 1);
            textView.setTextSize(0, (this.b.c() * 2) / 3.0f);
            textView.setTextColor(-1);
            textView.setBackgroundColor(Integer.MIN_VALUE);
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            relativeLayout2.setOnClickListener(new b0(this, qVar));
            AdInformationPositions.Position flipHorizontal = this.b.d().flipHorizontal();
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(this.b.e(), this.b.c());
            layoutParams2.setMargins(0, 0, 0, 0);
            flipHorizontal.addRules(layoutParams2);
            relativeLayout2.addView(textView, layoutParams2);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(this.b.b(), this.b.a());
            flipHorizontal.addRules(layoutParams3);
            relativeLayout.addView(relativeLayout2, layoutParams3);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Context context = (Context) this.f124a.get();
        if (context == null) {
            return;
        }
        x5 x5Var = (x5) com.startapp.sdk.components.a.a(context).i.a();
        ConsentData consentData = this.d;
        String c = consentData != null ? consentData.c() : null;
        ConsentData consentData2 = this.d;
        String d = consentData2 != null ? consentData2.d() : null;
        ConsentData consentData3 = this.d;
        x5Var.a(true, c, d, consentData3 != null ? consentData3.b() : null, this.h, this.i);
    }
}
