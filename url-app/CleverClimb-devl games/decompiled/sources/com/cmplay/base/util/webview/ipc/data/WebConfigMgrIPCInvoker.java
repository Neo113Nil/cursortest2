package com.cmplay.base.util.webview.ipc.data;

import android.content.ContentValues;
import android.text.TextUtils;
import com.cmplay.base.util.webview.ipc.AbsIpcProviderHandler;
import com.cmplay.base.util.webview.ipc.IWebIpcProviderInvoker;
import com.cmplay.base.util.webview.ipc.WebIpcProvider;

/* loaded from: classes.dex */
public class WebConfigMgrIPCInvoker implements IWebIpcProviderInvoker, IWebConfigManager {
    private static final String ARG1 = "arg1";
    private static final String ARG2 = "arg2";
    private static final String KEY_FUNC_TYPE = "func_type";
    private static final int TYPE_BASE = 0;
    private static final int TYPE_GET_BOOLEAN_VALUE = 4;
    private static final int TYPE_GET_INT_VALUE = 2;
    private static final int TYPE_GET_LONG_VALUE = 3;
    private static final int TYPE_GET_STRING_VALUE = 1;
    private static final int TYPE_SET_BOOLEAN_VALUE = 8;
    private static final int TYPE_SET_INT_VALUE = 6;
    private static final int TYPE_SET_LONG_VALUE = 7;
    private static final int TYPE_SET_STRING_VALUE = 5;

    @Override // com.cmplay.base.util.webview.ipc.IWebIpcProviderInvoker
    public int getIPDId() {
        return 3;
    }

    public static class IpcProviderHandler extends AbsIpcProviderHandler {
        @Override // com.cmplay.base.util.webview.ipc.IIpcProviderHandler
        public String handleRequest(ContentValues contentValues) {
            switch (contentValues.getAsInteger(WebConfigMgrIPCInvoker.KEY_FUNC_TYPE).intValue()) {
                case 1:
                    return WebConfigManager.getInstanse(getContext()).getStringValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsString(WebConfigMgrIPCInvoker.ARG2));
                case 2:
                    return String.valueOf(WebConfigManager.getInstanse(getContext()).getIntValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsInteger(WebConfigMgrIPCInvoker.ARG2).intValue()));
                case 3:
                    return String.valueOf(WebConfigManager.getInstanse(getContext()).getLongValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsLong(WebConfigMgrIPCInvoker.ARG2).longValue()));
                case 4:
                    return String.valueOf(WebConfigManager.getInstanse(getContext()).getBooleanValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsBoolean(WebConfigMgrIPCInvoker.ARG2).booleanValue()));
                case 5:
                    WebConfigManager.getInstanse(getContext()).setStringValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsString(WebConfigMgrIPCInvoker.ARG2));
                    return null;
                case 6:
                    WebConfigManager.getInstanse(getContext()).setIntValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsInteger(WebConfigMgrIPCInvoker.ARG2).intValue());
                    return null;
                case 7:
                    WebConfigManager.getInstanse(getContext()).setLongValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsLong(WebConfigMgrIPCInvoker.ARG2).longValue());
                    return null;
                case 8:
                    WebConfigManager.getInstanse(getContext()).setBooleanValue(contentValues.getAsString(WebConfigMgrIPCInvoker.ARG1), contentValues.getAsBoolean(WebConfigMgrIPCInvoker.ARG2).booleanValue());
                    return null;
                default:
                    return null;
            }
        }
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public long getLongValue(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 3);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, Long.valueOf(j));
        String invoke = WebIpcProvider.invoke(contentValues, this);
        return TextUtils.isEmpty(invoke) ? j : Long.valueOf(invoke).longValue();
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public boolean getBooleanValue(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 4);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, Boolean.valueOf(z));
        String invoke = WebIpcProvider.invoke(contentValues, this);
        return TextUtils.isEmpty(invoke) ? z : Boolean.valueOf(invoke).booleanValue();
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public int getIntValue(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 2);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, Integer.valueOf(i));
        String invoke = WebIpcProvider.invoke(contentValues, this);
        return TextUtils.isEmpty(invoke) ? i : Integer.valueOf(invoke).intValue();
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public String getStringValue(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 1);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, str2);
        return WebIpcProvider.invoke(contentValues, this);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setBooleanValue(String str, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 8);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, Boolean.valueOf(z));
        WebIpcProvider.invoke(contentValues, this);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setLongValue(String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 7);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, Long.valueOf(j));
        WebIpcProvider.invoke(contentValues, this);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setIntValue(String str, int i) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 6);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, Integer.valueOf(i));
        WebIpcProvider.invoke(contentValues, this);
    }

    @Override // com.cmplay.base.util.webview.ipc.data.IWebConfigManager
    public void setStringValue(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(KEY_FUNC_TYPE, (Integer) 5);
        contentValues.put(ARG1, str);
        contentValues.put(ARG2, str2);
        WebIpcProvider.invoke(contentValues, this);
    }
}
