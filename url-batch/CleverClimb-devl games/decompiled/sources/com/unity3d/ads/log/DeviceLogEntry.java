package com.unity3d.ads.log;

/* loaded from: classes2.dex */
class DeviceLogEntry {
    private DeviceLogLevel _logLevel;
    private String _originalMessage;
    private StackTraceElement _stackTraceElement;

    public DeviceLogEntry(DeviceLogLevel deviceLogLevel, String str, StackTraceElement stackTraceElement) {
        this._logLevel = null;
        this._originalMessage = null;
        this._stackTraceElement = null;
        this._logLevel = deviceLogLevel;
        this._originalMessage = str;
        this._stackTraceElement = stackTraceElement;
    }

    public DeviceLogLevel getLogLevel() {
        return this._logLevel;
    }

    public String getParsedMessage() {
        int i;
        String str = this._originalMessage;
        String str2 = "UnknownClass";
        String str3 = "unknownMethod";
        if (this._stackTraceElement != null) {
            str2 = this._stackTraceElement.getClassName();
            str3 = this._stackTraceElement.getMethodName();
            i = this._stackTraceElement.getLineNumber();
        } else {
            i = -1;
        }
        if (str != null && !str.isEmpty()) {
            str = " :: " + str;
        }
        if (str == null) {
            str = "";
        }
        return str2 + "." + str3 + "()" + (" (line:" + i + ")") + str;
    }
}
