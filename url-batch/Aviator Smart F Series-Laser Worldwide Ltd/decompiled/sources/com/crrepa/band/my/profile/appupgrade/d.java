package com.crrepa.band.my.profile.appupgrade;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import cn.hutool.core.text.l;
import com.crrepa.band.aviator.R;

/* loaded from: classes2.dex */
public class d extends Dialog implements View.OnClickListener {
    private String changeLog;
    private boolean isForceUpdate;
    private LinearLayout llNoReminder;
    private LinearLayout llRemindLater;
    private TextView tvAppNameVersion;
    private TextView tvChangeLog;
    private TextView tvNoReminder;
    private TextView tvRemindLater;
    private TextView tvUpdate;
    private String versionName;

    public d(@NonNull Context context) {
        super(context, R.style.UserInfoChooceDialog);
        this.isForceUpdate = false;
    }

    private void initLayout() {
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.8d);
        window.setAttributes(attributes);
        setCanceledOnTouchOutside(false);
    }

    public String getChangeLog() {
        return this.changeLog;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public boolean isForceUpdate() {
        return this.isForceUpdate;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dismiss();
        int id = view.getId();
        if (id == R.id.tv_no_reminder) {
            b.getInstance().ignoreVersion();
        } else {
            if (id != R.id.tv_update) {
                return;
            }
            b.getInstance().startUpdate(getContext());
        }
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.dialog_new_version);
        this.tvChangeLog = (TextView) findViewById(R.id.tv_change_log);
        this.tvAppNameVersion = (TextView) findViewById(R.id.tv_app_name_version);
        this.tvUpdate = (TextView) findViewById(R.id.tv_update);
        this.llNoReminder = (LinearLayout) findViewById(R.id.ll_no_reminder);
        this.tvNoReminder = (TextView) findViewById(R.id.tv_no_reminder);
        this.llRemindLater = (LinearLayout) findViewById(R.id.ll_remind_later);
        this.tvRemindLater = (TextView) findViewById(R.id.tv_remind_later);
        this.tvChangeLog.setText(this.changeLog);
        this.tvAppNameVersion.setText(getContext().getString(R.string.app_name) + l.SPACE + this.versionName);
        initLayout();
        if (this.isForceUpdate) {
            this.llNoReminder.setVisibility(8);
            this.llRemindLater.setVisibility(8);
        }
        this.tvUpdate.setOnClickListener(this);
        this.tvNoReminder.setOnClickListener(this);
        this.tvRemindLater.setOnClickListener(this);
    }

    public void setChangeLog(String str) {
        this.changeLog = str;
    }

    public void setForceUpdate(boolean z7) {
        this.isForceUpdate = z7;
    }

    public void setVersionName(String str) {
        this.versionName = str;
    }
}
