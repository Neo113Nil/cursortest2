package com.crrepa.band.my.device.ai.chat;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.ai.chat.AIChatRecordsAdapter;
import com.crrepa.band.my.device.ai.chat.model.AIChatRecordEntity;
import com.crrepa.band.my.device.ai.chat.model.AIChatRecordProxy;
import com.crrepa.band.my.device.ai.helper.AIProvider;
import com.crrepa.band.my.device.ai.tts.AITTSPlayer;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* loaded from: classes2.dex */
public class AIChatRecordsAdapter extends BaseQuickAdapter<AIChatRecordEntity, BaseViewHolder> {
    private static final long SCROLL_DELAY = 300;
    private static long lastScrollTime;
    private final io.noties.markwon.e markwon;
    private final AIChatRecordProxy recordProxy;

    class a implements AITTSPlayer.b {
        final /* synthetic */ LottieAnimationView val$animTtsLoading;
        final /* synthetic */ LottieAnimationView val$animTtsPlaying;
        final /* synthetic */ AIChatRecordEntity val$item;
        final /* synthetic */ TextView val$tvTtsPlay;

        a(AIChatRecordEntity aIChatRecordEntity, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView) {
            this.val$item = aIChatRecordEntity;
            this.val$animTtsPlaying = lottieAnimationView;
            this.val$animTtsLoading = lottieAnimationView2;
            this.val$tvTtsPlay = textView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAudioCreated$0(AIChatRecordEntity aIChatRecordEntity, String str, String str2) {
            aIChatRecordEntity.setTtsFilePath(str);
            AIChatRecordsAdapter.this.updateRecordForDB(aIChatRecordEntity);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onPlaying$1(AIChatRecordEntity aIChatRecordEntity, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView, String str) {
            com.crrepa.band.my.device.ai.tts.e.e(this);
            aIChatRecordEntity.setIsTtsPlaying(true);
            AIChatRecordsAdapter.renderTtsPlaying(lottieAnimationView, lottieAnimationView2, textView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onTtsRequestFailed$2(AIChatRecordEntity aIChatRecordEntity, LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView, String str) {
            com.crrepa.band.my.device.ai.tts.e.f(this);
            aIChatRecordEntity.setIsTtsPlaying(false);
            AIChatRecordsAdapter.renderTtsPlayFailed(lottieAnimationView, lottieAnimationView2, textView);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        @SuppressLint({"CheckResult"})
        public void onAudioCreated(final String str) {
            Observable observeOn = Observable.just("").observeOn(AndroidSchedulers.mainThread());
            final AIChatRecordEntity aIChatRecordEntity = this.val$item;
            observeOn.subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ai.chat.t
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AIChatRecordsAdapter.a.this.lambda$onAudioCreated$0(aIChatRecordEntity, str, (String) obj);
                }
            });
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public void onAudioRequesting() {
            this.val$item.setIsTtsPlaying(true);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public void onPlayEnded() {
            com.crrepa.band.my.device.ai.tts.e.c(this);
            this.val$item.setIsTtsPlaying(false);
            AIChatRecordsAdapter.renderTtsNotPlayed(this.val$animTtsPlaying, this.val$animTtsLoading, this.val$tvTtsPlay);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        public void onPlayStopped() {
            com.crrepa.band.my.device.ai.tts.e.d(this);
            this.val$item.setIsTtsPlaying(false);
            AIChatRecordsAdapter.renderTtsNotPlayed(this.val$animTtsPlaying, this.val$animTtsLoading, this.val$tvTtsPlay);
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        @SuppressLint({"CheckResult"})
        public void onPlaying() {
            Observable observeOn = Observable.just("").observeOn(AndroidSchedulers.mainThread());
            final AIChatRecordEntity aIChatRecordEntity = this.val$item;
            final LottieAnimationView lottieAnimationView = this.val$animTtsPlaying;
            final LottieAnimationView lottieAnimationView2 = this.val$animTtsLoading;
            final TextView textView = this.val$tvTtsPlay;
            observeOn.subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ai.chat.v
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AIChatRecordsAdapter.a.this.lambda$onPlaying$1(aIChatRecordEntity, lottieAnimationView, lottieAnimationView2, textView, (String) obj);
                }
            });
        }

        @Override // com.crrepa.band.my.device.ai.tts.AITTSPlayer.b
        @SuppressLint({"CheckResult"})
        public void onTtsRequestFailed() {
            Observable observeOn = Observable.just("").observeOn(AndroidSchedulers.mainThread());
            final AIChatRecordEntity aIChatRecordEntity = this.val$item;
            final LottieAnimationView lottieAnimationView = this.val$animTtsPlaying;
            final LottieAnimationView lottieAnimationView2 = this.val$animTtsLoading;
            final TextView textView = this.val$tvTtsPlay;
            observeOn.subscribe(new Consumer() { // from class: com.crrepa.band.my.device.ai.chat.u
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    AIChatRecordsAdapter.a.this.lambda$onTtsRequestFailed$2(aIChatRecordEntity, lottieAnimationView, lottieAnimationView2, textView, (String) obj);
                }
            });
        }
    }

    public AIChatRecordsAdapter(AIChatRecordProxy aIChatRecordProxy) {
        super(R.layout.item_ai_chat_records);
        this.recordProxy = aIChatRecordProxy;
        this.markwon = io.noties.markwon.e.create(com.moyoung.dafit.module.common.utils.d.get());
    }

    private void initOperationUI(RelativeLayout relativeLayout, final AIChatRecordEntity aIChatRecordEntity) {
        if (aIChatRecordEntity.isResponseEnded()) {
            relativeLayout.setVisibility(0);
        } else {
            relativeLayout.setVisibility(8);
        }
        ((ImageView) relativeLayout.findViewById(R.id.iv_txt_copy)).setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIChatRecordsAdapter.lambda$initOperationUI$0(AIChatRecordEntity.this, view);
            }
        });
        renderTtsUI(relativeLayout, aIChatRecordEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$initOperationUI$0(AIChatRecordEntity aIChatRecordEntity, View view) {
        com.moyoung.dafit.module.common.utils.l.copyText(aIChatRecordEntity.getMsg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$renderTtsUI$1(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView, View view) {
        if (lottieAnimationView.getVisibility() == 0) {
            return;
        }
        AITTSPlayer.INSTANCE.stopTts();
        renderTtsNotPlayed(lottieAnimationView2, lottieAnimationView, textView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$renderTtsUI$2(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView, AIChatRecordEntity aIChatRecordEntity, View view) {
        if (lottieAnimationView.getVisibility() == 0) {
            return;
        }
        renderTtsRequesting(lottieAnimationView2, lottieAnimationView, textView);
        AITTSPlayer.INSTANCE.playTxtAudio(aIChatRecordEntity.getMsg(), aIChatRecordEntity.getTtsFilePath(), new a(aIChatRecordEntity, lottieAnimationView2, lottieAnimationView, textView));
        com.crrepa.band.my.device.ai.helper.d.logTTSEvent(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void renderTtsNotPlayed(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView) {
        lottieAnimationView.setVisibility(8);
        lottieAnimationView2.setVisibility(8);
        textView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void renderTtsPlayFailed(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView) {
        lottieAnimationView.setVisibility(8);
        lottieAnimationView2.setVisibility(8);
        textView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void renderTtsPlaying(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView) {
        lottieAnimationView.setVisibility(0);
        lottieAnimationView2.setVisibility(8);
        textView.setVisibility(8);
    }

    private static void renderTtsRequesting(LottieAnimationView lottieAnimationView, LottieAnimationView lottieAnimationView2, TextView textView) {
        lottieAnimationView.setVisibility(8);
        lottieAnimationView2.setVisibility(0);
        textView.setVisibility(8);
    }

    private void renderTtsUI(RelativeLayout relativeLayout, final AIChatRecordEntity aIChatRecordEntity) {
        RelativeLayout relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(R.id.rl_tts);
        if (AIProvider.getProviderType() == 1) {
            relativeLayout2.setVisibility(8);
            return;
        }
        relativeLayout2.setVisibility(0);
        final TextView textView = (TextView) relativeLayout.findViewById(R.id.tv_tts_play);
        final LottieAnimationView lottieAnimationView = (LottieAnimationView) relativeLayout.findViewById(R.id.anim_tts_playing);
        final LottieAnimationView lottieAnimationView2 = (LottieAnimationView) relativeLayout.findViewById(R.id.anim_tts_loading);
        lottieAnimationView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIChatRecordsAdapter.lambda$renderTtsUI$1(LottieAnimationView.this, lottieAnimationView, textView, view);
            }
        });
        if (aIChatRecordEntity.isTtsPlaying()) {
            renderTtsPlaying(lottieAnimationView, lottieAnimationView2, textView);
        } else {
            renderTtsNotPlayed(lottieAnimationView, lottieAnimationView2, textView);
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.ai.chat.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AIChatRecordsAdapter.this.lambda$renderTtsUI$2(lottieAnimationView2, lottieAnimationView, textView, aIChatRecordEntity, view);
            }
        });
    }

    public static void safeScrollToBottom(RecyclerView recyclerView) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - lastScrollTime > 300) {
            scrollToBottom(recyclerView);
            lastScrollTime = currentTimeMillis;
        }
    }

    public static void scrollToBottom(RecyclerView recyclerView) {
        if (recyclerView == null || recyclerView.getAdapter() == null) {
            return;
        }
        recyclerView.scrollToPosition(recyclerView.getAdapter().getItemCount() - 1);
    }

    public void addAndSaveNewRecord(AIChatRecordEntity aIChatRecordEntity) {
        addData((AIChatRecordsAdapter) aIChatRecordEntity);
        this.recordProxy.save(aIChatRecordEntity);
    }

    public void updateRecordForDB(AIChatRecordEntity aIChatRecordEntity) {
        this.recordProxy.update(aIChatRecordEntity);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, AIChatRecordEntity aIChatRecordEntity) {
        String msg = aIChatRecordEntity.getMsg();
        TextView textView = (TextView) baseViewHolder.getView(R.id.tv_me);
        TextView textView2 = (TextView) baseViewHolder.getView(R.id.tv_gpt);
        RelativeLayout relativeLayout = (RelativeLayout) baseViewHolder.getView(R.id.rl_gpt);
        RelativeLayout relativeLayout2 = (RelativeLayout) baseViewHolder.getView(R.id.rl_operation);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) baseViewHolder.getView(R.id.anim_answer_loading);
        if (aIChatRecordEntity.isMe()) {
            textView.setText(msg);
            textView.setVisibility(0);
            relativeLayout.setVisibility(8);
            relativeLayout2.setVisibility(8);
            return;
        }
        textView.setVisibility(8);
        relativeLayout.setVisibility(0);
        if (TextUtils.isEmpty(msg)) {
            textView2.setVisibility(8);
            lottieAnimationView.setVisibility(0);
            relativeLayout2.setVisibility(8);
        } else {
            this.markwon.setMarkdown(textView2, msg);
            textView2.setVisibility(0);
            lottieAnimationView.setVisibility(8);
            initOperationUI(relativeLayout2, aIChatRecordEntity);
        }
    }
}
