package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class DirectiveHeader {
    private final String dialogRequestId;
    private final String messageId;
    private final String name;
    private final String namespace;

    public DirectiveHeader(String name, String namespace, String messageId, String dialogRequestId) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(namespace, "namespace");
        s.checkNotNullParameter(messageId, "messageId");
        s.checkNotNullParameter(dialogRequestId, "dialogRequestId");
        this.name = name;
        this.namespace = namespace;
        this.messageId = messageId;
        this.dialogRequestId = dialogRequestId;
    }

    public static /* synthetic */ DirectiveHeader copy$default(DirectiveHeader directiveHeader, String str, String str2, String str3, String str4, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = directiveHeader.name;
        }
        if ((i8 & 2) != 0) {
            str2 = directiveHeader.namespace;
        }
        if ((i8 & 4) != 0) {
            str3 = directiveHeader.messageId;
        }
        if ((i8 & 8) != 0) {
            str4 = directiveHeader.dialogRequestId;
        }
        return directiveHeader.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.name;
    }

    public final String component2() {
        return this.namespace;
    }

    public final String component3() {
        return this.messageId;
    }

    public final String component4() {
        return this.dialogRequestId;
    }

    public final DirectiveHeader copy(String name, String namespace, String messageId, String dialogRequestId) {
        s.checkNotNullParameter(name, "name");
        s.checkNotNullParameter(namespace, "namespace");
        s.checkNotNullParameter(messageId, "messageId");
        s.checkNotNullParameter(dialogRequestId, "dialogRequestId");
        return new DirectiveHeader(name, namespace, messageId, dialogRequestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectiveHeader)) {
            return false;
        }
        DirectiveHeader directiveHeader = (DirectiveHeader) obj;
        return s.areEqual(this.name, directiveHeader.name) && s.areEqual(this.namespace, directiveHeader.namespace) && s.areEqual(this.messageId, directiveHeader.messageId) && s.areEqual(this.dialogRequestId, directiveHeader.dialogRequestId);
    }

    public final String getDialogRequestId() {
        return this.dialogRequestId;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNamespace() {
        return this.namespace;
    }

    public int hashCode() {
        return (((((this.name.hashCode() * 31) + this.namespace.hashCode()) * 31) + this.messageId.hashCode()) * 31) + this.dialogRequestId.hashCode();
    }

    public String toString() {
        return "DirectiveHeader(name=" + this.name + ", namespace=" + this.namespace + ", messageId=" + this.messageId + ", dialogRequestId=" + this.dialogRequestId + ')';
    }
}
