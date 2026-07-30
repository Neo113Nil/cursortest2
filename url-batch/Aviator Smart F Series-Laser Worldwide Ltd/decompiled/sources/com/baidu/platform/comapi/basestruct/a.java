package com.baidu.platform.comapi.basestruct;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public int f8791a;

    /* renamed from: b, reason: collision with root package name */
    public Point f8792b;

    /* renamed from: c, reason: collision with root package name */
    public Point f8793c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<ArrayList<Point>> f8794d;

    public static a a(List<? extends Number> list) {
        if (list == null || list.size() < 2) {
            return null;
        }
        a aVar = new a();
        int size = list.size();
        if (size >= 5) {
            aVar.f8792b = new Point(list.get(0).doubleValue(), list.get(1).doubleValue());
            aVar.f8793c = new Point(list.get(2).doubleValue(), list.get(3).doubleValue());
            aVar.f8791a = (int) list.get(4).doubleValue();
            aVar.f8794d = new ArrayList<>();
            int i8 = 7;
            if (size >= 7) {
                ArrayList<Point> arrayList = new ArrayList<>();
                Point point = new Point(list.get(5).doubleValue(), list.get(6).doubleValue());
                arrayList.add(point);
                while (true) {
                    int i9 = i8 + 1;
                    if (i9 >= size) {
                        break;
                    }
                    Point point2 = new Point(point.getDoubleX() + list.get(i8).doubleValue(), point.getDoubleY() + list.get(i9).doubleValue());
                    arrayList.add(point2);
                    i8 += 2;
                    point = point2;
                }
                aVar.f8794d.add(arrayList);
            }
        } else if (size >= 2) {
            Point point3 = new Point(list.get(0).doubleValue(), list.get(1).doubleValue());
            ArrayList<Point> arrayList2 = new ArrayList<>();
            arrayList2.add(point3);
            aVar.f8792b = new Point(point3);
            aVar.f8793c = new Point(point3);
            aVar.f8791a = 1;
            ArrayList<ArrayList<Point>> arrayList3 = new ArrayList<>();
            aVar.f8794d = arrayList3;
            arrayList3.add(arrayList2);
        }
        return aVar;
    }

    public String toString() {
        return "ComplexPt [eType=" + this.f8791a + ", mLL=" + this.f8792b + ", mRu=" + this.f8793c + ", mGeoPt=" + this.f8794d + "]";
    }
}
