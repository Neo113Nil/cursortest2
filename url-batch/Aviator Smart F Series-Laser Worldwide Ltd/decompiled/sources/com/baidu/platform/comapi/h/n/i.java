package com.baidu.platform.comapi.h.n;

import com.baidu.ar.marker.model.Existance;
import com.baidu.ar.marker.model.Segments;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.map.MapLanguage;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.h.t.i;
import com.baidu.platform.comapi.location.CoordinateUtil;
import com.baidu.platform.comapi.util.j;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static i f9200a;

    /* renamed from: b, reason: collision with root package name */
    private int f9201b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f9202c = 0;

    /* renamed from: d, reason: collision with root package name */
    private final Object f9203d = new Object();

    /* renamed from: e, reason: collision with root package name */
    private boolean f9204e = false;

    /* renamed from: f, reason: collision with root package name */
    private List<com.baidu.platform.comapi.h.n.a> f9205f;

    /* renamed from: g, reason: collision with root package name */
    private Point f9206g;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9207a;

        a(int i8) {
            this.f9207a = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (i.this.f9203d) {
                i.this.f9202c = this.f9207a;
                i.this.f9203d.notifyAll();
            }
            if (i.this.f9205f == null || i.this.f9205f.isEmpty()) {
                return;
            }
            synchronized (i.this.f9203d) {
                try {
                    List<Segments> a8 = i.this.a(this.f9207a);
                    if (a8 != null) {
                        com.baidu.platform.comapi.h.a.a().a(a8, "normal");
                    }
                } finally {
                }
            }
        }
    }

    private i() {
    }

    public Point c() {
        return this.f9206g;
    }

    public void d() {
        synchronized (this.f9203d) {
            this.f9204e = true;
            this.f9201b = 0;
            this.f9202c = 0;
        }
    }

    private ArrayList<double[]> a(ArrayList<Point> arrayList) {
        ArrayList<double[]> arrayList2 = new ArrayList<>();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            Point point = arrayList.get(i8);
            Point bd09mcTogcj02ll = CoordinateUtil.bd09mcTogcj02ll(point.getIntX(), point.getIntY());
            arrayList2.add(new double[]{bd09mcTogcj02ll.getDoubleX(), bd09mcTogcj02ll.getDoubleY()});
        }
        return arrayList2;
    }

    public static synchronized i b() {
        i iVar;
        synchronized (i.class) {
            try {
                if (f9200a == null) {
                    f9200a = new i();
                }
                iVar = f9200a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    private void b(ArrayList<i.b> arrayList) {
        JSONArray jSONArray = new JSONArray();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            i.b bVar = arrayList.get(i8);
            if (bVar.f9285e.size() > 0) {
                ArrayList<double[]> a8 = a(bVar.f9285e);
                if (a8.size() > 0) {
                    com.baidu.platform.comapi.h.n.a aVar = new com.baidu.platform.comapi.h.n.a();
                    Existance existance = new Existance();
                    existance.setType(bVar.f9282b);
                    existance.setLatlng(a8.get(a8.size() - 1));
                    existance.setStreetName(bVar.f9281a);
                    existance.setDirectionType(bVar.f9284d);
                    aVar.setExistance(existance);
                    aVar.f9168d = bVar.f9283c;
                    aVar.setPoints(a8);
                    aVar.setPointsCount(a8.size());
                    this.f9205f.add(aVar);
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("x", a8.get(a8.size() - 1)[0]);
                        jSONObject.put("y", a8.get(a8.size() - 1)[1]);
                        jSONObject.put("type", bVar.f9282b);
                        jSONArray.put(jSONObject);
                    } catch (Exception e8) {
                        e8.printStackTrace();
                    }
                }
            }
        }
    }

    public Point a() {
        Point point = new Point(0, 0);
        List<com.baidu.platform.comapi.h.n.a> list = this.f9205f;
        if (list != null && list.size() > 0 && this.f9205f.get(0).getPoints().size() > 0) {
            double[] dArr = (double[]) ((ArrayList) this.f9205f.get(0).getPoints()).get(0);
            point.setDoubleX(dArr[0]);
            point.setDoubleY(dArr[1]);
        }
        return point;
    }

    private void a(WalkPlan walkPlan, int i8) {
        if (i8 < walkPlan.getRoutesCount()) {
            WalkPlan.Routes.Legs legs = walkPlan.getRoutes(i8).getLegs(0);
            for (int i9 = 0; i9 < legs.getStepsCount(); i9++) {
                WalkPlan.Routes.Legs.Steps steps = legs.getSteps(i9);
                if (steps.getWalkType() == 2) {
                    List<Integer> strafficmarkLocList = steps.getStrafficmarkLocList();
                    this.f9206g = new Point(strafficmarkLocList.get(0).intValue(), strafficmarkLocList.get(1).intValue());
                    return;
                }
            }
        }
    }

    public void a(WalkPlan walkPlan, int i8, MapLanguage mapLanguage) {
        if (walkPlan == null) {
            return;
        }
        this.f9205f = new CopyOnWriteArrayList();
        this.f9206g = null;
        int A = i8 == 0 ? com.baidu.platform.comapi.walknavi.b.n().A() : 0;
        b(com.baidu.platform.comapi.h.t.i.a(walkPlan, A, mapLanguage));
        a(walkPlan, A);
        d();
        try {
            List<com.baidu.platform.comapi.h.n.a> list = this.f9205f;
            if (list == null || list.isEmpty()) {
                return;
            }
            synchronized (this.f9203d) {
                try {
                    if (this.f9202c == 0) {
                        this.f9203d.wait();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            com.baidu.platform.comapi.h.a.a().a(a(this.f9202c), "normal");
        } catch (Exception unused) {
        }
    }

    public void b(int i8) {
        j.b().execute(new a(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized List<Segments> a(int i8) {
        try {
            int size = this.f9205f.size();
            int i9 = 0;
            if (this.f9204e) {
                this.f9204e = false;
                int i10 = 0;
                for (int i11 = size - 1; i11 >= 0; i11--) {
                    com.baidu.platform.comapi.h.n.a aVar = this.f9205f.get(i11);
                    i10 += aVar.f9168d;
                    aVar.f9169e = i10;
                }
            }
            for (int i12 = 0; i12 < size; i12++) {
                if (i8 - this.f9205f.get(i12).f9169e >= 0) {
                    int i13 = i12 - 6;
                    int i14 = i12 + 4;
                    int i15 = this.f9201b;
                    if (i14 != i15 && i15 != size) {
                        if (i13 >= 0) {
                            i9 = i13;
                        }
                        if (i14 <= size) {
                            size = i14;
                        }
                        this.f9201b = size;
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        while (i9 < size) {
                            copyOnWriteArrayList.add(this.f9205f.get(i9));
                            i9++;
                        }
                        return copyOnWriteArrayList;
                    }
                    return null;
                }
            }
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }
}
