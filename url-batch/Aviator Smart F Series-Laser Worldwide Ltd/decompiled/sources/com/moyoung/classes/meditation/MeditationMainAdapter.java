package com.moyoung.classes.meditation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.exifinterface.media.ExifInterface;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.R$string;
import com.moyoung.classes.meditation.localclass.LocalClassDetailActivity;
import com.moyoung.classes.meditation.localclass.LocalClassDoneActivity;
import com.moyoung.classes.meditation.localclass.model.LocalClassBean;
import com.moyoung.classes.meditation.localclass.model.MeditationLocalModel;
import com.moyoung.classes.meditation.model.MeditationTagBean;
import com.moyoung.classes.meditation.model.OnlineClassShortBean;
import com.moyoung.classes.meditation.onlineclass.OnlineClassDetailActivity;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.y;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class MeditationMainAdapter extends BaseQuickAdapter<MeditationTagBean, BaseViewHolder> {
    private final List<OnlineClassAdapter> childAdapterList;

    public static class LocalClassAdapter extends BaseQuickAdapter<LocalClassBean, BaseViewHolder> {
        Map<String, Object> whiteNoiseMap;

        public LocalClassAdapter() {
            super(R$layout.item_meditation_local_class);
            this.whiteNoiseMap = com.moyoung.dafit.module.common.network.provider.g.getInstance().getMap(LocalClassDoneActivity.RELAX_ID_WITH_WHITE_NOISE);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, LocalClassBean localClassBean) {
            baseViewHolder.setText(R$id.tv_class_title, localClassBean.getTitle());
            Picasso.get().load(localClassBean.getThumbResId()).resize(o.dp2px(254.0f), o.dp2px(180.0f)).centerCrop().placeholder(R$drawable.shape_net_img_placeholder).into((RoundedImageView) baseViewHolder.getView(R$id.iv_cover));
            int i8 = (Integer) this.whiteNoiseMap.get(String.valueOf(localClassBean.getId()));
            if (i8 == null) {
                i8 = 0;
            }
            baseViewHolder.setText(R$id.tv_white_noise_title, MeditationLocalModel.getWhiteNoiseById(i8).getTitle());
        }
    }

    public static class OnlineClassAdapter extends BaseQuickAdapter<OnlineClassShortBean, BaseViewHolder> {
        public OnlineClassAdapter() {
            super(R$layout.item_meditation_online_class);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, OnlineClassShortBean onlineClassShortBean) {
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_duration);
            textView.setText(onlineClassShortBean.getDuration() + l.SPACE + textView.getResources().getString(R$string.meditation_class_duration_unit));
            baseViewHolder.setText(R$id.tv_title, onlineClassShortBean.getTitle());
            com.moyoung.dafit.module.common.imageload.c.load((RoundedImageView) baseViewHolder.getView(R$id.iv_cover), onlineClassShortBean.getThumbUrl(), R$drawable.shape_net_img_placeholder, o.dp2px(121.0f), o.dp2px(121.0f));
        }
    }

    public MeditationMainAdapter() {
        super(R$layout.item_meditation_main);
        this.childAdapterList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$0(Context context, BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        LocalClassDetailActivity.start(context, (LocalClassBean) baseQuickAdapter.getData().get(i8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$1(Context context, View view) {
        y.openMindsootheAppDetailPage(context);
        s0.logEvent("冥想引流入口", "meditation_entry_type", ExifInterface.GPS_MEASUREMENT_3D);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$2(Context context, BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        OnlineClassDetailActivity.start(context, ((OnlineClassShortBean) baseQuickAdapter.getData().get(i8)).getId());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void refreshChildAdapter() {
        Iterator<OnlineClassAdapter> it = this.childAdapterList.iterator();
        while (it.hasNext()) {
            it.next().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, MeditationTagBean meditationTagBean) {
        baseViewHolder.setText(R$id.tv_title, meditationTagBean.getTitle());
        RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.rv_class);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        final Context context = recyclerView.getContext();
        if (meditationTagBean.isLocalClass() && meditationTagBean.getDataList() != null) {
            LocalClassAdapter localClassAdapter = new LocalClassAdapter();
            recyclerView.setAdapter(localClassAdapter);
            localClassAdapter.setNewData(meditationTagBean.getDataList());
            localClassAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.meditation.d
                @Override // com.chad.library.adapter.base.listener.OnItemClickListener
                public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                    MeditationMainAdapter.lambda$convert$0(context, baseQuickAdapter, view, i8);
                }
            });
            return;
        }
        OnlineClassAdapter onlineClassAdapter = new OnlineClassAdapter();
        recyclerView.setAdapter(onlineClassAdapter);
        onlineClassAdapter.setNewData(meditationTagBean.getDataList());
        CardView cardView = (CardView) baseViewHolder.getView(R$id.card_mindsoothe);
        y.initMindsootheCard(cardView);
        cardView.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeditationMainAdapter.lambda$convert$1(context, view);
            }
        });
        onlineClassAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.meditation.f
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                MeditationMainAdapter.lambda$convert$2(context, baseQuickAdapter, view, i8);
            }
        });
        if (this.childAdapterList.contains(onlineClassAdapter)) {
            return;
        }
        this.childAdapterList.add(onlineClassAdapter);
    }
}
