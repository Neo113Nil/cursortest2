package com.stripe.android.core.networking;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind$INT;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import okhttp3.internal.Tags;

/* loaded from: classes8.dex */
public final class MarkdownToHtmlSerializer implements KSerializer {
    public static final MarkdownToHtmlSerializer INSTANCE = new MarkdownToHtmlSerializer();
    public static final PrimitiveSerialDescriptor descriptor = Tags.PrimitiveSerialDescriptor("MarkdownToHtml", PrimitiveKind$INT.INSTANCE$8);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        List list = MarkdownParser.markDownToHtmlRegex;
        String decodeString = decoder.decodeString();
        decodeString.getClass();
        for (Pair pair : MarkdownParser.markDownToHtmlRegex) {
            decodeString = ((Regex) pair.first).replace(decodeString, (Function1) pair.second);
        }
        return decodeString;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str = (String) obj;
        str.getClass();
        encoder.encodeString(str);
    }
}
