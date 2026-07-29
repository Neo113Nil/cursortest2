package com.facebook.ads.internal.b;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.facebook.ads.internal.q.a.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements o<Bundle> {

    /* renamed from: a, reason: collision with root package name */
    private final View f5023a;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f5024b;

    /* renamed from: c, reason: collision with root package name */
    private c f5025c;

    public a(View view, List<b> list) {
        this.f5023a = view;
        this.f5024b = new ArrayList(list.size());
        Iterator<b> it = list.iterator();
        while (it.hasNext()) {
            this.f5024b.add(new d(it.next()));
        }
        this.f5025c = new c();
    }

    public a(View view, List<b> list, Bundle bundle) {
        this.f5023a = view;
        this.f5024b = new ArrayList(list.size());
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("TESTS");
        for (int i = 0; i < list.size(); i++) {
            this.f5024b.add(new d(list.get(i), (Bundle) parcelableArrayList.get(i)));
        }
        this.f5025c = (c) bundle.getSerializable("STATISTICS");
    }

    public void a() {
        this.f5025c.a();
    }

    public void a(double d2, double d3) {
        if (d3 >= 0.0d) {
            this.f5025c.b(d2, d3);
        }
        double c2 = com.facebook.ads.internal.r.a.a(this.f5023a, 0).c();
        this.f5025c.a(d2, c2);
        Iterator<d> it = this.f5024b.iterator();
        while (it.hasNext()) {
            it.next().a(d2, c2);
        }
    }

    public c b() {
        return this.f5025c;
    }

    @Override // com.facebook.ads.internal.q.a.o
    public Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("STATISTICS", this.f5025c);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f5024b.size());
        Iterator<d> it = this.f5024b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        bundle.putParcelableArrayList("TESTS", arrayList);
        return bundle;
    }
}
