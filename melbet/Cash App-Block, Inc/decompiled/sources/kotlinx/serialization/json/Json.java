package kotlinx.serialization.json;

import androidx.recyclerview.widget.AdapterHelper;
import com.squareup.cash.db.WireAdapter;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.internal.StreamingJsonDecoder;
import kotlinx.serialization.json.internal.WriteMode;
import kotlinx.serialization.json.internal.WriteModeKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleKt;
import org.commonmark.internal.BlockContent;

/* loaded from: classes3.dex */
public abstract class Json {
    public static final Default Default = new Default(new JsonConfiguration(false, false, false, false, true, "    ", false, false, "type", true, ClassDiscriminatorMode.POLYMORPHIC, true), SerializersModuleKt.EmptySerializersModule);
    public final WireAdapter _schemaCache = new WireAdapter(22);
    public final JsonConfiguration configuration;
    public final SerializersModule serializersModule;

    public final class Default extends Json {
    }

    public Json(JsonConfiguration jsonConfiguration, SerializersModule serializersModule) {
        this.configuration = jsonConfiguration;
        this.serializersModule = serializersModule;
    }

    public final Object decodeFromString(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        str.getClass();
        AdapterHelper StringJsonLexer = WriteModeKt.StringJsonLexer(this, str);
        Object decodeSerializableValue$1 = new StreamingJsonDecoder(this, WriteMode.OBJ, StringJsonLexer, kSerializer.getDescriptor(), null).decodeSerializableValue$1(kSerializer);
        StringJsonLexer.expectEof();
        return decodeSerializableValue$1;
    }

    public final String encodeToString(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        BlockContent blockContent = new BlockContent(3);
        try {
            WriteModeKt.encodeByWriter(this, blockContent, kSerializer, obj);
            return blockContent.toString();
        } finally {
            blockContent.release();
        }
    }
}
