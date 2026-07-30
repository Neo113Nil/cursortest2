package com.crrepa.band.my.training.map.google;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import androidx.annotation.NonNull;
import com.crrepa.band.my.training.model.LocationCityInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.orhanobut.logger.f;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public class c {
    private Context context;
    private ObservableEmitter<Location> emitter;
    private C0211c googleLocationCallback = new C0211c(this);
    private d locationCompleteListener = new d(this);
    private FusedLocationProviderClient locationProviderClient;

    class a implements Action {
        a() {
        }

        @Override // io.reactivex.functions.Action
        public void run() {
            c cVar = c.this;
            cVar.removeLocationUpdates(cVar.googleLocationCallback);
        }
    }

    class b implements ObservableOnSubscribe {
        b() {
        }

        @Override // io.reactivex.ObservableOnSubscribe
        public void subscribe(ObservableEmitter<Location> observableEmitter) {
            c.this.emitter = observableEmitter;
            if (!c2.b.isRequestLocation(c.this.context)) {
                c.this.getLastLocation();
            } else {
                c cVar = c.this;
                cVar.requestLocationUpdates(cVar.googleLocationCallback);
            }
        }
    }

    /* renamed from: com.crrepa.band.my.training.map.google.c$c, reason: collision with other inner class name */
    static class C0211c extends LocationCallback {
        private WeakReference<c> weakReference;

        public C0211c(c cVar) {
            this.weakReference = new WeakReference<>(cVar);
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);
            f.d("GoogleLocationCallback onLocationResult");
            try {
                if (locationResult == null) {
                    f.e("locationResult is null", new Object[0]);
                    return;
                }
                List<Location> locations = locationResult.getLocations();
                Location location = (locations == null || locations.isEmpty()) ? null : locations.get(0);
                c cVar = this.weakReference.get();
                if (cVar != null) {
                    cVar.onLocationResult(location);
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    static class d implements OnCompleteListener {
        private WeakReference<c> weakReference;

        public d(c cVar) {
            this.weakReference = new WeakReference<>(cVar);
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Location> task) {
            try {
                c cVar = this.weakReference.get();
                if (cVar == null || task == null) {
                    return;
                }
                cVar.onLocationResult(task.getResult());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    public c(Context context) {
        this.context = context;
        this.locationProviderClient = LocationServices.getFusedLocationProviderClient(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"MissingPermission"})
    public void getLastLocation() {
        Task<Location> lastLocation = this.locationProviderClient.getLastLocation();
        if (lastLocation == null) {
            requestLocationUpdates(this.googleLocationCallback);
        } else {
            lastLocation.addOnCompleteListener(this.locationCompleteListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLocationResult(Location location) {
        if (this.emitter == null) {
            return;
        }
        if (location != null) {
            try {
                f.d("onLocationResult: " + location);
                this.emitter.onNext(location);
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        this.emitter.onComplete();
    }

    public Observable<LocationCityInfo> getLocationAddress() {
        return Observable.create(new b()).observeOn(Schedulers.io()).map(new com.crrepa.band.my.training.map.google.d()).doOnComplete(new a());
    }

    public void removeLocationUpdates(LocationCallback locationCallback) {
        f.d("requestLocationUpdates remove");
        this.locationProviderClient.removeLocationUpdates(locationCallback);
    }

    @SuppressLint({"MissingPermission"})
    public void requestLocationUpdates(LocationCallback locationCallback) {
        f.d("requestLocationUpdates");
        this.locationProviderClient.requestLocationUpdates(LocationRequest.create().setPriority(100).setInterval(ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS), locationCallback, this.context.getMainLooper());
    }
}
