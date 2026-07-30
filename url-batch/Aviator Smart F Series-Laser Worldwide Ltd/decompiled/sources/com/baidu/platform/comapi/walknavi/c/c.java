package com.baidu.platform.comapi.walknavi.c;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class c extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f9912a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f9913b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9914c;

    /* renamed from: d, reason: collision with root package name */
    public String f9915d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f9916e;

    /* renamed from: f, reason: collision with root package name */
    protected Activity f9917f;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public View f9918a;

        /* renamed from: b, reason: collision with root package name */
        public ImageView f9919b;

        /* renamed from: c, reason: collision with root package name */
        public TextView f9920c;

        /* renamed from: d, reason: collision with root package name */
        public String f9921d;

        /* renamed from: e, reason: collision with root package name */
        public String f9922e;
    }

    public c(ArrayList<String> arrayList) {
        Activity activity = (Activity) com.baidu.platform.comapi.walknavi.b.n().f();
        this.f9917f = activity;
        if (activity != null) {
            this.f9913b = (LayoutInflater) activity.getSystemService("layout_inflater");
        }
        this.f9912a = arrayList;
    }

    public void a(String str) {
        this.f9915d = str;
    }

    public void b(boolean z7) {
        this.f9916e = z7;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList<String> arrayList = this.f9912a;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i8) {
        return i8;
    }

    public void a(boolean z7) {
        this.f9914c = z7;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getItem(int i8) {
        ArrayList<String> arrayList = this.f9912a;
        if (arrayList == null || arrayList.size() <= i8 || i8 < 0) {
            return null;
        }
        return this.f9912a.get(i8);
    }

    @TargetApi(16)
    public void a(int i8, View view, a aVar) {
        if (getCount() == 1) {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bar_item_all_bac));
            return;
        }
        if (i8 == 0) {
            if (this.f9914c && this.f9916e) {
                aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bar_item_middle_bac));
                return;
            } else {
                aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bar_item_up_bac));
                return;
            }
        }
        if (i8 != getCount() - 1) {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bar_item_middle_bac));
        } else if (this.f9914c && this.f9916e) {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bar_item_middle_bac));
        } else {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bar_item_down_bac));
        }
    }
}
