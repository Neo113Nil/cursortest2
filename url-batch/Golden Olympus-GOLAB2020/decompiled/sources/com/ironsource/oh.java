package com.ironsource;

import java.io.File;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class oh extends File {
    public oh(String str) {
        super(str);
    }

    public JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    @Override // java.io.File
    public String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }

    public oh(String str, String str2) {
        super(str, str2);
    }
}
