package com.facebook.yoga;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: YogaDirection.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0002\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/facebook/yoga/YogaDirection;", "", "intValue", "", "<init>", "(Ljava/lang/String;II)V", "getIntValue", "()I", "INHERIT", "LTR", "RTL", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YogaDirection {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ YogaDirection[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final YogaDirection INHERIT = new YogaDirection("INHERIT", 0, 0);
    public static final YogaDirection LTR = new YogaDirection("LTR", 1, 1);
    public static final YogaDirection RTL = new YogaDirection("RTL", 2, 2);
    private final int intValue;

    private static final /* synthetic */ YogaDirection[] $values() {
        return new YogaDirection[]{INHERIT, LTR, RTL};
    }

    @JvmStatic
    public static final YogaDirection fromInt(int i) {
        return INSTANCE.fromInt(i);
    }

    public static EnumEntries<YogaDirection> getEntries() {
        return $ENTRIES;
    }

    private YogaDirection(String str, int i, int i2) {
        this.intValue = i2;
    }

    public final int getIntValue() {
        return this.intValue;
    }

    static {
        YogaDirection[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public final int intValue() {
        return this.intValue;
    }

    /* compiled from: YogaDirection.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/yoga/YogaDirection$Companion;", "", "<init>", "()V", "fromInt", "Lcom/facebook/yoga/YogaDirection;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final YogaDirection fromInt(int value) {
            if (value == 0) {
                return YogaDirection.INHERIT;
            }
            if (value == 1) {
                return YogaDirection.LTR;
            }
            if (value == 2) {
                return YogaDirection.RTL;
            }
            throw new IllegalArgumentException("Unknown enum value: " + value);
        }
    }

    public static YogaDirection valueOf(String str) {
        return (YogaDirection) Enum.valueOf(YogaDirection.class, str);
    }

    public static YogaDirection[] values() {
        return (YogaDirection[]) $VALUES.clone();
    }
}
