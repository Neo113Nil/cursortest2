package com.stripe.android.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.core.os.BundleKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.payments.PaymentFlowResult$Unvalidated;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import com.stripe.android.view.PaymentAuthWebViewActivity;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/android/auth/PaymentBrowserAuthContract;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "Args", "payments-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PaymentBrowserAuthContract extends ActivityResultContract<Args, PaymentFlowResult$Unvalidated> {
    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Intent createIntent(Context context, Object obj) {
        Class cls;
        Args args = (Args) obj;
        args.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        boolean z = !args.forceInAppWebView && (Intrinsics.areEqual(args.returnUrl, "stripesdk://payment_return_url/".concat(packageName)) || args.isInstantApp);
        Bundle bundleOf = BundleKt.bundleOf(new Pair("extra_args", args));
        if (z) {
            cls = StripeBrowserLauncherActivity.class;
        } else {
            if (z) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            cls = PaymentAuthWebViewActivity.class;
        }
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtras(bundleOf);
        return intent;
    }

    @Override // androidx.activity.result.contract.ActivityResultContract
    public final Object parseResult(int i, Intent intent) {
        PaymentFlowResult$Unvalidated paymentFlowResult$Unvalidated;
        return (intent == null || (paymentFlowResult$Unvalidated = (PaymentFlowResult$Unvalidated) intent.getParcelableExtra("extra_args")) == null) ? new PaymentFlowResult$Unvalidated((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127) : paymentFlowResult$Unvalidated;
    }

    public final class Args implements Parcelable {
        public static final CREATOR CREATOR = new CREATOR();
        public final String clientSecret;
        public final boolean enableLogging;
        public final boolean forceInAppWebView;
        public final boolean isInstantApp;
        public final String objectId;
        public final String publishableKey;
        public final String referrer;
        public final int requestCode;
        public final String returnUrl;
        public final boolean shouldCancelIntentOnUserNavigation;
        public final boolean shouldCancelSource;
        public final Integer statusBarColor;
        public final String stripeAccountId;
        public final StripeToolbarCustomization toolbarCustomization;
        public final String url;

        public final class CREATOR implements Parcelable.Creator {
            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            @Override // android.os.Parcelable.Creator
            public final java.lang.Object createFromParcel(android.os.Parcel r18) {
                /*
                    r17 = this;
                    r0 = r18
                    r0.getClass()
                    com.stripe.android.auth.PaymentBrowserAuthContract$Args r1 = new com.stripe.android.auth.PaymentBrowserAuthContract$Args
                    java.lang.String r2 = r0.readString()
                    java.lang.String r3 = ""
                    if (r2 != 0) goto L10
                    r2 = r3
                L10:
                    int r4 = r0.readInt()
                    java.lang.String r5 = r0.readString()
                    if (r5 != 0) goto L1b
                    r5 = r3
                L1b:
                    java.lang.String r6 = r0.readString()
                    if (r6 != 0) goto L25
                    r6 = r3
                    r7 = r6
                L23:
                    r3 = r5
                    goto L27
                L25:
                    r7 = r3
                    goto L23
                L27:
                    java.lang.String r5 = r0.readString()
                    byte r8 = r0.readByte()
                    r9 = 0
                    r10 = 1
                    if (r8 == 0) goto L39
                    r8 = r1
                    r1 = r2
                    r2 = r4
                    r4 = r6
                    r6 = r10
                    goto L3e
                L39:
                    r8 = r1
                    r1 = r2
                    r2 = r4
                    r4 = r6
                    r6 = r9
                L3e:
                    java.lang.Class<com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization> r11 = com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization.class
                    java.lang.ClassLoader r11 = r11.getClassLoader()
                    android.os.Parcelable r11 = r0.readParcelable(r11)
                    com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r11 = (com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization) r11
                    r12 = r8
                    java.lang.String r8 = r0.readString()
                    byte r13 = r0.readByte()
                    if (r13 == 0) goto L58
                    r13 = r9
                    r9 = r10
                    goto L59
                L58:
                    r13 = r9
                L59:
                    byte r14 = r0.readByte()
                    if (r14 == 0) goto L61
                    r14 = r10
                    goto L63
                L61:
                    r14 = r10
                    r10 = r13
                L63:
                    java.lang.Class r15 = java.lang.Integer.TYPE
                    java.lang.ClassLoader r15 = r15.getClassLoader()
                    java.lang.Object r15 = r0.readValue(r15)
                    boolean r13 = r15 instanceof java.lang.Integer
                    if (r13 == 0) goto L74
                    java.lang.Integer r15 = (java.lang.Integer) r15
                    goto L75
                L74:
                    r15 = 0
                L75:
                    java.lang.String r13 = r0.readString()
                    if (r13 != 0) goto L7c
                    goto L7d
                L7c:
                    r7 = r13
                L7d:
                    byte r13 = r0.readByte()
                    if (r13 == 0) goto L87
                    r13 = r14
                    r16 = r13
                    goto L8a
                L87:
                    r16 = r14
                    r13 = 0
                L8a:
                    java.lang.String r14 = r0.readString()
                    byte r0 = r0.readByte()
                    if (r0 == 0) goto L9b
                    r0 = r12
                    r12 = r7
                    r7 = r11
                    r11 = r15
                    r15 = r16
                    goto La0
                L9b:
                    r0 = r12
                    r12 = r7
                    r7 = r11
                    r11 = r15
                    r15 = 0
                La0:
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.auth.PaymentBrowserAuthContract.Args.CREATOR.createFromParcel(android.os.Parcel):java.lang.Object");
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Args[i];
            }
        }

        public /* synthetic */ Args(String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num, String str6, boolean z4, String str7, boolean z5, int i2) {
            this(str, i, str2, str3, str4, z, (i2 & 64) != 0 ? null : stripeToolbarCustomization, str5, z2, (i2 & 512) != 0 ? true : z3, num, str6, z4, (i2 & PKIFailureInfo.certRevoked) != 0 ? null : str7, (i2 & 16384) != 0 ? false : z5);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return Intrinsics.areEqual(this.objectId, args.objectId) && this.requestCode == args.requestCode && Intrinsics.areEqual(this.clientSecret, args.clientSecret) && Intrinsics.areEqual(this.url, args.url) && Intrinsics.areEqual(this.returnUrl, args.returnUrl) && this.enableLogging == args.enableLogging && Intrinsics.areEqual(this.toolbarCustomization, args.toolbarCustomization) && Intrinsics.areEqual(this.stripeAccountId, args.stripeAccountId) && this.shouldCancelSource == args.shouldCancelSource && this.shouldCancelIntentOnUserNavigation == args.shouldCancelIntentOnUserNavigation && Intrinsics.areEqual(this.statusBarColor, args.statusBarColor) && Intrinsics.areEqual(this.publishableKey, args.publishableKey) && this.isInstantApp == args.isInstantApp && Intrinsics.areEqual(this.referrer, args.referrer) && this.forceInAppWebView == args.forceInAppWebView;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.requestCode, this.objectId.hashCode() * 31, 31), 31, this.clientSecret), 31, this.url);
            String str = this.returnUrl;
            int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.enableLogging);
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            int hashCode = (m2 + (stripeToolbarCustomization == null ? 0 : stripeToolbarCustomization.hashCode())) * 31;
            String str2 = this.stripeAccountId;
            int m3 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.shouldCancelSource), 31, this.shouldCancelIntentOnUserNavigation);
            Integer num = this.statusBarColor;
            int m4 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m3 + (num == null ? 0 : num.hashCode())) * 31, 31, this.publishableKey), 31, this.isInstantApp);
            String str3 = this.referrer;
            return Boolean.hashCode(this.forceInAppWebView) + ((m4 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder m = Recorder$$ExternalSyntheticOutline2.m("Args(objectId=", this.requestCode, this.objectId, ", requestCode=", ", clientSecret=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.clientSecret, ", url=", this.url, ", returnUrl=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.returnUrl, ", enableLogging=", this.enableLogging, ", toolbarCustomization=");
            m.append(this.toolbarCustomization);
            m.append(", stripeAccountId=");
            m.append(this.stripeAccountId);
            m.append(", shouldCancelSource=");
            re$$ExternalSyntheticOutline0.m(m, this.shouldCancelSource, ", shouldCancelIntentOnUserNavigation=", this.shouldCancelIntentOnUserNavigation, ", statusBarColor=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.statusBarColor, ", publishableKey=", this.publishableKey, ", isInstantApp=");
            NavAction$$ExternalSyntheticOutline0.m(m, this.isInstantApp, ", referrer=", this.referrer, ", forceInAppWebView=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.forceInAppWebView, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.objectId);
            parcel.writeInt(this.requestCode);
            parcel.writeString(this.clientSecret);
            parcel.writeString(this.url);
            parcel.writeString(this.returnUrl);
            parcel.writeByte(this.enableLogging ? (byte) 1 : (byte) 0);
            parcel.writeParcelable(this.toolbarCustomization, i);
            parcel.writeString(this.stripeAccountId);
            parcel.writeByte(this.shouldCancelSource ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.shouldCancelIntentOnUserNavigation ? (byte) 1 : (byte) 0);
            parcel.writeValue(this.statusBarColor);
            parcel.writeString(this.publishableKey);
            parcel.writeByte(this.isInstantApp ? (byte) 1 : (byte) 0);
            parcel.writeString(this.referrer);
            parcel.writeByte(this.forceInAppWebView ? (byte) 1 : (byte) 0);
        }

        public Args(String str, int i, String str2, String str3, String str4, boolean z, StripeToolbarCustomization stripeToolbarCustomization, String str5, boolean z2, boolean z3, Integer num, String str6, boolean z4, String str7, boolean z5) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str6);
            this.objectId = str;
            this.requestCode = i;
            this.clientSecret = str2;
            this.url = str3;
            this.returnUrl = str4;
            this.enableLogging = z;
            this.toolbarCustomization = stripeToolbarCustomization;
            this.stripeAccountId = str5;
            this.shouldCancelSource = z2;
            this.shouldCancelIntentOnUserNavigation = z3;
            this.statusBarColor = num;
            this.publishableKey = str6;
            this.isInstantApp = z4;
            this.referrer = str7;
            this.forceInAppWebView = z5;
        }
    }
}
