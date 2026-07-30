package com.baidu.platform.comapi.walknavi.k.d;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.baidu.baidumapsdk_api.R;
import com.baidu.mapapi.map.MapBaseIndoorMapInfo;
import com.baidu.platform.comapi.h.t.h;
import com.baidu.platform.comapi.walknavi.c.b;
import com.baidu.platform.comapi.walknavi.k.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private ViewGroup f10188a;

    /* renamed from: b, reason: collision with root package name */
    private LinearLayout f10189b;

    /* renamed from: c, reason: collision with root package name */
    private View f10190c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f10191d;

    /* renamed from: e, reason: collision with root package name */
    private View f10192e;

    /* renamed from: f, reason: collision with root package name */
    private View f10193f;

    /* renamed from: g, reason: collision with root package name */
    private Activity f10194g;

    /* renamed from: h, reason: collision with root package name */
    private final c f10195h;

    public a(ViewGroup viewGroup, Activity activity, c cVar) {
        this.f10188a = viewGroup;
        this.f10194g = activity;
        this.f10195h = cVar;
    }

    public void a() {
        this.f10189b.setVisibility(8);
    }

    public void b() {
        this.f10189b = (LinearLayout) this.f10188a.findViewById(R.id.indoor_bar_container);
        if (this.f10190c == null) {
            this.f10190c = com.baidu.platform.comapi.h.t.p.a.a(this.f10194g, R.layout.wsdk_layout_indoor_bar, null);
        }
        this.f10192e = this.f10190c.findViewById(R.id.up_scroll);
        this.f10193f = this.f10190c.findViewById(R.id.down_scroll);
        this.f10189b.addView(this.f10190c);
        this.f10191d = (ListView) this.f10190c.findViewById(R.id.bar_a_list);
    }

    public void c() {
        if (this.f10189b == null || !com.baidu.platform.comapi.h.c.b().d()) {
            return;
        }
        this.f10189b.setVisibility(8);
    }

    public void a(MapBaseIndoorMapInfo mapBaseIndoorMapInfo) {
        if (mapBaseIndoorMapInfo == null) {
            return;
        }
        String id = mapBaseIndoorMapInfo.getID();
        String curFloor = mapBaseIndoorMapInfo.getCurFloor();
        int i8 = 0;
        this.f10189b.setVisibility(0);
        ArrayList<String> floors = mapBaseIndoorMapInfo.getFloors();
        if (floors == null || floors.size() == 0) {
            return;
        }
        this.f10191d.setLayoutParams(a(floors, this.f10191d, this.f10191d.getLayoutParams()));
        b bVar = new b(floors);
        if (floors.size() > 3) {
            bVar.b(true);
            View view = this.f10192e;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f10193f;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        } else {
            bVar.b(false);
            View view3 = this.f10192e;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.f10193f;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }
        bVar.a(true);
        bVar.a(id);
        bVar.b(curFloor);
        this.f10191d.setAdapter((ListAdapter) bVar);
        int a8 = bVar.a();
        if (a8 >= this.f10191d.getLastVisiblePosition()) {
            i8 = a8 + 2;
            if (i8 >= bVar.getCount() - 1) {
                i8 = bVar.getCount() - 1;
            }
        } else if (a8 > this.f10191d.getFirstVisiblePosition() || a8 - 2 > 0) {
            i8 = a8;
        }
        bVar.notifyDataSetChanged();
        this.f10191d.setSelection(i8);
    }

    public void a(String str) {
        int i8 = 0;
        this.f10189b.setVisibility(0);
        b bVar = (b) this.f10191d.getAdapter();
        if (bVar == null) {
            return;
        }
        bVar.b(str);
        int a8 = bVar.a();
        if (a8 >= this.f10191d.getLastVisiblePosition()) {
            i8 = a8 + 2;
            if (i8 >= bVar.getCount() - 1) {
                i8 = bVar.getCount() - 1;
            }
        } else if (a8 > this.f10191d.getFirstVisiblePosition() || a8 - 2 > 0) {
            i8 = a8;
        }
        bVar.notifyDataSetChanged();
        this.f10191d.setSelection(i8);
    }

    private ViewGroup.LayoutParams a(List<String> list, View view, ViewGroup.LayoutParams layoutParams) {
        if (list != null) {
            if (list.size() > 5) {
                layoutParams.height = h.a(this.f10194g, 185);
            } else {
                layoutParams.height = h.a(this.f10194g, (list.size() * 37) - 2);
            }
        }
        return layoutParams;
    }
}
