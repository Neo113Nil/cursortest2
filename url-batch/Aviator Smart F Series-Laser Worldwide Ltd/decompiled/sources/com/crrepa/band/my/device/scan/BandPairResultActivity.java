package com.crrepa.band.my.device.scan;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.MainActivity;
import com.crrepa.band.my.R$drawable;
import com.crrepa.band.my.databinding.ActivityBandPairResultBinding;
import com.crrepa.band.my.model.storage.BaseParamNames;
import com.moyoung.dafit.module.common.utils.k0;
import com.moyoung.instructions.utils.InstructionsType;

/* loaded from: classes2.dex */
public class BandPairResultActivity extends AppCompatActivity {
    private static final String DEVICE_NAME = "device_name";
    private static final String PAIR_RESULT = "pair_result";

    public static Intent getCallingIntent(Context context, String str, boolean z7, boolean z8) {
        Intent callingIntent = getCallingIntent(context, str, z7);
        callingIntent.putExtra(BaseParamNames.FIRST_OPEN_APP, z8);
        return callingIntent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(boolean z7, View view) {
        boolean booleanExtra = getIntent().getBooleanExtra(BaseParamNames.FIRST_OPEN_APP, false);
        if (!z7) {
            startActivity(BandScanActivity.getCallingIntent(this, booleanExtra));
        } else if (booleanExtra) {
            com.crrepa.band.my.ble.band.connect.a.startConnectService();
            startActivity(new Intent(this, (Class<?>) DeviceBindingSuccessActivity.class));
        } else {
            startActivity(MainActivity.getCallingIntent(this));
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityBandPairResultBinding inflate = ActivityBandPairResultBinding.inflate(getLayoutInflater());
        setContentView(inflate.getRoot());
        k0.setColorNoTranslucent(this, -1);
        k0.setLightMode(this);
        final boolean booleanExtra = getIntent().getBooleanExtra(PAIR_RESULT, false);
        String stringExtra = getIntent().getStringExtra(DEVICE_NAME);
        if (booleanExtra) {
            com.crrepa.band.my.ble.band.utils.a.getInstance().getConnectBand().setBandSnapshot(inflate.ivPairResult);
            inflate.tvPairResult.setText(getString(R.string.device_connect_pair_success, stringExtra));
            inflate.btnPairResult.setText(R.string.device_connect_pair_start);
        } else {
            inflate.ivPairResult.setImageResource(R$drawable.ic_pairing_failure);
            inflate.tvPairResult.setText(getString(R.string.device_connect_pair_fail, stringExtra));
            inflate.btnPairResult.setText(R.string.device_connect_pair_retry);
            inflate.tvInstructionHint.setVisibility(0);
            com.moyoung.instructions.c.hook(InstructionsType.PAIRING_FAILED, inflate.tvInstructionHint);
        }
        inflate.btnPairResult.setOnClickListener(new View.OnClickListener() { // from class: com.crrepa.band.my.device.scan.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BandPairResultActivity.this.lambda$onCreate$0(booleanExtra, view);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        com.moyoung.instructions.c.hideDialog(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onResume() {
        com.moyoung.instructions.c.resumeDialog(this);
        super.onResume();
    }

    public static Intent getCallingIntent(Context context, String str, boolean z7) {
        Intent intent = new Intent(context, (Class<?>) BandPairResultActivity.class);
        intent.putExtra(PAIR_RESULT, z7);
        intent.putExtra(DEVICE_NAME, str);
        return intent;
    }
}
