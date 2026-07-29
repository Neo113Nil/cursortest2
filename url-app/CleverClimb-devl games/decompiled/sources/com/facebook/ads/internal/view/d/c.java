package com.facebook.ads.internal.view.d;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import java.util.List;

/* loaded from: classes.dex */
public class c extends RecyclerView.Adapter<e> {

    /* renamed from: a, reason: collision with root package name */
    private final List<String> f5631a;

    /* renamed from: b, reason: collision with root package name */
    private final int f5632b;

    c(List<String> list, int i) {
        this.f5631a = list;
        this.f5632b = i;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new e(new d(viewGroup.getContext()));
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(e eVar, int i) {
        String str = this.f5631a.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        marginLayoutParams.setMargins(i == 0 ? this.f5632b * 4 : this.f5632b, 0, i >= getItemCount() + (-1) ? this.f5632b * 4 : this.f5632b, 0);
        eVar.a().setLayoutParams(marginLayoutParams);
        eVar.a().a(str);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f5631a.size();
    }
}
