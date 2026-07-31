package ru.rustore.sdk.pay.internal.presentation.ui;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.AbstractActivityC1333h;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import ru.rustore.sdk.pay.R;
import ru.rustore.sdk.pay.internal.s6;
import ru.rustore.sdk.pay.internal.ua;
import ru.rustore.sdk.pay.model.SdkTheme;

@Metadata
/* loaded from: classes3.dex */
public final class PayActivity extends AbstractActivityC1333h {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f44804a = 0;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44805a;

        static {
            int[] iArr = new int[SdkTheme.values().length];
            try {
                iArr[SdkTheme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SdkTheme.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f44805a = iArr;
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1333h, androidx.activity.j, androidx.core.app.h, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        SdkTheme sdkTheme;
        Serializable serializable;
        Serializable serializable2;
        int i4 = Build.VERSION.SDK_INT;
        ua uaVar = null;
        if (i4 >= 33) {
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                serializable2 = extras.getSerializable("SDK_THEME_TAG", SdkTheme.class);
                sdkTheme = (SdkTheme) serializable2;
            }
            sdkTheme = null;
        } else {
            Bundle extras2 = getIntent().getExtras();
            Serializable serializable3 = extras2 != null ? extras2.getSerializable("SDK_THEME_TAG") : null;
            if (serializable3 instanceof SdkTheme) {
                sdkTheme = (SdkTheme) serializable3;
            }
            sdkTheme = null;
        }
        int i5 = sdkTheme == null ? -1 : a.f44805a[sdkTheme.ordinal()];
        if (i5 == -1) {
            setTheme(R.style.Theme_RuStorePay_Light);
        } else if (i5 == 1) {
            setTheme(R.style.Theme_RuStorePay_Light);
        } else if (i5 == 2) {
            setTheme(R.style.Theme_RuStorePay_Dark);
        }
        super.onCreate(bundle);
        if (getSupportFragmentManager().h0("INITIAL_DIALOG_TAG") == null) {
            if (i4 >= 33) {
                Bundle extras3 = getIntent().getExtras();
                if (extras3 != null) {
                    serializable = extras3.getSerializable("PAYMENT_TYPE_TAG", ua.class);
                    uaVar = (ua) serializable;
                }
            } else {
                Bundle extras4 = getIntent().getExtras();
                Serializable serializable4 = extras4 != null ? extras4.getSerializable("PAYMENT_TYPE_TAG") : null;
                if (serializable4 instanceof ua) {
                    uaVar = (ua) serializable4;
                }
            }
            s6 s6Var = new s6();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("PAYMENT_TYPE_TAG", uaVar);
            s6Var.setArguments(bundle2);
            s6Var.show(getSupportFragmentManager(), "INITIAL_DIALOG_TAG");
        }
    }
}
