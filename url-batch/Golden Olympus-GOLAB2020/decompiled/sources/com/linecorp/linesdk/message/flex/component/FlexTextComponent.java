package com.linecorp.linesdk.message.flex.component;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.linecorp.linesdk.message.flex.action.Action;
import com.linecorp.linesdk.message.flex.component.FlexMessageComponent;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexTextComponent extends FlexMessageComponent {
    protected static final int MAXLINES_VALUE_NONE = -1;
    private Action action;
    private FlexMessageComponent.Alignment align;
    private String color;
    private int flex;
    private FlexMessageComponent.Gravity gravity;
    private FlexMessageComponent.Margin margin;
    private int maxLines;
    private FlexMessageComponent.Size size;

    @NonNull
    private String text;
    private FlexMessageComponent.Weight weight;
    private Boolean wrap;

    public static Builder newBuilder(@NonNull String str) {
        return new Builder(str);
    }

    @Override // com.linecorp.linesdk.message.flex.component.FlexMessageComponent, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        jsonObject.put(b9.h.f15450K0, this.text);
        JSONUtils.put(jsonObject, "margin", this.margin);
        FlexMessageComponent.Size size = this.size;
        JSONUtils.put(jsonObject, "size", size != null ? size.getValue() : null);
        JSONUtils.put(jsonObject, "align", this.align);
        JSONUtils.put(jsonObject, "gravity", this.gravity);
        JSONUtils.put(jsonObject, "wrap", this.wrap);
        JSONUtils.put(jsonObject, "weight", this.weight);
        JSONUtils.put(jsonObject, b9.h.f15459S, this.color);
        JSONUtils.put(jsonObject, "action", this.action);
        int i4 = this.flex;
        if (i4 != -1) {
            jsonObject.put("flex", i4);
        }
        int i5 = this.maxLines;
        if (i5 != -1) {
            jsonObject.put("maxLines", i5);
        }
        return jsonObject;
    }

    private FlexTextComponent() {
        super(FlexMessageComponent.Type.TEXT);
    }

    public static final class Builder {
        private Action action;
        private FlexMessageComponent.Alignment align;
        private String color;
        private int flex;
        private FlexMessageComponent.Gravity gravity;
        private FlexMessageComponent.Margin margin;
        private int maxLines;
        private FlexMessageComponent.Size size;

        @NonNull
        private String text;
        private FlexMessageComponent.Weight weight;
        private Boolean wrap;

        private Builder() {
            this.flex = -1;
            this.maxLines = -1;
        }

        public FlexTextComponent build() {
            return new FlexTextComponent(this);
        }

        public Builder setAction(Action action) {
            this.action = action;
            return this;
        }

        public Builder setAlign(FlexMessageComponent.Alignment alignment) {
            this.align = alignment;
            return this;
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

        public Builder setMargin(FlexMessageComponent.Margin margin) {
            this.margin = margin;
            return this;
        }

        public Builder setMaxLines(int i4) {
            this.maxLines = i4;
            return this;
        }

        public Builder setSize(FlexMessageComponent.Size size) {
            this.size = size;
            return this;
        }

        public Builder setWeight(FlexMessageComponent.Weight weight) {
            this.weight = weight;
            return this;
        }

        public Builder setWrap(Boolean bool) {
            this.wrap = bool;
            return this;
        }

        public Builder(@NonNull String str) {
            this();
            this.text = str;
        }
    }

    private FlexTextComponent(@NonNull Builder builder) {
        this();
        this.text = builder.text;
        this.flex = builder.flex;
        this.margin = builder.margin;
        this.size = builder.size;
        this.align = builder.align;
        this.gravity = builder.gravity;
        this.wrap = builder.wrap;
        this.maxLines = builder.maxLines;
        this.weight = builder.weight;
        this.color = builder.color;
        this.action = builder.action;
    }
}
