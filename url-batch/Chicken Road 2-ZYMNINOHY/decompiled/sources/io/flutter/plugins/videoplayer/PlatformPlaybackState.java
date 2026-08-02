package io.flutter.plugins.videoplayer;

import O3.d;
import i3.InterfaceC0459a;
import kotlin.jvm.internal.e;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class PlatformPlaybackState {
    private static final /* synthetic */ InterfaceC0459a $ENTRIES;
    private static final /* synthetic */ PlatformPlaybackState[] $VALUES;
    public static final Companion Companion;
    private final int raw;
    public static final PlatformPlaybackState IDLE = new PlatformPlaybackState("IDLE", 0, 0);
    public static final PlatformPlaybackState BUFFERING = new PlatformPlaybackState("BUFFERING", 1, 1);
    public static final PlatformPlaybackState READY = new PlatformPlaybackState("READY", 2, 2);
    public static final PlatformPlaybackState ENDED = new PlatformPlaybackState("ENDED", 3, 3);
    public static final PlatformPlaybackState UNKNOWN = new PlatformPlaybackState("UNKNOWN", 4, 4);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PlatformPlaybackState ofRaw(int i4) {
            for (PlatformPlaybackState platformPlaybackState : PlatformPlaybackState.values()) {
                if (platformPlaybackState.getRaw() == i4) {
                    return platformPlaybackState;
                }
            }
            return null;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ PlatformPlaybackState[] $values() {
        return new PlatformPlaybackState[]{IDLE, BUFFERING, READY, ENDED, UNKNOWN};
    }

    static {
        PlatformPlaybackState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = d.m($values);
        Companion = new Companion(null);
    }

    private PlatformPlaybackState(String str, int i4, int i5) {
        this.raw = i5;
    }

    public static InterfaceC0459a getEntries() {
        return $ENTRIES;
    }

    public static PlatformPlaybackState valueOf(String str) {
        return (PlatformPlaybackState) Enum.valueOf(PlatformPlaybackState.class, str);
    }

    public static PlatformPlaybackState[] values() {
        return (PlatformPlaybackState[]) $VALUES.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
