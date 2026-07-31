package io.flutter.plugins.googlemobileads;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import java.util.Collections;

/* loaded from: classes.dex */
final class d extends j {

    /* renamed from: h, reason: collision with root package name */
    private ViewGroup f17456h;

    /* renamed from: i, reason: collision with root package name */
    private int f17457i;

    class a implements View.OnLayoutChangeListener {
        a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
            int measuredHeight = view.getMeasuredHeight();
            if (measuredHeight != d.this.f17457i) {
                d dVar = d.this;
                dVar.f17512b.s(dVar.f17467a, measuredHeight);
            }
            d.this.f17457i = measuredHeight;
        }
    }

    d(int i7, io.flutter.plugins.googlemobileads.a aVar, String str, i iVar, c cVar) {
        super(i7, aVar, str, Collections.singletonList(new m(r2.h.f21149p)), iVar, cVar);
        this.f17457i = -1;
    }

    @Override // io.flutter.plugins.googlemobileads.j, io.flutter.plugins.googlemobileads.g
    public void a() {
        s2.b bVar = this.f17517g;
        if (bVar != null) {
            bVar.addOnLayoutChangeListener(new a());
            this.f17512b.m(this.f17467a, this.f17517g.getResponseInfo());
        }
    }

    @Override // io.flutter.plugins.googlemobileads.j, io.flutter.plugins.googlemobileads.e
    void b() {
        s2.b bVar = this.f17517g;
        if (bVar != null) {
            bVar.a();
            this.f17517g = null;
        }
        ViewGroup viewGroup = this.f17456h;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            this.f17456h = null;
        }
    }

    @Override // io.flutter.plugins.googlemobileads.j, io.flutter.plugins.googlemobileads.e
    io.flutter.plugin.platform.d c() {
        if (this.f17517g == null) {
            return null;
        }
        ViewGroup viewGroup = this.f17456h;
        if (viewGroup != null) {
            return new b0(viewGroup);
        }
        ScrollView h7 = h();
        if (h7 == null) {
            return null;
        }
        h7.setClipChildren(false);
        h7.setVerticalScrollBarEnabled(false);
        h7.setHorizontalScrollBarEnabled(false);
        this.f17456h = h7;
        h7.addView(this.f17517g);
        return new b0(this.f17517g);
    }

    ScrollView h() {
        if (this.f17512b.f() != null) {
            return new ScrollView(this.f17512b.f());
        }
        Log.e("FluidAdManagerBannerAd", "Tried to create container view before plugin is attached to an activity.");
        return null;
    }
}
