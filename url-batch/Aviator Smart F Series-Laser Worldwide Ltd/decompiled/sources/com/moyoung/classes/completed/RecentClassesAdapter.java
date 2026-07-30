package com.moyoung.classes.completed;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.R$string;
import com.moyoung.classes.completed.model.ClassesHistoryModel;
import com.moyoung.classes.completed.model.ClassesRecentBean;
import com.moyoung.dafit.module.common.utils.o;

/* loaded from: classes4.dex */
public class RecentClassesAdapter extends BaseQuickAdapter<ClassesRecentBean, BaseViewHolder> {
    public RecentClassesAdapter() {
        super(R$layout.item_recent_class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NonNull BaseViewHolder baseViewHolder, ClassesRecentBean classesRecentBean) {
        baseViewHolder.setText(R$id.tv_title, ClassesHistoryModel.getTitleWithLocale(classesRecentBean.getTitleLanguageList()));
        TextView textView = (TextView) baseViewHolder.getView(R$id.tv_duration);
        textView.setText(c5.b.ms2MinuteCeil(classesRecentBean.getClassDuration()) + l.SPACE + textView.getResources().getString(R$string.meditation_class_duration_unit));
        com.moyoung.dafit.module.common.imageload.c.load((ImageView) baseViewHolder.getView(R$id.iv_cover), classesRecentBean.getThumbUrl(), R$drawable.shape_net_img_placeholder, o.dp2px(getContext(), 124.0f), o.dp2px(getContext(), 88.0f));
    }
}
