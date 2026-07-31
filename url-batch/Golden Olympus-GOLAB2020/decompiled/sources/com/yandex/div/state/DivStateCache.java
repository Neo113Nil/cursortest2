package com.yandex.div.state;

import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface DivStateCache {
    void clear();

    String getRootState(@NonNull String str);

    String getState(@NonNull String str, @NonNull String str2);

    void putRootState(@NonNull String str, @NonNull String str2);

    void putState(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void resetCard(@NonNull String str);
}
