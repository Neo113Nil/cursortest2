package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;

/* loaded from: classes.dex */
public class AdInformationView extends RelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int f3250e = Color.rgb(0, 217, 134);

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f3251a;

    /* renamed from: b, reason: collision with root package name */
    private final AdInformationConfig f3252b;

    /* renamed from: c, reason: collision with root package name */
    private final AdInformationConfig.ImageResourceType f3253c;

    /* renamed from: d, reason: collision with root package name */
    private final AdInformationPositions.Position f3254d;

    public AdInformationView(Context context, AdInformationConfig.ImageResourceType imageResourceType, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, a aVar, boolean z) {
        super(context);
        this.f3253c = imageResourceType;
        c cVar = new c(aVar);
        AdInformationConfig a3 = AdInformationMetaData.c().a();
        this.f3252b = a3;
        if (a3 == null) {
            this.f3252b = new AdInformationConfig();
        }
        if (adInformationOverrides == null || !adInformationOverrides.e()) {
            this.f3254d = this.f3252b.getPosition(placement);
        } else {
            this.f3254d = adInformationOverrides.b();
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setContentDescription("info");
        imageView.setId(h0.f3918i);
        imageView.setImageDrawable(this.f3252b.getImage(getContext(), imageResourceType));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.f3251a = relativeLayout;
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(e(), c());
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setPadding(0, 0, 0, 0);
        this.f3254d.addRules(layoutParams);
        relativeLayout.addView(imageView, layoutParams);
        relativeLayout.setOnClickListener(cVar);
        if (z) {
            int i3 = imageResourceType == AdInformationConfig.ImageResourceType.INFO_L ? 18 : 12;
            TextView textView = new TextView(getContext());
            textView.setText("AD");
            textView.setTextColor(f3250e);
            textView.setTextSize(1, i3);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(e(), c());
            layoutParams2.setMargins(0, 0, 0, 0);
            textView.setPadding(0, 0, 0, 0);
            layoutParams2.addRule(17, imageView.getId());
            layoutParams2.addRule(8, imageView.getId());
            relativeLayout.addView(textView, layoutParams2);
        }
        addView(relativeLayout, new RelativeLayout.LayoutParams(b(), a()));
    }

    public final int a() {
        return (int) (this.f3252b.getFatFingerFactor() * c());
    }

    public final int b() {
        return (int) (this.f3252b.getFatFingerFactor() * e());
    }

    public final int c() {
        return ii.a(getContext(), this.f3252b.getHeight(this.f3253c));
    }

    public final AdInformationPositions.Position d() {
        AdInformationPositions.Position position = this.f3254d;
        return position != null ? position : AdInformationPositions.Position.BOTTOM_LEFT;
    }

    public final int e() {
        return ii.a(getContext(), this.f3252b.getWidth(this.f3253c));
    }
}
