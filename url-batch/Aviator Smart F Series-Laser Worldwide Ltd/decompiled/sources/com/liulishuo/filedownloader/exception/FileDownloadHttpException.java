package com.liulishuo.filedownloader.exception;

import com.liulishuo.filedownloader.util.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class FileDownloadHttpException extends IOException {
    private final int mCode;
    private final Map<String, List<String>> mRequestHeaderMap;
    private final Map<String, List<String>> mResponseHeaderMap;

    public FileDownloadHttpException(int i8, Map<String, List<String>> map, Map<String, List<String>> map2) {
        super(f.formatString("response code error: %d, \n request headers: %s \n response headers: %s", Integer.valueOf(i8), map, map2));
        this.mCode = i8;
        this.mRequestHeaderMap = cloneSerializableMap(map);
        this.mResponseHeaderMap = cloneSerializableMap(map);
    }

    private static Map<String, List<String>> cloneSerializableMap(Map<String, List<String>> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return hashMap;
    }

    public int getCode() {
        return this.mCode;
    }

    public Map<String, List<String>> getRequestHeader() {
        return this.mRequestHeaderMap;
    }

    public Map<String, List<String>> getResponseHeader() {
        return this.mResponseHeaderMap;
    }
}
