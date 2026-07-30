package com.crrepa.band.my.device.ai.asr.model;

/* loaded from: classes2.dex */
public class AsrRecordStatusEvent {
    public static final int RECORD_CANCEL = 2;
    public static final int RECORD_COMPLETE = 1;
    public static final int RECORD_START = 0;
    public static final int TYPE_CHAT = 1;
    public static final int TYPE_FETCH = 3;
    public static final int TYPE_MAP = 2;
    public static final int TYPE_WATCH_FACE = 0;
    private final int aiType;
    private final int recordStatus;

    public AsrRecordStatusEvent(int i8, int i9) {
        this.aiType = i8;
        this.recordStatus = i9;
    }

    public int getAiType() {
        return this.aiType;
    }

    public int getRecordStatus() {
        return this.recordStatus;
    }
}
