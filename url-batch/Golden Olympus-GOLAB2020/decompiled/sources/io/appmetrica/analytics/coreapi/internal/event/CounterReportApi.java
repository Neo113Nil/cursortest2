package io.appmetrica.analytics.coreapi.internal.event;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public interface CounterReportApi {
    int getBytesTruncated();

    int getCustomType();

    @NotNull
    Map<String, byte[]> getExtras();

    @Nullable
    String getName();

    int getType();

    @Nullable
    String getValue();

    @Nullable
    byte[] getValueBytes();

    void setBytesTruncated(int i4);

    void setCustomType(int i4);

    void setExtras(@NotNull Map<String, byte[]> map);

    void setName(@Nullable String str);

    void setType(int i4);

    void setValue(@Nullable String str);

    void setValueBytes(@Nullable byte[] bArr);
}
