package c1;

import com.crrepa.band.aviator.R;
import com.crrepa.band.my.device.customkey.util.c;
import com.crrepa.band.my.training.utils.q;
import com.crrepa.ble.conn.bean.CRPCustomKeyInfo;
import com.crrepa.ble.conn.type.CRPCustomKeyType;
import com.moyoung.dafit.module.common.baseui.f;
import com.moyoung.dafit.module.common.utils.d;

/* loaded from: classes2.dex */
public class b implements f {
    private d1.b view;

    private void renderActionDescribe(CRPCustomKeyInfo cRPCustomKeyInfo) {
        String str = "<font color='#82D9D4'>" + c.getCustomKeyFeatureTitle(cRPCustomKeyInfo.getKeyType()) + "</font>";
        this.view.renderActionDescribe(cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_TRAINING ? d.get().getString(R.string.action_button_select_content_hint, str) : cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_NONE ? d.get().getString(R.string.action_button_none_content_hint) : d.get().getString(R.string.action_button_select_other_hint, str));
    }

    private void renderFeatureDescribe(CRPCustomKeyInfo cRPCustomKeyInfo) {
        this.view.renderFeatureDescribe(c.getCustomKeyFeatureDescribe(cRPCustomKeyInfo));
    }

    private void renderFeaturePath(CRPCustomKeyInfo cRPCustomKeyInfo) {
        this.view.renderFeaturePath(c.getCustomKeyFeatureTitle(cRPCustomKeyInfo.getKeyType()), com.crrepa.band.my.device.customkey.util.a.capitalize(cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_TRAINING ? q.getTrainingName(d.get(), cRPCustomKeyInfo.getState()) : ""));
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        this.view = null;
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    public void renderFeature(CRPCustomKeyInfo cRPCustomKeyInfo) {
        if (cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_NONE) {
            this.view.renderNoneAction();
            return;
        }
        int customKeyDrawable = c.getCustomKeyDrawable(cRPCustomKeyInfo.getKeyType());
        this.view.renderFeatureIcon(customKeyDrawable);
        if (cRPCustomKeyInfo.getKeyType() == CRPCustomKeyType.KEY_TRAINING) {
            this.view.renderActionIcon(q.getTrainingIconId(d.get(), cRPCustomKeyInfo.getState()));
        } else {
            this.view.renderActionIcon(customKeyDrawable);
        }
        renderFeaturePath(cRPCustomKeyInfo);
        renderFeatureDescribe(cRPCustomKeyInfo);
        renderActionDescribe(cRPCustomKeyInfo);
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(d1.b bVar) {
        this.view = bVar;
    }
}
