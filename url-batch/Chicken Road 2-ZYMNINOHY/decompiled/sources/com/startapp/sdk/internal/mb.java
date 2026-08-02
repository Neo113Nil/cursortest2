package com.startapp.sdk.internal;

import E.AbstractC0005f;
import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class mb extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final String f7273a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7274b;

    public mb(List3DActivity list3DActivity, ArrayList arrayList, String str, String str2) {
        super(list3DActivity, 0, arrayList);
        this.f7273a = str;
        this.f7274b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        View view2;
        qb qbVar;
        if (view == null) {
            qbVar = new qb(getContext());
            view2 = qbVar.f7498a;
        } else {
            view2 = view;
            qbVar = (qb) view.getTag();
        }
        ob obVar = (ob) getItem(i4);
        MetaDataStyle a3 = AdsCommonMetaData.k().a(obVar.f7393q);
        if (qbVar.f7504g != a3) {
            qbVar.f7504g = a3;
            qbVar.f7498a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a3.e().intValue(), a3.d().intValue()}));
            qbVar.f7500c.setTextSize(a3.h().intValue());
            qbVar.f7500c.setTextColor(a3.f().intValue());
            ii.a(qbVar.f7500c, a3.g());
            qbVar.f7501d.setTextSize(a3.c().intValue());
            qbVar.f7501d.setTextColor(a3.a().intValue());
            ii.a(qbVar.f7501d, a3.b());
        }
        qbVar.f7500c.setText(obVar.f7385g);
        qbVar.f7501d.setText(obVar.f7386h);
        rb a4 = ((sb) com.startapp.sdk.components.a.a(getContext()).f6557R.a()).a(this.f7274b);
        Bitmap a5 = a4.f7528a.a(obVar.f7379a, i4, obVar.f7387i);
        if (a5 == null) {
            qbVar.f7499b.setImageResource(R.drawable.sym_def_app_icon);
            qbVar.f7499b.setTag("tag_error");
        } else {
            qbVar.f7499b.setImageBitmap(a5);
            qbVar.f7499b.setTag("tag_ok");
        }
        qbVar.f7503f.setRating(obVar.f7388j);
        if (obVar.n != null) {
            qbVar.f7502e.setText("Open");
        } else {
            qbVar.f7502e.setText("Download");
        }
        Context context = getContext();
        String[] strArr = obVar.f7381c;
        TrackingParams trackingParams = new TrackingParams(this.f7273a);
        Long l4 = obVar.o;
        long millis = l4 != null ? TimeUnit.SECONDS.toMillis(l4.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
        a9 a9Var = a4.f7528a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String q4 = strArr != null ? AbstractC0005f.q(new StringBuilder(), TextUtils.join("^", strArr), a4.f7530c) : null;
        if (a9Var.f6654c.containsKey(q4)) {
            return view2;
        }
        xf xfVar = new xf(context, placement, strArr, trackingParams, millis, false, null);
        a9Var.f6654c.put(q4, xfVar);
        xfVar.c();
        return view2;
    }
}
