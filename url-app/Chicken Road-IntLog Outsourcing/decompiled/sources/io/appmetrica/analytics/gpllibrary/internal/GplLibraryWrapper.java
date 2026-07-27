package io.appmetrica.analytics.gpllibrary.internal;

import E1.a;
import E1.c;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;
import l1.j;
import m1.InterfaceC1275b;
import m1.g;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final a f6348a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f6349b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f6350c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f6351d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f6352e;

    /* renamed from: f, reason: collision with root package name */
    private final long f6353f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6354a;

        static {
            int[] iArr = new int[Priority.values().length];
            f6354a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6354a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6354a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f6355a;

        public ClientProvider(Context context) {
            this.f6355a = context;
        }

        public final a a() {
            return new a(this.f6355a, c.f641a, InterfaceC1275b.f11122a, new g(new j(27), Looper.getMainLooper()));
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j2) {
        this(new ClientProvider(context), locationListener, looper, executor, j2);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void startLocationUpdates(Priority priority) {
        a aVar = this.f6348a;
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f5309i = true;
        long j2 = this.f6353f;
        LocationRequest.b(j2);
        locationRequest.f5302b = j2;
        if (!locationRequest.f5304d) {
            locationRequest.f5303c = (long) (j2 / 6.0d);
        }
        int i2 = AnonymousClass1.f6354a[priority.ordinal()];
        locationRequest.a(i2 != 1 ? i2 != 2 ? i2 != 3 ? 105 : 100 : 102 : 104);
        aVar.requestLocationUpdates(locationRequest, this.f6350c, this.f6351d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() {
        this.f6348a.removeLocationUpdates(this.f6350c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void updateLastKnownLocation() {
        this.f6348a.getLastLocation().a(this.f6352e, new GplOnSuccessListener(this.f6349b));
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j2) {
        this.f6348a = clientProvider.a();
        this.f6349b = locationListener;
        this.f6351d = looper;
        this.f6352e = executor;
        this.f6353f = j2;
        this.f6350c = new GplLocationCallback(locationListener);
    }
}
