package com.yandex.mobile.ads.impl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.wx;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fw extends androidx.recyclerview.widget.m {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final wg2 f25928a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final kh2 f25929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fw(@NotNull Function1<? super rx, Unit> onAction, @NotNull ax imageLoader, @NotNull wg2 viewHolderMapper, @NotNull kh2 viewTypeMapper) {
        super(new vw());
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        Intrinsics.checkNotNullParameter(viewHolderMapper, "viewHolderMapper");
        Intrinsics.checkNotNullParameter(viewTypeMapper, "viewTypeMapper");
        this.f25928a = viewHolderMapper;
        this.f25929b = viewTypeMapper;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i4) {
        wx viewHolder = (wx) getItem(i4);
        kh2 kh2Var = this.f25929b;
        Intrinsics.checkNotNull(viewHolder);
        kh2Var.getClass();
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        if (viewHolder instanceof wx.c) {
            return R.layout.debug_panel_item_action_button;
        }
        if (viewHolder instanceof wx.h) {
            return R.layout.debug_panel_item_switch;
        }
        if (viewHolder instanceof wx.d) {
            return R.layout.debug_panel_item_divider;
        }
        if (viewHolder instanceof wx.e) {
            return R.layout.deubg_panel_item_header;
        }
        if (viewHolder instanceof wx.f) {
            return R.layout.deubg_panel_item_key_value;
        }
        if (viewHolder instanceof wx.g) {
            return R.layout.debug_panel_item_mediation_adapter;
        }
        if (viewHolder instanceof wx.b) {
            return R.layout.debug_panel_item_ad_units;
        }
        if (viewHolder instanceof wx.a) {
            return R.layout.debug_panel_item_ad_unit;
        }
        throw new W1.m();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.E e4, int i4) {
        yx holder = (yx) e4;
        Intrinsics.checkNotNullParameter(holder, "holder");
        wx wxVar = (wx) getItem(i4);
        Intrinsics.checkNotNull(wxVar);
        holder.a(wxVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.E onCreateViewHolder(ViewGroup parent, int i4) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(i4, parent, false);
        wg2 wg2Var = this.f25928a;
        Intrinsics.checkNotNull(inflate);
        return wg2Var.a(inflate, i4);
    }
}
