package io.flutter.plugins.videoplayer;

import O3.d;
import i3.InterfaceC0459a;
import kotlin.jvm.internal.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformVideoFormat {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformVideoFormat[] $VALUES;
    public static final Companion Companion;
    public static final PlatformVideoFormat DASH = new PlatformVideoFormat("DASH", 0, 0);
    public static final PlatformVideoFormat HLS = new PlatformVideoFormat("HLS", 1, 1);
    public static final PlatformVideoFormat SS = new PlatformVideoFormat("SS", 2, 2);
    private final int raw;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlatformVideoFormat ofRaw(int i4) {
            for (PlatformVideoFormat platformVideoFormat : PlatformVideoFormat.values()) {
                if (platformVideoFormat.getRaw() == i4) {
                    return platformVideoFormat;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformVideoFormat[] $values() {
        return new PlatformVideoFormat[]{DASH, HLS, SS};
    }

    static {
        PlatformVideoFormat[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d.m($values);
        Companion = new Companion(null);
    }

    private PlatformVideoFormat(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformVideoFormat valueOf(String str) {
        return (PlatformVideoFormat) Enum.valueOf(PlatformVideoFormat.class, str);
    }

    public static PlatformVideoFormat[] values() {
        return (PlatformVideoFormat[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
