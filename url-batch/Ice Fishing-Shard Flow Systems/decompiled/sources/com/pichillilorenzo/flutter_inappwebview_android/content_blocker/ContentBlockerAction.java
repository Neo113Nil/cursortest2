package com.pichillilorenzo.flutter_inappwebview_android.content_blocker;

import com.onesignal.inAppMessages.internal.display.impl.m;
import java.util.Map;
import r4.f;

/* loaded from: classes.dex */
public class ContentBlockerAction {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private String selector;
    private ContentBlockerActionType type;

    public ContentBlockerAction(ContentBlockerActionType contentBlockerActionType, String str) {
        this.type = contentBlockerActionType;
        contentBlockerActionType.equals(ContentBlockerActionType.CSS_DISPLAY_NONE);
        this.selector = str;
    }

    public static ContentBlockerAction fromMap(Map<String, Object> map) {
        return new ContentBlockerAction(ContentBlockerActionType.fromValue((String) map.get(m.EVENT_TYPE_KEY)), (String) map.get("selector"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ContentBlockerAction contentBlockerAction = (ContentBlockerAction) obj;
            if (this.type != contentBlockerAction.type) {
                return false;
            }
            String str = this.selector;
            String str2 = contentBlockerAction.selector;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public String getSelector() {
        return this.selector;
    }

    public ContentBlockerActionType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.selector;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public void setSelector(String str) {
        this.selector = str;
    }

    public void setType(ContentBlockerActionType contentBlockerActionType) {
        this.type = contentBlockerActionType;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ContentBlockerAction{type=");
        sb.append(this.type);
        sb.append(", selector='");
        return f.f(sb, this.selector, "'}");
    }
}
