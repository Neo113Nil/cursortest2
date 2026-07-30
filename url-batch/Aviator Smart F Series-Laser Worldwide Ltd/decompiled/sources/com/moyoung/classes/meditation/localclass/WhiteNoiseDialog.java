package com.moyoung.classes.meditation.localclass;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.databinding.DialogWhiteNoiseBinding;
import com.moyoung.classes.meditation.localclass.model.WhiteNoiseBean;
import com.moyoung.dafit.module.common.baseui.BaseVBDialog;
import com.squareup.picasso.Picasso;
import java.util.List;

/* loaded from: classes4.dex */
public class WhiteNoiseDialog extends BaseVBDialog<DialogWhiteNoiseBinding> {
    private com.moyoung.classes.meditation.c audioPlayerUI;
    private a onDoneClickListener;
    private int selectedWhiteNoiseId;
    private WhiteNoiseAdapter whiteNoiseAdapter;
    private List<WhiteNoiseBean> whiteNoiseList;

    public static class WhiteNoiseAdapter extends BaseQuickAdapter<WhiteNoiseBean, BaseViewHolder> {
        public WhiteNoiseAdapter() {
            super(R$layout.item_meditation_white_noise);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, WhiteNoiseBean whiteNoiseBean) {
            baseViewHolder.setText(R$id.tv_title, whiteNoiseBean.getTitle());
            baseViewHolder.setVisible(R$id.anima, whiteNoiseBean.isSelected());
            baseViewHolder.setVisible(R$id.view_mask, whiteNoiseBean.isSelected());
            Picasso.get().load(whiteNoiseBean.getThumbResId()).resize(com.moyoung.dafit.module.common.utils.o.dp2px(100.0f), com.moyoung.dafit.module.common.utils.o.dp2px(94.0f)).into((ImageView) baseViewHolder.getView(R$id.iv_cover));
        }
    }

    public interface a {
        void onDone(int i8);
    }

    public WhiteNoiseDialog(Context context) {
        super(context);
        this.selectedWhiteNoiseId = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        setSelectedData(this.whiteNoiseList.get(i8).getId());
    }

    private void playAudio(WhiteNoiseBean whiteNoiseBean) {
        releasePlayer();
        com.moyoung.classes.meditation.c cVar = new com.moyoung.classes.meditation.c(getContext(), null);
        this.audioPlayerUI = cVar;
        cVar.setAudioWithUrl(WhiteNoiseBean.getAudioUrl(whiteNoiseBean.getAudioResId()));
        this.audioPlayerUI.setIsRepeat(true);
        this.audioPlayerUI.play();
    }

    private void releasePlayer() {
        com.moyoung.classes.meditation.c cVar = this.audioPlayerUI;
        if (cVar != null) {
            cVar.release();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        releasePlayer();
        a aVar = this.onDoneClickListener;
        if (aVar != null) {
            aVar.onDone(this.selectedWhiteNoiseId);
        }
    }

    public com.moyoung.classes.meditation.c getAudioPlayerUI() {
        return this.audioPlayerUI;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBDialog
    protected void initBinding() {
        ((DialogWhiteNoiseBinding) this.binding).viewClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WhiteNoiseDialog.this.lambda$initBinding$0(view);
            }
        });
        ((DialogWhiteNoiseBinding) this.binding).rv.setLayoutManager(new GridLayoutManager(getContext(), 3));
        WhiteNoiseAdapter whiteNoiseAdapter = new WhiteNoiseAdapter();
        this.whiteNoiseAdapter = whiteNoiseAdapter;
        ((DialogWhiteNoiseBinding) this.binding).rv.setAdapter(whiteNoiseAdapter);
        this.whiteNoiseAdapter.setOnItemClickListener(new OnItemClickListener() { // from class: com.moyoung.classes.meditation.localclass.s
            @Override // com.chad.library.adapter.base.listener.OnItemClickListener
            public final void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
                WhiteNoiseDialog.this.lambda$initBinding$1(baseQuickAdapter, view, i8);
            }
        });
    }

    public void setOnDoneClickListener(a aVar) {
        this.onDoneClickListener = aVar;
    }

    public void setSelectedData(int i8) {
        WhiteNoiseBean.findById(this.selectedWhiteNoiseId, this.whiteNoiseList).setSelected(false);
        this.selectedWhiteNoiseId = i8;
        WhiteNoiseBean findById = WhiteNoiseBean.findById(i8, this.whiteNoiseList);
        findById.setSelected(true);
        this.whiteNoiseAdapter.notifyDataSetChanged();
        ((DialogWhiteNoiseBinding) this.binding).ivBg.setImageResource(findById.getBgResId());
        try {
            c.imageViewBlurEffect(((DialogWhiteNoiseBinding) this.binding).ivBg, 25.0f);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        playAudio(findById);
    }

    public void setWhiteNoiseList(List<WhiteNoiseBean> list) {
        this.whiteNoiseList = list;
        this.whiteNoiseAdapter.setNewData(list);
    }
}
