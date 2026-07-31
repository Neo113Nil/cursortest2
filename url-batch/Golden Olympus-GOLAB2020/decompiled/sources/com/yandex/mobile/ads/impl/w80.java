package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o2.AbstractC3337k;
import o2.InterfaceC3316J;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class w80 extends androidx.recyclerview.widget.m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final da0 f33950a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final r80 f33951b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC3316J f33952c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f33953d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    private a f33954e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33955f;

    private final class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            Map map = w80.this.f33953d;
            w80 w80Var = w80.this;
            for (Map.Entry entry : map.entrySet()) {
                w80.access$bindHolder(w80Var, (ca0) entry.getKey(), ((Number) entry.getValue()).intValue());
            }
            w80.this.c();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@NotNull View v4) {
            Intrinsics.checkNotNullParameter(v4, "v");
            w80.access$unregisterTrackers(w80.this);
            Set keySet = w80.this.f33953d.keySet();
            w80 w80Var = w80.this;
            Iterator it = keySet.iterator();
            while (it.hasNext()) {
                w80.access$unbindHolder(w80Var, (ca0) it.next());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w80(@NotNull da0 feedViewModel, @NotNull r80 feedAdItemVisibilityTracker) {
        super(new z90());
        Intrinsics.checkNotNullParameter(feedViewModel, "feedViewModel");
        Intrinsics.checkNotNullParameter(feedAdItemVisibilityTracker, "feedAdItemVisibilityTracker");
        this.f33950a = feedViewModel;
        this.f33951b = feedAdItemVisibilityTracker;
        this.f33952c = fu.b(feedViewModel.a().p().c());
        this.f33953d = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(w80 this$0, int i4) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f33950a.a(i4);
    }

    public static final void access$bindHolder(w80 w80Var, ca0 ca0Var, int i4) {
        y90 y90Var = (y90) w80Var.getCurrentList().get(i4);
        if ((ca0Var instanceof s90) && (y90Var instanceof d90)) {
            ((s90) ca0Var).a((d90) y90Var);
        }
    }

    public static final void access$unbindHolder(w80 w80Var, ca0 ca0Var) {
        w80Var.getClass();
        s90 s90Var = ca0Var instanceof s90 ? (s90) ca0Var : null;
        if (s90Var != null) {
            s90Var.a();
        }
    }

    public static final void access$unregisterTrackers(w80 w80Var) {
        w80Var.f33951b.a();
        o2.K.f(w80Var.f33952c, null, 1, null);
        w80Var.f33955f = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c() {
        if (this.f33955f) {
            return;
        }
        this.f33955f = true;
        this.f33951b.a(new q80() { // from class: com.yandex.mobile.ads.impl.Fk
            @Override // com.yandex.mobile.ads.impl.q80
            public final void a(int i4) {
                w80.a(w80.this, i4);
            }
        });
        AbstractC3337k.d(this.f33952c, null, null, new x80(this, null), 3, null);
    }

    @NotNull
    protected abstract dt a();

    @NotNull
    protected abstract fe2 b();

    @Override // androidx.recyclerview.widget.m, androidx.recyclerview.widget.RecyclerView.h
    public int getItemCount() {
        return getCurrentList().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int getItemViewType(int i4) {
        return Intrinsics.areEqual(getCurrentList().get(i4), x90.f34503a) ? 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        a aVar = this.f33954e;
        if (aVar == null) {
            aVar = new a();
        }
        this.f33954e = aVar;
        recyclerView.removeOnAttachStateChangeListener(aVar);
        recyclerView.addOnAttachStateChangeListener(aVar);
        if (this.f33950a.d().get() < 0) {
            this.f33950a.f();
        }
        c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onDetachedFromRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        a aVar = this.f33954e;
        if (aVar != null) {
            recyclerView.removeOnAttachStateChangeListener(aVar);
        }
        this.f33951b.a();
        o2.K.f(this.f33952c, null, 1, null);
        this.f33955f = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onBindViewHolder(@NotNull ca0 holder, int i4) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.f33953d.put(holder, Integer.valueOf(i4));
        y90 y90Var = (y90) getCurrentList().get(i4);
        if ((holder instanceof s90) && (y90Var instanceof d90)) {
            ((s90) holder).a((d90) y90Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    @NotNull
    public ca0 onCreateViewHolder(@NotNull ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        if (i4 != 0) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.monetization_ads_feed_progressbar, parent, false);
            Intrinsics.checkNotNull(inflate);
            return new v90(inflate);
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.monetization_ads_feed_item, parent, false);
        Intrinsics.checkNotNull(inflate2, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate2;
        C2286v2 a4 = this.f33950a.a();
        dt a5 = a();
        fe2 b4 = b();
        return new s90(a4, viewGroup, a5, b4, new f90(a4, viewGroup, a5, b4));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewAttachedToWindow(@NotNull ca0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewAttachedToWindow((RecyclerView.E) holder);
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (holder instanceof s90) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            this.f33951b.a(itemView, bindingAdapterPosition);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewDetachedFromWindow(@NotNull ca0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewDetachedFromWindow((RecyclerView.E) holder);
        r80 r80Var = this.f33951b;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        r80Var.a(itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public void onViewRecycled(@NotNull ca0 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled((RecyclerView.E) holder);
        this.f33953d.remove(holder);
        s90 s90Var = holder instanceof s90 ? (s90) holder : null;
        if (s90Var != null) {
            s90Var.a();
        }
    }

    public /* synthetic */ w80(da0 da0Var, r80 r80Var, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(da0Var, (i4 & 2) != 0 ? new r80() : r80Var);
    }
}
