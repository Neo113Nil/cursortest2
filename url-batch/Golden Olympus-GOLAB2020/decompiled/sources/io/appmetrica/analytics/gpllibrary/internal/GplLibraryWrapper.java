package io.appmetrica.analytics.gpllibrary.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class GplLibraryWrapper implements IGplLibraryWrapper {
    public static final String FUSED_PROVIDER = "fused";

    /* renamed from: a, reason: collision with root package name */
    private final FusedLocationProviderClient f37109a;

    /* renamed from: b, reason: collision with root package name */
    private final LocationListener f37110b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationCallback f37111c;

    /* renamed from: d, reason: collision with root package name */
    private final Looper f37112d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f37113e;

    /* renamed from: f, reason: collision with root package name */
    private final long f37114f;

    /* renamed from: io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37115a;

        static {
            int[] iArr = new int[Priority.values().length];
            f37115a = iArr;
            try {
                iArr[Priority.PRIORITY_LOW_POWER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37115a[Priority.PRIORITY_BALANCED_POWER_ACCURACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37115a[Priority.PRIORITY_HIGH_ACCURACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class ClientProvider {

        /* renamed from: a, reason: collision with root package name */
        private final Context f37116a;

        ClientProvider(Context context) {
            this.f37116a = context;
        }

        final FusedLocationProviderClient a() {
            return LocationServices.getFusedLocationProviderClient(this.f37116a);
        }
    }

    public enum Priority {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public GplLibraryWrapper(@NonNull Context context, @NonNull LocationListener locationListener, @NonNull Looper looper, @NonNull Executor executor, long j4) {
        this(new ClientProvider(context), locationListener, looper, executor, j4);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void startLocationUpdates(@NonNull Priority priority) {
        FusedLocationProviderClient fusedLocationProviderClient = this.f37109a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f37114f);
        int i4 = AnonymousClass1.f37115a[priority.ordinal()];
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(i4 != 1 ? i4 != 2 ? i4 != 3 ? 105 : 100 : 102 : 104), this.f37111c, this.f37112d);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    public void stopLocationUpdates() {
        this.f37109a.removeLocationUpdates(this.f37111c);
    }

    @Override // io.appmetrica.analytics.gpllibrary.internal.IGplLibraryWrapper
    @SuppressLint({"MissingPermission"})
    public void updateLastKnownLocation() {
        this.f37109a.getLastLocation().addOnSuccessListener(this.f37113e, new GplOnSuccessListener(this.f37110b));
    }

    GplLibraryWrapper(ClientProvider clientProvider, LocationListener locationListener, Looper looper, Executor executor, long j4) {
        this.f37109a = clientProvider.a();
        this.f37110b = locationListener;
        this.f37112d = looper;
        this.f37113e = executor;
        this.f37114f = j4;
        this.f37111c = new GplLocationCallback(locationListener);
    }
}
