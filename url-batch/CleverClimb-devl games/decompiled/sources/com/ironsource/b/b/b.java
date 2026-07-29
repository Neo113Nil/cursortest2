package com.ironsource.b.b;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.ironsource.b.d.c;
import com.ironsource.b.e.r;
import com.ironsource.b.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BaseEventsManager.java */
/* loaded from: classes2.dex */
public abstract class b {
    int h;
    String i;
    String j;
    private boolean l;
    private com.ironsource.a.a n;
    private com.ironsource.b.b.a o;
    private ArrayList<com.ironsource.a.b> p;
    private int r;
    private int[] v;
    private a w;
    private n x;
    private r y;
    private com.ironsource.b.d.d z;

    /* renamed from: a, reason: collision with root package name */
    final int f6728a = 1;

    /* renamed from: b, reason: collision with root package name */
    final int f6729b = 100;

    /* renamed from: c, reason: collision with root package name */
    final int f6730c = 5000;

    /* renamed from: d, reason: collision with root package name */
    final int f6731d = 5;
    final String e = "supersonic_sdk.db";
    final String f = com.umeng.analytics.pro.b.H;
    final String g = "placement";
    private final String k = "abt";
    private boolean m = false;
    private boolean q = true;
    private int s = 100;
    private int t = 5000;
    private int u = 1;

    protected abstract boolean c(com.ironsource.a.b bVar);

    protected abstract String d(int i);

    protected abstract boolean d(com.ironsource.a.b bVar);

    protected abstract boolean e(com.ironsource.a.b bVar);

    protected abstract int f(com.ironsource.a.b bVar);

    protected abstract void g(com.ironsource.a.b bVar);

    protected abstract boolean h(com.ironsource.a.b bVar);

    static /* synthetic */ int d(b bVar) {
        int i = bVar.r;
        bVar.r = i + 1;
        return i;
    }

    void a() {
        this.p = new ArrayList<>();
        this.r = 0;
        this.o = c.a(this.i, this.h);
        this.w = new a(this.j + "EventThread");
        this.w.start();
        this.w.a();
        this.z = com.ironsource.b.d.d.c();
    }

    public synchronized void a(Context context, n nVar) {
        this.i = com.ironsource.b.h.g.c(context, this.j, this.i);
        a(this.i);
        this.o.a(com.ironsource.b.h.g.d(context, this.j, null));
        this.n = com.ironsource.a.a.a(context, "supersonic_sdk.db", 5);
        d();
        this.v = com.ironsource.b.h.g.a(context, this.j);
        this.x = nVar;
    }

    public synchronized void a(r rVar) {
        this.y = rVar;
    }

