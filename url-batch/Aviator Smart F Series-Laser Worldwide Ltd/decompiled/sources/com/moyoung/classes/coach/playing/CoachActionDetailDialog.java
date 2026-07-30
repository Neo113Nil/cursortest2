package com.moyoung.classes.coach.playing;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$string;
import com.moyoung.classes.coach.model.CoachActionBean;
import com.moyoung.classes.coach.model.net.ActionDetailResp;
import com.moyoung.classes.databinding.DialogCoachActionDetailBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class CoachActionDetailDialog extends BaseVBBottomSheetDialog<DialogCoachActionDetailBinding> {
    private com.moyoung.classes.i classesModel;
    private f0 videoPlayer;

    public CoachActionDetailDialog(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showData$1(CoachActionBean coachActionBean, ActionDetailResp actionDetailResp) {
        if (actionDetailResp == null) {
            showNetError();
        } else {
            showActionDetail(actionDetailResp, coachActionBean);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showData$2(Throwable th) {
        showNetError();
    }

    private void showActionDetail(ActionDetailResp actionDetailResp, CoachActionBean coachActionBean) {
        ((DialogCoachActionDetailBinding) this.binding).tvTitle.setText(actionDetailResp.getName());
        ((DialogCoachActionDetailBinding) this.binding).tvDescription.setText(Html.fromHtml(actionDetailResp.getDescription()));
        Uri actionSourceUri = c5.a.getActionSourceUri(getContext(), coachActionBean.getActionVideo(), com.moyoung.dafit.module.common.utils.g0.getFileNameSuffixlessFromUrl(coachActionBean.getCourseZipUrl()));
        if (actionSourceUri == null) {
            Log.d("showActionDetail", "showActionDetail=uri == null");
            ((DialogCoachActionDetailBinding) this.binding).ivCover.setVisibility(0);
            com.moyoung.dafit.module.common.imageload.c.load((ImageView) ((DialogCoachActionDetailBinding) this.binding).ivCover, actionDetailResp.getPicture(), R$drawable.shape_net_img_placeholder, com.moyoung.dafit.module.common.utils.o.dp2px(375.0f), com.moyoung.dafit.module.common.utils.o.dp2px(282.0f));
            return;
        }
        if ("PortScreen".equals(((DialogCoachActionDetailBinding) this.binding).scrollView.getTag())) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((DialogCoachActionDetailBinding) this.binding).scrollView.getLayoutParams();
            layoutParams.height = com.moyoung.dafit.module.common.utils.o.dp2px(getContext(), 532.0f);
            ((DialogCoachActionDetailBinding) this.binding).scrollView.setLayoutParams(layoutParams);
        }
        ((DialogCoachActionDetailBinding) this.binding).videoView.setVisibility(0);
        ((DialogCoachActionDetailBinding) this.binding).videoView.findViewById(R$id.rl_exo_controller).setVisibility(8);
        this.videoPlayer = new f0(getContext(), ((DialogCoachActionDetailBinding) this.binding).videoView);
        ArrayList arrayList = new ArrayList();
        arrayList.add(actionSourceUri);
        this.videoPlayer.setVideoItemList(arrayList);
        this.videoPlayer.getVideoPlayer().setRepeatMode(2);
        this.videoPlayer.playVideo();
    }

    private void showNetError() {
        com.moyoung.dafit.module.common.utils.r0.showShort(getContext(), R$string.classes_network_exception);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        f0 f0Var = this.videoPlayer;
        if (f0Var != null) {
            f0Var.release();
            this.videoPlayer = null;
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    protected void initBinding() {
        ((DialogCoachActionDetailBinding) this.binding).videoView.findViewById(R$id.rl_exo_controller).setVisibility(4);
        ((DialogCoachActionDetailBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.coach.playing.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoachActionDetailDialog.this.lambda$initBinding$0(view);
            }
        });
    }

    @SuppressLint({"CheckResult"})
    public void showData(final CoachActionBean coachActionBean) {
        if (this.classesModel == null) {
            this.classesModel = new com.moyoung.classes.i();
        }
        this.classesModel.requestCoachActionDetail(coachActionBean.getId()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: com.moyoung.classes.coach.playing.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachActionDetailDialog.this.lambda$showData$1(coachActionBean, (ActionDetailResp) obj);
            }
        }, new Consumer() { // from class: com.moyoung.classes.coach.playing.c
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                CoachActionDetailDialog.this.lambda$showData$2((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.moyoung.dafit.module.common.baseui.BaseVBBottomSheetDialog
    public DialogCoachActionDetailBinding getViewBinding() {
        return DialogCoachActionDetailBinding.inflate(getLayoutInflater());
    }
}
