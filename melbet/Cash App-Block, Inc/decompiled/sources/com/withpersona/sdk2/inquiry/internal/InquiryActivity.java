package com.withpersona.sdk2.inquiry.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.TintInfo;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.memory.RealStrongMemoryCache;
import com.google.android.play.core.splitcompat.SplitCompat;
import com.google.mlkit.vision.text.internal.zzr;
import com.nimbusds.jose.util.DeflateUtils;
import com.squareup.cash.R;
import com.withpersona.sdk2.camera.CameraHelper$$ExternalSyntheticLambda0;
import com.withpersona.sdk2.inquiry.device.DeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.device.RealDeviceVendorIDProvider;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import sqip.internal.UtilsKt$$ExternalSyntheticLambda0;

/* loaded from: classes9.dex */
public final class InquiryActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final Lazy args$delegate = LazyKt.lazy(new CameraHelper$$ExternalSyntheticLambda0(this, 21));
    public final ViewModelLazy viewModel$delegate;

    public InquiryActivity() {
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.viewModel$delegate = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(InquiryViewModel.class), new Function0(this) { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$special$$inlined$viewModels$default$1
            public final /* synthetic */ InquiryActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                InquiryActivity inquiryActivity = this.$this_viewModels;
                switch (i4) {
                    case 0:
                        return inquiryActivity.getDefaultViewModelProviderFactory();
                    case 1:
                        return inquiryActivity.getViewModelStore();
                    default:
                        return inquiryActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$special$$inlined$viewModels$default$1
            public final /* synthetic */ InquiryActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i;
                InquiryActivity inquiryActivity = this.$this_viewModels;
                switch (i4) {
                    case 0:
                        return inquiryActivity.getDefaultViewModelProviderFactory();
                    case 1:
                        return inquiryActivity.getViewModelStore();
                    default:
                        return inquiryActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Function0(this) { // from class: com.withpersona.sdk2.inquiry.internal.InquiryActivity$special$$inlined$viewModels$default$1
            public final /* synthetic */ InquiryActivity $this_viewModels;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                InquiryActivity inquiryActivity = this.$this_viewModels;
                switch (i4) {
                    case 0:
                        return inquiryActivity.getDefaultViewModelProviderFactory();
                    case 1:
                        return inquiryActivity.getViewModelStore();
                    default:
                        return inquiryActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[Catch: all -> 0x0091, Exception -> 0x0093, LOOP:0: B:27:0x0061->B:29:0x0067, LOOP_END, TryCatch #6 {Exception -> 0x0093, blocks: (B:26:0x0058, B:27:0x0061, B:29:0x0067, B:31:0x0095), top: B:25:0x0058, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void attachBaseContext(Context context) {
        StrictMode.ThreadPolicy threadPolicy;
        Iterator it;
        context.getClass();
        super.attachBaseContext(context);
        try {
            getResources().getLayout(R.layout.pi2_navigation_bar).getClass();
        } catch (Resources.NotFoundException unused) {
            SplitCompat splitCompat = (SplitCompat) SplitCompat.zzb.get();
            if (splitCompat == null) {
                if (getApplicationContext() != null) {
                    SplitCompat.zzi(getApplicationContext(), false);
                }
                SplitCompat.zzi(this, false);
                return;
            }
            zzr zzrVar = splitCompat.zzf;
            synchronized (splitCompat.zze) {
                HashSet hashSet = new HashSet(splitCompat.zze);
                synchronized (zzrVar) {
                    try {
                        threadPolicy = StrictMode.getThreadPolicy();
                    } catch (Exception e) {
                        e = e;
                        threadPolicy = null;
                    }
                    try {
                        StrictMode.allowThreadDiskReads();
                        StrictMode.allowThreadDiskWrites();
                    } catch (Exception e2) {
                        e = e2;
                        Log.i("SplitCompat", "Unable to set up strict mode.", e);
                        try {
                            HashSet hashSet2 = new HashSet();
                            it = hashSet.iterator();
                            while (it.hasNext()) {
                            }
                            zzrVar.zza(this, hashSet2);
                            if (threadPolicy == null) {
                            }
                            StrictMode.setThreadPolicy(threadPolicy);
                        } catch (Throwable th) {
                            if (threadPolicy != null) {
                                StrictMode.setThreadPolicy(threadPolicy);
                            }
                            throw th;
                        }
                    }
                    try {
                        HashSet hashSet22 = new HashSet();
                        it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            File file = new File(((RealStrongMemoryCache) zzrVar.zza).zzw(), "verified-splits");
                            RealStrongMemoryCache.zzu(file);
                            hashSet22.add(RealStrongMemoryCache.zzq(file, String.valueOf(str).concat(".apk")));
                        }
                        zzrVar.zza(this, hashSet22);
                        if (threadPolicy == null) {
                            return;
                        }
                    } catch (Exception e3) {
                        Log.e("SplitCompat", "Error installing additional splits", e3);
                        if (threadPolicy == null) {
                            return;
                        }
                    }
                    StrictMode.setThreadPolicy(threadPolicy);
                }
            }
        }
    }

    public final InquiryArguments getArgs() {
        return (InquiryArguments) this.args$delegate.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        EdgeToEdge.enable$default(this);
        super.onCreate(bundle);
        try {
            runActivity(bundle);
        } catch (Exception e) {
            Bundle bundle2 = getArgs().bundle;
            if (!(bundle2 != null ? bundle2.getBoolean("CONSUME_EXCEPTIONS", false) : false)) {
                throw e;
            }
            Bundle bundle3 = getArgs().bundle;
            if (bundle3 != null ? bundle3.getBoolean("ENABLE_ERROR_LOGGING", true) : true) {
                DeflateUtils.getErrorHandler(this).recordError(e);
            }
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "A fatal exception occurred.");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) ErrorCode.ExceptionError);
            setResult(0, intent);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            TintInfo errorHandler = DeflateUtils.getErrorHandler(this);
            synchronized (errorHandler) {
                if (errorHandler.mHasTintMode) {
                    errorHandler.mHasTintList = false;
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        DeviceVendorIDProvider deviceVendorIDProvider;
        super.onResume();
        DaggerInquiryComponent$InquiryComponentImpl daggerInquiryComponent$InquiryComponentImpl = ((InquiryViewModel) this.viewModel$delegate.getValue()).component;
        if (daggerInquiryComponent$InquiryComponentImpl == null || (deviceVendorIDProvider = (DeviceVendorIDProvider) daggerInquiryComponent$InquiryComponentImpl.appSetIdHelperProvider.get()) == null) {
            return;
        }
        ((RealDeviceVendorIDProvider) deviceVendorIDProvider).refreshDeviceVendorId();
    }

    public final void runActivity(Bundle bundle) {
        String sessionToken = getArgs().getSessionToken();
        if (sessionToken != null && StringsKt.contains((CharSequence) sessionToken, '\n', false)) {
            Intent intent = new Intent();
            intent.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_ERROR");
            intent.putExtra("ERROR_DEBUG_MESSAGE_KEY", "Invalid session token.");
            intent.putExtra("ERROR_CODE_KEY", (Parcelable) ErrorCode.SessionTokenError);
            setResult(0, intent);
            finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("PERSONA_ACTIVITY_RESULT", "INQUIRY_CANCELED");
        Bundle bundle2 = getArgs().bundle;
        intent2.putExtra("INQUIRY_ID_KEY", bundle2 != null ? bundle2.getString("INQUIRY_ID_KEY") : null);
        String sessionToken2 = getArgs().getSessionToken();
        intent2.putExtra("SESSION_TOKEN_KEY", sessionToken2 != null ? StringsKt.substringAfter(sessionToken2, "Bearer ", sessionToken2) : null);
        setResult(0, intent2);
        Integer theme = getArgs().getTheme();
        if (theme != null) {
            setTheme(theme.intValue());
        }
        View inflate = LayoutInflater.from(this).inflate(R.layout.pi2_inquiry_activity, (ViewGroup) null, false);
        if (inflate == null) {
            a$$ExternalSyntheticBUOutline0.m$2("rootView");
            return;
        }
        setContentView((FrameLayout) inflate);
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            BackStackRecord backStackRecord = new BackStackRecord(supportFragmentManager);
            InquiryFragment inquiryFragment = new InquiryFragment();
            inquiryFragment.setArguments(getIntent().getExtras());
            backStackRecord.replace(R.id.fragment_content, null, inquiryFragment);
            backStackRecord.commit();
        }
        getSupportFragmentManager().setFragmentResultListener(getArgs().getRequestKey(), this, new UtilsKt$$ExternalSyntheticLambda0(this));
    }
}
