package com.artillery.ctc.base;

import androidx.annotation.Keep;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public final class DirectivePayload {
    private final DirectiveHeader header;
    private final PayloadContent payload;

    public DirectivePayload(DirectiveHeader header, PayloadContent payload) {
        s.checkNotNullParameter(header, "header");
        s.checkNotNullParameter(payload, "payload");
        this.header = header;
        this.payload = payload;
    }

    public static /* synthetic */ DirectivePayload copy$default(DirectivePayload directivePayload, DirectiveHeader directiveHeader, PayloadContent payloadContent, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            directiveHeader = directivePayload.header;
        }
        if ((i8 & 2) != 0) {
            payloadContent = directivePayload.payload;
        }
        return directivePayload.copy(directiveHeader, payloadContent);
    }

    public final DirectiveHeader component1() {
        return this.header;
    }

    public final PayloadContent component2() {
        return this.payload;
    }

    public final DirectivePayload copy(DirectiveHeader header, PayloadContent payload) {
        s.checkNotNullParameter(header, "header");
        s.checkNotNullParameter(payload, "payload");
        return new DirectivePayload(header, payload);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DirectivePayload)) {
            return false;
        }
        DirectivePayload directivePayload = (DirectivePayload) obj;
        return s.areEqual(this.header, directivePayload.header) && s.areEqual(this.payload, directivePayload.payload);
    }

    public final DirectiveHeader getHeader() {
        return this.header;
    }

    public final PayloadContent getPayload() {
        return this.payload;
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.payload.hashCode();
    }

    public String toString() {
        return "DirectivePayload(header=" + this.header + ", payload=" + this.payload + ')';
    }
}
