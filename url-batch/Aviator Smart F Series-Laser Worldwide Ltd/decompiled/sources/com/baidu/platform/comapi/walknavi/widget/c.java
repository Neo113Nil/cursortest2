package com.baidu.platform.comapi.walknavi.widget;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.comapi.walknavi.k.f.b {

    /* renamed from: b, reason: collision with root package name */
    private Activity f10376b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f10377c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f10378d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f10379e;

    /* renamed from: f, reason: collision with root package name */
    private com.baidu.mapapi.walknavi.model.c f10380f;

    public void a(com.baidu.mapapi.walknavi.model.c cVar) {
        this.f10380f = cVar;
    }

    public void a(int i8, String str) {
        if (i8 == R.drawable.wn_gps_blue) {
            this.f10378d.setVisibility(8);
            this.f10379e.setVisibility(4);
        } else {
            this.f10378d.setVisibility(0);
        }
        if (com.baidu.platform.comapi.b.a.a.f8739a) {
            this.f10377c.setImageDrawable(com.baidu.platform.comapi.h.t.p.a.a(this.f10376b, i8));
        } else {
            this.f10377c.setImageResource(i8);
        }
        if ((i8 == R.drawable.wn_start_blue || i8 == R.drawable.wn_start_white) && "步行导航开始".equals(str)) {
            this.f10378d.setText("步行导航开始");
        } else {
            this.f10378d.setText(str);
        }
    }
}
