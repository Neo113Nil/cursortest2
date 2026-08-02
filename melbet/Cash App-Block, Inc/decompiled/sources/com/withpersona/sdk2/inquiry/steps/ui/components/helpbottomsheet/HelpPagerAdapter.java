package com.withpersona.sdk2.inquiry.steps.ui.components.helpbottomsheet;

import android.view.ViewGroup;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.google.android.gms.maps.zzai;
import com.squareup.cash.wallet.views.CardAppletTile$$ExternalSyntheticLambda1;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.HelpBottomSheetComponentStyle;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.shared.AdapterHelper$ItemInfo;
import com.withpersona.sdk2.inquiry.shared.ViewBindingViewHolder;
import com.withpersona.sdk2.inquiry.shared.databinding.Pi2NavigationTroubleshootingTipsPageItemBinding;
import java.util.List;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import operations.logic.equals.Equals$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class HelpPagerAdapter extends RecyclerView.Adapter {
    public final zzai adapterHelper;
    public static final String[] STROKE_COLORS = {"#02099C", "#030A9C", "#020A9B", "#02089B"};
    public static final String[] FILL_COLORS = {"#D3D5FF", "#D4D6FF", "#D3D6FF", "#D2D4FF", "#7379FC"};
    public static final String[] BACKGROUND_COLORS = {"#7379FD"};

    public HelpPagerAdapter(HelpBottomSheetComponentStyle helpBottomSheetComponentStyle) {
        zzai zzaiVar = new zzai(new Equals$$ExternalSyntheticLambda0(17));
        ReflectionFactory reflectionFactory = Reflection.factory;
        zzaiVar.addItemTypeInternal(reflectionFactory.getOrCreateKotlinClass(HelpPagerItem.class), reflectionFactory.getOrCreateKotlinClass(Pi2NavigationTroubleshootingTipsPageItemBinding.class), HelpPagerAdapter$adapterHelper$2$1.INSTANCE, new CardAppletTile$$ExternalSyntheticLambda1(helpBottomSheetComponentStyle, 26));
        this.adapterHelper = zzaiVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((AsyncListDiffer) this.adapterHelper.zza).mReadOnlyList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        viewHolder.getClass();
        zzai zzaiVar = this.adapterHelper;
        zzaiVar.getClass();
        AdapterHelper$ItemInfo itemInfoFromPosition = zzaiVar.getItemInfoFromPosition(i);
        ViewBinding viewBinding = ((ViewBindingViewHolder) viewHolder).binding;
        AdapterHelper$$ExternalSyntheticLambda0 adapterHelper$$ExternalSyntheticLambda0 = itemInfoFromPosition.bindViewHolder;
        List list = ((AsyncListDiffer) zzaiVar.zza).mReadOnlyList;
        list.getClass();
        adapterHelper$$ExternalSyntheticLambda0.invoke(list.get(i), viewBinding, viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        return this.adapterHelper.onCreateViewHolder(viewGroup, i);
    }
}
