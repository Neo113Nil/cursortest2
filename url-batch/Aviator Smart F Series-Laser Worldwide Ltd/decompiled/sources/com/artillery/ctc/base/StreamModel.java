package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class StreamModel {
    private final String audioAlbumId;
    private final String expiryTime;
    private final int offsetInMilliseconds;
    private final ProgressReportModel progressReport;
    private final String streamFormat;
    private final String token;
    private final String url;

    public StreamModel(String audioAlbumId, String expiryTime, int i8, ProgressReportModel progressReport, String streamFormat, String token, String url) {
        s.checkNotNullParameter(audioAlbumId, "audioAlbumId");
        s.checkNotNullParameter(expiryTime, "expiryTime");
        s.checkNotNullParameter(progressReport, "progressReport");
        s.checkNotNullParameter(streamFormat, "streamFormat");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(url, "url");
        this.audioAlbumId = audioAlbumId;
        this.expiryTime = expiryTime;
        this.offsetInMilliseconds = i8;
        this.progressReport = progressReport;
        this.streamFormat = streamFormat;
        this.token = token;
        this.url = url;
    }

    public static /* synthetic */ StreamModel copy$default(StreamModel streamModel, String str, String str2, int i8, ProgressReportModel progressReportModel, String str3, String str4, String str5, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = streamModel.audioAlbumId;
        }
        if ((i9 & 2) != 0) {
            str2 = streamModel.expiryTime;
        }
        String str6 = str2;
        if ((i9 & 4) != 0) {
            i8 = streamModel.offsetInMilliseconds;
        }
        int i10 = i8;
        if ((i9 & 8) != 0) {
            progressReportModel = streamModel.progressReport;
        }
        ProgressReportModel progressReportModel2 = progressReportModel;
        if ((i9 & 16) != 0) {
            str3 = streamModel.streamFormat;
        }
        String str7 = str3;
        if ((i9 & 32) != 0) {
            str4 = streamModel.token;
        }
        String str8 = str4;
        if ((i9 & 64) != 0) {
            str5 = streamModel.url;
        }
        return streamModel.copy(str, str6, i10, progressReportModel2, str7, str8, str5);
    }

    public final String component1() {
        return this.audioAlbumId;
    }

    public final String component2() {
        return this.expiryTime;
    }

    public final int component3() {
        return this.offsetInMilliseconds;
    }

    public final ProgressReportModel component4() {
        return this.progressReport;
    }

    public final String component5() {
        return this.streamFormat;
    }

    public final String component6() {
        return this.token;
    }

    public final String component7() {
        return this.url;
    }

    public final StreamModel copy(String audioAlbumId, String expiryTime, int i8, ProgressReportModel progressReport, String streamFormat, String token, String url) {
        s.checkNotNullParameter(audioAlbumId, "audioAlbumId");
        s.checkNotNullParameter(expiryTime, "expiryTime");
        s.checkNotNullParameter(progressReport, "progressReport");
        s.checkNotNullParameter(streamFormat, "streamFormat");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(url, "url");
        return new StreamModel(audioAlbumId, expiryTime, i8, progressReport, streamFormat, token, url);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamModel)) {
            return false;
        }
        StreamModel streamModel = (StreamModel) obj;
        return s.areEqual(this.audioAlbumId, streamModel.audioAlbumId) && s.areEqual(this.expiryTime, streamModel.expiryTime) && this.offsetInMilliseconds == streamModel.offsetInMilliseconds && s.areEqual(this.progressReport, streamModel.progressReport) && s.areEqual(this.streamFormat, streamModel.streamFormat) && s.areEqual(this.token, streamModel.token) && s.areEqual(this.url, streamModel.url);
    }

    public final String getAudioAlbumId() {
        return this.audioAlbumId;
    }

    public final String getExpiryTime() {
        return this.expiryTime;
    }

    public final int getOffsetInMilliseconds() {
        return this.offsetInMilliseconds;
    }

    public final ProgressReportModel getProgressReport() {
        return this.progressReport;
    }

    public final String getStreamFormat() {
        return this.streamFormat;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((((((this.audioAlbumId.hashCode() * 31) + this.expiryTime.hashCode()) * 31) + this.offsetInMilliseconds) * 31) + this.progressReport.hashCode()) * 31) + this.streamFormat.hashCode()) * 31) + this.token.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "StreamModel(audioAlbumId=" + this.audioAlbumId + ", expiryTime=" + this.expiryTime + ", offsetInMilliseconds=" + this.offsetInMilliseconds + ", progressReport=" + this.progressReport + ", streamFormat=" + this.streamFormat + ", token=" + this.token + ", url=" + this.url + ')';
    }
}
