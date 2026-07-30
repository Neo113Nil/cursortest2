package com.moyoung.classes.coach.adapter;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes4.dex */
public class CoachActionAdapter extends BaseQuickAdapter<CoachActionBean, BaseViewHolder> {
    public CoachActionAdapter() {
        super(R$layout.item_coach_action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, CoachActionBean coachActionBean) {
        baseViewHolder.setText(R$id.tv_title, coachActionBean.getTitle());
        com.moyoung.dafit.module.common.imageload.c.load((ImageView) baseViewHolder.getView(R$id.iv_cover), coachActionBean.getCoverUrl(), R$drawable.shape_net_img_placeholder, o.dp2px(126.0f), o.dp2px(78.0f));
    }
}
