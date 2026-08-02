package io.flutter.plugins.videoplayer;

import a.AbstractC0124a;
import java.util.List;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import x.AbstractC1514c;

/* loaded from: classes.dex */
public final class AudioTrackChangedEvent extends PlatformVideoEvent {
    public static final Companion Companion = new Companion(null);
    private final String selectedTrackId;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final AudioTrackChangedEvent fromList(List<? extends Object> pigeonVar_list) {
            i.e(pigeonVar_list, "pigeonVar_list");
            return new AudioTrackChangedEvent((String) pigeonVar_list.get(0));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AudioTrackChangedEvent() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AudioTrackChangedEvent copy$default(AudioTrackChangedEvent audioTrackChangedEvent, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = audioTrackChangedEvent.selectedTrackId;
        }
        return audioTrackChangedEvent.copy(str);
    }

    public final String component1() {
        return this.selectedTrackId;
    }

    public final AudioTrackChangedEvent copy(String str) {
        return new AudioTrackChangedEvent(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioTrackChangedEvent)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return MessagesPigeonUtils.INSTANCE.deepEquals(toList(), ((AudioTrackChangedEvent) obj).toList());
    }

    public final String getSelectedTrackId() {
        return this.selectedTrackId;
    }

    public int hashCode() {
        return toList().hashCode();
    }

    public final List<Object> toList() {
        return AbstractC0124a.H(this.selectedTrackId);
    }

    public String toString() {
        return AbstractC1514c.a("AudioTrackChangedEvent(selectedTrackId=", this.selectedTrackId, ")");
    }

    public AudioTrackChangedEvent(String str) {
        super(null);
        this.selectedTrackId = str;
    }

    public /* synthetic */ AudioTrackChangedEvent(String str, int i4, e eVar) {
        this((i4 & 1) != 0 ? null : str);
    }
}
