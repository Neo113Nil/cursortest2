package com.linecorp.linesdk.message.flex.container;

import androidx.annotation.NonNull;
import com.linecorp.linesdk.message.flex.container.FlexMessageContainer;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FlexCarouselContainer extends FlexMessageContainer {

    @NonNull
    private List<FlexBubbleContainer> contents;

    private FlexCarouselContainer() {
        super(FlexMessageContainer.Type.CAROUSEL);
    }

    @Override // com.linecorp.linesdk.message.flex.container.FlexMessageContainer, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.putArray(jsonObject, "contents", this.contents);
        return jsonObject;
    }

    public FlexCarouselContainer(@NonNull List<FlexBubbleContainer> list) {
        this();
        this.contents = list;
    }
}
