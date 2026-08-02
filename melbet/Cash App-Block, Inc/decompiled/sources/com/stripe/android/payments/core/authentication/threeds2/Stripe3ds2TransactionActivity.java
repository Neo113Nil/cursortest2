package com.stripe.android.payments.core.authentication.threeds2;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.activity.compose.ActivityResultRegistryKt$$ExternalSyntheticLambda2;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.paging.PageFetcher$flow$1;
import androidx.tracing.Trace;
import com.datadog.android.trace.model.SpanEvent;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.databinding.Stripe3ds2TransactionLayoutBinding;
import com.stripe.android.model.Stripe3ds2Fingerprint;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionContract;
import com.stripe.android.stripe3ds2.transaction.ChallengeContract;
import com.stripe.android.stripe3ds2.views.ChallengeProgressFragmentFactory;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import kotlinx.coroutines.JobKt;

/* loaded from: classes8.dex */
public final class Stripe3ds2TransactionActivity extends AppCompatActivity {
    public static final /* synthetic */ int $r8$clinit = 0;
    public Stripe3ds2TransactionContract.Args args;
    public final Lazy viewBinding$delegate = LazyKt.lazy(new Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0(this, 1));
    public final InitializerViewModelFactory viewModelFactory = new InitializerViewModelFactory(new Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0(this, 2), 3);

    public final void finishWithResult(PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated) {
        setResult(-1, new Intent().putExtras(paymentFlowResult$Unvalidated.toBundle()));
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        Window window;
        Stripe3ds2TransactionContract.Args args;
        Object failure;
        Integer num;
        try {
            Result.Companion companion = Result.Companion;
            Intent intent = getIntent();
            intent.getClass();
            args = (Stripe3ds2TransactionContract.Args) intent.getParcelableExtra("extra_args");
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = new Result.Failure(th);
        }
        if (args == null) {
            throw new IllegalArgumentException("Error while attempting to initiate 3DS2 transaction.");
        }
        String str = args.config.uiCustomization.uiCustomization.mAccentColor;
        if (str != null) {
            try {
                failure = Integer.valueOf(Color.parseColor(str));
            } catch (Throwable th2) {
                Result.Companion companion3 = Result.Companion;
                failure = new Result.Failure(th2);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            num = (Integer) failure;
        } else {
            num = null;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        StripeIntent.NextActionData.SdkData.Use3DS2 use3DS2 = args.nextActionData;
        use3DS2.getClass();
        String str2 = use3DS2.source;
        String str3 = use3DS2.serverName;
        String str4 = use3DS2.transactionId;
        StripeIntent.NextActionData.SdkData.Use3DS2.DirectoryServerEncryption directoryServerEncryption = use3DS2.serverEncryption;
        String str5 = directoryServerEncryption.directoryServerId;
        String str6 = directoryServerEncryption.dsCertificateData;
        List list = directoryServerEncryption.rootCertsData;
        String str7 = directoryServerEncryption.keyId;
        str5.getClass();
        str6.getClass();
        list.getClass();
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] bytes = str6.getBytes(Charsets.UTF_8);
        bytes.getClass();
        Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
        generateCertificate.getClass();
        PublicKey publicKey = ((X509Certificate) generateCertificate).getPublicKey();
        publicKey.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String str8 = (String) it.next();
            CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
            String str9 = str4;
            Iterator it2 = it;
            byte[] bytes2 = str8.getBytes(Charsets.UTF_8);
            bytes2.getClass();
            Certificate generateCertificate2 = certificateFactory2.generateCertificate(new ByteArrayInputStream(bytes2));
            generateCertificate2.getClass();
            arrayList.add((X509Certificate) generateCertificate2);
            str4 = str9;
            it = it2;
        }
        new Stripe3ds2Fingerprint.DirectoryServerEncryption(str5, publicKey, arrayList, str7);
        str2.getClass();
        str3.getClass();
        str4.getClass();
        supportFragmentManager.mFragmentFactory = new ChallengeProgressFragmentFactory(str3, args.sdkTransactionId, num);
        obj = args;
        super.onCreate(bundle);
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
            int i = StripeException.$r8$clinit;
            finishWithResult(new PaymentFlowResult$Unvalidated((String) null, 2, SpanEvent.Account.create(m4120exceptionOrNullimpl), false, (String) null, (String) null, 121));
            return;
        }
        this.args = (Stripe3ds2TransactionContract.Args) obj;
        Lazy lazy = this.viewBinding$delegate;
        setContentView(((Stripe3ds2TransactionLayoutBinding) lazy.getValue()).rootView);
        Stripe3ds2TransactionContract.Args args2 = this.args;
        if (args2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("args");
            throw null;
        }
        Integer num2 = args2.statusBarColor;
        if (num2 != null) {
            int intValue = num2.intValue();
            if (Build.VERSION.SDK_INT <= 34 && (window = getWindow()) != null) {
                window.setStatusBarColor(intValue);
            }
        }
        final int i2 = 0;
        final int i3 = 1;
        ViewModelLazy viewModelLazy = new ViewModelLazy(Reflection.factory.getOrCreateKotlinClass(Stripe3ds2TransactionViewModel.class), new Function0(this) { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$default$2
            public final /* synthetic */ Stripe3ds2TransactionActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i2;
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = this.$this_viewModels;
                switch (i4) {
                    case 0:
                        return stripe3ds2TransactionActivity.getViewModelStore();
                    default:
                        return stripe3ds2TransactionActivity.getDefaultViewModelCreationExtras();
                }
            }
        }, new Stripe3ds2TransactionActivity$$ExternalSyntheticLambda0(this, i2), new Function0(this) { // from class: com.stripe.android.payments.core.authentication.threeds2.Stripe3ds2TransactionActivity$onCreate$$inlined$viewModels$default$2
            public final /* synthetic */ Stripe3ds2TransactionActivity $this_viewModels;

            {
                this.$this_viewModels = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                Stripe3ds2TransactionActivity stripe3ds2TransactionActivity = this.$this_viewModels;
                switch (i4) {
                    case 0:
                        return stripe3ds2TransactionActivity.getViewModelStore();
                    default:
                        return stripe3ds2TransactionActivity.getDefaultViewModelCreationExtras();
                }
            }
        });
        HeroCardViewKt$$ExternalSyntheticLambda0 heroCardViewKt$$ExternalSyntheticLambda0 = new HeroCardViewKt$$ExternalSyntheticLambda0(29, this, viewModelLazy);
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ChallengeContract(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(heroCardViewKt$$ExternalSyntheticLambda0, 11));
        ActivityResultLauncher registerForActivityResult2 = registerForActivityResult(new PaymentBrowserAuthContract(), new ActivityResultRegistryKt$$ExternalSyntheticLambda2(this, 12));
        if (!((Stripe3ds2TransactionViewModel) viewModelLazy.getValue()).hasCompleted) {
            LifecycleCoroutineScopeImpl coroutineScope = ViewModelKt.getCoroutineScope(getLifecycle());
            JobKt.launch$default(coroutineScope, null, null, new PageFetcher$flow$1(coroutineScope, new WorkflowLayout$start$1(this, registerForActivityResult, heroCardViewKt$$ExternalSyntheticLambda0, registerForActivityResult2, viewModelLazy, null, 29), null, 17), 3);
        }
        Trace.setDecorFitsSystemWindows(getWindow(), false);
        FragmentContainerView fragmentContainerView = ((Stripe3ds2TransactionLayoutBinding) lazy.getValue()).rootView;
        WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0 = new WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0(27);
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(fragmentContainerView, workWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0);
    }
}
