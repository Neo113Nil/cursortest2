package io.appmetrica.analytics.impl;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class Ta implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ua f38301a;

    public Ta(Ua ua) {
        this.f38301a = ua;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri parse = Uri.parse("content://com.huawei.appmarket.commondata/item/5");
        ContentResolver contentResolver = this.f38301a.f38356a.getContentResolver();
        Ua ua = this.f38301a;
        ua.f38357b = contentResolver.query(parse, null, null, new String[]{ua.f38356a.getPackageName()}, null);
        Cursor cursor = this.f38301a.f38357b;
        if (cursor == null || !cursor.moveToFirst()) {
            return null;
        }
        String string = this.f38301a.f38357b.getString(0);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return new Ag(string, this.f38301a.f38357b.getLong(1), this.f38301a.f38357b.getLong(2), EnumC3146zg.f40386d);
    }
}
