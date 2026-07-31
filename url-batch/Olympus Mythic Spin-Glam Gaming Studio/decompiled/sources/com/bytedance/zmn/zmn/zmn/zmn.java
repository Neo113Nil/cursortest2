package com.bytedance.zmn.zmn.zmn;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.SparseIntArray;
import com.bytedance.zmn.zmn.fs;
import com.bytedance.zmn.zmn.hhw;
import com.bytedance.zmn.zmn.nps;
import com.bytedance.zmn.zn;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class zmn implements Handler.Callback {
    private final SparseIntArray btk = new SparseIntArray();
    private final zn.InterfaceC0213zn fb;
    private final fs fs;
    private Handler hhw;
    private final String zmn;
    private final String zn;

    public zmn(fs fsVar, String str, zn.InterfaceC0213zn interfaceC0213zn) {
        this.zmn = fsVar.zn().zn();
        this.fs = fsVar;
        this.zn = str;
        this.fb = interfaceC0213zn;
    }

    public void zmn(int i) {
        zmn(i, 1);
    }

    public void zmn(int i, int i2) {
        synchronized (this.btk) {
            this.btk.put(i, this.btk.get(i) + i2);
        }
    }

    public void zmn() {
        Handler handler = this.hhw;
        if (handler == null || handler.hasMessages(10000)) {
            return;
        }
        this.hhw.sendEmptyMessageDelayed(10000, 60000L);
    }

    public void zmn(Looper looper, nps<? extends com.bytedance.zmn.zmn> npsVar) {
        long j = zn().getLong("last_upload_time", 0L);
        long zmn = this.fb.zmn();
        if (j > 0 && System.currentTimeMillis() - j > zmn) {
            zmn(npsVar);
        } else {
            SharedPreferences zn = zn();
            String string = zn.getString("event_counts", null);
            if (string != null) {
                try {
                    JSONObject jSONObject = new JSONObject(string);
                    Iterator<String> keys = jSONObject.keys();
                    synchronized (this.btk) {
                        while (keys.hasNext()) {
                            try {
                                String next = keys.next();
                                this.btk.put(Integer.parseInt(next), jSONObject.getInt(next));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                } catch (Exception unused) {
                }
            }
            if (j == 0) {
                zn.edit().putLong("last_upload_time", System.currentTimeMillis()).apply();
            }
            Objects.toString(this.btk);
        }
        this.hhw = new Handler(looper, this);
    }

    private void zmn(nps<? extends com.bytedance.zmn.zmn> npsVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("instance_id", this.zmn);
            jSONObject.putOpt("event_type", this.zn);
            jSONObject.putOpt("db_data_count", Integer.valueOf(npsVar.zn(this.fs.zmn())));
            SharedPreferences zn = zn();
            Map<String, ?> all = zn.getAll();
            for (String str : all.keySet()) {
                if (!"last_upload_time".equals(str)) {
                    jSONObject.put(str, all.get(str));
                }
            }
            this.fb.zmn(jSONObject.toString());
            zn.edit().clear().putLong("last_upload_time", System.currentTimeMillis()).apply();
        } catch (Throwable unused) {
        }
    }

    private void fs() {
        Objects.toString(this.btk);
        JSONObject jSONObject = new JSONObject();
        synchronized (this.btk) {
            for (int i = 0; i < this.btk.size(); i++) {
                try {
                    jSONObject.putOpt(String.valueOf(this.btk.keyAt(i)), Integer.valueOf(this.btk.valueAt(i)));
                } catch (Exception unused) {
                }
            }
        }
        if (jSONObject.length() > 0) {
            SharedPreferences.Editor edit = zn().edit();
            edit.putString("event_counts", jSONObject.toString());
            edit.apply();
        }
    }

    private SharedPreferences zn() {
        return hhw.zmn().getSharedPreferences("event_monitor_" + this.zmn + "_" + this.zn + "_" + com.bytedance.zmn.zmn.fs.zn.zmn(), 0);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 10000) {
            return true;
        }
        fs();
        return true;
    }
}
