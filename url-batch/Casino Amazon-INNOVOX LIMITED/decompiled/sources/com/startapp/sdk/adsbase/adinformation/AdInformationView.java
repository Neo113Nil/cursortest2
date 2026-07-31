package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.graphics.Color;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.imageutils.JfifUtil;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.f0;
import com.startapp.sdk.internal.ph;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class AdInformationView extends RelativeLayout {
    private static final int e = Color.rgb(0, JfifUtil.MARKER_EOI, 134);

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f122a;
    private final AdInformationConfig b;
    private final AdInformationConfig.ImageResourceType c;
    private final AdInformationPositions.Position d;

    public AdInformationView(Context context, AdInformationConfig.ImageResourceType imageResourceType, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, a aVar, boolean z) {
        super(context);
        this.c = imageResourceType;
        c cVar = new c(aVar);
        AdInformationConfig a2 = AdInformationMetaData.c().a();
        this.b = a2;
        if (a2 == null) {
            this.b = new AdInformationConfig();
        }
        if (adInformationOverrides == null || !adInformationOverrides.e()) {
            this.d = this.b.getPosition(placement);
        } else {
            this.d = adInformationOverrides.b();
        }
        ImageView imageView = new ImageView(getContext());
        imageView.setContentDescription("info");
        imageView.setId(f0.i);
        imageView.setImageDrawable(this.b.getImage(getContext(), imageResourceType));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(e(), c());
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setPadding(0, 0, 0, 0);
        this.d.addRules(layoutParams);
        relativeLayout.addView(imageView, layoutParams);
        relativeLayout.setOnClickListener(cVar);
        if (z) {
            int i = imageResourceType == AdInformationConfig.ImageResourceType.INFO_L ? 18 : 12;
            TextView textView = new TextView(getContext());
            textView.setText("AD");
            textView.setTextColor(e);
            textView.setTextSize(1, i);
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
        return (int) (this.b.getFatFingerFactor() * c());
    }

    public final int b() {
        return (int) (this.b.getFatFingerFactor() * e());
    }

    public final int c() {
        return ph.a(getContext(), this.b.getHeight(this.c));
    }

    public final AdInformationPositions.Position d() {
        AdInformationPositions.Position position = this.d;
        return position != null ? position : AdInformationPositions.Position.BOTTOM_LEFT;
    }

    public final int e() {
        return ph.a(getContext(), this.b.getWidth(this.c));
    }
}
