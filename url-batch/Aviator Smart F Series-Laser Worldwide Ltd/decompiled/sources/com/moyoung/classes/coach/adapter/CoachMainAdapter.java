package com.moyoung.classes.coach.adapter;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.TextView;
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
import com.moyoung.classes.coach.CoachCourseDetailActivity;
import com.moyoung.classes.coach.model.CoachCourseTagBean;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.widgets.roundedimageview.RoundedImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachMainAdapter extends BaseQuickAdapter<CoachCourseTagBean, BaseViewHolder> {
    private final List<CourseShortAdapter> childAdapterList;

    public static class CourseShortAdapter extends BaseQuickAdapter<CoachCourseTagBean.CoachCourseShortBean, BaseViewHolder> {
        public CourseShortAdapter() {
            super(R$layout.item_coach_course_short);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, CoachCourseTagBean.CoachCourseShortBean coachCourseShortBean) {
            TextView textView = (TextView) baseViewHolder.getView(R$id.tv_duration);
            textView.setText(c5.b.ms2MinuteCeil(coachCourseShortBean.getTotalDuration()) + l.SPACE + textView.getResources().getString(R$string.meditation_class_duration_unit));
            TextView textView2 = (TextView) baseViewHolder.getView(R$id.tv_level);
            textView2.setText(c5.b.getLevelStr(getContext(), coachCourseShortBean.getLevel()));
            textView2.setBackgroundResource(coachCourseShortBean.getLevel() == 2 ? R$drawable.shape_coach_level_lv2 : coachCourseShortBean.getLevel() == 1 ? R$drawable.shape_coach_level_lv1 : R$drawable.shape_coach_level_lv0);
            baseViewHolder.setText(R$id.tv_title, coachCourseShortBean.getTitle());
            com.moyoung.dafit.module.common.imageload.c.load((RoundedImageView) baseViewHolder.getView(R$id.iv_cover), coachCourseShortBean.getThumbUrl(), R$drawable.shape_net_img_placeholder, o.dp2px(164.0f), o.dp2px(116.0f));
        }
    }

    public CoachMainAdapter() {
        super(R$layout.item_coach_main);
        this.childAdapterList = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$convert$0(RecyclerView recyclerView, BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        CoachCourseDetailActivity.start(recyclerView.getContext(), ((CoachCourseTagBean.CoachCourseShortBean) baseQuickAdapter.getData().get(i8)).getId());
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public void refreshChildAdapter() {
        Iterator<CourseShortAdapter> it = this.childAdapterList.iterator();
        while (it.hasNext()) {
            it.next().notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, CoachCourseTagBean coachCourseTagBean) {
        baseViewHolder.setText(R$id.tv_title, coachCourseTagBean.getTitle());
        final RecyclerView recyclerView = (RecyclerView) baseViewHolder.getView(R$id.rv_class);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        CourseShortAdapter courseShortAdapter = new CourseShortAdapter();
        recyclerView.setAdapter(courseShortAdapter);
        courseShortAdapter.setNewData(coachCourseTagBean.getCourseShortList());
        courseShortAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.coach.adapter.d
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                CoachMainAdapter.lambda$convert$0(RecyclerView.this, baseQuickAdapter, view, i8);
            }
        });
        if (this.childAdapterList.contains(courseShortAdapter)) {
            return;
        }
        this.childAdapterList.add(courseShortAdapter);
    }
}
