package com.bytedance.sdk.openadsdk.kgc.zn;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.phc;

/* loaded from: classes6.dex */
public class zmn {
    private final SharedPreferences zmn;

    public zmn(Context context) {
        if (phc.zmn(context)) {
            this.zmn = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.zmn = context.getSharedPreferences("pag_monitor_record_" + phc.zn(context), 0);
    }

    public long zmn() {
        return this.zmn.getLong("last_upload_time", 0L);
    }

    public void zmn(long j) {
        SharedPreferences.Editor edit = this.zmn.edit();
        edit.putLong("last_upload_time", j);
        edit.apply();
    }
}
