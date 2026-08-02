package com.squareup.cash.userjourneys.data;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b \n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b\u0012\n\u0010\t\u001a\u00060\u0007j\u0002`\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\r\u0010(\u001a\u00060\u0007j\u0002`\bHÆ\u0003J\r\u0010)\u001a\u00060\u0007j\u0002`\bHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010.\u001a\u00020\u0011HÆ\u0003J\t\u0010/\u001a\u00020\u0013HÆ\u0003J\u0089\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\f\b\u0002\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\f\b\u0002\u0010\t\u001a\u00060\u0007j\u0002`\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0014\u00101\u001a\u00020\u00132\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00103\u001a\u000204HÖ\u0081\u0004J\n\u00105\u001a\u00020\fHÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0006\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0015\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010%¨\u00066"}, d2 = {"Lcom/squareup/cash/userjourneys/data/UserJourney;", "", "id", "Ljava/util/UUID;", "name", "Lcom/squareup/cash/userjourneys/tracker/UserJourney$Name;", "createdAtEpoch", "", "Lcom/squareup/cash/userjourneys/data/Milliseconds;", "createdAtRealtime", "frustrationSignals", "", "", "frictionSignals", "tags", "variant", "context", "Lcom/squareup/cash/userjourneys/data/JourneyContext;", "isSubJourney", "", "<init>", "(Ljava/util/UUID;Lcom/squareup/cash/userjourneys/tracker/UserJourney$Name;JJLjava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;Lcom/squareup/cash/userjourneys/data/JourneyContext;Z)V", "getId", "()Ljava/util/UUID;", "getName", "()Lcom/squareup/cash/userjourneys/tracker/UserJourney$Name;", "getCreatedAtEpoch", "()J", "getCreatedAtRealtime", "getFrustrationSignals", "()Ljava/util/Set;", "getFrictionSignals", "getTags", "getVariant", "()Ljava/lang/String;", "getContext", "()Lcom/squareup/cash/userjourneys/data/JourneyContext;", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class UserJourney {
    private final JourneyContext context;
    private final long createdAtEpoch;
    private final long createdAtRealtime;
    private final Set<String> frictionSignals;
    private final Set<String> frustrationSignals;
    private final UUID id;
    private final boolean isSubJourney;
    private final UserJourney$Name name;
    private final Set<String> tags;
    private final String variant;

    public UserJourney(UUID uuid, UserJourney$Name userJourney$Name, long j, long j2, Set<String> set, Set<String> set2, Set<String> set3, String str, JourneyContext journeyContext, boolean z) {
        uuid.getClass();
        userJourney$Name.getClass();
        set.getClass();
        set2.getClass();
        set3.getClass();
        journeyContext.getClass();
        this.id = uuid;
        this.name = userJourney$Name;
        this.createdAtEpoch = j;
        this.createdAtRealtime = j2;
        this.frustrationSignals = set;
        this.frictionSignals = set2;
        this.tags = set3;
        this.variant = str;
        this.context = journeyContext;
        this.isSubJourney = z;
    }

    public static /* synthetic */ UserJourney copy$default(UserJourney userJourney, UUID uuid, UserJourney$Name userJourney$Name, long j, long j2, Set set, Set set2, Set set3, String str, JourneyContext journeyContext, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = userJourney.id;
        }
        if ((i & 2) != 0) {
            userJourney$Name = userJourney.name;
        }
        if ((i & 4) != 0) {
            j = userJourney.createdAtEpoch;
        }
        if ((i & 8) != 0) {
            j2 = userJourney.createdAtRealtime;
        }
        if ((i & 16) != 0) {
            set = userJourney.frustrationSignals;
        }
        if ((i & 32) != 0) {
            set2 = userJourney.frictionSignals;
        }
        if ((i & 64) != 0) {
            set3 = userJourney.tags;
        }
        if ((i & 128) != 0) {
            str = userJourney.variant;
        }
        if ((i & 256) != 0) {
            journeyContext = userJourney.context;
        }
        if ((i & 512) != 0) {
            z = userJourney.isSubJourney;
        }
        JourneyContext journeyContext2 = journeyContext;
        boolean z2 = z;
        long j3 = j2;
        long j4 = j;
        return userJourney.copy(uuid, userJourney$Name, j4, j3, set, set2, set3, str, journeyContext2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsSubJourney() {
        return this.isSubJourney;
    }

    /* renamed from: component2, reason: from getter */
    public final UserJourney$Name getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreatedAtEpoch() {
        return this.createdAtEpoch;
    }

    /* renamed from: component4, reason: from getter */
    public final long getCreatedAtRealtime() {
        return this.createdAtRealtime;
    }

    public final Set<String> component5() {
        return this.frustrationSignals;
    }

    public final Set<String> component6() {
        return this.frictionSignals;
    }

    public final Set<String> component7() {
        return this.tags;
    }

    /* renamed from: component8, reason: from getter */
    public final String getVariant() {
        return this.variant;
    }

    /* renamed from: component9, reason: from getter */
    public final JourneyContext getContext() {
        return this.context;
    }

    public final UserJourney copy(UUID id, UserJourney$Name name, long createdAtEpoch, long createdAtRealtime, Set<String> frustrationSignals, Set<String> frictionSignals, Set<String> tags, String variant, JourneyContext context, boolean isSubJourney) {
        id.getClass();
        name.getClass();
        frustrationSignals.getClass();
        frictionSignals.getClass();
        tags.getClass();
        context.getClass();
        return new UserJourney(id, name, createdAtEpoch, createdAtRealtime, frustrationSignals, frictionSignals, tags, variant, context, isSubJourney);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserJourney)) {
            return false;
        }
        UserJourney userJourney = (UserJourney) other;
        return Intrinsics.areEqual(this.id, userJourney.id) && this.name == userJourney.name && this.createdAtEpoch == userJourney.createdAtEpoch && this.createdAtRealtime == userJourney.createdAtRealtime && Intrinsics.areEqual(this.frustrationSignals, userJourney.frustrationSignals) && Intrinsics.areEqual(this.frictionSignals, userJourney.frictionSignals) && Intrinsics.areEqual(this.tags, userJourney.tags) && Intrinsics.areEqual(this.variant, userJourney.variant) && Intrinsics.areEqual(this.context, userJourney.context) && this.isSubJourney == userJourney.isSubJourney;
    }

    public final JourneyContext getContext() {
        return this.context;
    }

    public final long getCreatedAtEpoch() {
        return this.createdAtEpoch;
    }

    public final long getCreatedAtRealtime() {
        return this.createdAtRealtime;
    }

    public final Set<String> getFrictionSignals() {
        return this.frictionSignals;
    }

    public final Set<String> getFrustrationSignals() {
        return this.frustrationSignals;
    }

    public final UUID getId() {
        return this.id;
    }

    public final UserJourney$Name getName() {
        return this.name;
    }

    public final Set<String> getTags() {
        return this.tags;
    }

    public final String getVariant() {
        return this.variant;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((this.name.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.createdAtEpoch), 31, this.createdAtRealtime), 31, this.frustrationSignals), 31, this.frictionSignals), 31, this.tags);
        String str = this.variant;
        return Boolean.hashCode(this.isSubJourney) + ((this.context.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }

    public final boolean isSubJourney() {
        return this.isSubJourney;
    }

    public String toString() {
        UUID uuid = this.id;
        UserJourney$Name userJourney$Name = this.name;
        long j = this.createdAtEpoch;
        long j2 = this.createdAtRealtime;
        Set<String> set = this.frustrationSignals;
        Set<String> set2 = this.frictionSignals;
        Set<String> set3 = this.tags;
        String str = this.variant;
        JourneyContext journeyContext = this.context;
        boolean z = this.isSubJourney;
        StringBuilder sb = new StringBuilder("UserJourney(id=");
        sb.append(uuid);
        sb.append(", name=");
        sb.append(userJourney$Name);
        sb.append(", createdAtEpoch=");
        sb.append(j);
        Boxes$$ExternalSyntheticOutline1.m1151m(j2, ", createdAtRealtime=", ", frustrationSignals=", sb);
        sb.append(set);
        sb.append(", frictionSignals=");
        sb.append(set2);
        sb.append(", tags=");
        sb.append(set3);
        sb.append(", variant=");
        sb.append(str);
        sb.append(", context=");
        sb.append(journeyContext);
        sb.append(", isSubJourney=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ UserJourney(UUID uuid, UserJourney$Name userJourney$Name, long j, long j2, Set set, Set set2, Set set3, String str, JourneyContext journeyContext, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, userJourney$Name, j, j2, set, set2, set3, str, journeyContext, (i & 512) != 0 ? false : z);
    }
}
