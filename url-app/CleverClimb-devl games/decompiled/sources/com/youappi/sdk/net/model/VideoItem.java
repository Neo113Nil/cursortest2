package com.youappi.sdk.net.model;

import com.google.gson.a.c;
import com.mopub.common.FullAdType;
import com.youappi.sdk.AdType;
import com.youappi.sdk.net.model.Vast;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class VideoItem extends AdItem {

    @c(a = "cardConfig")
    private CardConfig _cardConfig;

    @c(a = "videoConfig")
    private VideoConfig _videoConfig;

    public static class VideoConfig implements Serializable {
        static final String MUTE = "Mute";

        @c(a = "duration")
        private Integer _duration;

        @c(a = "eventUrls")
        private EventUrls _events;

        @c(a = "skipOffset")
        private Integer _skipOffset;

        @c(a = FullAdType.VAST)
        private String _vastRaw;

        @c(a = "videoUrl")
        private String _videoUrl;

        @c(a = "volumeMode")
        private String _volumeMode;

        public int getDuration() {
            if (this._duration != null) {
                return this._duration.intValue();
            }
            return -1;
        }

        public EventUrls getEvents() {
            return this._events;
        }

        public Integer getSkipOffset() {
            return Integer.valueOf(this._skipOffset != null ? this._skipOffset.intValue() : -1);
        }

        public String getVastRawString() {
            return this._vastRaw;
        }

        public String getVideoUrl() {
            return this._videoUrl;
        }

        public boolean isMute() {
            return MUTE.equalsIgnoreCase(this._volumeMode);
        }

        void mergeEvents(EventUrls eventUrls) {
            if (this._events == null) {
                this._events = new EventUrls();
            }
            for (String str : eventUrls.keySet()) {
                if (this._events.get(str) == null) {
                    this._events.put(str, eventUrls.get(str));
                } else {
                    this._events.get(str).addAll(eventUrls.get(str));
                }
            }
        }

        public void setDuration(Integer num) {
            this._duration = num;
        }

        public void setVastRawString(String str) {
            this._vastRaw = str;
        }
    }

    @Override // com.youappi.sdk.net.model.AdItem
    public AdType getAdType() {
        return AdType.VIDEO;
    }

    @Override // com.youappi.sdk.net.model.AdItem
    public CardConfig getCardConfig() {
        return this._cardConfig;
    }

    @Override // com.youappi.sdk.net.model.AdItem
    public EventUrls getEventUrls() {
        return this._videoConfig.getEvents();
    }

    public VideoConfig getVideoConfig() {
        return this._videoConfig;
    }

    public boolean isComplete() {
        return this._videoConfig._videoUrl != null;
    }

    public void mergeVast(Vast.Inline inline, String str) {
        this._videoConfig._duration = Integer.valueOf(inline.getDuration());
        this._videoConfig._videoUrl = str;
        this._videoConfig.mergeEvents(inline.getEventUrls());
        getPromotedItem().setClickThroughUrl(inline.getClickThroughUrl());
    }

    public void setVideoConfig(VideoConfig videoConfig) {
        this._videoConfig = videoConfig;
    }
}
