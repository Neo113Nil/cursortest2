package com.moyoung.classes.coach.adapter;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.coach.model.CoachActionPlayedBean;
import com.moyoung.classes.completed.model.ClassesHistoryModel;

/* loaded from: classes4.dex */
public class CoachActionPlayedAdapter extends BaseQuickAdapter<CoachActionPlayedBean, BaseViewHolder> {
    public CoachActionPlayedAdapter() {
        super(R$layout.item_coach_action_played);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, CoachActionPlayedBean coachActionPlayedBean) {
        String titleWithLocale = ClassesHistoryModel.getTitleWithLocale(coachActionPlayedBean.getActionNameLanguageList());
        if (TextUtils.isEmpty(titleWithLocale)) {
            titleWithLocale = coachActionPlayedBean.getActionName();
        }
        baseViewHolder.setText(R$id.tv_title, titleWithLocale);
        baseViewHolder.setText(R$id.tv_spent_time, c5.b.ms2MinuteSecondRoundStr(getContext(), coachActionPlayedBean.getSpentTimeMs()));
    }
}
