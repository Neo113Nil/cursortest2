package io.appmetrica.analytics.gpllibrary.internal;

import a0.C0144j;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import b2.e;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import q2.C1385a;
import q2.b;
import t2.f;
import t2.j;

/* loaded from: classes.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final C1385a f9841a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f9842b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f9843c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f9844d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f9845e;

    /* renamed from: f, reason: collision with root package name */
    private final long f9846f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9847a;

        static {
            int[] iArr = new int[Priority.values().length];
            f9847a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9847a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9847a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f9848a;

        public ClientProvider(Context context) {
            this.f9848a = context;
        }

        public final C1385a a() {
            return new C1385a(this.f9848a, b.f15086a, b2.b.f5383a, new e(new C0144j(4, false), Looper.getMainLooper()));
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(Context context, LocationListener locationListener, Looper looper, Executor executor, long j4) throws Throwable {
        this(new ClientProvider(context), locationListener, looper, executor, j4);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void startLocationUpdates(Priority priority) throws Throwable {
        C1385a c1385a = this.f9841a;
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.f6050i = true;
        long j4 = this.f9846f;
        if (j4 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString());
        }
        locationRequest.f6043b = j4;
        if (!locationRequest.f6045d) {
            locationRequest.f6044c = (long) (j4 / 6.0d);
        }
        int i4 = AnonymousClass1.f9847a[priority.ordinal()];
        int i5 = i4 != 1 ? i4 != 2 ? i4 != 3 ? 105 : 100 : 102 : 104;
        if (i5 == 100 || i5 == 102 || i5 == 104 || i5 == 105) {
            locationRequest.f6042a = i5;
            c1385a.requestLocationUpdates(locationRequest, this.f9843c, this.f9844d);
        } else {
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("invalid quality: ");
            sb2.append(i5);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() throws Throwable {
        this.f9841a.removeLocationUpdates(this.f9843c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void updateLastKnownLocation() throws Throwable {
        Task lastLocation = this.f9841a.getLastLocation();
        Executor executor = this.f9845e;
        GplOnSuccessListener gplOnSuccessListener = new GplOnSuccessListener(this.f9842b);
        j jVar = (j) lastLocation;
        jVar.getClass();
        jVar.f15419b.b(new f(executor, gplOnSuccessListener));
        jVar.g();
    }

    public GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j4) {
        this.f9841a = clientProvider.a();
        this.f9842b = locationListener;
        this.f9844d = looper;
        this.f9845e = executor;
        this.f9846f = j4;
        this.f9843c = new GplLocationCallback(locationListener);
    }
}
