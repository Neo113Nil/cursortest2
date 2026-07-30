package com.moyoung.classes.coach.adapter;

import android.content.DialogInterface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.CoachActionTypeBean;
import com.moyoung.classes.coach.playing.CoachActionDetailDialog;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;

/* loaded from: classes4.dex */
public class CoachActionTypeAdapter extends BaseQuickAdapter<CoachActionTypeBean, BaseViewHolder> {

    public static class CoachActionInTypeAdapter extends BaseQuickAdapter<CoachActionBean, BaseViewHolder> {
        public CoachActionInTypeAdapter() {
            super(R$layout.item_coach_action_in_type);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, CoachActionBean coachActionBean) {
            ((TextView) baseViewHolder.getView(R$id.tv_duration)).setText(coachActionBean.isShowRepeatCount() ? c5.b.getRepeatCountStr(getContext(), coachActionBean.getRepeatCount()) : c5.b.ms2MinuteSecondRoundStr(getContext(), coachActionBean.getActionDurationMs()));
            baseViewHolder.setText(R$id.tv_title, coachActionBean.getTitle());
            com.moyoung.dafit.module.common.imageload.c.load((RoundedImageView) baseViewHolder.getView(R$id.iv_cover), coachActionBean.getCoverUrl(), R$drawable.shape_net_img_placeholder, o.dp2px(117.0f), o.dp2px(77.0f));
            LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R$id.ll_rest);
            if (coachActionBean.getRestDuration() <= 0) {
                linearLayout.setVisibility(8);
            } else {
                linearLayout.setVisibility(0);
                baseViewHolder.setText(R$id.tv_rest_duration, c5.b.ms2MinuteSecondRoundStr(getContext(), coachActionBean.getRestDuration()));
            }
        }
    }

    public CoachActionTypeAdapter() {
        super(R$layout.item_coach_action_type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$2(RecyclerView recyclerView, BaseQuickAdapter baseQuickAdapter, final View view, int i8) {
        CoachActionBean coachActionBean = (CoachActionBean) baseQuickAdapter.getData().get(i8);
        CoachActionDetailDialog coachActionDetailDialog = new CoachActionDetailDialog(recyclerView.getContext());
        coachActionDetailDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.adapter.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                view.setClickable(false);
            }
        });
        coachActionDetailDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.coach.adapter.b
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                view.setClickable(true);
            }
        });
        coachActionDetailDialog.showData(coachActionBean);
        coachActionDetailDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, CoachActionTypeBean coachActionTypeBean) {
        baseViewHolder.setText(R$id.tv_title, coachActionTypeBean.getTypeTitle());
        final RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.rv_action);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        CoachActionInTypeAdapter coachActionInTypeAdapter = new CoachActionInTypeAdapter();
        recyclerView.setAdapter(coachActionInTypeAdapter);
        coachActionInTypeAdapter.setNewData(coachActionTypeBean.getActionBeanList());
        coachActionInTypeAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.coach.adapter.c
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                CoachActionTypeAdapter.lambda$convert$2(RecyclerView.this, baseQuickAdapter, view, i8);
            }
        });
    }
}
