package com.facebook.ads.internal.adapters;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.List;

/* loaded from: classes.dex */
public class i extends RecyclerView.Adapter<com.facebook.ads.internal.view.c> {

    /* renamed from: a, reason: collision with root package name */
    private static final int f4936a = Color.argb(51, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    private final List<com.facebook.ads.internal.n.e> f4937b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4938c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4939d;

    public i(com.facebook.ads.internal.view.hscroll.b bVar, List<com.facebook.ads.internal.n.e> list) {
        float f = bVar.getContext().getResources().getDisplayMetrics().density;
        this.f4937b = list;
        this.f4938c = Math.round(f * 1.0f);
        this.f4939d = bVar.getChildSpacing();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.internal.view.c onCreateViewHolder(ViewGroup viewGroup, int i) {
        com.facebook.ads.internal.view.u uVar = new com.facebook.ads.internal.view.u(viewGroup.getContext());
        uVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        com.facebook.ads.internal.q.a.i.a(uVar, com.facebook.ads.internal.q.a.i.INTERNAL_AD_MEDIA);
        return new com.facebook.ads.internal.view.c(uVar);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final com.facebook.ads.internal.view.c cVar, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f4939d * 2 : this.f4939d, 0, i >= this.f4937b.size() + (-1) ? this.f4939d * 2 : this.f4939d, 0);
        cVar.f5555a.setBackgroundColor(0);
        cVar.f5555a.setImageDrawable(null);
        cVar.f5555a.setLayoutParams(marginLayoutParams);
        cVar.f5555a.setPadding(this.f4938c, this.f4938c, this.f4938c, this.f4938c);
        com.facebook.ads.internal.n.e eVar = this.f4937b.get(i);
        eVar.a(cVar.f5555a);
        com.facebook.ads.internal.n.f j = eVar.j();
        if (j != null) {
            com.facebook.ads.internal.view.b.d a2 = new com.facebook.ads.internal.view.b.d(cVar.f5555a).a();
            a2.a(new com.facebook.ads.internal.view.b.e() { // from class: com.facebook.ads.internal.adapters.i.1
                @Override // com.facebook.ads.internal.view.b.e
                public void a() {
                    cVar.f5555a.setBackgroundColor(i.f4936a);
                }
            });
            a2.a(j.a());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f4937b.size();
    }
}
