package com.cmplay.internalpush.ipc;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.cmplay.base.util.h;
import com.cmplay.base.util.ipc.a;
import com.cmplay.base.util.x;
import com.cmplay.base.util.y;
import java.io.File;

/* loaded from: classes.dex */
public class IpcSpHelper extends a {
    private static final int GET_BOOLEAN_VALUE = 2;
    private static final int GET_INT_VALUE = 3;
    private static final int GET_LONG_VALUE = 1;
    private static final int GET_STRING_VALUE = 4;
    private static final int REMOVE_KEY = 9;
    private static final int SET_BOOLEAN_VALUE = 6;
    private static final int SET_INT_VALUE = 7;
    private static final int SET_LONG_VALUE = 5;
    private static final int SET_STRING_VALUE = 8;
    private static final String TAG = "zzb_ipc";
    private static IpcSpHelper mInstance;
    private SharedPreferences mShardPreferences;

    private IpcSpHelper() {
        if (x.a()) {
            this.mShardPreferences = x.f4063a.getSharedPreferences("openscreen_save_data_service", 0);
        }
    }

    public static IpcSpHelper getInstance() {
        if (mInstance == null) {
            mInstance = new IpcSpHelper();
        }
        return mInstance;
    }

    private synchronized SharedPreferences getSharedPreference() {
        x.e();
        return this.mShardPreferences;
    }

    @Override // com.cmplay.base.util.ipc.a
    public String handler(ContentValues contentValues) {
        int mid = getMid(contentValues);
        String[] params = getParams(contentValues);
        switch (mid) {
            case 1:
                if (params.length < 2) {
                    return null;
                }
                return "" + sp_getLongValue(params[0], Long.valueOf(params[1]).longValue());
            case 2:
                if (params.length < 2) {
                    return null;
                }
                return "" + sp_getBooleanValue(params[0], Boolean.valueOf(params[1]).booleanValue());
            case 3:
                if (params.length < 2) {
                    return null;
                }
                return "" + sp_getIntValue(params[0], Integer.valueOf(params[1]).intValue());
            case 4:
                if (params.length < 2) {
                    return null;
                }
                return "" + sp_getStringValue(params[0], params[1]);
            case 5:
                if (params.length < 2) {
                    return null;
                }
                sp_setLongValue(params[0], Long.valueOf(params[1]).longValue());
                return null;
            case 6:
                if (params.length < 2) {
                    return null;
                }
                sp_setBooleanValue(params[0], Boolean.valueOf(params[1]).booleanValue());
                return null;
            case 7:
                if (params.length < 2) {
                    return null;
                }
                sp_setIntValue(params[0], Integer.valueOf(params[1]).intValue());
                return null;
            case 8:
                if (params.length < 2) {
                    return null;
                }
                sp_setStringValue(params[0], params[1]);
                return null;
            case 9:
                if (params.length < 2) {
                    return null;
                }
                sp_removeSomeKey(params[0], params[1]);
                return null;
            default:
                return null;
        }
    }

    public long sp_getLongValue(String str, long j) {
        if (x.a()) {
            return getSharedPreference().getLong(str, j);
        }
        return Long.valueOf(invoke(createParams(1, str, Long.valueOf(j)), Long.valueOf(j))).longValue();
    }

    public boolean sp_getBooleanValue(String str, boolean z) {
        if (x.a()) {
            return getSharedPreference().getBoolean(str, z);
        }
        return Boolean.valueOf(invoke(createParams(2, str, Boolean.valueOf(z)), Boolean.valueOf(z))).booleanValue();
    }

    public synchronized int sp_getIntValue(String str, int i) {
        if (x.a()) {
            return getSharedPreference().getInt(str, i);
        }
        return Integer.valueOf(invoke(createParams(3, str, Integer.valueOf(i)), Integer.valueOf(i))).intValue();
    }

    public String sp_getStringValue(String str, String str2) {
        if (x.a()) {
            return getSharedPreference().getString(str, str2);
        }
        return invoke(createParams(4, str, str2), str2);
    }

    public void sp_setBooleanValue(String str, boolean z) {
        if (x.a()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putBoolean(str, z);
            y.a(edit);
            return;
        }
        invoke(createParams(6, str, Boolean.valueOf(z)));
    }

    public void sp_setLongValue(String str, long j) {
        if (x.a()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putLong(str, j);
            y.a(edit);
            return;
        }
        invoke(createParams(5, str, Long.valueOf(j)));
    }

    public synchronized void sp_setIntValue(String str, int i) {
        if (x.a()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putInt(str, i);
            y.a(edit);
        } else {
            invoke(createParams(7, str, Integer.valueOf(i)));
        }
    }

    public synchronized void sp_setStringValue(String str, String str2) {
        if (x.a()) {
            SharedPreferences.Editor edit = getSharedPreference().edit();
            edit.putString(str, str2);
            y.a(edit);
        } else {
            invoke(createParams(8, str, str2));
        }
    }

    public void sp_removeSomeKey(String str, String str2) {
        if (x.a()) {
            if (!TextUtils.isEmpty(str2)) {
                removeKey(str2);
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            for (String str3 : getSharedPreference().getAll().keySet()) {
                if (str3 != null && str3.startsWith(str)) {
                    try {
                        if (!new File(sp_getStringValue(str3, "")).exists()) {
                            removeKey(str3);
                            h.a("zzb", "清理key =" + str3);
                        }
                    } catch (Exception unused) {
                        removeKey(str3);
                        h.a("zzb", "清理key =" + str3);
                    }
                }
            }
            return;
        }
        invoke(createParams(9, str, str2));
    }

    public void removeKey(String str) {
        x.e();
        SharedPreferences.Editor edit = getSharedPreference().edit();
        edit.remove(str);
        y.a(edit);
    }
}
