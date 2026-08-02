package com.squareup.cash.work.tinygraph.models;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import com.stripe.hcaptcha.HCaptcha$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001*Ba\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Jj\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0003\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0005\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0018\u0012\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001e\u0012\u0004\b!\u0010\u0017\u001a\u0004\b\u001f\u0010 R.\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\"\u0012\u0004\b%\u0010\u0017\u001a\u0004\b#\u0010$R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010&\u0012\u0004\b(\u0010\u0017\u001a\u0004\b\r\u0010'R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010&\u0012\u0004\b)\u0010\u0017\u001a\u0004\b\u000e\u0010'¨\u0006+"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Person;", "Lcom/squareup/cash/work/tinygraph/models/IBaseEntity;", "", "id", "", "createdAt", "updatedAt", "", "protoJson", "", "Lcom/squareup/cash/work/tinygraph/models/Person$Name;", "personNamesPerMerchant", "", "isSquareEmployee", "isImpersonated", "<init>", "(Ljava/lang/String;JJLjava/lang/Object;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "copy", "(Ljava/lang/String;JJLjava/lang/Object;Ljava/util/Map;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/squareup/cash/work/tinygraph/models/Person;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "J", "getCreatedAt", "()J", "getCreatedAt$annotations", "getUpdatedAt", "getUpdatedAt$annotations", "Ljava/lang/Object;", "getProtoJson", "()Ljava/lang/Object;", "getProtoJson$annotations", "Ljava/util/Map;", "getPersonNamesPerMerchant", "()Ljava/util/Map;", "getPersonNamesPerMerchant$annotations", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "isSquareEmployee$annotations", "isImpersonated$annotations", "Name", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Person implements IBaseEntity {
    public final long createdAt;
    public final String id;
    public final Boolean isImpersonated;
    public final Boolean isSquareEmployee;
    public final Map personNamesPerMerchant;
    public final Object protoJson;
    public final transient Lazy protoModel$delegate;
    public final long updatedAt;

    public Person(@Json(name = "id") String str, @Json(name = "createdAt") long j, @Json(name = "updatedAt") long j2, @Json(name = "proto") Object obj, @Json(name = "names") Map<String, Name> map, @Json(name = "isSquareEmployee") Boolean bool, @Json(name = "isImpersonated") Boolean bool2) {
        str.getClass();
        this.id = str;
        this.createdAt = j;
        this.updatedAt = j2;
        this.protoJson = obj;
        this.personNamesPerMerchant = map;
        this.isSquareEmployee = bool;
        this.isImpersonated = bool2;
        this.protoModel$delegate = LazyKt.lazy(new HCaptcha$$ExternalSyntheticLambda0(this, 2));
    }

    @Json(name = "createdAt")
    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    @Json(name = "id")
    public static /* synthetic */ void getId$annotations() {
    }

    @Json(name = "names")
    public static /* synthetic */ void getPersonNamesPerMerchant$annotations() {
    }

    @Json(name = "proto")
    public static /* synthetic */ void getProtoJson$annotations() {
    }

    @Json(name = "updatedAt")
    public static /* synthetic */ void getUpdatedAt$annotations() {
    }

    @Json(name = "isImpersonated")
    public static /* synthetic */ void isImpersonated$annotations() {
    }

    @Json(name = "isSquareEmployee")
    public static /* synthetic */ void isSquareEmployee$annotations() {
    }

    public final Person copy(@Json(name = "id") String id, @Json(name = "createdAt") long createdAt, @Json(name = "updatedAt") long updatedAt, @Json(name = "proto") Object protoJson, @Json(name = "names") Map<String, Name> personNamesPerMerchant, @Json(name = "isSquareEmployee") Boolean isSquareEmployee, @Json(name = "isImpersonated") Boolean isImpersonated) {
        id.getClass();
        return new Person(id, createdAt, updatedAt, protoJson, personNamesPerMerchant, isSquareEmployee, isImpersonated);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person person = (Person) obj;
        return Intrinsics.areEqual(this.id, person.id) && this.createdAt == person.createdAt && this.updatedAt == person.updatedAt && Intrinsics.areEqual(this.protoJson, person.protoJson) && Intrinsics.areEqual(this.personNamesPerMerchant, person.personNamesPerMerchant) && Intrinsics.areEqual(this.isSquareEmployee, person.isSquareEmployee) && Intrinsics.areEqual(this.isImpersonated, person.isImpersonated);
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final String getId() {
        return this.id;
    }

    @Override // com.squareup.cash.work.tinygraph.models.IBaseEntity
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.id.hashCode() * 31, 31, this.createdAt), 31, this.updatedAt);
        Object obj = this.protoJson;
        int hashCode = (m + (obj == null ? 0 : obj.hashCode())) * 31;
        Map map = this.personNamesPerMerchant;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Boolean bool = this.isSquareEmployee;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isImpersonated;
        return hashCode3 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Person(id=", this.id, ", createdAt=", this.createdAt);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.updatedAt, ", updatedAt=", ", protoJson=", m);
        m.append(this.protoJson);
        m.append(", personNamesPerMerchant=");
        m.append(this.personNamesPerMerchant);
        m.append(", isSquareEmployee=");
        m.append(this.isSquareEmployee);
        m.append(", isImpersonated=");
        m.append(this.isImpersonated);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ Person(String str, long j, long j2, Object obj, Map map, Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, j, j2, obj, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : bool2);
    }

    @JsonClass(generateAdapter = true)
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJX\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\r\u0012\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0012\u0010\u000fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u0012\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u000fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\r\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0016\u0010\u000fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u000fR\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\r\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/squareup/cash/work/tinygraph/models/Person$Name;", "", "", "firstName", "lastName", "givenName", "familyName", "fullName", "initials", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/squareup/cash/work/tinygraph/models/Person$Name;", "Ljava/lang/String;", "getFirstName", "()Ljava/lang/String;", "getFirstName$annotations", "()V", "getLastName", "getLastName$annotations", "getGivenName", "getGivenName$annotations", "getFamilyName", "getFamilyName$annotations", "getFullName", "getFullName$annotations", "getInitials", "getInitials$annotations", "models"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Name {
        public final String familyName;
        public final String firstName;
        public final String fullName;
        public final String givenName;
        public final String initials;
        public final String lastName;

        public /* synthetic */ Name(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        @Json(name = "familyName")
        public static /* synthetic */ void getFamilyName$annotations() {
        }

        @Json(name = "firstName")
        public static /* synthetic */ void getFirstName$annotations() {
        }

        @Json(name = "fullName")
        public static /* synthetic */ void getFullName$annotations() {
        }

        @Json(name = "givenName")
        public static /* synthetic */ void getGivenName$annotations() {
        }

        @Json(name = "initials")
        public static /* synthetic */ void getInitials$annotations() {
        }

        @Json(name = "lastName")
        public static /* synthetic */ void getLastName$annotations() {
        }

        public final Name copy(@Json(name = "firstName") String firstName, @Json(name = "lastName") String lastName, @Json(name = "givenName") String givenName, @Json(name = "familyName") String familyName, @Json(name = "fullName") String fullName, @Json(name = "initials") String initials) {
            return new Name(firstName, lastName, givenName, familyName, fullName, initials);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Name)) {
                return false;
            }
            Name name = (Name) obj;
            return Intrinsics.areEqual(this.firstName, name.firstName) && Intrinsics.areEqual(this.lastName, name.lastName) && Intrinsics.areEqual(this.givenName, name.givenName) && Intrinsics.areEqual(this.familyName, name.familyName) && Intrinsics.areEqual(this.fullName, name.fullName) && Intrinsics.areEqual(this.initials, name.initials);
        }

        public final int hashCode() {
            String str = this.firstName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.lastName;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.givenName;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.familyName;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.fullName;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.initials;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Name(firstName=", this.firstName, ", lastName=", this.lastName, ", givenName=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.givenName, ", familyName=", this.familyName, ", fullName=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.fullName, ", initials=", this.initials, ")");
        }

        public Name(@Json(name = "firstName") String str, @Json(name = "lastName") String str2, @Json(name = "givenName") String str3, @Json(name = "familyName") String str4, @Json(name = "fullName") String str5, @Json(name = "initials") String str6) {
            this.firstName = str;
            this.lastName = str2;
            this.givenName = str3;
            this.familyName = str4;
            this.fullName = str5;
            this.initials = str6;
        }
    }
}
