package com.crrepa.band.my.device.scan;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.crrepa.band.aviator.R;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.crrepa.band.my.home.device.model.BandPairingCodeChangeEvent;
import java.text.DecimalFormat;

/* loaded from: classes2.dex */
public class m extends Dialog implements View.OnClickListener {
    private String name;
    private int pairingCode;
    private TextView tvCancel;
    private TextView tvPair;
    private TextView tvPairingCode;
    private TextView tvPairingHint;

    public m(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.8d);
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(false);
    }

    public String getName() {
        return this.name;
    }

    public String getPairingCode() {
        String format = new DecimalFormat("000000").format(this.pairingCode);
        return 6 < format.length() ? format.substring(0, 6) : format;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismiss();
        if (i4.getInstance().sendBondState(view.getId() != R.id.tv_cancel)) {
            return;
        }
        org.greenrobot.eventbus.c.getDefault().post(new BandPairingCodeChangeEvent(this.pairingCode, 0));
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_pairing_code);
        this.tvPairingHint = (TextView) findViewById(R.id.tv_pairing_hint);
        this.tvPairingCode = (TextView) findViewById(R.id.tv_pairing_code);
        this.tvCancel = (TextView) findViewById(R.id.tv_cancel);
        this.tvPair = (TextView) findViewById(R.id.tv_pair);
        initLayout();
        this.tvPairingCode.setText(getPairingCode());
        TextView textView = this.tvPairingHint;
        Context context = getContext();
        String str = this.name;
        textView.setText(context.getString(R.string.device_connect_request_message, str, str));
        this.tvPair.setOnClickListener(this);
        this.tvCancel.setOnClickListener(this);
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPairingCode(int i8) {
        this.pairingCode = i8;
    }
}
