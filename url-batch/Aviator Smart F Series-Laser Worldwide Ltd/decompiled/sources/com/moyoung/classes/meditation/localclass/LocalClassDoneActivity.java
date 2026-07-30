package com.moyoung.classes.meditation.localclass;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.moyoung.classes.R$drawable;
import com.moyoung.classes.R$string;
import com.moyoung.classes.completed.ClassesHistoryAdapter;
import com.moyoung.classes.databinding.ActivityMeditationLocalClassDoneBinding;
import com.moyoung.classes.meditation.localclass.model.LocalClassBean;
import com.moyoung.classes.meditation.localclass.model.LocalClassDoneEvent;
import com.moyoung.classes.meditation.localclass.model.MeditationLocalModel;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.dafit.module.common.utils.s0;
import com.squareup.picasso.Picasso;
import java.util.Date;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public class LocalClassDoneActivity extends BaseVBActivity<ActivityMeditationLocalClassDoneBinding> {
    public static final String RELAX_ID_WITH_DURATION = "relax_id_with_duration";
    public static final String RELAX_ID_WITH_WHITE_NOISE = "relax_id_with_white_noise";

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        s0.logEvent("点击白噪音放松done", "meditationWhiteNoiseType", ((ActivityMeditationLocalClassDoneBinding) this.binding).tvTitle.getText().toString());
        finish();
    }

    private static void recordRecentPlayedClass(int i8, int i9, int i10) {
        LinkedHashMap<String, Object> map = com.moyoung.dafit.module.common.network.provider.g.getInstance().getMap(RELAX_ID_WITH_WHITE_NOISE);
        map.put(String.valueOf(i8), Integer.valueOf(i9));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putMap(RELAX_ID_WITH_WHITE_NOISE, map);
        LinkedHashMap<String, Object> map2 = com.moyoung.dafit.module.common.network.provider.g.getInstance().getMap(RELAX_ID_WITH_DURATION);
        map2.put(String.valueOf(i8), Integer.valueOf(i10));
        com.moyoung.dafit.module.common.network.provider.g.getInstance().putMap(RELAX_ID_WITH_DURATION, map2);
        org.greenrobot.eventbus.c.getDefault().post(new LocalClassDoneEvent());
    }

    public static void start(Context context, LocalClassBean localClassBean, int i8, int i9, int i10) {
        Intent intent = new Intent(context, (Class<?>) LocalClassDoneActivity.class);
        intent.putExtra(LocalClassBean.class.getName(), localClassBean);
        intent.putExtra("whiteNoiseId", i8);
        intent.putExtra("classDuration", i9);
        intent.putExtra("classPlayedDuration", i10);
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
        ((ActivityMeditationLocalClassDoneBinding) this.binding).tvDone.setOnClickListener(new View.OnClickListener() { // from class: com.moyoung.classes.meditation.localclass.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LocalClassDoneActivity.this.lambda$initBinding$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void loadData() {
        super.loadData();
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("whiteNoiseId", 0);
        LocalClassBean localClassBean = (LocalClassBean) intent.getSerializableExtra(LocalClassBean.class.getName());
        int intExtra2 = intent.getIntExtra("classDuration", 1);
        int intExtra3 = intent.getIntExtra("classPlayedDuration", 1);
        ((ActivityMeditationLocalClassDoneBinding) this.binding).tvTitle.setText(localClassBean.getTitle());
        ((ActivityMeditationLocalClassDoneBinding) this.binding).tvCompliment.setText(localClassBean.getId() == 0 ? R$string.stressed_compliment : R$string.asleep_compliment);
        ((ActivityMeditationLocalClassDoneBinding) this.binding).tvBreathedDuration.setText(getString(R$string.meditation_class_breath_for, Integer.valueOf(intExtra3)));
        ((ActivityMeditationLocalClassDoneBinding) this.binding).tvDate.setText(com.moyoung.dafit.module.common.utils.m.format(new Date(), getString(ClassesHistoryAdapter.is12HourTime(getApplicationContext()) ? R$string.classes_time_format_12 : R$string.classes_time_format_24)));
        Picasso.get().load(MeditationLocalModel.getWhiteNoiseById(Integer.valueOf(intExtra)).getBgResId()).resize(c5.d.getScreenWidth(this), c5.d.getScreenHeight(this)).centerCrop().placeholder(R$drawable.shape_net_img_placeholder).into(((ActivityMeditationLocalClassDoneBinding) this.binding).ivBg);
        try {
            c.imageViewBlurEffect(((ActivityMeditationLocalClassDoneBinding) this.binding).ivBg, 25.0f);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        recordRecentPlayedClass(localClassBean.getId(), intExtra, intExtra2);
    }
}
