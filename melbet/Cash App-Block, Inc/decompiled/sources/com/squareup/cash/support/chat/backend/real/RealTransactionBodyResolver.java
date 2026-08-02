package com.squareup.cash.support.chat.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.js.ZiplineHistoryDataJavaScripter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.db2.activity.CashActivity;
import com.squareup.cash.multiplatform.accentcolors.AccentColorsKt;
import com.squareup.cash.profile.views.ProfileCropView;
import com.squareup.cash.support.chat.backend.api.MessageBody;
import com.squareup.cash.transactionpicker.presenters.RealTransactionLoader$getTransactions$1$1$1;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.ui.MerchantData;
import com.squareup.protos.franklin.ui.PaymentHistoryData;
import com.squareup.util.cash.ColorsKt;
import dev.zacsweers.metro.Provider;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealTransactionBodyResolver implements TransactionBodyResolver {
    public final CashAccountDatabaseImpl cashDatabase;
    public final CoroutineContext ioDispatcher;
    public final Provider javaScripters;
    public final CoroutineContext jsDispatcher;

    public RealTransactionBodyResolver(Provider provider, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        provider.getClass();
        this.javaScripters = provider;
        this.cashDatabase = cashAccountDatabaseImpl;
        this.ioDispatcher = coroutineContext;
        this.jsDispatcher = coroutineContext2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0065, code lost:
    
        if (r1 == r3) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getTransaction(String str, ContinuationImpl continuationImpl) {
        RealTransactionBodyResolver$getTransaction$1 realTransactionBodyResolver$getTransaction$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        String str2;
        Object withContext;
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter;
        CashActivity cashActivity;
        CashActivity cashActivity2;
        String str3;
        Color themed_accent_color;
        boolean z;
        MerchantData merchant_data;
        Boolean bool;
        Boolean bool2;
        if (continuationImpl instanceof RealTransactionBodyResolver$getTransaction$1) {
            realTransactionBodyResolver$getTransaction$1 = (RealTransactionBodyResolver$getTransaction$1) continuationImpl;
            int i2 = realTransactionBodyResolver$getTransaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realTransactionBodyResolver$getTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realTransactionBodyResolver$getTransaction$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realTransactionBodyResolver$getTransaction$1.label;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.javaScripters.invoke();
                    str2 = str;
                    realTransactionBodyResolver$getTransaction$1.L$0 = str2;
                    realTransactionBodyResolver$getTransaction$1.label = 1;
                    obj = FlowKt.first(flow, realTransactionBodyResolver$getTransaction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            cashActivity2 = realTransactionBodyResolver$getTransaction$1.L$3;
                            str3 = realTransactionBodyResolver$getTransaction$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            PaymentHistoryData paymentHistoryData = (PaymentHistoryData) obj;
                            themed_accent_color = cashActivity2.getThemed_accent_color();
                            if (themed_accent_color != null || (r3 = ColorsKt.validate(themed_accent_color)) == null) {
                                Color uiColor = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(28, cashActivity2.getThreaded_customer_id(), cashActivity2.getTheir_id(), null, null, null));
                            }
                            String str4 = paymentHistoryData.support_short_title;
                            Image photo = cashActivity2.getPhoto();
                            String str5 = photo == null ? photo.light_url : null;
                            Image photo2 = cashActivity2.getPhoto();
                            String str6 = photo2 == null ? photo2.dark_url : null;
                            Color.ModeVariant modeVariant = uiColor.light;
                            String str7 = modeVariant == null ? modeVariant.srgb : null;
                            Color.ModeVariant modeVariant2 = uiColor.dark;
                            String str8 = modeVariant2 != null ? modeVariant2.srgb : null;
                            String display_name = cashActivity2.getDisplay_name();
                            MerchantData merchant_data2 = cashActivity2.getMerchant_data();
                            z = false;
                            boolean booleanValue = (merchant_data2 != null || (bool2 = merchant_data2.should_colorize_avatar) == null) ? false : bool2.booleanValue();
                            merchant_data = cashActivity2.getMerchant_data();
                            if (merchant_data != null && (bool = merchant_data.should_fill_background) != null) {
                                z = bool.booleanValue();
                            }
                            return new MessageBody.TransactionBody.Loaded(str3, str4, new MessageBody.TransactionBody.AvatarComponents(str5, str6, str7, str8, display_name, booleanValue, z, cashActivity2.getLookup_key(), cashActivity2.getEmail(), cashActivity2.getSms()));
                        }
                        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter2 = realTransactionBodyResolver$getTransaction$1.L$1;
                        String str9 = realTransactionBodyResolver$getTransaction$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        ziplineHistoryDataJavaScripter = ziplineHistoryDataJavaScripter2;
                        str2 = str9;
                        cashActivity = (CashActivity) obj;
                        if (cashActivity != null) {
                            return new MessageBody.TransactionBody.Missing(str2);
                        }
                        RealTransactionLoader$getTransactions$1$1$1 realTransactionLoader$getTransactions$1$1$1 = new RealTransactionLoader$getTransactions$1$1$1(ziplineHistoryDataJavaScripter, cashActivity, (Continuation) null);
                        realTransactionBodyResolver$getTransaction$1.L$0 = str2;
                        realTransactionBodyResolver$getTransaction$1.L$1 = null;
                        realTransactionBodyResolver$getTransaction$1.L$3 = cashActivity;
                        realTransactionBodyResolver$getTransaction$1.label = 3;
                        Object withContext2 = JobKt.withContext(this.jsDispatcher, realTransactionLoader$getTransactions$1$1$1, realTransactionBodyResolver$getTransaction$1);
                        if (withContext2 != coroutineSingletons) {
                            obj = withContext2;
                            cashActivity2 = cashActivity;
                            str3 = str2;
                            PaymentHistoryData paymentHistoryData2 = (PaymentHistoryData) obj;
                            themed_accent_color = cashActivity2.getThemed_accent_color();
                            if (themed_accent_color != null) {
                            }
                            Color uiColor2 = ColorsKt.toUiColor(AccentColorsKt.getAccentColor$default(28, cashActivity2.getThreaded_customer_id(), cashActivity2.getTheir_id(), null, null, null));
                            String str42 = paymentHistoryData2.support_short_title;
                            Image photo3 = cashActivity2.getPhoto();
                            if (photo3 == null) {
                            }
                            Image photo22 = cashActivity2.getPhoto();
                            if (photo22 == null) {
                            }
                            Color.ModeVariant modeVariant3 = uiColor2.light;
                            if (modeVariant3 == null) {
                            }
                            Color.ModeVariant modeVariant22 = uiColor2.dark;
                            String str82 = modeVariant22 != null ? modeVariant22.srgb : null;
                            String display_name2 = cashActivity2.getDisplay_name();
                            MerchantData merchant_data22 = cashActivity2.getMerchant_data();
                            z = false;
                            if (merchant_data22 != null) {
                            }
                            merchant_data = cashActivity2.getMerchant_data();
                            if (merchant_data != null) {
                                z = bool.booleanValue();
                            }
                            return new MessageBody.TransactionBody.Loaded(str3, str42, new MessageBody.TransactionBody.AvatarComponents(str5, str6, str7, str82, display_name2, booleanValue, z, cashActivity2.getLookup_key(), cashActivity2.getEmail(), cashActivity2.getSms()));
                        }
                        return coroutineSingletons;
                    }
                    str2 = realTransactionBodyResolver$getTransaction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter3 = (ZiplineHistoryDataJavaScripter) obj;
                ProfileCropView.AnonymousClass3 anonymousClass3 = new ProfileCropView.AnonymousClass3(this.cashDatabase.cashActivityQueries, str2, objArr == true ? 1 : 0, 27);
                realTransactionBodyResolver$getTransaction$1.L$0 = str2;
                realTransactionBodyResolver$getTransaction$1.L$1 = ziplineHistoryDataJavaScripter3;
                realTransactionBodyResolver$getTransaction$1.label = 2;
                withContext = JobKt.withContext(this.ioDispatcher, anonymousClass3, realTransactionBodyResolver$getTransaction$1);
                if (withContext != coroutineSingletons) {
                    ziplineHistoryDataJavaScripter = ziplineHistoryDataJavaScripter3;
                    obj = withContext;
                    cashActivity = (CashActivity) obj;
                    if (cashActivity != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        realTransactionBodyResolver$getTransaction$1 = new RealTransactionBodyResolver$getTransaction$1(this, continuationImpl);
        Object obj2 = realTransactionBodyResolver$getTransaction$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realTransactionBodyResolver$getTransaction$1.label;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        ZiplineHistoryDataJavaScripter ziplineHistoryDataJavaScripter32 = (ZiplineHistoryDataJavaScripter) obj2;
        ProfileCropView.AnonymousClass3 anonymousClass32 = new ProfileCropView.AnonymousClass3(this.cashDatabase.cashActivityQueries, str2, objArr2 == true ? 1 : 0, 27);
        realTransactionBodyResolver$getTransaction$1.L$0 = str2;
        realTransactionBodyResolver$getTransaction$1.L$1 = ziplineHistoryDataJavaScripter32;
        realTransactionBodyResolver$getTransaction$1.label = 2;
        withContext = JobKt.withContext(this.ioDispatcher, anonymousClass32, realTransactionBodyResolver$getTransaction$1);
        if (withContext != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
