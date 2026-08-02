package io.appmetrica.analytics.internal;

import E.AbstractC0005f;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.A5;
import io.appmetrica.analytics.impl.AbstractC0619fj;
import io.appmetrica.analytics.impl.B5;
import io.appmetrica.analytics.impl.C0584ea;
import io.appmetrica.analytics.impl.C0641gf;
import io.appmetrica.analytics.impl.C0667hf;
import io.appmetrica.analytics.impl.C0862p3;
import io.appmetrica.analytics.impl.C0888q3;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f13116a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f13117b = new UriMatcher(-1);

    private void a(B5 b5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = b5.f10086a.invoke(contentValues);
                if (invoke != null) {
                    b5.f10088c.b(applicationContext);
                    if (((Boolean) b5.f10087b.invoke(invoke)).booleanValue()) {
                        AbstractC0619fj.a("Successfully saved " + b5.f10089d, new Object[0]);
                    } else {
                        AbstractC0619fj.a("Did not save " + b5.f10089d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", "Unexpected error occurred\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        AbstractC0619fj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f13116a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f13116a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f13117b.match(uri);
                    if (match == 1) {
                        a(new B5(new C0641gf(), new C0667hf(), C0584ea.f11782d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC0619fj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new B5(new C0862p3(), new C0888q3(), C0584ea.f11782d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = A5.f10021a;
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
        String z = AbstractC0005f.z(applicationContext != null ? applicationContext.getPackageName() : "", ".appmetrica.preloadinfo.retail");
        this.f13117b.addURI(z, "preloadinfo", 1);
        this.f13117b.addURI(z, "clids", 2);
        A5.f10021a = new CountDownLatch(1);
        A5.f10022b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC0619fj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC0619fj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
