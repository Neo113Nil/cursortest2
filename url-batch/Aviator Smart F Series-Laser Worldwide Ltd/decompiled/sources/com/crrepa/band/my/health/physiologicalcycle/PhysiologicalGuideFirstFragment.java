package com.crrepa.band.my.health.physiologicalcycle;

import com.crrepa.band.my.databinding.FragmentPhysiologicalGuideFirstBinding;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;

/* loaded from: classes2.dex */
public class PhysiologicalGuideFirstFragment extends BaseVBFragment<FragmentPhysiologicalGuideFirstBinding> {
    public static PhysiologicalGuideFirstFragment newInstance() {
        return new PhysiologicalGuideFirstFragment();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    public void initBinding() {
        super.initBinding();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z7) {
        super.onHiddenChanged(z7);
        com.orhanobut.logger.f.d("onHiddenChanged: " + z7);
        if (z7) {
            return;
        }
        org.greenrobot.eventbus.c.getDefault().post(new v2.a(false));
    }
}
