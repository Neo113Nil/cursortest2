package com.moyoung.classes.meditation.localclass;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$id;
import com.moyoung.classes.R$layout;
import com.moyoung.classes.databinding.ActivityMeditationLocalClassDetailBinding;
import com.moyoung.classes.meditation.localclass.LocalClassDetailActivity;
import com.moyoung.classes.meditation.localclass.model.LocalClassBean;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.squareup.picasso.Picasso;

/* loaded from: classes4.dex */
public class LocalClassDetailActivity extends BaseVBActivity<ActivityMeditationLocalClassDetailBinding> {
    private LocalClassBean localClassBean;

    public static class ActionAdapter extends BaseQuickAdapter<LocalClassBean.ActionMsg, BaseViewHolder> {
        public ActionAdapter() {
            super(R$layout.item_meditation_local_class_action);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ boolean lambda$convert$0(TextView textView, View view, MotionEvent motionEvent) {
            textView.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        @SuppressLint({"ClickableViewAccessibility"})
        public void convert(BaseViewHolder baseViewHolder, LocalClassBean.ActionMsg actionMsg) {
            int i8 = R$id.tv_title;
            baseViewHolder.setText(i8, LocalClassBean.ActionMsg.getActionTitle(baseViewHolder.getView(i8).getContext(), actionMsg.getActionType()));
            final TextView textView = (TextView) baseViewHolder.getView(R$id.tv_description);
            textView.setText(actionMsg.getDescription());
            textView.setMovementMethod(ScrollingMovementMethod.getInstance());
            textView.setOnTouchListener(new View.OnTouchListener() { // from class: com.moyoung.classes.meditation.localclass.f
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean lambda$convert$0;
                    lambda$convert$0 = LocalClassDetailActivity.ActionAdapter.lambda$convert$0(textView, view, motionEvent);
                    return lambda$convert$0;
                }
            });
            Picasso.get().load(actionMsg.getResId()).resize(com.moyoung.dafit.module.common.utils.o.dp2px(140.0f), com.moyoung.dafit.module.common.utils.o.dp2px(140.0f)).centerCrop().placeholder(R$drawable.shape_net_img_placeholder).into((ImageView) baseViewHolder.getView(R$id.iv_cover));
        }
    }

    public static class PostscriptAdapter extends BaseQuickAdapter<String, BaseViewHolder> {
        public PostscriptAdapter() {
            super(R$layout.item_meditation_local_class_postscript);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public void convert(BaseViewHolder baseViewHolder, String str) {
            baseViewHolder.setText(R$id.tv_description, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(View view) {
        LocalClassPlayActivity.start(this, this.localClassBean);
        s0.logEvent("点击白噪音放松开始", "meditationWhiteNoiseType", this.localClassBean.getTitle());
    }

    public static void start(Context context, LocalClassBean localClassBean) {
        Intent intent = new Intent(context, (Class<?>) LocalClassDetailActivity.class);
        intent.putExtra(LocalClassBean.class.getName(), localClassBean);
        context.startActivity(intent);
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected boolean getFitsSystemWindows() {
        return false;
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        k0.setDarkMode(getWindow());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        SpacesItemDecoration spacesItemDecoration = new SpacesItemDecoration(com.moyoung.dafit.module.common.utils.o.dp2px(this, 10.0f));
        ((ActivityMeditationLocalClassDetailBinding) this.binding).rvAction.setLayoutManager(linearLayoutManager);
        ((ActivityMeditationLocalClassDetailBinding) this.binding).rvAction.addItemDecoration(spacesItemDecoration);
        ((ActivityMeditationLocalClassDetailBinding) this.binding).rvPostscript.setLayoutManager(new LinearLayoutManager(this, 1, false));
        ((ActivityMeditationLocalClassDetailBinding) this.binding).ivClose.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassDetailActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivityMeditationLocalClassDetailBinding) this.binding).tvStart.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassDetailActivity.this.lambda$initBinding$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        LocalClassBean localClassBean = (LocalClassBean) getIntent().getSerializableExtra(LocalClassBean.class.getName());
        this.localClassBean = localClassBean;
        if (localClassBean == null) {
            return;
        }
        Picasso.get().load(this.localClassBean.getThumbResId()).resize(c5.d.getScreenWidth(this), com.moyoung.dafit.module.common.utils.o.dp2px(282.0f)).centerCrop().placeholder(R$drawable.shape_net_img_placeholder).into(((ActivityMeditationLocalClassDetailBinding) this.binding).ivThumb);
        ((ActivityMeditationLocalClassDetailBinding) this.binding).tvTitle.setText(this.localClassBean.getTitle());
        ((ActivityMeditationLocalClassDetailBinding) this.binding).tvDescription.setText(this.localClassBean.getDescription());
        ActionAdapter actionAdapter = new ActionAdapter();
        ((ActivityMeditationLocalClassDetailBinding) this.binding).rvAction.setAdapter(actionAdapter);
        actionAdapter.setNewData(this.localClassBean.getActionMsgList());
        PostscriptAdapter postscriptAdapter = new PostscriptAdapter();
        ((ActivityMeditationLocalClassDetailBinding) this.binding).rvPostscript.setAdapter(postscriptAdapter);
        postscriptAdapter.setNewData(this.localClassBean.getPostscriptList());
    }
}
