package com.linecorp.linesdk.message.flex.component;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.flex.component.FlexMessageComponent;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexIconComponent extends FlexMessageComponent {
    private FlexMessageComponent.AspectRatio aspectRatio;
    private FlexMessageComponent.Margin margin;
    private FlexMessageComponent.Size size;
    private String url;

    public static final class Builder {
        private FlexMessageComponent.AspectRatio aspectRatio;
        private FlexMessageComponent.Margin margin;
        private FlexMessageComponent.Size size;

        @NonNull
        private String url;

        public FlexIconComponent build() {
            return new FlexIconComponent(this);
        }

        public Builder setAspectRatio(FlexMessageComponent.AspectRatio aspectRatio) {
            this.aspectRatio = aspectRatio;
            return this;
        }

        public Builder setMargin(FlexMessageComponent.Margin margin) {
            this.margin = margin;
            return this;
        }

        public Builder setSize(FlexMessageComponent.Size size) {
            this.size = size;
            return this;
        }

        private Builder(@NonNull String str) {
            this.url = str;
        }
    }

    public static Builder newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.linecorp.linesdk.message.flex.component.FlexMessageComponent, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put("url", this.url);
        JSONUtils.put(jsonObject, "margin", this.margin);
        JSONUtils.put(jsonObject, "size", this.size);
        FlexMessageComponent.AspectRatio aspectRatio = this.aspectRatio;
        JSONUtils.put(jsonObject, "aspectRatio", aspectRatio != null ? aspectRatio.getValue() : null);
        return jsonObject;
    }

    private FlexIconComponent() {
        super(FlexMessageComponent.Type.ICON);
    }

    private FlexIconComponent(@NonNull Builder builder) {
        this();
        this.url = builder.url;
        this.margin = builder.margin;
        this.size = builder.size;
        this.aspectRatio = builder.aspectRatio;
    }
}
