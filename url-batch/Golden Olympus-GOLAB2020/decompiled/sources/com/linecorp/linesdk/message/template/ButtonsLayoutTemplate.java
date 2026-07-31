package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.linecorp.linesdk.message.MessageSender;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ButtonsLayoutTemplate extends LayoutTemplate {

    @NonNull
    private List<ClickActionForTemplateMessage> actions;
    private ClickActionForTemplateMessage defaultAction;

    @NonNull
    private ImageAspectRatio imageAspectRatio;
    private int imageBackgroundColor;

    @NonNull
    private ImageScaleType imageScaleType;
    private MessageSender messageSender;

    @NonNull
    private String text;
    private String thumbnailImageUrl;
    private String title;

    public ButtonsLayoutTemplate(@NonNull String str, @NonNull List<ClickActionForTemplateMessage> list) {
        super(Type.BUTTONS);
        this.imageAspectRatio = ImageAspectRatio.RECTANGLE;
        this.imageScaleType = ImageScaleType.COVER;
        this.imageBackgroundColor = -1;
        this.text = str;
        this.actions = list;
    }

    @NonNull
    private String getColorString(int i4) {
        return String.format("#%06X", Integer.valueOf(i4 & 16777215));
    }

    public void setDefaultAction(ClickActionForTemplateMessage clickActionForTemplateMessage) {
        this.defaultAction = clickActionForTemplateMessage;
    }

    public void setImageAspectRatio(@NonNull ImageAspectRatio imageAspectRatio) {
        this.imageAspectRatio = imageAspectRatio;
    }

    public void setImageBackgroundColor(int i4) {
        this.imageBackgroundColor = i4;
    }

    public void setImageScaleType(@NonNull ImageScaleType imageScaleType) {
        this.imageScaleType = imageScaleType;
    }

    public void setMessageSender(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void setThumbnailImageUrl(String str) {
        this.thumbnailImageUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // com.linecorp.linesdk.message.template.LayoutTemplate, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.put(jsonObject, b9.h.f15450K0, this.text);
        JSONUtils.put(jsonObject, "thumbnailImageUrl", this.thumbnailImageUrl);
        JSONUtils.put(jsonObject, "imageAspectRatio", this.imageAspectRatio.getServerKey());
        JSONUtils.put(jsonObject, "imageSize", this.imageScaleType.getServerKey());
        JSONUtils.put(jsonObject, "imageBackgroundColor", getColorString(this.imageBackgroundColor));
        JSONUtils.put(jsonObject, b9.h.f15436D0, this.title);
        JSONUtils.put(jsonObject, "defaultAction", this.defaultAction);
        JSONUtils.put(jsonObject, "sentBy", this.messageSender);
        JSONUtils.putArray(jsonObject, "actions", this.actions);
        return jsonObject;
    }
}
