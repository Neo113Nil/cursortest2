package com.onesignal.session.internal.influence;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n4.InterfaceC1344a;
import u1.AbstractC1477a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class InfluenceChannel {
    private static final /* synthetic */ InterfaceC1344a $ENTRIES;
    private static final /* synthetic */ InfluenceChannel[] $VALUES;
    public static final Companion Companion;
    public static final InfluenceChannel IAM = new InfluenceChannel("IAM", 0, "iam");
    public static final InfluenceChannel NOTIFICATION = new InfluenceChannel("NOTIFICATION", 1, OneSignalDbContract.NotificationTable.TABLE_NAME);
    private final String nameValue;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final InfluenceChannel fromString(String str) {
            InfluenceChannel influenceChannel;
            if (str != null) {
                InfluenceChannel[] values = InfluenceChannel.values();
                int length = values.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i2 = length - 1;
                        influenceChannel = values[length];
                        if (influenceChannel.equalsName(str)) {
                            break;
                        }
                        if (i2 < 0) {
                            break;
                        }
                        length = i2;
                    }
                }
                influenceChannel = null;
                if (influenceChannel != null) {
                    return influenceChannel;
                }
            }
            return InfluenceChannel.NOTIFICATION;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InfluenceChannel[] $values() {
        return new InfluenceChannel[]{IAM, NOTIFICATION};
    }

    static {
        InfluenceChannel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC1477a.n($values);
        Companion = new Companion(null);
    }

    private InfluenceChannel(String str, int i2, String str2) {
        this.nameValue = str2;
    }

    public static final InfluenceChannel fromString(String str) {
        return Companion.fromString(str);
    }

    public static InterfaceC1344a getEntries() {
        return $ENTRIES;
    }

    public static InfluenceChannel valueOf(String str) {
        return (InfluenceChannel) Enum.valueOf(InfluenceChannel.class, str);
    }

    public static InfluenceChannel[] values() {
        return (InfluenceChannel[]) $VALUES.clone();
    }

    public final boolean equalsName(String otherName) {
        i.e(otherName, "otherName");
        return i.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.nameValue;
    }
}
