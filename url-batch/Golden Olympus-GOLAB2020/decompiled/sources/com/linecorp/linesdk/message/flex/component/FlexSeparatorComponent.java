package com.linecorp.linesdk.message.flex.component;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.linecorp.linesdk.message.flex.component.FlexMessageComponent;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexSeparatorComponent extends FlexMessageComponent {
    private String color;
    private FlexMessageComponent.Margin margin;

    public static final class Builder {
        private String color;
        private FlexMessageComponent.Margin margin;

        public FlexSeparatorComponent build() {
            return new FlexSeparatorComponent(this);
        }

        public Builder setColor(String str) {
            this.color = str;
            return this;
        }

        public Builder setMargin(FlexMessageComponent.Margin margin) {
            this.margin = margin;
            return this;
        }

        private Builder() {
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.linecorp.linesdk.message.flex.component.FlexMessageComponent, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.put(jsonObject, "margin", this.margin);
        JSONUtils.put(jsonObject, b9.h.f15459S, this.color);
        return jsonObject;
    }

    public FlexSeparatorComponent() {
        super(FlexMessageComponent.Type.SEPARATOR);
    }

    private FlexSeparatorComponent(@NonNull Builder builder) {
        this();
        this.margin = builder.margin;
        this.color = builder.color;
    }
}
