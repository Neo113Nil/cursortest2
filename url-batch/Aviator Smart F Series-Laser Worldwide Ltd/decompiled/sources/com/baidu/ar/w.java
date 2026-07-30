package com.baidu.ar;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.c0;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.digital.IDigital;
import com.baidu.ar.filter.FilterNode;
import com.baidu.ar.filter.FilterParam;
import com.baidu.ar.libloader.ILibLoader;
import com.baidu.ar.lua.LuaMsgListener;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import com.google.android.gms.actions.SearchIntents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class w {
    public r1 A;

    /* renamed from: a, reason: collision with root package name */
    public Context f3552a;

    /* renamed from: b, reason: collision with root package name */
    public Looper f3553b;

    /* renamed from: c, reason: collision with root package name */
    public h f3554c;

    /* renamed from: d, reason: collision with root package name */
    public DefaultParams f3555d;

    /* renamed from: e, reason: collision with root package name */
    public x8 f3556e;

    /* renamed from: f, reason: collision with root package name */
    public r3 f3557f;

    /* renamed from: g, reason: collision with root package name */
    public com.baidu.ar.arrender.a f3558g;

    /* renamed from: h, reason: collision with root package name */
    public g3 f3559h;

    /* renamed from: i, reason: collision with root package name */
    public e6 f3560i;

    /* renamed from: m, reason: collision with root package name */
    public ARProxyManager f3564m;

    /* renamed from: n, reason: collision with root package name */
    public List<Integer> f3565n;

    /* renamed from: o, reason: collision with root package name */
    public s3 f3566o;

    /* renamed from: p, reason: collision with root package name */
    public List<String> f3567p;

    /* renamed from: q, reason: collision with root package name */
    public LuaMsgListener f3568q;

    /* renamed from: r, reason: collision with root package name */
    public List<String> f3569r;

    /* renamed from: s, reason: collision with root package name */
    public LuaMsgListener f3570s;

    /* renamed from: u, reason: collision with root package name */
    public final List<String> f3572u;

    /* renamed from: v, reason: collision with root package name */
    public List<String> f3573v;

    /* renamed from: w, reason: collision with root package name */
    public y f3574w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3575x;

    /* renamed from: y, reason: collision with root package name */
    public com.baidu.ar.g f3576y;

    /* renamed from: z, reason: collision with root package name */
    public c0.b f3577z;

    /* renamed from: j, reason: collision with root package name */
    public ConcurrentHashMap<String, String> f3561j = new ConcurrentHashMap<>();

    /* renamed from: k, reason: collision with root package name */
    public ConcurrentHashMap<String, String> f3562k = new ConcurrentHashMap<>();

    /* renamed from: l, reason: collision with root package name */
    public ConcurrentHashMap<String, c0> f3563l = new ConcurrentHashMap<>();

    /* renamed from: t, reason: collision with root package name */
    public List<String> f3571t = new ArrayList();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (w.this.f3576y != null) {
                w.this.f3576y.g();
            }
        }
    }

    public class b implements ILibLoader.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f3579a;

        public b(List list) {
            this.f3579a = list;
        }

        @Override // com.baidu.ar.libloader.ILibLoader.a
        public void a(ARType aRType, String str, String str2) {
            w.this.f3572u.addAll(w.this.f3571t);
            String str3 = (String) w.this.f3561j.get("ability_face_filter");
            if (TextUtils.isEmpty(str3) || w.this.f3554c == null) {
                return;
            }
            if (w.this.f3563l.get(str3) == null) {
                w.this.f3554c.sendMessage(w.this.f3554c.obtainMessage(1001, new j(w.this, str3, (List<String>) this.f3579a, true, (HashMap<String, Object>) null)));
            } else {
                ((c0) w.this.f3563l.get(str3)).b();
                ((c0) w.this.f3563l.get(str3)).a(this.f3579a);
            }
        }

        @Override // com.baidu.ar.libloader.ILibLoader.a
        public void a(DuMixErrorType duMixErrorType, String str) {
            com.baidu.ar.h.b("AbilityManager", "startDefaultFaceAbility error!!! errorType = " + duMixErrorType.toString() + " && error message = " + str);
        }
    }

    public class c implements s3 {
        public c() {
        }

        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            return w.this.f3565n;
        }

        @Override // com.baidu.ar.s3
        public void a(int i8, int i9, HashMap<String, Object> hashMap) {
            w.this.a(i8, hashMap);
        }
    }

    public class d implements LuaMsgListener {
        public d() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return w.this.f3567p;
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            w.this.b(hashMap);
        }
    }

    public class e implements LuaMsgListener {
        public e() {
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public List<String> getMsgKeyListened() {
            return w.this.f3569r;
        }

        @Override // com.baidu.ar.lua.LuaMsgListener
        public void onLuaMessage(HashMap<String, Object> hashMap) {
            w.this.a(hashMap);
            w.this.c(hashMap);
        }
    }

    public class f implements c0.b {
        public f() {
        }

        @Override // com.baidu.ar.c0.b
        public boolean a(String str, e3 e3Var) {
            if (w.this.f3562k == null || !w.this.f3562k.containsKey(str)) {
                return false;
            }
            String str2 = (String) w.this.f3562k.get(str);
            if (TextUtils.isEmpty(str2) || w.this.f3554c == null) {
                return false;
            }
            w.this.f3554c.sendMessage(w.this.f3554c.obtainMessage(1003, new k(w.this, str2, str, e3Var)));
            return true;
        }
    }

    public class g implements r1 {
        public g() {
        }

        @Override // com.baidu.ar.r1
        public void a(boolean z7) {
            Iterator it = w.this.f3563l.values().iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(z7);
            }
        }
    }

    public class h extends Handler {
        public h(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            try {
                switch (message.what) {
                    case 1001:
                        j jVar = (j) message.obj;
                        w.this.a(jVar.f3589a, jVar.f3590b, jVar.f3591c, jVar.f3592d, jVar.f3593e, jVar.f3594f);
                        break;
                    case 1002:
                        i iVar = (i) message.obj;
                        w.this.a(iVar.f3587a, iVar.f3588b);
                        break;
                    case 1003:
                        k kVar = (k) message.obj;
                        w.this.a(kVar.f3595a, kVar.f3596b, kVar.f3597c);
                        break;
                }
            } catch (Exception e8) {
                com.baidu.ar.h.b("AbilityManager", "handleMessage Exception: " + e8.getMessage());
                e8.printStackTrace();
            }
        }
    }

    public class i {

        /* renamed from: a, reason: collision with root package name */
        public String f3587a;

        /* renamed from: b, reason: collision with root package name */
        public HashMap<String, Object> f3588b;

        public i(w wVar, String str, HashMap<String, Object> hashMap) {
            this.f3587a = str;
            this.f3588b = hashMap;
        }
    }

    public class j {

        /* renamed from: a, reason: collision with root package name */
        public String f3589a;

        /* renamed from: b, reason: collision with root package name */
        public List<String> f3590b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f3591c;

        /* renamed from: d, reason: collision with root package name */
        public HashMap<String, Object> f3592d;

        /* renamed from: e, reason: collision with root package name */
        public String f3593e;

        /* renamed from: f, reason: collision with root package name */
        public e3 f3594f;

        public j(w wVar, String str, String str2, boolean z7, HashMap<String, Object> hashMap) {
            this.f3589a = str;
            ArrayList arrayList = new ArrayList();
            this.f3590b = arrayList;
            arrayList.add(str2);
            this.f3591c = z7;
            this.f3592d = hashMap;
        }

        public j(w wVar, String str, List<String> list, boolean z7, HashMap<String, Object> hashMap) {
            this.f3589a = str;
            this.f3590b = list;
            this.f3591c = z7;
            this.f3592d = hashMap;
        }
    }

    public class k {

        /* renamed from: a, reason: collision with root package name */
        public String f3595a;

        /* renamed from: b, reason: collision with root package name */
        public String f3596b;

        /* renamed from: c, reason: collision with root package name */
        public e3 f3597c;

        public k(w wVar, String str) {
            this.f3595a = str;
        }

        public k(w wVar, String str, String str2, e3 e3Var) {
            this.f3595a = str;
            this.f3596b = str2;
            this.f3597c = e3Var;
        }
    }

    public w(Context context, Looper looper, DefaultParams defaultParams, y yVar, com.baidu.ar.g gVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f3572u = copyOnWriteArrayList;
        this.f3573v = new ArrayList();
        this.f3575x = true;
        this.f3552a = context;
        this.f3553b = looper;
        this.f3554c = new h(looper);
        this.f3555d = defaultParams;
        h(defaultParams.getMdlAlgoModelPath());
        this.f3564m = new ARProxyManager();
        this.f3574w = yVar;
        this.f3576y = gVar;
        h();
        copyOnWriteArrayList.add("ability_common_filter");
        b();
    }

    public final c0 a(String str) {
        c0 c0Var = (c0) ab.a(str);
        if (c0Var == null) {
            com.baidu.ar.h.b("AbilityManager", "createARAbility error!!!");
            return null;
        }
        this.f3563l.put(str, c0Var);
        c0Var.a(this.f3552a, this.f3553b);
        c0Var.a(this.f3559h, this.f3558g, this.f3576y);
        c0Var.a(this.f3557f);
        c0Var.a(this.f3560i);
        c0Var.a(this.f3577z);
        y yVar = this.f3574w;
        if (yVar != null) {
            c0Var.a(yVar.d());
        }
        ARProxyManager aRProxyManager = this.f3564m;
        if (aRProxyManager != null && aRProxyManager.c(str)) {
            this.f3564m.a(c0Var, str);
        }
        return c0Var;
    }

    public ARProxyManager d() {
        return this.f3564m;
    }

    public List<String> e() {
        return this.f3572u;
    }

    public final List<String> f() {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f3571t.iterator();
        while (it.hasNext()) {
            String str = this.f3561j.get(it.next());
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public void k() {
        ARProxyManager aRProxyManager = this.f3564m;
        if (aRProxyManager != null) {
            aRProxyManager.a();
            this.f3564m = null;
        }
        Iterator<c0> it = this.f3563l.values().iterator();
        while (it.hasNext()) {
            it.next().release();
        }
        this.f3563l.clear();
        this.f3561j.clear();
        r3 r3Var = this.f3557f;
        if (r3Var != null && r3Var.d() != null) {
            this.f3557f.b(this.f3566o);
            this.f3557f.d().b(this.f3568q);
            this.f3557f.d().b(this.f3570s);
            this.f3557f = null;
            this.f3566o = null;
            this.f3568q = null;
            this.f3570s = null;
        }
        this.f3565n = null;
        this.f3567p = null;
        this.f3569r = null;
        e6 e6Var = this.f3560i;
        if (e6Var != null) {
            e6Var.destroy();
            this.f3560i = null;
        }
        g3 g3Var = this.f3559h;
        if (g3Var != null) {
            g3Var.a();
            this.f3559h = null;
        }
        List<String> list = this.f3573v;
        if (list != null) {
            list.clear();
            this.f3573v = null;
        }
        this.f3552a = null;
        this.f3553b = null;
        this.f3555d = null;
        this.f3556e = null;
        this.f3576y = null;
        this.f3558g = null;
        if (this.f3574w != null) {
            this.f3574w = null;
        }
    }

    public void l() {
        ARProxyManager aRProxyManager = this.f3564m;
        if (aRProxyManager != null) {
            aRProxyManager.b();
        }
        ArrayList<String> arrayList = new ArrayList();
        List<String> f8 = f();
        for (String str : this.f3572u) {
            String str2 = !TextUtils.isEmpty(str) ? this.f3561j.get(str) : null;
            if (!TextUtils.isEmpty(str2) && !f8.contains(str2) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        p();
        if (this.f3554c != null) {
            for (String str3 : arrayList) {
                if (!f(str3)) {
                    h hVar = this.f3554c;
                    hVar.sendMessage(hVar.obtainMessage(1003, new k(this, str3)));
                }
            }
        }
    }

    public void m() {
        if (this.f3563l.isEmpty()) {
            return;
        }
        Iterator<c0> it = this.f3563l.values().iterator();
        while (it.hasNext()) {
            it.next().resume();
        }
    }

    public final void n() {
        if (this.f3557f != null) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("ability_name", this.f3572u);
            this.f3557f.a(1902, hashMap);
        }
    }

    public final void o() {
        if (this.f3557f == null) {
            return;
        }
        this.f3565n = Arrays.asList(301, 303);
        c cVar = new c();
        this.f3566o = cVar;
        this.f3557f.a(cVar);
        this.f3567p = Arrays.asList("id");
        this.f3568q = new d();
        this.f3557f.d().a(this.f3568q);
        this.f3569r = Arrays.asList("event_name");
        this.f3570s = new e();
        this.f3557f.d().a(this.f3570s);
    }

    public void p() {
        if (this.f3555d == null) {
            return;
        }
        this.f3571t.clear();
        this.f3572u.clear();
        this.f3572u.add("ability_common_filter");
        List<String> list = this.f3573v;
        if (list != null && list.size() > 0) {
            this.f3572u.addAll(this.f3573v);
        }
        if (this.f3555d.isUseFaceFilter() && s.c("ability_face_filter")) {
            this.f3571t.add("ability_face_filter");
            com.baidu.ar.g gVar = this.f3576y;
            if (gVar != null) {
                gVar.a(FilterParam.SkinFilter.whiten.getFilterNode().getNodeName(), true);
                this.f3576y.a(FilterNode.faceFilter, true);
            }
            if (this.f3575x) {
                this.f3575x = false;
                StatisticApi.onEventDebounce(StatisticConstants.EVENT_FILTER_ADJUST, 200L, "");
                StatisticApi.onEventDebounce(StatisticConstants.EVENT_BEAUTIFY_ADJUST, 200L, "");
            }
        }
        if (this.f3555d.isUseMakeupFilter()) {
            if (s.c("ability_makeup_filter")) {
                this.f3571t.add("ability_makeup_filter");
            }
            com.baidu.ar.g gVar2 = this.f3576y;
            if (gVar2 != null) {
                gVar2.a(FilterNode.makeupFilter, true);
            }
        }
        ArrayList arrayList = new ArrayList();
        if (this.f3571t.contains("ability_face_filter")) {
            arrayList.add("ability_face_filter");
        }
        if (this.f3571t.contains("ability_makeup_filter")) {
            arrayList.add("ability_makeup_filter");
        }
        if (arrayList.size() > 0) {
            a(arrayList);
        }
        DefaultParams defaultParams = this.f3555d;
        if (defaultParams != null) {
            String renderPipeline = defaultParams.getRenderPipeline();
            if (TextUtils.isEmpty(renderPipeline) || !renderPipeline.contains(FilterNode.highlightFilter.getNodeName())) {
                return;
            }
            this.f3554c.postDelayed(new a(), 100L);
        }
    }

    public final void q() {
        DefaultParams defaultParams = this.f3555d;
        if (defaultParams != null && defaultParams.isDigitalArEnable()) {
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("socket_enable", Integer.valueOf(this.f3555d.isDigitalSocketEnable() ? 1 : 0));
            hashMap.put("socket_url", this.f3555d.getDigitalSocketUrl());
            hashMap.put(HttpConstants.HTTP_APP_ID, this.f3555d.getDigitalUnitAppId());
            hashMap.put("app_key", this.f3555d.getDigitalUnitAppKey());
            c("ability_digital", hashMap);
            IDigital digitalAR = d().getDigitalAR();
            if (digitalAR != null) {
                digitalAR.initDigital(hashMap);
            }
        }
    }

    public final void b() {
        this.f3577z = new f();
    }

    public void c() {
        com.baidu.ar.g gVar = this.f3576y;
        if (gVar != null) {
            gVar.a(FilterNode.faceFilter, false);
            this.f3576y.a(FilterNode.makeupFilter, false);
        }
        ARProxyManager aRProxyManager = this.f3564m;
        if (aRProxyManager != null) {
            aRProxyManager.b();
        }
        Iterator<String> it = this.f3572u.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
        this.f3572u.clear();
        this.f3572u.add("ability_common_filter");
        List<String> list = this.f3573v;
        if (list != null && list.size() > 0) {
            this.f3572u.addAll(this.f3573v);
        }
        if (this.f3554c != null) {
            for (Map.Entry<String, c0> entry : this.f3563l.entrySet()) {
                if (!f(entry.getKey())) {
                    h hVar = this.f3554c;
                    hVar.sendMessage(hVar.obtainMessage(1003, new k(this, entry.getKey())));
                }
            }
        }
    }

    public List<String> g() {
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, String>> it = this.f3561j.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getKey());
        }
        return arrayList;
    }

    public final void h() {
        long currentTimeMillis = System.currentTimeMillis();
        ClassLoader classLoader = w.class.getClassLoader();
        for (Map.Entry<String, String> entry : t.f3256a.entrySet()) {
            if (ab.a(entry.getValue(), classLoader)) {
                this.f3561j.put(entry.getKey(), entry.getValue());
            }
        }
        this.f3562k.putAll(t.f3261f);
        com.baidu.ar.h.c("AbilityManager", "initSupportedARClasses mSupportedARClasses = " + this.f3561j.values());
        com.baidu.ar.h.a("AbilityManager", "initSupportedARClasses time cost = " + (System.currentTimeMillis() - currentTimeMillis));
    }

    public void i() {
        if (this.f3563l.isEmpty()) {
            return;
        }
        Iterator<c0> it = this.f3563l.values().iterator();
        while (it.hasNext()) {
            it.next().onCaseDestroy();
        }
    }

    public void j() {
        if (this.f3563l.isEmpty()) {
            return;
        }
        Iterator<c0> it = this.f3563l.values().iterator();
        while (it.hasNext()) {
            it.next().pause();
        }
    }

    public final void a() {
        g gVar = new g();
        this.A = gVar;
        this.f3558g.setCameraSwitchListener(gVar);
    }

    public boolean d(String str) {
        return this.f3572u.contains(str);
    }

    public boolean e(String str) {
        return this.f3561j.get(str) != null;
    }

    public final boolean f(String str) {
        List<String> list;
        if (TextUtils.isEmpty(str) || (list = this.f3573v) == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.equals(this.f3561j.get(it.next()))) {
                return true;
            }
        }
        return false;
    }

    public void g(String str) {
        q();
        if (this.f3563l.isEmpty()) {
            return;
        }
        for (c0 c0Var : this.f3563l.values()) {
            com.baidu.ar.h.a("AbilityManager", "onCaseCreate casePath = " + str);
            c0Var.onCaseCreate(str);
        }
    }

    public void h(String str) {
        if (this.f3556e == null) {
            this.f3556e = new x8();
        }
        this.f3556e.a(str, this.f3552a);
    }

    public boolean i(String str) {
        return a(str, false);
    }

    public final void a(int i8, HashMap<String, Object> hashMap) {
        if (i8 == 301) {
            if (this.f3563l == null || !this.f3572u.contains("ability_image_track")) {
                c("ability_imu", hashMap);
                return;
            }
            return;
        }
        if (i8 != 303) {
            return;
        }
        if (this.f3563l == null || !this.f3572u.contains("ability_image_track")) {
            i("ability_imu");
        }
    }

    public final void b(String str) {
        ConcurrentHashMap<String, c0> concurrentHashMap;
        c0 c0Var;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = this.f3561j;
        if (concurrentHashMap2 != null) {
            String str2 = concurrentHashMap2.get(str);
            if (!TextUtils.isEmpty(str2) && (concurrentHashMap = this.f3563l) != null && (c0Var = concurrentHashMap.get(str2)) != null) {
                c0Var.b(str);
            }
        }
        if (this.f3572u.contains(str)) {
            if (str.equals("ability_makeup_filter") || str.equals("ability_face_filter")) {
                this.f3572u.remove("ability_makeup_filter");
            }
            this.f3572u.remove(str);
            return;
        }
        com.baidu.ar.h.a("AbilityManager", "disableAbility() abilityName " + str + " has disabled!!!");
    }

    public final void c(String str) {
        if (this.f3572u.contains(str)) {
            com.baidu.ar.h.a("AbilityManager", "enableAbility() abilityName " + str + " has enabled!!!");
            return;
        }
        this.f3572u.add(str);
        if ((str.equals("ability_makeup_filter") || str.equals("ability_face_filter")) && this.f3555d.isUseMakeupFilter()) {
            this.f3572u.add("ability_makeup_filter");
        }
    }

    public void a(ARType aRType) {
        ARType aRType2 = ARType.FACE;
        if (aRType != aRType2) {
            c();
        } else {
            if (!s.b("ability_face_model")) {
                return;
            }
            if (this.f3555d.isUseFaceFilter()) {
                c("ability_face_model");
            }
        }
        this.f3576y.a(FilterParam.SkinFilter.whiten.getFilterNode().getNodeName(), aRType == aRType2 || this.f3555d.isUseBeautyFilter());
        String str = t.f3260e.get(aRType);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = this.f3561j.get(str);
        if (!TextUtils.isEmpty(str2) && this.f3563l.get(str2) != null) {
            this.f3563l.get(str2).a(str);
        }
        if (this.f3572u.contains(str) || aRType == ARType.IMU || TextUtils.isEmpty(str2) || this.f3554c == null) {
            return;
        }
        this.f3572u.add(str);
        j jVar = new j(this, str2, str, false, (HashMap<String, Object>) null);
        h hVar = this.f3554c;
        hVar.sendMessage(hVar.obtainMessage(1001, jVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(HashMap<String, Object> hashMap) {
        boolean z7;
        String str;
        int a8 = a9.a(hashMap.get("id"), -1);
        boolean z8 = a9.a(hashMap.get("open"), -1) == 1;
        com.baidu.ar.h.a("AbilityManager", "operateAbilityById id = " + a8 + " && open = " + z8);
        if (a8 == 5001) {
            str = "ability_gesture";
        } else {
            if (a8 != 5011) {
                if (a8 == 3005) {
                    str = "ability_logo_recognition";
                    z7 = true;
                } else {
                    z7 = a8 != 3006 ? z8 : false;
                    str = null;
                }
                if (str == null) {
                    if (z7) {
                        c(str, hashMap);
                        return;
                    } else {
                        i(str);
                        return;
                    }
                }
                return;
            }
            str = "ability_image_segmentation";
        }
        z7 = z8;
        if (str == null) {
        }
    }

    public final void c(HashMap<String, Object> hashMap) {
        com.baidu.ar.g gVar;
        FilterNode filterNode;
        if ("ability_operation".equals((String) hashMap.get("event_name"))) {
            String str = (String) hashMap.get("ability_name");
            if (TextUtils.isEmpty(str) || !t.f3257b.contains(str)) {
                return;
            }
            com.baidu.ar.h.a("AbilityManager", "operateFilterState abilityName = " + str);
            String str2 = (String) hashMap.get("ability_action");
            if ("open".equals(str2) && "close".equals(str2)) {
                boolean equals = "open".equals(str2);
                if (this.f3576y != null) {
                    if ("ability_makeup_filter".equals(str)) {
                        gVar = this.f3576y;
                        filterNode = FilterNode.makeupFilter;
                    } else if ("ability_face_filter".equals(str)) {
                        gVar = this.f3576y;
                        filterNode = FilterNode.faceFilter;
                    } else {
                        if (!"ability_beauty_filter".equals(str)) {
                            if ("ability_lut_filter".equals(str)) {
                                gVar = this.f3576y;
                                filterNode = FilterNode.lutFilter;
                            }
                            this.f3576y.a();
                        }
                        gVar = this.f3576y;
                        filterNode = FilterNode.skinFilter;
                    }
                    gVar.a(filterNode, equals);
                    this.f3576y.a();
                }
            }
        }
    }

    public void a(r3 r3Var, com.baidu.ar.arrender.a aVar) {
        this.f3557f = r3Var;
        this.f3558g = aVar;
        aVar.setEnabledAbilities(this.f3572u);
        a();
        this.f3559h = new g3(aVar, this.f3553b);
        e6 b8 = com.baidu.ar.j.b();
        this.f3560i = b8;
        if (b8 != null) {
            try {
                b8.setContext(this.f3552a);
            } catch (Exception e8) {
                com.baidu.ar.h.b("AbilityManager", "setup exception: " + e8.getMessage());
                e8.printStackTrace();
                return;
            }
        }
        o();
    }

    public boolean b(String str, HashMap<String, Object> hashMap) {
        if (this.f3572u.contains(str)) {
            if (this.f3554c == null) {
                return false;
            }
            i iVar = new i(this, this.f3561j.get(str), hashMap);
            h hVar = this.f3554c;
            hVar.sendMessage(hVar.obtainMessage(1002, iVar));
            return true;
        }
        com.baidu.ar.h.b("AbilityManager", "adjustAbility abilityType = " + str + " not start!!!");
        return false;
    }

    public boolean c(String str, HashMap<String, Object> hashMap) {
        return a(str, hashMap, false);
    }

    public final void a(String str, String str2, e3 e3Var) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "destroyAbility error!!! arClassName is empty!!!";
        } else {
            c0 c0Var = this.f3563l.get(str);
            if (c0Var != null) {
                if (TextUtils.isEmpty(str2) || e3Var == null) {
                    c0Var.b();
                } else {
                    c0Var.b(str2, e3Var);
                }
                if (c0Var.a()) {
                    ARProxyManager aRProxyManager = this.f3564m;
                    if (aRProxyManager != null && aRProxyManager.c(str)) {
                        this.f3564m.d(str);
                    }
                    this.f3563l.remove(str);
                    c0Var.release();
                    return;
                }
                return;
            }
            str3 = "destroyAbility error!!! As arClassName = " + str + " not active!!!";
        }
        com.baidu.ar.h.b("AbilityManager", str3);
    }

    public final void a(String str, HashMap<String, Object> hashMap) {
        c0 c0Var = this.f3563l.get(str);
        if (c0Var != null) {
            c0Var.adjust(hashMap);
        }
    }

    public final void a(String str, List<String> list, boolean z7, HashMap<String, Object> hashMap, String str2, e3 e3Var) {
        String str3;
        if (s.a(str)) {
            c0 c0Var = this.f3563l.get(str);
            if (c0Var != null) {
                com.baidu.ar.h.a("AbilityManager", "createARAbility arClassName = " + str + " ARAbility exist!!!");
                if (list != null) {
                    if (z7) {
                        c0Var.b();
                    }
                    c0Var.a(list);
                }
                c0Var.adjust(hashMap);
            } else {
                c0Var = a(str);
                if (c0Var == null) {
                    str3 = "createARAbility createARAbility error!!!";
                } else {
                    if (list != null) {
                        c0Var.a(list);
                    }
                    if (!TextUtils.isEmpty(this.f3555d.getFaceAlgoModelPath())) {
                        c0Var.setFaceModelPath(this.f3555d.getFaceAlgoModelPath());
                    }
                    c0Var.setMdlConfigParams(this.f3556e);
                    c0Var.setup(hashMap);
                }
            }
            if (TextUtils.isEmpty(str2) || e3Var == null) {
                return;
            }
            c0Var.a(str2, e3Var);
            return;
        }
        str3 = "checkARTypeAuth error!!!";
        com.baidu.ar.h.b("AbilityManager", str3);
    }

    public final void a(HashMap<String, Object> hashMap) {
        String str = (String) hashMap.get("event_name");
        com.baidu.ar.h.a("AbilityManager", "operateAbilityByEvent eventName = " + str);
        if (!"ability_operation".equals(str)) {
            String str2 = t.f3258c.get(str);
            if (!TextUtils.isEmpty(str2)) {
                c(str2, hashMap);
                return;
            }
            String str3 = t.f3259d.get(str);
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            i(str3);
            return;
        }
        String str4 = (String) hashMap.get("ability_name");
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        String str5 = (String) hashMap.get("ability_action");
        if ("open".equals(str5)) {
            c(str4, hashMap);
            return;
        }
        if ("close".equals(str5)) {
            i(str4);
        } else if ("adjust".equals(str5)) {
            b(str4, hashMap);
        } else if (SearchIntents.EXTRA_QUERY.equals(str5)) {
            n();
        }
    }

    public final void a(List<String> list) {
        com.baidu.ar.libloader.a.a(ARType.FACE, null, null, new b(list));
    }

    public boolean a(String str, HashMap<String, Object> hashMap, boolean z7) {
        StringBuilder sb;
        String str2;
        if (s.b(str)) {
            if (z7 && !this.f3573v.contains(str)) {
                this.f3573v.add(str);
            }
            if (!this.f3572u.contains(str)) {
                String str3 = this.f3561j.get(str);
                if (!TextUtils.isEmpty(str3)) {
                    c(str);
                    if (this.f3554c != null) {
                        j jVar = new j(this, str3, str, false, hashMap);
                        h hVar = this.f3554c;
                        hVar.sendMessage(hVar.obtainMessage(1001, jVar));
                        return true;
                    }
                }
                return false;
            }
            sb = new StringBuilder();
            sb.append("startAbility abilityType = ");
            sb.append(str);
            str2 = " is exist!!!";
        } else {
            sb = new StringBuilder();
            sb.append("startAbility abilityType = ");
            sb.append(str);
            str2 = " is no authorization!!!";
        }
        sb.append(str2);
        com.baidu.ar.h.b("AbilityManager", sb.toString());
        return false;
    }

    public boolean a(String str, List<String> list, String str2) {
        if (TextUtils.isEmpty(str) || list == null || list.size() <= 0 || !ab.a(str, w.class.getClassLoader())) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f3561j.put(it.next(), str);
        }
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        this.f3562k.put(str2, str);
        return true;
    }

    public boolean a(String str, boolean z7) {
        h hVar;
        if (z7 && this.f3573v.contains(str)) {
            this.f3573v.remove(str);
        }
        b(str);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.f3572u.iterator();
        while (it.hasNext()) {
            String str2 = this.f3561j.get(it.next());
            if (!TextUtils.isEmpty(str2) && !arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        String str3 = this.f3561j.get(str);
        if (arrayList.contains(str3) || (hVar = this.f3554c) == null) {
            return false;
        }
        hVar.sendMessage(hVar.obtainMessage(1003, new k(this, str3)));
        return true;
    }
}
