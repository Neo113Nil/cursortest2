package c1;

import com.crrepa.band.my.ble.band.model.BluetoothStateChangeEvent;
import com.crrepa.band.my.device.customkey.model.BandCustomKeySendResultChangeEvent;
import com.moyoung.dafit.module.common.baseui.f;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.c;
import org.greenrobot.eventbus.l;

/* loaded from: classes2.dex */
public class a implements f {
    private boolean success;
    private d1.a view;

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void destroy() {
        c.getDefault().unregister(this);
        this.view = null;
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandConnectStateChangeEvent(m0.a aVar) {
        if (aVar.getState() != 2) {
            this.view.renderLoadingDialogError();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBandCustomKeySendResultChangeEvent(BandCustomKeySendResultChangeEvent bandCustomKeySendResultChangeEvent) {
        boolean isSuccess = bandCustomKeySendResultChangeEvent.isSuccess();
        this.success = isSuccess;
        if (isSuccess) {
            this.view.renderLoadingDialogComplete();
        } else {
            this.view.renderLoadingDialogError();
        }
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onBluetoothStateChangeEvent(BluetoothStateChangeEvent bluetoothStateChangeEvent) {
        if (bluetoothStateChangeEvent.isEnable()) {
            return;
        }
        this.view.renderLoadingDialogError();
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void pause() {
    }

    @Override // com.moyoung.dafit.module.common.baseui.f
    public void resume() {
    }

    public void setView(d1.a aVar) {
        this.view = aVar;
        c.getDefault().register(this);
    }
}
