package com.linecorp.linesdk.message.template;

import androidx.annotation.NonNull;
import com.ironsource.b9;
import com.linecorp.linesdk.utils.JSONUtils;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfirmLayoutTemplate extends LayoutTemplate {

    @NonNull
    private List<ClickActionForTemplateMessage> actions;

    @NonNull
    private String text;

    public ConfirmLayoutTemplate(@NonNull String str, @NonNull List<ClickActionForTemplateMessage> list) {
        super(Type.CONFIRM);
        this.text = str;
        this.actions = list;
    }

    @Override // com.linecorp.linesdk.message.template.LayoutTemplate, com.linecorp.linesdk.message.Jsonable
    @NonNull
    public JSONObject toJsonObject() {
        JSONObject jsonObject = super.toJsonObject();
        JSONUtils.put(jsonObject, b9.h.f15450K0, this.text);
        JSONUtils.putArray(jsonObject, "actions", this.actions);
        return jsonObject;
    }
}
