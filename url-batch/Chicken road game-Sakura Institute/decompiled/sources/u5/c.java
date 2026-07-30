package u5;

import h7.s;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import s1.r0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f9058b = new r0(1);

    /* renamed from: a, reason: collision with root package name */
    public StringBuilder f9059a;

    static {
        new r0(2);
    }

    @Override // u5.b
    public final boolean a(byte[] bArr) {
        String str;
        try {
            str = ((CharsetDecoder) f9058b.get()).decode(ByteBuffer.wrap(bArr)).toString();
        } catch (CharacterCodingException unused) {
            str = null;
        }
        if (str == null) {
            return false;
        }
        this.f9059a.append(str);
        return true;
    }

    @Override // u5.b
    public final s b() {
        String sb = this.f9059a.toString();
        s sVar = new s();
        sVar.f4707g = sb;
        return sVar;
    }
}
