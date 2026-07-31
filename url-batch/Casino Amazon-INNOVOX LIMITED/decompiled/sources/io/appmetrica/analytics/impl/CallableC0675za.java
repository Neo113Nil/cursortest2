package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* renamed from: io.appmetrica.analytics.impl.za, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class CallableC0675za implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Aa f1597a;

    public CallableC0675za(Aa aa) {
        this.f1597a = aa;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f1597a.f760a.getContentResolver();
        Aa aa = this.f1597a;
        aa.b = contentResolver.query(parse, null, null, new String[]{aa.f760a.getPackageName()}, null);
        Cursor cursor = this.f1597a.b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f1597a.b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new C0407og(string, this.f1597a.b.getLong(1), this.f1597a.b.getLong(2), EnumC0382ng.d);
    }
}
