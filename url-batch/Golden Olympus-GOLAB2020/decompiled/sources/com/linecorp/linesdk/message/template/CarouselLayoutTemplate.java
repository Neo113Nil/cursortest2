package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CarouselLayoutTemplate extends LayoutTemplate {

    @NonNull
    private List<CarouselColumn> columns;
    private ImageAspectRatio imageAspectRatio;
    private ImageScaleType imageScaleType;

    public static class CarouselColumn implements Jsonable {

        @NonNull
        private List<ClickActionForTemplateMessage> actions;
        private ClickActionForTemplateMessage defaultAction;
        private String imageBackgroundColor;

        @NonNull
        private String text;
        private String thumbnailImageUrl;
        private String title;

        public CarouselColumn(@NonNull String str, @NonNull List<ClickActionForTemplateMessage> list) {
            this.text = str;
            this.actions = list;
        }

        public void setDefaultAction(ClickActionForTemplateMessage clickActionForTemplateMessage) {
            this.defaultAction = clickActionForTemplateMessage;
        }

        public void setImageBackgroundColor(String str) {
            this.imageBackgroundColor = str;
        }

        public void setThumbnailImageUrl(String str) {
            this.thumbnailImageUrl = str;
        }

        public void setTitle(String str) {
            this.title = str;
        }

        @Override // com.linecorp.linesdk.message.Jsonable
        @NonNull
        public JSONObject toJsonObject() {
            JSONObject jSONObject = new JSONObject();
            JSONUtils.put(jSONObject, b9.h.f15450K0, this.text);
            JSONUtils.putArray(jSONObject, "actions", this.actions);
            JSONUtils.put(jSONObject, "thumbnailImageUrl", this.thumbnailImageUrl);
            JSONUtils.put(jSONObject, "imageBackgroundColor", this.imageBackgroundColor);
            JSONUtils.put(jSONObject, b9.h.f15436D0, this.title);
            JSONUtils.put(jSONObject, "defaultAction", this.defaultAction);
            return jSONObject;
        }
    }

    public CarouselLayoutTemplate(@NonNull List<CarouselColumn> list) {
        super(Type.CAROUSEL);
        this.imageAspectRatio = ImageAspectRatio.RECTANGLE;
        this.imageScaleType = ImageScaleType.COVER;
        this.columns = list;
    }

    public void setImageAspectRatio(ImageAspectRatio imageAspectRatio) {
        this.imageAspectRatio = imageAspectRatio;
    }

    public void setImageScaleType(ImageScaleType imageScaleType) {
        this.imageScaleType = imageScaleType;
    }

    @Override // com.linecorp.linesdk.message.template.LayoutTemplate, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.putArray(jsonObject, "columns", this.columns);
        JSONUtils.putArray(jsonObject, "columns", this.columns);
        JSONUtils.put(jsonObject, "imageAspectRatio", this.imageAspectRatio.getServerKey());
        JSONUtils.put(jsonObject, "imageSize", this.imageScaleType.getServerKey());
        return jsonObject;
    }
}
