package io.appmetrica.analytics.coreapi.internal.event;

import java.util.Map;

/* loaded from: classes.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    Map<String, byte[]> getExtras();

    String getName();

    int getType();

    String getValue();

    byte[] getValueBytes();

    void setBytesTruncated(int i4);

    void setCustomType(int i4);

    void setExtras(Map<String, byte[]> map);

    void setName(String str);

    void setType(int i4);

    void setValue(String str);

    void setValueBytes(byte[] bArr);
}
