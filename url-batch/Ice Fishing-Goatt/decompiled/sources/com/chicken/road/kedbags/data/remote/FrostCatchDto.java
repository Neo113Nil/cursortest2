package com.chicken.road.kedbags.data.remote;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: FrostCatchDto.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000267BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rBO\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0011J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003JE\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\tHÆ\u0001J\u0013\u0010*\u001a\u00020\u00072\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020\tHÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0015R\u001c\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0013\u001a\u0004\b\"\u0010\u001e¨\u00068"}, d2 = {"Lcom/chicken/road/kedbags/data/remote/FrostCatchDto;", "", "catchCount", "", "iceDepth", "", "biteActive", "", "lureStyle", "", "windLevel", "lakeMood", "<init>", "(IDZLjava/lang/String;ILjava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIDZLjava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCatchCount$annotations", "()V", "getCatchCount", "()I", "getIceDepth$annotations", "getIceDepth", "()D", "getBiteActive$annotations", "getBiteActive", "()Z", "getLureStyle$annotations", "getLureStyle", "()Ljava/lang/String;", "getWindLevel$annotations", "getWindLevel", "getLakeMood$annotations", "getLakeMood", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app", "$serializer", "Companion", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Serializable
/* loaded from: classes2.dex */
public final /* data */ class FrostCatchDto {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean biteActive;
    private final int catchCount;
    private final double iceDepth;
    private final String lakeMood;
    private final String lureStyle;
    private final int windLevel;

    public FrostCatchDto() {
        this(0, 0.0d, false, (String) null, 0, (String) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ FrostCatchDto copy$default(FrostCatchDto frostCatchDto, int i, double d, boolean z, String str, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = frostCatchDto.catchCount;
        }
        if ((i3 & 2) != 0) {
            d = frostCatchDto.iceDepth;
        }
        if ((i3 & 4) != 0) {
            z = frostCatchDto.biteActive;
        }
        if ((i3 & 8) != 0) {
            str = frostCatchDto.lureStyle;
        }
        if ((i3 & 16) != 0) {
            i2 = frostCatchDto.windLevel;
        }
        if ((i3 & 32) != 0) {
            str2 = frostCatchDto.lakeMood;
        }
        return frostCatchDto.copy(i, d, z, str, i2, str2);
    }

    @SerialName("biteActive")
    public static /* synthetic */ void getBiteActive$annotations() {
    }

    @SerialName("catchCount")
    public static /* synthetic */ void getCatchCount$annotations() {
    }

    @SerialName("iceDepth")
    public static /* synthetic */ void getIceDepth$annotations() {
    }

    @SerialName("lakeMood")
    public static /* synthetic */ void getLakeMood$annotations() {
    }

    @SerialName("lureStyle")
    public static /* synthetic */ void getLureStyle$annotations() {
    }

    @SerialName("windLevel")
    public static /* synthetic */ void getWindLevel$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final int getCatchCount() {
        return this.catchCount;
    }

    /* renamed from: component2, reason: from getter */
    public final double getIceDepth() {
        return this.iceDepth;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getBiteActive() {
        return this.biteActive;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLureStyle() {
        return this.lureStyle;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWindLevel() {
        return this.windLevel;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLakeMood() {
        return this.lakeMood;
    }

    public final FrostCatchDto copy(int catchCount, double iceDepth, boolean biteActive, String lureStyle, int windLevel, String lakeMood) {
        Intrinsics.checkNotNullParameter(lureStyle, "lureStyle");
        Intrinsics.checkNotNullParameter(lakeMood, "lakeMood");
        return new FrostCatchDto(catchCount, iceDepth, biteActive, lureStyle, windLevel, lakeMood);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrostCatchDto)) {
            return false;
        }
        FrostCatchDto frostCatchDto = (FrostCatchDto) other;
        return this.catchCount == frostCatchDto.catchCount && Double.compare(this.iceDepth, frostCatchDto.iceDepth) == 0 && this.biteActive == frostCatchDto.biteActive && Intrinsics.areEqual(this.lureStyle, frostCatchDto.lureStyle) && this.windLevel == frostCatchDto.windLevel && Intrinsics.areEqual(this.lakeMood, frostCatchDto.lakeMood);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.catchCount) * 31) + Double.hashCode(this.iceDepth)) * 31) + Boolean.hashCode(this.biteActive)) * 31) + this.lureStyle.hashCode()) * 31) + Integer.hashCode(this.windLevel)) * 31) + this.lakeMood.hashCode();
    }

    public String toString() {
        return "FrostCatchDto(catchCount=" + this.catchCount + ", iceDepth=" + this.iceDepth + ", biteActive=" + this.biteActive + ", lureStyle=" + this.lureStyle + ", windLevel=" + this.windLevel + ", lakeMood=" + this.lakeMood + ")";
    }

    /* compiled from: FrostCatchDto.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/chicken/road/kedbags/data/remote/FrostCatchDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/chicken/road/kedbags/data/remote/FrostCatchDto;", "app"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FrostCatchDto> serializer() {
            return FrostCatchDto$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FrostCatchDto(int i, int i2, double d, boolean z, String str, int i3, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.catchCount = 0;
        } else {
            this.catchCount = i2;
        }
        if ((i & 2) == 0) {
            this.iceDepth = 0.0d;
        } else {
            this.iceDepth = d;
        }
        if ((i & 4) == 0) {
            this.biteActive = false;
        } else {
            this.biteActive = z;
        }
        if ((i & 8) == 0) {
            this.lureStyle = "";
        } else {
            this.lureStyle = str;
        }
        if ((i & 16) == 0) {
            this.windLevel = 0;
        } else {
            this.windLevel = i3;
        }
        if ((i & 32) == 0) {
            this.lakeMood = "";
        } else {
            this.lakeMood = str2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app(FrostCatchDto self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.catchCount != 0) {
            output.encodeIntElement(serialDesc, 0, self.catchCount);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.iceDepth, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.iceDepth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.biteActive) {
            output.encodeBooleanElement(serialDesc, 2, self.biteActive);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual(self.lureStyle, "")) {
            output.encodeStringElement(serialDesc, 3, self.lureStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.windLevel != 0) {
            output.encodeIntElement(serialDesc, 4, self.windLevel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 5) && Intrinsics.areEqual(self.lakeMood, "")) {
            return;
        }
        output.encodeStringElement(serialDesc, 5, self.lakeMood);
    }

    public FrostCatchDto(int i, double d, boolean z, String lureStyle, int i2, String lakeMood) {
        Intrinsics.checkNotNullParameter(lureStyle, "lureStyle");
        Intrinsics.checkNotNullParameter(lakeMood, "lakeMood");
        this.catchCount = i;
        this.iceDepth = d;
        this.biteActive = z;
        this.lureStyle = lureStyle;
        this.windLevel = i2;
        this.lakeMood = lakeMood;
    }

    public /* synthetic */ FrostCatchDto(int i, double d, boolean z, String str, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0.0d : d, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? "" : str2);
    }

    public final int getCatchCount() {
        return this.catchCount;
    }

    public final double getIceDepth() {
        return this.iceDepth;
    }

    public final boolean getBiteActive() {
        return this.biteActive;
    }

    public final String getLureStyle() {
        return this.lureStyle;
    }

    public final int getWindLevel() {
        return this.windLevel;
    }

    public final String getLakeMood() {
        return this.lakeMood;
    }
}
