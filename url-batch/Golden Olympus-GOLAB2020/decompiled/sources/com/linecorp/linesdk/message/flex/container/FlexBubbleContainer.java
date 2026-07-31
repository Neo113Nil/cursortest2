package com.linecorp.linesdk.message.flex.container;

import androidx.annotation.NonNull;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.ironsource.b9;
import com.linecorp.linesdk.message.Jsonable;
import com.linecorp.linesdk.message.flex.component.FlexBoxComponent;
import com.linecorp.linesdk.message.flex.component.FlexImageComponent;
import com.linecorp.linesdk.message.flex.container.FlexMessageContainer;
import com.linecorp.linesdk.message.flex.style.FlexBlockStyle;
import com.linecorp.linesdk.utils.JSONUtils;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexBubbleContainer extends FlexMessageContainer {
    private FlexBoxComponent body;
    private Direction direction;
    private FlexBoxComponent footer;
    private FlexBoxComponent header;
    private FlexImageComponent hero;
    private Style styles;

    public static final class Builder {
        private FlexBoxComponent body;
        private Direction direction;
        private FlexBoxComponent footer;
        private FlexBoxComponent header;
        private FlexImageComponent hero;
        private Style styles;

        public FlexBubbleContainer build() {
            return new FlexBubbleContainer(this);
        }

        public Builder setBody(FlexBoxComponent flexBoxComponent) {
            this.body = flexBoxComponent;
            return this;
        }

        public Builder setDirection(Direction direction) {
            this.direction = direction;
            return this;
        }

        public Builder setFooter(FlexBoxComponent flexBoxComponent) {
            this.footer = flexBoxComponent;
            return this;
        }

        public Builder setHeader(FlexBoxComponent flexBoxComponent) {
            this.header = flexBoxComponent;
            return this;
        }

        public Builder setHero(FlexImageComponent flexImageComponent) {
            this.hero = flexImageComponent;
            return this;
        }

        public Builder setStyles(Style style) {
            this.styles = style;
            return this;
        }

        private Builder() {
        }
    }

    public enum Direction {
        LEFT_TO_RIGHT("ltr"),
        RIGHT_TO_LEFT("rtl");

        private String value;

        Direction(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static class Style implements Jsonable {
        private FlexBlockStyle body;
        private FlexBlockStyle footer;
        private FlexBlockStyle header;
        private FlexBlockStyle hero;

        @Override // com.linecorp.linesdk.message.Jsonable
        @NonNull
        public JSONObject toJsonObject() {
            JSONObject jSONObject = new JSONObject();
            JSONUtils.put(jSONObject, "header", this.header);
            JSONUtils.put(jSONObject, "hero", this.hero);
            JSONUtils.put(jSONObject, b9.h.f15438E0, this.body);
            JSONUtils.put(jSONObject, "footer", this.footer);
            return jSONObject;
        }
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    @Override // com.linecorp.linesdk.message.flex.container.FlexMessageContainer, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        Direction direction = this.direction;
        String str = direction;
        if (direction != null) {
            str = direction.getValue();
        }
        JSONUtils.put(jsonObject, HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, str);
        JSONUtils.put(jsonObject, "header", this.header);
        JSONUtils.put(jsonObject, "hero", this.hero);
        JSONUtils.put(jsonObject, b9.h.f15438E0, this.body);
        JSONUtils.put(jsonObject, "footer", this.footer);
        JSONUtils.put(jsonObject, "styles", this.styles);
        return jsonObject;
    }

    private FlexBubbleContainer() {
        super(FlexMessageContainer.Type.BUBBLE);
        this.direction = Direction.LEFT_TO_RIGHT;
    }

    private FlexBubbleContainer(Builder builder) {
        this();
        this.direction = builder.direction;
        this.header = builder.header;
        this.hero = builder.hero;
        this.body = builder.body;
        this.footer = builder.footer;
        this.styles = builder.styles;
    }
}
