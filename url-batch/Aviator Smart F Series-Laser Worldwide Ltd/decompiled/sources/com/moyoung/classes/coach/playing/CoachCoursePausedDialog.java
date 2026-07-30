package com.moyoung.classes.coach.playing;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.view.View;
import androidx.annotation.NonNull;
import com.moyoung.classes.R$color;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.event.CoachCompletedCourseEvent;
import com.moyoung.classes.coach.model.event.CoachContinueActionEvent;
import com.moyoung.classes.coach.model.event.CoachStopCourseEvent;
import com.moyoung.classes.databinding.DialogCoachCoursePausedBinding;
import com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;

/* loaded from: classes4.dex */
public class CoachCoursePausedDialog extends BaseVBBottomSheetDialog<DialogCoachCoursePausedBinding> {
    public static final int COURSE_COMPLETE_LEAST_SECONDS = 120;
    private final CoachActionBean actionBean;
    private final String actionPlayedPercent;
    private final int spentTime;

    public CoachCoursePausedDialog(Context context, CoachActionBean coachActionBean, String str, int i8) {
        super(context);
        this.actionBean = coachActionBean;
        this.actionPlayedPercent = str;
        this.spentTime = i8;
        loadData();
    }

    private CoachActionBean getCoachActionBean() {
        return this.actionBean;
    }

    @NonNull
    public static BaseCustomConfirmDialog getIsContinueDialog(Context context) {
        BaseCustomConfirmDialog baseCustomConfirmDialog = new BaseCustomConfirmDialog(context);
        baseCustomConfirmDialog.setNoTitleMode();
        baseCustomConfirmDialog.setContentTxt(context.getString(R$string.fitness_end_less_than_dialog_title));
        baseCustomConfirmDialog.setOkTxt(context.getString(R$string.fitness_end_less_than_dialog_continue));
        baseCustomConfirmDialog.setCancelTxt(context.getString(R$string.fitness_end_less_than_dialog_stop));
        baseCustomConfirmDialog.getOkTv().setTextColor(context.getResources().getColor(R$color.main));
        baseCustomConfirmDialog.getTitleTv().setTextSize(2, 17.0f);
        baseCustomConfirmDialog.getTitleTv().setTypeface(Typeface.defaultFromStyle(0));
        return baseCustomConfirmDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(DialogInterface dialogInterface) {
        ((DialogCoachCoursePausedBinding) this.binding).tvActionDetail.setClickable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(DialogInterface dialogInterface) {
        ((DialogCoachCoursePausedBinding) this.binding).tvActionDetail.setClickable(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$2(View view) {
        CoachActionBean coachActionBean = getCoachActionBean();
        CoachActionDetailDialog coachActionDetailDialog = new CoachActionDetailDialog(getContext());
        coachActionDetailDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.moyoung.classes.coach.playing.h
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoachCoursePausedDialog.this.lambda$initBinding$0(dialogInterface);
            }
        });
        coachActionDetailDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.moyoung.classes.coach.playing.i
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoachCoursePausedDialog.this.lambda$initBinding$1(dialogInterface);
            }
        });
        coachActionDetailDialog.showData(coachActionBean);
        coachActionDetailDialog.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$3(View view) {
        org.greenrobot.eventbus.c.getDefault().post(new CoachContinueActionEvent());
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$4(View view) {
        if (this.spentTime < 120) {
            showContinueDialog();
        } else {
            org.greenrobot.eventbus.c.getDefault().post(new CoachCompletedCourseEvent());
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showContinueDialog$5() {
        org.greenrobot.eventbus.c.getDefault().post(new CoachStopCourseEvent());
        dismiss();
        dismiss();
    }

    private void showContinueDialog() {
        final BaseCustomConfirmDialog isContinueDialog = getIsContinueDialog(getContext());
        isContinueDialog.setOnCancelClick(new BaseCustomConfirmDialog.a() { // from class: com.moyoung.classes.coach.playing.j
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.a
            public final void onCancel() {
                CoachCoursePausedDialog.this.lambda$showContinueDialog$5();
            }
        });
        isContinueDialog.setOnOkClick(new BaseCustomConfirmDialog.b() { // from class: com.moyoung.classes.coach.playing.k
            @Override // com.moyoung.dafit.module.common.baseui.BaseCustomConfirmDialog.b
            public final void onConfirm() {
                BaseCustomConfirmDialog.this.dismiss();
            }
        });
        isContinueDialog.show();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
        ((DialogCoachCoursePausedBinding) this.binding).tvActionDetail.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCoursePausedDialog.this.lambda$initBinding$2(view);
            }
        });
        ((DialogCoachCoursePausedBinding) this.binding).ivContinue.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCoursePausedDialog.this.lambda$initBinding$3(view);
            }
        });
        ((DialogCoachCoursePausedBinding) this.binding).ivStop.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachCoursePausedDialog.this.lambda$initBinding$4(view);
            }
        });
    }

    @SuppressLint({"SetTextI18n"})
    protected void loadData() {
        CoachActionBean coachActionBean = getCoachActionBean();
        ((DialogCoachCoursePausedBinding) this.binding).tvTitle.setText(coachActionBean.getTitle());
        com.moyoung.dafit.module.common.imageload.c.load(((DialogCoachCoursePausedBinding) this.binding).ivCover, coachActionBean.getCoverUrl(), R$drawable.shape_net_img_placeholder, com.moyoung.dafit.module.common.utils.o.dp2px(375.0f), com.moyoung.dafit.module.common.utils.o.dp2px(282.0f));
        ((DialogCoachCoursePausedBinding) this.binding).tvProgress.setText(getContext().getString(R$string.fitness_current_action_text) + cn.hutool.core.text.l.SPACE + this.actionPlayedPercent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog, android.app.Dialog
    public void show() {
        getWindow().setDimAmount(1.0f);
        super.show();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogCoachCoursePausedBinding getViewBinding() {
        return DialogCoachCoursePausedBinding.inflate(getLayoutInflater());
    }
}
