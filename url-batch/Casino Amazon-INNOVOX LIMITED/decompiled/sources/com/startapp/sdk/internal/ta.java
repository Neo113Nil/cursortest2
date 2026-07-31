package com.startapp.sdk.internal;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.startapp.sdk.ads.list3d.List3DActivity;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ta extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final String f438a;
    public final String b;

    public ta(List3DActivity list3DActivity, List list, String str, String str2) {
        super(list3DActivity, 0, list);
        this.f438a = str;
        this.b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        xa xaVar;
        if (view == null) {
            xaVar = new xa(getContext());
            view2 = xaVar.f495a;
        } else {
            view2 = view;
            xaVar = (xa) view.getTag();
        }
        va vaVar = (va) getItem(i);
        MetaDataStyle a2 = AdsCommonMetaData.k().a(vaVar.q);
        if (xaVar.g != a2) {
            xaVar.g = a2;
            xaVar.f495a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a2.e().intValue(), a2.d().intValue()}));
            xaVar.c.setTextSize(a2.h().intValue());
            xaVar.c.setTextColor(a2.f().intValue());
            ph.a(xaVar.c, a2.g());
            xaVar.d.setTextSize(a2.c().intValue());
            xaVar.d.setTextColor(a2.a().intValue());
            ph.a(xaVar.d, a2.b());
        }
        xaVar.c.setText(vaVar.g);
        xaVar.d.setText(vaVar.h);
        ya a3 = ((za) com.startapp.sdk.components.a.a(getContext()).Q.a()).a(this.b);
        Bitmap a4 = a3.f508a.a(vaVar.f466a, i, vaVar.i);
        ImageView imageView = xaVar.b;
        if (a4 == null) {
            imageView.setImageResource(R.drawable.sym_def_app_icon);
            xaVar.b.setTag("tag_error");
        } else {
            imageView.setImageBitmap(a4);
            xaVar.b.setTag("tag_ok");
        }
        xaVar.f.setRating(vaVar.j);
        boolean z = vaVar.n != null;
        TextView textView = xaVar.e;
        if (z) {
            textView.setText("Open");
        } else {
            textView.setText("Download");
        }
        Context context = getContext();
        String[] strArr = vaVar.c;
        TrackingParams trackingParams = new TrackingParams(this.f438a);
        Long l = vaVar.o;
        long millis = l != null ? TimeUnit.SECONDS.toMillis(l.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.A().w());
        l8 l8Var = a3.f508a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String str = strArr != null ? TextUtils.join("^", strArr) + a3.c : null;
        if (l8Var.c.containsKey(str)) {
            return view2;
        }
        ff ffVar = new ff(context, placement, strArr, trackingParams, millis, false, null);
        l8Var.c.put(str, ffVar);
        ffVar.c();
        return view2;
    }
}
