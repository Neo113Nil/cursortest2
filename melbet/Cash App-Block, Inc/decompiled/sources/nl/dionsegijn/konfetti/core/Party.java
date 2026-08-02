package nl.dionsegijn.konfetti.core;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nl.dionsegijn.konfetti.core.Position;
import nl.dionsegijn.konfetti.core.emitter.EmitterConfig;

/* loaded from: classes9.dex */
public final class Party {
    public final List colors;
    public final EmitterConfig emitter;
    public final Position position;
    public final Rotation rotation;
    public final List shapes;
    public final List size;

    public Party(List list, List list2, List list3, Position position, Rotation rotation, EmitterConfig emitterConfig) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.size = list;
        this.colors = list2;
        this.shapes = list3;
        this.position = position;
        this.rotation = rotation;
        this.emitter = emitterConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v2, types: [nl.dionsegijn.konfetti.core.Position] */
    public static Party copy$default(Party party, List list, Position.Absolute absolute, int i) {
        party.getClass();
        party.getClass();
        party.getClass();
        party.getClass();
        party.getClass();
        List list2 = party.size;
        List list3 = party.colors;
        party.getClass();
        party.getClass();
        Position.Absolute absolute2 = absolute;
        if ((i & 1024) != 0) {
            absolute2 = party.position;
        }
        party.getClass();
        Rotation rotation = party.rotation;
        EmitterConfig emitterConfig = party.emitter;
        party.getClass();
        list2.getClass();
        list3.getClass();
        list.getClass();
        return new Party(list2, list3, list, absolute2, rotation, emitterConfig);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Party) {
            Party party = (Party) obj;
            return Float.compare(30.0f, 30.0f) == 0 && Float.compare(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE) == 0 && Float.compare(0.9f, 0.9f) == 0 && Intrinsics.areEqual(this.size, party.size) && Intrinsics.areEqual(this.colors, party.colors) && Intrinsics.areEqual(this.shapes, party.shapes) && this.position.equals(party.position) && this.rotation.equals(party.rotation) && this.emitter == party.emitter;
        }
        return false;
    }

    public final int hashCode() {
        return this.emitter.hashCode() + ((this.rotation.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (this.position.hashCode() + ((((Long.hashCode(5000L) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(CameraState$Type$EnumUnboxingLocalUtility.m(0.9f, CameraState$Type$EnumUnboxingLocalUtility.m(RecyclerView.DECELERATION_RATE, CameraState$Type$EnumUnboxingLocalUtility.m(30.0f, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(360, Integer.hashCode(359) * 31, 31), 31), 31), 31), 31, this.size), 31, this.colors), 31, this.shapes)) * 31) + 1) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("Party(angle=359, spread=360, speed=30.0, maxSpeed=0.0, damping=0.9, size=", ", colors=", ", shapes=", this.size, this.colors);
        m.append(this.shapes);
        m.append(", timeToLive=5000, fadeOutEnabled=true, position=");
        m.append(this.position);
        m.append(", delay=0, rotation=");
        m.append(this.rotation);
        m.append(", emitter=");
        m.append(this.emitter);
        m.append(")");
        return m.toString();
    }
}
