package com.startapp.sdk.internal;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import com.startapp.sdk.json.RatingBar;
import com.startapp.startappsdk.R;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class xa {
    public static final int h = R.id.io_start_list3d_photo;
    public static final int i = R.id.io_start_list3d_title;
    public static final int j = R.id.io_start_list3d_description;
    public static final int k = R.id.io_start_list3d_download;
    public static final int l = R.id.io_start_list3d_rating;

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f495a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final RatingBar f;
    public MetaDataStyle g = null;

    public xa(Context context) {
        context.setTheme(android.R.style.Theme);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f495a = relativeLayout;
        relativeLayout.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        relativeLayout.setLayoutParams(layoutParams);
        int round = Math.round(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics()));
        int round3 = Math.round(TypedValue.applyDimension(1, 5.0f, context.getResources().getDisplayMetrics()));
        int round4 = Math.round(TypedValue.applyDimension(1, 6.0f, context.getResources().getDisplayMetrics()));
        int round5 = Math.round(TypedValue.applyDimension(1, 10.0f, context.getResources().getDisplayMetrics()));
        int round6 = Math.round(TypedValue.applyDimension(1, 84.0f, context.getResources().getDisplayMetrics()));
        relativeLayout.setPadding(round5, round, round5, round);
        relativeLayout.setTag(this);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        int i2 = h;
        imageView.setId(i2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams2.addRule(15);
        imageView.setLayoutParams(layoutParams2);
        imageView.setPadding(0, 0, round4, 0);
        TextView textView = new TextView(context);
        this.c = textView;
        int i3 = i;
        textView.setId(i3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i2);
        layoutParams3.addRule(6, i2);
        textView.setLayoutParams(layoutParams3);
        textView.setPadding(0, 0, 0, round3);
        textView.setTextColor(AdsCommonMetaData.k().q().intValue());
        textView.setTextSize(AdsCommonMetaData.k().s().intValue());
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        ph.a(textView, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setId(j);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(17, i2);
        layoutParams4.addRule(3, i3);
        layoutParams4.setMargins(0, 0, 0, round3);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(AdsCommonMetaData.k().l().intValue());
        textView2.setTextSize(AdsCommonMetaData.k().n().intValue());
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        ph.a(textView2, AdsCommonMetaData.k().m());
        RatingBar ratingBar = new RatingBar(context);
        this.f = ratingBar;
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(17, i2);
        layoutParams5.addRule(8, i2);
        layoutParams5.setMargins(0, 0, 0, -round3);
        ratingBar.setLayoutParams(layoutParams5);
        ratingBar.setPadding(0, 0, 0, round2);
        ratingBar.setId(l);
        TextView textView3 = new TextView(context);
        this.e = textView3;
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(21);
        layoutParams6.addRule(8, i2);
        textView3.setLayoutParams(layoutParams6);
        textView3.setText("Download");
        textView3.setTextColor(-1);
        textView3.setTextSize(12.0f);
        textView3.setTypeface(null, 1);
        textView3.setPadding(round5, round4, round5, round4);
        textView3.setId(k);
        textView3.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        textView3.setBackgroundDrawable(new wa(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        relativeLayout.addView(imageView);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        relativeLayout.addView(ratingBar);
        relativeLayout.addView(textView3);
    }
}
