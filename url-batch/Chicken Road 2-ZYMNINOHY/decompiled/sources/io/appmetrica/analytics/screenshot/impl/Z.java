package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import o3.InterfaceC1328a;
import w3.AbstractC1510g;

/* loaded from: classes.dex */
public final class Z extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13450d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f13451a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1328a f13452b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1153k f13453c;

    public Z(ClientContext clientContext, C1160s c1160s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f13451a = clientContext;
        this.f13452b = c1160s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C1153k c1153k;
        super.onChange(z, uri);
        if (!w3.o.a0(String.valueOf(uri), f13450d, false) || (c1153k = this.f13453c) == null) {
            return;
        }
        try {
            List elements = c1153k.f13481b;
            kotlin.jvm.internal.i.e(elements, "elements");
            int i4 = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i4] = it.next();
                i4++;
            }
            kotlin.jvm.internal.i.b(copyOf);
            String[] strArr = (String[]) copyOf;
            Cursor query = this.f13451a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c1153k.f13482c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c1153k.f13481b.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC1510g.c0(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot")) {
                                this.f13452b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        U.i.c(query, th);
                        throw th2;
                    }
                }
            }
            U.i.c(query, null);
        } catch (Exception unused) {
        }
    }
}
