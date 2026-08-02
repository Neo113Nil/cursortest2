package kotlinx.serialization.json;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;

/* loaded from: classes9.dex */
public final class JsonLiteral extends JsonPrimitive {
    public final SerialDescriptor coerceToInlineType;
    public final String content;
    public final boolean isString;

    public JsonLiteral(Object obj, boolean z, SerialDescriptor serialDescriptor) {
        obj.getClass();
        this.isString = z;
        this.coerceToInlineType = serialDescriptor;
        this.content = obj.toString();
        if (serialDescriptor == null || serialDescriptor.isInline()) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonLiteral.class != obj.getClass()) {
            return false;
        }
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        return this.isString == jsonLiteral.isString && Intrinsics.areEqual(this.content, jsonLiteral.content);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String getContent() {
        return this.content;
    }

    public final int hashCode() {
        return this.content.hashCode() + (Boolean.hashCode(this.isString) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.isString;
        String str = this.content;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        StringOpsKt.printQuoted(sb, str);
        return sb.toString();
    }
}
