package com.withpersona.sdk2.camera;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class RecordingHelper$RecordingState {
    public static final /* synthetic */ RecordingHelper$RecordingState[] $VALUES;
    public static final RecordingHelper$RecordingState Finalized;
    public static final RecordingHelper$RecordingState NotStarted;
    public static final RecordingHelper$RecordingState Started;

    static {
        RecordingHelper$RecordingState recordingHelper$RecordingState = new RecordingHelper$RecordingState("NotStarted", 0);
        NotStarted = recordingHelper$RecordingState;
        RecordingHelper$RecordingState recordingHelper$RecordingState2 = new RecordingHelper$RecordingState("Started", 1);
        Started = recordingHelper$RecordingState2;
        RecordingHelper$RecordingState recordingHelper$RecordingState3 = new RecordingHelper$RecordingState("Finalized", 2);
        Finalized = recordingHelper$RecordingState3;
        $VALUES = new RecordingHelper$RecordingState[]{recordingHelper$RecordingState, recordingHelper$RecordingState2, recordingHelper$RecordingState3};
    }

    public static RecordingHelper$RecordingState valueOf(String str) {
        return (RecordingHelper$RecordingState) Enum.valueOf(RecordingHelper$RecordingState.class, str);
    }

    public static RecordingHelper$RecordingState[] values() {
        return (RecordingHelper$RecordingState[]) $VALUES.clone();
    }
}
