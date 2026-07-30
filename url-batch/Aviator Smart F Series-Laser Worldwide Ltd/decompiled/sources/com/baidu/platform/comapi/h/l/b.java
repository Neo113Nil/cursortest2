package com.baidu.platform.comapi.h.l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.BitmapDescriptor;
import com.baidu.mapapi.map.BitmapDescriptorFactory;
import com.baidu.mapapi.map.ItemizedOverlay;
import com.baidu.mapapi.map.MarkerOptions;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.h.c;

/* loaded from: classes2.dex */
public class b extends ItemizedOverlay {

    /* renamed from: h, reason: collision with root package name */
    private View f9149h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f9150i;

    /* renamed from: j, reason: collision with root package name */
    private ImageView f9151j;

    /* renamed from: k, reason: collision with root package name */
    private Context f9152k;

    /* renamed from: com.baidu.platform.comapi.h.l.b$b, reason: collision with other inner class name */
    private static class C0109b {

        /* renamed from: a, reason: collision with root package name */
        static final b f9153a = new b();
    }

    public static b c() {
        return C0109b.f9153a;
    }

    public void a(Context context, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f9152k = context;
        Bundle bundle = new Bundle();
        removeAll();
        for (int i8 = 0; i8 < iArr.length; i8++) {
            bundle.putDouble("x", iArr[i8]);
            bundle.putDouble("y", iArr2[i8]);
            bundle.putInt("index", iArr3[i8]);
            a(context, bundle);
        }
    }

    private b() {
        super(null, com.baidu.platform.comapi.walknavi.b.n().t().e());
    }

    private void a(Context context, Bundle bundle) {
        double d8 = bundle.getDouble("x");
        double d9 = bundle.getDouble("y");
        int i8 = bundle.getInt("index");
        com.baidu.platform.comapi.h.g.a.c("tag", "addItem:lng:" + d8 + "lat:" + d9 + "index:" + i8);
        new GeoPoint(d9, d8);
        LatLng latLng = new LatLng(d9, d8);
        MarkerOptions markerOptions = new MarkerOptions();
        BitmapDescriptor a8 = a(context, i8);
        if (a8 != null) {
            markerOptions.icon(a8);
            markerOptions.position(latLng);
            addItem(markerOptions);
        }
    }

    private BitmapDescriptor a(Context context, int i8) {
        try {
            View inflate = ((Activity) context).getLayoutInflater().inflate(R.layout.wsdk_node_overlay, (ViewGroup) null);
            this.f9149h = inflate;
            this.f9150i = (TextView) inflate.findViewById(R.id.node_index_tv);
            this.f9151j = (ImageView) this.f9149h.findViewById(R.id.node_index_iv);
            if (c.b().c() == 2) {
                this.f9150i.setText(i8 + "");
            } else {
                this.f9150i.setText("途");
            }
            this.f9149h.setDrawingCacheEnabled(true);
            this.f9149h.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            View view = this.f9149h;
            view.layout(0, 0, view.getMeasuredWidth(), this.f9149h.getMeasuredHeight());
            this.f9149h.buildDrawingCache();
            return BitmapDescriptorFactory.fromBitmap(this.f9149h.getDrawingCache());
        } catch (Exception unused) {
            return null;
        }
    }
}
