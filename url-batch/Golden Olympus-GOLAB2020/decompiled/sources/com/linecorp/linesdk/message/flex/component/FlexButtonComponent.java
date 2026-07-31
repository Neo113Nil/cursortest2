package com.linecorp.linesdk.message.flex.component;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.linecorp.linesdk.message.flex.action.Action;
import com.linecorp.linesdk.message.flex.component.FlexMessageComponent;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexButtonComponent extends FlexMessageComponent {

    @NonNull
    private Action action;
    private String color;
    private int flex;
    private FlexMessageComponent.Gravity gravity;
    private FlexMessageComponent.Height height;
    private FlexMessageComponent.Margin margin;
    private FlexMessageComponent.Style style;

    public static final class Builder {

        @NonNull
        private Action action;
        private String color;
        private int flex;
        private FlexMessageComponent.Gravity gravity;
        private FlexMessageComponent.Height height;
        private FlexMessageComponent.Margin margin;
        private FlexMessageComponent.Style style;

        public FlexButtonComponent build() {
            return new FlexButtonComponent(this);
        }

        public Builder setColor(String str) {
            this.color = str;
            return this;
        }

        public Builder setFlex(int i4) {
            this.flex = i4;
            return this;
        }

        public Builder setGravity(FlexMessageComponent.Gravity gravity) {
            this.gravity = gravity;
            return this;
        }

        public Builder setHeight(FlexMessageComponent.Height height) {
            this.height = height;
            return this;
        }

        public Builder setMargin(FlexMessageComponent.Margin margin) {
            this.margin = margin;
            return this;
        }

        public Builder setStyle(FlexMessageComponent.Style style) {
            this.style = style;
            return this;
        }

        private Builder(@NonNull Action action) {
            this.flex = -1;
            this.action = action;
        }
    }

    public static Builder newBuilder(@NonNull Action action) {
        return new Builder(action);
    }

    @Override // com.linecorp.linesdk.message.flex.component.FlexMessageComponent, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.put(jsonObject, "action", this.action);
        JSONUtils.put(jsonObject, "margin", this.margin);
        JSONUtils.put(jsonObject, "height", this.height);
        JSONUtils.put(jsonObject, "style", this.style);
        JSONUtils.put(jsonObject, b9.h.f15459S, this.color);
        JSONUtils.put(jsonObject, "gravity", this.gravity);
        int i4 = this.flex;
        if (i4 != -1) {
            jsonObject.put("flex", i4);
        }
        return jsonObject;
    }

    private FlexButtonComponent() {
        super(FlexMessageComponent.Type.BUTTON);
    }

    private FlexButtonComponent(@NonNull Builder builder) {
        this();
        this.action = builder.action;
        this.flex = builder.flex;
        this.margin = builder.margin;
        this.height = builder.height;
        this.style = builder.style;
        this.color = builder.color;
        this.gravity = builder.gravity;
    }
}
