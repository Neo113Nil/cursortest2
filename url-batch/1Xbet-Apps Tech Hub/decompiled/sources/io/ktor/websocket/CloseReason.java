package io.ktor.websocket;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.ktor.util.InternalAPI;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: CloseReason.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00072\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lio/ktor/websocket/CloseReason;", "", "code", "Lio/ktor/websocket/CloseReason$Codes;", PglCryptUtils.KEY_MESSAGE, "", "(Lio/ktor/websocket/CloseReason$Codes;Ljava/lang/String;)V", "", "(SLjava/lang/String;)V", "getCode", "()S", "knownReason", "getKnownReason", "()Lio/ktor/websocket/CloseReason$Codes;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Codes", "ktor-websockets"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CloseReason {
    private final short code;
    private final String message;

    public static /* synthetic */ CloseReason copy$default(CloseReason closeReason, short s, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            s = closeReason.code;
        }
        if ((i & 2) != 0) {
            str = closeReason.message;
        }
        return closeReason.copy(s, str);
    }

    /* renamed from: component1, reason: from getter */
    public final short getCode() {
        return this.code;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final CloseReason copy(short code, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new CloseReason(code, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CloseReason)) {
            return false;
        }
        CloseReason closeReason = (CloseReason) other;
        return this.code == closeReason.code && Intrinsics.areEqual(this.message, closeReason.message);
    }

    public int hashCode() {
        return (Short.hashCode(this.code) * 31) + this.message.hashCode();
    }

    public CloseReason(short s, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.code = s;
        this.message = message;
    }

    public final short getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CloseReason(Codes code, String message) {
        this(code.getCode(), message);
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    public final Codes getKnownReason() {
        return Codes.INSTANCE.byCode(this.code);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CloseReason(reason=");
        Object knownReason = getKnownReason();
        if (knownReason == null) {
            knownReason = Short.valueOf(this.code);
        }
        return sb.append(knownReason).append(", message=").append(this.message).append(')').toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CloseReason.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\n\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes;", "", "code", "", "(Ljava/lang/String;IS)V", "getCode", "()S", "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER", "Companion", "ktor-websockets"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Codes {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Codes[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Codes UNEXPECTED_CONDITION;
        private static final Map<Short, Codes> byCodeMap;
        private final short code;
        public static final Codes NORMAL = new Codes("NORMAL", 0, 1000);
        public static final Codes GOING_AWAY = new Codes("GOING_AWAY", 1, 1001);
        public static final Codes PROTOCOL_ERROR = new Codes("PROTOCOL_ERROR", 2, 1002);
        public static final Codes CANNOT_ACCEPT = new Codes("CANNOT_ACCEPT", 3, 1003);

        @Deprecated(message = "This code MUST NOT be set as a status code in a Close control frame by an endpoint")
        @InternalAPI
        public static final Codes CLOSED_ABNORMALLY = new Codes("CLOSED_ABNORMALLY", 4, 1006);
        public static final Codes NOT_CONSISTENT = new Codes("NOT_CONSISTENT", 5, 1007);
        public static final Codes VIOLATED_POLICY = new Codes("VIOLATED_POLICY", 6, 1008);
        public static final Codes TOO_BIG = new Codes("TOO_BIG", 7, 1009);
        public static final Codes NO_EXTENSION = new Codes("NO_EXTENSION", 8, 1010);
        public static final Codes INTERNAL_ERROR = new Codes("INTERNAL_ERROR", 9, 1011);
        public static final Codes SERVICE_RESTART = new Codes("SERVICE_RESTART", 10, 1012);
        public static final Codes TRY_AGAIN_LATER = new Codes("TRY_AGAIN_LATER", 11, 1013);

        private static final /* synthetic */ Codes[] $values() {
            return new Codes[]{NORMAL, GOING_AWAY, PROTOCOL_ERROR, CANNOT_ACCEPT, CLOSED_ABNORMALLY, NOT_CONSISTENT, VIOLATED_POLICY, TOO_BIG, NO_EXTENSION, INTERNAL_ERROR, SERVICE_RESTART, TRY_AGAIN_LATER};
        }

        public static EnumEntries<Codes> getEntries() {
            return $ENTRIES;
        }

        public static Codes valueOf(String str) {
            return (Codes) Enum.valueOf(Codes.class, str);
        }

        public static Codes[] values() {
            return (Codes[]) $VALUES.clone();
        }

        private Codes(String str, int i, short s) {
            this.code = s;
        }

        public final short getCode() {
            return this.code;
        }

        static {
            Codes[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
            Codes[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(values.length), 16));
            for (Codes codes : values) {
                linkedHashMap.put(Short.valueOf(codes.code), codes);
            }
            byCodeMap = linkedHashMap;
            UNEXPECTED_CONDITION = INTERNAL_ERROR;
        }

        /* compiled from: CloseReason.kt */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\n\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lio/ktor/websocket/CloseReason$Codes$Companion;", "", "()V", "UNEXPECTED_CONDITION", "Lio/ktor/websocket/CloseReason$Codes;", "getUNEXPECTED_CONDITION$annotations", "byCodeMap", "", "", "byCode", "code", "ktor-websockets"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Deprecated(message = "Use INTERNAL_ERROR instead.", replaceWith = @ReplaceWith(expression = "INTERNAL_ERROR", imports = {"io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR"}))
            public static /* synthetic */ void getUNEXPECTED_CONDITION$annotations() {
            }

            private Companion() {
            }

            public final Codes byCode(short code) {
                return (Codes) Codes.byCodeMap.get(Short.valueOf(code));
            }
        }
    }
}
