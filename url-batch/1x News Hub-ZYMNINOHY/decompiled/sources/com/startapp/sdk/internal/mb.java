package com.startapp.sdk.internal;

import E1.AbstractC0033i;
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
    public final String f4145a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4146b;

    public mb(List3DActivity list3DActivity, ArrayList arrayList, String str, String str2) {
        super(list3DActivity, 0, arrayList);
        this.f4145a = str;
        this.f4146b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i3, View view, ViewGroup viewGroup) {
        View view2;
        qb qbVar;
        if (view == null) {
            qbVar = new qb(getContext());
            view2 = qbVar.f4362a;
        } else {
            view2 = view;
            qbVar = (qb) view.getTag();
        }
        ob obVar = (ob) getItem(i3);
        MetaDataStyle a3 = AdsCommonMetaData.k().a(obVar.f4258q);
        if (qbVar.f4367g != a3) {
            qbVar.f4367g = a3;
            qbVar.f4362a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a3.e().intValue(), a3.d().intValue()}));
            qbVar.f4364c.setTextSize(a3.h().intValue());
            qbVar.f4364c.setTextColor(a3.f().intValue());
            ii.a(qbVar.f4364c, a3.g());
            qbVar.f4365d.setTextSize(a3.c().intValue());
            qbVar.f4365d.setTextColor(a3.a().intValue());
            ii.a(qbVar.f4365d, a3.b());
        }
        qbVar.f4364c.setText(obVar.f4249g);
        qbVar.f4365d.setText(obVar.f4250h);
        rb a4 = ((sb) com.startapp.sdk.components.a.a(getContext()).f3459R.a()).a(this.f4146b);
        Bitmap a5 = a4.f4391a.a(obVar.f4244a, i3, obVar.f4251i);
        if (a5 == null) {
            qbVar.f4363b.setImageResource(R.drawable.sym_def_app_icon);
            qbVar.f4363b.setTag("tag_error");
        } else {
            qbVar.f4363b.setImageBitmap(a5);
            qbVar.f4363b.setTag("tag_ok");
        }
        qbVar.f.setRating(obVar.f4252j);
        if (obVar.f4256n != null) {
            qbVar.f4366e.setText("Open");
        } else {
            qbVar.f4366e.setText("Download");
        }
        Context context = getContext();
        String[] strArr = obVar.f4246c;
        TrackingParams trackingParams = new TrackingParams(this.f4145a);
        Long l3 = obVar.o;
        long millis = l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().z());
        a9 a9Var = a4.f4391a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String m3 = strArr != null ? AbstractC0033i.m(new StringBuilder(), TextUtils.join("^", strArr), a4.f4393c) : null;
        if (a9Var.f3553c.containsKey(m3)) {
            return view2;
        }
        xf xfVar = new xf(context, placement, strArr, trackingParams, millis, false, null);
        a9Var.f3553c.put(m3, xfVar);
        xfVar.c();
        return view2;
    }
}
