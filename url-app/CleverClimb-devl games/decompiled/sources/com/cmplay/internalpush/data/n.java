package com.cmplay.internalpush.data;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.cmplay.internalpush.ipc.IpcCloudHelper;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ParseCloudDataBase.java */
/* loaded from: classes.dex */
public abstract class n implements com.cmplay.internalpush.a.a.a {
    protected Context i;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f4243b = false;

    /* renamed from: c, reason: collision with root package name */
    protected CopyOnWriteArrayList<c> f4244c = new CopyOnWriteArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    protected ArrayList<i> f4245d = new ArrayList<>();
    protected List<c> e = new ArrayList();
    protected List<c> f = new ArrayList();
    protected List<l> g = new ArrayList();
    protected c h = null;
    protected boolean j = false;
    protected String k = "";

    public abstract String a();

    public CopyOnWriteArrayList<c> b() {
        i();
        return this.f4244c;
    }

    public ArrayList<c> a(String str, boolean z) {
        int i;
        ArrayList<c> arrayList;
        if (this instanceof m) {
            i = 1;
        } else if (this instanceof o) {
            i = 2;
        } else if (this instanceof p) {
            i = 3;
        } else if (this instanceof ParseCloudDataVideo) {
            i = 4;
        } else if (this instanceof com.cmplay.internalpush.data.a) {
            i = 5;
        } else if (this instanceof j) {
            i = 6;
        } else if (this instanceof b) {
            i = 7;
        } else {
            i = this instanceof SmallVideoParseCloudData ? 8 : 0;
        }
        ArrayList<c> arrayList2 = new ArrayList<>();
        int i2 = ((this instanceof ParseCloudDataVideo) || (this instanceof SmallVideoParseCloudData) || (this instanceof SmallVideoSettingParseCloudData)) ? 1 : 2;
        if (TextUtils.isEmpty(str)) {
            if (!z) {
                return arrayList2;
            }
            boolean innpush_isPullDataFromServer = IpcCloudHelper.getInstance().innpush_isPullDataFromServer();
            String encode = innpush_isPullDataFromServer ? Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")) : "";
            com.cmplay.internalpush.o.a().a(i, 23, "", 0L, encode, 0, 0, 0L);
            com.cmplay.base.util.h.a("internal_push", "没有json数据   isHavePullDataFromServer:" + innpush_isPullDataFromServer + "   maigcUrl:" + encode);
            return arrayList2;
        }
        try {
            JSONArray jSONArray = new JSONObject(str).getJSONArray("data");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                c cVar = new c();
                JSONObject jSONObject = jSONArray.getJSONObject(i3);
                cVar.a(jSONObject.optLong(com.umeng.analytics.pro.b.p));
                cVar.b(jSONObject.optLong(com.umeng.analytics.pro.b.q));
                cVar.a(jSONObject.optInt("show_times"));
                cVar.c(jSONObject.optLong("interval_time"));
                cVar.b(jSONObject.optString("pro_name"));
                cVar.d(jSONObject.optLong("pro_id"));
                cVar.e(jSONObject.optInt("pro_priority"));
                cVar.b(jSONObject.optInt("rotation_times"));
                cVar.b(jSONObject.optBoolean("click_dis"));
                cVar.c(jSONObject.optString("bg_img"));
                cVar.e(jSONObject.optString("button_img"));
                cVar.f(jSONObject.optString("button_img2"));
                cVar.p(jSONObject.optInt("show_type"));
                cVar.t(jSONObject.optString("playable_url"));
                cVar.a(jSONObject.optBoolean("button_moving"));
                cVar.i(jSONObject.optString("pkg_name"));
                cVar.j(jSONObject.optString("jump_url"));
                cVar.c(jSONObject.optInt("jump_type"));
                cVar.h(jSONObject.optInt("new_player"));
                cVar.a(jSONObject.optString("default_jump_url"));
                cVar.f(jSONObject.optInt("pro_type"));
                cVar.k(jSONObject.optString("icon_url"));
                cVar.m(jSONObject.optString(TJAdUnitConstants.String.TITLE));
                cVar.n(jSONObject.optString(FacebookAdapter.KEY_SUBTITLE_ASSET));
                cVar.g(jSONObject.optInt("reward_counts"));
                cVar.o(jSONObject.optString("video_url"));
                cVar.i(jSONObject.optInt("video_width"));
                cVar.j(jSONObject.optInt("video_height"));
                cVar.g(jSONObject.optLong("comment_star"));
                cVar.q(jSONObject.optString("downloads"));
                cVar.k(jSONObject.optInt("shield_time"));
                cVar.r(jSONObject.optString("button_txt"));
                cVar.s(jSONObject.optString("button_txt2"));
                cVar.a(jSONObject.isNull("percentage") ? 0.0d : jSONObject.getDouble("percentage"));
                cVar.l(jSONObject.optInt("display_type"));
                cVar.m(jSONObject.optInt("priority_reddot"));
                cVar.n(jSONObject.optInt("show_by_startup"));
                cVar.d(jSONObject.optBoolean("ad_tag_show"));
                if (!jSONObject.isNull("day_limit")) {
                    cVar.q(jSONObject.getInt("day_limit"));
                } else {
                    cVar.q(i2);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray(com.umeng.commonsdk.proguard.d.M);
                if (optJSONArray != null) {
                    for (int i4 = 0; i4 < optJSONArray.length(); i4++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i4);
                        k kVar = new k();
                        kVar.f4232a = jSONObject2.optString("cl");
                        kVar.f4233b = jSONObject2.optString(TJAdUnitConstants.String.TITLE);
                        kVar.f4234c = jSONObject2.optString(FacebookAdapter.KEY_SUBTITLE_ASSET);
                        cVar.T().add(kVar);
                    }
                }
                String optString = jSONObject.optString("appstore");
                if (!TextUtils.isEmpty(optString)) {
                    JSONArray jSONArray2 = new JSONArray(optString);
                    for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i5);
                        cVar.a(new com.cmplay.base.util.b(jSONObject3.optString("pkg"), jSONObject3.optString("market")));
                    }
                }
                arrayList2.add(cVar);
            }
            if (!z) {
                return arrayList2;
            }
            arrayList = arrayList2;
            try {
                com.cmplay.internalpush.o.a().a(i, 20, "", 0L, "", 0, 0, 0L);
                return arrayList;
            } catch (JSONException e) {
                e = e;
                if (z) {
                    com.cmplay.internalpush.o.a().a(i, 15, "", 0L, Uri.encode(IpcCloudHelper.getInstance().innpush_getUrl("")), 0, 0, 0L);
                }
                e.printStackTrace();
                return arrayList;
            }
        } catch (JSONException e2) {
            e = e2;
            arrayList = arrayList2;
        }
    }

    public void a(String str) {
        ArrayList<c> a2 = a(str, true);
        Collections.sort(a2, new a());
        this.f4244c.clear();
        this.f4244c.addAll(a2);
        h();
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ArrayList<c> a2 = a(str, true);
        a2.addAll(this.f4244c);
        Collections.sort(a2, new a());
        this.f4244c.clear();
        this.f4244c.addAll(a2);
        h();
    }

    /* compiled from: ParseCloudDataBase.java */
    class a implements Comparator<c> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            if (cVar == null || cVar2 == null) {
                return 0;
            }
            if (cVar.i() > cVar2.i()) {
                return -1;
            }
            return cVar.i() == cVar2.i() ? 0 : 1;
        }
    }

    public void h() {
        for (int i = 0; i < this.f4244c.size(); i++) {
            c cVar = this.f4244c.get(i);
            if (cVar != null && cVar.Y()) {
                this.f4244c.remove(i);
                this.f4244c.add(0, cVar);
                this.f.add(cVar);
            }
        }
    }

    public void a(long j, int i) {
        long a2 = com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + a(), 0L);
        boolean a3 = com.cmplay.internalpush.a.b.a(a2);
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null && next.h() == j) {
                switch (i) {
                    case 1:
                        next.f(System.currentTimeMillis());
                        next.d(next.u() + 1);
                        next.e(next.x() + 1);
                        if (next.Y()) {
                            if (!a3) {
                                next.r(0);
                                com.cmplay.base.util.h.a("internal_push", "updateShowedStatus  不是相同自然天，重置爆款当天展示次     lastShowHitTopTime:" + a2);
                            }
                            next.r(next.X() + 1);
                        }
                        if (!(this instanceof m)) {
                            break;
                        } else if (next.Y()) {
                            com.cmplay.internalpush.a.d.b("hit_top_launch_time", 0);
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataBase.updateShowedStatus  HIT_TOP_LAUNCH_TIME reset  curLaunchTime:" + com.cmplay.internalpush.a.d.a("hit_top_launch_time", 0));
                            break;
                        } else {
                            com.cmplay.internalpush.a.d.b("launch_time", 0);
                            com.cmplay.base.util.h.a("internal_push", "ParseCloudDataBase.updateShowedStatus  LAUNCH_TIME reset  curLaunchTime:" + com.cmplay.internalpush.a.d.a("launch_time", 0));
                            break;
                        }
                    case 2:
                        next.c(true);
                        break;
                }
            }
        }
        a(this.f4244c);
    }

    public void i() {
        long a2 = com.cmplay.internalpush.a.d.a("last_show_hit_top_time" + a(), 0L);
        boolean a3 = com.cmplay.internalpush.a.b.a(a2);
        this.f4245d.clear();
        this.f4245d = j();
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            Iterator<i> it2 = this.f4245d.iterator();
            while (it2.hasNext()) {
                i next2 = it2.next();
                if (next != null && next2 != null && next.h() == next2.a()) {
                    next.c(next2.d());
                    next.d(next2.b());
                    next.f(next2.c());
                    next.e(next2.e());
                    next.o(next2.f());
                    if (!a3) {
                        next2.d(0);
                        com.cmplay.base.util.h.a("internal_push", "synShowedStatusToInfoList  不是相同自然天，重置爆款当天展示次     lastShowHitTopTime:" + a2);
                    }
                    next.r(next2.g());
                }
            }
        }
    }

    public void a(CopyOnWriteArrayList<c> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(copyOnWriteArrayList);
        int size = arrayList.size();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < size) {
            c cVar = (c) arrayList.get(i);
            if (cVar != null) {
                try {
                    sb.append(String.format(i == 0 ? "%d|%d|%d|%d|%d|%d|%d" : ";%d|%d|%d|%d|%d|%d|%d", Long.valueOf(cVar.h()), Integer.valueOf(cVar.w() ? 1 : 0), Integer.valueOf(cVar.u()), Long.valueOf(cVar.v()), Integer.valueOf(cVar.x()), Integer.valueOf(cVar.P()), Integer.valueOf(cVar.X())));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            i++;
        }
        com.cmplay.base.util.h.a("internal_push", "savePromotionStatus:" + sb.toString());
        com.cmplay.internalpush.a.d.b("promotion_app_status" + a(), sb.toString());
    }

    public ArrayList<i> j() {
        ArrayList<i> arrayList = new ArrayList<>();
        String a2 = com.cmplay.internalpush.a.d.a("promotion_app_status" + a(), "");
        if (!TextUtils.isEmpty(a2)) {
            com.cmplay.base.util.h.a("internal_push", "parsePromotionStatus strStatus=" + a2);
            for (String str : a2.split(";")) {
                String[] split = str.split("\\|");
                i iVar = new i();
                for (int i = 0; i < split.length; i++) {
                    if (i == 0) {
                        try {
                            iVar.a(Long.parseLong(split[i]));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    boolean z = true;
                    if (1 == i) {
                        if (1 != Integer.parseInt(split[i])) {
                            z = false;
                        }
                        iVar.a(z);
                    }
                    if (2 == i) {
                        iVar.a(Integer.parseInt(split[i]));
                    }
                    if (3 == i) {
                        iVar.b(Long.parseLong(split[i]));
                    }
                    if (4 == i) {
                        iVar.b(Integer.parseInt(split[i]));
                    }
                    if (5 == i) {
                        iVar.c(Integer.parseInt(split[i]));
                    }
                    if (6 == i) {
                        iVar.d(Integer.parseInt(split[i]));
                    }
                }
                arrayList.add(iVar);
            }
        }
        return arrayList;
    }

    public void k() {
        this.h = null;
        com.cmplay.base.util.h.a("internal_push", "resetCurShowInfo()");
    }

    public boolean a(long j, String str) {
        Iterator<c> it = this.f4244c.iterator();
        boolean z = false;
        while (it.hasNext()) {
            c next = it.next();
            if (next != null && next.h() == j) {
                next.p(str);
                z = true;
            }
        }
        return z;
    }

    public void a(long j) {
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null && next.h() == j) {
                next.f(true);
            }
        }
    }

    public void l() {
        Iterator<c> it = this.f4244c.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next != null) {
                next.f(false);
            }
        }
    }

    public void a(c cVar, int i) {
        String l;
        int i2;
        if (cVar == null) {
            return;
        }
        switch (i) {
            case 8:
                l = cVar.l();
                i2 = 1;
                break;
            case 9:
                l = cVar.n();
                i2 = 2;
                break;
            case 11:
                l = cVar.y();
                i2 = 3;
                break;
            case 12:
            case 1001:
                l = cVar.F();
                i2 = 4;
                break;
            default:
                l = "";
                i2 = 0;
                break;
        }
        if (i2 > 0) {
            this.g.add(new l(cVar.h(), cVar.r(), l, cVar.i(), i2));
        }
    }

    public void a(int i) {
        for (l lVar : this.g) {
            if (lVar != null) {
                com.cmplay.internalpush.o.a().a(i, 14, lVar.f4236b, lVar.f4235a, Uri.encode(lVar.f4237c), lVar.e, 0, lVar.f4238d);
            }
        }
    }
}
