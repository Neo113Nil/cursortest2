package y2;

import android.content.ContentValues;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: y2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1026c {
    void delete(String str, String str2, String[] strArr);

    void insert(String str, String str2, ContentValues contentValues);

    void insertOrThrow(String str, String str2, ContentValues contentValues);

    void query(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6, Function1<? super InterfaceC1024a, Unit> function1);

    int update(String str, ContentValues contentValues, String str2, String[] strArr);
}
