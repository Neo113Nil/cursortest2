package com.squareup.util.android;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.pdf.presenter.PdfPresenterFactory;
import com.squareup.cash.threedsdataonly.presenters.ThreeDsPresenter$Factory$Impl;
import com.squareup.cash.transactionpicker.blocker.presenters.UnifiedActivityPickerBlockerPresenter$Factory$Impl;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.cash.util.clock.AndroidAccurateClock;
import com.squareup.cash.util.network.impl.AndroidConnectivityManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.File;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import retrofit2.OkHttpCall;

/* loaded from: classes.dex */
public final class AndroidToaster {
    public final Context context;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory context;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, int i) {
            this.$r8$classId = i;
            this.context = instanceFactory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.context;
            switch (i) {
                case 0:
                    Context context = (Context) instanceFactory.value;
                    context.getClass();
                    return new AndroidToaster(context);
                case 1:
                    ThreeDsPresenter$Factory$Impl threeDsPresenter$Factory$Impl = (ThreeDsPresenter$Factory$Impl) instanceFactory.value;
                    threeDsPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(threeDsPresenter$Factory$Impl, 28);
                case 2:
                    UnifiedActivityPickerBlockerPresenter$Factory$Impl unifiedActivityPickerBlockerPresenter$Factory$Impl = (UnifiedActivityPickerBlockerPresenter$Factory$Impl) instanceFactory.value;
                    unifiedActivityPickerBlockerPresenter$Factory$Impl.getClass();
                    return new PdfPresenterFactory(unifiedActivityPickerBlockerPresenter$Factory$Impl, 29);
                case 3:
                    Activity activity = (Activity) instanceFactory.value;
                    activity.getClass();
                    return new RealCashScreenBrightness(activity);
                case 4:
                    Application application = (Application) instanceFactory.value;
                    application.getClass();
                    return new File(application.getFilesDir(), "user_journeys_completed");
                case 5:
                    Application application2 = (Application) instanceFactory.value;
                    application2.getClass();
                    return new File(application2.getFilesDir(), "user_journeys_in_flight");
                case 6:
                    Context context2 = (Context) instanceFactory.value;
                    context2.getClass();
                    return new AndroidAccurateClock(context2);
                case 7:
                    Context context3 = (Context) instanceFactory.value;
                    context3.getClass();
                    return new AndroidConnectivityManager(context3);
                case 8:
                    Activity activity2 = (Activity) instanceFactory.value;
                    activity2.getClass();
                    return new AndroidActivityFinisher(activity2);
                case 9:
                    Context context4 = (Context) instanceFactory.value;
                    context4.getClass();
                    return new AndroidAudioManager(context4);
                case 10:
                    Context context5 = (Context) instanceFactory.value;
                    context5.getClass();
                    return new OkHttpCall.AnonymousClass1(context5);
                case 11:
                    Context context6 = (Context) instanceFactory.value;
                    DefaultScheduler defaultScheduler = Dispatchers.Default;
                    DefaultIoScheduler defaultIoScheduler = DefaultIoScheduler.INSTANCE;
                    context6.getClass();
                    defaultIoScheduler.getClass();
                    return new RealBackupService(context6, defaultIoScheduler);
                default:
                    LifecycleOwner lifecycleOwner = (LifecycleOwner) instanceFactory.value;
                    lifecycleOwner.getClass();
                    return lifecycleOwner.getLifecycle();
            }
        }
    }

    public AndroidToaster(Context context) {
        this.context = context;
    }

    public final void makeToast(String str, Toaster$Length toaster$Length) {
        int i;
        str.getClass();
        int ordinal = toaster$Length.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        } else {
            i = 0;
        }
        ToastKt.toast(this.context, i, str);
    }
}
