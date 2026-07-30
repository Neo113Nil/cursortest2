package com.crrepa.band.my.health.physiologicalcycle;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.ActivityPhysiologicalGuideBinding;
import com.moyoung.dafit.module.common.baseui.BaseSlideActivity;
import com.moyoung.dafit.module.common.utils.k0;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class PhysiologicalGuideActivity extends BaseSlideActivity<ActivityPhysiologicalGuideBinding> {
    private static final String FIRST_GUIDE = "first_guide";
    private boolean isFirstGuide = true;

    public static Intent getCallingIntent(Context context, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) PhysiologicalGuideActivity.class);
        intent.putExtra(FIRST_GUIDE, z7);
        return intent;
    }

    private void initView() {
        if (w2.b.isGuideComplete()) {
            ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setText(R.string.done);
        } else {
            ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setText(R.string.start);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        onBackPressedSupport();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$1(View view) {
        if (this.isFirstGuide && !w2.b.isGuideComplete()) {
            start(PhysiologicalGuideSettingFragment.newInstance());
            renderButtonEnable(false);
        } else {
            org.greenrobot.eventbus.c.getDefault().post(new v2.c());
            startActivity(new Intent(this, (Class<?>) PhysiologicalCalendarActivity.class));
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setTitle$2(View view) {
        onBackPressed();
    }

    private void setTitle() {
        ((ActivityPhysiologicalGuideBinding) this.binding).tvTitle.setText(R.string.physiological_guide_title);
        ((ActivityPhysiologicalGuideBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalGuideActivity.this.lambda$setTitle$2(view);
            }
        });
        if (getIntent().getBooleanExtra(FIRST_GUIDE, true)) {
            ((ActivityPhysiologicalGuideBinding) this.binding).tvTitle.setText(R.string.physiological_guide_title);
        } else {
            ((ActivityPhysiologicalGuideBinding) this.binding).tvTitle.setText(R.string.physiological_cycle_setting_title);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        org.greenrobot.eventbus.c.getDefault().register(this);
        k0.setDarkMode(this);
        k0.setColorNoTranslucent(this, ContextCompat.getColor(this, R.color.color_physiological_title_bg));
        setTitle();
        initView();
        loadRootFragment(R.id.physiological_guide_content, w2.b.isGuideComplete() ? PhysiologicalGuideSettingFragment.newInstance() : PhysiologicalGuideFirstFragment.newInstance());
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((ActivityPhysiologicalGuideBinding) this.binding).ivTitleBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalGuideActivity.this.lambda$initOnClickListener$0(view);
            }
        });
        ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.physiologicalcycle.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhysiologicalGuideActivity.this.lambda$initOnClickListener$1(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        org.greenrobot.eventbus.c.getDefault().unregister(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onSettingFinish(v2.a aVar) {
        ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setEnabled(true);
        if (aVar.isFinish()) {
            this.isFirstGuide = false;
        } else {
            this.isFirstGuide = true;
            ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setText(R.string.start);
        }
    }

    public void renderButtonEnable(boolean z7) {
        this.isFirstGuide = z7;
        if (!z7) {
            ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setText(R.string.guide_next);
        }
        ((ActivityPhysiologicalGuideBinding) this.binding).btnPhysiologicalStart.setEnabled(this.isFirstGuide);
    }
}
