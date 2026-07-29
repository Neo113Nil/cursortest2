package com.cmplay.internalpush.ipc;

import android.content.ContentValues;
import com.cmplay.base.util.ipc.a;
import com.cmplay.base.util.x;
import com.cmplay.internalpush.a.e;
import com.cmplay.internalpush.video.h;

/* loaded from: classes.dex */
public class IpcVideoHelper extends a {
    private static final int GET_STRING = 4;
    private static final int GET_VIDEO_FILE_SIZE = 3;
    private static final int SERVICE_VIDEO_DOWN = 1;
    private static final int SET_STRING = 5;
    private static final int SET_VIDEO_FILE_SIZE = 2;
    private static IpcVideoHelper mInstance;

    private IpcVideoHelper() {
    }

    public static IpcVideoHelper getInstance() {
        if (mInstance == null) {
            mInstance = new IpcVideoHelper();
        }
        return mInstance;
    }

    @Override // com.cmplay.base.util.ipc.a
    public String handler(ContentValues contentValues) {
        int mid = getMid(contentValues);
        String[] params = getParams(contentValues);
        switch (mid) {
            case 1:
                if (params.length < 4) {
                    return null;
                }
                ipcServiceStartDown(params[0], params[1], params[2], params[3]);
                return null;
            case 2:
                if (params.length < 2) {
                    return null;
                }
                ipcSetLong(params[0], Long.valueOf(params[1]).longValue());
                return null;
            case 3:
                if (params.length < 2) {
                    return null;
                }
                return "" + ipcGetLong(params[0], Long.valueOf(params[1]).longValue());
            case 4:
                if (params.length < 2) {
                    return null;
                }
                return ipcGetString(params[0], params[1]);
            case 5:
                if (params.length < 2) {
                    return null;
                }
                ipcSetString(params[0], params[1]);
                return null;
            default:
                return null;
        }
    }

    public void ipcServiceStartDown(String str, String str2, String str3, String str4) {
        if (x.a()) {
            h.a(str, str2, str3, str4);
        } else {
            invoke(createParams(1, str, str2, str3, str4));
        }
    }

    public void ipcSetLong(String str, long j) {
        if (x.a()) {
            e.b(str, j);
        } else {
            invoke(createParams(2, str, Long.valueOf(j)));
        }
    }

    public long ipcGetLong(String str, long j) {
        if (x.a()) {
            return e.a(str, j);
        }
        return Long.valueOf(invoke(createParams(3, str, Long.valueOf(j)), Long.valueOf(j))).longValue();
    }

    public String ipcGetString(String str, String str2) {
        if (x.a()) {
            return e.a(str, str2);
        }
        return invoke(createParams(4, str, str2), str2);
    }

    public void ipcSetString(String str, String str2) {
        if (x.a()) {
            e.b(str, str2);
        } else {
            invoke(createParams(4, str, str2), str2);
        }
    }
}
