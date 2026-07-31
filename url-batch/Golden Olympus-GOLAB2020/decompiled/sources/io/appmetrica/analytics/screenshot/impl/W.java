package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import f2.AbstractC2420c;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.AbstractC3219i;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class W extends ContentObserver {

    /* renamed from: d, reason: collision with root package name */
    public static final String f40729d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* renamed from: a, reason: collision with root package name */
    public final ClientContext f40730a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f40731b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C3164j f40732c;

    public W(ClientContext clientContext, r rVar) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f40730a = clientContext;
        this.f40731b = rVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z4, Uri uri) {
        C3164j c3164j;
        super.onChange(z4, uri);
        if (!StringsKt.K(String.valueOf(uri), f40729d, false, 2, null) || (c3164j = this.f40732c) == null) {
            return;
        }
        try {
            String[] strArr = (String[]) AbstractC3219i.q(new String[]{"date_added"}, c3164j.f40765b);
            Cursor query = this.f40730a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c3164j.f40766c)}, "date_added DESC");
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        for (String str : strArr) {
                        }
                        Iterator it = c3164j.f40765b.iterator();
                        while (it.hasNext()) {
                            if (StringsKt.P(query.getString(query.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), "screenshot", false, 2, null)) {
                                this.f40731b.invoke();
                            }
                        }
                    }
                } finally {
                }
            }
            Unit unit = Unit.f41027a;
            AbstractC2420c.a(query, null);
        } catch (Exception unused) {
        }
    }
}
