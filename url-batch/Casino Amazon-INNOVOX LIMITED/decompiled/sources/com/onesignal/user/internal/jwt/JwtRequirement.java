package com.onesignal.user.internal.jwt;

import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JwtRequirement.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lcom/onesignal/user/internal/jwt/JwtRequirement;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "NOT_REQUIRED", "REQUIRED", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class JwtRequirement {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ JwtRequirement[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final JwtRequirement UNKNOWN = new JwtRequirement("UNKNOWN", 0);
    public static final JwtRequirement NOT_REQUIRED = new JwtRequirement("NOT_REQUIRED", 1);
    public static final JwtRequirement REQUIRED = new JwtRequirement("REQUIRED", 2);

    private static final /* synthetic */ JwtRequirement[] $values() {
        return new JwtRequirement[]{UNKNOWN, NOT_REQUIRED, REQUIRED};
    }

    public static EnumEntries<JwtRequirement> getEntries() {
        return $ENTRIES;
    }

    public static JwtRequirement valueOf(String str) {
        return (JwtRequirement) Enum.valueOf(JwtRequirement.class, str);
    }

    public static JwtRequirement[] values() {
        return (JwtRequirement[]) $VALUES.clone();
    }

    private JwtRequirement(String str, int i) {
    }

    static {
        JwtRequirement[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: JwtRequirement.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/onesignal/user/internal/jwt/JwtRequirement$Companion;", "", "()V", "fromBoolean", "Lcom/onesignal/user/internal/jwt/JwtRequirement;", "value", "", "(Ljava/lang/Boolean;)Lcom/onesignal/user/internal/jwt/JwtRequirement;", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final JwtRequirement fromBoolean(Boolean value) {
            if (value == null) {
                return JwtRequirement.UNKNOWN;
            }
            if (Intrinsics.areEqual((Object) value, (Object) false)) {
                return JwtRequirement.NOT_REQUIRED;
            }
            if (Intrinsics.areEqual((Object) value, (Object) true)) {
                return JwtRequirement.REQUIRED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
