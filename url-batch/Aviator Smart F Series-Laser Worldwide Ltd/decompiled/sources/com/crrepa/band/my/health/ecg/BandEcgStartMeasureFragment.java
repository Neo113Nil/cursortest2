package com.crrepa.band.my.health.ecg;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.databinding.FragmentStartMeasureEcgBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;

/* loaded from: classes2.dex */
public class BandEcgStartMeasureFragment extends BaseVBFragment<FragmentStartMeasureEcgBinding> {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initOnClickListener$0(View view) {
        startWithPop(BandEcgMeasureFragment.newInstance());
    }

    public static BandEcgStartMeasureFragment newInstance() {
        return new BandEcgStartMeasureFragment();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initBinding() {
        super.initBinding();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    protected void initOnClickListener() {
        super.initOnClickListener();
        ((FragmentStartMeasureEcgBinding) this.binding).btnMeasureEcg.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.health.ecg.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandEcgStartMeasureFragment.this.lambda$initOnClickListener$0(view);
            }
        });
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        ((FragmentStartMeasureEcgBinding) this.binding).tvMeasureEcgHint.setText(String.format(getString(R.string.press_electrode_opportunity_hint), getString(R.string.press_electrode)));
    }
}
