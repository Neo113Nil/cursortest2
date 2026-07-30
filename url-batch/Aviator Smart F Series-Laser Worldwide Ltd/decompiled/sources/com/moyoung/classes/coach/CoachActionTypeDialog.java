package com.moyoung.classes.coach;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.moyoung.classes.coach.adapter.CoachActionTypeAdapter;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.CoachActionTypeBean;
import com.moyoung.classes.coach.model.CoachCourseBean;
import com.moyoung.classes.databinding.DialogCoachActionTypeBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import java.util.List;

/* loaded from: classes4.dex */
public class CoachActionTypeDialog extends BaseVBBottomSheetDialog<DialogCoachActionTypeBinding> {
    public CoachActionTypeDialog(Context context, CoachCourseBean coachCourseBean) {
        super(context);
        showData(coachCourseBean);
    }

    @SuppressLint({"SetTextI18n"})
    private void showData(CoachCourseBean coachCourseBean) {
        List<CoachActionBean> actionList = CoachActionBean.getActionList(coachCourseBean);
        ((DialogCoachActionTypeBinding) this.binding).tvMoves.setText(actionList.size() + "");
        ((DialogCoachActionTypeBinding) this.binding).tvDuration.setText(c5.b.ms2MinuteCeil((long) coachCourseBean.getTotalDuration()) + "");
        ((DialogCoachActionTypeBinding) this.binding).tvKcal.setText(coachCourseBean.getKcal() + "");
        ((DialogCoachActionTypeBinding) this.binding).tvLevel.setText(c5.b.getLevelStr(getContext(), coachCourseBean.getLevel()));
        showTypeList(coachCourseBean);
    }

    private void showTypeList(CoachCourseBean coachCourseBean) {
        List<CoachActionTypeBean> actionTypeBeanList = coachCourseBean.getActionTypeBeanList();
        ((DialogCoachActionTypeBinding) this.binding).rvType.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        ((DialogCoachActionTypeBinding) this.binding).rvType.addItemDecoration(new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(getContext(), 8.0f)));
        CoachActionTypeAdapter coachActionTypeAdapter = new CoachActionTypeAdapter();
        coachActionTypeAdapter.setNewData(actionTypeBeanList);
        ((DialogCoachActionTypeBinding) this.binding).rvType.setAdapter(coachActionTypeAdapter);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogCoachActionTypeBinding getViewBinding() {
        return DialogCoachActionTypeBinding.inflate(getLayoutInflater());
    }
}
