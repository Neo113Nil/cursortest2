package com.amplitude.reactnative;

import kotlin.Metadata;

/* compiled from: LegacyDatabaseStorage.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amplitude/reactnative/DatabaseConstants;", "", "<init>", "()V", "DEFAULT_INSTANCE", "", "DATABASE_NAME", "DATABASE_VERSION", "", "EVENT_TABLE_NAME", "IDENTIFY_TABLE_NAME", "IDENTIFY_INTERCEPTOR_TABLE_NAME", "ID_FIELD", "EVENT_FIELD", "LONG_STORE_TABLE_NAME", "STORE_TABLE_NAME", "KEY_FIELD", "VALUE_FIELD", "amplitude_analytics-react-native_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DatabaseConstants {
    public static final String DATABASE_NAME = "com.amplitude.api";
    public static final int DATABASE_VERSION = 4;
    public static final String DEFAULT_INSTANCE = "$default_instance";
    public static final String EVENT_FIELD = "event";
    public static final String EVENT_TABLE_NAME = "events";
    public static final String IDENTIFY_INTERCEPTOR_TABLE_NAME = "identify_interceptor";
    public static final String IDENTIFY_TABLE_NAME = "identifys";
    public static final String ID_FIELD = "id";
    public static final DatabaseConstants INSTANCE = new DatabaseConstants();
    public static final String KEY_FIELD = "key";
    public static final String LONG_STORE_TABLE_NAME = "long_store";
    public static final String STORE_TABLE_NAME = "store";
    public static final String VALUE_FIELD = "value";

    private DatabaseConstants() {
    }
}
