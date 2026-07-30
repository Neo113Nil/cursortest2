package com.baidu.platform.comapi.walknavi.c;

import android.annotation.TargetApi;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.baidumapsdk_api.R;
import com.baidu.platform.comapi.h.t.e;
import com.baidu.platform.comapi.walknavi.c.c;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public int f9907g;

    /* renamed from: h, reason: collision with root package name */
    public String f9908h;

    /* renamed from: i, reason: collision with root package name */
    private String f9909i;

    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private int f9910a;

        public a(int i8) {
            this.f9910a = i8;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Object tag;
            if (view == null || (tag = view.getTag()) == null || !(tag instanceof c.a)) {
                return;
            }
            String item = b.this.getItem(this.f9910a) != null ? b.this.getItem(this.f9910a) : "";
            b bVar = b.this;
            bVar.f9908h = item;
            bVar.f9909i = "";
            b bVar2 = b.this;
            bVar2.f9907g = this.f9910a;
            e.a(item, bVar2.f9915d, true);
            b.this.notifyDataSetChanged();
        }
    }

    public b(ArrayList<String> arrayList) {
        super(arrayList);
        this.f9907g = -1;
    }

    public void b(String str) {
        this.f9909i = str;
    }

    @Override // android.widget.Adapter
    public View getView(int i8, View view, ViewGroup viewGroup) {
        c.a aVar;
        String item = getItem(i8);
        if (item == null) {
            return null;
        }
        if (view == null) {
            view = com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.layout.wsdk_bm_bar_item_indoor_a, null);
            view.setClickable(false);
            aVar = new c.a();
            aVar.f9920c = (TextView) view.findViewById(R.id.name);
            aVar.f9918a = view.findViewById(R.id.bar_item);
            aVar.f9919b = (ImageView) view.findViewById(R.id.indoor_loc_sanjiao);
            view.setTag(aVar);
        } else {
            aVar = (c.a) view.getTag();
        }
        a(i8, view, aVar);
        aVar.f9921d = null;
        aVar.f9922e = null;
        aVar.f9918a.setTag(aVar);
        aVar.f9918a.setOnClickListener(new a(i8));
        aVar.f9920c.setText(item);
        a(item, aVar, i8);
        return view;
    }

    private void a(String str, c.a aVar, int i8) {
        a(aVar);
        b(str, aVar, i8);
    }

    @TargetApi(16)
    private void b(String str, c.a aVar, int i8) {
        if (this.f9907g != i8) {
            aVar.f9920c.setTextColor(-13488081);
            return;
        }
        if (getCount() == 1) {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bmbar_all_bac_press));
        } else if (i8 == 0) {
            if (this.f9914c) {
                aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bmbar_middle_bac_press));
            } else {
                aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bmbar_up_bac_press));
            }
        } else if (i8 != getCount() - 1) {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bmbar_middle_bac_press));
        } else if (this.f9914c) {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bmbar_middle_bac_press));
        } else {
            aVar.f9918a.setBackground(com.baidu.platform.comapi.h.t.p.a.a(this.f9917f, R.drawable.wsdk_bmbar_down_bac_press));
        }
        aVar.f9920c.setTextColor(-1);
        this.f9908h = getItem(this.f9907g);
    }

    public void a(c.a aVar) {
        if (this.f9914c) {
            return;
        }
        aVar.f9920c.setTextSize(1, 9.0f);
    }

    public int a() {
        String str = this.f9909i;
        for (int i8 = 0; i8 < getCount(); i8++) {
            if (TextUtils.equals(str, getItem(i8))) {
                this.f9907g = i8;
            }
        }
        return this.f9907g;
    }
}
