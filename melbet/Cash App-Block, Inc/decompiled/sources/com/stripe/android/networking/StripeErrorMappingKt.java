package com.stripe.android.networking;

import android.content.Context;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjc;
import com.google.android.gms.internal.mlkit_genai_prompt.zzjd;
import com.squareup.cash.R;
import com.squareup.cash.exchangedata.api.FxExchangeRate;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class StripeErrorMappingKt {
    public static final Money convert(FxExchangeRate fxExchangeRate, Money money) {
        fxExchangeRate.getClass();
        CurrencyCode currencyCode = fxExchangeRate.toCurrency;
        Long l = money.amount;
        if (l == null) {
            return null;
        }
        long longValue = l.longValue();
        CurrencyCode currencyCode2 = money.currency_code;
        if (currencyCode2 == currencyCode) {
            return money;
        }
        if (currencyCode2 != fxExchangeRate.fromCurrency) {
            return null;
        }
        try {
            BigDecimal valueOf = BigDecimal.valueOf(longValue);
            valueOf.getClass();
            return new Money(Long.valueOf(valueOf.multiply(fxExchangeRate.rate).setScale(0, RoundingMode.HALF_UP).longValueExact()), currencyCode, 4);
        } catch (ArithmeticException unused) {
            return null;
        }
    }

    public static final String getErrorMessage(String str, String str2, String str3, String str4, boolean z, String str5, Context context) {
        String mapErrorCodeToLocalizedMessage = mapErrorCodeToLocalizedMessage(context, str4);
        if (mapErrorCodeToLocalizedMessage != null) {
            return mapErrorCodeToLocalizedMessage;
        }
        String mapErrorCodeToLocalizedMessage2 = mapErrorCodeToLocalizedMessage(context, str3);
        if (!Intrinsics.areEqual(str2, "card_error")) {
            mapErrorCodeToLocalizedMessage2 = null;
        }
        if (mapErrorCodeToLocalizedMessage2 != null) {
            return mapErrorCodeToLocalizedMessage2;
        }
        if (z) {
            str = null;
        }
        if (str != null) {
            return str;
        }
        String string2 = str5 != null ? context.getString(R.string.stripe_request_error, str5) : null;
        if (string2 != null) {
            return string2;
        }
        String string3 = context.getString(R.string.stripe_unexpected_error_try_again);
        string3.getClass();
        return string3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r5.equals("invalid_number") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r5.equals("incorrect_number") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c3, code lost:
    
        if (r5.equals("invalid_cvc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0023, code lost:
    
        if (r5.equals("incorrect_cvc") == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0027, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String mapErrorCodeToLocalizedMessage(Context context, String str) {
        Integer valueOf = Integer.valueOf(R.string.stripe_invalid_card_number);
        Integer valueOf2 = Integer.valueOf(R.string.stripe_invalid_cvc);
        context.getClass();
        if (str != null) {
            switch (str.hashCode()) {
                case -2011738994:
                    if (str.equals("generic_decline")) {
                        valueOf = Integer.valueOf(R.string.stripe_generic_decline);
                        break;
                    }
                    break;
                case -1109249604:
                    if (str.equals("invalid_expiry_month")) {
                        valueOf = Integer.valueOf(R.string.stripe_invalid_expiry_month);
                        break;
                    }
                    break;
                case -952840184:
                    break;
                case -857379549:
                    break;
                case -822522913:
                    if (str.equals("invalid_owner_name")) {
                        valueOf = Integer.valueOf(R.string.stripe_invalid_owner_name);
                        break;
                    }
                    break;
                case -343766564:
                    if (str.equals("processing_error")) {
                        valueOf = Integer.valueOf(R.string.stripe_processing_error);
                        break;
                    }
                    break;
                case -308669807:
                    break;
                case 147203197:
                    if (str.equals("card_declined")) {
                        valueOf = Integer.valueOf(R.string.stripe_card_declined);
                        break;
                    }
                    break;
                case 657301889:
                    if (str.equals("invalid_expiry_year")) {
                        valueOf = Integer.valueOf(R.string.stripe_invalid_expiry_year);
                        break;
                    }
                    break;
                case 1436957674:
                    if (str.equals("expired_card")) {
                        valueOf = Integer.valueOf(R.string.stripe_expired_card);
                        break;
                    }
                    break;
                case 1705388818:
                    if (str.equals("insufficient_funds")) {
                        valueOf = Integer.valueOf(R.string.stripe_insufficient_funds);
                        break;
                    }
                    break;
                case 1737231027:
                    if (str.equals("invalid_bank_account_iban")) {
                        valueOf = Integer.valueOf(R.string.stripe_invalid_bank_account_iban);
                        break;
                    }
                    break;
                case 2037370550:
                    break;
            }
            if (valueOf == null) {
                return context.getString(valueOf.intValue());
            }
            return null;
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public abstract zzjc.zzd zza(zzjc zzjcVar);

    public abstract zzjd.zze zzb(zzjc zzjcVar);

    public abstract void zzc(zzjd.zze zzeVar, zzjd.zze zzeVar2);

    public abstract void zzd(zzjd.zze zzeVar, Thread thread);

    public abstract boolean zze(zzjc zzjcVar, zzjc.zzd zzdVar, zzjc.zzd zzdVar2);

    public abstract boolean zzf(zzjd zzjdVar, Object obj, Object obj2);

    public abstract boolean zzg(zzjd zzjdVar, zzjd.zze zzeVar, zzjd.zze zzeVar2);
}
