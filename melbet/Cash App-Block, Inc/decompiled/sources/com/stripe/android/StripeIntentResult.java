package com.stripe.android;

import com.stripe.android.core.model.StripeModel;
import com.stripe.android.model.StripeIntent;
import io.noties.markwon.LinkResolverDef;
import net.idrnd.face.iad.capture.Plane;

/* loaded from: classes9.dex */
public abstract class StripeIntentResult implements StripeModel {
    public final int outcomeFromFlow;

    /* loaded from: classes8.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            try {
                LinkResolverDef linkResolverDef = StripeIntent.Status.Companion;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LinkResolverDef linkResolverDef2 = StripeIntent.Status.Companion;
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LinkResolverDef linkResolverDef3 = StripeIntent.Status.Companion;
                iArr[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                LinkResolverDef linkResolverDef4 = StripeIntent.Status.Companion;
                iArr[5] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                LinkResolverDef linkResolverDef5 = StripeIntent.Status.Companion;
                iArr[6] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                LinkResolverDef linkResolverDef6 = StripeIntent.Status.Companion;
                iArr[3] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                LinkResolverDef linkResolverDef7 = StripeIntent.Status.Companion;
                iArr[1] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StripeIntent.NextActionType.values().length];
            try {
                Plane plane = StripeIntent.NextActionType.Companion;
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Plane plane2 = StripeIntent.NextActionType.Companion;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Plane plane3 = StripeIntent.NextActionType.Companion;
                iArr2[3] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                Plane plane4 = StripeIntent.NextActionType.Companion;
                iArr2[5] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                Plane plane5 = StripeIntent.NextActionType.Companion;
                iArr2[7] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                Plane plane6 = StripeIntent.NextActionType.Companion;
                iArr2[13] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                Plane plane7 = StripeIntent.NextActionType.Companion;
                iArr2[11] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                Plane plane8 = StripeIntent.NextActionType.Companion;
                iArr2[12] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                Plane plane9 = StripeIntent.NextActionType.Companion;
                iArr2[4] = 9;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                Plane plane10 = StripeIntent.NextActionType.Companion;
                iArr2[2] = 10;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                Plane plane11 = StripeIntent.NextActionType.Companion;
                iArr2[8] = 11;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                Plane plane12 = StripeIntent.NextActionType.Companion;
                iArr2[9] = 12;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                Plane plane13 = StripeIntent.NextActionType.Companion;
                iArr2[10] = 13;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                Plane plane14 = StripeIntent.NextActionType.Companion;
                iArr2[6] = 14;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public StripeIntentResult(int i) {
        this.outcomeFromFlow = i;
    }

    public abstract String getFailureMessage();

    public abstract StripeIntent getIntent();
}
