package com.moyoung.classes.coach;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Html;
import com.moyoung.classes.databinding.DialogCoachCourseDescriptionBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;

/* loaded from: classes4.dex */
public class CoachCourseDescriptionDialog extends BaseVBBottomSheetDialog<DialogCoachCourseDescriptionBinding> {
    public CoachCourseDescriptionDialog(Context context) {
        super(context);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
    }

    @SuppressLint({"SetTextI18n"})
    public void showData(String str) {
        ((DialogCoachCourseDescriptionBinding) this.binding).tvDescription.setText(Html.fromHtml(str));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogCoachCourseDescriptionBinding getViewBinding() {
        return DialogCoachCourseDescriptionBinding.inflate(getLayoutInflater());
    }
}
