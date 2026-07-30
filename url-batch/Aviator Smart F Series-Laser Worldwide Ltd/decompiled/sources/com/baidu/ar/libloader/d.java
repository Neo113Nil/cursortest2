package com.baidu.ar.libloader;

import com.baidu.ar.libloader.ILibLoader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, List<ILibLoader.c>> f2762a = new HashMap();

    public void a() {
        this.f2762a.clear();
    }

    public void b() {
        Iterator<Map.Entry<String, List<ILibLoader.c>>> it = this.f2762a.entrySet().iterator();
        while (it.hasNext()) {
            a(it.next().getValue());
        }
    }

    public void a(String str) {
        a(this.f2762a.get(str));
    }

    public void b(String str) {
        if (this.f2762a.containsKey(str)) {
            this.f2762a.remove(str);
        }
    }

    public void a(String str, ILibLoader.c cVar) {
        List<ILibLoader.c> list = this.f2762a.get(str);
        if (list != null) {
            list.add(cVar);
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        this.f2762a.put(str, arrayList);
    }

    public final void a(List<ILibLoader.c> list) {
        if (list != null) {
            int size = list.size();
            ILibLoader.c[] cVarArr = new ILibLoader.c[size];
            list.toArray(cVarArr);
            for (int i8 = 0; i8 < size; i8++) {
                cVarArr[i8].onReady();
            }
        }
    }
}
