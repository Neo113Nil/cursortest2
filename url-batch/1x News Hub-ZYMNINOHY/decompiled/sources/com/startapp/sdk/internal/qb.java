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

/* loaded from: classes.dex */
public final class qb {

    /* renamed from: h, reason: collision with root package name */
    public static final int f4357h = R.id.io_start_list3d_photo;

    /* renamed from: i, reason: collision with root package name */
    public static final int f4358i = R.id.io_start_list3d_title;

    /* renamed from: j, reason: collision with root package name */
    public static final int f4359j = R.id.io_start_list3d_description;

    /* renamed from: k, reason: collision with root package name */
    public static final int f4360k = R.id.io_start_list3d_download;

    /* renamed from: l, reason: collision with root package name */
    public static final int f4361l = R.id.io_start_list3d_rating;

    /* renamed from: a, reason: collision with root package name */
    public final RelativeLayout f4362a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f4363b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f4364c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f4365d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f4366e;
    public final RatingBar f;

    /* renamed from: g, reason: collision with root package name */
    public MetaDataStyle f4367g = null;

    public qb(Context context) {
        context.setTheme(android.R.style.Theme);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        this.f4362a = relativeLayout;
        relativeLayout.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.k().p(), AdsCommonMetaData.k().o()}));
        relativeLayout.setLayoutParams(layoutParams);
        int round = Math.round(TypedValue.applyDimension(1, 3, context.getResources().getDisplayMetrics()));
        int round2 = Math.round(TypedValue.applyDimension(1, 4, context.getResources().getDisplayMetrics()));
        int round3 = Math.round(TypedValue.applyDimension(1, 5, context.getResources().getDisplayMetrics()));
        int round4 = Math.round(TypedValue.applyDimension(1, 6, context.getResources().getDisplayMetrics()));
        int round5 = Math.round(TypedValue.applyDimension(1, 10, context.getResources().getDisplayMetrics()));
        int round6 = Math.round(TypedValue.applyDimension(1, 84, context.getResources().getDisplayMetrics()));
        relativeLayout.setPadding(round5, round, round5, round);
        relativeLayout.setTag(this);
        ImageView imageView = new ImageView(context);
        this.f4363b = imageView;
        int i3 = f4357h;
        imageView.setId(i3);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(round6, round6);
        layoutParams2.addRule(15);
        imageView.setLayoutParams(layoutParams2);
        imageView.setPadding(0, 0, round4, 0);
        TextView textView = new TextView(context);
        this.f4364c = textView;
        int i4 = f4358i;
        textView.setId(i4);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(17, i3);
        layoutParams3.addRule(6, i3);
        textView.setLayoutParams(layoutParams3);
        textView.setPadding(0, 0, 0, round3);
        textView.setTextColor(AdsCommonMetaData.k().q().intValue());
        textView.setTextSize(AdsCommonMetaData.k().s().intValue());
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        ii.a(textView, AdsCommonMetaData.k().r());
        TextView textView2 = new TextView(context);
        this.f4365d = textView2;
        textView2.setId(f4359j);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(17, i3);
        layoutParams4.addRule(3, i4);
        layoutParams4.setMargins(0, 0, 0, round3);
        textView2.setLayoutParams(layoutParams4);
        textView2.setTextColor(AdsCommonMetaData.k().l().intValue());
        textView2.setTextSize(AdsCommonMetaData.k().n().intValue());
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        ii.a(textView2, AdsCommonMetaData.k().m());
        RatingBar ratingBar = new RatingBar(context);
        this.f = ratingBar;
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(17, i3);
        layoutParams5.addRule(8, i3);
        layoutParams5.setMargins(0, 0, 0, -round3);
        ratingBar.setLayoutParams(layoutParams5);
        ratingBar.setPadding(0, 0, 0, round2);
        ratingBar.setId(f4361l);
        TextView textView3 = new TextView(context);
        this.f4366e = textView3;
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(21);
        layoutParams6.addRule(8, i3);
        textView3.setLayoutParams(layoutParams6);
        textView3.setText("Download");
        textView3.setTextColor(-1);
        textView3.setTextSize(12.0f);
        textView3.setTypeface(null, 1);
        textView3.setPadding(round5, round4, round5, round4);
        textView3.setId(f4360k);
        textView3.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        textView3.setBackgroundDrawable(new pb(new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, null, null)));
        relativeLayout.addView(imageView);
        relativeLayout.addView(textView);
        relativeLayout.addView(textView2);
        relativeLayout.addView(ratingBar);
        relativeLayout.addView(textView3);
    }
}
