package com.jieli.jl_audio_decode.opus.model;

/* loaded from: classes4.dex */
public class OpusOption {
    private boolean hasHead;
    private int channel = 1;
    private int sampleRate = 16000;
    private int packetSize = 40;

    public int getChannel() {
        return this.channel;
    }

    public int getPacketSize() {
        return this.packetSize;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public boolean isHasHead() {
        return this.hasHead;
    }

    public OpusOption setChannel(int i8) {
        if (i8 == 1 || i8 == 2) {
            this.channel = i8;
        }
        return this;
    }

    public OpusOption setHasHead(boolean z7) {
        this.hasHead = z7;
        return this;
    }

    public OpusOption setPacketSize(int i8) {
        if (i8 >= 0) {
            this.packetSize = i8;
        }
        return this;
    }

    public OpusOption setSampleRate(int i8) {
        if (i8 == 8000 || i8 == 12000 || i8 == 16000 || i8 == 24000 || i8 == 48000) {
            this.sampleRate = i8;
        }
        return this;
    }

    public String toString() {
        return "OpusOption{hasHead=" + this.hasHead + ", channel=" + this.channel + ", sampleRate=" + this.sampleRate + ", packetSize=" + this.packetSize + '}';
    }
}
