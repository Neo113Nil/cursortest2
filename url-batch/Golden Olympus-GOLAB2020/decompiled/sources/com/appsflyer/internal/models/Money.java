package com.appsflyer.internal.models;

import android.os.Process;
import android.view.ViewConfiguration;
import com.appsflyer.internal.connector.purcahse.AFPurchaseConnectorA1g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.ironsource.InterfaceC1490j3;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata
/* loaded from: classes.dex */
public final class Money {
    public static final Companion Companion = new Companion(null);
    private final String currencyCode;
    private final long nanos;
    private final long units;

    @Metadata
    public static final class Companion implements Deserialize<Money> {
        private static int $10 = 0;
        private static int $11 = 1;
        private static int InAppPurchaseEvent = 1;
        private static int getPackageName = 0;
        private static long toJsonMap = 3402519045217790112L;

        private Companion() {
        }

        private static void a(String str, int i4, Object[] objArr) {
            int i5 = $11 + 47;
            $10 = i5 % UserVerificationMethods.USER_VERIFY_PATTERN;
            char[] cArr = str;
            if (i5 % 2 != 0) {
                throw null;
            }
            if (str != null) {
                cArr = str.toCharArray();
            }
            char[] cArr2 = cArr;
            AFPurchaseConnectorA1g aFPurchaseConnectorA1g = new AFPurchaseConnectorA1g();
            aFPurchaseConnectorA1g.getPackageName = i4;
            int length = cArr2.length;
            long[] jArr = new long[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i6 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i6 >= cArr2.length) {
                    break;
                }
                int i7 = $10 + 77;
                $11 = i7 % UserVerificationMethods.USER_VERIFY_PATTERN;
                if (i7 % 2 == 0) {
                    jArr[i6] = cArr2[i6] * (i6 + aFPurchaseConnectorA1g.getPackageName) * toJsonMap * 5319290379872349608L;
                } else {
                    jArr[i6] = (toJsonMap ^ 5319290379872349608L) ^ (cArr2[i6] ^ (i6 * aFPurchaseConnectorA1g.getPackageName));
                    i6++;
                }
                aFPurchaseConnectorA1g.InAppPurchaseEvent = i6;
            }
            char[] cArr3 = new char[length];
            aFPurchaseConnectorA1g.InAppPurchaseEvent = 0;
            while (true) {
                int i8 = aFPurchaseConnectorA1g.InAppPurchaseEvent;
                if (i8 >= cArr2.length) {
                    objArr[0] = new String(cArr3);
                    return;
                } else {
                    cArr3[i8] = (char) jArr[i8];
                    aFPurchaseConnectorA1g.InAppPurchaseEvent = i8 + 1;
                }
            }
        }

        @Override // com.appsflyer.internal.models.Deserialize
        public final /* bridge */ /* synthetic */ Money fromJson(JSONObject jSONObject) {
            int i4 = InAppPurchaseEvent + InterfaceC1490j3.d.b.f16812d;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return fromJson(jSONObject);
            }
            fromJson(jSONObject);
            throw null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.appsflyer.internal.models.Deserialize
        public final Money fromJson(JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("蕫銜ꪸ싙\udae9\uf203ਭ≖㩃厎殦菆", 6113 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
            String optString = jSONObject.optString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(optString, "");
            Object[] objArr2 = new Object[1];
            a("蕦屲㝐ึ\ue117", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 55579, objArr2);
            long j4 = jSONObject.getLong(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("蕽ᕫꕻ㕛앏", ((Process.getThreadPriority(0) + 20) >> 6) + 36877, objArr3);
            Money money = new Money(optString, j4, jSONObject.getLong(((String) objArr3[0]).intern()));
            int i4 = InAppPurchaseEvent + 33;
            getPackageName = i4 % UserVerificationMethods.USER_VERIFY_PATTERN;
            if (i4 % 2 == 0) {
                return money;
            }
            throw null;
        }
    }

    public Money(String str, long j4, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyCode = str;
        this.nanos = j4;
        this.units = j5;
    }

    public static /* synthetic */ Money copy$default(Money money, String str, long j4, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = money.currencyCode;
        }
        if ((i4 & 2) != 0) {
            j4 = money.nanos;
        }
        if ((i4 & 4) != 0) {
            j5 = money.units;
        }
        return money.copy(str, j4, j5);
    }

    public final String component1() {
        return this.currencyCode;
    }

    public final long component2() {
        return this.nanos;
    }

    public final long component3() {
        return this.units;
    }

    public final Money copy(String str, long j4, long j5) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Money(str, j4, j5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return Intrinsics.areEqual(this.currencyCode, money.currencyCode) && this.nanos == money.nanos && this.units == money.units;
    }

    public final String getCurrencyCode() {
        return this.currencyCode;
    }

    public final long getNanos() {
        return this.nanos;
    }

    public final long getUnits() {
        return this.units;
    }

    public final int hashCode() {
        return (((this.currencyCode.hashCode() * 31) + Long.hashCode(this.nanos)) * 31) + Long.hashCode(this.units);
    }

    public final String toString() {
        return "Money(currencyCode=" + this.currencyCode + ", nanos=" + this.nanos + ", units=" + this.units + ")";
    }
}
