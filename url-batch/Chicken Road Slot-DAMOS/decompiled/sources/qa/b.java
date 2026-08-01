package qa;

import java.util.Set;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface b {
    Boolean getBool(String str, String str2, Boolean bool);

    Integer getInt(String str, String str2, Integer num);

    Long getLong(String str, String str2, Long l10);

    String getString(String str, String str2, String str3);

    Set<String> getStringSet(String str, String str2, Set<String> set);

    void saveBool(String str, String str2, Boolean bool);

    void saveInt(String str, String str2, Integer num);

    void saveLong(String str, String str2, Long l10);

    void saveString(String str, String str2, String str3);

    void saveStringSet(String str, String str2, Set<String> set);
}
