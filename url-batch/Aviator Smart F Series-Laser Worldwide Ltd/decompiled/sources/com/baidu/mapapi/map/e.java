package com.baidu.mapapi.map;

import android.graphics.Point;
import com.baidu.mapapi.map.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
class e<T extends a> {

    /* renamed from: a, reason: collision with root package name */
    private final c f6499a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6500b;

    /* renamed from: c, reason: collision with root package name */
    private List<T> f6501c;

    /* renamed from: d, reason: collision with root package name */
    private List<e<T>> f6502d;

    static abstract class a {
        a() {
        }

        abstract Point getPoint();
    }

    public e(c cVar) {
        this(cVar, 0);
    }

    public void a(T t7) {
        Point point = t7.getPoint();
        if (this.f6499a.a(point.x, point.y)) {
            a(point.x, point.y, t7);
        }
    }

    private e(double d8, double d9, double d10, double d11, int i8) {
        this(new c(d8, d9, d10, d11), i8);
    }

    private e(c cVar, int i8) {
        this.f6502d = null;
        this.f6499a = cVar;
        this.f6500b = i8;
    }

    private void a(double d8, double d9, T t7) {
        List<e<T>> list = this.f6502d;
        if (list == null) {
            if (this.f6501c == null) {
                this.f6501c = new ArrayList();
            }
            this.f6501c.add(t7);
            if (this.f6501c.size() <= 40 || this.f6500b >= 40) {
                return;
            }
            a();
            return;
        }
        c cVar = this.f6499a;
        if (d9 < cVar.f6498f) {
            if (d8 < cVar.f6497e) {
                list.get(0).a(d8, d9, t7);
                return;
            } else {
                list.get(1).a(d8, d9, t7);
                return;
            }
        }
        if (d8 < cVar.f6497e) {
            list.get(2).a(d8, d9, t7);
        } else {
            list.get(3).a(d8, d9, t7);
        }
    }

    private void a() {
        ArrayList arrayList = new ArrayList(4);
        this.f6502d = arrayList;
        c cVar = this.f6499a;
        arrayList.add(new e(cVar.f6493a, cVar.f6497e, cVar.f6494b, cVar.f6498f, this.f6500b + 1));
        List<e<T>> list = this.f6502d;
        c cVar2 = this.f6499a;
        list.add(new e<>(cVar2.f6497e, cVar2.f6495c, cVar2.f6494b, cVar2.f6498f, this.f6500b + 1));
        List<e<T>> list2 = this.f6502d;
        c cVar3 = this.f6499a;
        list2.add(new e<>(cVar3.f6493a, cVar3.f6497e, cVar3.f6498f, cVar3.f6496d, this.f6500b + 1));
        List<e<T>> list3 = this.f6502d;
        c cVar4 = this.f6499a;
        list3.add(new e<>(cVar4.f6497e, cVar4.f6495c, cVar4.f6498f, cVar4.f6496d, this.f6500b + 1));
        List<T> list4 = this.f6501c;
        this.f6501c = null;
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            a(r7.getPoint().x, r7.getPoint().y, it.next());
        }
    }
}
