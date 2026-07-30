package com.crrepa.band.my.device.scan;

import android.view.View;
import android.view.ViewGroup;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.ble.band.model.BluetoothStateChangeEvent;
import com.crrepa.band.my.databinding.ActivityDeviceBindingSuccessBinding;
import com.crrepa.band.my.model.band.BaseBandModel;
import com.crrepa.band.my.model.band.provider.BandBatteryProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;
import org.greenrobot.eventbus.ThreadMode;

/* loaded from: classes2.dex */
public class DeviceBindingSuccessActivity extends BaseVBActivity<ActivityDeviceBindingSuccessBinding> implements View.OnClickListener {
    private static final int MAX_DEVICE_BATTERY = 100;
    private float batteryWidthSacle = 0.0f;

    class a implements Runnable {
        final /* synthetic */ int val$battery;

        a(int i8) {
            this.val$battery = i8;
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceBindingSuccessActivity.this.batteryWidthSacle = ((ActivityDeviceBindingSuccessBinding) ((BaseVBActivity) DeviceBindingSuccessActivity.this).binding).ivBandBattery.getMeasuredWidth() / 100.0f;
            DeviceBindingSuccessActivity.this.setBandBatteryWidth(this.val$battery);
        }
    }

    private int getBandConnectState() {
        if (!com.crrepa.band.my.ble.band.a.getBleClient().isBluetoothEnable()) {
            return 10;
        }
        com.crrepa.band.my.ble.band.connect.f fVar = com.crrepa.band.my.ble.band.connect.f.getInstance();
        if (fVar.isConnecting()) {
            return 1;
        }
        return fVar.isConnected() ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
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
                ((ActivityDeviceBindingSuccessBinding) this.binding).rlBandBattery.setBackgroundResource(R$drawable.ic_battery_d_0);
                ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.setBackgroundResource(R$drawable.ic_battery_d_1);
                ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandBattery.setVisibility(8);
            } else {
                ((ActivityDeviceBindingSuccessBinding) this.binding).rlBandBattery.setBackgroundResource(R$drawable.ic_battery_0);
                if (z7) {
                    ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.setBackgroundResource(R$drawable.ic_battery_charging);
                    ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandBattery.setVisibility(8);
                } else {
                    ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.setBackgroundResource(R$drawable.ic_battery_1);
                    ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandBattery.setText(i8 + getString(R.string.percent_unit));
                    ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandBattery.setVisibility(0);
                }
            }
            ViewGroup.LayoutParams layoutParams = ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.getLayoutParams();
            layoutParams.width = (int) (this.batteryWidthSacle * i8);
            ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.setLayoutParams(layoutParams);
        }
        z7 = false;
        if (com.crrepa.band.my.ble.band.connect.f.getInstance().isConnected()) {
        }
        ViewGroup.LayoutParams layoutParams2 = ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.getLayoutParams();
        layoutParams2.width = (int) (this.batteryWidthSacle * i8);
        ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.setLayoutParams(layoutParams2);
    }

    private void showBandBaseInfo() {
        BaseBandModel connectBand = com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand();
        if (connectBand == null) {
            return;
        }
        ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandName.setText(connectBand.getBandName());
        ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandAddress.setText(connectBand.getAddress());
        ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandScreenshot.setImageDrawable(null);
        connectBand.setBandSnapshot(((ActivityDeviceBindingSuccessBinding) this.binding).ivBandScreenshot);
        updateBandConnectState();
    }

    private void showBandBattery(int i8) {
        if (this.batteryWidthSacle <= 0.0f) {
            ((ActivityDeviceBindingSuccessBinding) this.binding).ivBandBattery.post(new a(i8));
        } else {
            setBandBatteryWidth(i8);
        }
    }

    private void showBandConnectState(int i8) {
        renderBandConnectState(i8);
        int bandBattery = BandBatteryProvider.getBandBattery();
        if (bandBattery > 0) {
            showBandBattery(bandBattery);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        org.greenrobot.eventbus.c.getDefault().register(this);
        showBandBaseInfo();
        ((ActivityDeviceBindingSuccessBinding) this.binding).tvApply.setOnClickListener(this);
        ((ActivityDeviceBindingSuccessBinding) this.binding).tvAgain.setOnClickListener(this);
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandBatteryChangeEvent(l0.b bVar) {
        showBandBattery(bVar.getBattery());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        showBandConnectState(aVar.getState());
    }

    @org.greenrobot.eventbus.l(threadMode = ThreadMode.MAIN)
    public void onBluetoothStateChangeEvent(BluetoothStateChangeEvent bluetoothStateChangeEvent) {
        if (bluetoothStateChangeEvent.isEnable()) {
            return;
        }
        showBandConnectState(R.string.bluetooth_disable);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        startActivity(id != R.id.tv_again ? id != R.id.tv_apply ? null : MainActivity.getCallingIntent(this) : BandScanActivity.getCallingIntent(this, true));
        finish();
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onDestroy() {
        org.greenrobot.eventbus.c.getDefault().unregister(this);
        super.onDestroy();
    }

    public void renderBandConnectState(int i8) {
        ((ActivityDeviceBindingSuccessBinding) this.binding).tvBandConnectState.setText(i8 != 0 ? i8 != 2 ? i8 != 10 ? R.string.ble_connecting : R.string.bluetooth_disable : R.string.ble_connected : R.string.ble_disconnected);
        com.crrepa.band.my.profile.userinfo.presenter.b.logUserInfoEvent();
    }

    public void updateBandConnectState() {
        showBandConnectState(getBandConnectState());
    }
}
