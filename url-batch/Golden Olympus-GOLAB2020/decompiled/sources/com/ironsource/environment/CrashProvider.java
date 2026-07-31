package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.ironsource.fa;

/* loaded from: classes2.dex */
public class CrashProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    Context f16083a;

    /* renamed from: b, reason: collision with root package name */
    fa f16084b;

    /* renamed from: c, reason: collision with root package name */
    String f16085c;

    /* renamed from: e, reason: collision with root package name */
    Uri f16087e;

    /* renamed from: h, reason: collision with root package name */
    String f16090h;

    /* renamed from: i, reason: collision with root package name */
    String f16091i;

    /* renamed from: d, reason: collision with root package name */
    UriMatcher f16086d = new UriMatcher(-1);

    /* renamed from: f, reason: collision with root package name */
    final int f16088f = 1;

    /* renamed from: g, reason: collision with root package name */
    final int f16089g = 2;

    /* renamed from: j, reason: collision with root package name */
    final String f16092j = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.f16086d.match(uri);
        if (match == 1) {
            return this.f16090h;
        }
        if (match == 2) {
            return this.f16091i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.f16083a = getContext();
        this.f16084b = new fa(this.f16083a);
        this.f16085c = this.f16083a.getPackageName();
        this.f16087e = Uri.parse("content://" + this.f16085c + "/REPORTS");
        this.f16090h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f16091i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f16086d.match(uri);
        if (match == 1) {
            return fa.c();
        }
        if (match == 2) {
            return fa.a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
