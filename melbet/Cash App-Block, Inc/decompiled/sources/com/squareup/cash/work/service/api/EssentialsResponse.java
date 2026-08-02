package com.squareup.cash.work.service.api;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.PreferenceManager;
import com.squareup.cash.work.tinygraph.models.Job;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.Membership;
import com.squareup.cash.work.tinygraph.models.Merchant;
import com.squareup.cash.work.tinygraph.models.Person;
import com.squareup.cash.work.tinygraph.models.Setting;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u007f\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\u0088\u0001\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00042\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00042\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001a\u0012\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001b\u0010\u001cR(\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u0012\u0004\b\u001f\u0010\u0019\u001a\u0004\b\u001e\u0010\u001cR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010\u001a\u0012\u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u001cR(\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010\u001a\u0012\u0004\b#\u0010\u0019\u001a\u0004\b\"\u0010\u001cR(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u001a\u0012\u0004\b%\u0010\u0019\u001a\u0004\b$\u0010\u001cR(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u001a\u0012\u0004\b'\u0010\u0019\u001a\u0004\b&\u0010\u001c¨\u0006("}, d2 = {"Lcom/squareup/cash/work/service/api/EssentialsResponse;", "", "Lcom/squareup/cash/work/tinygraph/models/Person;", "person", "", "Lcom/squareup/cash/work/tinygraph/models/Merchant;", "merchants", "Lcom/squareup/cash/work/tinygraph/models/Membership;", "memberships", "Lcom/squareup/cash/work/tinygraph/models/Metadata;", "metadatas", "Lcom/squareup/cash/work/tinygraph/models/Location;", "locations", "Lcom/squareup/cash/work/tinygraph/models/Job;", "jobs", "Lcom/squareup/cash/work/tinygraph/models/Setting;", PreferenceManager.PREF_SETTINGS, "<init>", "(Lcom/squareup/cash/work/tinygraph/models/Person;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "copy", "(Lcom/squareup/cash/work/tinygraph/models/Person;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/squareup/cash/work/service/api/EssentialsResponse;", "Lcom/squareup/cash/work/tinygraph/models/Person;", "getPerson", "()Lcom/squareup/cash/work/tinygraph/models/Person;", "getPerson$annotations", "()V", "Ljava/util/List;", "getMerchants", "()Ljava/util/List;", "getMerchants$annotations", "getMemberships", "getMemberships$annotations", "getMetadatas", "getMetadatas$annotations", "getLocations", "getLocations$annotations", "getJobs", "getJobs$annotations", "getSettings", "getSettings$annotations", "api"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class EssentialsResponse {
    public final List jobs;
    public final List locations;
    public final List memberships;
    public final List merchants;
    public final List metadatas;
    public final Person person;
    public final List settings;

    public /* synthetic */ EssentialsResponse(Person person, List list, List list2, List list3, List list4, List list5, List list6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : person, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : list4, (i & 32) != 0 ? null : list5, (i & 64) != 0 ? null : list6);
    }

    @Json(name = "jobs")
    public static /* synthetic */ void getJobs$annotations() {
    }

    @Json(name = "locations")
    public static /* synthetic */ void getLocations$annotations() {
    }

    @Json(name = "memberships")
    public static /* synthetic */ void getMemberships$annotations() {
    }

    @Json(name = "merchants")
    public static /* synthetic */ void getMerchants$annotations() {
    }

    @Json(name = "membershipMetadatas")
    public static /* synthetic */ void getMetadatas$annotations() {
    }

    @Json(name = "person")
    public static /* synthetic */ void getPerson$annotations() {
    }

    @Json(name = PreferenceManager.PREF_SETTINGS)
    public static /* synthetic */ void getSettings$annotations() {
    }

    public final EssentialsResponse copy(@Json(name = "person") Person person, @Json(name = "merchants") List<Merchant> merchants, @Json(name = "memberships") List<Membership> memberships, @Json(name = "membershipMetadatas") List<com.squareup.cash.work.tinygraph.models.Metadata> metadatas, @Json(name = "locations") List<Location> locations, @Json(name = "jobs") List<Job> jobs, @Json(name = "settings") List<Setting> settings) {
        return new EssentialsResponse(person, merchants, memberships, metadatas, locations, jobs, settings);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EssentialsResponse)) {
            return false;
        }
        EssentialsResponse essentialsResponse = (EssentialsResponse) obj;
        return Intrinsics.areEqual(this.person, essentialsResponse.person) && Intrinsics.areEqual(this.merchants, essentialsResponse.merchants) && Intrinsics.areEqual(this.memberships, essentialsResponse.memberships) && Intrinsics.areEqual(this.metadatas, essentialsResponse.metadatas) && Intrinsics.areEqual(this.locations, essentialsResponse.locations) && Intrinsics.areEqual(this.jobs, essentialsResponse.jobs) && Intrinsics.areEqual(this.settings, essentialsResponse.settings);
    }

    public final int hashCode() {
        Person person = this.person;
        int hashCode = (person == null ? 0 : person.hashCode()) * 31;
        List list = this.merchants;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.memberships;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.metadatas;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.locations;
        int hashCode5 = (hashCode4 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.jobs;
        int hashCode6 = (hashCode5 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.settings;
        return hashCode6 + (list6 != null ? list6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EssentialsResponse(person=");
        sb.append(this.person);
        sb.append(", merchants=");
        sb.append(this.merchants);
        sb.append(", memberships=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.memberships, ", metadatas=", this.metadatas, ", locations=");
        Request$Priority$EnumUnboxingLocalUtility.m(sb, this.locations, ", jobs=", this.jobs, ", settings=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.settings, ")");
    }

    public EssentialsResponse(@Json(name = "person") Person person, @Json(name = "merchants") List<Merchant> list, @Json(name = "memberships") List<Membership> list2, @Json(name = "membershipMetadatas") List<com.squareup.cash.work.tinygraph.models.Metadata> list3, @Json(name = "locations") List<Location> list4, @Json(name = "jobs") List<Job> list5, @Json(name = "settings") List<Setting> list6) {
        this.person = person;
        this.merchants = list;
        this.memberships = list2;
        this.metadatas = list3;
        this.locations = list4;
        this.jobs = list5;
        this.settings = list6;
    }
}
