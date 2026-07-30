package com.baidu.mapsdkplatform.comapi.favrite;

import android.os.Bundle;
import android.text.TextUtils;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comjni.map.favorite.NAFavorite;
import com.moyoung.dafit.module.common.utils.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static a f8027a;

    /* renamed from: b, reason: collision with root package name */
    private NAFavorite f8028b = null;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8029c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8030d = false;

    /* renamed from: e, reason: collision with root package name */
    private Vector<String> f8031e = null;

    /* renamed from: f, reason: collision with root package name */
    private Vector<String> f8032f = null;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8033g = false;

    /* renamed from: h, reason: collision with root package name */
    private d f8034h;

    /* renamed from: i, reason: collision with root package name */
    private c f8035i;

    class b implements Comparator<String> {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            return str2.compareTo(str);
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        private long f8037a;

        /* renamed from: b, reason: collision with root package name */
        private long f8038b;

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            return this.f8038b - this.f8037a > 1000;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f8038b = System.currentTimeMillis();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            this.f8037a = System.currentTimeMillis();
        }
    }

    private class d {

        /* renamed from: a, reason: collision with root package name */
        private String f8040a;

        /* renamed from: b, reason: collision with root package name */
        private long f8041b;

        /* renamed from: c, reason: collision with root package name */
        private long f8042c;

        private d() {
            this.f8041b = 5000L;
            this.f8042c = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String a() {
            return this.f8040a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b() {
            return TextUtils.isEmpty(this.f8040a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str) {
            this.f8040a = str;
            this.f8042c = System.currentTimeMillis();
        }
    }

    private a() {
        this.f8034h = new d();
        this.f8035i = new c();
    }

    public static a f() {
        if (f8027a == null) {
            synchronized (a.class) {
                try {
                    if (f8027a == null) {
                        a aVar = new a();
                        f8027a = aVar;
                        aVar.g();
                    }
                } finally {
                }
            }
        }
        return f8027a;
    }

    private boolean g() {
        if (this.f8028b == null) {
            NAFavorite nAFavorite = new NAFavorite();
            this.f8028b = nAFavorite;
            if (nAFavorite.create() == 0) {
                this.f8028b = null;
                return false;
            }
            h();
            i();
        }
        return true;
    }

    private void h() {
        this.f8029c = false;
        this.f8030d = false;
    }

    private boolean i() {
        if (this.f8028b == null) {
            return false;
        }
        String str = SysOSUtil.getModuleFileName() + "/";
        this.f8028b.a(1);
        return this.f8028b.a(str, "fav_poi", "fifo", 10, 501, -1);
    }

    public static boolean j() {
        NAFavorite nAFavorite;
        a aVar = f8027a;
        return (aVar == null || (nAFavorite = aVar.f8028b) == null || !nAFavorite.saveCache()) ? false : true;
    }

    public synchronized int a(String str, FavSyncPoi favSyncPoi) {
        if (this.f8028b == null) {
            return 0;
        }
        if (str != null && !str.equals("") && favSyncPoi != null) {
            h();
            ArrayList<String> d8 = d();
            if ((d8 != null ? d8.size() : 0) + 1 > 500) {
                return -2;
            }
            if (d8 != null && d8.size() > 0) {
                Iterator<String> it = d8.iterator();
                while (it.hasNext()) {
                    FavSyncPoi b8 = b(it.next());
                    if (b8 != null && str.equals(b8.f8018b)) {
                        return -1;
                    }
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                favSyncPoi.f8018b = str;
                String valueOf = String.valueOf(System.currentTimeMillis());
                String str2 = valueOf + "_" + favSyncPoi.hashCode();
                favSyncPoi.f8024h = valueOf;
                favSyncPoi.f8017a = str2;
                jSONObject.put("bdetail", favSyncPoi.f8025i);
                jSONObject.put("uspoiname", favSyncPoi.f8018b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", favSyncPoi.f8019c.getDoubleX());
                jSONObject2.put("y", favSyncPoi.f8019c.getDoubleY());
                jSONObject.put(u.LANGUAGE_PT, jSONObject2);
                jSONObject.put("ncityid", favSyncPoi.f8021e);
                jSONObject.put("npoitype", favSyncPoi.f8023g);
                jSONObject.put("uspoiuid", favSyncPoi.f8022f);
                jSONObject.put("addr", favSyncPoi.f8020d);
                jSONObject.put("addtimesec", favSyncPoi.f8024h);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("Fav_Sync", jSONObject);
                jSONObject3.put("Fav_Content", favSyncPoi.f8026j);
                if (!this.f8028b.a(str2, jSONObject3.toString())) {
                    return 0;
                }
                h();
                return 1;
            } catch (JSONException unused) {
                return 0;
            } finally {
                j();
            }
        }
        return -1;
    }

    public void b() {
        a aVar = f8027a;
        if (aVar != null) {
            NAFavorite nAFavorite = aVar.f8028b;
            if (nAFavorite != null) {
                nAFavorite.b();
                f8027a.f8028b = null;
            }
            f8027a = null;
        }
    }

    public boolean c(String str) {
        return (this.f8028b == null || str == null || str.equals("") || !this.f8028b.b(str)) ? false : true;
    }

    public ArrayList<String> d() {
        if (this.f8028b == null) {
            return null;
        }
        if (this.f8029c && this.f8031e != null) {
            return new ArrayList<>(this.f8031e);
        }
        try {
            Bundle bundle = new Bundle();
            this.f8028b.a(bundle);
            String[] stringArray = bundle.getStringArray("rstString");
            if (stringArray != null) {
                Vector<String> vector = this.f8031e;
                if (vector == null) {
                    this.f8031e = new Vector<>();
                } else {
                    vector.clear();
                }
                for (String str : stringArray) {
                    if (!str.equals("data_version")) {
                        this.f8031e.add(str);
                    }
                }
                if (this.f8031e.size() > 0) {
                    try {
                        Collections.sort(this.f8031e, new b());
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f8029c = true;
                }
            } else {
                Vector<String> vector2 = this.f8031e;
                if (vector2 != null) {
                    vector2.clear();
                    this.f8031e = null;
                }
            }
            Vector<String> vector3 = this.f8031e;
            if (vector3 == null || vector3.size() == 0) {
                return null;
            }
            return new ArrayList<>(this.f8031e);
        } catch (Exception unused) {
            return null;
        }
    }

    public ArrayList<String> e() {
        String a8;
        if (this.f8028b == null) {
            return null;
        }
        if (this.f8030d && this.f8032f != null) {
            return new ArrayList<>(this.f8032f);
        }
        try {
            Bundle bundle = new Bundle();
            this.f8028b.a(bundle);
            String[] stringArray = bundle.getStringArray("rstString");
            if (stringArray != null) {
                Vector<String> vector = this.f8032f;
                if (vector == null) {
                    this.f8032f = new Vector<>();
                } else {
                    vector.clear();
                }
                for (int i8 = 0; i8 < stringArray.length; i8++) {
                    if (!stringArray[i8].equals("data_version") && (a8 = this.f8028b.a(stringArray[i8])) != null && !a8.equals("")) {
                        this.f8032f.add(stringArray[i8]);
                    }
                }
                if (this.f8032f.size() > 0) {
                    try {
                        Collections.sort(this.f8032f, new b());
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                    this.f8030d = true;
                }
            } else {
                Vector<String> vector2 = this.f8032f;
                if (vector2 != null) {
                    vector2.clear();
                    this.f8032f = null;
                }
            }
            Vector<String> vector3 = this.f8032f;
            if (vector3 != null && !vector3.isEmpty()) {
                return new ArrayList<>(this.f8032f);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public String c() {
        String a8;
        if (this.f8035i.a() && !this.f8034h.c() && !this.f8034h.b()) {
            return this.f8034h.a();
        }
        this.f8035i.c();
        if (this.f8028b == null) {
            return null;
        }
        ArrayList<String> e8 = e();
        JSONObject jSONObject = new JSONObject();
        if (e8 != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = e8.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    String next = it.next();
                    if (next != null && !next.equals("data_version") && (a8 = this.f8028b.a(next)) != null && !a8.equals("")) {
                        JSONObject optJSONObject = new JSONObject(a8).optJSONObject("Fav_Sync");
                        optJSONObject.put("key", next);
                        jSONArray.put(i8, optJSONObject);
                        i8++;
                    }
                }
                if (i8 > 0) {
                    jSONObject.put("favcontents", jSONArray);
                    jSONObject.put("favpoinum", i8);
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        this.f8035i.b();
        this.f8034h.a(jSONObject.toString());
        return this.f8034h.a();
    }

    public FavSyncPoi b(String str) {
        if (this.f8028b != null && str != null && !str.equals("")) {
            try {
                if (!c(str)) {
                    return null;
                }
                FavSyncPoi favSyncPoi = new FavSyncPoi();
                String a8 = this.f8028b.a(str);
                if (a8 != null && !a8.equals("")) {
                    JSONObject jSONObject = new JSONObject(a8);
                    JSONObject optJSONObject = jSONObject.optJSONObject("Fav_Sync");
                    String optString = jSONObject.optString("Fav_Content");
                    favSyncPoi.f8018b = optJSONObject.optString("uspoiname");
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject(u.LANGUAGE_PT);
                    favSyncPoi.f8019c = new Point(optJSONObject2.optInt("x"), optJSONObject2.optInt("y"));
                    favSyncPoi.f8021e = optJSONObject.optString("ncityid");
                    favSyncPoi.f8022f = optJSONObject.optString("uspoiuid");
                    favSyncPoi.f8023g = optJSONObject.optInt("npoitype");
                    favSyncPoi.f8020d = optJSONObject.optString("addr");
                    favSyncPoi.f8024h = optJSONObject.optString("addtimesec");
                    favSyncPoi.f8025i = optJSONObject.optBoolean("bdetail");
                    favSyncPoi.f8026j = optString;
                    favSyncPoi.f8017a = str;
                    return favSyncPoi;
                }
                return null;
            } catch (NullPointerException e8) {
                e8.printStackTrace();
            } catch (JSONException e9) {
                e9.printStackTrace();
                return null;
            }
        }
        return null;
    }

    public synchronized boolean b(String str, FavSyncPoi favSyncPoi) {
        boolean z7 = false;
        if (this.f8028b != null && str != null && !str.equals("") && favSyncPoi != null) {
            if (!c(str)) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uspoiname", favSyncPoi.f8018b);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", favSyncPoi.f8019c.getDoubleX());
                jSONObject2.put("y", favSyncPoi.f8019c.getDoubleY());
                jSONObject.put(u.LANGUAGE_PT, jSONObject2);
                jSONObject.put("ncityid", favSyncPoi.f8021e);
                jSONObject.put("npoitype", favSyncPoi.f8023g);
                jSONObject.put("uspoiuid", favSyncPoi.f8022f);
                jSONObject.put("addr", favSyncPoi.f8020d);
                String valueOf = String.valueOf(System.currentTimeMillis());
                favSyncPoi.f8024h = valueOf;
                jSONObject.put("addtimesec", valueOf);
                jSONObject.put("bdetail", false);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("Fav_Sync", jSONObject);
                jSONObject3.put("Fav_Content", favSyncPoi.f8026j);
                h();
                NAFavorite nAFavorite = this.f8028b;
                if (nAFavorite != null) {
                    if (nAFavorite.b(str, jSONObject3.toString())) {
                        z7 = true;
                    }
                }
                return z7;
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }

    public synchronized boolean a(String str) {
        if (this.f8028b == null) {
            return false;
        }
        if (str != null && !str.equals("")) {
            if (!c(str)) {
                return false;
            }
            h();
            return this.f8028b.c(str);
        }
        return false;
    }

    public synchronized boolean a() {
        if (this.f8028b == null) {
            return false;
        }
        h();
        boolean a8 = this.f8028b.a();
        j();
        return a8;
    }
}
