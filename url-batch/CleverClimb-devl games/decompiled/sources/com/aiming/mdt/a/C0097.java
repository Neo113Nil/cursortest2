package com.aiming.mdt.a;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: com.aiming.mdt.a.ʻʿˈˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class C0097 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private C0188 f290;

    /* renamed from: com.aiming.mdt.a.ʻʿˈˉ$ʽ, reason: contains not printable characters */
    static class C0098 {

        /* renamed from: ʻʼ, reason: contains not printable characters */
        private static final C0097 f291 = new C0097(0);
    }

    private C0097() {
    }

    /* synthetic */ C0097(byte b2) {
        this();
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    final boolean m367(String str, String str2) {
        return this.f290.m714(String.format("CREATE TABLE IF NOT EXISTS %s (_id INTEGER PRIMARY KEY AUTOINCREMENT,%s)", str, str2));
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final void m368(Context context, String str, int i) {
        this.f290 = C0188.m712(context, str, i);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public final boolean m369(String str, String str2, String... strArr) {
        if (strArr == null || strArr.length == 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM ");
        sb.append(str);
        sb.append(" WHERE ");
        sb.append(str2);
        sb.append(" IN(");
        for (int i = 0; i < strArr.length; i++) {
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
            if (i != strArr.length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return this.f290.m714(sb.toString());
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    final boolean m370(String str, String[] strArr, String... strArr2) {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(str);
        sb.append(" SET ");
        for (int i = 0; i <= 0; i++) {
            sb.append(strArr[0]);
        }
        sb.append(" WHERE ");
        for (int i2 = 0; i2 <= 0; i2++) {
            sb.append(strArr2[0]);
        }
        return this.f290.m714(sb.toString());
    }

    /* renamed from: ʻʽ, reason: contains not printable characters */
    final boolean m371(String str, String str2, String... strArr) {
        if (strArr.length == 0) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO ");
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(")");
        for (int i = 0; i < strArr.length; i++) {
            if (i != 0) {
                sb.append(" UNION ALL ");
            }
            sb.append("SELECT ");
            sb.append(strArr[i]);
        }
        return this.f290.m714(sb.toString());
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public final ArrayList<String[]> m372(String str, String str2, String... strArr) {
        return this.f290.m715(String.format("SELECT %s FROM %s", str2, str));
    }
}
