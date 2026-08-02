package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.ya, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class CallableC1102ya implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1128za f13056a;

    public CallableC1102ya(C1128za c1128za) {
        this.f13056a = c1128za;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f13056a.f13099a.getContentResolver();
        C1128za c1128za = this.f13056a;
        c1128za.f13100b = contentResolver.query(parse, null, null, new String[]{c1128za.f13099a.getPackageName()}, null);
        Cursor cursor = this.f13056a.f13100b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f13056a.f13100b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C0823ng(string, this.f13056a.f13100b.getLong(1), this.f13056a.f13100b.getLong(2), EnumC0797mg.f12363d);
    }
}
