package com.crrepa.band.my.home.device;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.listener.OnItemChildClickListener;
import com.chad.library.adapter.base.listener.OnItemClickListener;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.FragmentBandSettingBinding;
import com.crrepa.band.my.device.ai.chat.AIChatActivity;
import com.crrepa.band.my.device.ai.picture.AIPictureActivity;
import com.crrepa.band.my.device.ai.picture.model.AIPictureModel;
import com.crrepa.band.my.device.alarm.BandAlarmActivity;
import com.crrepa.band.my.device.appmarket.AppMarketMainActivity;
import com.crrepa.band.my.device.calendar.CalendarEventActivity;
import com.crrepa.band.my.device.calendar.CalendarSyncActivity;
import com.crrepa.band.my.device.camera.GoogleCameraActivity;
import com.crrepa.band.my.device.contact.QuickContactActivity;
import com.crrepa.band.my.device.cricket.CricketActivity;
import com.crrepa.band.my.device.customkey.activity.CustomKeyHomeActivity;
import com.crrepa.band.my.device.ecard.ECardActivity;
import com.crrepa.band.my.device.localmusic.LocalMusicMainActivity;
import com.crrepa.band.my.device.localphoto.LocalPhotoMainActivity;
import com.crrepa.band.my.device.localvideo.LocalVideoMainActivity;
import com.crrepa.band.my.device.muslim.MuslimHomeActivity;
import com.crrepa.band.my.device.ota.BandUpgradeActivity;
import com.crrepa.band.my.device.pillreminder.PillReminderActivity;
import com.crrepa.band.my.device.pushmessage.BandNotificationActivity;
import com.crrepa.band.my.device.scan.BandScanActivity;
import com.crrepa.band.my.device.setting.other.BandOtherSettingActivity;
import com.crrepa.band.my.device.stock.StockSettingActivity;
import com.crrepa.band.my.device.switchui.BandFunctionActivity;
import com.crrepa.band.my.device.watchface.DownloadWatchFaceEditActivity;
import com.crrepa.band.my.device.watchface.StoreWatchFaceMainActivity;
import com.crrepa.band.my.device.watchface.WatchFaceEditActivity;
import com.crrepa.band.my.device.watchfacenew.photo.NewCustomWatchFaceActivity;
import com.crrepa.band.my.device.watchfacenew.video.VideoWatchFaceMainActivity;
import com.crrepa.band.my.device.worldclock.WorldClockActivity;
import com.crrepa.band.my.home.device.adapter.BandSettingAdapter;
import com.crrepa.band.my.home.device.adapter.WatchFaceAdapter;
import com.crrepa.band.my.model.BandFirmwareModel;
import com.crrepa.band.my.model.BandSettingItemModel;
import com.crrepa.band.my.model.WatchFaceModel;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandCalendarEventProvider;
import com.crrepa.band.my.model.band.provider.BandInfoManager;
import com.crrepa.band.my.model.band.provider.watchface.DefaultWatchFaceProvider;
import com.crrepa.band.my.model.db.proxy.RecoverDaoProxy;
import com.moyoung.dafit.module.common.baseui.BaseVBFragment;
import com.moyoung.dafit.module.common.network.provider.g;
import com.moyoung.dafit.module.common.utils.b0;
import com.moyoung.dafit.module.common.utils.o;
import com.moyoung.dafit.module.common.utils.r0;
import com.moyoung.dafit.module.common.utils.s0;
import com.moyoung.dafit.module.common.utils.x0;
import com.moyoung.dafit.module.common.widgets.decoration.SpacesItemDecoration;
import com.squareup.picasso.v;
import java.util.List;

