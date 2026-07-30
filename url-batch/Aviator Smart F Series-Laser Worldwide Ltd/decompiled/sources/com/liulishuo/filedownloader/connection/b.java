package com.liulishuo.filedownloader.connection;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public interface b {
    public static final int NO_RESPONSE_CODE = 0;
    public static final int RESPONSE_CODE_FROM_OFFSET = 1;

    void addHeader(String str, String str2);

    boolean dispatchAddResumeOffset(String str, long j8);

    void ending();

    void execute();

    InputStream getInputStream();

    Map<String, List<String>> getRequestHeaderFields();

    int getResponseCode();

    String getResponseHeaderField(String str);

    Map<String, List<String>> getResponseHeaderFields();

    boolean setRequestMethod(String str);
}
