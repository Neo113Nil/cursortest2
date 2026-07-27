package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class Fa implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ga f6782a;

    public Fa(Ga ga) {
        this.f6782a = ga;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f6782a.f6830a.getContentResolver();
        Ga ga = this.f6782a;
        ga.f6831b = contentResolver.query(parse, null, null, new String[]{ga.f6830a.getPackageName()}, null);
        Cursor cursor = this.f6782a.f6831b;
        if (cursor != null && cursor.moveToFirst()) {
            String string = this.f6782a.f6831b.getString(0);
            if (!TextUtils.isEmpty(string)) {
                return new C0981sg(string, this.f6782a.f6831b.getLong(1), this.f6782a.f6831b.getLong(2), EnumC0955rg.f9175d);
            }
        }
        return null;
    }
}
