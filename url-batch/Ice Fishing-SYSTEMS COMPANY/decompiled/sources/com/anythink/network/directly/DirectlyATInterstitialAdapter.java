package com.anythink.network.directly;

import android.app.Activity;
import android.content.Context;
import com.anythink.basead.f.e;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.w;
import com.anythink.network.adx.AdxATInterstitialAdapter;
import java.util.Map;

/* loaded from: classes.dex */
public class DirectlyATInterstitialAdapter extends AdxATInterstitialAdapter {
    public void fixDirectlyInterstitial() {
        w d2;
        e eVar = this.f23177b;
        if (eVar == null || (d2 = eVar.d()) == null) {
            return;
        }
        d2.g(this.f23178c);
        bj bjVar = (bj) d2;
        if (bjVar.aJ() == 5 && this.f23178c == 2) {
            bjVar.t(3);
        }
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public String getNetworkName() {
        return "Directly";
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.core.api.IATBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
        Object obj;
        this.f23178c = 2;
        if (map.containsKey("unit_type") && (obj = map.get("unit_type")) != null) {
            int parseInt = Integer.parseInt(obj.toString());
            this.f23178c = parseInt;
            this.f23178c = parseInt != 0 ? 1 : 2;
        }
        super.loadCustomNetworkAd(context, map, map2);
    }

    @Override // com.anythink.network.adx.AdxATInterstitialAdapter, com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter
    public void show(Activity activity) {
        fixDirectlyInterstitial();
        super.show(activity);
    }
}
