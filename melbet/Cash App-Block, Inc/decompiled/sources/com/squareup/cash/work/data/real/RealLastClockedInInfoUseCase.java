package com.squareup.cash.work.data.real;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.work.data.api.LastClockedInInfo;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.identifiers.MerchantIdentifier;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonClass;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import com.squareup.preferences.SharedPreferencesKeyValue;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class RealLastClockedInInfoUseCase {
    public final JsonAdapter listAdapter = new Moshi(new Moshi.Builder()).adapter(Types.newParameterizedType(List.class, StoredLastClockedInInfo.class));
    public final RealUserPrefs userPrefs;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ8\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\f\u0012\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0011\u0010\u000eR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\f\u0012\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0013\u0010\u000eR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\f\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0015\u0010\u000e¨\u0006\u0017"}, d2 = {"com/squareup/cash/work/data/real/RealLastClockedInInfoUseCase$StoredLastClockedInInfo", "", "", "jobToken", "merchantToken", "teamMemberId", "locationToken", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/squareup/cash/work/data/real/RealLastClockedInInfoUseCase$StoredLastClockedInInfo;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/work/data/real/RealLastClockedInInfoUseCase$StoredLastClockedInInfo;", "Ljava/lang/String;", "getJobToken", "()Ljava/lang/String;", "getJobToken$annotations", "()V", "getMerchantToken", "getMerchantToken$annotations", "getTeamMemberId", "getTeamMemberId$annotations", "getLocationToken", "getLocationToken$annotations", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class StoredLastClockedInInfo {
        public final String jobToken;
        public final String locationToken;
        public final String merchantToken;
        public final String teamMemberId;

        public StoredLastClockedInInfo(@Json(name = "jobToken") String str, @Json(name = "merchantToken") String str2, @Json(name = "teamMemberId") String str3, @Json(name = "locationToken") String str4) {
            Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
            this.jobToken = str;
            this.merchantToken = str2;
            this.teamMemberId = str3;
            this.locationToken = str4;
        }

        @Json(name = "jobToken")
        public static /* synthetic */ void getJobToken$annotations() {
        }

        @Json(name = "locationToken")
        public static /* synthetic */ void getLocationToken$annotations() {
        }

        @Json(name = "merchantToken")
        public static /* synthetic */ void getMerchantToken$annotations() {
        }

        @Json(name = "teamMemberId")
        public static /* synthetic */ void getTeamMemberId$annotations() {
        }

        public final StoredLastClockedInInfo copy(@Json(name = "jobToken") String jobToken, @Json(name = "merchantToken") String merchantToken, @Json(name = "teamMemberId") String teamMemberId, @Json(name = "locationToken") String locationToken) {
            jobToken.getClass();
            merchantToken.getClass();
            teamMemberId.getClass();
            locationToken.getClass();
            return new StoredLastClockedInInfo(jobToken, merchantToken, teamMemberId, locationToken);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoredLastClockedInInfo)) {
                return false;
            }
            StoredLastClockedInInfo storedLastClockedInInfo = (StoredLastClockedInInfo) obj;
            return Intrinsics.areEqual(this.jobToken, storedLastClockedInInfo.jobToken) && Intrinsics.areEqual(this.merchantToken, storedLastClockedInInfo.merchantToken) && Intrinsics.areEqual(this.teamMemberId, storedLastClockedInInfo.teamMemberId) && Intrinsics.areEqual(this.locationToken, storedLastClockedInInfo.locationToken);
        }

        public final int hashCode() {
            return this.locationToken.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.jobToken.hashCode() * 31, 31, this.merchantToken), 31, this.teamMemberId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StoredLastClockedInInfo(jobToken=", this.jobToken, ", merchantToken=", this.merchantToken, ", teamMemberId="), this.teamMemberId, ", locationToken=", this.locationToken, ")");
        }
    }

    public RealLastClockedInInfoUseCase(RealUserPrefs realUserPrefs) {
        this.userPrefs = realUserPrefs;
    }

    public final LastClockedInInfo getInfo(MerchantIdentifier merchantIdentifier, String str) {
        Object obj;
        merchantIdentifier.getClass();
        str.getClass();
        Iterator it = getInfoList().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            StoredLastClockedInInfo storedLastClockedInInfo = (StoredLastClockedInInfo) obj;
            if (Intrinsics.areEqual(storedLastClockedInInfo.merchantToken, merchantIdentifier.token) && Intrinsics.areEqual(storedLastClockedInInfo.teamMemberId, str)) {
                break;
            }
        }
        StoredLastClockedInInfo storedLastClockedInInfo2 = (StoredLastClockedInInfo) obj;
        if (storedLastClockedInInfo2 != null) {
            return new LastClockedInInfo(new JobIdentifier(storedLastClockedInInfo2.jobToken), new MerchantIdentifier(storedLastClockedInInfo2.merchantToken), storedLastClockedInInfo2.teamMemberId, new LocationIdentifier(storedLastClockedInInfo2.locationToken));
        }
        return null;
    }

    public final List getInfoList() {
        List list;
        try {
            SharedPreferencesKeyValue sharedPreferencesKeyValue = this.userPrefs.lastClockedInInfoKeyValue;
            String str = (String) sharedPreferencesKeyValue.reader.read(sharedPreferencesKeyValue);
            if (str != null && (list = (List) this.listAdapter.fromJson(str)) != null) {
                return list;
            }
            return EmptyList.INSTANCE;
        } catch (Exception e) {
            Timber.Forest.w("Failed to deserialize LastClockedInInfo list", new Object[0], e);
            return EmptyList.INSTANCE;
        }
    }
}
