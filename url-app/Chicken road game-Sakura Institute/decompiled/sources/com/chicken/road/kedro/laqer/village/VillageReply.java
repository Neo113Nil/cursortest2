package com.chicken.road.kedro.laqer.village;

import h3.b;
import i3.W;
import i3.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
/* loaded from: classes.dex */
public final class VillageReply {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    private final String time;
    private final String url;

    @Metadata
    public static final class Companion {
        public final KSerializer serializer() {
            return VillageReply$$serializer.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VillageReply() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ VillageReply copy$default(VillageReply villageReply, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = villageReply.url;
        }
        if ((i2 & 2) != 0) {
            str2 = villageReply.time;
        }
        return villageReply.copy(str, str2);
    }

    public static final void write$Self$app_release(VillageReply villageReply, b bVar, SerialDescriptor descriptor) {
        M1.a aVar = (M1.a) bVar;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        a0 a0Var = a0.f7055a;
        aVar.x(descriptor, 0, villageReply.url);
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        aVar.x(descriptor, 1, villageReply.time);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.time;
    }

    public final VillageReply copy(String str, String str2) {
        return new VillageReply(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VillageReply)) {
            return false;
        }
        VillageReply villageReply = (VillageReply) obj;
        return Intrinsics.a(this.url, villageReply.url) && Intrinsics.a(this.time, villageReply.time);
    }

    public final String getTime() {
        return this.time;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.time;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "VillageReply(url=" + this.url + ", time=" + this.time + ")";
    }

    public VillageReply(int i2, String str, String str2, W w4) {
        if ((i2 & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i2 & 2) == 0) {
            this.time = null;
        } else {
            this.time = str2;
        }
    }

    public VillageReply(String str, String str2) {
        this.url = str;
        this.time = str2;
    }

    public /* synthetic */ VillageReply(String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2);
    }
}
