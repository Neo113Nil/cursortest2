package com.linecorp.linesdk.message.flex.component;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.flex.action.Action;
import com.linecorp.linesdk.message.flex.component.FlexMessageComponent;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexBoxComponent extends FlexMessageComponent {
    private Action action;

    @NonNull
    private List<FlexMessageComponent> contents;
    private int flex;

    @NonNull
    private FlexMessageComponent.Layout layout;
    private FlexMessageComponent.Margin margin;
    private FlexMessageComponent.Margin spacing;

    public static final class Builder {
        private Action action;

        @NonNull
        private List<FlexMessageComponent> contents;
        private int flex;

        @NonNull
        private FlexMessageComponent.Layout layout;
        private FlexMessageComponent.Margin margin;
        private FlexMessageComponent.Margin spacing;

        public FlexBoxComponent build() {
            return new FlexBoxComponent(this);
        }

        public Builder setAction(Action action) {
            this.action = action;
            return this;
        }

        public Builder setFlex(int i4) {
            this.flex = i4;
            return this;
        }

        public Builder setMargin(FlexMessageComponent.Margin margin) {
            this.margin = margin;
            return this;
        }

        public Builder setSpacing(FlexMessageComponent.Margin margin) {
            this.spacing = margin;
            return this;
        }

        private Builder(@NonNull FlexMessageComponent.Layout layout, @NonNull List<FlexMessageComponent> list) {
            this.flex = -1;
            this.layout = layout;
            this.contents = list;
        }
    }

    public static Builder newBuilder(@NonNull FlexMessageComponent.Layout layout, @NonNull List<FlexMessageComponent> list) {
        return new Builder(layout, list);
    }

    @Override // com.linecorp.linesdk.message.flex.component.FlexMessageComponent, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.put(jsonObject, "layout", this.layout);
        JSONUtils.putArray(jsonObject, "contents", this.contents);
        JSONUtils.put(jsonObject, "spacing", this.spacing);
        JSONUtils.put(jsonObject, "margin", this.margin);
        JSONUtils.put(jsonObject, "action", this.action);
        int i4 = this.flex;
        if (i4 != -1) {
            jsonObject.put("flex", i4);
        }
        return jsonObject;
    }

    private FlexBoxComponent() {
        super(FlexMessageComponent.Type.BOX);
    }

    private FlexBoxComponent(@NonNull Builder builder) {
        this();
        this.layout = builder.layout;
        this.contents = builder.contents;
        this.flex = builder.flex;
        this.spacing = builder.spacing;
        this.margin = builder.margin;
        this.action = builder.action;
    }
}
