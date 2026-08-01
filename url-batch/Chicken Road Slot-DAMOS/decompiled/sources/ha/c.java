package ha;

import android.content.ContentValues;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface c {
    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    void insertOrThrow(String str, String str2, ContentValues contentValues);

    void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, Function1<? super a, Unit> function1);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
