package com.squareup.protos.franklin.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2AdyenEnvironment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TEST", "EUROPE", "UNITED_STATES", "AUSTRALIA", "LIVE", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThreeDomainSecureV2AdyenEnvironment implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ThreeDomainSecureV2AdyenEnvironment[] $VALUES;
    public static final ProtoAdapter ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final ThreeDomainSecureV2AdyenEnvironment TEST = new ThreeDomainSecureV2AdyenEnvironment("TEST", 0, 1);
    public static final ThreeDomainSecureV2AdyenEnvironment EUROPE = new ThreeDomainSecureV2AdyenEnvironment("EUROPE", 1, 2);
    public static final ThreeDomainSecureV2AdyenEnvironment UNITED_STATES = new ThreeDomainSecureV2AdyenEnvironment("UNITED_STATES", 2, 3);
    public static final ThreeDomainSecureV2AdyenEnvironment AUSTRALIA = new ThreeDomainSecureV2AdyenEnvironment("AUSTRALIA", 3, 4);

    @Deprecated
    public static final ThreeDomainSecureV2AdyenEnvironment LIVE = new ThreeDomainSecureV2AdyenEnvironment("LIVE", 4, 5);

    private static final /* synthetic */ ThreeDomainSecureV2AdyenEnvironment[] $values() {
        return new ThreeDomainSecureV2AdyenEnvironment[]{TEST, EUROPE, UNITED_STATES, AUSTRALIA, LIVE};
    }

    static {
        ThreeDomainSecureV2AdyenEnvironment[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(ThreeDomainSecureV2AdyenEnvironment.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax) { // from class: com.squareup.protos.franklin.api.ThreeDomainSecureV2AdyenEnvironment$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public ThreeDomainSecureV2AdyenEnvironment fromValue(int value) {
                return ThreeDomainSecureV2AdyenEnvironment.INSTANCE.fromValue(value);
            }
        };
    }

    private ThreeDomainSecureV2AdyenEnvironment(String str, int i, int i2) {
        this.value = i2;
    }

    public static final ThreeDomainSecureV2AdyenEnvironment fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static ThreeDomainSecureV2AdyenEnvironment valueOf(String str) {
        return (ThreeDomainSecureV2AdyenEnvironment) Enum.valueOf(ThreeDomainSecureV2AdyenEnvironment.class, str);
    }

    public static ThreeDomainSecureV2AdyenEnvironment[] values() {
        return (ThreeDomainSecureV2AdyenEnvironment[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2AdyenEnvironment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/franklin/api/ThreeDomainSecureV2AdyenEnvironment;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ThreeDomainSecureV2AdyenEnvironment fromValue(int value) {
            if (value == 1) {
                return ThreeDomainSecureV2AdyenEnvironment.TEST;
            }
            if (value == 2) {
                return ThreeDomainSecureV2AdyenEnvironment.EUROPE;
            }
            if (value == 3) {
                return ThreeDomainSecureV2AdyenEnvironment.UNITED_STATES;
            }
            if (value == 4) {
                return ThreeDomainSecureV2AdyenEnvironment.AUSTRALIA;
            }
            if (value != 5) {
                return null;
            }
            return ThreeDomainSecureV2AdyenEnvironment.LIVE;
        }

        private Companion() {
        }
    }
}