    public synchronized void a(final com.ironsource.a.b bVar) {
        this.w.a(new Runnable() { // from class: com.ironsource.b.b.b.1
            @Override // java.lang.Runnable
            public void run() {
                if (bVar == null || !b.this.q) {
                    return;
                }
                try {
                    b.this.z.a(c.a.EVENT, ("{\"eventId\":" + bVar.a() + ",\"timestamp\":" + bVar.b() + "," + bVar.c().substring(1)).replace(",", "\n"), 0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (b.this.i(bVar)) {
                    if (bVar.a() != 14 && bVar.a() != 40 && bVar.a() != 41) {
                        int f = b.this.f(bVar);
                        if (b.this.h(bVar)) {
                            f = b.this.f(bVar);
                        }
                        bVar.a("sessionDepth", Integer.valueOf(f));
                    }
                    if (b.this.c(bVar)) {
                        b.this.g(bVar);
                    } else if (!TextUtils.isEmpty(b.this.d(bVar.a())) && b.this.d(bVar)) {
                        bVar.a("placement", b.this.d(bVar.a()));
                    }
                    b.this.p.add(bVar);
                    b.d(b.this);
                }
                boolean e2 = b.this.e(bVar);
                if (!b.this.m && e2) {
                    b.this.m = true;
                }
                if (b.this.n != null) {
                    if (b.this.e()) {
                        b.this.c();
                    } else if (b.this.a((ArrayList<com.ironsource.a.b>) b.this.p) || e2) {
                        b.this.d();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        this.m = false;
        ArrayList<com.ironsource.a.b> a2 = a(this.p, this.n.a(this.j), this.t);
        this.p.clear();
        this.n.b(this.j);
        this.r = 0;
        if (a2.size() > 0) {
            JSONObject b2 = com.ironsource.b.f.e.a().b();
            try {
                a(b2);
                String b3 = com.ironsource.b.h.g.b();
                if (!TextUtils.isEmpty(b3)) {
                    b2.put("abt", b3);
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            new com.ironsource.a.c(new com.ironsource.a.d() { // from class: com.ironsource.b.b.b.2
                @Override // com.ironsource.a.d
                public synchronized void a(final ArrayList<com.ironsource.a.b> arrayList, final boolean z) {
                    b.this.w.a(new Runnable() { // from class: com.ironsource.b.b.b.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (z) {
                                ArrayList<com.ironsource.a.b> a3 = b.this.n.a(b.this.j);
                                b.this.r = a3.size() + b.this.p.size();
                            } else if (arrayList != null) {
                                b.this.n.a(arrayList, b.this.j);
                                ArrayList<com.ironsource.a.b> a4 = b.this.n.a(b.this.j);
                                b.this.r = a4.size() + b.this.p.size();
                            }
                        }
                    });
                }
            }).execute(this.o.a(a2, b2), this.o.a(), a2);
        }
    }

    private ArrayList<com.ironsource.a.b> a(ArrayList<com.ironsource.a.b> arrayList, ArrayList<com.ironsource.a.b> arrayList2, int i) {
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        Collections.sort(arrayList3, new Comparator<com.ironsource.a.b>() { // from class: com.ironsource.b.b.b.3
            @Override // java.util.Comparator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(com.ironsource.a.b bVar, com.ironsource.a.b bVar2) {
                return bVar.b() >= bVar2.b() ? 1 : -1;
            }
        });
        if (arrayList3.size() <= i) {
            return new ArrayList<>(arrayList3);
        }
        ArrayList<com.ironsource.a.b> arrayList4 = new ArrayList<>(arrayList3.subList(0, i));
        this.n.a(arrayList3.subList(i, arrayList3.size()), this.j);
        return arrayList4;
    }

    private void a(String str) {
        if (this.o == null || !this.o.c().equals(str)) {
            this.o = c.a(str, this.h);
        }
    }

    public void a(int i) {
        if (i > 0) {
            this.u = i;
        }
    }

    public void b(int i) {
        if (i > 0) {
            this.s = i;
        }
    }

    public void c(int i) {
        if (i > 0) {
            this.t = i;
        }
    }

    public void a(int[] iArr, Context context) {
        this.v = iArr;
        com.ironsource.b.h.g.a(context, this.j, iArr);
    }

    public void a(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.o != null) {
            this.o.a(str);
        }
        com.ironsource.b.h.g.a(context, this.j, str);
    }

    public void b(String str, Context context) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.i = str;
        com.ironsource.b.h.g.b(context, this.j, str);
        a(str);
    }

    public void a(boolean z) {
        this.q = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.n.a(this.p, this.j);
        this.p.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean e() {
        return (this.r >= this.s || this.m) && this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(ArrayList<com.ironsource.a.b> arrayList) {
        return arrayList != null && arrayList.size() >= this.u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i(com.ironsource.a.b bVar) {
        if (bVar != null && this.v != null && this.v.length > 0) {
            int a2 = bVar.a();
            for (int i = 0; i < this.v.length; i++) {
                if (a2 == this.v[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public void b(boolean z) {
        this.l = z;
    }

    String b(com.ironsource.a.b bVar) {
        try {
            return new JSONObject(bVar.c()).optString(com.umeng.analytics.pro.b.H, "");
        } catch (JSONException unused) {
            return "";
        }
    }

    public void b() {
        c();
    }

    public void a(com.ironsource.a.b bVar, String str) {
        try {
            ArrayList<com.ironsource.a.b> arrayList = new ArrayList<>();
            arrayList.add(bVar);
            new com.ironsource.a.c().execute(this.o.a(arrayList, com.ironsource.b.f.e.a().b()), str, null);
        } catch (Exception unused) {
        }
    }

    private void a(JSONObject jSONObject) {
        try {
            if (this.x != null) {
                if (this.x.a() > 0) {
                    jSONObject.put("age", this.x.a());
                }
                if (!TextUtils.isEmpty(this.x.b())) {
                    jSONObject.put("gen", this.x.b());
                }
                if (this.x.c() > 0) {
                    jSONObject.put("lvl", this.x.c());
                }
                if (this.x.d() != null) {
                    jSONObject.put("pay", this.x.d().get());
                }
                if (this.x.e() > 0.0d) {
                    jSONObject.put("iapt", this.x.e());
                }
                if (this.x.f() > 0) {
                    jSONObject.put("ucd", this.x.f());
                }
            }
            if (this.y != null) {
                String b2 = this.y.b();
                if (!TextUtils.isEmpty(b2)) {
                    jSONObject.put("segmentId", b2);
                }
                JSONObject c2 = this.y.c();
                Iterator<String> keys = c2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject.put(next, c2.get(next));
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* compiled from: BaseEventsManager.java */
    private class a extends HandlerThread {

        /* renamed from: b, reason: collision with root package name */
        private Handler f6740b;

        a(String str) {
            super(str);
        }

        void a(Runnable runnable) {
            this.f6740b.post(runnable);
        }

        void a() {
            this.f6740b = new Handler(getLooper());
        }
    }
}
