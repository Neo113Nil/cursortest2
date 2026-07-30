package o3;

import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.band.my.model.BandSettingItemModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.squareup.picasso.v;
import java.util.List;

/* loaded from: classes2.dex */
public interface a {
    void hideAdView();

    void hideWatchFaceList();

    void renderAdView(v vVar, String str);

    void renderBandAddress(String str);

    void renderBandBattery(int i8);

    void renderBandConnectState(int i8);

    void renderBandDisconnectedHint();

    void renderBandInfoView();

    void renderBandName(String str);

    void renderBandScreenshot(BaseBandModel baseBandModel);

    void renderBandSettingList(List<BandSettingItemModel> list);

    void renderBandUpgradeComplete();

    void renderLowBatteryHint();

    void renderNetErrorHint();

    void renderNewFirmwareVersion(BandFirmwareModel bandFirmwareModel);

    void renderNotBandView();

    void renderWatchFaceList();

    void resetWatchFaceList();

    void showCustomerServiceUnreadNews(boolean z7);

    void startUpgradeActivity();
}
