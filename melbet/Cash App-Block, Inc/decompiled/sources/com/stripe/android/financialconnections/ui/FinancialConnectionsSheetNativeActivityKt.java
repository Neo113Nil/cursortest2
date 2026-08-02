package com.stripe.android.financialconnections.ui;

import androidx.compose.runtime.StaticProvidableCompositionLocal;
import com.stripe.android.financialconnections.model.FinancialConnectionsSessionManifest;
import com.stripe.android.financialconnections.ui.theme.Theme;
import com.stripe.android.model.ConsumerSession$$ExternalSyntheticLambda0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes8.dex */
public abstract class FinancialConnectionsSheetNativeActivityKt {
    public static final StaticProvidableCompositionLocal LocalNavHostController = new StaticProvidableCompositionLocal(new ConsumerSession$$ExternalSyntheticLambda0(18));
    public static final StaticProvidableCompositionLocal LocalTestMode = new StaticProvidableCompositionLocal(new ConsumerSession$$ExternalSyntheticLambda0(19));
    public static final StaticProvidableCompositionLocal LocalImageLoader = new StaticProvidableCompositionLocal(new ConsumerSession$$ExternalSyntheticLambda0(20));
    public static final StaticProvidableCompositionLocal LocalTopAppBarHost = new StaticProvidableCompositionLocal(new ConsumerSession$$ExternalSyntheticLambda0(21));

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FinancialConnectionsSessionManifest.Theme.values().length];
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.DASHBOARD_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FinancialConnectionsSessionManifest.Theme.LINK_LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Theme toLocalTheme(FinancialConnectionsSessionManifest.Theme theme) {
        theme.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[theme.ordinal()];
        if (i == 1 || i == 2) {
            return Theme.DefaultLight;
        }
        if (i == 3) {
            return Theme.LinkLight;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
