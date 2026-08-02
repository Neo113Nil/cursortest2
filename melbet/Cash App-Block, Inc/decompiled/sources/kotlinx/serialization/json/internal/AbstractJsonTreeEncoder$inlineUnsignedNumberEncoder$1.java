package kotlinx.serialization.json.internal;

import kotlin.UByte;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import kotlinx.serialization.json.JsonLiteral;
import kotlinx.serialization.modules.SerializersModule;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes9.dex */
public final class AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1 extends AbstractEncoder {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ String $tag;
    public final Object serializersModule;
    public final /* synthetic */ JsonTreeEncoder this$0;

    public AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(JsonTreeEncoder jsonTreeEncoder, String str) {
        this.this$0 = jsonTreeEncoder;
        this.$tag = str;
        this.serializersModule = jsonTreeEncoder.json.serializersModule;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeByte(byte b) {
        switch (this.$r8$classId) {
            case 0:
                UByte.Companion companion = UByte.Companion;
                putUnquotedString(String.valueOf(b & 255));
                break;
            default:
                super.encodeByte(b);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeInt(int i) {
        switch (this.$r8$classId) {
            case 0:
                UInt.Companion companion = UInt.Companion;
                putUnquotedString(Integer.toUnsignedString(i));
                break;
            default:
                super.encodeInt(i);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeLong(long j) {
        switch (this.$r8$classId) {
            case 0:
                ULong.Companion companion = ULong.Companion;
                putUnquotedString(Long.toUnsignedString(j));
                break;
            default:
                super.encodeLong(j);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeShort(short s) {
        switch (this.$r8$classId) {
            case 0:
                UShort.Companion companion = UShort.Companion;
                putUnquotedString(String.valueOf(s & HPKE.aead_EXPORT_ONLY));
                break;
            default:
                super.encodeShort(s);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoder
    public void encodeString(String str) {
        switch (this.$r8$classId) {
            case 1:
                str.getClass();
                this.this$0.putElement(this.$tag, new JsonLiteral(str, false, (SerialDescriptor) this.serializersModule));
                break;
            default:
                super.encodeString(str);
                break;
        }
    }

    @Override // kotlinx.serialization.encoding.Encoder
    public final SerializersModule getSerializersModule() {
        switch (this.$r8$classId) {
            case 0:
                return (SerializersModule) this.serializersModule;
            default:
                return this.this$0.json.serializersModule;
        }
    }

    public void putUnquotedString(String str) {
        str.getClass();
        this.this$0.putElement(this.$tag, new JsonLiteral(str, false, null));
    }

    public AbstractJsonTreeEncoder$inlineUnsignedNumberEncoder$1(JsonTreeEncoder jsonTreeEncoder, String str, SerialDescriptor serialDescriptor) {
        this.this$0 = jsonTreeEncoder;
        this.$tag = str;
        this.serializersModule = serialDescriptor;
    }
}
