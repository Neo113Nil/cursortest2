package io.appmetrica.analytics.gpllibrary.internal;

import K0.j;
import L0.e;
import a1.C0132a;
import a1.b;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import d1.g;
import d1.k;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final C0132a f5582a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f5583b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f5584c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f5585d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f5586e;
    private final long f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5587a;

        static {
            int[] iArr = new int[Priority.values().length];
            f5587a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5587a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5587a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f5588a;

        public ClientProvider(Context context) {
            this.f5588a = context;
        }

        public final C0132a a() {
            return new C0132a(this.f5588a, b.f1922a, L0.b.f875a, new e(new j(11), Looper.getMainLooper()));
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j3) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j3);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void startLocationUpdates(Priority priority) throws Throwable {
        C0132a c0132a = this.f5582a;
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f2979i = true;
        long j3 = this.f;
        if (j3 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j3);
            throw new IllegalArgumentException(sb.toString());
        }
        locationRequest.f2973b = j3;
        if (!locationRequest.f2975d) {
            locationRequest.f2974c = (long) (j3 / 6.0d);
        }
        int i3 = AnonymousClass1.f5587a[priority.ordinal()];
        int i4 = i3 != 1 ? i3 != 2 ? i3 != 3 ? 105 : 100 : 102 : 104;
        if (i4 == 100 || i4 == 102 || i4 == 104 || i4 == 105) {
            locationRequest.f2972a = i4;
            c0132a.requestLocationUpdates(locationRequest, this.f5584c, this.f5585d);
        } else {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("invalid quality: ");
            sb2.append(i4);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f5582a.removeLocationUpdates(this.f5584c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void updateLastKnownLocation() throws Throwable {
        Task lastLocation = this.f5582a.getLastLocation();
        Executor executor = this.f5586e;
        GplOnSuccessListener gplOnSuccessListener = new GplOnSuccessListener(this.f5583b);
        k kVar = (k) lastLocation;
        kVar.getClass();
        kVar.f4943b.d(new g(executor, gplOnSuccessListener));
        kVar.g();
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j3) {
        this.f5582a = clientProvider.a();
        this.f5583b = locationListener;
        this.f5585d = looper;
        this.f5586e = executor;
        this.f = j3;
        this.f5584c = new GplLocationCallback(locationListener);
    }
}
