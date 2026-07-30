package com.crrepa.ble.hisilicon.connectkit;

import androidx.annotation.Keep;
import cn.hutool.core.util.g1;

@Keep
/* loaded from: classes3.dex */
public class ConnectKitFileCompleteMessage {
    private String content;
    private String name;
    private String type = g1.URL_PROTOCOL_FILE;
    private String filemode = "text";
    private String permission = "RW";

    public ConnectKitFileCompleteMessage(String str, String str2) {
        this.name = str;
        this.content = str2;
    }

    public String getContent() {
        return this.content;
    }

    public String getFilemode() {
        return this.filemode;
    }

    public String getName() {
        return this.name;
    }

    public String getPermission() {
        return this.permission;
    }

    public String getType() {
        return this.type;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setFilemode(String str) {
        this.filemode = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPermission(String str) {
        this.permission = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
