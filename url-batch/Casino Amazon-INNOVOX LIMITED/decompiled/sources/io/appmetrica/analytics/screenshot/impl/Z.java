package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class Z extends ContentObserver {
    public static final String d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f1720a;
    public final Function0 b;
    public volatile C0699k c;

    public Z(ClientContext clientContext, C0706s c0706s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f1720a = clientContext;
        this.b = c0706s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C0699k c0699k;
        super.onChange(z, uri);
        if (!StringsKt.startsWith$default(String.valueOf(uri), d, false, 2, (Object) null) || (c0699k = this.c) == null) {
            return;
        }
        try {
            String[] strArr = (String[]) ArraysKt.plus((Object[]) new String[]{"date_added"}, (Collection) c0699k.b);
            Cursor query = this.f1720a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c0699k.c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it = c0699k.b.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.contains$default((CharSequence) query.getString(query.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), (CharSequence) "screenshot", false, 2, (Object) null)) {
                                this.b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(query, null);
        } catch (Exception unused) {
        }
    }
}
