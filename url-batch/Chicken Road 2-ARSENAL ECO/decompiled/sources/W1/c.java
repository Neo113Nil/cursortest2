package W1;

import android.content.ContentValues;
import x5.InterfaceC0743l;

/* loaded from: classes.dex */
public interface c {
    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    void insertOrThrow(String str, String str2, ContentValues contentValues);

    void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, InterfaceC0743l interfaceC0743l);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
