package com.artillery.ctc.base;

import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class RenderCardData {
    private final List<DcsItem> dcs;
    private final TtsData tts;

    public RenderCardData(List<DcsItem> dcs, TtsData tts) {
        s.checkNotNullParameter(dcs, "dcs");
        s.checkNotNullParameter(tts, "tts");
        this.dcs = dcs;
        this.tts = tts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RenderCardData copy$default(RenderCardData renderCardData, List list, TtsData ttsData, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            list = renderCardData.dcs;
        }
        if ((i8 & 2) != 0) {
            ttsData = renderCardData.tts;
        }
        return renderCardData.copy(list, ttsData);
    }

    public final List<DcsItem> component1() {
        return this.dcs;
    }

    public final TtsData component2() {
        return this.tts;
    }

    public final RenderCardData copy(List<DcsItem> dcs, TtsData tts) {
        s.checkNotNullParameter(dcs, "dcs");
        s.checkNotNullParameter(tts, "tts");
        return new RenderCardData(dcs, tts);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderCardData)) {
            return false;
        }
        RenderCardData renderCardData = (RenderCardData) obj;
        return s.areEqual(this.dcs, renderCardData.dcs) && s.areEqual(this.tts, renderCardData.tts);
    }

    public final List<DcsItem> getDcs() {
        return this.dcs;
    }

    public final TtsData getTts() {
        return this.tts;
    }

    public int hashCode() {
        return (this.dcs.hashCode() * 31) + this.tts.hashCode();
    }

    public String toString() {
        return "RenderCardData(dcs=" + this.dcs + ", tts=" + this.tts + ')';
    }
}
