package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ImageCarouselLayoutTemplate extends LayoutTemplate {

    @NonNull
    private List<ImageCarouselColumn> columns;

    public static class ImageCarouselColumn implements Jsonable {

        @NonNull
        private ClickActionForTemplateMessage action;

        @NonNull
        private String imageUrl;

        public ImageCarouselColumn(@NonNull String str, @NonNull ClickActionForTemplateMessage clickActionForTemplateMessage) {
            this.imageUrl = str;
            this.action = clickActionForTemplateMessage;
        }

        @Override // com.linecorp.linesdk.message.Jsonable
        @NonNull
        public JSONObject toJsonObject() {
            JSONObject jSONObject = new JSONObject();
            JSONUtils.put(jSONObject, "imageUrl", this.imageUrl);
            JSONUtils.put(jSONObject, "action", this.action);
            return jSONObject;
        }
    }

    public ImageCarouselLayoutTemplate(@NonNull List<ImageCarouselColumn> list) {
        super(Type.IMAGE_CAROUSEL);
        this.columns = list;
    }

    @Override // com.linecorp.linesdk.message.template.LayoutTemplate, com.linecorp.linesdk.message.Jsonable
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.putArray(jsonObject, "columns", this.columns);
        return jsonObject;
    }
}
