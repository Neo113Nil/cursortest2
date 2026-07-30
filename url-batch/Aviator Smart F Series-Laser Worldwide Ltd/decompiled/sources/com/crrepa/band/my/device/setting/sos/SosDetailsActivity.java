package com.crrepa.band.my.device.setting.sos;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.CompoundButton;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.ble.band.connect.f;
import com.crrepa.band.my.databinding.ActivitySosDetailsBinding;
import com.crrepa.band.my.model.band.provider.BandSosProvider;
import com.moyoung.dafit.module.common.baseui.BaseVBActivity;

/* loaded from: classes2.dex */
public class SosDetailsActivity extends BaseVBActivity<ActivitySosDetailsBinding> {
    private void enableSos(boolean z7) {
        i4.getInstance().enableSos(z7);
        BandSosProvider.saveSosState(z7);
    }

    public static Intent getCallIntent(Context context) {
        return new Intent(context, (Class<?>) SosDetailsActivity.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$0(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initBinding$1(CompoundButton compoundButton, boolean z7) {
        if (f.getInstance().isConnected()) {
            enableSos(z7);
        } else {
            ((ActivitySosDetailsBinding) this.binding).sbtnSos.setCheckedNoEvent(!z7);
        }
    }

    @Override // com.moyoung.dafit.module.common.baseui.BaseVBActivity
    protected void initBinding() {
        super.initBinding();
        ((ActivitySosDetailsBinding) this.binding).ivBack.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.setting.sos.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SosDetailsActivity.this.lambda$initBinding$0(view);
            }
        });
        ((ActivitySosDetailsBinding) this.binding).sbtnSos.setCheckedNoEvent(BandSosProvider.getSosState());
        ((ActivitySosDetailsBinding) this.binding).sbtnSos.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.crrepa.band.my.device.setting.sos.c
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z7) {
                SosDetailsActivity.this.lambda$initBinding$1(compoundButton, z7);
            }
        });
    }
}
