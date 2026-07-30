package com.baidu.platform.comapi.h.l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.ItemizedOverlay;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.walknavi.model.RouteGuideKind;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.walknavi.k.e.c;

/* loaded from: classes2.dex */
public class a extends ItemizedOverlay {

    /* renamed from: h, reason: collision with root package name */
    private View f9144h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f9145i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f9146j;

    /* renamed from: k, reason: collision with root package name */
    private Context f9147k;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        static final a f9148a = new a();
    }

    public static a c() {
        return b.f9148a;
    }

    public void a(Context context, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f9147k = context;
        Bundle bundle = new Bundle();
        removeAll();
        for (int i8 = 0; i8 < iArr.length; i8++) {
            bundle.putDouble("x", iArr[i8]);
            bundle.putDouble("y", iArr2[i8]);
            if (iArr3[i8] < RouteGuideKind.values().length) {
                int[] a8 = c.a(RouteGuideKind.values()[iArr3[i8]]);
                bundle.putInt("upResId", a8[0]);
                bundle.putInt("downResId", a8[1]);
                a(context, bundle);
            }
        }
    }

    private a() {
        super(null, com.baidu.platform.comapi.walknavi.b.n().t().e());
    }

    public void a(Context context, Bundle bundle) {
        double d8 = bundle.getDouble("x");
        double d9 = bundle.getDouble("y");
        int i8 = bundle.getInt("upResId");
        int i9 = bundle.getInt("downResId");
        new GeoPoint(d9, d8);
        LatLng latLng = new LatLng(d9, d8);
        MarkerOptions markerOptions = new MarkerOptions();
        BitmapDescriptor a8 = a(context, i8, i9);
        if (a8 != null) {
            markerOptions.icon(a8);
            markerOptions.position(latLng);
            addItem(markerOptions);
        }
    }

    private BitmapDescriptor a(Context context, int i8, int i9) {
        try {
            View inflate = ((Activity) context).getLayoutInflater().inflate(R.layout.wsdk_walk_type_overlay, (ViewGroup) null);
            this.f9144h = inflate;
            ImageView imageView = (ImageView) inflate.findViewById(R.id.node_index_iv_up);
            this.f9145i = imageView;
            imageView.setImageResource(i8);
            ImageView imageView2 = (ImageView) this.f9144h.findViewById(R.id.node_index_iv_down);
            this.f9146j = imageView2;
            imageView2.setImageResource(i9);
            this.f9144h.setDrawingCacheEnabled(true);
            this.f9144h.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = this.f9144h;
            view.layout(0, 0, view.getMeasuredWidth(), this.f9144h.getMeasuredHeight());
            this.f9144h.buildDrawingCache();
            return BitmapDescriptorFactory.fromBitmap(this.f9144h.getDrawingCache());
        } catch (Exception unused) {
            return null;
        }
    }
}