/* loaded from: classes2.dex */
public class BandSettingFragment extends BaseVBFragment<FragmentBandSettingBinding> implements o3.a, o3.b, OnItemClickListener, View.OnClickListener, OnItemChildClickListener {
    private static final int HEADER_WATCH_FACE_INDEX = 1;
    private static final int MAX_DEVICE_BATTERY = 100;
    private static final int WATCH_FACE_DELETE_CODE = 18;
    private static final int WATCH_FACE_EDIT_CODE = 16;
    private static final int WATCH_FACE_STORE_CODE = 17;
    private ImageView ivBandBattery;
    private ImageView ivBandScreenshot;
    private BandFirmwareModel newBandFirmwareModel;
    private RecyclerView rcvWatchFaceList;
    private RelativeLayout rlBandBattery;
    private TextView tvBandAddress;
    private TextView tvBandBattery;
    private TextView tvBandConnectState;
    private TextView tvBandName;
    private TextView tvDownloadWatchFaceEdit;
    private MaterialDialog upgradeDialog;
    private WatchFaceAdapter watchFaceAdapter;
    private View watchFaceListView;
    private final BandSettingAdapter bandSettingAdapter = new BandSettingAdapter();
    private final com.crrepa.band.my.home.device.presenter.d presenter = new com.crrepa.band.my.home.device.presenter.d();
    private final com.crrepa.band.my.home.device.presenter.f watchFacePresenter = new com.crrepa.band.my.home.device.presenter.f();
    private float batteryWidthSacle = 0.0f;
    private b0 noDoubleClickHelper = new b0();
    private boolean cancelRecover = false;

    class a implements MaterialDialog.l {
        a() {
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            BandSettingFragment.this.removeBand();
        }
    }

    class b implements MaterialDialog.l {
        final /* synthetic */ Context val$context;

        b(Context context) {
            this.val$context = context;
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            BandSettingFragment.this.showRemoveBandDialog(this.val$context);
        }
    }

    class c implements MaterialDialog.l {
        final /* synthetic */ Context val$context;

        c(Context context) {
            this.val$context = context;
        }

        @Override // com.afollestad.materialdialogs.MaterialDialog.l
        public void onClick(@NonNull MaterialDialog materialDialog, @NonNull DialogAction dialogAction) {
            materialDialog.dismiss();
            BandSettingFragment.this.startActivity(BandUpgradeActivity.getRestoreCallingIntent(this.val$context));
        }
    }

    class d implements View.OnClickListener {
        final /* synthetic */ String val$url;

