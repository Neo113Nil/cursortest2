package io.appmetrica.analytics.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.impl.AbstractC2967sj;
import io.appmetrica.analytics.impl.C3015uf;
import io.appmetrica.analytics.impl.C3041vf;
import io.appmetrica.analytics.impl.C3140za;
import io.appmetrica.analytics.impl.L3;
import io.appmetrica.analytics.impl.M3;
import io.appmetrica.analytics.impl.W5;
import io.appmetrica.analytics.impl.X5;
import io.appmetrica.analytics.logger.appmetrica.internal.ImportantLogger;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public class PreloadInfoContentProvider extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    private boolean f40418a = false;

    /* renamed from: b, reason: collision with root package name */
    private final UriMatcher f40419b = new UriMatcher(-1);

    private void a(X5 x5, ContentValues contentValues) {
        Context context = getContext();
        Context applicationContext = context == null ? null : context.getApplicationContext();
        if (applicationContext != null) {
            try {
                Object invoke = x5.f38512a.invoke(contentValues);
                if (invoke != null) {
                    x5.f38514c.b(applicationContext);
                    if (((Boolean) x5.f38513b.invoke(invoke)).booleanValue()) {
                        AbstractC2967sj.a("Successfully saved " + x5.f38515d, new Object[0]);
                    } else {
                        AbstractC2967sj.a("Did not save " + x5.f38515d + " because data is already present", new Object[0]);
                    }
                }
            } catch (Throwable th) {
                ImportantLogger.INSTANCE.info("AppMetrica-Attribution", String.format("Unexpected error occurred", new Object[0]) + "\n" + StringUtils.throwableToString(th), new Object[0]);
            }
        }
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, String str, String[] strArr) {
        AbstractC2967sj.a("Deleting is not supported", new Object[0]);
        return -1;
    }

    public synchronized void disable() {
        this.f40418a = true;
    }

    @Override // android.content.ContentProvider
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        synchronized (this) {
            try {
                if (this.f40418a) {
                    return null;
                }
                if (contentValues != null) {
                    int match = this.f40419b.match(uri);
                    if (match == 1) {
                        a(new X5(new C3015uf(), new C3041vf(), C3140za.f40370d, "preload info"), contentValues);
                    } else if (match != 2) {
                        AbstractC2967sj.a("Bad content provider uri.", new Object[0]);
                    } else {
                        a(new X5(new L3(), new M3(), C3140za.f40370d, "clids"), contentValues);
                    }
                }
                CountDownLatch countDownLatch = W5.f38455a;
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
        String str = (applicationContext != null ? applicationContext.getPackageName() : "") + ".appmetrica.preloadinfo.retail";
        this.f40419b.addURI(str, "preloadinfo", 1);
        this.f40419b.addURI(str, "clids", 2);
        W5.f38455a = new CountDownLatch(1);
        W5.f38456b = this;
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        AbstractC2967sj.a("Query is not supported", new Object[0]);
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        AbstractC2967sj.a("Updating is not supported", new Object[0]);
        return -1;
    }
}
