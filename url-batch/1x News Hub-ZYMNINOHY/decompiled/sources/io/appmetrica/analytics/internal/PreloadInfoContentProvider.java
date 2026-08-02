package io.appmetrica.analytics.internal;

import E1.AbstractC0033i;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC0626kj;
import io.appmetrica.analytics.impl.C0643la;
import io.appmetrica.analytics.impl.C0648lf;
import io.appmetrica.analytics.impl.C0674mf;
import io.appmetrica.analytics.impl.C0947x3;
import io.appmetrica.analytics.impl.C0972y3;
import io.appmetrica.analytics.impl.H5;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f8723a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f8724b = new UriMatcher(-1);

    private void a(I5 i5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = i5.f6134a.invoke(contentValues);
                if (invoke != null) {
                    i5.f6136c.b(applicationContext);
                    if (((Boolean) i5.f6135b.invoke(invoke)).booleanValue()) {
                        AbstractC0626kj.a("Successfully saved " + i5.f6137d, new Object[0]);
                    } else {
                        AbstractC0626kj.a("Did not save " + i5.f6137d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC0626kj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f8723a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f8723a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f8724b.match(uri);
                    if (match == 1) {
                        a(new I5(new C0648lf(), new C0674mf(), C0643la.f7816d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0626kj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new I5(new C0947x3(), new C0972y3(), C0643la.f7816d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = H5.f6062a;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        String s3 = AbstractC0033i.s(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f8724b.addURI(s3, "preloadinfo", 1);
        this.f8724b.addURI(s3, "clids", 2);
        H5.f6062a = new CountDownLatch(1);
        H5.f6063b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0626kj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0626kj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
