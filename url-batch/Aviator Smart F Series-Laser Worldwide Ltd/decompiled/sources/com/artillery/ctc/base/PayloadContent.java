package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class PayloadContent {
    private final AudioItemModel audioItem;
    private final String content;
    private final ImageInfo image;
    private final LinkInfo link;
    private final String title;
    private final String token;
    private final String type;

    public PayloadContent(String str, ImageInfo image, LinkInfo link, String title, String token, String type, AudioItemModel audioItemModel) {
        s.checkNotNullParameter(image, "image");
        s.checkNotNullParameter(link, "link");
        s.checkNotNullParameter(title, "title");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(type, "type");
        this.content = str;
        this.image = image;
        this.link = link;
        this.title = title;
        this.token = token;
        this.type = type;
        this.audioItem = audioItemModel;
    }

    public static /* synthetic */ PayloadContent copy$default(PayloadContent payloadContent, String str, ImageInfo imageInfo, LinkInfo linkInfo, String str2, String str3, String str4, AudioItemModel audioItemModel, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = payloadContent.content;
        }
        if ((i8 & 2) != 0) {
            imageInfo = payloadContent.image;
        }
        ImageInfo imageInfo2 = imageInfo;
        if ((i8 & 4) != 0) {
            linkInfo = payloadContent.link;
        }
        LinkInfo linkInfo2 = linkInfo;
        if ((i8 & 8) != 0) {
            str2 = payloadContent.title;
        }
        String str5 = str2;
        if ((i8 & 16) != 0) {
            str3 = payloadContent.token;
        }
        String str6 = str3;
        if ((i8 & 32) != 0) {
            str4 = payloadContent.type;
        }
        String str7 = str4;
        if ((i8 & 64) != 0) {
            audioItemModel = payloadContent.audioItem;
        }
        return payloadContent.copy(str, imageInfo2, linkInfo2, str5, str6, str7, audioItemModel);
    }

    public final String component1() {
        return this.content;
    }

    public final ImageInfo component2() {
        return this.image;
    }

    public final LinkInfo component3() {
        return this.link;
    }

    public final String component4() {
        return this.title;
    }

    public final String component5() {
        return this.token;
    }

    public final String component6() {
        return this.type;
    }

    public final AudioItemModel component7() {
        return this.audioItem;
    }

    public final PayloadContent copy(String str, ImageInfo image, LinkInfo link, String title, String token, String type, AudioItemModel audioItemModel) {
        s.checkNotNullParameter(image, "image");
        s.checkNotNullParameter(link, "link");
        s.checkNotNullParameter(title, "title");
        s.checkNotNullParameter(token, "token");
        s.checkNotNullParameter(type, "type");
        return new PayloadContent(str, image, link, title, token, type, audioItemModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayloadContent)) {
            return false;
        }
        PayloadContent payloadContent = (PayloadContent) obj;
        return s.areEqual(this.content, payloadContent.content) && s.areEqual(this.image, payloadContent.image) && s.areEqual(this.link, payloadContent.link) && s.areEqual(this.title, payloadContent.title) && s.areEqual(this.token, payloadContent.token) && s.areEqual(this.type, payloadContent.type) && s.areEqual(this.audioItem, payloadContent.audioItem);
    }

    public final AudioItemModel getAudioItem() {
        return this.audioItem;
    }

    public final String getContent() {
        return this.content;
    }

    public final ImageInfo getImage() {
        return this.image;
    }

    public final LinkInfo getLink() {
        return this.link;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (((((((((((str == null ? 0 : str.hashCode()) * 31) + this.image.hashCode()) * 31) + this.link.hashCode()) * 31) + this.title.hashCode()) * 31) + this.token.hashCode()) * 31) + this.type.hashCode()) * 31;
        AudioItemModel audioItemModel = this.audioItem;
        return hashCode + (audioItemModel != null ? audioItemModel.hashCode() : 0);
    }

    public String toString() {
        return "PayloadContent(content=" + this.content + ", image=" + this.image + ", link=" + this.link + ", title=" + this.title + ", token=" + this.token + ", type=" + this.type + ", audioItem=" + this.audioItem + ')';
    }
}
