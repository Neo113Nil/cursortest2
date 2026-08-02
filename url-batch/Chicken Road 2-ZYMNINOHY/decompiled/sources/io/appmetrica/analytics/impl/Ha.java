package io.appmetrica.analytics.impl;

import java.util.Set;

/* loaded from: classes.dex */
public interface Ha {
    Ha a(int i4, String str);

    Ha a(String str, float f4);

    Ha a(String str, long j4);

    Ha a(String str, String str2);

    Ha a(String str, boolean z);

    Set a();

    boolean a(String str);

    void b();

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i4);

    long getLong(String str, long j4);

    String getString(String str, String str2);

    Ha remove(String str);
}
