package com.moyoung.classes.coach.adapter;

import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.model.net.RelatedCourseResp;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes4.dex */
public class CoachRelatedCourseAdapter extends BaseQuickAdapter<RelatedCourseResp, BaseViewHolder> {
    public CoachRelatedCourseAdapter() {
        super(R$layout.item_coach_related_course);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, RelatedCourseResp relatedCourseResp) {
        baseViewHolder.setText(R$id.tv_title, relatedCourseResp.getName());
        baseViewHolder.setText(R$id.tv_duration, c5.b.ms2MinuteRoundStr(getContext(), relatedCourseResp.getTotal_time()));
        com.moyoung.dafit.module.common.imageload.c.load((ImageView) baseViewHolder.getView(R$id.iv_cover), relatedCourseResp.getPicture(), R$drawable.shape_net_img_placeholder, o.dp2px(117.0f), o.dp2px(77.0f));
    }
}