        d(String str) {
            this.val$url = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BandSettingFragment.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.val$url)));
        }
    }

    class e implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ int val$battery;

        e(int i8) {
            this.val$battery = i8;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            BandSettingFragment.this.ivBandBattery.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            BandSettingFragment.this.batteryWidthSacle = r0.getMeasuredWidth() / 100.0f;
            BandSettingFragment.this.setBandBatteryWidth(this.val$battery);
        }
    }

    static /* synthetic */ class f {
        static final /* synthetic */ int[] $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType;

        static {
            int[] iArr = new int[BandSettingItemModel.SettingType.values().length];
            $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType = iArr;
            try {
                iArr[BandSettingItemModel.SettingType.APP_MARKET.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.AI_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.FIND_DEVICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.LOCAL_MUSIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.LOCAL_VIDEO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.LOCAL_PHOTO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.ALARM_CLOCK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.MUSLIM_PRAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.WORLD_CLOCK.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.CUSTOM_KEY.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.STOCK_SETTING.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.CAMERA_CONTROL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.FUNCTION_LIST.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.OTHER_SETTINGS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.FIRMWARE_UPGRADE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.QUICK_CONTART.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.PILL_REMINDER.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.E_CARD.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.CALENDAR_EVENT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[BandSettingItemModel.SettingType.CRICKET_MATCHES.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    public static BandSettingFragment getInstance() {
        return new BandSettingFragment();
    }

    private void hideForcedUpgradeDialog() {
        MaterialDialog materialDialog = this.upgradeDialog;
        if (materialDialog != null) {
            materialDialog.dismiss();
        }
    }

    private void initSettingList() {
        ((FragmentBandSettingBinding) this.binding).rcvBandSettingList.setLayoutManager(new LinearLayoutManager(getContext()));
        this.bandSettingAdapter.setOnItemClickListener(this);
        ((FragmentBandSettingBinding) this.binding).rcvBandSettingList.setAdapter(this.bandSettingAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showUpgradeDialog$0(MaterialDialog materialDialog, DialogAction dialogAction) {
        startUpgrade();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$showUpgradeDialog$2(String str, MaterialDialog materialDialog, DialogAction dialogAction) {
        materialDialog.dismiss();
        BandInfoManager.saveIgnoreFirmwareVersion(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeBand() {
        resetNewBandFirmwareModel();
        this.presenter.removeBand(getContext());
        this.watchFacePresenter.resetWatchFaceProvider();
    }

    private void resetNewBandFirmwareModel() {
        this.newBandFirmwareModel = null;
        this.presenter.hasNewVersion = false;
    }

    private void sendDisplayWatchFaceIndex(BaseQuickAdapter baseQuickAdapter, int i8) {
        WatchFaceModel watchFaceModel = (WatchFaceModel) baseQuickAdapter.getData().get(i8);
        if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_AI && TextUtils.isEmpty(g.getInstance().getString(AIPictureModel.SENT_AI_PICTURE_PATH, ""))) {
            requireContext().startActivity(AIPictureActivity.getCallingIntent(requireContext()));
        } else {
            if (watchFaceModel.isChecked() || DefaultWatchFaceProvider.isEmptyWatchFace(watchFaceModel.getWatchFaceId())) {
                return;
            }
            this.watchFacePresenter.sendDisplayWatchFaceIndex(watchFaceModel.getIndex());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setBandBatteryWidth(int i8) {
        boolean z7 = true;
        if (i8 < 0) {
            i8 = 1;
        } else if (100 < i8) {
            i8 = 100;
            if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
                this.rlBandBattery.setBackgroundResource(R$drawable.ic_battery_d_0);
                this.ivBandBattery.setBackgroundResource(R$drawable.ic_battery_d_1);
                this.tvBandBattery.setVisibility(8);
            } else {
                this.rlBandBattery.setBackgroundResource(R$drawable.ic_battery_0);
                if (z7) {
                    this.ivBandBattery.setBackgroundResource(R$drawable.ic_battery_charging);
                    this.tvBandBattery.setVisibility(8);
                } else {
                    this.ivBandBattery.setBackgroundResource(R$drawable.ic_battery_1);
                    this.tvBandBattery.setText(i8 + getString(R.string.percent_unit));
                    this.tvBandBattery.setVisibility(0);
                }
            }
            ViewGroup.LayoutParams layoutParams = this.ivBandBattery.getLayoutParams();
            layoutParams.width = (int) (this.batteryWidthSacle * i8);
            this.ivBandBattery.setLayoutParams(layoutParams);
        }
        z7 = false;
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
        }
        ViewGroup.LayoutParams layoutParams2 = this.ivBandBattery.getLayoutParams();
        layoutParams2.width = (int) (this.batteryWidthSacle * i8);
        this.ivBandBattery.setLayoutParams(layoutParams2);
    }

    private void showNormalUpgrade(boolean z7) {
        List<BandSettingItemModel> data = this.bandSettingAdapter.getData();
        if (data == null) {
            return;
        }
        for (int i8 = 0; i8 < data.size(); i8++) {
            BandSettingItemModel bandSettingItemModel = data.get(i8);
            if (bandSettingItemModel.getType() == BandSettingItemModel.SettingType.FIRMWARE_UPGRADE) {
                bandSettingItemModel.setNewVersion(z7);
            }
        }
        this.bandSettingAdapter.setNewData(data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showRemoveBandDialog(Context context) {
        new MaterialDialog.e(context).title(R.string.remove_band_dialog_title).positiveText(R.string.remove_band).onPositive(new a()).negativeText(R.string.cancel).show();
    }

    private void showRestoreDialog(Context context) {
        new MaterialDialog.e(context).title(R.string.firmware_restore_title).content(R.string.firmware_restore_hint).cancelable(false).positiveText(R.string.start_upgrade).onPositive(new c(context)).negativeText(R.string.cancel).onNegative(new b(context)).show();
    }

    private void showUpgradeDialog(boolean z7, final String str, String str2) {
        MaterialDialog materialDialog = this.upgradeDialog;
        if (materialDialog == null || !materialDialog.isShowing()) {
            MaterialDialog.e canceledOnTouchOutside = new MaterialDialog.e(getActivity()).title(str).content(str2).positiveText(R.string.upgrade).onPositive(new MaterialDialog.l() { // from class: com.crrepa.band.my.home.device.a
                @Override // com.afollestad.materialdialogs.MaterialDialog.l
                public final void onClick(MaterialDialog materialDialog2, DialogAction dialogAction) {
                    BandSettingFragment.this.lambda$showUpgradeDialog$0(materialDialog2, dialogAction);
                }
            }).cancelable(false).canceledOnTouchOutside(false);
            if (!z7) {
                canceledOnTouchOutside.negativeText(R.string.cancel).onNegative(new MaterialDialog.l() { // from class: com.crrepa.band.my.home.device.b
                    @Override // com.afollestad.materialdialogs.MaterialDialog.l
                    public final void onClick(MaterialDialog materialDialog2, DialogAction dialogAction) {
                        materialDialog2.dismiss();
                    }
                }).neutralText(R.string.new_app_no_reminder).onNeutral(new MaterialDialog.l() { // from class: com.crrepa.band.my.home.device.c
                    @Override // com.afollestad.materialdialogs.MaterialDialog.l
                    public final void onClick(MaterialDialog materialDialog2, DialogAction dialogAction) {
                        BandSettingFragment.lambda$showUpgradeDialog$2(str, materialDialog2, dialogAction);
                    }
                });
            }
            this.upgradeDialog = canceledOnTouchOutside.show();
        }
    }

    private void startUpgrade() {
        this.presenter.startForcedUpgrade(getContext());
    }

    @Override // o3.a
    public void hideAdView() {
        ((FragmentBandSettingBinding) this.binding).ivAdPreview.setVisibility(8);
    }

    @Override // o3.a
    public void hideWatchFaceList() {
        View view = this.watchFaceListView;
        if (view != null) {
            this.bandSettingAdapter.removeHeaderView(view);
            this.watchFaceAdapter = null;
            this.watchFaceListView = null;
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment
    @Nullable
    public void initBinding() {
        super.initBinding();
        this.presenter.setView(this);
        this.watchFacePresenter.setView(this);
        initSettingList();
        this.presenter.getHeadView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i8, int i9, Intent intent) {
        super.onActivityResult(i8, i9, intent);
        com.orhanobut.logger.f.d("onActivityResult requestCode: " + i8 + ", resultCode: " + i9);
        switch (i8) {
            case 16:
            case 17:
            case 18:
                if (i9 == -1) {
                    this.watchFacePresenter.getAllWatchFaces();
                    break;
                }
                break;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        int id = view.getId();
        if (id == R.id.btn_bound_band) {
            startActivity(BandScanActivity.getCallingIntent(context, false));
            s0.logEvent("点击设备页添加设备");
            return;
        }
        if (id != R.id.btn_remove_band) {
            if (id != R.id.tv_download_watch_face_edit) {
                return;
            }
            startActivityForResult(DownloadWatchFaceEditActivity.getCallingIntent(context), 18);
        } else {
            if (this.cancelRecover || !new RecoverDaoProxy().hasRecoverBand()) {
                showRemoveBandDialog(context);
            } else {
                this.cancelRecover = true;
                showRestoreDialog(context);
            }
            s0.logEvent("点击移除设备");
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        hideForcedUpgradeDialog();
        this.presenter.destroy();
        this.watchFacePresenter.destroy();
    }

    @Override // com.chad.library.adapter.base.listener.OnItemChildClickListener
    public void onItemChildClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        sendDisplayWatchFaceIndex(baseQuickAdapter, i8);
        WatchFaceModel watchFaceModel = (WatchFaceModel) baseQuickAdapter.getData().get(i8);
        int id = view.getId();
        Intent intent = null;
        int i9 = 17;
        if (id != R.id.btn_watch_face_edit) {
            if (id == R.id.iv_add_watch_face) {
                intent = StoreWatchFaceMainActivity.getCallingIntent(getContext());
            }
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_STORE) {
            intent = StoreWatchFaceMainActivity.getCallingIntent(getContext());
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_VIDEO) {
            intent = VideoWatchFaceMainActivity.getCallingIntent(getContext(), watchFaceModel.getUrl());
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_AI) {
            if (x0.isNotEmpty(g.getInstance().getString(AIPictureModel.SENT_AI_PICTURE_PATH, ""))) {
                intent = AIPictureActivity.getCallingIntent(getContext());
            }
        } else if (watchFaceModel.getWatchFaceType() == WatchFaceModel.WatchFaceType.WATCH_FACE_PHOTO) {
            intent = NewCustomWatchFaceActivity.getCallingIntent(getContext(), watchFaceModel.getUrl());
        } else {
            intent = WatchFaceEditActivity.getCallingIntent(getContext(), i8);
            i9 = 16;
        }
        if (intent != null) {
            startActivityForResult(intent, i9);
        }
    }

    @Override // com.chad.library.adapter.base.listener.OnItemClickListener
    public void onItemClick(BaseQuickAdapter baseQuickAdapter, View view, int i8) {
        Intent callingIntent;
        if (this.noDoubleClickHelper.isDoubleClick()) {
            return;
        }
        if (!(baseQuickAdapter instanceof BandSettingAdapter)) {
            sendDisplayWatchFaceIndex(baseQuickAdapter, i8);
            return;
        }
        BandSettingItemModel bandSettingItemModel = (BandSettingItemModel) baseQuickAdapter.getData().get(i8);
        switch (f.$SwitchMap$com$crrepa$band$my$model$BandSettingItemModel$SettingType[bandSettingItemModel.getType().ordinal()]) {
            case 1:
                callingIntent = AppMarketMainActivity.getCallingIntent(getContext());
                break;
            case 2:
                callingIntent = AIChatActivity.getCallingIntent(getContext());
                break;
            case 3:
                callingIntent = BandNotificationActivity.getCallingIntent(getContext());
                break;
            case 4:
                this.presenter.findDevice();
                return;
            case 5:
                callingIntent = LocalMusicMainActivity.getCallingIntent(getContext());
                break;
            case 6:
                callingIntent = LocalVideoMainActivity.getCallingIntent(getContext());
                break;
            case 7:
                callingIntent = LocalPhotoMainActivity.getCallingIntent(getContext());
                break;
            case 8:
                callingIntent = BandAlarmActivity.getCallingIntent(getContext());
                break;
            case 9:
                callingIntent = MuslimHomeActivity.getCallingIntent(getContext());
                break;
            case 10:
                callingIntent = WorldClockActivity.getCallingIntent(getContext());
                break;
            case 11:
                callingIntent = new Intent(getContext(), (Class<?>) CustomKeyHomeActivity.class);
                break;
            case 12:
                callingIntent = StockSettingActivity.getCallingIntent(getContext());
                break;
            case 13:
                callingIntent = GoogleCameraActivity.getCallingIntent(getContext());
                break;
            case 14:
                callingIntent = BandFunctionActivity.getCallingIntent(getContext());
                break;
            case 15:
                callingIntent = BandOtherSettingActivity.getCallIntent(getContext());
                break;
            case 16:
                callingIntent = BandUpgradeActivity.getCallingIntent(getContext(), this.newBandFirmwareModel, false);
                break;
            case 17:
                callingIntent = QuickContactActivity.getCallingIntent(getContext());
                break;
            case 18:
                callingIntent = PillReminderActivity.getCallingIntent(getContext());
                break;
            case 19:
                callingIntent = ECardActivity.getCallingIntent(getContext());
                break;
            case 20:
                if (!BandCalendarEventProvider.getCalendarEventState()) {
                    callingIntent = CalendarSyncActivity.getCallingIntent(getContext());
                    break;
                } else {
                    callingIntent = CalendarEventActivity.getCallingIntent(getContext());
                    break;
                }
            case 21:
                callingIntent = CricketActivity.getCallingIntent(getContext());
                break;
            default:
                return;
        }
        requireContext().startActivity(callingIntent);
        if (bandSettingItemModel.getType() == BandSettingItemModel.SettingType.CAMERA_CONTROL) {
            requireActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, me.yokeyword.fragmentation.d
    public void onLazyInitView(@Nullable Bundle bundle) {
        super.onLazyInitView(bundle);
        this.presenter.getSettingList();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.presenter.pause();
        this.watchFacePresenter.pause();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.presenter.resume();
        this.watchFacePresenter.resume();
    }

    @Override // o3.a
    public void renderAdView(v vVar, String str) {
        ((FragmentBandSettingBinding) this.binding).ivAdPreview.setVisibility(0);
        vVar.fit().into(((FragmentBandSettingBinding) this.binding).ivAdPreview);
        ((FragmentBandSettingBinding) this.binding).ivAdPreview.setOnClickListener(new d(str));
    }

    @Override // o3.a
    public void renderBandAddress(String str) {
        TextView textView = this.tvBandAddress;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // o3.a
    public void renderBandBattery(int i8) {
        if (this.tvBandBattery == null) {
            return;
        }
        if (this.batteryWidthSacle <= 0.0f) {
            this.ivBandBattery.getViewTreeObserver().addOnGlobalLayoutListener(new e(i8));
        } else {
            setBandBatteryWidth(i8);
        }
    }

    @Override // o3.a
    public void renderBandConnectState(int i8) {
        int i9 = i8 != 0 ? i8 != 2 ? i8 != 10 ? R.string.ble_connecting : R.string.bluetooth_disable : R.string.ble_connected : R.string.ble_disconnected;
        TextView textView = this.tvBandConnectState;
        if (textView != null) {
            textView.setText(i9);
        }
        com.crrepa.band.my.profile.userinfo.presenter.b.logUserInfoEvent();
    }

    @Override // o3.a
    public void renderBandDisconnectedHint() {
        r0.showLong(getContext(), getString(R.string.band_setting_send_fail));
    }

    @Override // o3.a
    public void renderBandInfoView() {
        View inflate = getLayoutInflater().inflate(R.layout.header_band_info, (ViewGroup) null);
        Button button = (Button) inflate.findViewById(R.id.btn_remove_band);
        this.tvBandName = (TextView) inflate.findViewById(R.id.tv_band_name);
        this.tvBandAddress = (TextView) inflate.findViewById(R.id.tv_band_address);
        this.tvBandConnectState = (TextView) inflate.findViewById(R.id.tv_band_connect_state);
        this.tvBandBattery = (TextView) inflate.findViewById(R.id.tv_band_battery);
        this.ivBandBattery = (ImageView) inflate.findViewById(R.id.iv_band_battery);
        this.rlBandBattery = (RelativeLayout) inflate.findViewById(R.id.rl_band_battery);
        this.ivBandScreenshot = (ImageView) inflate.findViewById(R.id.iv_band_screenshot);
        button.setOnClickListener(this);
        this.bandSettingAdapter.setHeaderView(inflate);
    }

    @Override // o3.a
    public void renderBandName(String str) {
        TextView textView = this.tvBandName;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // o3.a
    public void renderBandScreenshot(BaseBandModel baseBandModel) {
        ImageView imageView = this.ivBandScreenshot;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            baseBandModel.setBandSnapshot(this.ivBandScreenshot);
        }
    }

    @Override // o3.a
    public void renderBandSettingList(List<BandSettingItemModel> list) {
        if (list == null || list.size() != this.bandSettingAdapter.getData().size()) {
            this.bandSettingAdapter.setNewData(list);
        }
    }

    @Override // o3.a
    public void renderBandUpgradeComplete() {
        showNormalUpgrade(false);
        resetNewBandFirmwareModel();
        hideForcedUpgradeDialog();
    }

    @Override // o3.b
    public void renderDisplayWatchFaceIndex(int i8) {
        List<WatchFaceModel> data;
        com.orhanobut.logger.f.d("showWatchFaceDisplayIndex: " + i8);
        WatchFaceAdapter watchFaceAdapter = this.watchFaceAdapter;
        if (watchFaceAdapter == null || (data = watchFaceAdapter.getData()) == null || data.isEmpty()) {
            return;
        }
        for (int i9 = 0; i9 < data.size(); i9++) {
            WatchFaceModel watchFaceModel = data.get(i9);
            int index = watchFaceModel.getIndex();
            if (index == i8 && !watchFaceModel.isChecked()) {
                watchFaceModel.setChecked(true);
                this.watchFaceAdapter.notifyItemChanged(i9, 1);
            }
            if (watchFaceModel.isChecked() && index != i8) {
                watchFaceModel.setChecked(false);
                this.watchFaceAdapter.notifyItemChanged(i9, 1);
            }
        }
        this.watchFaceAdapter.setDisplayWatchFaceIndex(i8);
    }

    @Override // o3.b
    public void renderDownloadWatchFaceEdit(boolean z7) {
        TextView textView = this.tvDownloadWatchFaceEdit;
        if (textView != null) {
            textView.setVisibility(z7 ? 0 : 8);
        }
    }

    @Override // o3.a
    public void renderLowBatteryHint() {
        r0.showLong(getContext(), getString(R.string.measure_low_battery_hint));
    }

    @Override // o3.a
    public void renderNetErrorHint() {
        r0.showLong(getContext(), getString(R.string.net_disonnected));
    }

    @Override // o3.a
    public void renderNewFirmwareVersion(BandFirmwareModel bandFirmwareModel) {
        this.newBandFirmwareModel = bandFirmwareModel;
        if (bandFirmwareModel == null) {
            return;
        }
        int type = bandFirmwareModel.getType();
        String version = bandFirmwareModel.getVersion();
        String changeNote = bandFirmwareModel.getChangeNote();
        if (type == 0) {
            showNormalUpgrade(true);
            return;
        }
        if (type == 2) {
            showUpgradeDialog(true, version, changeNote);
            return;
        }
        if (type != 3) {
            resetNewBandFirmwareModel();
            return;
        }
        showNormalUpgrade(true);
        if (TextUtils.equals(BandInfoManager.getIgnoreFirmwareVersion(), version)) {
            return;
        }
        showUpgradeDialog(false, version, changeNote);
    }

    @Override // o3.a
    public void renderNotBandView() {
        View inflate = getLayoutInflater().inflate(R.layout.header_not_band, (ViewGroup) null);
        ((Button) inflate.findViewById(R.id.btn_bound_band)).setOnClickListener(this);
        this.bandSettingAdapter.setHeaderView(inflate);
    }

    @Override // o3.b
    public void renderUpdateDisplayWatchFaceError() {
        r0.showLong(getContext(), getString(R.string.band_setting_send_fail));
    }

    @Override // o3.a
    public void renderWatchFaceList() {
        if (this.watchFaceListView == null) {
            View inflate = getLayoutInflater().inflate(R.layout.header_watch_face_list, (ViewGroup) null);
            this.watchFaceListView = inflate;
            this.rcvWatchFaceList = (RecyclerView) inflate.findViewById(R.id.rcv_watch_face_list);
            TextView textView = (TextView) this.watchFaceListView.findViewById(R.id.tv_download_watch_face_edit);
            this.tvDownloadWatchFaceEdit = textView;
            textView.setOnClickListener(this);
            this.bandSettingAdapter.setHeaderView(this.watchFaceListView, 1);
        }
        if (this.watchFaceAdapter == null) {
            this.rcvWatchFaceList.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.rcvWatchFaceList.addItemDecoration(new SpacesItemDecoration(o.dp2px(requireContext(), 10.0f), o.dp2px(requireContext(), 20.0f)));
            WatchFaceAdapter watchFaceAdapter = new WatchFaceAdapter();
            this.watchFaceAdapter = watchFaceAdapter;
            this.rcvWatchFaceList.setAdapter(watchFaceAdapter);
            this.watchFaceAdapter.setOnItemChildClickListener(this);
            this.watchFaceAdapter.setOnItemClickListener(this);
        }
        this.watchFacePresenter.getAllWatchFaces();
        this.watchFacePresenter.getWatchFaceStore();
        this.watchFacePresenter.getLocalDisplayWatchFaceIndex();
    }

    @Override // o3.a
    public void resetWatchFaceList() {
        this.watchFacePresenter.resetWatchFaceProvider();
        this.watchFaceAdapter.resetBandInfo();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBFragment, com.moyoung.dafit.module.common.baseui.BaseFragement, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z7) {
        super.setUserVisibleHint(z7);
        if (z7) {
            s0.logFragmentView(this);
        }
    }

    @Override // o3.a
    public void showCustomerServiceUnreadNews(boolean z7) {
        List<BandSettingItemModel> data = this.bandSettingAdapter.getData();
        if (data == null) {
            return;
        }
        for (int i8 = 0; i8 < data.size(); i8++) {
            BandSettingItemModel bandSettingItemModel = data.get(i8);
            if (bandSettingItemModel.getType() == BandSettingItemModel.SettingType.CUSTOMER_SERVICE) {
                bandSettingItemModel.setNewVersion(z7);
            }
        }
        this.bandSettingAdapter.setNewData(data);
    }

    @Override // o3.a
    public void startUpgradeActivity() {
        startActivity(BandUpgradeActivity.getCallingIntent(getContext(), this.newBandFirmwareModel, true));
    }

    @Override // o3.b
    public void renderWatchFaceList(List<WatchFaceModel> list) {
        Log.d("watchFaceListView", "WatchFace List size=" + list.size());
        WatchFaceAdapter watchFaceAdapter = this.watchFaceAdapter;
        if (watchFaceAdapter != null) {
            watchFaceAdapter.setNewData(list);
        }
    }
}
