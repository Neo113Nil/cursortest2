package com.facebook.gamingservices.model;

import android.graphics.Bitmap;
import android.util.Base64;
import com.facebook.gamingservices.GamingContext;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.share.internal.ShareConstants;
import defpackage.lh;
import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class CustomUpdateContent {
    private final String contextTokenId;
    private final CustomUpdateLocalizedText cta;
    private final String data;
    private final String image;
    private final CustomUpdateMedia media;
    private final CustomUpdateLocalizedText text;

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customUpdateLocalizedText, (i & 4) != 0 ? null : customUpdateLocalizedText2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : customUpdateMedia, (i & 32) != 0 ? null : str3);
    }

    public final String getContextTokenId() {
        return this.contextTokenId;
    }

    public final CustomUpdateLocalizedText getCta() {
        return this.cta;
    }

    public final String getData() {
        return this.data;
    }

    public final String getImage() {
        return this.image;
    }

    public final CustomUpdateMedia getMedia() {
        return this.media;
    }

    public final CustomUpdateLocalizedText getText() {
        return this.text;
    }

    public final JSONObject toGraphRequestContent() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("context_token_id", this.contextTokenId);
        jSONObject.put("text", this.text.toJSONObject().toString());
        CustomUpdateLocalizedText customUpdateLocalizedText = this.cta;
        if (customUpdateLocalizedText != null) {
            jSONObject.put(SDKConstants.PARAM_GAME_REQUESTS_CTA, customUpdateLocalizedText.toJSONObject().toString());
        }
        String str = this.image;
        if (str != null) {
            jSONObject.put("image", str);
        }
        CustomUpdateMedia customUpdateMedia = this.media;
        if (customUpdateMedia != null) {
            jSONObject.put(ShareConstants.WEB_DIALOG_PARAM_MEDIA, customUpdateMedia.toJSONObject().toString());
        }
        String str2 = this.data;
        if (str2 != null) {
            jSONObject.put("data", str2);
        }
        return jSONObject;
    }

    /* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
    public static final class Builder {
        private final String contextTokenId;
        private CustomUpdateLocalizedText cta;
        private String data;
        private final Bitmap image;
        private final CustomUpdateMedia media;
        private final CustomUpdateLocalizedText text;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(GamingContext gamingContext, CustomUpdateLocalizedText customUpdateLocalizedText, Bitmap bitmap) {
            this(gamingContext.getContextID(), customUpdateLocalizedText, bitmap, null);
            gamingContext.getClass();
            customUpdateLocalizedText.getClass();
            bitmap.getClass();
        }

        private final String bitmapToBase64String(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return "data:image/png;base64," + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        }

        public final CustomUpdateContent build() {
            CustomUpdateMedia customUpdateMedia = this.media;
            if (customUpdateMedia != null) {
                if (!((customUpdateMedia.getGif() != null) ^ (this.media.getVideo() != null))) {
                    lh.e("Invalid CustomUpdateMedia, please set either gif or video");
                    return null;
                }
            }
            String bitmapToBase64String = bitmapToBase64String(this.image);
            String str = this.contextTokenId;
            if (str != null) {
                return new CustomUpdateContent(str, this.text, this.cta, bitmapToBase64String, this.media, this.data, null);
            }
            lh.e("parameter contextToken must not be null");
            return null;
        }

        public final CustomUpdateLocalizedText getCta() {
            return this.cta;
        }

        public final String getData() {
            return this.data;
        }

        public final Builder setCta(CustomUpdateLocalizedText customUpdateLocalizedText) {
            customUpdateLocalizedText.getClass();
            this.cta = customUpdateLocalizedText;
            return this;
        }

        public final Builder setData(String str) {
            str.getClass();
            this.data = str;
            return this;
        }

        private Builder(String str, CustomUpdateLocalizedText customUpdateLocalizedText, Bitmap bitmap, CustomUpdateMedia customUpdateMedia) {
            this.contextTokenId = str;
            this.text = customUpdateLocalizedText;
            this.image = bitmap;
            this.media = customUpdateMedia;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Builder(GamingContext gamingContext, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateMedia customUpdateMedia) {
            this(gamingContext.getContextID(), customUpdateLocalizedText, null, customUpdateMedia);
            gamingContext.getClass();
            customUpdateLocalizedText.getClass();
            customUpdateMedia.getClass();
        }
    }

    private CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3) {
        this.contextTokenId = str;
        this.text = customUpdateLocalizedText;
        this.cta = customUpdateLocalizedText2;
        this.image = str2;
        this.media = customUpdateMedia;
        this.data = str3;
    }

    public /* synthetic */ CustomUpdateContent(String str, CustomUpdateLocalizedText customUpdateLocalizedText, CustomUpdateLocalizedText customUpdateLocalizedText2, String str2, CustomUpdateMedia customUpdateMedia, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, customUpdateLocalizedText, customUpdateLocalizedText2, str2, customUpdateMedia, str3);
    }
}
