package com.crrepa.band.my.profile.googlefit;

import android.text.format.DateUtils;
import androidx.annotation.NonNull;
import com.crrepa.band.my.model.user.provider.GoogleFitProvider;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.fitness.Fitness;
import com.google.android.gms.fitness.FitnessOptions;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Field;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.moyoung.dafit.module.common.utils.d;
import com.orhanobut.logger.f;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class c {
    private static final long UPDATE_PERIOD = 20000;
    private FitnessOptions fitnessOptions;
    private long lastUpdateTime;

    class a implements OnCompleteListener {
        a() {
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<Void> task) {
            if (task.isSuccessful()) {
                f.i("Data insert was successful!", new Object[0]);
            } else {
                f.i("There was a problem inserting the dataset.", task.getException());
            }
        }
    }

    private static class b {
        private static c INSTANCE = new c(null);

        private b() {
        }
    }

    /* synthetic */ c(a aVar) {
        this();
    }

    private DataSet buildFitnessData(long j8, long j9, int i8) {
        DataSource build = new DataSource.Builder().setAppPackageName(d.get()).setDataType(DataType.TYPE_STEP_COUNT_DELTA).setStreamName("BasicHistoryApi - step count").setType(0).build();
        return DataSet.builder(build).add(DataPoint.builder(build).setTimeInterval(j8, j9, TimeUnit.MILLISECONDS).setField(Field.FIELD_STEPS, i8).build()).build();
    }

    public static c getInstance() {
        return b.INSTANCE;
    }

    private Task<Void> insertSteps(GoogleSignInAccount googleSignInAccount, long j8, long j9, int i8) {
        DataSet buildFitnessData = buildFitnessData(j8, j9, i8);
        f.i("Inserting the dataset in the History API.", new Object[0]);
        return Fitness.getHistoryClient(d.get(), googleSignInAccount).insertData(buildFitnessData).addOnCompleteListener(new a());
    }

    public void updateSteps(int i8) {
        long timeInMillis;
        if (GoogleFitProvider.getConnected()) {
            if (System.currentTimeMillis() - this.lastUpdateTime < 20000) {
                f.d("-------");
                return;
            }
            GoogleSignInAccount accountForExtension = GoogleSignIn.getAccountForExtension(d.get(), this.fitnessOptions);
            boolean hasPermissions = GoogleSignIn.hasPermissions(accountForExtension, this.fitnessOptions);
            f.d("hasPermissions: " + hasPermissions);
            if (hasPermissions) {
                this.lastUpdateTime = System.currentTimeMillis();
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date());
                long timeInMillis2 = calendar.getTimeInMillis();
                long updateTime = GoogleFitProvider.getUpdateTime();
                int updateSteps = GoogleFitProvider.getUpdateSteps();
                if (updateTime == 0 || !DateUtils.isToday(updateTime)) {
                    updateSteps = 0;
                    calendar.set(11, 0);
                    calendar.set(12, 0);
                    timeInMillis = calendar.getTimeInMillis();
                } else {
                    timeInMillis = updateTime;
                }
                if (i8 < updateSteps) {
                    GoogleFitProvider.saveUpdateSteps(i8);
                    return;
                }
                int i9 = i8 - updateSteps;
                if (i9 <= 0) {
                    return;
                }
                f.d("startTime: " + timeInMillis);
                f.d("endTime: " + timeInMillis2);
                f.d("lastUpdateSteps: " + updateSteps);
                f.d("stepsOffset: " + i9);
                insertSteps(accountForExtension, timeInMillis, timeInMillis2, i9);
                GoogleFitProvider.saveUpdateTime(timeInMillis2);
                GoogleFitProvider.saveUpdateSteps(i8);
            }
        }
    }

    private c() {
        this.lastUpdateTime = 0L;
        this.fitnessOptions = FitnessOptions.builder().accessActivitySessions(1).build();
    }
}
