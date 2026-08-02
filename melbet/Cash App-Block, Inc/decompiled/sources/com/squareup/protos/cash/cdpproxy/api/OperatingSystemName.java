package com.squareup.protos.cash.cdpproxy.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/OperatingSystemName;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "IOS", "ANDROID", "WEB", "WINDOWS", "MAC_OS", "LINUX", "IOS_WEB", "ANDROID_WEB", "Companion", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes.dex */
public final class OperatingSystemName implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OperatingSystemName[] $VALUES;
    public static final ProtoAdapter ADAPTER;
    public static final OperatingSystemName ANDROID;
    public static final OperatingSystemName ANDROID_WEB;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OperatingSystemName IOS;
    public static final OperatingSystemName IOS_WEB;
    public static final OperatingSystemName LINUX;
    public static final OperatingSystemName MAC_OS;
    public static final OperatingSystemName WEB;
    public static final OperatingSystemName WINDOWS;
    private final int value;

    private static final /* synthetic */ OperatingSystemName[] $values() {
        return new OperatingSystemName[]{IOS, ANDROID, WEB, WINDOWS, MAC_OS, LINUX, IOS_WEB, ANDROID_WEB};
    }

    static {
        final OperatingSystemName operatingSystemName = new OperatingSystemName("IOS", 0, 0);
        IOS = operatingSystemName;
        ANDROID = new OperatingSystemName("ANDROID", 1, 1);
        WEB = new OperatingSystemName("WEB", 2, 2);
        WINDOWS = new OperatingSystemName("WINDOWS", 3, 3);
        MAC_OS = new OperatingSystemName("MAC_OS", 4, 4);
        LINUX = new OperatingSystemName("LINUX", 5, 5);
        IOS_WEB = new OperatingSystemName("IOS_WEB", 6, 6);
        ANDROID_WEB = new OperatingSystemName("ANDROID_WEB", 7, 7);
        OperatingSystemName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.factory.getOrCreateKotlinClass(OperatingSystemName.class);
        final Syntax syntax = Syntax.PROTO_2;
        ADAPTER = new EnumAdapter(orCreateKotlinClass, syntax, operatingSystemName) { // from class: com.squareup.protos.cash.cdpproxy.api.OperatingSystemName$Companion$ADAPTER$1
            @Override // com.squareup.wire.EnumAdapter
            public OperatingSystemName fromValue(int value) {
                return OperatingSystemName.INSTANCE.fromValue(value);
            }
        };
    }

    private OperatingSystemName(String str, int i, int i2) {
        this.value = i2;
    }

    public static final OperatingSystemName fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static OperatingSystemName valueOf(String str) {
        return (OperatingSystemName) Enum.valueOf(OperatingSystemName.class, str);
    }

    public static OperatingSystemName[] values() {
        return (OperatingSystemName[]) $VALUES.clone();
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/squareup/protos/cash/cdpproxy/api/OperatingSystemName$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/squareup/protos/cash/cdpproxy/api/OperatingSystemName;", "fromValue", "value", "", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OperatingSystemName fromValue(int value) {
            switch (value) {
                case 0:
                    return OperatingSystemName.IOS;
                case 1:
                    return OperatingSystemName.ANDROID;
                case 2:
                    return OperatingSystemName.WEB;
                case 3:
                    return OperatingSystemName.WINDOWS;
                case 4:
                    return OperatingSystemName.MAC_OS;
                case 5:
                    return OperatingSystemName.LINUX;
                case 6:
                    return OperatingSystemName.IOS_WEB;
                case 7:
                    return OperatingSystemName.ANDROID_WEB;
                default:
                    return null;
            }
        }

        private Companion() {
        }
    }
}
