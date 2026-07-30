package com.crrepa.band.my.ble.band.cmd.listener;

import android.content.Context;
import com.crrepa.ble.conn.listener.CRPPhoneOperationListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* loaded from: classes2.dex */
public class r implements CRPPhoneOperationListener {
    private Context context;
    private com.crrepa.band.my.ble.band.utils.c musicControlManager;

    class a implements Consumer {
        a() {
        }

        @Override // io.reactivex.functions.Consumer
        public void accept(Context context) {
            com.orhanobut.logger.f.d("endCall: " + com.crrepa.band.my.ble.band.utils.e.endCall(context));
        }
    }

    public r(Context context) {
        this.context = context;
        this.musicControlManager = com.crrepa.band.my.ble.band.utils.c.getInstance(context);
    }

    private void rejectCall() {
        Observable.just(this.context).observeOn(AndroidSchedulers.mainThread()).subscribe(new a());
    }

    @Override // com.crrepa.ble.conn.listener.CRPPhoneOperationListener
    public void onOperationChange(int i8) {
        com.orhanobut.logger.f.d("onOperationChange: " + i8);
        switch (i8) {
            case 0:
            case 6:
            case 7:
                this.musicControlManager.swtichPlayState();
                break;
            case 1:
                this.musicControlManager.previous();
                break;
            case 2:
                this.musicControlManager.next();
                break;
            case 3:
                rejectCall();
                break;
            case 4:
                this.musicControlManager.volumeUp();
                break;
            case 5:
                this.musicControlManager.volumeDown();
                break;
        }
    }
}
