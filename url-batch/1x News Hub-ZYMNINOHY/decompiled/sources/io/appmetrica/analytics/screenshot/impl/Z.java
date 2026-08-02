package io.appmetrica.analytics.screenshot.impl;

import a.AbstractC0129a;
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

/* loaded from: classes.dex */
public final class Z extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f9021d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f9022a;

    /* renamed from: b, reason: collision with root package name */
    public final l2.a f9023b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C1028k f9024c;

    public Z(ClientContext clientContext, C1035s c1035s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f9022a = clientContext;
        this.f9023b = c1035s;
    }

    /* JADX WARN: Finally extract failed */
    @Override // android.database.ContentObserver
    public final void onChange(boolean z, Uri uri) {
        C1028k c1028k;
        super.onChange(z, uri);
        if (!s2.n.X(String.valueOf(uri), f9021d) || (c1028k = this.f9024c) == null) {
            return;
        }
        try {
            List elements = c1028k.f9051b;
            kotlin.jvm.internal.j.e(elements, "elements");
            int i3 = 1;
            Object[] copyOf = Arrays.copyOf(new String[]{"date_added"}, elements.size() + 1);
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                copyOf[i3] = it.next();
                i3++;
            }
            kotlin.jvm.internal.j.b(copyOf);
            String[] strArr = (String[]) copyOf;
            Cursor query = this.f9022a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c1028k.f9052c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it2 = c1028k.f9051b.iterator();
                        while (it2.hasNext()) {
                            if (s2.n.R(query.getString(query.getColumnIndexOrThrow((String) it2.next())).toLowerCase(Locale.ROOT), "screenshot")) {
                                this.f9023b.invoke();
                            }
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC0129a.h(query, th);
                        throw th2;
                    }
                }
            }
            AbstractC0129a.h(query, null);
        } catch (Exception unused) {
        }
    }
}
