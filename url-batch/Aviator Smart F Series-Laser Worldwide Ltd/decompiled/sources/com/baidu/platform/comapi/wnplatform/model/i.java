package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class i extends a {

    /* renamed from: a, reason: collision with root package name */
    List<h> f10514a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    ArrayList<LatLng> f10515b = new ArrayList<>();

    public ArrayList<LatLng> a() {
        return this.f10515b;
    }

    public void a(Bundle[] bundleArr) {
        if (bundleArr == null) {
            this.f10514a.clear();
            this.f10515b.clear();
            return;
        }
        this.f10514a.clear();
        this.f10515b.clear();
        for (Bundle bundle : bundleArr) {
            this.f10514a.add(new h(bundle));
        }
        Iterator<h> it = this.f10514a.iterator();
        while (it.hasNext()) {
            this.f10515b.addAll(it.next().a());
        }
    }
}
