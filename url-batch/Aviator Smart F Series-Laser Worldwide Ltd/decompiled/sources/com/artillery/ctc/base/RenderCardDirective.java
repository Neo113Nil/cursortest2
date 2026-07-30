package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class RenderCardDirective {
    private final RenderCardData data;
    private final int ended;
    private final String qid;
    private final String ttsLocalFilePath;
    private final String type;

    public RenderCardDirective(String type, String qid, int i8, RenderCardData data, String ttsLocalFilePath) {
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(data, "data");
        s.checkNotNullParameter(ttsLocalFilePath, "ttsLocalFilePath");
        this.type = type;
        this.qid = qid;
        this.ended = i8;
        this.data = data;
        this.ttsLocalFilePath = ttsLocalFilePath;
    }

    public static /* synthetic */ RenderCardDirective copy$default(RenderCardDirective renderCardDirective, String str, String str2, int i8, RenderCardData renderCardData, String str3, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = renderCardDirective.type;
        }
        if ((i9 & 2) != 0) {
            str2 = renderCardDirective.qid;
        }
        String str4 = str2;
        if ((i9 & 4) != 0) {
            i8 = renderCardDirective.ended;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            renderCardData = renderCardDirective.data;
        }
        RenderCardData renderCardData2 = renderCardData;
        if ((i9 & 16) != 0) {
            str3 = renderCardDirective.ttsLocalFilePath;
        }
        return renderCardDirective.copy(str, str4, i10, renderCardData2, str3);
    }

    public final String component1() {
        return this.type;
    }

    public final String component2() {
        return this.qid;
    }

    public final int component3() {
        return this.ended;
    }

    public final RenderCardData component4() {
        return this.data;
    }

    public final String component5() {
        return this.ttsLocalFilePath;
    }

    public final RenderCardDirective copy(String type, String qid, int i8, RenderCardData data, String ttsLocalFilePath) {
        s.checkNotNullParameter(type, "type");
        s.checkNotNullParameter(qid, "qid");
        s.checkNotNullParameter(data, "data");
        s.checkNotNullParameter(ttsLocalFilePath, "ttsLocalFilePath");
        return new RenderCardDirective(type, qid, i8, data, ttsLocalFilePath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RenderCardDirective)) {
            return false;
        }
        RenderCardDirective renderCardDirective = (RenderCardDirective) obj;
        return s.areEqual(this.type, renderCardDirective.type) && s.areEqual(this.qid, renderCardDirective.qid) && this.ended == renderCardDirective.ended && s.areEqual(this.data, renderCardDirective.data) && s.areEqual(this.ttsLocalFilePath, renderCardDirective.ttsLocalFilePath);
    }

    public final RenderCardData getData() {
        return this.data;
    }

    public final int getEnded() {
        return this.ended;
    }

    public final String getQid() {
        return this.qid;
    }

    public final String getTtsLocalFilePath() {
        return this.ttsLocalFilePath;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((this.type.hashCode() * 31) + this.qid.hashCode()) * 31) + this.ended) * 31) + this.data.hashCode()) * 31) + this.ttsLocalFilePath.hashCode();
    }

    public String toString() {
        return "RenderCardDirective(type=" + this.type + ", qid=" + this.qid + ", ended=" + this.ended + ", data=" + this.data + ", ttsLocalFilePath=" + this.ttsLocalFilePath + ')';
    }

    public /* synthetic */ RenderCardDirective(String str, String str2, int i8, RenderCardData renderCardData, String str3, int i9, o oVar) {
        this(str, str2, i8, renderCardData, (i9 & 16) != 0 ? "" : str3);
    }
}
