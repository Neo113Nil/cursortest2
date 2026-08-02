package io.appmetrica.analytics.modulesapi.internal.common;

/* loaded from: classes.dex */
public interface ModulePreferences {

    public static final class DefaultImpls {
        public static /* synthetic */ int getInt$default(ModulePreferences modulePreferences, String str, int i4, int i5, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i5 & 2) != 0) {
                i4 = 0;
            }
            return modulePreferences.getInt(str, i4);
        }

        public static /* synthetic */ long getLong$default(ModulePreferences modulePreferences, String str, long j4, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i4 & 2) != 0) {
                j4 = 0;
            }
            return modulePreferences.getLong(str, j4);
        }

        public static /* synthetic */ String getString$default(ModulePreferences modulePreferences, String str, String str2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i4 & 2) != 0) {
                str2 = null;
            }
            return modulePreferences.getString(str, str2);
        }
    }

    boolean getBoolean(String str, boolean z);

    int getInt(String str, int i4);

    long getLong(String str, long j4);

    String getString(String str, String str2);

    void putBoolean(String str, boolean z);

    void putInt(String str, int i4);

    void putLong(String str, long j4);

    void putString(String str, String str2);
}
